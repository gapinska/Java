package pl.monikagapinska.firstprogramme.methods;

public class Methods {
    public static void main(String[] args) {
        sayHi();
        sayHi();
        hi("Mon!");
        hi("Chris!");
        hi("Mon!", "Chris!");
        hi(" Mon,", " Chris,", " John!");
    }

    private static void sayHi() {
        System.out.println("Hi, Monica");
    }

    private static void hi(String name) {
        System.out.println("Hi " + name);
    }

    private static void hi(String name, String name2) {
        System.out.println("Hi " + name + ", " + "name2");
    }

    private static void hi(String... names) {
        String result = "";
        for (String s : names) {
             result = result + s;
        }
        System.out.println("Hi"+ result);
    }
}
