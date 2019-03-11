package com.spring.aop;

import org.slf4j.LoggerFactory;

import org.slf4j.Logger;

/**
 * Created by hp on 2019/3/7.
 */
public class BeforeAdvice {
    private static final Logger logger = LoggerFactory.getLogger(MyBeforeAdvice.class);
    public void beforeAdvice(){
        logger.debug ("连接数据库操作。。。");
    }
}
