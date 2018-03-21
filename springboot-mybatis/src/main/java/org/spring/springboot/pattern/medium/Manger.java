package org.spring.springboot.pattern.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * 总经理是中介者接口的实现者
 * @author yigang.wu
 * @date created in $time $date
 */
public class Manger implements Coordinate{

    private Map<String,Department> map = new HashMap<String, Department>();
    @Override
    public void registerDepartment(String name, Department department) {
        map.put(name,department);
    }

    @Override
    public void command(String departmentName) {
        map.get(departmentName).saySomthing();
    }
}
