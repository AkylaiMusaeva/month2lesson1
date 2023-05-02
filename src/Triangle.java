public class Triangle {
    /**Создайте класс Triangle, у класса должны быть поля a, b, c.
     В классе создайте метод "area" который при вызове выводит на консоль площадь треугольника.*/
   /*double a;//сторона
    double b;//высота
    int  c;//2
    public void area(){//метод для вычисления площади треугольника зная основание и высоту
        System.out.println((a*b)/c);
    }*/


      //2й способ
    double a;
    double b;
    double c;
    double p;//полупериметр

    public void area2(){//метод для вычисления площади треугольника,зная его три стороны
        System.out.println("Полупериметр треугольника "+(p=(a+b+c)/2));
        System.out.println("Площадь треугольника зная его три стороны равна "+Math.sqrt(p*(p-a)*(p-b)*(p-c)));




    }
}
