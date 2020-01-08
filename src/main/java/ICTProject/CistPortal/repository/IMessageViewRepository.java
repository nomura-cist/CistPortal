package ICTProject.CistPortal.repository;

import ICTProject.CistPortal.bean.MessageView;

import java.sql.Timestamp;
import java.util.List;

public interface IMessageViewRepository {
    public List<MessageView> selectMany(String userId, Timestamp dateTime);

    public List<MessageView> alreadyReadSelectMany(String userId,Timestamp dateTime);

    public List<MessageView> selectOne(long id);

    public int insertOne(long id, String userId);

    public int updateRead(long messageId,String userId);

    public int updateUnread(long messageId,String userId);

}


