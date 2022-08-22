public class Main {
    public static void main(String[] args) {
        int check = 100;
        int replenishment_amount = 1001;
        if (replenishment_amount > 1000) {
            System.out.println(replenishment_amount / 100 + replenishment_amount + check);
        } else {
            System.out.println(replenishment_amount + check);
        }
    }
}
