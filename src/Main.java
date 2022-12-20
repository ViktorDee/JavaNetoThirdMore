public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int bodyMass = 73;
        float bmiIndex = service.calculate(bodyMass);
        System.out.println(bmiIndex + " - Ваш Индекс Массы Тела.");
    }
}