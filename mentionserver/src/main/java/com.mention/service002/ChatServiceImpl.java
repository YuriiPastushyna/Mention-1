package com.mention.service002;

import com.mention.repository.ChatRepository;
import com.mention.model.Chat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.Optional;

@Service
public class ChatServiceImpl implements ChatService {

  private ChatRepository chatRepository;

  @Autowired
  public ChatServiceImpl(ChatRepository chatRepository) {
    this.chatRepository = chatRepository;
  }

  @Override
  public Optional<Chat> getChat(Long id) {
    return chatRepository.findById(id);
  }

  @Override
  @Transactional
  public void addChat(Chat chat) {
    chatRepository.save(chat);
  }

  @Override
  @Transactional
  public void deleteChat(Long id) {
    chatRepository.deleteById(id);
  }
}
