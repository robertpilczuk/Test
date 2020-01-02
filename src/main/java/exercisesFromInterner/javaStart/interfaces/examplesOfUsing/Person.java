package exercisesFromInterner.javaStart.interfaces.examplesOfUsing;

import java.io.Serializable;

@SuperClass //nic to nie wnosi, nie zmienia niczego w kodzie, dodajemy adnotację w takiej formie
public class Person implements Comparable<Person>, Runnable, Serializable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Person o) {
        return 0;
    }

    @Override
    public void run() {

    }
}