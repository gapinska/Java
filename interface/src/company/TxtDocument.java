package com.company;
//override a overload --> override - przeciązamy metodę w klasie pochodnej overloading - tworzymy metody o takich samych nazwach, ale z róznymi parametrami
//extends dziedziczy się właściwości klasy
//implementacja interface'ów --> przejmujemy szkielet czyli przejmujemy co mamy robić a nie jak to mamy robić

public class TxtDocument extends AbstractDocument implements Document {
    @Override
    public boolean save() {
        String s = d;
        System.out.println("Save Txt Doc");
        return true;
    }

    @Override
    public String open(String path) {
        return "txt file: "+ path;
    }
}
