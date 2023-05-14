package pro.sky.homework;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        String[] massive = new String[]{"a","a","b","a","c","d","b","a","e","c","a","b","f"};
        Set<String> mSet = Arrays.stream(massive).collect(Collectors.toSet());
        System.out.println(mSet);

    }
}