// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bmi = service.calculate(50, 1.7);
        int roundBmi = (int) (bmi + 0.5);
        System.out.println(roundBmi);
    }
}
