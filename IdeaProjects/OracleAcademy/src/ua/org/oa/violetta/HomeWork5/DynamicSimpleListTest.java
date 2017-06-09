package ua.org.oa.violetta.HomeWork5;

public class DynamicSimpleListTest {
    public static void main(String[] args) {
        DynamicStringList list = new DynamicStringList(5);

        list.add("1");
        list.add("2");
        System.out.println(list.get());
        System.out.println(list.get(0));
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        System.out.println(list);

    }
}
