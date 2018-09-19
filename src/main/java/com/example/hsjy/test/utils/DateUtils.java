package com.example.hsjy.test.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * Created with Intellij IDEA.
 *
 * @author zhouhao
 * @version 2018/5/31 0031
 */
public class DateUtils {

    private static Logger log = LoggerFactory.getLogger(DateUtils.class);

    public static String timestampsConvertString(Long timestamp,String pattern,ZoneId zone){
        if(timestamp == null){
            timestamp = System.currentTimeMillis();
        }else if(timestamp.toString().length() == 10){
            timestamp = timestamp * 1000;
        }
        //Long 转 Date
        Date date = new Date(timestamp);
        //Date 转 Instant
        Instant instant =  date.toInstant();
        //格式要求设置
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(pattern);
        //通过LocalDateTime 转换 时区设置系统默认时区
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant,zone);
        //返回结果
        return dateTimeFormatter.format(localDateTime);
    }

    public static String timestampsConvertString(Long timestamp,String pattern){
        ZoneId zone = ZoneId.systemDefault();
        return timestampsConvertString(timestamp,pattern,zone);
    }

    public static String timestampsConvertString(Long timestamp){
        String pattern  = "yyyy-MM-dd HH:mm:ss";
        ZoneId zone = ZoneId.systemDefault();
        return timestampsConvertString(timestamp,pattern,zone);
    }

    public static Date timestampsConvertDate(Long timestamp){
        if(timestamp == null){
            timestamp = System.currentTimeMillis();
        }else if(timestamp.toString().length() == 10){
            timestamp = timestamp * 1000;
        }
        //Long 转 Date
        Date date = new Date(timestamp);
        return date;
    }

    public static Date stringConvertDate(String time){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try{
            return simpleDateFormat.parse(time);
        }catch (ParseException e){
            log.error(e.getMessage(),e);
        }
        return new Date();
    }

    /**
     * 将date类型转换为string
     * @param date
     * @return
     */
    public static String dateConvertString(Date date){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return simpleDateFormat.format(date);
    }

    /**
     * 将date类型的转换为时间戳
     * @param date
     * @return
     */
    public static long dateConvertTimestamps(Date date){
        long timestamps = date.getTime();
        Long lg = new Long(timestamps);
        if(lg.toString().length() == 10){
            return timestamps * 1000;
        }
        return timestamps;
    }

    public static void main(String[] args) {

    }
}
