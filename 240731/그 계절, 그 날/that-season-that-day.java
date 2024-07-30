import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();

        boolean check= year_check(year);

        weather(year,month,day,check);
    }
    public static boolean year_check(int n){
        if(n%4==0 && n%100!=0){
            return true;
        }
        else if(n%4==0 && n%100==0 && n%400==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void weather(int year,int month, int day, boolean check){
        if(month==1){
            if(day>=1 && day<=31){
                System.out.println("Winter");
            }
            else{
                System.out.println(-1);
            }
        }
        else if(month==2){
                if(day==29){
                    if(check){
                        System.out.println("Winter");
                    }
                }
                else if(day>=1 && day<=28){
                    System.out.println("Winter");
                }
                else{
                System.out.println(-1);
            }
        }
        else if(month==3){
            if(day>=1 && day<=31){
                System.out.println("Spring");
            }
            else{
                System.out.println(-1);
            }
        }
        else if(month==4){
            if(day>=1 && day<=30){
                System.out.println("Spring");
            }
            else{
                System.out.println(-1);
            }
        }
        else if(month==5){
            if(day>=1 && day<=31){
                System.out.println("Spring");
            }
            else{
                System.out.println(-1);
            }
        }
        else if(month==6){
            if(day>=1 && day<=30){
                System.out.println("Summer");
            }
            else{
                System.out.println(-1);
            }
        }
        else if(month==7){
            if(day>=1 && day<=31){
                System.out.println("Summer");
            }
            else{
                System.out.println(-1);
            }
        }
        else if(month==8){
            if(day>=1 && day<=31){
                System.out.println("Summer");
            }
            else{
                System.out.println(-1);
            }
        }
        else if(month==9){
            if(day>=1 && day<=30){
                System.out.println("Fall");
            }
            else{
                System.out.println(-1);
            }
        }
        else if(month==10){
            if(day>=1 && day<=31){
                System.out.println("Fall");
            }
            else{
                System.out.println(-1);
            }
        }
        else if(month==11){
            if(day>=1 && day<=30){
                System.out.println("Fall");
            }
            else{
                System.out.println(-1);
            }
        }
        else if(month==12){
            if(day>=1 && day<=31){
                System.out.println("Winter");
            }
            else{
                System.out.println(-1);
            }
        }
    }
}