/***************************************************************************
 *
 * Copyright (c) 2017 aishuyu, Inc. All Rights Reserved
 *
 **************************************************************************/



/**
 * @file Server.java
 * @author aishuyu(asy5178@163.com)
 * @date 2017/01/05 20:45:35
 * @brief
 *
 **/


public interface Server {
    /**
     *
     */
    public void start();
    /**
     *
     */
    public void stop();
    /**
     *
     */
    public void register(Class interfaceDefiner,Class impl);
    /**
     *
     */
    public void call(Invocation invo);
    /**
     *
     */
    public boolean isRunning();
    /**
     *
     */
    public int getPort();
}













/* vim: set expandtab ts=4 sw=4 sts=4 tw=100: */
