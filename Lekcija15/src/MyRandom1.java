import java.util.Random;

public class MyRandom1 {
    public static void main(String[] args) {
        Random randomNumber = new Random();
        int numberFromRandom = randomNumber.nextInt(100) + 1;

        System.out.println(numberFromRandom);

    }


}
