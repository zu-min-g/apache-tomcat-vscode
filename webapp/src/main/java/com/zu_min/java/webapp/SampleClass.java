package com.zu_min.java.webapp;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.http.HttpServletRequest;

public class SampleClass {

    /**
     * 現在日時を出力する。
     * @return
     */
    public String now(HttpServletRequest request) {
        ZonedDateTime date = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        String textDate = date.format(formatter);
        return textDate;
    }
}
