package ru.oshkina.demo;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

import java.util.Arrays;

//В процессе выполнения программы появляется диалоговое окно с информацией о введенном тексте,
//количестве символов в тексте, указаны первая и последняя буквы в тексте.

public class Demo3 {

  public static void main(String[] args) {

    //Текстовые переменные
    String txt, str;

    //Отображение окна с полем ввода
    txt = showInputDialog("Введите текст:");

    //целочисленная переменная
    int size = txt.length();

    //символьные перменные
    char A = txt.charAt(0); // str[0]
    char B = txt.charAt(size - 1);

    //Формируется значение текстовой переменной
    str = "Текст: " + txt + "\n";
    str += "Символов в тексте: " + size + "\n";
    str += "Последний символ: " + B + "\n";
    str += "Первый символ: " + A + "\n";

    //отображение диалоговое окно
    showMessageDialog(null, str);
  }
}
