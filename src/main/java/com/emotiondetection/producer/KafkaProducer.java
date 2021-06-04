package com.emotiondetection.producer;

import com.emotiondetection.constant.ApplicationConstant;
import com.emotiondetection.data.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

/**
 * Created by asus on 5/30/2021.
 */
@RestController
@RequestMapping(value = "/produce", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
public class KafkaProducer {

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    @PostMapping("/message")

    public String sendMessage(@RequestBody Student message) {

        try {
            System.out.println("fdfsdfs");
            System.out.println(message);
            kafkaTemplate.send(ApplicationConstant.TOPIC_NAME, message);
        } catch (Exception e) {
            System.out.println("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
            e.printStackTrace();
        }
        return "json message sent succuessfully";
    }

}
