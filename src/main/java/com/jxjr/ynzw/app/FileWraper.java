package com.jxjr.ynzw.app;

import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

@XmlType(name = "FileWraper")
public class FileWraper implements Serializable {
    private String fileName;
    private String fileExtension;
    //文件二进制数据
    private DataHandler file;
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileExtension() {
        return fileExtension;
    }

    public void setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
    }

    //注解该字段为二进制流
    @XmlMimeType("application/octet-stream")
    public DataHandler getFile() {
        return file;
    }

    public void setFile(DataHandler file) {
        this.file = file;
    }
}
