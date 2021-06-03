package com.utunan.netty.codec;

import com.utunan.netty.decoder.Byte2IntegerDecoder;
import com.utunan.netty.encoder.Integer2ByteEncoder;
import io.netty.channel.CombinedChannelDuplexHandler;


public class IntegerDuplexHandler extends CombinedChannelDuplexHandler<
        Byte2IntegerDecoder,
        Integer2ByteEncoder>
{
    public IntegerDuplexHandler() {
        super(new Byte2IntegerDecoder(), new Integer2ByteEncoder());
    }
}
