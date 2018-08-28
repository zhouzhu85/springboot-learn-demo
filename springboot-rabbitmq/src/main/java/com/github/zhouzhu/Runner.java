package com.github.zhouzhu;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName: Runner
 * @author:zhouzhu
 * @Date: 2018/8/28 13:40
 * @Version: V1.0
 */
@Component
public class Runner implements CommandLineRunner{

    private final RabbitTemplate rabbitTemplate;

    private final Receiver receiver;
    private final ConfigurableApplicationContext context;

    public Runner(RabbitTemplate rabbitTemplate, Receiver receiver, ConfigurableApplicationContext context) {
        this.rabbitTemplate = rabbitTemplate;
        this.receiver = receiver;
        this.context = context;
    }

    @Override
    public void run(String... strings) throws Exception {
        System.out.println("Sending message...");
        rabbitTemplate.convertAndSend(SpringbootRabbitmqApplication.queueName,"Hello from RabbitMQ!");
        receiver.getLatch().await(1000, TimeUnit.MILLISECONDS);
        context.close();
    }
}
