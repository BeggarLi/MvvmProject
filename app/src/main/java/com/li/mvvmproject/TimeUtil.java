package com.li.mvvmproject;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import android.os.SystemClock;

public class TimeUtil {

  public static String getCurrentTime(){
    SimpleDateFormat sdfTwo =new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒E", Locale.getDefault());
    String time = sdfTwo.format(System.currentTimeMillis());
    return time;
  }
}
