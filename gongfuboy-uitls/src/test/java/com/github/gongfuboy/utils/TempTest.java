package com.github.gongfuboy.utils;

import org.junit.Test;

/**
 * @author GongFuBoy
 * @date 2017/12/12
 * @time 22:42
 */
public class TempTest {

    @Test
    public void testString() {
        String s = "java";
        String s1 = String.valueOf("java");
        System.out.println(s1 == s);
    }
}
