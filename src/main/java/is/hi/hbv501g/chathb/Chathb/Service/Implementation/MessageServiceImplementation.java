package is.hi.hbv501g.chathb.Chathb.Service.Implementation;

import is.hi.hbv501g.chathb.Chathb.Model.ChatMessage;
import is.hi.hbv501g.chathb.Chathb.Repository.MessageRepository;
import is.hi.hbv501g.chathb.Chathb.Service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceImplementation implements MessageService {
    MessageRepository repository;

    @Autowired
    public MessageServiceImplementation(MessageRepository repository) {
        this.repository = repository;
    }

    @Override
    public ChatMessage save(ChatMessage chatMessage) {
        return repository.save(chatMessage);
    }

    @Override
    public List<ChatMessage> findByChannelId(String id) {
        return repository.findByChannelId(id);
    }
}
