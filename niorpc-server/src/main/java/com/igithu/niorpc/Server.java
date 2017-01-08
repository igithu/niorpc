package com.igithu.niorpc;

/**
 * Created by alisen on 17/1/8.
 */
public interface Server {

    public void start();

    public void stop();

    public void register(Class interfaceDefiner,Class impl);

    public void call(Invocation invo);

    public boolean isRunning();

    public int getPort();
}
