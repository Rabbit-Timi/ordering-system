package org.timmtiy.ordering.system.dao.dao;

import org.timmtiy.ordering.system.dao.dataobject.UserDO;

public interface UserDao {
     Integer queryUser(UserDO userDO);
}
