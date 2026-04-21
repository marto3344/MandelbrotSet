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

    public int    width    = DEFAULT_WIDTH;
    public int    height   = DEFAULT_HEIGHT;
    public double reMin    = DEFAULT_RE_MIN;
    public double reMax    = DEFAULT_RE_MAX;
    public double imMin    = DEFAULT_IM_MIN;
    public double imMax    = DEFAULT_IM_MAX;
    public int    threads  = DEFAULT_THREADS;
    public int    maxIter  = DEFAULT_MAX_ITER;
    public String output   = DEFAULT_OUTPUT;
    public boolean quiet   = false;
    public boolean dynamic = false;

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




