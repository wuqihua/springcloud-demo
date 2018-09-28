package com.example.eurekaserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wuqihua<wuqihua @ c o rp.netease.com>
 * @since 2018/8/30
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public String get(){
        String s = "b";
        System.out.println("hahahaahah");
        return s;
    }
}
