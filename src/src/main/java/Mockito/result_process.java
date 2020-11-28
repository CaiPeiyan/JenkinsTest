package Mockito;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public abstract class result_process {
     public abstract int great_num(int[] a);

    /*{
        int great = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 90) {                   //植入错误
                great++;
            }
        }
        System.out.println("优秀的人数为" + (great));
        full_marks(a);
        return great;
    }*/
    public abstract int failed_num(int[] a);
    /*public static int failed_num(int[] a) {
        int failed = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]<60) {
                failed++;
            }
        }
        System.out.println("不及格的人数为"+(failed));
        return failed;
    }*/
    public static double average(int[] a) {
        int sum = 0;
        double average;
        int length = ArrayUtils.getLength(a);
        for (int i = 0; i < length; i++) {
            sum += a[i];
        }
        average = sum/length;
        System.out.println("平均分为" + (average) );
        return average;
    }

    public static int full_marks(int[] a)
    {
        System.out.println("存在100分的同学吗？");
        if(ArrayUtils.contains(a,100))
        {
            System.out.println("存在100分的同学");
            return 1;
        }
        else
        {
            System.out.println("不存在100分的同学");
            return 0;
        }
    }

    public static boolean sort_output(int[] a)
    {
        Arrays.sort(a);
        if(ArrayUtils.getLength(a) == 0)
        {
            return false;
        }
        System.out.println("全部分数的排序为:");
        for (int j = a.length - 1; j >= 0; j--) {
            System.out.print(a[j] + ",");
        }
        return true;
    }
}
