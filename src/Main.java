public class Main {
    public static void main(String[] args) {

        System.out.println("Task 1");
        int[] amountOfPayment = new int[5];
        amountOfPayment[0] = 12000;
        amountOfPayment[1] = 7000;
        amountOfPayment[2] = 9000;
        amountOfPayment[3] = 16000;
        amountOfPayment[4] = 500;

        int sum = 0;
        for (int index = 0; index < amountOfPayment.length; index++) {
            sum = sum + amountOfPayment[index];
        }
        System.out.println(sum);

        System.out.println("Task 2");
        int maxPayment = 0;
        int minPayment = 100_000;
        for (int i = 0; i < amountOfPayment.length; i++) {
            if (amountOfPayment[i] > maxPayment) {
                maxPayment = amountOfPayment[i];
            }
            if (amountOfPayment[i] < minPayment) {
                minPayment = amountOfPayment[i];
            }
        }
        System.out.println("«Минимальная сумма трат за неделю составила " + minPayment + " рублей." +
                "Максимальная сумма трат за неделю составила " + maxPayment + " рублей».");

        System.out.println("Task 3");
        int[] salary = new int[5];
        salary[0] = 120_000;
        salary[1] = 210_000;
        salary[2] = 90_000;
        salary[3] = 150_000;
        salary[4] = 300_000;
        int sumSalary = 0;
        for (int i = 0; i < salary.length; i++) {
            sumSalary = sumSalary + salary[i];
        }
        float average = sumSalary / salary.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");

        System.out.println("Task 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            int leftIndex = i;
            int rightIndex = reverseFullName.length - i - 1;

            char temp = reverseFullName[leftIndex];
            reverseFullName[leftIndex] = reverseFullName[rightIndex];
            reverseFullName[rightIndex] = temp;
        }
        for (int i = 0; i < reverseFullName.length; i++) {
            System.out.print(reverseFullName[i]);
        }
    }
}