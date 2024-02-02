//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int amount = 13676;         // Объявляете переменные для входных данных и
        int mil = 20;               // параметров программы: одну для хранения
        // стоимости билета, другую для хранения количества
        // рублей для одной бонусной мили

        int bonus = amount / mil;   // Рассчитываете количество бонусных миль, используя
        System.out.println("Вам начислено " + bonus + " бонус(ов)");// значения заведённых переменных. Ответ сохраняете в
        // новую переменную и выводите на экран
    }
}