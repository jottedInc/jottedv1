package com.jotted.model;

import io.micronaut.serde.annotation.Serdeable;
import lombok.Data;

@Data
@Serdeable
public class Notes {
    String format;
    String notes;
}
