package com.az.demo1;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

/**
 * @author Az
 * @date 2025/5/7
 */
@RestController
public class ChatController {
    @Resource
    private ChatService chatService;

    @GetMapping("/chat")
    public String chat(@RequestParam("message") String message) {
        return chatService.chat(message);
    }


}
