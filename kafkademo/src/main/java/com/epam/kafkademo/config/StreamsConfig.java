package com.epam.kafkademo.config;

import com.epam.kafkademo.stream.GreetingsStream;
import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(GreetingsStream.class)
public class StreamsConfig {
}
