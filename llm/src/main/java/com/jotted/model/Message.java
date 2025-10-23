package com.jotted.model;

import lombok.Data;

@Data
public class Message {
    String role;
    String type;
    String message;
}
