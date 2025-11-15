package com.jotted.controller;

import com.jotted.service.LlmService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.reactivex.rxjava3.core.Single;
import jakarta.inject.Inject;

@Controller("/jottedv1")
public class JottedController {

    @Inject
    private LlmService llmService;

    @Get("/notes")
    public Single<String> getNotes(String prompt) {
        return llmService.getNotes(prompt);
    }

    @Get("/summary")
    public Single<String> getSummary(String prompt) {
        return llmService.getSummary(prompt);
    }

    @Get("/flashcards")
    public Single<String> getFlashcards(String prompt) {return llmService.getFlashcards(prompt);}

}
