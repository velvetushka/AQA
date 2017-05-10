package ua.org.oa.violetta.practice2;

public class stringUtil {
        public static void deleteTheFirstChar(String s1, String s2){

                String subs1 = s1.substring(1);
                String subs2 = s2.substring(1);
                String s = subs1.concat(subs2);
                System.out.println(s);

        }

public static void createStringOfThreeChars(String s) {
                if (s.length() > 3 && s.length()%2 == 1) {
                        int b = s.length()/2 - 1;
                        int c = s.length()/2 + 2;
                        String a = s.substring(b, c);
                    System.out.println(a);
                }else {
                        System.out.println("String should have more than 3 symbols and amount of symbols should be odd");
                }

        }
        public static void transferThelastTwoSymbols(String s) {

            int length = s.length();
            int indexOfTwoLast = length-2;
            String lastTwoChars = s.substring(indexOfTwoLast);
            String s1 = lastTwoChars.concat(s.substring(0,indexOfTwoLast));
            System.out.println(s1);
        }
        public static void duplicateEveryChars(String s){
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                sb.append(s.charAt(i)).append(s.charAt(i));
            }
            System.out.println(sb);
        }

        public static int calculateCharAsteriskChar(String s, char symbol) {
                int result = 0;
                for(int i = 0; i < s.length() - 2; i++) {
                       if (s.charAt(i) == symbol && s.charAt(i+2) == symbol){
                               result++;
                       }

                }
                return result;

        }
    public static String deleteTwoCharsNear(String s){
            StringBuilder buff = new StringBuilder();
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i+1) != '*') {
                buff.append(s.charAt(i));
            } else {
                i+= 2;
            }
        }
        buff.append(s.charAt(s.length() -1 ));
            return buff.toString();


    }

    public static int  calculateWordsWithAAndS(String s){
        char symbol1 = 'a';
        char symbol2 = 's';
        int count = 0;
        String str = s.toLowerCase();
                for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i+1) == ' ') {
                if (s.charAt(i) == symbol1 || s.charAt(i) == symbol2 ||
                        s.charAt((s.length()-1))== symbol1 || s.charAt((s.length()-1)) == symbol2) {

                    count++;
                }
            }
        }
        return count;
    }
    public static String deleteAllDuplicates(String s1, String s2) {
        String s = s1.replaceAll(s2, "");
        return s;

    }

}
