public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        float h = 1.85F;
        int bodyMass = 73;
        double height = Math.pow(h, 2);
        float bmiIndex = service.calculate(bodyMass, (float) height);
        System.out.println(bmiIndex + " - Ваш Индекс Массы Тела.");
    }
}