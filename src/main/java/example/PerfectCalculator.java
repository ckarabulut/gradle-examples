package example;

import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class PerfectCalculator {

    public double add(double a, double b) {
	return a + b;
    }

    public double multiply(double a, double b) {
	return a + b;
    }

    public double [][] multiplyMatrix(double[][] a, double[][] b) {
	RealMatrix m = MatrixUtils.createRealMatrix(a);
	RealMatrix n = new Array2DRowRealMatrix(b);
	RealMatrix p = m.multiply(n);
	return p.getData();
    }
}
