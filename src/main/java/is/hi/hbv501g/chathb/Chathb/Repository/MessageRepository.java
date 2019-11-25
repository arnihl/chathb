package is.hi.hbv501g.chathb.Chathb.Repository;

import is.hi.hbv501g.chathb.Chathb.Model.ChatMessage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MessageRepository extends JpaRepository<ChatMessage, Long> {
    ChatMessage save(ChatMessage chatMessage);
    List<ChatMessage> findByChannelId(String id);

}
