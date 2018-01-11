package org.spring.springboot.service;

import org.spring.springboot.domain.WechatUserInfo;

/**
 * @author yigang.wu
 * @date created in $time $date
 */
public interface UserService {

    int saveUser(String userInfoJson);
}
