package com.spring.aop;
import cn.hutool.core.io.FileUtil;
import cn.hutool.extra.qrcode.QrCodeUtil;
import cn.hutool.extra.qrcode.QrConfig;

import java.awt.*;

public class QrCodeTest {
    public static void main(String[] args){
        QrConfig config = new QrConfig(300,300);
        config.setMargin(3);
        Color foreColor = new Color(238,110,115);
        Color bgColor = new Color(252,228,236);
        int foreColorRGB = foreColor.getRGB();
        int bgColorRGB = bgColor.getRGB();
        config.setForeColor(foreColorRGB);
        config.setBackColor(bgColorRGB);
        QrCodeUtil.generate(//
                "https://www.jianshu.com/u/d9b76cc271c5", //二维码内容
                QrConfig.create().setImg("d:/11.jpg"), //附带logo
                FileUtil.file("d:/qrcode.jpg")//写出到的文件
        );
    }
}

