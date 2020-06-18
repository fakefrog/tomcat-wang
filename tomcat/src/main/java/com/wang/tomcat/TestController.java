package com.wang.tomcat;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Package:com.wang.tomcat</p>
 * <p>Description: </p>
 * <p>Company: com.dfire</p>
 *
 * @author baiyundou
 * @date 2020/6/19 3:33
 */
@RestController
public class TestController {

    @RequestMapping("/test")
    public String test(){
        return "test";
    }
}
