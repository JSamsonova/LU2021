public class LoopsDemo {

    public static void main(String[] args) {

        int indexWhile = 0;

        while (indexWhile < 5) {
            System.out.println("IndexWhile vertiba " + indexWhile);
            indexWhile++; //indexWhile = indexWhile + 1;
        }

        int indexDoWhile = 0;
        do {
            System.out.println("IndexDoWhile vertiba " + indexDoWhile);
            indexDoWhile++;
        } while (indexDoWhile < 5);

    }
}
