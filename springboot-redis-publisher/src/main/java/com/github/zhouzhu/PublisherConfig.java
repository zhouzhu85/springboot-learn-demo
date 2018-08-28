package com.github.zhouzhu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.StringRedisTemplate;

/**
 * redis消息队列配置-Publisher
 * @ClassName: PublisherConfig
 * @author:zhouzhu
 * @Date: 2018/8/28 15:39
 * @Version: V1.0
 */
@Configuration
public class PublisherConfig {
    /**
     * redis的模板 作为发布者
     * @param connectionFactory
     * @return
     */
    @Bean
    public StringRedisTemplate template(RedisConnectionFactory connectionFactory){
        return new StringRedisTemplate(connectionFactory);
    }
}
