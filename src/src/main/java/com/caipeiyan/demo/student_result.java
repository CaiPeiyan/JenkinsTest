package com.caipeiyan.demo;
import java.util.Arrays;
import java.util.Scanner;
import org.apache.commons.lang3.ArrayUtils;
public class student_result {
    private static result_process rp;
    public static void main(String[] args) {
        process_result();
    }
    public static void process_result()
    {

        Scanner input = new Scanner(System.in);
        System.out.println("请输入考试人数：");
        int num = input.nextInt();
        int[] a = new int[num];
        int number;
        int sum = 0;
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个同学的考试成绩");
            number = input.nextInt();
            a[i] = number;
        }
        rp.great_num(a);
        rp.failed_num(a);
        rp.average(a);
        rp.sort_output(a);
    }

}
