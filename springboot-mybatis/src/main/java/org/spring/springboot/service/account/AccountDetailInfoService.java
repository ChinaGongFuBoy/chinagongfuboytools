package org.spring.springboot.service.account;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import org.spring.springboot.domain.account.AccountDetailInfo;

import java.util.List;

/**
 * @author yigang.wu
 * @date created in $time $date
 */
public interface AccountDetailInfoService {

    /**
     * 保存交易明细
     * @param accountDetailInfo
     * @return
     */
    int saveAccountDetailInfo(AccountDetailInfo accountDetailInfo);

    /**
     * 查询账户交易明细
     * @param accountDetailInfo
     */
    List<AccountDetailInfo> queryAccountDetailInfos(AccountDetailInfo accountDetailInfo);

    /**
     * 分页查询账户信息列表
     * @param accountDetailInfo
     * @return
     */
    PageInfo<AccountDetailInfo> queryAccountDetailInfoPage(AccountDetailInfo accountDetailInfo);

    /**
     * 根据id更新账户信息
     * @param accountDetailInfo
     * @return
     */
    int updateAccountById(AccountDetailInfo accountDetailInfo);
}
