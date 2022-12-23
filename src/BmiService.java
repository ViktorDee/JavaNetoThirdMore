public class BmiService {
    public float calculate(int bodyMass, float height) {
        float bodyIndex = bodyMass / height;
        return bodyIndex;
    }
}
