package com.jotted.dto;

import io.micronaut.serde.annotation.Serdeable;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Serdeable
public class LlmRequest {
    String model;
    String prompt;
    String system;
    boolean stream;
}
