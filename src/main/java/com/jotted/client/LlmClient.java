package com.jotted.client;

import com.jotted.dto.LlmRequest;
import com.jotted.dto.LlmResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.client.annotation.Client;
import io.reactivex.rxjava3.core.Single;


@Client("${ollama.host}")
public interface LlmClient {

    @Post("/api/generate")
    Single<LlmResponse> generate(@Body LlmRequest request);
}
