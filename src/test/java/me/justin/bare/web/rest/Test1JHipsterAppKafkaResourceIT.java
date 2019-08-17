package me.justin.bare.web.rest;

import me.justin.bare.Test1JHipsterApp;
import me.justin.bare.service.Test1JHipsterAppKafkaProducer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.test.context.EmbeddedKafka;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@EmbeddedKafka
@SpringBootTest(classes = Test1JHipsterApp.class)
public class Test1JHipsterAppKafkaResourceIT {

    @Autowired
    private Test1JHipsterAppKafkaProducer kafkaProducer;

    private MockMvc restMockMvc;

    @BeforeEach
    public void setup() {
        Test1JHipsterAppKafkaResource kafkaResource = new Test1JHipsterAppKafkaResource(kafkaProducer);

        this.restMockMvc = MockMvcBuilders.standaloneSetup(kafkaResource)
            .build();
    }

    @Test
    public void sendMessageToKafkaTopic() throws Exception {
        restMockMvc.perform(post("/api/test-1-j-hipster-app-kafka/publish?message=yolo"))
            .andExpect(status().isOk());
    }
}
