package com.github.gongfuboy.utils;

import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * sha1加密工具
 *
 * @author GongFuBoy
 * @date 2017/12/6
 * @time 15:22
 */
public class Sha1Utils {

    // 每一个键值对之间的连接符
    private String connection;

    // 键值之间的连接符
    private String keyValueConnection;

    // 单例工具
    private static Sha1Utils sha1Utils;

    /**
     * 私有化构造方法
     */
    private Sha1Utils() {

    }

    /**
     * 单例构造方法
     * @param connection
     * @return
     */
    public static Sha1Utils instance(String connection, String keyValueConnection) {
        if (sha1Utils == null) {
            synchronized (Sha1Utils.class) {
                if (sha1Utils == null) {
                    sha1Utils = new Sha1Utils();
                    sha1Utils.connection = connection;
                    sha1Utils.keyValueConnection = keyValueConnection;
                }
            }
        }
        return sha1Utils;
    }

    /**
     * SHA1 安全加密算法
     *
     * @param maps 参数key-value map集合
     * @return
     * @throws DigestException
     */
    public String SHA1(Map<String, Object> maps) throws DigestException {
        //获取信息摘要 - 参数字典排序后字符串
        String decrypt = getOrderByLexicographic(maps);
        try {
            //指定sha1算法
            MessageDigest digest = MessageDigest.getInstance("SHA-1");
            digest.update(decrypt.getBytes());
            //获取字节数组
            byte messageDigest[] = digest.digest();
            // Create Hex String
            StringBuffer hexString = new StringBuffer();
            // 字节数组转换为 十六进制 数
            for (int i = 0; i < messageDigest.length; i++) {
                String shaHex = Integer.toHexString(messageDigest[i] & 0xFF);
                if (shaHex.length() < 2) {
                    hexString.append(0);
                }
                hexString.append(shaHex);
            }
            return hexString.toString();

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            throw new DigestException("签名错误！");
        }
    }

    /**
     * 获取参数的字典排序
     *
     * @param maps 参数key-value map集合
     * @return String 排序后的字符串
     */
    private String getOrderByLexicographic(Map<String, Object> maps) {
        return splitParams(lexicographicOrder(getParamsName(maps)), maps);
    }

    /**
     * 获取参数名称 key
     *
     * @param maps 参数key-value map集合
     * @return
     */
    private List<String> getParamsName(Map<String, Object> maps) {
        List<String> paramNames = new ArrayList<String>();
        for (Map.Entry<String, Object> entry : maps.entrySet()) {
            paramNames.add(entry.getKey());
        }
        return paramNames;
    }

    /**
     * 参数名称按字典排序
     *
     * @param paramNames 参数名称List集合
     * @return 排序后的参数名称List集合
     */
    private List<String> lexicographicOrder(List<String> paramNames) {
        Collections.sort(paramNames);
        return paramNames;
    }

    /**
     * 拼接排序好的参数名称和参数值
     *
     * @param paramNames 排序后的参数名称集合
     * @param maps       参数key-value map集合
     * @return String 拼接后的字符串
     */
    private String splitParams(List<String> paramNames, Map<String, Object> maps) {
        StringBuilder paramStr = new StringBuilder();
        for (int i=0; i < paramNames.size(); i++) {
            paramStr.append(paramNames.get(i)).append(keyValueConnection);
            for (Map.Entry<String, Object> entry : maps.entrySet()) {
                if (paramNames.get(i).equals(entry.getKey())) {
                    paramStr.append(String.valueOf(entry.getValue()));
                }
            }
            if (i == paramNames.size() - 1) {
                paramStr.append("");
            } else {
                paramStr.append(connection);
            }
        }
        return paramStr.toString();
    }
}
