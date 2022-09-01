public class Main {
    public static void main(String[] args) {
        int check = 100;
        int replenishmentAmount = 1100;
        if (replenishmentAmount > 1000) {
            int bonus = replenishmentAmount / 100;
            check = check + replenishmentAmount + bonus;
            System.out.println("Бонус равен " + bonus + " рублям, итоговая сумма на счету клиента - " + check + " рублей");
        } else {
            check = replenishmentAmount + check;
            System.out.println("Бонусов нет, итоговая сумма на счету клиента " + check + " рублей");
        }
    }
}
