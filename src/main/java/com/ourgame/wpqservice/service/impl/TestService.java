package com.ourgame.wpqservice.service.impl;

import com.ourgame.wpqservice.service.ITestService;
import org.springframework.stereotype.Service;

/**
 * Created by lishj on 2016/6/25.
 */
@Service("testService")
public class TestService implements ITestService {
    public void seyHello(String str) {
        System.out.print("hello world " +str);
    }
}
