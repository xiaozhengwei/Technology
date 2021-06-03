package com.utunan.netty.encoder;

import com.utunan.util.Logger;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;


public class Integer2ByteEncoder extends MessageToByteEncoder<Integer> {
    @Override
    public void encode(ChannelHandlerContext ctx, Integer msg, ByteBuf out)
            throws Exception {
        out.writeInt(msg);
        Logger.info("encoder Integer = " + msg);
    }
}
