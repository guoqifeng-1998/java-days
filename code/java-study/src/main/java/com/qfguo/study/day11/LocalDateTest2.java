package com.qfguo.study.day11;

import com.qfguo.study.day10.LocalDateTest;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.security.PublicKey;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * @ClassName LocalDateTest2
 * @Description TODO
 * @Author gqfeng
 * @Date 2020/11/2
 **/
public class LocalDateTest2 {
    /**
     * 获取当前日期
     */
    public static void getCurrentTime(){
        LocalTime time = LocalTime.now();
        System.out.println("local time now:" + time);
    }
    /**
     * 增加小时
     */
    public static void plusHours(){
        LocalTime time = LocalTime.now();
        //增加两个小时
        LocalTime newTime = time.plusHours(2);
        System.out.println("Time after 2 hour:"+newTime);
    }
    /**
     * 如何计算一周后的日期
     */
    public static void netweek(){
        LocalDate today = LocalDate.now();
        //使用变量赋值
        LocalDate nextWeek = today.plus(1 , ChronoUnit.WEEKS);
        System.out.println("Today is:" + today);
        System.out.println("Date after 1 week:" + nextWeek);
    }
    /**
     * ji算一年前或姨奶奶后的日期
     */
    public static void minusDate(){}
        /**
         * 时钟类
         */
        public static void  Clock(){
            Clock clock =Clock.systemUTC();
            System.out.println("clock:" +clock);
        Clock defaultClock = Clock.systemDefaultZone();
            System.out.println("Clock:" + clock);
        }
        /**
         * 使用YearMonth 类处理锑锭的日期
         */
     public static void checkCardExpiry(){
         YearMonth currentYearMonth = YearMonth.now();
         System.out.printf("Days is month year %s: %d%n",currentYearMonth,currentYearMonth.lengthOfMonth());
         YearMonth creditCardExpiry = YearMonth.of(2020, Month.FEBRUARY);
         System.out.printf("Your credit card expires on %s %n",creditCardExpiry);
     }
    /**
     * 检查闰年
     */
    public static void isLeapYear(){
        LocalDate today = LocalDate.now();
        if (today.isLeapYear()){
            System.out.println("This year is Leap Year");
        } else {
            System.out.println("2018 is not a Leap Year");
        }
    }
    /**
     * 如何用java判断日期是早于还是万余另一个日期
     */
    public static void isBeforeorIsAfter(){
        LocalDate today = LocalDate.now();
        LocalDate tomorrow = LocalDate.of(2018,1,29);
        if (tomorrow.isAfter(today)){
            System.out.println("Tomorrow comes after today");
        }
        LocalDate yesterday = today.minus(1,ChronoUnit.DAYS);
        if (yesterday.isBefore(today)){
            System.out.println("yesterday is day before today");
        }
    }
    /**
     * 获取特定时区下面的时间
     */
    public static void getZoneTime(){
        ZoneId americe = ZoneId.of("America/New_York");
        LocalDateTime localDateAndTime = LocalDateTime.now();
        ZonedDateTime dateAndTimeInNewYork = ZonedDateTime.of(localDateAndTime, americe);
        System.out.println("现在的日期和时间在特定的时区" + dateAndTimeInNewYork);
    }
    public static void calcDateDays(){
        LocalDate today =LocalDate.now();
        LocalDate java8ReLease = LocalDate.of(2018,Month.MAY,14);
        Period periodToNextJavaReLease = Period.between(today, java8ReLease);
        System.out.println("Month left between today and java 8 release" + periodToNextJavaReLease.getMonths());
    }
    public static void formatDate(){
        String dayAfterTomorrow = "20180210";
        LocalDate formatted = LocalDate.parse(dayAfterTomorrow, DateTimeFormatter.BASIC_ISO_DATE);
        System.out.printf("Date generated form string %s is %s %n",dayAfterTomorrow,formatted);
    }

    public static void main(String[] args) {
        getCurrentTime();
        plusHours();
        netweek();
        minusDate();
        Clock();
        isBeforeorIsAfter();
        getZoneTime();
        checkCardExpiry();
        isBeforeorIsAfter();
        calcDateDays();
        formatDate();
    }




}
