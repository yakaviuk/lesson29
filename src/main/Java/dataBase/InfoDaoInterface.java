package dataBase;

import entity.Info;

public interface InfoDaoInterface {
    Info getInfoByUserId(long id);
    boolean deleteInfoById(Info info);
    boolean createInfo(Info info);
    boolean updateInfo (Info info);
}
