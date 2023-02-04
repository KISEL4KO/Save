public class Main {
    static int house = 2500000; // price house
    static int account  = 10000;// balance
    static int salary = 100000; // salary in month

    static int count = 0;

    public static void main(String[] args) {

        while ( house > account) {
           account =account +salary;

            count++; // count = count + 1; count += 1;

        }

        System.out.println("Потребовалось " + count + " месяцев");

    }
}
