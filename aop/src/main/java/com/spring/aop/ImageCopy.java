package com.spring.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.xpath.XPathNamespace;

import java.io.*;
import java.net.URI;

public class ImageCopy {
    private static final Logger logger= LoggerFactory.getLogger(ImageCopy.class);


    public void copyImage() throws IOException{
        logger.info("开始将图片从D盘复制到E盘...");
        File srcFile = new File("D:/1.jpg");
        File destFile=new File("E:/1.jpg");
        InputStream in=new FileInputStream(destFile);
        OutputStream out=new FileOutputStream(destFile);
        byte[] bytes=new byte[(int) srcFile.length()];
        int len;
        while ((len=in.read(bytes))!=-1){
            out.write(bytes, 0,len);
        }
        in.close();
        out.close();
    }
}
