package com.qfguo.study.day18;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ClassName MyCalculator
 * @Description TODO
 * @Author gqfeng
 * @Date 2020/11/6
 **/
public class MyCalculator {
    public double compute(String expression) {
        int start = -1;
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '(') {
                start = i;
            }
            if (expression.charAt(i) == ')') {
                // 递归来简化问题
                String flatExp = expression.substring(start + 1, i);
                double result = computeFlatExp(flatExp);
                StringBuilder sb = new StringBuilder();
                if (start > 0) {
                    sb.append(expression.substring(0, start));
                }
                sb.append(String.valueOf(result));
                if (i < expression.length() - 1) {
                    sb.append(expression.substring(i + 1));
                }
                return compute(sb.toString());
            }
        }

        // 计算加减乘除
        return computeFlatExp(expression);
    }


    /**
     * 计算加减乘除，不含括号
     *
     * @param flatExp
     * @return
     */
    private double computeFlatExp(String flatExp) {
        // 先递归计算所有乘法和除法
        Pattern pattern = Pattern.compile("(?<num1>[\\d\\.]+)\\s*(?<operator>[\\*/])\\s*?(?<num2>[\\d\\.]+)");
        Matcher matcher = pattern.matcher(flatExp);
        while (matcher.find()) {
            double num1 = Double.parseDouble(matcher.group("num1"));
            double num2 = Double.parseDouble(matcher.group("num2"));
            String operator = matcher.group("operator");
            double result = operator.contains("*") ? num1 * num2 : num1 / num2;
            flatExp = flatExp.replace(matcher.group(0), String.valueOf(result));
            matcher = pattern.matcher(flatExp);
        }

        // 再递归计算所有加法和减法
        pattern = Pattern.compile("(?<num1>[\\d\\.]+)\\s*(?<operator>[\\+\\-])\\s*?(?<num2>[\\d\\.]+)");
        matcher = pattern.matcher(flatExp);
        while (matcher.find()) {
            Double num1 = Double.parseDouble(matcher.group("num1"));
            Double num2 = Double.parseDouble(matcher.group("num2"));
            String operator = matcher.group("operator");
            double result = operator.contains("+") ? num1 + num2 : num1 - num2;
            flatExp = flatExp.replace(matcher.group(0), String.valueOf(result));
            matcher = pattern.matcher(flatExp);
        }

        return Double.parseDouble(flatExp.trim());
    }



    public static void main(String[] args) {
        MyCalculator cal = new MyCalculator();
        double result = cal.compute("(2 + 1) + 200 * 3.2 / (5 * (2 + 6 ))");
    }
}

