package org.spring.springboot.dao.account;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.account.AccountDetailInfo;
import org.spring.springboot.example.account.AccountDetailInfoExample;

public interface AccountDetailInfoMapper {
    /**
     *
     * @mbggenerated 2018-02-01
     */
    int countByExample(AccountDetailInfoExample example);

    /**
     *
     * @mbggenerated 2018-02-01
     */
    int deleteByExample(AccountDetailInfoExample example);

    /**
     *
     * @mbggenerated 2018-02-01
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2018-02-01
     */
    int insert(AccountDetailInfo record);

    /**
     *
     * @mbggenerated 2018-02-01
     */
    int insertSelective(AccountDetailInfo record);

    /**
     *
     * @mbggenerated 2018-02-01
     */
    List<AccountDetailInfo> selectByExample(AccountDetailInfoExample example);

    /**
     *
     * @mbggenerated 2018-02-01
     */
    AccountDetailInfo selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2018-02-01
     */
    int updateByExampleSelective(@Param("record") AccountDetailInfo record, @Param("example") AccountDetailInfoExample example);

    /**
     *
     * @mbggenerated 2018-02-01
     */
    int updateByExample(@Param("record") AccountDetailInfo record, @Param("example") AccountDetailInfoExample example);

    /**
     *
     * @mbggenerated 2018-02-01
     */
    int updateByPrimaryKeySelective(AccountDetailInfo record);

    /**
     *
     * @mbggenerated 2018-02-01
     */
    int updateByPrimaryKey(AccountDetailInfo record);
}