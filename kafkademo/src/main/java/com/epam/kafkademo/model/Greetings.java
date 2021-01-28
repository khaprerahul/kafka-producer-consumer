package com.epam.kafkademo.model;

import lombok.*;
import org.springframework.integration.annotation.Default;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Greetings {
    private long timestamp;
    private String message;
}
