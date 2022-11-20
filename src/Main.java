public class Main {
    public static void main(String[] args) {

        SalesManager salesManager = new SalesManager(new long[] {1, 2, 200, 0});
        System.out.println(salesManager.max());
        System.out.println(salesManager.getAverageSale());
      }
    }
