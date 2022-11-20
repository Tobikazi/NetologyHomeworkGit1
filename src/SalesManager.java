public class SalesManager {
    protected static int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public static int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public static int min() {
        int min = Integer.MAX_VALUE;
        for (int sale : sales) {
            if (min > sale) {
                min = sale;
            }
        }
        return min;
    }

    public static int getAverageSale() {
        int sum = 0;
        for ( int sale : sales) {
            sum += sale;
        }
        return (sum - min() - max()) / (sales.length - 2);
    }
}