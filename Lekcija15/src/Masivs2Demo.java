public class Masivs2Demo {

    public static void main(String[] args) {
        String[] masivsArStringu = new String[5];

        masivsArStringu[0] = "A";
        masivsArStringu[2] = "B";
        masivsArStringu[3] = "C";
        masivsArStringu[4] = "D";

        for (int i = 0; i < masivsArStringu.length; i++) {
            System.out.println("Indeks ir " + i + " Masiva vertiba ir " + masivsArStringu[i]);
        }
    }
}