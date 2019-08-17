package me.justin.bare.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class Test1JHipsterAppKafkaConsumer {

    private final Logger log = LoggerFactory.getLogger(Test1JHipsterAppKafkaConsumer.class);
    private static final String TOPIC = "topic_test1jhipsterapp";

    @KafkaListener(topics = "topic_test1jhipsterapp", groupId = "group_id")
    public void consume(String message) throws IOException {
        log.info("Consumed message in {} : {}", TOPIC, message);
    }
}
