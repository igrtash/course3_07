/** Урок 5: Знакомство с ООП
 * Практические упражнения
 * Придумать индивидуальное семейство классов на основе разобранного
 * примера (1 родительский абстрактный и 2 дочерних). В каждом классе
 * должно быть три или больше полей, каждое из которых имеет разные
 * модификаторы доступа. Для private полей добавить get и set методы.
 * Каждый класс должен иметь два конструктора – без аргументов и с
 * аргументами. Дочерние классы должны переопределять хотя бы один
 * родительский метод.
 * С помощью класса Main показать созданное семейство классов и его
 * функционал.
 */
public class Main {

    public static void main(String[] args) {
        Person person1 = new Employee(1);
        Person person2 = new Employee(2,"Иван", "Иванов", "ivan@yandex.ru", "программист", "Отдел разработки", 10000);
        Person person3 = new Customer(3);
        Person person4 = new Customer(4,"Петр", "Петров", "petr@yandex.ru","ООО \"Светлячок\"","Энергетика");

        System.out.println(person1.PersonInfo());
        System.out.println(person2.PersonInfo());
        System.out.println(person3.PersonInfo());
        System.out.println(person4.PersonInfo());

    }
}
