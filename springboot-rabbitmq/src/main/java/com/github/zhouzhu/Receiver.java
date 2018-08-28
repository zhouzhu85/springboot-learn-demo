package com.github.zhouzhu;

import org.springframework.stereotype.Component;

import java.util.concurrent.CountDownLatch;

/**
 * @ClassName: Receiver
 * @author:zhouzhu
 * @Date: 2018/8/28 11:47
 * @Version: V1.0
 */
@Component
public class Receiver {
    private CountDownLatch latch=new CountDownLatch(1);

    public void receiveMessage(String message){
        System.out.println("Received <"+message+">");
        latch.countDown();
    }

    public CountDownLatch getLatch(){
        return latch;
    }
}
