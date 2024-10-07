package com.itheima;

import com.itheima.Mapper.EmpMapper;
import com.itheima.pojo.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
class RelearnApplicationTests {
    @Autowired
    private EmpMapper empMapper;

    @Test
    void contextLoads() {
//        int delete = empMapper.delete(16);
//        System.out.println(delete);


//        List<Emp> empList = empMapper.list();
//        empList.stream().forEach(emp -> {
//            System.out.println(emp);
//        });

//        Emp emp = new Emp();
//                16,
////                "zhangsan",
////                "123456",
////                "张三",
////                (short) 1,
////                "http://localhost:8080/upload/2022/07/08/d6e6e7e6-e7b6-4b7e-b7e6-e7b6e7e6e7b6.jpg",
////                (short) 1,
////                "2022-07-08",
////                1,
////                LocalDateTime.now().toString(),
////                LocalDateTime.now().toString()
//        emp.setUsername("zhangsan3");
//        emp.setPassword("123456");
//        emp.setName("张三3");
//        emp.setGender((short) 1);
//        emp.setImage("http://localhost:8080/upload/2022/07/08/d6e6e7e6-e7b6-4b7e-b7e6-e7b6e7e6e7b6.jpg");
//        emp.setJob((short) 1);
//        emp.setEntrydate("2022-07-08");
//        emp.setDeptId(1);
//        emp.setCreateTime(LocalDateTime.now().toString());
//        emp.setUpdateTime(LocalDateTime.now().toString());
//
//
//        empMapper.insert(emp);
//        System.out.println(emp.getId());

//        Emp emp = new Emp();
//        emp.setId(19);
//        emp.setUsername("zhangsan100");
//        emp.setUpdateTime(LocalDateTime.now().toString());
//////
//        empMapper.update(emp);

//        Emp emp = new Emp();
//        emp = empMapper.getById(18);
//        System.out.println(emp);

        empMapper.list("张", (short)1, LocalDate.of(2010,1,1), LocalDate.of(2022,7,8)).forEach(emp -> System.out.println(emp));
//        empMapper.list(null,null,null,null).forEach(emp -> System.out.println(emp));

//        List<Integer> ids = Arrays.asList(13,14,15);
//        empMapper.deleteByIds(ids);


    }

}
