package exercisesFromInterner.javaStart.lambda;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Main main = new Main();

        main.run();

    }

    private void run() {
        List<String> names = new ArrayList<>();
        names.add("Ania");
        names.add("Robert");
        names.add("Asia");
        names.add("Basia");
        names.add("Jan");
        names.add("Jarek");
        names.add("Kasia");

        names.stream()
                .filter(s -> s.endsWith("a"))
                .map(name -> name + "!")
                //.forEach(s -> print(s)); //
                .forEach(this::print);

        //lambda
        //names = filter(names, name -> name.endsWith("a"));
        //wykorzystanie klasy anonimowej:
//        names = filter(names, new Filter() {
////            @Override
////            public boolean filter(String input) {
////                return input.endsWith("a");
////            }
////        });
//  //      modifyAndDisplay(names, n -> n + "!");
//    }
//
//    private List<String> filter(List<String> input, Filter filter) {
//        List<String> resultList = new ArrayList<>();
//        for (String name : input) {
//            if (filter.filter(name)) {
//                resultList.add(name);
//            }
//        }
//        return resultList;
//    }
//
//    private void modifyAndDisplay(List<String> names, Modifier modifier) {
//        List<String> modifiedNames = new ArrayList<>();
//        for (String name : names) {
//            //pierwsza metoda do zapisu:
////            String modifiedName = name + " " + random.nextInt(11);
//            //druga metoda do zapisu:
////            String modifiedName = modify((name, new Modifier() {
////                @Override
////                public String modify(String s) {
////                    Random random = new Random();
////                    return name + " " + random.nextInt(11);
////                }
////            });
//            String modifiedName = modify(name, modifier);
//            modifiedNames.add(modifiedName);
//        }
//
//        System.out.println(modifiedNames);
////        names.sort((o1,o2)-> {
////            System.out.println(" ");
////            return Integer.compare(o1.length(),o2.length());
////        });
////
////
////        names.sort(new Comparator<String>() {
////            @Override
////            public int compare(String o1, String o2) {
////                return Integer.compare(o1.length(),o2.length());
////            }
////        });
////        System.out.println(names);
//    }
//
//    private String modify(String string, Modifier modifier) {
//        return modifier.modify(string);
//    }
//
    }

    private void print(String a) {
        System.out.println(a);
    }
}
