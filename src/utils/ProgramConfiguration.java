package utils;

public class ProgramConfiguration {

    private static final int    DEFAULT_WIDTH    = 640;
    private static final int    DEFAULT_HEIGHT   = 480;
    private static final double DEFAULT_RE_MIN   = -2.0;
    private static final double DEFAULT_RE_MAX   =  2.0;
    private static final double DEFAULT_IM_MIN   = -2.0;
    private static final double DEFAULT_IM_MAX   =  2.0;
    private static final int    DEFAULT_THREADS  = 1;
    private static final int    DEFAULT_MAX_ITER = 1000;
    private static final String DEFAULT_OUTPUT   = "mandelbrot.png";

    private int    width    = DEFAULT_WIDTH;
    private int    height   = DEFAULT_HEIGHT;
    private double reMin    = DEFAULT_RE_MIN;
    private double reMax    = DEFAULT_RE_MAX;
    private double imMin    = DEFAULT_IM_MIN;
    private double imMax    = DEFAULT_IM_MAX;
    private int    threads  = DEFAULT_THREADS;
    private int    maxIter  = DEFAULT_MAX_ITER;
    private String output   = DEFAULT_OUTPUT;
    private boolean quiet   = false;
    private boolean dynamic = false;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    public double getReMax() {
        return reMax;
    }

    public void setReMax(double reMax) {
        this.reMax = reMax;
    }

    public double getReMin() {
        return reMin;
    }

    public void setReMin(double reMin) {
        this.reMin = reMin;
    }

    public double getImMin() {
        return imMin;
    }

    public void setImMin(double imMin) {
        this.imMin = imMin;
    }

    public double getImMax() {
        return imMax;
    }

    public void setImMax(double imMax) {
        this.imMax = imMax;
    }

    public int getThreads() {
        return threads;
    }

    public void setThreads(int threads) {
        this.threads = threads;
    }

    public int getMaxIter() {
        return maxIter;
    }

    public void setMaxIter(int maxIter) {
        this.maxIter = maxIter;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public boolean isQuiet() {
        return quiet;
    }

    public void setQuiet(boolean quiet) {
        this.quiet = quiet;
    }

    public boolean isDynamic() {
        return dynamic;
    }

    public void setDynamic(boolean dynamic) {
        this.dynamic = dynamic;
    }
    @Override
    public String toString() {
        return String.format(
                "Config { size=%dx%d, rect=[%.2f:%.2f:%.2f:%.2f], " +
                        "threads=%d, maxIter=%d, output='%s', quiet=%b, dynamic=%b }",
                width, height, reMin, reMax, imMin, imMax,
                threads, maxIter, output, quiet, dynamic
        );
    }
}