public class IntoParter {


    public String[] intoPart(String expression) {
        String[] partExpression;
        partExpression = expression.split(" ");
        return partExpression;
    }

    public String getRoman1(String[] partExpression) {
        return partExpression[0];
    }

    public String getRoman2(String[] partExpression) {
        return partExpression[2];
    }

    public int getNum1(String[] partExpression) {
        return Integer.parseInt(partExpression[0]);
    }

    public int getNum2(String[] partExpression) {
        return Integer.parseInt(partExpression[2]);
    }

    public char getOperation(String[] partExpression) {
        return partExpression[1].charAt(0);
    }


}
