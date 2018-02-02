package org.spring.springboot.controller.account;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import org.spring.springboot.assemble.account.AccountAssemble;
import org.spring.springboot.domain.account.AccountDetailInfo;
import org.spring.springboot.service.account.AccountDetailInfoService;
import org.spring.springboot.wechat.utils.RestResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.List;

/**
 * @author yigang.wu
 * @date created in $time $date
 */
@RestController
@CrossOrigin
@RequestMapping(value="/account")
public class AccountController {

    @Autowired
    private AccountDetailInfoService accountDetailInfoService;

    @RequestMapping(value = "/receiveAccountMsg", method = RequestMethod.POST)
    public RestResponse<String> receiveAccountMsg(String accountMsg) {
        RestResponse<String> restResponse = new RestResponse<String>();
        AccountDetailInfo accountDetailInfo = AccountAssemble.getAccountDetailInfo(accountMsg);
        accountDetailInfo.setCreateTime(new Date());
        accountDetailInfo.setUpdateTime(new Date());
        accountDetailInfoService.saveAccountDetailInfo(accountDetailInfo);
        restResponse.setData("Success");
        restResponse.setCode("ok");
        return restResponse;
    }

    @RequestMapping(value = "/queryAccountDetailInfos", method = RequestMethod.POST)
    public RestResponse<List<AccountDetailInfo>> queryAccountDetailInfos(String conditionName){
        RestResponse<List<AccountDetailInfo>> restResponse = new RestResponse<List<AccountDetailInfo>>();
        AccountDetailInfo accountDetailInfo = null;
        if(!StringUtils.isEmpty(conditionName)){
            accountDetailInfo = AccountAssemble.getAccountDetailInfo(conditionName);
        }
        List<AccountDetailInfo> accountDetailInfos =  accountDetailInfoService.queryAccountDetailInfos(accountDetailInfo);
        restResponse.setData(accountDetailInfos);
        restResponse.setCode("ok");
        return restResponse;
    }

    @RequestMapping(value = "/queryAccountDetailInfoPage", method = RequestMethod.POST)
    public RestResponse<PageInfo<AccountDetailInfo>> queryAccountDetailInfoPage(String conditionName){
        RestResponse<PageInfo<AccountDetailInfo>> restResponse = new RestResponse<PageInfo<AccountDetailInfo>>();
        AccountDetailInfo accountDetailInfo = null;
        if(!StringUtils.isEmpty(conditionName)){
            accountDetailInfo = AccountAssemble.getAccountDetailInfo(conditionName);
        }
        PageInfo<AccountDetailInfo> accountDetailInfos =  accountDetailInfoService.queryAccountDetailInfoPage(accountDetailInfo);
        restResponse.setData(accountDetailInfos);
        restResponse.setCode("ok");
        return restResponse;
    }

    @RequestMapping(value = "/updateAccountById", method = RequestMethod.POST)
    public RestResponse<Void> updateAccountById(String updateCondition){
        RestResponse<Void> restResponse = new RestResponse<Void>();
        AccountDetailInfo accountDetailInfo = null;
        if(!StringUtils.isEmpty(updateCondition)){
            accountDetailInfo = AccountAssemble.getAccountDetailInfo(updateCondition);
            accountDetailInfo.setUpdateTime(new Date());
        }
        int count =  accountDetailInfoService.updateAccountById(accountDetailInfo);
        if(count > 0){
            restResponse.setCode("ok");
        }else{
            restResponse.setCode("error");
        }
        return restResponse;
    }
}
