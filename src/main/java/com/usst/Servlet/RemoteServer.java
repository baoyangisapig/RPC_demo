package com.usst.Servlet;

import com.usst.Remote.RemoteCall;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.ServerSocket;
import java.net.Socket;
import java.rmi.Remote;
import java.util.HashMap;
import java.util.Map;

public class RemoteServer {
    Object Result;
    private Map remoteObjects=new HashMap();
    public void register(String className,Object remoteobject){
        remoteObjects.put(className,remoteobject);
    }

    public Object invoke(RemoteCall remoteCall) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        String className=remoteCall.getClassName();
        String methodName=remoteCall.getMethodName();

        Class<?> ClassType=Class.forName(className);
        Method method=ClassType.getMethod(remoteCall.getMethodName(),remoteCall.getParamType());
        Object object=remoteObjects.get(className);
        if(object==null)
        {
            System.out.println("调用方法不存在");
        }
        else
        {
            Result=method.invoke(object,remoteCall.getParam());
            remoteCall.setResult(Result);
        }
        return  remoteCall;
    }

    public  void BankServer() throws  Exception
    {
        ServerSocket serverSocket=new ServerSocket(8000);
        System.out.println("服务器启动");
        while(true)
        {
            Socket socket=serverSocket.accept();
            OutputStream os=socket.getOutputStream();
            ObjectOutputStream oos=new ObjectOutputStream(os);
            InputStream is=socket.getInputStream();
            ObjectInputStream ois=new ObjectInputStream(is);
            RemoteCall remoteCall=(RemoteCall) ois.readObject();
            remoteCall=(RemoteCall) invoke(remoteCall);

            oos.writeObject(remoteCall);
            oos.close();
            ois.close();
            socket.close();


        }



    }


}
