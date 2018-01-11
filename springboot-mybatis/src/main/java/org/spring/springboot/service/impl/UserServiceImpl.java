package org.spring.springboot.service.impl;

import com.alibaba.fastjson.JSONObject;
import org.spring.springboot.dao.WechatUserInfoMapper;
import org.spring.springboot.domain.WechatUserInfo;
import org.spring.springboot.service.UserService;
import org.spring.springboot.wechat.utils.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author yigang.wu
 * @date created in $time $date
 */
@Component
public class UserServiceImpl implements UserService{

    @Autowired
    WechatUserInfoMapper wechatUserInfoMapper;

    @Override
    public int saveUser(String userInfoJson) {
        WechatUserInfo userInfo = packageUserInfo(userInfoJson);
        return wechatUserInfoMapper.insert(userInfo);
    }



    /**
     * 组装微信用户信息
     * @param userInfoJson
     * @return
     */
    private WechatUserInfo packageUserInfo(String userInfoJson) {
        WechatUserInfo userInfo = new WechatUserInfo();
        JSONObject job =  JsonUtil.parseJsonStr(userInfoJson);
        userInfo.setCreateTime(new Date());
        userInfo.setUpdateTime(new Date());
        userInfo.setCity(job.get("city").toString());
        userInfo.setCountry(job.get("country").toString());
        userInfo.setHeadimgurl(job.get("headimgurl").toString());
        userInfo.setLanguage(job.get("language").toString());
        userInfo.setNickName(job.get("nickname").toString());
        userInfo.setOpenId(job.get("openid").toString());
        userInfo.setProvince(job.get("province").toString());
        userInfo.setSex((Integer) job.get("sex"));
        return userInfo;
    }
}
