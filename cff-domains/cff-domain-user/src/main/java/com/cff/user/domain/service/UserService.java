package com.cff.user.domain.service;

import com.cff.user.domain.User;

import java.util.List;

/**
 * @Interface: com.cff.user.domain.service.UserService
 * @Desc:
 * @author: luwu
 * @Date: 2023-04-09 23:37
 */
public interface UserService {

    List<User> findUser(User user);
}
