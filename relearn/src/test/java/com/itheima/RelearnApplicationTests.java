package com.itheima;

import com.itheima.Mapper.EmpMapper;
import com.itheima.pojo.Emp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class RelearnApplicationTests {
    @Autowired
    private EmpMapper empMapper;

    @Test
    void contextLoads() {
        int delete = empMapper.delete(16);
        System.out.println(delete);


        List<Emp> empList = empMapper.list();
        empList.stream().forEach(emp -> {
            System.out.println(emp);
        });
    }

}
