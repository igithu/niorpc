package com.igithu.niorpc;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by alisen on 17/1/8.
 */
public class Listener extends Thread {
    private ServerSocket socket;
    private Server server;

    public Listener(Server server) {
        this.server = server;
    }

    @Override
    public void run() {
        try {
            socket = new ServerSocket(server.getPort());
        } catch (IOException e) {
            e.printStackTrace();
        }

        while (server.isRunning()) {
            ObjectOutputStream oos = null;
            ObjectInputStream ois = null;
            try {
                Socket clientSocket = socket.accept();
                // 获取客户端的请求

            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }  finally {

            }
        }
    }

}
