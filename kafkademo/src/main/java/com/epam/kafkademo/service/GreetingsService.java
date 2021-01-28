package com.epam.kafkademo.service;

import com.epam.kafkademo.model.Greetings;
import com.epam.kafkademo.stream.GreetingsStream;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;

@Service
@Slf4j
public class GreetingsService {
    private final GreetingsStream greetingsStream;

    public GreetingsService(GreetingsStream greetingsStream) {
        this.greetingsStream = greetingsStream;
    }

    public void sendGreeting(final Greetings greeting) {
        log.info("Sending Greetings {} ", greeting);
        MessageChannel messageChannel = greetingsStream.outboundGreetings();
        messageChannel.send(MessageBuilder.withPayload(greeting).setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON_VALUE).build());
    }
}
