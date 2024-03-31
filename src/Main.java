public class Main {
    public static void main(String[] args) {
        int deposit = 1255;
        System.out.println("Пополнение:");
        System.out.println(deposit);
        int onaccount = 200;
        System.out.println("На счете:");
        System.out.println(onaccount);

        int bonus;
        int all;
        if (deposit >= 1000) {
            bonus = deposit / 100;
            all = deposit + onaccount + bonus;
            System.out.println("Бонус:");
            System.out.println(bonus);
            System.out.println("Всего:");
            System.out.println(all);
        } else {

            System.out.println("Бонус:");
            System.out.println("0");
            all = deposit + onaccount;
            System.out.println("Всего:");
            System.out.println(all);

        }

    }
}