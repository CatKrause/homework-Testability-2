public class BmiService {
    public double calculate(double weight, double height) {
        //  ИМТ= вес (кг) / рост (м)2.
        double heightSquare = height * height; // рост в квадрате
        double bmi = weight / heightSquare; // формула расчета
        return bmi;
    }
}
