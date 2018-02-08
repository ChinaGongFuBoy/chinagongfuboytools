package org.spring.springboot.controller;

import org.spring.springboot.constant.RestResponse;
import org.spring.springboot.domain.User;
import org.spring.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户控制层
 *
 * Created by bysocket on 07/02/2017.
 */
@RestController
public class UserRestController {

    @Autowired
    private UserService userService;

    /**
     * 根据用户名获取用户信息，包括从库的地址信息
     *
     * @param userId
     * @return
     */
    @RequestMapping(value = "/api/user", method = RequestMethod.GET)
    public RestResponse<User> findByName(String userId) {
        RestResponse<User> response = new RestResponse<User>();
        response.setData(userService.findByName(userId));
        return response;
    }

}
