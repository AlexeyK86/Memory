import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    public static void task5() {
        // Напишите метод, который изменяет значение переменной типа int.
        // Объявите метод changeValue, который принимает параметр типа int под названием value.
        // Внутри метода с помощью оператора присваивания запишите в параметр значение 22.
        // В методе main объявите переменную типа int под названием value и запишите туда значение 33.
        // В следующей строке вызовите метод changeValue и передайте в него эту переменную.

        int value = 33;
        changeValue(value);
        System.out.println(value);
    }

    public static void changeValue(int value) {
        value = 22;
    }

    public static void task6() {
        // Напишите метод, который изменяет значение переменной типа Integer.
        // Объявите метод changeValue, который принимает параметр типа Integer под названием value.
        // Внутри метода с помощью оператора присваивания запишите в параметр значение 22.
        // В методе main объявите переменную типа Integer под названием value и запишите туда значение 33.
        // Вызовите метод changeValue и передайте в него эту переменную.

        Integer value = 33;
        changeValue(value);
        System.out.println(value);

    }

    public static void changeValue(Integer value) {
        value = 22;
    }

    public static void task7() {
        // Напишите метод, который изменяет значение массива типа Integer.
        // Объявите метод changeValue, который принимает параметр массива типа Integer под названием value.
        // Внутри метода с помощью оператора присваивания запишите в параметр новый массив {1,2}.
        // В методе main объявите массив типа Integer под названием value и запишите туда значение {3,4}.
        // В следующей строке вызовите метод changeValue и передайте в него этот массив.

        Integer[] value = {3, 4};
        changeValueArray(value);
        System.out.println(Arrays.toString(value));
    }

    public static void changeValueArray(Integer[] value) {
        value = new Integer[] {1, 2};
    }

    public static void task8() {
        // Напишите метод, который изменяет значение массива типа Integer.
        // Объявите метод changeValue, который принимает параметр массива типа Integer под названием value.
        // Внутри метода с помощью оператора присваивания запишите в первую ячейку параметра цифру 99
        // В методе main объявите массив типа Integer под названием value и запишите туда значение {3,4}.
        // В следующей строке вызовите метод changeValue и передайте в него этот массив.

        Integer[] value = {3, 4};
        changeValueArray2(value);
        System.out.println(Arrays.toString(value));

    }
        public static void changeValueArray2(Integer[] value) {
            value [0] = 99;
        }

    public static void task9() {
        // Объявите объект класса person с полями name и surname.
        // Переопределите у него метод toString так, чтобы он возвращал строку из name и surname.
        // Объявите метод changePerson, который принимает параметр типа Person под названием person.
        // Внутри метода с помощью оператора присваивания запишите в параметр новый объект типа Person.
        // Присвойте строке name значение Ilya, строке surname — значение Lagutenko.
        // В методе main объявите переменную типа Person под названием person и запишите новый объект типа Person.
        // Присвойте строке name значение Lyapis, строке surname значение — Trubetskoy.
        // В следующей строке вызовите метод changePerson и передайте в него эту переменную.

        Person person = new Person("Lyapis", "Trubetskoy");
        changePerson(person);
        System.out.println(person);
    }

    public static void changePerson(Person person) {
        person = new Person("Ilya", "Lagutenko");

    }

    public static void task10() {
        Person person = new Person("Lyapis", "Trubetskoy");
        changePersonValue(person);
        System.out.println(person);
    }

    public static void changePersonValue(Person person) {
        person.setName("Ilya");
        person.setSurname("Lagutenko");
    }

}

