package JavaOOP_Ds4;

import java.util.Random;

public class Program {
    public static void main(String[] args)
    {
        try
        {
            ArrayClass<Integer> listInteger = new ArrayClass<>();
            Random rand = new Random();
            for (int i = 0; i < 10; i++)
            {
                listInteger.add(rand.nextInt(1, 20));
            }
            System.out.println("\n-- Создан первоначальный массив (Integer) --");
            listInteger.printArray();

            listInteger.bubbleSort();
            System.out.print("\nПузырьковая сортировка: ");
            listInteger.printArray();

            listInteger.removeIndex(1);
            System.out.println("\nРезультат удаления элемента по индексу: 1");
            listInteger.printArray();

            listInteger.removeIndex(3);
            System.out.println("\nРезультат удаления элемента по индексу: 3");
            listInteger.printArray();

            listInteger.removeData(2);
            listInteger.removeData(12);
            listInteger.removeData(19);
            System.out.println("\nРезультат удаления элемента по значению: 2, 12, 20");
            listInteger.printArray();

            for (int i = 0; i < 2; i++)
            {
                listInteger.add(rand.nextInt(1, 20));
            }
            System.out.println("\n- Формирование нового массива -");
            listInteger.printArray();

            listInteger.insertionSort();
            System.out.print("\nСортировка вставками: ");
            listInteger.printArray();

            System.out.println("Поиск минимального значения: " + listInteger.minData());
            System.out.println("Поиск максимального значения: " + listInteger.maxData());
            System.out.println("Сумма элементов массива: " + listInteger.sumData());
            System.out.println("Произведение элементов массива: " + listInteger.multData());
            System.out.println("Поиск элемента (11) по индексу (если его нет то возвращает -1): " + listInteger.findIndex(11));
            System.out.println("Проверка наличия элемента (13) в массиве. Возвращает true, если элемент в массиве есть, false - нет: " + listInteger.findData(13));

            ArrayClass<Double> listDouble = new ArrayClass<>();
            rand = new Random();
            for (int i = 0; i < 10; i++)
            {
                listDouble.add(rand.nextDouble(1, 20));
            }

            System.out.println("\n-- Создан первоначальный массив (Double) --");
            listDouble.printArray();

            System.out.println("Поиск минимального значения: " + listDouble.minData());
            System.out.println("Поиск максимального значения: " + listDouble.maxData());
            System.out.println("Сумма элементов массива: " + listDouble.sumData());
            System.out.println("Произведение элементов массива: " + listDouble.multData());

            listDouble.selectionSort();
            System.out.print("\nСортировка выбором: ");
            listDouble.printArray();

            ArrayClass<String> stringList = new ArrayClass<>();
            stringList.add("белый");
            stringList.add("чёрный");
            stringList.add("синий");
            stringList.add("красный");
            stringList.add("зелёный");
            stringList.add("голубой");
            stringList.add("розовый");
            stringList.add("желтый");
            stringList.add("фиолетовый");
            stringList.add("серый");
            stringList.add("оранжевый");
            stringList.add("коричневый");
            stringList.add("берюзовый");
            System.out.println("\n-- Создан массив цветов (String) --");
            stringList.printArray();

            stringList.removeIndex(11);
            System.out.println("\nРезультат удаления элемента по индексу: 11");
            stringList.printArray();

            stringList.removeData("серый");
            System.out.println("\nРезультат удаления элемента по значению: \"серый\"");
            stringList.printArray();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}