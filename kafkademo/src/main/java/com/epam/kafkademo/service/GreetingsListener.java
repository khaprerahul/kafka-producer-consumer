package com.epam.kafkademo.service;

import com.epam.kafkademo.model.Greetings;
import com.epam.kafkademo.stream.GreetingsStream;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class GreetingsListener {
    @StreamListener(GreetingsStream.INPUT)
    public void handleGreetings(@Payload Greetings greetings) {
        log.info("greetings received {} ", greetings);
    }
}
