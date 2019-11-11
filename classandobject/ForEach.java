package pl.monikagapinska.firstprogramme.classandobject;

import java.util.Arrays;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> lista = Arrays.asList("a", "b", "c");
        for(String string : lista) {
            System.out.println(string);
        }
    }
}

