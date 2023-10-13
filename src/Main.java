public class Main {
    public static void main(String[] args) {
        int balance = 1000;
        int sum = 1200;
        int bonus = 0;
        if (sum > 1000) {
            bonus = sum / 100;
        }
        balance = balance + sum + bonus;
        System.out.println("Баланс: " + balance);
        System.out.println("Бонусы: " + bonus);
    }
}
