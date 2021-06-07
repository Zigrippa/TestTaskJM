public class RomanConverter {

    public boolean doesItRomanNumber(String partExpression) {
        boolean result;
        if (partExpression.contains("I") || partExpression.contains("V") || partExpression.contains("X")) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public int fromRomanToArab(String romanNum) {
        int result = 0;
        switch (romanNum) {
            case "I":
                result = 1;
                break;
            case "II":
                result = 2;
                break;
            case "III":
                result = 3;
                break;
            case "IV":
                result = 4;
                break;
            case "V":
                result = 5;
                break;
            case "VI":
                result = 6;
                break;
            case "VII":
                result = 7;
                break;
            case "VIII":
                result = 8;
                break;
            case "IX":
                result = 9;
                break;
            case "X":
                result = 10;
                break;
        }
        return result;
    }

    public String fromArabToRoman(int arabNum) {
        String result = "";
        while (arabNum >= 100) {
            result += "C";
            arabNum -= 100;
        }
        while (arabNum >= 90) {
            result += "XC";
            arabNum -= 90;
        }
        while (arabNum >= 50) {
            result += "L";
            arabNum -= 50;
        }
        while (arabNum >= 40) {
            result += "XL";
            arabNum -= 40;
        }
        while (arabNum >= 10) {
            result += "X";
            arabNum -= 10;
        }
        while (arabNum >= 9) {
            result += "IX";
            arabNum -= 9;
        }
        while (arabNum >= 5) {
            result += "V";
            arabNum -= 5;
        }
        while (arabNum >= 4) {
            result += "IV";
            arabNum -= 4;
        }
        while (arabNum >= 1) {
            result += "I";
            arabNum -= 1;
        }
        return result;
    }
}
