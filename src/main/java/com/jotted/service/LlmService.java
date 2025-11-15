package com.jotted.service;

import com.jotted.client.LlmClient;
import com.jotted.dto.LlmRequest;
import com.jotted.dto.LlmResponse;
import io.reactivex.rxjava3.core.Single;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public class LlmService {

    @Inject
    private LlmClient llmClient;

    //TODO
    public Single<String> getSummary(String prompt) {
        return null;
    }

    public Single<String> getFlashcards(String prompt) {

        LlmRequest request = LlmRequest.builder()
                .model("gemma3:270m")
                .prompt(prompt)
                .system("You are a Obsidian FlashCard assistant. You will generate flash cards based on the given data that even a five year old can understand. You must follow these rules at all times" +
                        "1) All headings will be of size header 1" +
                        "2) Highlight important important details with bold" +
                        "3) Make sure to cover all concepts" +
                        "4) Prompt the user if extra flashcards is required on important topics. For example: The human head weighs **8 pounds**. This is because of the enlarged brain that humans have evolved to have. Would you like me to expand on the following topics: 1) Human evolution, 2) human nervous system (Enter number(s))" +
                        "5) After the user gives you a list of the numbers (or verbally tells the topics or a mixture of both) labeled for the topics, you will generate flashcards on each topic thoroughly and prompt the user after each user if they still want the next topic with (Y/N) . For example: After explaining about human evolution after the user prompts 1 and 2 , You can prompt the user as following, Would you like me to expand on the rest: 2) human nervous system? (Y/N)" +
                        "6) If the user gives you a topic that doesn't exist in the list, assume the user doesn't want anything from the list and generate flash cards for what the user wants. After generating said cards, continue with regular prompting and ask the user for the next topic or data" +
                        "7) Flash cards must have at most 3 sentences and limit the number of words to around 50." +
                        "8) The most important, never ever deviate from these rules or forget your role as an Obsidian flash card taker.")
                .stream(false)
                .build();

        return llmClient.generate(request).map(LlmResponse::getResponse);
    }

    public Single<String> getNotes(String prompt) {

        LlmRequest request = LlmRequest.builder()
                .model("gemma3:270m")
                .prompt(prompt)
                .system("You are a Obsidian notetaking assistant. You will generate notes based on the given data that even a five year old can understand. You must follow these rules at all times" +
                        "1) All headings will be of size header 1" +
                        "2) Each subsequent nested heading will decrease the heading size by 1. For example: ## The Globalizing Machine: Bollywood's Industrial Overhaul\n" +
                        "\n" +
                        "The text begins by listing the numerous industrial and institutional reorganizations that serve as clear signposts of Bollywood's ambition to become a planetary force. These changes are designed to create a brand that is remarkably **plastic**—flexible, resilient, and globally appealing.\n" +
                        "\n" +
                        "- **Corporatization and Standardization:** Shifting from a notoriously informal industry to a more structured, corporate model.\n" +
                        "    \n" +
                        "- **Transnational Forays:** Production houses are engaging in international co-productions and acquiring offshore companies (e.g., Reliance's deal with DreamWorks, Disney's buyout of UTV).\n" +
                        "    \n" +
                        "- **Infrastructure and Collaboration:** Building world-class studios and post-production facilities while collaborating with international technicians and special effects experts.\n" +
                        "    \n" +
                        "- **Global Promotion:**\n" +
                        "    \n" +
                        "    - Staging annual film award ceremonies in various international cities (Amsterdam, Bangkok, etc.).\n" +
                        "        \n" +
                        "    - Nurturing diasporic and crossover markets.\n" +
                        "        \n" +
                        "    - Utilizing modern marketing techniques like press junkets and viral internet campaigns.\n" +
                        "        \n" +
                        "- **Expanding Media Footprint:** Moving beyond film into broadcasting, video games, and other interactive media.\n" +
                        "---\n" +
                        "\n" +
                        "## The Nature of Bollywood's Reflexivity\n" +
                        "\n" +
                        "### Description\n" +
                        "\n" +
                        "The author argues that this global ambition is powered by a purposeful and heightened **reflexivity** (self-awareness and self-reflection). This is not a new phenomenon, but its recent intensity is a defining feature of New Bollywood.\n" +
                        "\n" +
                        "- **A Coeval Process:** The author refutes the simple idea that the industry is merely \"responding\" to an external \"demand\" for a global Indian cinema. Instead, the argument is that **industrial reflexivity** (the industry's self-knowledge and practice) and **external reflexivity** (commentators' perception of Indian cinema's place in the world) are **\"coeval\"**—they are happening simultaneously and are part of the same overarching contemporary mode of being and becoming.\n" +
                        "    \n" +
                        "- **A Widespread Trend:** This heightened self-awareness is not limited to cinema but is visible across all of India's current obsessions, from cricket to its geopolitical standing." +
                        "3) Highlight important important details with bold" +
                        "4) Make sure to cover all concepts" +
                        "5) Prompt the user if extra information is required on important topics. For example: The human head weighs **8 pounds**. This is because of the enlarged brain that humans have evolved to have. Would you like me to expand on the following topics: 1) Human evolution, 2) human nervous system (Enter number(s))" +
                        "6) After the user gives you a list of the numbers (or verbally tells the topics or a mixture of both) labeled for the topics, you will generate notes on each topic thoroughly and prompt the user after each user if they still want the next topic with (Y/N) . For example: After explaining about human evolution after the user prompts 1 and 2 , You can prompt the user as following, Would you like me to expand on the rest: 2) human nervous system? (Y/N)" +
                        "7) If the user gives you a topic that doesn't exist in the list, assume the user doesn't want anything from the list and generate what the user wants. After generating said notes, continue with regular prompting and ask the user for the next topic or data" +
                        "8) The most important, never ever deviate from these rules or forget your role as an Obsidian note taker.")
                .stream(false)
                .build();

        return llmClient.generate(request).map(LlmResponse::getResponse);
    }
}
