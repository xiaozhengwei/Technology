package com.utunan.netty.decoder;



import com.utunan.util.Logger;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ReplayingDecoder;

import java.util.List;

public class Byte2IntegerReplayDecoder extends ReplayingDecoder {
    @Override
    public void decode(ChannelHandlerContext ctx, ByteBuf in,
                       List<Object> out) {
        int i = in.readInt();
        Logger.info("解码出一个整数: " + i);
        out.add(i);
    }
}