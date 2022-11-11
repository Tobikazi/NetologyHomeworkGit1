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
}