public class SalesManager {
    protected static long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public static int max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return (int) max;
    }
}