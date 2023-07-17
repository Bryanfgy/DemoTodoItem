package com.example.demotodoitem;

import java.util.Calendar;

public class ToDoItem {

    private String title;
    private Calendar date;

    public ToDoItem(String title, Calendar date) {
        this.title = title;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public String toString() {
        String str = date.get(Calendar.DAY_OF_MONTH)+"/"+date.get(Calendar.MONTH)
                +"/"+date.get(Calendar.YEAR) + " (" + getDay(date.get(Calendar.DAY_OF_WEEK)) + ")";

        return str;
    }

    private String getDay(int day) {
        String weekday = "";
//        switch (weekday){
//            case 1:
//
//        }
        if(day == Calendar.MONDAY){
           weekday = "Monday";
        } else if (day == Calendar.TUESDAY) {
            weekday = "Tuesday";
        } else if (day == Calendar.WEDNESDAY) {
            weekday = "Wednesday";
        } else if (day == Calendar.THURSDAY) {
            weekday = "Thursday";
        } else if (day == Calendar.FRIDAY) {
            weekday = "Friday";
        } else if (day == Calendar.SATURDAY) {
            weekday = "Saturday";
        } else if (day == Calendar.SUNDAY) {
            weekday = "Sunday";
        }

        return weekday;
    }
}
