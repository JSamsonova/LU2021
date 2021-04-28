import java.util.Random;

public class MyRandom3 {

    public static void main(String[] args) {
        Random randomNumber = new Random();
        int numberFromRandom1 = randomNumber.nextInt(100) + 1;
        int numberFromRandom2 = randomNumber.nextInt(100) + 1;
        int numberFromRandom3 = randomNumber.nextInt(100) + 1;

        System.out.println(numberFromRandom1);
        System.out.println(numberFromRandom2);
        System.out.println(numberFromRandom3);

    }

}
