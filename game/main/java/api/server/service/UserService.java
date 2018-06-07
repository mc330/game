package api.server.service;

import api.server.entity.User;
import api.server.entity.UserExample;

import java.util.List;

public interface UserService {

    List<User> selectByExample();
}
