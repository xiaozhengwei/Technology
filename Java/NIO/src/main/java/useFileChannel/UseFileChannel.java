package useFileChannel;

import util.Logger;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class UseFileChannel {

    public static void main(String[] args) {
        nioCopyFile("F:\\example-resources\\book.txt","F:\\example-resources\\file-channel-copy.txt");
    }

    public static void nioCopyFile(String srcPath, String destPath) {

        File srcFile = new File(srcPath);
        File destFile = new File(destPath);

        try {
            //如果目标文件不存在，则新建
            if (!destFile.exists()) {
                destFile.createNewFile();
            }


            long startTime = System.currentTimeMillis();

            FileInputStream fis = null;
            FileOutputStream fos = null;
            FileChannel inChannel = null;
            FileChannel outchannel = null;
            try {
                fis = new FileInputStream(srcFile);
                fos = new FileOutputStream(destFile);
                inChannel = fis.getChannel();
                outchannel = fos.getChannel();

                int length = -1;
                ByteBuffer buf = ByteBuffer.allocate(1024);
                //从输入通道读取到buf
                while ((length = inChannel.read(buf)) != -1) {

                    //翻转buf,变成成读模式
                    buf.flip();

                    int outlength = 0;
                    //将buf写入到输出的通道
                    while ((outlength = outchannel.write(buf)) != 0) {
                        System.out.println("写入字节数：" + outlength);
                    }
                    //清除buf,变成写入模式
                    buf.clear();
                }
                //强制刷新磁盘
                outchannel.force(true);
            } finally {
                closeQuietly(fis);
                closeQuietly(fos);
                closeQuietly(inChannel);
                closeQuietly(outchannel);
            }
            long endTime = System.currentTimeMillis();
            Logger.debug("base 复制毫秒数：" + (endTime - startTime));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void closeQuietly(java.io.Closeable o)
    {
        if (null == o) return;
        try
        {
            o.close();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }


}
