package src.main.java.seminar1;

public class Main {
    public static void main(String[] args) {

//  Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат,
//  содержащий в себе методы initProducts (List <Product>)
//  сохраняющий в себе список исходных продуктов и getProduct(String name)

//  Сделать класс Товар абстрактным, создать нескольких наследников
//  (к примеру: БутылкаВоды), сделать интерфейсом ТорговыйАвтомат и
//  реализовать класс какого-то одного типа ТорговогоАвтомата
//  (пример: ПродающийБутылкиВодыАвтомат

//    1. Попросить вначале переопределить метод toString для Товара,
//    запустить программу, после этого переопределить для наследника
//    этот метод, после запуска обратить внимание на изменение поведения.
//    2. Попросить создать перегруженный метод выдачи товара
//    ТорговымАвтоматом дополнив дополнительным входным параметром
//    (пример: getProduct(String name) выдающий товар по имени,
//    создать метод возвращающий товар по имени и какому-либо параметру
//    товара getProduct(String name, int volume)


        Vending vending = new FruitVending();

        Product product1 = new Apple("Apple", 20, 1L);
        Product product2 = new Orange("Orange", 30, 2L);
        Product product3 = new Banana("Banana", 25, 3L);
//        product1.name = "Apple";
//        product1.setName("Apple");

        vending.addProduct(product1);
        vending.addProduct(product2);
        vending.addProduct(product3);

        System.out.println(vending.getProduct("Apple"));
        System.out.println(vending.getProduct("Orange"));
        System.out.println(vending.getProduct("Banana"));

        System.out.println(vending.getProduct(1L));
        System.out.println(vending.getProduct(2L));
        System.out.println(vending.getProduct(5L));




    }
}
