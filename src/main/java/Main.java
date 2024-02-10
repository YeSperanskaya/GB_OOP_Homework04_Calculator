import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Long.toUnsignedString;

/**
 * 3)	Написать класс калькулятор, принимающий List
 * целочисленных значений, возвращающий сумму элементов коллекции (метод sum)
 * Актуальное дз:
 * +1)расширить класс калькулятор на умножение
 * +2)расширить класс калькулятор на деление
 * 3)расширить класс калькулятор на бинарный перевод(принимаемые значения как стринг,
 * так и инт - тут необходимо подумать как наилучшим образом реализовать, что будет
 * если будут приниматься округляемые Double/Float (округляемые -> с нулем на конце прим. 3.0 , 4.0 и тд т))
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> array1 = new ArrayList<>(Arrays.asList(1,56,899,65));
        Calculator calculator = new Calculator();
        System.out.println("calculator = " + calculator.sum(array1));
        List<Double> arrays2 = new ArrayList<>(Arrays.asList(1.0,2.0,56.0));
        System.out.println("arrays2 = " + calculator.sum(arrays2));
        System.out.println("arrays2multy = " + calculator.multiplication(arrays2));
        System.out.println("arrays2del = " + calculator.division(arrays2));
        String str = "4.25";
        System.out.println(calculator.toBinaryString(str));

    }
}
