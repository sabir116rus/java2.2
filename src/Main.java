public class Main {
    public static void main(String[] args) {
        int check = 100;
        int replenishment_amount = 1100;
        if (replenishment_amount > 1000) {
            int bonus = replenishment_amount / 100;
            check = check + replenishment_amount + bonus;
            System.out.println("Бонус равен " + bonus + " рублям, итоговая сумма на счету клиента - " + check + " рублей");
        } else {
            check = replenishment_amount + check;
            System.out.println("Бонусов нет, итоговая сумма на счету клиента " + check + " рублей");
        }
    }
}
