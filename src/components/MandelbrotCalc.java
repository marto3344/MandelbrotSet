package components;

public class MandelbrotCalc {
    private final int maxIter;
    private final ComplexNumber min; // reMin + imMin*i
    private final ComplexNumber max;

    public MandelbrotCalc(int maxIter, ComplexNumber min, ComplexNumber max) {
        this.maxIter = maxIter;
        this.min = min;
        this.max = max;
    }

    public int iterate(double cRe, double cIm) {
        double zRe = 0;
        double zIm = 0;
        for (int n = 0; n < maxIter; n++) {
            if (zRe*zRe + zIm*zIm > 4) {
                return n;
            }
            zRe = zRe*zRe - zIm*zIm + cRe; //z(i) = z(i-1)^2 + c
            zIm = 2*zRe*zIm + cIm;
        }
        return maxIter;
    }

    public void compute(int startRow,
                        int endRow,
                        int startCol,
                        int endCol,
                        int[][] iterMap) {
        double reStep = (max.getRe() - min.getRe()) / iterMap[0].length;
        double imStep = (max.getIm() - min.getIm()) / iterMap.length;
        for (int i = startRow; i < endRow; i++) {
            double im = max.getIm() - i * imStep;
            for (int j = startCol; j < endCol; j++) {
                double re = min.getRe() + j * reStep;
                iterMap[i][j] = iterate(re, im);
            }
        }
    }
}
