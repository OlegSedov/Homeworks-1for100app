public class Main {
    public static void main(String[] args) {
        // Создаем переменную с текущим остатком на счете клиента
        int balance = 460;

        // Создаем переменную с суммой пополнения
        int replenishmentAmount = 1_200;

        // Создаем переменную с бонусом
        double bonus = replenishmentAmount * 0.01;

        // Создаем переменную с конечным остатком на счете (остатком после пополнения) без бонуса
        int finalBalance = balance + replenishmentAmount;

        // Создаем переменную с конечным остатком (остатком после пополнения) с бонусом
        double finalBalanceWithBonus = balance + replenishmentAmount + bonus;

        // Создаем условия
        if (replenishmentAmount > 1000){
            System.out.println(finalBalanceWithBonus);
        } else {
            System.out.println(finalBalance);
        }
    }
}