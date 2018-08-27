package com.github.zhouzhu;

import com.github.zhouzhu.dao.RedisDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootRedisApplicationTests {
	public static Logger logger= LoggerFactory.getLogger(SpringBootApplication.class);

	@Test
	public void contextLoads() {
	}

	@Autowired
	RedisDao redisDao;

	@Test
	public void testRedis(){
		redisDao.setKey("name","张三");
		redisDao.setKey("age","11");
		logger.info(redisDao.getValue("name"));
		logger.info(redisDao.getValue("age"));
	}
}
