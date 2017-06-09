package ua.org.oa.violetta.HomeWork5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class DynamicStringList implements SimpleList {
    private String[] array;
    // индекс в массиве, куда нужно вставлять следующую строку
    private int index;
    // темп увеличения массива
      private final double GROW_PACE = 1.5;

    DynamicStringList() {

    }
    DynamicStringList(int arrLength) {
        array = new String[arrLength];

    }

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    @Override
    public void add(String newString){
        String[] newAarray;
        for(int i = 0; i<array.length; i++)
            if (array[i] == null) {
            array[i] = newString; break;
        } else  {newAarray= Arrays.copyOf(array,(int)(array.length*GROW_PACE));
        array=newAarray;}

    }

    @Override
    public String get() {
        return array[array.length-1];
    }

    @Override
    public String get(int index) {
        if(index<0 || index>=array.length){
            throw new IllegalArgumentException();
        } else
            return array[index];
    }

    @Override
    public String remove() {
        array = Arrays.copyOf(array,array.length-1-1);
        return array.toString();
    }

    @Override
    public String remove(int index) {
        System.arraycopy(array[index+1],array.length-1-index,array[index],index,array.length-2);
        return array.toString();
    }

    @Override
    public boolean delete() {
        array = new String[0];
        return true;
    }

    @Override
    public String toString() {
        return "array=" + Arrays.toString(array);
    }
}
