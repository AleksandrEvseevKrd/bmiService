public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        int weightKg = 115;
        double heightM = 1.90;
        int bmi = service.calculate(weightKg, heightM);
        System.out.println("Индекс массы тела: " + bmi);
        }
    }