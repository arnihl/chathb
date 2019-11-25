package is.hi.hbv501g.chathb.Chathb.Service;

import is.hi.hbv501g.chathb.Chathb.Model.ChatMessage;

import java.util.List;
import java.util.Optional;

public interface MessageService {
    ChatMessage save(ChatMessage chatMessage);
    List<ChatMessage> findByChannelId(String id);

}
