package com.jxjr.ynzw.app;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

//@WebService
@WebService(targetNamespace="http://127.0.0.1:8787/Entrance")

public interface Entrance {
    @WebMethod(operationName="getText")
    String getInfo(@WebParam(name="text")String text);
    @WebMethod(operationName="getData")
    String getData(@WebParam(name="data")String data);

}

