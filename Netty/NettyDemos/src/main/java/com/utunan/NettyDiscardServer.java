package com.utunan;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;

public class NettyDiscardServer {
    private final int serverPort;
    ServerBootstrap serverBootstrap = new ServerBootstrap();

    public NettyDiscardServer(int serverPort) {
        this.serverPort = serverPort;
    }

    public void runServer() {
        // 创建反应器轮询组
        EventLoopGroup bossLoopGroup = new NioEventLoopGroup(1);
        EventLoopGroup workerLoopGroup = new NioEventLoopGroup();

        try {
            //1.设置反应器轮询组
            serverBootstrap.group(bossLoopGroup, workerLoopGroup);
            //2.设置nio类型的通道
            serverBootstrap.channel(NioServerSocketChannel.class);
            //3.设置监听端口
            serverBootstrap.localAddress(serverPort);
            //4.设置通道的参数
            serverBootstrap.option(ChannelOption.SO_KEEPALIVE, true);
            //5.装配子通道流水线
            serverBootstrap.childHandler(new ChannelInitializer<SocketChannel>() {

                //有链接到达时回创建一个通道
                @Override
                protected void initChannel(SocketChannel socketChannel) throws Exception {
                    //流水线职责:负责管理管道中的处理器
                    // 向"子通道"(传输通道)流水线添加一个处理器
                    socketChannel.pipeline().addLast(new NettyDiscardHandler());
                }

            });
            //6.开始绑定服务器
            //通过调用sync同步方法阻塞知道绑定成功
            ChannelFuture channelFuture = serverBootstrap.bind().sync();
            //7.等待通道关闭的异步任务结束
            ChannelFuture closeFuture = channelFuture.channel().closeFuture();
            closeFuture.sync();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //8.优雅关闭EventLoopGroup
            //释放掉所有的资源,包括创建的线程
            workerLoopGroup.shutdownGracefully();
            bossLoopGroup.shutdownGracefully();
        }
    }

    public static void main(String[] args) {
        NettyDiscardServer server=new NettyDiscardServer(18819);
        server.runServer();
    }
}
