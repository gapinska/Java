package pl.monikagapinska.firstprogramme.classandobject;

public class StringTasks {
    public static void main(String[] args) {
        String abc = "   Text9 Text123    ";
        String cba = "She has got a dog";

        System.out.println(cba.concat(abc));
        System.out.println(abc.replace("9","10"));
        System.out.println(cba.toUpperCase());
        System.out.println(cba);
        System.out.println(cba.toLowerCase());
        System.out.println(abc.trim());
        System.out.println(abc.substring(5));

    }
}
