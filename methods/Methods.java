package pl.monikagapinska.firstprogramme.methods;

public class Methods {
    public static void main(String[] args) {
        sayHi();
        sayHi();
        hi("Mon!");
        hi("Chris!");
        hi("Mon!", "Chris!");
        hi(" Mon,", " Chris,", " John!");
        System.out.println("result: " + addition(1,2,3,4));
        System.out.println(checkBy3(4));
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

    private static int addition(int... a) {
        int result = 0;
        for(int i : a){
            result += i;
        }
        return result;
    }

    private static boolean checkBy3 (int a){
        return a%3==0;
    }

//     
}
