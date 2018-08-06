package com.mention.repository;


import com.mention.SpringBootConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
@SpringBootTest(classes = SpringBootConfiguration.class)
class MessageRepositoryTest {

    private final static int SENDER_ID = 1;
    private final static int RECIVER_ID = 2;
    private final static int CHAT_ID = 3;
    private final static String MESSAGE_CONTENT = "Hello friend!";

    @Autowired
    private MessageRepository messageRepository;



}