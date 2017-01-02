/***************************************************************************
 *
 * Copyright (c) 2017 aishuyu, Inc. All Rights Reserved
 *
 **************************************************************************/



/**
 * @file Client.java
 * @author aishuyu(asy5178@163.com)
 * @date 2017/01/02 21:32:22
 * @brief
 *
 **/



import protobuf.MessageProtos.Message;
import protobuf.MessageProtos.MessageService;
import protobuf.MessageProtos.MessageService.BlockingInterface;

import com.google.protobuf.BlockingRpcChannel;
import com.google.protobuf.ByteString;
import com.google.protobuf.RpcController;
import com.google.protobuf.ServiceException;
import com.googlecode.protobuf.socketrpc.RpcChannels;
import com.googlecode.protobuf.socketrpc.RpcConnectionFactory;
import com.googlecode.protobuf.socketrpc.SocketRpcConnectionFactories;
import com.googlecode.protobuf.socketrpc.SocketRpcController;


public class Client {

    private String host;
    private int port;

    public void start() {
        RpcConnectionFactory connectionFactory = SocketRpcConnectionFactories
            .createRpcConnectionFactory(host, port);
        BlockingRpcChannel channel = RpcChannels
            .newBlockingRpcChannel(connectionFactory);

        BlockingInterface service = MessageService.newBlockingStub(channel);
        RpcController controller = new SocketRpcController();
        Message.Builder message = Message.newBuilder();

        try {
            service.getMessage(controller, message.build());
        } catch (ServiceException e) {
            e.printStackTrace();
        }

        if (controller.failed()) {
            // TODO
        }
    }

    /**
     * for test rpc client
     */
    public static void main(String[] args) {
    }
}













/* vim: set expandtab ts=4 sw=4 sts=4 tw=100: */
