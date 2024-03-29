public class Main {
    public static void main(String[] args) {
        int Popoln = 1250;
          System.out.println("Пополнение:");
          System.out.println(Popoln);
        int NaSchetu = 200;
          System.out.println("На счете:");
          System.out.println(NaSchetu);

        int Bonus;
        int All;
        if (Popoln >= 1000) {
            Bonus = Popoln / 100;
            All = Popoln + NaSchetu + Bonus;
              System.out.println("Бонус:");
              System.out.println(Bonus);
              System.out.println("Всего:");
              System.out.println(All);
        } else {

            System.out.println("Бонус:");
            System.out.println("0");
            All = Popoln + NaSchetu;
              System.out.println("Всего:");
              System.out.println(All);

        }

    }
}