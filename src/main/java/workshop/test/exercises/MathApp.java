package workshop.test.exercises;

import service.MathService;

public class MathApp {
    private MathService mathField;

    public void setMathField(MathService mathField) {
        this.mathField = mathField;
    }

    public int multiplyBy(int a, int b) {
       return  mathField.multiply(a,b);
    }
}
