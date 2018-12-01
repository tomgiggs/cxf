package com.jxjr.ynzw.app;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import com.jxjr.ynzw.app.FileWraper;

import java.io.Serializable;

//@WebService

@WebService(targetNamespace="http://127.0.0.1:8787/FileService")
public interface FileService  extends Serializable {

    @WebMethod(operationName="upload")
    boolean upload(@WebParam(name = "file") FileWraper file);
    @WebMethod(operationName="download")
    FileWraper download(@WebParam(name = "filename") String  filename);

}