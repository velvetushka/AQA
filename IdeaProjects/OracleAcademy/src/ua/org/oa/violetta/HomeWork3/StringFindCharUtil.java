package ua.org.oa.violetta.HomeWork3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StringFindCharUtil {
    private static final char[] abc = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н',
            'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'};
    private static List<Character> chars = new ArrayList<>();

    public static void findAndCalculateChars() throws IOException {
        BufferedReader bufferedChars = null;
        bufferedChars = new BufferedReader(new FileReader("C:\\Users\\Violetta\\IdeaProjects\\forStringUtil"));
        int count = 0;

        int symbol = bufferedChars.read();
        while (symbol != -1){
            chars.add((char) symbol);
        }
for (int i = 0; i<chars.size()-1; i++) {
            for (int j=0; i<abc.length-1; j++){
                if (chars.get(i) == abc[j]) {
                    count++;
                }
            }
}

    }
}
