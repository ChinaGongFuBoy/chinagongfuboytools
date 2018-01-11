package org.spring.springboot.wechat;

import com.alibaba.fastjson.JSONObject;
import org.apache.log4j.Logger;
import org.spring.springboot.wechat.utils.Constant;
import org.spring.springboot.wechat.utils.HttpClientHelper;
import org.spring.springboot.wechat.utils.JsonUtil;

/**
 * 微信中普通参数的获取
 *
 * @author yigang.wu
 * @date created in $time $date
 */
public class CommonParamAquired {


    public static Logger logger = Logger.getLogger(CommonParamAquired.class);
    /**
     * 获取access_token的值
     * @return
     */
    public static String aquireAccessToken() throws  Exception{
        String accessToken = String.format(Constant.accessTokenUrl,Constant.appId,Constant.appsecret);
        String responseStr = HttpClientHelper.requestGet(accessToken);
        logger.info("The common access_token value is "+responseStr);
        return responseStr;
    }

    /**
     * 获取网页授权返回的相关信息
     * @return JSONObject
     */
    public static JSONObject aquiredAuthorizeInfo(String code) throws Exception{
        String authorizeTokenUrl = Constant.authorizeTokenUrl.
                replace("${appid}", Constant.appId).
                replace("${secret}", Constant.appsecret).
                replace("${code}", code);
        String responseStr = HttpClientHelper.requestGet(authorizeTokenUrl);
        logger.info("获取网页授权返回对象是"+responseStr);
        JSONObject job =  JsonUtil.parseJsonStr(responseStr);
        return job;
    }

    /**
     * 获取网页授权的token
     * @return
     */
    public static String authorizeAccessToken(JSONObject jsonObject) throws Exception{
        return jsonObject.get("access_token").toString();
    }

    /**
     * 获取网页授权的openId
     * @return
     */
    public static String aquiredOpenId(JSONObject jsonObject) throws Exception{
        return jsonObject.get("openid").toString();
    }

    /**
     * 获取用户的信息
     * @return
     */
    public static String aquiredUserInfo(String accessToken,String openid) throws Exception {
        String userInfoUrl = Constant.userInfoUrl.replace("${access_token}",accessToken).
                replace("${openid}",openid);
        String responseStr = HttpClientHelper.requestGet(userInfoUrl);
        logger.info("用户信息是："+responseStr);
        return responseStr;
    }
}