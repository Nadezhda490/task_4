public class Main {
    public static void main(String[] args) {

//Задача 1: Месяц и количество дней

        int month = 4;

        switch (month){
            case 1 :
            case 3 :
            case 5 :
            case 7 :
            case 8 :
            case 10 :
            case 12 :
                System.out.println("31");
                break;
            case 4 :
            case 6 :
            case 9 :
            case 11 :
                System.out.println("30");
                break;
            case 2 :
                System.out.println("28");
                break;
            default:
                System.out.println("Ошибка: Такого месяца не существует");
        }

//        int month = 6;
//        switch (month){
//           case 1 :
//                System.out.println("Месяц: Январь." + " Количество дней: 31");
//                break;
//            case 2 :
//                System.out.println("Месяц: Февраль" + " Количество дней: 28");
//                break;
//            case 3 :
//                System.out.println("Месяц: Март." + " Количество дней: 31");
//                break;
//            case 4 :
//                System.out.println("Месяц: Апрель." + " Количество дней: 30");
//                break;
//            case 5 :
//                System.out.println("Месяц: Май." + " Количество дней: 31");
//                break;
//            case 6 :
//                System.out.println("Месяц: Июнь." + " Количество дней: 30");
//                break;
//            case 7 :
//                System.out.println("Месяц: Июль." + " Количество дней: 31");
//                break;
//            case 8 :
//                System.out.println("Месяц: Август." + " Количество дней: 31");
//                break;
//            case 9 :
//                System.out.println("Месяц: Сентябрь." + " Количество дней: 30");
//                break;
//            case 10 :
//                System.out.println("Месяц: Октябрь." + " Количество дней: 31");
//                break;
//            case 11 :
//                System.out.println("Месяц: Ноябрь." + " Количество дней: 30");
//                break;
//            case 12 :
//                System.out.println("Месяц: Декабрь." + " Количество дней: 31");
//                break;
//            default:
//                System.out.println("Ошибка: Такого месяца не существует");
//        }

//Задача 2: Перевод чисел в слова

        int num = 7;

        switch (num){
            case 0 :
                System.out.println("Ноль");
                break;
            case 1 :
                System.out.println("Один");
                break;
            case 2 :
                System.out.println("Два");
                break;
            case 3 :
                System.out.println("Три");
                break;
            case 4 :
                System.out.println("Четыре");
                break;
            case 5 :
                System.out.println("Пять");
                break;
            case 6 :
                System.out.println("Шесть");
                break;
            case 7 :
                System.out.println("Семь");
                break;
            case 8 :
                System.out.println("Восемь");
                break;
            case 9 :
                System.out.println("Девять");
                break;
            default:
                System.out.println("Ошибка: Нет такого числа");
        }

//Задача 3: Калькулятор для целых чисел

        int x = 50;
        int y = 40;
        char cal = '-';

        switch (cal){
            case '+' :
                System.out.println(x + y);
                break;
            case '-' :
                System.out.println(x - y);
                break;
            case '*' :
                System.out.println(x * y);
                break;
            case '/' :
                if (y == 0){
                    System.out.println("Ошибка: На ноль делить нельзя");
                } else {
                    int result = x / y;
                    System.out.println(result);
                }
                break;
            case '%' :
                if (y == 0){
                    System.out.println("Ошибка: Число y не может быть 0");
                } else {
                    int result = x % y;
                    System.out.println(result);
                }
                break;
            default:
                System.out.println("Ошибка: Нет такого оператора");
        }

//Задача 4: Определение части суток

        int time = 15;

        switch (time){
            case 1 :
            case 2 :
            case 3 :
            case 4 :
            case 5 :
                System.out.println("Ночь");
                break;
            case 6 :
            case 7 :
            case 8 :
            case 9 :
            case 10 :
            case 11 :
                System.out.println("Утро");
                break;
            case 12 :
            case 13 :
            case 14 :
            case 15 :
            case 16 :
            case 17 :
                System.out.println("День");
                break;
            case 18 :
            case 19 :
            case 20 :
            case 21 :
            case 22 :
            case 23 :
                System.out.println("Вечер");
                break;
            default:
                System.out.println("Ошибка: Такого времени не существует");
        }

//Задача 5: Определение типа фигуры

        int figure = 5;

        switch (figure){
            case 3 :
                System.out.println("Треугольник");
                break;
            case 4 :
                System.out.println("Четырёхугольник");
                break;
            case 5 :
                System.out.println("Пятиугольник");
                break;
            case 6 :
                System.out.println("Шестиугольник");
                break;
            default:
                System.out.println("Ошибка: Нет такой геометрической фигуры");
        }
    }
}