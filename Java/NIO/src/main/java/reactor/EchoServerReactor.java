package reactor;

import java.io.IOException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

public class EchoServerReactor implements Runnable {

    Selector selector;
    ServerSocketChannel serverSocket;

    public EchoServerReactor() throws IOException {
        selector=Selector.open();
        serverSocket=ServerSocketChannel.open();
        SelectionKey sk=serverSocket.register(selector,SelectionKey.OP_ACCEPT);
    }

    @Override
    public void run() {
        try{
            while(!Thread.interrupted()){
                selector.select();
                Set<SelectionKey> selected=selector.selectedKeys();
                Iterator<SelectionKey> it=selected.iterator();
                while(it.hasNext()){
                    SelectionKey sk=  it.next();

                }
            }
        }catch (Exception e){

        }
    }


    class AcceptorHandler implements Runnable{

        @Override
        public void run() {

        }
    }
}
