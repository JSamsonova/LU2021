public class CarLauncher {

    public static void main(String[] args) {

        Car carMaingais = new Car ();

        carMaingais.setCarModel("Tesla Model M");
        carMaingais.setYear(2021);
        carMaingais.setNew(true);

        System.out.println(carMaingais.getCarModel());
        System.out.println(carMaingais.getYear());
        System.out.println(carMaingais.isNew());

    }
}
