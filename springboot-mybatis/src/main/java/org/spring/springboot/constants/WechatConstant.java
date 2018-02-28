package org.spring.springboot.constants;

/**
 *
 *
 * @author yigang.wu
 * @date created in $time $date
 */
public class WechatConstant {
    /**服务器的域名地址*/
    public static final String serverUrl = "qyyc74.natappfree.cc";
    public static final String appId = "wx57e0b6adf819af4f";
    public static final String appsecret = "8a141160e4fe1f4cba74f9ca5a9bf946";
    /**普通的access_token的地址*/
    public static final String accessTokenUrl = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=%s&secret=%s";
     /**用户授权的地址*/
    public static final String authorizeUrl = "http%3A%2F%2F"+serverUrl+"%2Fwechat%2Fauthorize";
    /**用户同意获取code的地址*/
    public static final String codeUrl = "https://open.weixin.qq.com/connect/oauth2/authorize?appid=${appid}&redirect_uri="+authorizeUrl+"&response_type=code&scope=${scope}&state=STATE#wechat_redirect";
    /**scope*/
    public static final String scope_snsapi_base = "snsapi_base";
    public static final String scope_snsapi_userinfo = "snsapi_userinfo";
    /**网页授权token的url*/
    public static final String authorizeTokenUrl = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=${appid}&secret=${secret}&code=${code}&grant_type=authorization_code";
    /**获取用户信息的url*/
    public static final String userInfoUrl = "https://api.weixin.qq.com/sns/userinfo?access_token=${access_token}&openid=${openid}&lang=zh_CN";
}
