package com.igithu.niorpc;

import java.net.ServerSocket;

/**
 * Created by alisen on 17/1/8.
 */
public class Listener extends Thread {
    private ServerSocket socket;
    private Server server;

    public Listener(Server server) {
        this.server = server;
    }

}
