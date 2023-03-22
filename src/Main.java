public class Main {
    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new long[] {200, 2, 4, 20,});
        long max = salesManager.max();
        System.out.println(max);

        int min = salesManager.min();
        System.out.println(min);

        int average = salesManager.average();
        System.out.println(average);
    }
}