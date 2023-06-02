package com.junit;

public class SleepIn {
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        //if it's not the weekday, or it is vacation than return true
        if(!weekday || vacation) {
            return true;
        } else { //anything else should be returned as false
            return false;
        }
    }
}
