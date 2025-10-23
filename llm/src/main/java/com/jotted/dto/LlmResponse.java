package com.jotted.dto;

import com.jotted.model.Choice;
import io.micronaut.serde.annotation.Serdeable;
import lombok.Data;

import java.util.List;

@Data
@Serdeable
public class LlmResponse {
    List<Choice> choices;
}
