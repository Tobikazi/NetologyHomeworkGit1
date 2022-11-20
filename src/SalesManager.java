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

    public static int min() {
        long min = Long.MAX_VALUE;
        for (long sale : sales) {
            if (min > sale) {
                min = sale;
            }
        }
        return (int) min;
    }

    public static int getAverageSale() {
        int sum = 0;
        for ( long sale : sales) {
            sum += sale;
        }
        return (sum - min() - max()) / (sales.length - 2);
    }
}