package com.igithu.niorpc;

import com.igithu.niorpc.Invocation;
import com.igithu.niorpc.Server;

/**
 * Created by alisen on 17/1/8.
 */
public class RpcServer implements Server {

    private int port = 8889;
    private Listener listener;
    private boolean isRuning = true;


    public void start() {
        listener = new Listener(this);
        this.isRuning = true;
        listener.start();

    }

    public void stop() {

    }

    public void register(Class interfaceDefiner, Class impl) {

    }

    public void call(Invocation invo) {

    }

    public boolean isRunning() {
        return isRuning;
    }

    public int getPort() {
        return port;
    }
}










/* vim: set expandtab ts=4 sw=4 sts=4 tw=100: */
