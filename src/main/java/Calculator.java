import java.util.List;
import java.util.Objects;

/**
 * +1)расширить класс калькулятор на умножение
 * +2)расширить класс калькулятор на деление
 */
public class Calculator {


    /**
     * @param array массив чисел
     * @return значение double результат суммы
     * @apiNote считает сумму находящихся в массиве <? extends Number>
     */
    public double sum(List<? extends Number> array) {
        double result = 0;
        for (int i = 0; i < array.size(); i++) {
            result += array.get(i).doubleValue();
        }
        return result;
    }

    /**
     * @param array массив чисел
     * @return значение double результат вычитания
     * @apiNote считает разницу находящихся в массиве <? extends Number>
     */
    public double minus(List<? extends Number> array) {
        double result = array.get(0).doubleValue();
        if (array.size() == 1) return result;
        if (array.size() > 1) {
            for (int i = 1; i < array.size(); i++) {
                result -= array.get(i).doubleValue();
            }
        }
        return result;
    }

    /**
     * @param array массив чисел
     * @return значение double результат умножения
     * @apiNote считает произведение находящихся в массиве <? extends Number>
     */
    public double multiplication(List<? extends Number> array) {
        double result = 1.0;
        for (int i = 0; i < array.size(); i++) {
            result *= array.get(i).doubleValue();
        }
        return result;
    }

    /**
     * @param array массив чисел
     * @return значение double результат деления
     * @apiNote считает произведение находящихся в массиве <? extends Number>
     */
    public double division(List<? extends Number> array) {
        double result = array.get(0).doubleValue();
        if (array.size() == 1) return result;
        if (array.size() > 1) {
            for (int i = 1; i < array.size(); i++) {
                result /= array.get(i).doubleValue();
            }
        }
        return result;
    }

    /**
     * @apiNote переводит строку с числами в строку в бинннарном коде
     * @param str строка
     * @return строку бинарный код
     */
    public String toBinaryString(String str) {
    int num = stringIntoInteger(str);
    return Integer.toString(num,2);
    }

    /**
     * @apiNote переводит строку с плавающей точкой в интеджер
     * @param string принимаемое значение
     * @return интеджер, убирает точку и все значения после нее
     */
    private Integer stringIntoInteger(String string) {
        if (string.contains(".")) {
            string = string.substring(0, string.indexOf('.'));
            //String strLittle = string.split(".")[0];
            return Integer.valueOf(string);
        } else {
            return Integer.valueOf(string);
        }
    }

}
