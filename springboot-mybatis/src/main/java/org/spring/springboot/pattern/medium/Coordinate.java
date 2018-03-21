package org.spring.springboot.pattern.medium;

/**
 * 协调者接口（中介者接口）
 * @author yigang.wu
 * @date created in $time $date
 */
public interface Coordinate {

    /**
     * 注册部门
     * @param name
     * @param department
     */
    void registerDepartment(String name,Department department);

    /**
     * 向某个部门传送命令
     * @param departmentName
     */
    void command(String departmentName);

}
