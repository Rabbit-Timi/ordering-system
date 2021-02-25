package org.timmtiy.ordering.system.web.util;

import org.timmtiy.ordering.system.service.vo.UserVO;
import org.timmtiy.ordering.system.web.dto.LoginRequestDTO;

public class Convert {

    public static UserVO convertDTOToVO(LoginRequestDTO dto){
        UserVO userVO = new UserVO();
        userVO.setUsername(dto.getUsername());
        userVO.setPassword(dto.getPassword());
        return userVO;
    }
}
