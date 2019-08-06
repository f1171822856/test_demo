package com.itheima.util;

import com.google.gson.Gson;
import com.qiniu.common.Zone;
import com.qiniu.http.Response;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.DefaultPutRet;
import com.qiniu.util.Auth;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ResourceBundle;
import java.util.UUID;

public final class FileUploadUtils {

    private static String accessKey;

    private static String secretKey;

    private static String bucket;

    private static String rtValue;

    static {
        ResourceBundle fileUpload = ResourceBundle.getBundle("fileUpload");
        accessKey = fileUpload.getString("qiniu.accessKey");
        secretKey = fileUpload.getString("qiniu.secretKey");
        bucket = fileUpload.getString("qiniu.bucket");
        rtValue = fileUpload.getString("qiniu.rtValue");
    }

    /**
     * 将图片上传到七牛云
     *
     * @param multipartFile
     * @return
     */
    public static String upload(MultipartFile multipartFile) {
        // 文件路径(保存进数据库)
        String img = "";
        // 获得文件原始名
        String fileName = multipartFile.getOriginalFilename();
        // 随机文件名
        String uuid = UUID.randomUUID().toString().replace("-", "").toString();
        fileName = uuid + "_" + fileName;
        // 构建七牛云配置
        Configuration cfg = new Configuration(Zone.zone1());
        UploadManager uploadManager = new UploadManager(cfg);
        // 身份认证
        Auth auth = Auth.create(accessKey, secretKey);
        // Token
        String upToken = auth.uploadToken(bucket, fileName);
        try {
            // 上传
            Response response = uploadManager.put(multipartFile.getBytes(), fileName, upToken);
            // 解析上传结果
            DefaultPutRet defaultPutRet = new Gson().fromJson(response.bodyString(), DefaultPutRet.class);
            img = rtValue + "/" + fileName;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return img;
    }

}
