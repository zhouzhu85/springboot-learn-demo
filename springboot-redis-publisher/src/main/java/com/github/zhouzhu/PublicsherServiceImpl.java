package com.github.zhouzhu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

/**
 * @ClassName: PublicsherServiceImpl
 * @author:zhouzhu
 * @Date: 2018/8/28 15:43
 * @Version: V1.0
 */
@Service
public class PublicsherServiceImpl implements PublisherService{
    private static final Logger log= LoggerFactory.getLogger(PublicsherServiceImpl.class);

    @Autowired
    private StringRedisTemplate template;

    @Override
    public String pubMsg(String id) {
        if ("1".equals(id)){
            template.convertAndSend("phone","123456789");
            log.info("Publisher sends Topic...");
            return "success";
        }else{
            return "no my phone";
        }
    }
}
