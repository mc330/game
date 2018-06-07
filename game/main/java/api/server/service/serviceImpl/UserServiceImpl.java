package api.server.service.serviceImpl;

import api.server.entity.User;
import api.server.entity.UserExample;
import api.server.mapper.UserMapper;
import api.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> selectByExample() {
        UserExample example1 = new UserExample();
        example1.createCriteria().andAgeEqualTo(2);
        example1.isDistinct();
        userMapper.selectByExample(example1);
        return null;
    }
}
