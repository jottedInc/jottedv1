package com.jotted.service;

import com.jotted.client.LlmClient;
import com.jotted.model.FlashCard;
import com.jotted.model.Notes;
import com.jotted.model.Summary;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

import java.util.List;

@Singleton
public class LlmService {

    @Inject
    private LlmClient llmClient;

    //TODO
    public List<FlashCard> getFlashCards() {
        return null;
    }

    //TODO
    public Summary getSummary() {
        return null;
    }

    //TODO
    public Notes getNote() {
        return null;
    }
}
