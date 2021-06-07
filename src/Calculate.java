
import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {

        System.out.print("Введите выражение: ");
        Scanner input = new Scanner(System.in);

        String expression = input.nextLine();

        IntoParter intoParter = new IntoParter();
        RomanConverter romanConverter = new RomanConverter();

        try {
            if (romanConverter.doesItRomanNumber(intoParter.getRoman1(intoParter.intoPart(expression))) &&
                    romanConverter.doesItRomanNumber(intoParter.getRoman2(intoParter.intoPart(expression)))) {
                int num1 = romanConverter.fromRomanToArab(intoParter.getRoman1(intoParter.intoPart(expression)));
                int num2 = romanConverter.fromRomanToArab(intoParter.getRoman2(intoParter.intoPart(expression)));
                char operation = intoParter.getOperation(intoParter.intoPart(expression));

                Calculator calculator = new Calculator();
                System.out.println(romanConverter.fromArabToRoman(calculator.calc(num1, num2, operation)));
            } else {
                int num1 = intoParter.getNum1(intoParter.intoPart(expression));
                int num2 = intoParter.getNum2(intoParter.intoPart(expression));
                char operation = intoParter.getOperation(intoParter.intoPart(expression));

                Calculator calculator = new Calculator();
                System.out.print("Результат: ");
                System.out.println(calculator.calc(num1, num2, operation));
            }
        } catch (Exception e) {
            System.out.println("Введено неверное выражение!");
        }

    }

}
