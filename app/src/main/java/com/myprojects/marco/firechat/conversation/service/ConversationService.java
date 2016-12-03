package com.myprojects.marco.firechat.conversation.service;

import com.myprojects.marco.firechat.conversation.data_model.Chat;
import com.myprojects.marco.firechat.conversation.data_model.Message;
import com.myprojects.marco.firechat.database.DatabaseResult;

import rx.Observable;

/**
 * Created by marco on 29/07/16.
 */

public interface ConversationService {

    Observable<Message> syncMessages(String self, String destination);

    Observable<DatabaseResult<Chat>> getChat(String self, String destination);

    void sendMessage(String user, Message message);

    Observable<Boolean> getTyping(String self, String destination);

    void setTyping(String self, String destination, Boolean value);

}
