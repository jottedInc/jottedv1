package com.jotted.controller;

import com.jotted.model.FlashCard;
import com.jotted.model.Notes;
import com.jotted.model.Summary;
import com.jotted.service.LlmService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Inject;

import java.util.List;

@Controller("/jottedv1")
public class JottedController {

    @Inject
    private LlmService llmService;

    @Get("/summary")
    public Summary getSummary() {
        return llmService.getSummary();
    }

    @Get("/notes")
    public Notes getNotes() {
        return llmService.getNote();
    }

    @Get("/flashcards")
    public List<FlashCard> getFlashcards() {
        return llmService.getFlashCards();
    }
}
