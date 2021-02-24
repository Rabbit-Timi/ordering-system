package org.timmtiy.ordering.system.service.service.util;

import org.timmtiy.ordering.system.dao.dataobject.UserDO;
import org.timmtiy.ordering.system.service.vo.UserVO;

public class Convert {

    public static UserDO convertVOTODO(UserVO userVO){
        UserDO userDO = new UserDO();
        userDO.setUsername(userVO.getUsername());
        userDO.setPassword(userVO.getPassword());
        return userDO;
    }
}
