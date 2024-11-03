package ru.kb.kristibu;
/**
* Точка входа в программу 
* С неё всегда всё начинается 
* @param args стандартные аргументы командной строки 
**/

public class Main {
    public static void main(String[] args) { int result = OtherClass.add(2, 2); System.out.println(Decorator.decorate(result)); result = OtherClass.sub(2, 2); System.out.println(Decorator.decorate(result)); result = OtherClass.mul(2, 2); System.out.println(Decorator.decorate(result)); result = OtherClass.div(2, 2); System.out.println(Decorator.decorate(result)); }
}
