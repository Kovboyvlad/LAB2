import java.util.Scanner;
import java.util.regex.Pattern;

public class lab1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String pattern1 = "[0-3]\\d/[0-1]\\d/[2]\\d\\d\\d";
        String pattern2 = "[0-3]\\d[^/][0-1]\\d[^/]19\\d\\d";
        String pattern3 = "[0-3]\\d[^/][0-1]\\d[^/]\\d\\d\\d\\d";
        boolean i1,i2,i3;
        System.out.print("Введите дату в формате dd/mm/yyyy (1900-9999): ");
        String s = scan.nextLine();
        i1 = Pattern.compile(pattern1).matcher(s).find();
        i2 = Pattern.compile(pattern2).matcher(s).find();
        i3 = Pattern.compile(pattern3).matcher(s).find();
        if(i1==true || i2==true){
            System.out.print("Введеное выражение ялвяется датой");
        } else if (i3 == true){
            System.out.print("Введеное выражение не соответсвует заданному формату даты dd/mm/yyyy");
        } else {
            System.out.print("Введенное выражение не является датой");
        }
    }
}
