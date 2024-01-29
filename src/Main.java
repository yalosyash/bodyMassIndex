import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int weight = 98; // вес
        float height = 1.87f; // рост
        BmiService index = new BmiService();
        System.out.println(index.calculate(weight, height));
    }
}