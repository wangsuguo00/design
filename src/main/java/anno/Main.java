package anno;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(10);
        list.add(8);

        Collections.sort(list,(a,b) -> a.compareTo(b));

        list.forEach(v -> System.out.println(v));

    }
}
