package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        for (int i = 0; i < name.length(); i++) {
            int code = name.codePointAt(i);
            if (i == 0) {
                return isLowerLatinLetter(code);
            }
            return isSpecialSymbol(code) || isUpperLatinLetter(code) || isLowerLatinLetter(code);
        }
        return false;
    }

    public static boolean isSpecialSymbol(int code) {
                if (code == 36 || code == 95) {
                    return true;
                }
        return false;
    }

    public static boolean isUpperLatinLetter(int code) {
        if (code > 64 && code < 91) {
            return true;
        }
        return false;
    }

    public static boolean isLowerLatinLetter(int code) {
        if (code > 96 && code < 123) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        boolean a = isSpecialSymbol(36);
        System.out.println(a);
    }
}