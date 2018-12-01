package com.jxjr.ynzw.app;

import javax.xml.ws.Endpoint;

public class DataService {
    public static void main(String[] args) {
        System.out.println("starting a new web service");
        EntraceImp entraceImp = new EntraceImp();
        String address = "http://127.0.0.1:8787/Entrance";
        Endpoint.publish(address,entraceImp);
        System.out.println("start test service success");
        String fileservice = "http://127.0.0.1:8787/FileService";
        FileServiceImp fileServiceImp = new FileServiceImp();
        Endpoint.publish(fileservice,fileServiceImp);
        System.out.println("start file service success");

    }
}
