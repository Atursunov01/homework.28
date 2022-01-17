package com.company;

public class Main {

    public static void main(String[] args) {
//        sqrt деген метод тузунуз
//        UnaryOperator деген интерфейстин реализациясын кайтаруусу керек
//        Бир санды кабыл алып анын тамырдан чыккан жообун кайтарат(корень)

        UnaryOperator dog = () -> System.out.println("hello");
        dog.method();

        Animal cat = new Animal() {
            @Override
            public void azho() {
                System.out.println("sdrfee");

                Walkable walk = new Walkable() {
                    @Override
                    public void waw(){
                        System.out.println("auuu");
                    }
                };
                walk.waw();
            }
        };
        cat.azho();
    }
}
