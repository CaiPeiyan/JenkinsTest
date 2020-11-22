package Mockito;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class student_resultMockitoTest {

    private result_process mockRP;
    private student_result sr;
    int [] A = { 100, 99, 88,77, 66,55,44 };
    @Before
    public void setUp() throws Exception {
        //创建一个mock
        mockRP = mock(result_process.class);
        //桩模块
        when(mockRP.great_num(A)).thenReturn(0);
        //Mockito.when(mockRP.average(A)).thenReturn(2.0);
        when(mockRP.failed_num(A)).thenReturn(3);
        //Mockito.when(mockRP.sort_output(A)).thenReturn(true);

        sr = new student_result(mockRP);


    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void process_resultTest() {  //将great_num(),average(),failed_num()替换为桩模块，测试full_marks()
        sr.process_result(A);

        //System.out.println(mockRP.great_num(A));

        //检查是否执行过一次great_num()
        verify(mockRP,times(1)).great_num(A);
        //检查是否执行过average()
        verify(mockRP,times(1)).failed_num(A);
        //检查是否执行过failed_num()
        //verify(mockRP,times(1)).failed_num(A);
        //检查是否执行过sort_output
        //verify(mockRP,times(1)).sort_output(A);

        //测试failed_num()单元并断言
        assertEquals(mockRP.failed_num(A),2);

    }
}