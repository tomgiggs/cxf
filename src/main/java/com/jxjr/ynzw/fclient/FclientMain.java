package com.jxjr.ynzw.fclient;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import java.io.File;

public class FclientMain {
    public static void main(String[] args) {
        FileServiceImpService factory = new FileServiceImpService();
        FileService fileservice = factory.getFileServiceImpPort();
        String fpath = "d:\\data\\hive_job.txt";
        FileWraper wraper = new FileWraper();
        wraper.setFileName("hive_job.txt");
//        wraper.setFileExtension(".txt");
        DataSource source = new FileDataSource(new File(fpath));
        wraper.setFile(new DataHandler(source));
        fileservice.upload(wraper);
    }

}