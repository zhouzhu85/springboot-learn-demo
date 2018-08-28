package com.github.zhouzhu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.CountDownLatch;

/**
 *  订阅者
 * @ClassName: Receiver
 * @author:zhouzhu
 * @Date: 2018/8/28 16:18
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
        LOGGER.info("Received < 我的号码："+message+">");
        latch.countDown();
    }
}
