package com.az.demo1;

import dev.langchain4j.model.chat.ChatLanguageModel;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * @author Az
 * @date 2025/5/8
 */
@Service
public class ChatService {
    @Resource
    private ChatLanguageModel chatLanguageModel;

    public String chat(String message) {
        return chatLanguageModel.generate(message);
    }

}
