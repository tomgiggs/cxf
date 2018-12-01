package com.jxjr.ynzw.client;

public class ClientTest01 {
    public static void main(String[] args) {
        EntraceImpService service = new EntraceImpService();

        Entrance client = service.getEntraceImpPort();
        System.out.println(client.getData("hello i am a demo"));
    }
}
