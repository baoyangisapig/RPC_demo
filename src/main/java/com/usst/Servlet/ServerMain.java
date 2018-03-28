package com.usst.Servlet;

import com.usst.BankService.BankImpl;

public class ServerMain {
    public static void main(String[] args) throws Exception {
        RemoteServer remoteServer=new RemoteServer();
        remoteServer.register("com.usst.BankService.BankImpl",new BankImpl());
        remoteServer.BankServer();
    }
}
