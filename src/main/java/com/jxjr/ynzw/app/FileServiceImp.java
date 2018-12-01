package com.jxjr.ynzw.app;

import javax.jws.WebService;
import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlType;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.jws.WebService;


@WebService(endpointInterface="com.jxjr.ynzw.app.FileService")// 不加这句会报错
public class FileServiceImp implements FileService {


    public FileWraper download(String filename) {
        String filePath = "d:\\data\\upload\\"+filename;
        FileWraper fileWrapper = new FileWraper();
        fileWrapper.setFileName(filename);
        fileWrapper.setFileExtension("txt");
        DataSource source = new FileDataSource(new File(filePath));
        fileWrapper.setFile(new DataHandler(source));
        return fileWrapper;
    }

        public boolean upload(FileWraper file) {
        boolean result = true;
        OutputStream os = null;
        InputStream is = null;
        BufferedOutputStream bos = null;

        try {
            is = file.getFile().getInputStream();
            // 文件在服务器上的保存位置
            File dest = new File("d:\\data\\upload\\" + file.getFileName());
            os = new FileOutputStream(dest);
            bos = new BufferedOutputStream(os);
            byte[] buffer = new byte[1024];
            int len = 0;
            while ((len = is.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }
            bos.flush();

        } catch (Exception e) {
            e.printStackTrace();
            result = false;
        } finally {
            if(bos != null){
                try{
                    bos.close();
                }catch(Exception e){
                }
            }

            if(os != null){
                try{
                    os.close();
                }catch(Exception e){
                }
            }

            if(is != null){
                try{
                    is.close();
                }catch(Exception e){
                }
            }
        }

        return result;
    }


}
