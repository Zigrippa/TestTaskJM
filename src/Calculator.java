
public class Calculator {

    public int calc(int num1, int num2, char operation) throws InputException {
        int result = 0;
        if((num1 < 0 || num1 >= 10) && (num2 < 0 || num2 >= 10)) throw new InputException();

            if (operation == '\u002B') {
                result = num1 + num2;
            } else if (operation == '\u002D') {
                result = num1 - num2;
            } else if (operation == '\u002A') {
                result = num1 * num2;
            } else if (operation == '\u002F') {
                result = num1 / num2;
            }

        return result;
    }
}
