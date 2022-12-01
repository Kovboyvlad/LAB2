import java.util.Scanner;
import java.util.regex.Pattern;

public class lab2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        boolean i = false;
        System.out.print("Введите пароль содержащий 8 или более символов \n" +
                "Cимволом может быть цифра, английская буква, знак подчеркивания \n" +
                "Пароль должен содержать хотя бы одну заглавную букву, одну маленькую букву и одну цифру \n" +
                "Ввод: ");
        while (i==false) {
            String password = scan.nextLine();
            if (((Pattern.compile("{8,}").matcher(password).find())==true) || ((Pattern.compile("[0-9]+").matcher(password).find())==true) || ((Pattern.compile("[a-z]{1,}").matcher(password).find())==true)); {
                if (((Pattern.compile("[A-Z]+").matcher(password).find())==true)|| ((Pattern.compile("[W]+}").matcher(password).find())==true)){
                    if ( (((Pattern.compile("[А-Я]{0}").matcher(password).find())==true)|| ((Pattern.compile("[а-я]{0}").matcher(password).find())==true)))
                    i = true;
                    System.out.println("Пароль надежен");
                }
            }
            if (i==false) {
                System.out.print("Пароль ненадежен. Повторите ввод \n" + "Ввод: " );
            }
        }



    }
}

