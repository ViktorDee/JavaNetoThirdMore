public class BmiService {
    public float calculate(float BMI) {
        float h = 1.85F;
        double height = Math.pow(h, 2);
        return (float) (BMI / height);
    }
}
