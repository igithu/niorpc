package com.igithu.niorpc;

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
        setRuning(false);
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

    public void setRuning(boolean isRuning) {
        this.isRuning = isRuning;
    }
}










/* vim: set expandtab ts=4 sw=4 sts=4 tw=100: */
