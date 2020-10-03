package com.github.bioce.jackfruit.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author bioce
 */
public class DateUtils {

    public static final String DATE_FORMAT_DEFAULT = "yyyy-MM-dd HH:mm:ss";
    public static final String DATE_FORMAT_MMDD = "MM-dd";
    public static final String DATE_FORMAT_YYYYMM = "yyyy-MM";
    public static final String DATE_FORMAT_YYYYMMDD = "yyyy-MM-dd";
    public static final String DATE_FORMAT_YYYYMMDD_HHMM = "yyyy-MM-dd HH:mm";
    public static final String DATE_FORMAT_YYYYMMDD_HHMMSS_SSS = "yyyy-MM-dd HH:mm:ss.SSS";

    public static Date formatToDate(String date, String pattern) {
        try {
            if (StringUtils.isEmpty(date)) {
                throw new JackfruitException("date is empty: " + date);
            }
            SimpleDateFormat format = new SimpleDateFormat(pattern);
            return new Date(format.parse(date).getTime());
        } catch (ParseException e) {
            throw new JackfruitException(e);
        }
    }

    public static String format(Date date, String pattern) {
        return new SimpleDateFormat(pattern).format(date);
    }

}
