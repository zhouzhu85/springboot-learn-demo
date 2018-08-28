package com.github.zhouzhu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: PublicsherService
 * @author:zhouzhu
 * @Date: 2018/8/28 15:41
 * @Version: V1.0
 */
@RestController
@RequestMapping("/pub")
public class PublicsherController {
    @Autowired
    private PublisherService publicsherService;

    @GetMapping(value = "/{id}")
    public String pubMsg(@PathVariable("id") String id){
        return publicsherService.pubMsg(id);
    }
}
