package com.duguyuan;

public class ExamResult {

    public static final String PASS = "通过一本录取分数线";
    public static final String NO_PASS = "未通过一本录取分数线";

    public static void main(String[] args) {
        int yourGrade = 369;
        int borderline = 451;
        String result = yourGrade >= borderline ? PASS : NO_PASS;
        System.out.println("您的高考总分：" + yourGrade);
        System.out.println("第一批本科录取分数线：" + borderline);
        System.out.println("高考结果：" + result);
    }
}
