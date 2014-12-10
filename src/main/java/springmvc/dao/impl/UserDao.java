package springmvc.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import springmvc.dao.IUserDao;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.util.List;

/**
 * Created by Terrance on 2014/12/8 2014/12/8.
 * ${todo} describe
 */
@Repository
public class UserDao implements IUserDao {

    @Resource
    private JdbcTemplate jdbcTemplate;

    //private DataSource datasource;

    @Override
    public boolean verifyUser(String name, String password) {
        String sql="select * from usertable where userName=? and password =?";
        List result = jdbcTemplate.queryForList(sql, new Object[]{name,password});
        if(result!=null){
            return result.size()>0?true:false;
        }else {
            return false;
        }
    }


}
