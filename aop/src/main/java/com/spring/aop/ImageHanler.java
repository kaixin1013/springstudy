package com.spring.aop;


import cn.hutool.core.util.ImageUtil;
        import org.aspectj.lang.annotation.AfterReturning;
        import org.aspectj.lang.annotation.Before;
        import org.aspectj.lang.annotation.Pointcut;
        import org.slf4j.Logger;
        import org.slf4j.LoggerFactory;

        import java.awt.*;
        import java.io.File;

        import static org.aspectj.weaver.tools.cache.SimpleCacheFactory.path;

/**
 * Created by DELL on 2019/3/11.
 */
public class ImageHandler {
    private static final Logger logger= LoggerFactory.getLogger(ImageHandler.class);

    @Pointcut("execution(* com.spring.aop.ImageHandler())")
    public void handleImage() {
    }
    @Before(value="handleImage()")
    public void pressTextOnImage() {
        logger.info("开始图片添加水印");
        File srcFile = new File("D:/1.jpg");
        File destFile = new File("D:/1.jpg");
        Color color = new Color(211,71,38);
        Font font = new Font("微软雅黑", Font.BOLD, 60);
        ImageUtil
    }
    @AfterReturning("handleImage()")
    public void grayImage(){
        logger.info("开始将图片转成黑白");
        File srcFile=new File("");
        File destFile = new File("");
        ImageUtil.gray(srcFile,destFile);

    }
}
