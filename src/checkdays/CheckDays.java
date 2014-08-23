/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package checkdays;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class CheckDays {

    public static boolean isLeapYear (int year){
        return (year%4 == 0) &&
                ((year%100 !=0||(year%4 == 0)));
    }
    
    public static int lastDayInMonth (int month, int year){
        int daysInMonth = 0;
        
        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = 31;
                break;
            case 2:
                daysInMonth = isLeapYear(year) ? 29 : 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = 30;
                break;
        }
        return daysInMonth;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter year (yyyy) : ");
        int year = sc.nextInt();
        
        System.out.print("Please enter month (mm) : ");
        int month = sc.nextInt();
        
        System.out.println("Year: " + year + "leap year?" + isLeapYear(year));
        
        System.out.println("There are " + lastDayInMonth(month,year) + "days in month : " + month);
    }
    
}
