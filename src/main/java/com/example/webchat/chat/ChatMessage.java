package com.example.webchat.chat;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChatMessage {

    private ChatMessageType type; // Change this to ChatMessageType (your custom enum)
    private String content;
    private String sender;

}
