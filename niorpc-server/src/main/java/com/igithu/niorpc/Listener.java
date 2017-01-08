/***************************************************************************
 *
 * Copyright (c) 2017 aishuyu, Inc. All Rights Reserved
 *
 **************************************************************************/



/**
 * @file Listener.java
 * @author aishuyu(asy5178@163.com)
 * @date 2017/01/05 21:23:54
 * @brief
 *
 **/



public class Listener extends Thread {
    private ServerSocket socket;
    private Server server;

    public Listener(Server server) {
        this.server = server;
    }
}











/* vim: set expandtab ts=4 sw=4 sts=4 tw=100: */
