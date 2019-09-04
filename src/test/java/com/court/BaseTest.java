package com.court;

import com.court.jee.utils.http.HttpHelper;
import com.court.jee.utils.http.RequestType;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BaseTest {

    @Test
    public void testHttp(){
        HttpHelper.doCommHttp(RequestType.GET , "http://www.baidu.com" , null);
    }
}
