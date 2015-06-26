package com.jeary.proto;

import com.jeary.proto.model.MobilePhoneProtos;
import com.jeary.proto.model.MobilePhoneProtos.MobilePhone.Hardware;

public class Client {

    public static void main(String[] args) throws Exception {
        MobilePhoneProtos.MobilePhone.Builder builder = MobilePhoneProtos.MobilePhone
                .newBuilder();
        builder.setHardware(Hardware.ram)
            .setBrand("Apple")
            .addSoftware("camera")
            .addSoftware("player");

        byte[] messageBody = builder.build().toByteArray();

        MobilePhoneProtos.MobilePhone phone = MobilePhoneProtos.MobilePhone
                .parseFrom(messageBody);
        System.out.println(phone);
    }

}