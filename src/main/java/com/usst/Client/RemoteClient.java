package com.usst.Client;

import com.usst.BankInterafce.Bank;
import com.usst.Remote.RemoteCall;

import java.io.*;
import java.net.Socket;

public class RemoteClient implements Serializable{
    public Object BankClientSave(String className,String methodName,Class[] paramType,Object[] param) throws IOException, ClassNotFoundException {
        Socket socket=new Socket("localhost",8000);
        OutputStream os=socket.getOutputStream();
        ObjectOutputStream oos=new ObjectOutputStream(os);
        InputStream is=socket.getInputStream();
        ObjectInputStream ois=new ObjectInputStream(is);

        RemoteCall remoteCall=new RemoteCall(className,methodName,paramType,param);
        oos.writeObject(remoteCall);
        RemoteCall remoteCa=(RemoteCall) ois.readObject();



        oos.close();
        ois.close();
        socket.close();
        return  remoteCa.getResult();
        }

}
