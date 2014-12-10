package springmvc.service.Impl;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import springmvc.dao.IUserDao;
import springmvc.service.IHomeService;

import javax.annotation.Resource;

/**
 * Created by Terrance on 2014/12/5 2014/12/5.
 * ${todo} describe
 */
@Service
@Transactional
public class HomeServiceImpl implements IHomeService {

    @Resource
    private IUserDao userDao;

    @Override
    public boolean login(String userName, String password) {
        return userDao.verifyUser(userName,password);
    }
}
