import java.util.Scanner;


public class Artikyill {
    public static void main(String[] args) {
        int year;
        Scanner inp=new Scanner(System.in);
        System.out.print("Bir yil giriniz: ");
        year=inp.nextInt();
        if (year%4==0 && year%100!=0){
            System.out.println(year+" Bir Artik Yildir");
        }else if (year%100==0 && year%400==0){
            System.out.println(year+" Bir Artik Yildir");
        }else  {
            System.out.println(year+" Bir Artik Yil Degildir");
        }
    }
}
