package org.spring.springboot.service.account.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.spring.springboot.constants.AccountConstant;
import org.spring.springboot.dao.account.AccountDetailInfoMapper;
import org.spring.springboot.domain.account.AccountDetailInfo;
import org.spring.springboot.example.account.AccountDetailInfoExample;
import org.spring.springboot.service.account.AccountDetailInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 记账明细服务实现类
 * @author yigang.wu
 * @date created in $time $date
 */
@Service
public class AccountDetailInfoServiceImpl implements AccountDetailInfoService {

    @Autowired
    private AccountDetailInfoMapper accountDetailInfoMapper;

    @Override
    public int saveAccountDetailInfo(AccountDetailInfo accountDetailInfo) {
        String openId = accountDetailInfo.getOpenId();
        AccountDetailInfoExample example = new AccountDetailInfoExample();
        example.createCriteria().andOpenIdEqualTo(openId);
        int count = accountDetailInfoMapper.countByExample(example);
        if(count > 0 ){
            throw new RuntimeException("该openid已经存在，不能重复添加");
        }
        return accountDetailInfoMapper.insert(accountDetailInfo);
    }

    @Override
    public List<AccountDetailInfo> queryAccountDetailInfos(AccountDetailInfo accountDetailInfo) {
        AccountDetailInfoExample example = new AccountDetailInfoExample();
        List<AccountDetailInfo> accountDetailInfos = accountDetailInfoMapper.selectByExample(example);
        return accountDetailInfos;
    }

    @Override
    public PageInfo<AccountDetailInfo> queryAccountDetailInfoPage(AccountDetailInfo accountDetailInfo) {
        PageHelper.startPage(1, AccountConstant.PAGER_SIZE);
        AccountDetailInfoExample example = new AccountDetailInfoExample();
        List<AccountDetailInfo> accountDetailInfos = accountDetailInfoMapper.selectByExample(example);
        PageInfo<AccountDetailInfo> accountDetailInfoPage = new PageInfo<AccountDetailInfo>(accountDetailInfos);
        return accountDetailInfoPage;
    }

    @Override
    public int updateAccountById(AccountDetailInfo accountDetailInfo) {
        return accountDetailInfoMapper.updateByPrimaryKeySelective(accountDetailInfo);
    }
}
