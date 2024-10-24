public class Main {
    public static void main(String[] args) {
        System.out.println("task 1");
        int[] arrPayments = {20, 30, 10, 40, 50};
        int sum = 0;
        for (int element : arrPayments) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println();

        System.out.println("task 2");
        int minPayments = arrPayments[0];
        int maxPayments = arrPayments[0];
        for (int element : arrPayments) {
            if (element < minPayments) {
                minPayments = element;
            }
            if (element > maxPayments) {
                maxPayments = element;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minPayments +
                " рублей. Максимальная сумма трат за неделю составила " + maxPayments + " рублей");
        System.out.println();

        System.out.println("task 3");
        double average;
        average = (double) sum / arrPayments.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");
        System.out.println();

        System.out.println("task 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();



    }
}