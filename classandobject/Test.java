package pl.monikagapinska.firstprogramme.classandobject;

public class Test {
    public static void main(String[] args) {
//        Client client1 = new Client();
//        client1.name = "Christian";

        Client clientMichael = new Client ();

        Address michaelAddress = new Address("Warsaw", "00-001");

        clientMichael.setFirstName("Michael");
        clientMichael.setLastName("Forbes");
        clientMichael.setAddress(michaelAddress);

        System.out.println(clientMichael.getLastName());
    }
}
