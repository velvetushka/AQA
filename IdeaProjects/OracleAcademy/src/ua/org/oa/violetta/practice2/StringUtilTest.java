package ua.org.oa.violetta.practice2;

public class StringUtilTest {
    public static void main(String[] args) {
        System.out.println("----test 5 task----");
        String s =  "bob is bob";
        char symbol = 'b';
        int result = stringUtil.calculateCharAsteriskChar(s, symbol);
        System.out.println("In string \"" + s + "\" combination \"" + symbol + "*" + symbol + "\"  appears "
                + result + "times");
        System.out.println("----test 1 task----");
        stringUtil.deleteTheFirstChar("В лесу родилась елочка,", "В лесу она росла");
        System.out.println("----test 2 task-----");
        stringUtil.createStringOfThreeChars("Candy");
        System.out.println("-----test 3 task-----");
        stringUtil.transferThelastTwoSymbols("abcdef");
        stringUtil.duplicateEveryChars("candy");
        System.out.println(stringUtil.deleteTwoCharsNear("th*is is sum*mer"));
        System.out.println(stringUtil.calculateWordsWithAAndS("is the sous dadas"));
        System.out.println(stringUtil.deleteAllDuplicates("summer, this is summer ola plomber", "er"));
    }
}
