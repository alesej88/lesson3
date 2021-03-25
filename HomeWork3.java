import java.util.Random;
import java.util.Scanner;

public class HomeWork3 {
    static Scanner scanner = new Scanner(System.in);
 static Random random = new Random();

    public static void main(String[] args) {
        int x = randomNumber();
        System.out.println(x);

//        int x = randomNumber();
//        System.out.println(x);

    }

    private static int randomNumber() {
        System.out.println("Введите число от 0 до 9: ");
        int x = random.nextInt(9);
        int a;
        a = scanner.nextInt();
        int counter;
        counter = 3;
        if (x == a ) {
            System.out.println("Вы Угадали!");
        }else if(x > a){
            System.out.println("Число меньше, чем загаданное!");
        }else {
            System.out.println("Число больше, чем загаданное");
        }
        counter--;
        if (counter == 0){
            System.out.println("GAME OVER!!!!");
            counter = 0;
        }
        return x;
              }
}












