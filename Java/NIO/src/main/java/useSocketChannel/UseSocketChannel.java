package useSocketChannel;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;

public class UseSocketChannel {


    @Test
    /**
     * 获取SocketChannel
     */
    public void getSocketChannel() throws IOException {

        /**
         * 客户端
         */
        // 获取一个套接字传输通道
        SocketChannel socketChannel = SocketChannel.open();
        // 设置为非阻塞模式
        socketChannel.configureBlocking(false);
        // 对服务的IP, PORT 进行链接
        socketChannel.connect(new InetSocketAddress("127.0.0.1", 80));

        while (!socketChannel.finishConnect()) {
            // 不停的自旋
        }

    }


}
