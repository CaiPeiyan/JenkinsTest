package com.caipeiyan.demo;

import org.apache.commons.lang3.ArrayUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class result_processTest {

    private static result_process rp_test;
    int [] A = { 100, 99, 88,77, 66,55,44 };
    @Before
    public void setUp() throws Exception {
        //构建对象
        rp_test = new result_process();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void GetLength() {               //测试Apache类库lang的函数
        //调用被测试单元并断言
        assertEquals(ArrayUtils.getLength(A),7);
    }


    @Test
    public void great_num() {
        //调用被测试单元并断言
        assertEquals(rp_test.great_num(A),2);
    }

    @Test
    public void failed_num() {
        //调用被测试单元并断言
        assertEquals(rp_test.failed_num(A),2);
    }

    @Test
    public void average() {
        //调用被测试单元并断言
        assertEquals(rp_test.average(A),75.0,0.01);
    }

    @Test
    public void full_marks() {
        //调用被测试单元并断言
        assertEquals(rp_test.full_marks(A),1);
    }
}