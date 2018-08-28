package com.github.zhouzhu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.CountDownLatch;

/**
 * @ClassName: Receiver
 * @author:zhouzhu
 * @Date: 2018/8/27 19:25
 * @Version: V1.0
 */
public class Receiver {
    private static final Logger LOGGER= LoggerFactory.getLogger(Receiver.class);
    private CountDownLatch latch;

    @Autowired
    public Receiver (CountDownLatch latch){
        this.latch=latch;
    }

    public void receiveMessage(String message){
        LOGGER.info("Received <"+message+">");
        latch.countDown();
    }


}
