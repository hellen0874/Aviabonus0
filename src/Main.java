public class Main {
    public static void main(String[] args) {

        int prise = 5000; // Стоимость билета
        int roublesPerMile = 20; // кол-во рублей на бонусную милю
        int bonusMiles = prise / roublesPerMile;

        System.out.println("Бонус равен " + bonusMiles);
    }
}
