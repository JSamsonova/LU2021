public class UzdevumsMetodes {

    public static void main(String[] args) {
        Bank bank = new Bank();

        System.out.println(bank.balance());
        bank.depositMoney(1000000);
    }
}
