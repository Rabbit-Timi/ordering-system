package org.timmtiy.ordering.system.service.service.impl;

import org.springframework.stereotype.Service;
import org.timmtiy.ordering.system.dao.dao.UserDao;
import org.timmtiy.ordering.system.service.service.LoginService;
import org.timmtiy.ordering.system.service.service.util.Convert;
import org.timmtiy.ordering.system.service.vo.UserVO;

import javax.annotation.Resource;
@Service
public class LoginServiceImpl implements LoginService {

    @Resource
    UserDao userDao;

    @Override
    public Boolean login(UserVO userVO) {
        return userDao.queryUser(Convert.convertVOTODO(userVO)) == 1;
    }
}
