package is.hi.hbv501g.chathb.Chathb.Service;

import is.hi.hbv501g.chathb.Chathb.Model.Hub;

import java.util.List;
import java.util.Optional;

public interface HubService {
    Hub save(Hub hub);
    Optional<Hub> findById(long id);
    List<Hub> findAll();
    Optional<Hub> findByChannelId(String channelId);
}
