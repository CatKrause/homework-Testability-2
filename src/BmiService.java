public class BmiService {
    public double calculate(double m, double h) {
        //  ИМТ= вес (кг) / рост (м)2.
        double weight = m; // масса в кг
        double height = h; // рост в см
        double heightSquare = h * h; // рост в квадрате
        double bmi = weight / heightSquare; // формула расчета
        int index = 0;
        return bmi;
    }
}
