package com.java11_17.features;

public class B_SwitchEnhancement {
    public static void main(String[] args) {
        //java 6 u can only use char or int long: switch
        //java 7: string can also be used
        //java 13+ to simply the syntex of switch case

        enum WeekDay {
            MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
        }

//        WeekDay day = WeekDay.TUESDAY;
//        switch (day) {
//            case MONDAY,WEDNESDAY,FRIDAY -> System.out.println("Let's meet!");
//
//            case TUESDAY,THURSDAY,SATURDAY -> System.out.println("no meeting!");
//
//            case SUNDAY-> System.out.println("Let's meet (although Sunday should be a free day, man!)!");
//
  //  this can also be implemented as
            int day = 9; // 1 for Monday, 2 for Tuesday, ..., 7 for Sunday
            switch (day) {
                case 1, 3, 5 -> System.out.println("Let's meet!");

                case 2, 4, 6 -> System.out.println("no meeting!");

                case 7 -> System.out.println("Let's meet (although Sunday should be a free day, man!)!");
             default -> System.out.println("We never gonna meet😄");
            }
        };


    }

