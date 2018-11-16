package com.xiaogangkui.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

/**
 * @author Created by luchunyu
 */
public class KafkaProducerTest extends BaseTest {

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    @Test
    public void test(){
        for (int i =0 ;i<100; i++){
            kafkaTemplate.send("testTopic", "helloWorld"+i);
            System.out.println("发送成功");
        }

    }
}
