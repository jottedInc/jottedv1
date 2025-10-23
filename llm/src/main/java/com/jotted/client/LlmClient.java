package com.jotted.client;

import com.jotted.dto.LlmRequest;
import com.jotted.dto.LlmResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Header;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.client.annotation.Client;

import javax.validation.constraints.Positive;

@Client("${llm.api.url}")
public interface LlmClient {

    @Post("/chat/completions")
    @Header(name = "Authorization", value = "Bearer ${llm.api.key}")
    LlmResponse generateResponse(@Body LlmRequest request);
}
