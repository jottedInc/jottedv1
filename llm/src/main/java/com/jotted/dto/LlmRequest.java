package com.jotted.dto;

import com.jotted.model.Message;
import io.micronaut.serde.annotation.Serdeable;
import lombok.Data;

import java.util.List;

@Data
@Serdeable
public class LlmRequest {
    String model;
    List<Message> message;
}
