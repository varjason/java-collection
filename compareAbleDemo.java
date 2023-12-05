import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class compareAbleDemo implements Comparable<compareAbleDemo>{
    public String name;
    public int age;

    public compareAbleDemo(){

    }

    public compareAbleDemo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "compareAbleDemo [name=" + name + ", age=" + age + "]";
    }

    @Override
    public int compareTo(compareAbleDemo o) {
        return o.age - this.age;
    }
}

class runCompareAble{
    public static void main(String[] args) {
        List <compareAbleDemo> l = new ArrayList<>();
        compareAbleDemo c1 = new compareAbleDemo("A", 20);
        compareAbleDemo c2 = new compareAbleDemo("B", 10);
        compareAbleDemo c3 = new compareAbleDemo("C", 30);
        l.add(c1);
        l.add(c2);
        l.add(c3);
        Collections.sort(l);
        System.out.println(l.toString());
    }
}
