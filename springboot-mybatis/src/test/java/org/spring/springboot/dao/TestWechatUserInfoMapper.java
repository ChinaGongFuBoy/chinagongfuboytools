package org.spring.springboot.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.spring.springboot.domain.WechatUserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

/**
 * 插入的单元测试
 * @author yigang.wu
 * @date created in $time $date
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestWechatUserInfoMapper {

    @Autowired
    private WechatUserInfoMapper wechatUserInfoMapper;

    @Test
    public void testInsert(){
        WechatUserInfo wechatUserInfo = new WechatUserInfo();
        wechatUserInfo.setUpdateTime(new Date());
        wechatUserInfo.setCreateTime(new Date());
        wechatUserInfoMapper.insert(wechatUserInfo);
    }
}
