package juc;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test {

    public static void main(String[] args) throws ParseException {
        try{
            int a=Integer.parseInt("D");
        }catch (NumberFormatException e){
            System.out.println("6");
        }

    }
}
