package org.spring.springboot.assemble.account;

import com.alibaba.fastjson.JSONObject;
import org.spring.springboot.domain.account.AccountDetailInfo;

import java.util.Date;

/**
 * @author yigang.wu
 * @date created in $time $date
 */
public class AccountAssemble {

    /**
     * 根据账户json字符串 获取账户明细详情对象
     * @param accountMsg
     * @return
     */
    public static AccountDetailInfo getAccountDetailInfo(String accountMsg) {

        AccountDetailInfo accountDetailInfo =  JSONObject.toJavaObject(JSONObject.parseObject(accountMsg),AccountDetailInfo.class);
        return accountDetailInfo;
    }
}
