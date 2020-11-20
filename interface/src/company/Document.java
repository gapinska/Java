package com.company;
//w interfacach nie ma metod prywatnych
//może przechowywać zmienne, ale są to stałe, nie  można zmienić ich wartości
//w interface wszystkie pola są statyczne
//klasy abstrakcyjne, jeśli chcemy pisać implemetację, po której obiekty będą dziedziczyły, interface - kiedy chcemy pisać szkielet

public interface Document {
    public String d = "d";
    public boolean save();
    public String open(String path);

    //od javy8 metody domyślne w interface'ach jeśli użyje się słowo default, jeśli nie ma słowa default nie można dodać ciała
    //można ją wywołać ale niemożna nadpisać, traci właściwosci interface'u a przejmuje własciwości klasy abstrakcyjnej
    //może to być metoda, która będzie zwracała informację o interface
    //wywołanie bezpośrednio metody, która znajduje się w interface
    public default void write(){
        System.out.println("write sth");
    }
}
