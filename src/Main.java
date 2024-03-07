import Animals.Animal;
import Animals.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * #1) Создайте родительский класс
 * Animals.Animal
 * ##Свойства:
 * name, age, weight, color
 * ##Методы:
 * Getter and Setter
 * Say(Вывод на экран: "Я говорю"),
 * Go(Вывод на экран: "Я иду"),
 * Drink(Вывод на экран: "Я пью"),
 * Eat(Вывод на экран: "Я ем")
 * ##Переопределите метод toString (Возврат строки: "Привет! меня зовут name, мне age лет(/год/года), я вешу - weight кг, мой цвет - color") лет или год, или года должно быть выбрано в зависимости от числа
 * Примеры:
 * Привет! меня зовут Бобик, мне 5 лет, я вешу - 15 кг, мой цвет - черный
 * Привет! меня зовут Бобик, мне 1 год, я вешу - 15 кг, мой цвет - черный
 * Привет! меня зовут Бобик, мне 2 года, я вешу - 15 кг, мой цвет - черный
 * #2) Создайте интерфейс Animals.Flying
 * ##Методы:
 * Fly
 * #3) Создайте класс Cat унаследуйте его от Animals.Animal
 * Переопределить метод Say(Вывод на экран: "Мяу")
 * #4) Создайте класс Dog унаследуйте его от Animals.Animal
 * Переопределить метод Say(Вывод на экран: "Гав")
 * #5) Создайте класс Duck унаследуйте его от Animals.Animal, реализуйте интерфейс Animals.Flying
 * Переопределить метод Say(Вывод на экран: "Кря")
 * Реализовать метод Fly(Вывод на экран: "Я лечу")
 * #6) В основной программе:
 * Создайте ArrayList Animals.Animal
 * ##Создайте в консоли меню, при входе в приложение на экран выводится запрос команды add/list/exit
 * Команды оформить в enum
 * При вводе команды она должна быть регистронезависимой и обрезать пробелы в начале и конце
 * ##Если add
 * спросить какое животное(cat/dog/duck)
 * Спросить имя, возраст, вес, цвет
 * Инициализировать класс, добавить экземпляр в ArrayList и вызвать метод Say()
 * Вернуться к главному меню
 * ##Если list
 * Вывести на экран метод toString() для всех елементов массива
 * ##Если exit
 * выйти из программы
 */

public class Main {
    public static void main(String[] args) {
        List<Animal> animal = new ArrayList<>();
        String userCommand;
        do {
            System.out.println("Введите команду add/list/exit");
            Scanner scanner = new Scanner(System.in);
            userCommand = scanner.nextLine().trim();
        } while (findByName(userCommand));
        switch (userCommand) {
            case ("add"):
                addTypeAnimal();
        }
    }

    public static void addTypeAnimal() {
        String typeAnimal;
        do {
            System.out.println("Введите тип животного: (Пример:(cat/dog/duck))");
            Scanner scanner = new Scanner(System.in);
            typeAnimal = scanner.nextLine().trim();
        } while (findByType(typeAnimal));
        switch (typeAnimal) {
            case ("cat") :
                System.out.println("Введите имя кота: ");
                Scanner getName = new Scanner(System.in);
                while (getName.hasNextInt()) {
                    System.out.println("Введите имя буквами");
                    getName.next();
                }
                String getNameAnimal = getName.nextLine();
                System.out.println(getNameAnimal);
        }
    }

    public static boolean findByName(String name) {
        for (UserCommand userCommand : UserCommand.values()) {
            if (userCommand.name().equalsIgnoreCase(name)) {
                return false;
            }
        }
        return true;
    }

    public static boolean findByType(String name) {
        for (Animals animals : Animals.values()) {
            if (animals.name().equalsIgnoreCase(name)) {
                return false;
            }
        }
        return true;
    }
}

