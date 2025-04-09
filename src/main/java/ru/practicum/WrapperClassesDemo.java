package ru.practicum;


import java.util.ArrayList;
import java.util.List;

public class WrapperClassesDemo {

    public static void main(String[] args) {
        Integer intWrapper = Integer.valueOf(42); // Создание через valueof
        Double doubleWrapper = 3.14; //Автоупаковка
        Character charWrapper = 'A'; //Автоупаковка
        Boolean boolWrapper = Boolean.TRUE; // Использование константы


        //Автоупаковка и автораспаковка
        int primitiveInt = intWrapper; //Автораспаковка
        double primitiveDouble = doubleWrapper; //Автораспаковка
        char primitiveChar = charWrapper; //Автораспаковка
        boolean primitiveBool = boolWrapper; //Автораспаковка


        //Преобразование строк в числа и обратно
        String numberStr = "123";
        int parsedInt = Integer.parseInt(numberStr); // Преобразование строки в int
        String intStr = Integer.toString(parsedInt); // Преобразование int в строку

        // Использование констант и методов классов оберток
        System.out.println("Минимальное значение int: " + Integer.MIN_VALUE);
        System.out.println("Максимальное значение int: " + Integer.MAX_VALUE);
        System.out.println("Двоичное представление 42: " + Integer.toBinaryString(42));
        System.out.println("Число 42 в шестнадцатеричном формате: " + Integer.toHexString(42));


        //Работа с коллекциями (требуются объекты, а не примитивы)
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10); // Автоупаковка
        numbers.add(20);
        int firstNumber = numbers.get(0); // Автораспаковка


        //Сравнение обернутых объектов
        Integer a = 100;
        Integer b = 100;
        System.out.println("a == b (кэширование): " + (a == b)); //true

        Integer c = 200;
        Integer d = 200;
        System.out.println("c == d (новые объекты): " + (c == d)); //false
        System.out.println("c.equals(d): " + c.equals(d)); //true


        //Поддержка null
        Integer nullabelInt = null;
        if(nullabelInt == null){
            System.out.println("nullabelInt is null");
        }




    }



    }



