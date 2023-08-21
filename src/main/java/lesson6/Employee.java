package lesson6;

public class Employee {

  // поля
  // конструкторы
  // методы

  // public виден всем
  // protected виден внутри пакета + наследники
  // default виден внутри пакет (package-private)
  // private не виден никому
  private static int counter = 0;

  public static int getCounter() {
    return counter;
  }

  private String name;
  private int age;

  public Employee() {
    this("Unnamed");
  }

  // this
  public Employee(String name, int age) {
    // Проверка, что age положительный
    if (age <= 0) {
      throw new IllegalArgumentException("Возраст должен быть положительным!");
    }

    this.name = name;
    this.age = age;
    counter++;
  }

  public Employee(String name) {
    this(name, 18);
  }

  // getterы и setterы

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    if (age <= 0) {
      throw new IllegalArgumentException("Возраст должен быть положительным!");
    }
    this.age = age;
  }

  public boolean isOlderThan(int threshold) {
    return age > threshold;
  }

}
