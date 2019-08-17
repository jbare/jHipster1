package me.justin.bare.web.rest;

import me.justin.bare.service.Test1JHipsterAppKafkaProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/test-1-j-hipster-app-kafka")
public class Test1JHipsterAppKafkaResource {

    private final Logger log = LoggerFactory.getLogger(Test1JHipsterAppKafkaResource.class);

    private Test1JHipsterAppKafkaProducer kafkaProducer;

    public Test1JHipsterAppKafkaResource(Test1JHipsterAppKafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @PostMapping(value = "/publish")
    public void sendMessageToKafkaTopic(@RequestParam("message") String message) {
        log.debug("REST request to send to Kafka topic the message : {}", message);
        this.kafkaProducer.sendMessage(message);
    }
}
