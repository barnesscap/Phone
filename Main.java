public class Main {
    public static void main(String[] args) {

        Phone phone1 = new Phone("093-455-65-12", "Samsung", "Grey");
        phone1.registration(phone1);
        Phone phone2 = new Phone("073-460-62-77", "LG", "Black");
        phone2.registration(phone2);
        Phone phone3 = new Phone("063-439-02-04", "Nokia", "Blue");
        phone3.registration(phone3);
        Phone phone4 = new Phone("067-294-10-53", "Xiaomi", "Black");
        phone4.registration(phone4);
        Phone phone5 = new Phone("066-238-39-44", "Apple", "Gold");
        phone5.registration(phone5);
        Phone phone6 = new Phone("095-023-70-21", "Sony", "Silver");
        phone6.registration(phone6);

        phone1.call("067-294-10-53");
        phone2.call("073-460-62-77");
        phone3.call("066-238-39-44");
        phone4.call("067-699-44-17");

    }
}
