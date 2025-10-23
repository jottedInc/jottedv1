# JottedV1

## Table of Contents
- [Overview](#overview)
- [Tech Stack](#tech-stack)
- [Architecture](#architecture)
- [Setup](#setup)

## Overview

Jotted is a learning assistant that utilizes Large Language Models (LLMs), several microservices and fine-tuning to take notes and provide various features for learning. It is aimed at helping students manage their time and energy when it comes to taking notes and utilizing them. Instead of learning page by page and plotting down points and finding answers to each doubt, Jotted helps you achieve a clear and concise understanding of topics within a short span of time.

For our User Interface, we use React Native and Expo to build native-like applications for iOS, Android and the web to simplify development and reduce time and cost to build it.

The backend is developed using Java and Micronaut.

Diagram for LLM UI interface (idea)

To maintain reliability and accuracy, we undergo the interconnected process of fine-tuning. Which involves creating high-quality datasets with (prompt, completion) examples, which is then uploaded to the LLM provider's platform for training. The platform then uses the dataset to tailor the model to each individual's use case. So that we can achieve faster, cheaper and reliable results. 

Furthermore, to keep the LLM up-to-date to remain accurate and relevant we use Periodic Re-tuning. This can happen on a semi-annual or annual basis to execute tasks with precision and high-quality.

Another way that we provide the absolute latest details available, is through Retrieval-Augmented Generation (RAG). With the help of a constantly updated external database, the system first checks in this external database, before sending the documents to the LLM. Then the LLM uses the latest data rather than its older counterpart. This process for RAG allows us to offer specialized, always-current notetaking capabilities for specific academic or professional domains without the immense cost of fully retraining the model.

## Tech Stack

- **Frontend:** React Native, Expo
- **Backend:** Java, Micronaut
- **Database:**
- **Other Tools:**