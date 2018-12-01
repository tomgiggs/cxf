package com.jxjr.ynzw.app;

import javax.jws.WebService;

@WebService(endpointInterface="com.jxjr.ynzw.app.Entrance")// 不加这句会报错
public class EntraceImp implements Entrance{


    public String getInfo(String text) {
        System.out.println(text);

        return "this is the getInfo method return ";
    }

    public String getData(String data) {
        System.out.println("getting data,please wait a moment");
        return "this is the getData method return ";
    }




}
