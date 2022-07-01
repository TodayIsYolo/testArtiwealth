package domain;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public class testAnswer {
    private int[] result1A;
    private int[] result1B;
    private int[] result1C;
    private int[][] result1D;
    private int result2;

    public int[] getResult1A() {
        return result1A;
    }

    public int[] getResult1B() {
        return result1B;
    }

    public int[] getResult1C() {
        return result1C;
    }

    public int[][] getResult1D() {
        return result1D;
    }

    public int getResult2() {
        return result2;
    }

    public void setResult1A(int[] result1A) {
        this.result1A = result1A;
    }

    public void setResult1B(int[] result1B) {
        this.result1B = result1B;
    }

    public void setResult1C(int[] result1C) {
        this.result1C = result1C;
    }

    public void setResult1D(int[][] result1D) {
        this.result1D = result1D;
    }

    public void setResult2(int result2) {
        this.result2 = result2;
    }

    public testAnswer(int[] A, int[] B, int[] C, int[][] D, int E ){
        this.result1A=A;
        this.result1B=B;
        this.result1C=C;
        this.result1D=D;
        this.result2=E;

    }

}
