public class Main {
    public static void main(String[] args) {
    }

    static {
        int[] random = new int[30];
        float sum = 0;
        for (int i = 0; i < random.length; i++) {
            random[i] = (int) Math.round((Math.random() * 100_000) + 100_000);
            sum += random[i];
//            System.out.print(random[i] + " ");
        }
        int max = -1;
        int min = 200_001;
        for (int i = 0; i < random.length; i++) {
            if (random[i] > max) {
                max = random[i];
            } else if (random[i] < min) {
                min = random[i];
            }
        }
        float mean = sum / random.length;
        System.out.println();
        System.out.println();
        System.out.print("Сумма трат за месяц составила " + sum + " рублей. ");
        System.out.println();
        System.out.println();
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей.");
        System.out.println();
        System.out.print("Минимальная сумма трат за день составила " + min + " рублей.");
        System.out.println();
        System.out.println();
        System.out.print("Средняя сумма трат за месяц составила " + mean + " рублей.");
        System.out.println();
        System.out.println();

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int last = reverseFullName.length - 1;
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}
