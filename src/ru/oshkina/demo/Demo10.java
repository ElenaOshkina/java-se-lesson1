package ru.oshkina.demo;

public class Demo10 {

  public static void main(String[] args) {
    int a = 7, b = 10;
    //вызываем функцию и передаем два аргумента
    swap(a, b);
    //Выводим на экран значения после "фиктивного" обмена значениями
    System.out.println("a=" + a);
    System.out.println("b=" + b);
  }

  public static void swap(int a, int b) {
    int t = a;//сохраняем значение во временную переменную
    a = b;
    b = t;
    System.out.println("Выполнили обмен значений для переменных");
  }
}
