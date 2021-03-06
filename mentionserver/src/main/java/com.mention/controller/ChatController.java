package com.mention.controller;

import com.mention.model.Chat;
import com.mention.service002.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Optional;

@RestController
@RequestMapping("/api/chat")
public class ChatController {

  private ChatService chatService;

  @Autowired
  public ChatController(ChatService chatService) {
    this.chatService = chatService;
  }

  @GetMapping("/{id}")
  public Optional<Chat> getChat(@PathVariable Long id) {
    return chatService.getChat(id);
  }

  @PostMapping
  public void addChat(@RequestBody Chat chat) {
    chatService.addChat(chat);
  }

  @DeleteMapping("/{id}")
  public void deleteChat(@PathVariable Long id) {
    chatService.deleteChat(id);
  }

}
