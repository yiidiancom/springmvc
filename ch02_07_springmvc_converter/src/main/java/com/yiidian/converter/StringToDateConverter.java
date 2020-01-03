package com.yiidian.converter;
import org.springframework.core.convert.converter.Converter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * 字符串转换日期类型转换器
 * 一点教程网 - www.yiidian.com
 */
public class StringToDateConverter implements Converter<String,Date>{
    @Override
    public Date convert(String source) {
        Date date = null;
        try {
            //使用SimpleDateFormat对页面字符串日期转换为java.util.Date类型
            date = new SimpleDateFormat("yyyy-MM-dd").parse(source);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}
