package ua.org.oa.violetta.HomeWork5;

import java.io.IOException;

public interface SimpleList {
    void add(String s) throws IOException;

    String get();

    String get(int id);

    String remove();

    String remove(int id);

    boolean delete();

}
