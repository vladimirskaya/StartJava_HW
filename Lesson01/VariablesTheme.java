public class VariablesTheme {

    public static void main(String[] arg) {
        System.out.println("\n1. Создание переменных и вывод их значений на консоль.");
        byte cpuAmount = 1;
        short systemType = 64;
        int memoryCapacity = 8076;
        long virtualMemoryCapacity = 14476;
        float cpuFrequency = 1.9f;
        double displaySize = 15.60;
        char networkAdapters = '4';
        System.out.println("Количество процессоров: " + cpuAmount);
        System.out.println("Тип системы: x" + systemType + "-based PC ");
        System.out.println("Полный объем физической памяти: " + memoryCapacity + " МБ");
        System.out.println("Виртуальная память: Макс. размер: " + virtualMemoryCapacity + " МБ");
        System.out.println("Частота процессора: " + cpuFrequency + " МГц");
        System.out.println("Диагональ экрана: " + displaySize + " дюймов");
        System.out.println("Число сетевых адаптеров: " + networkAdapters);

        System.out.println("\n2. Расчет стоимости товара со скидкой");
        double penPrice = 100;
        double bookPrice = 200;
        float discountPercent = 11.0f;
        double discount = (penPrice + bookPrice) * discountPercent / 100;
        double discountPrice = (penPrice + bookPrice) - discount;
        System.out.println("Сумма скидки: " + discount + " рублей.");
        System.out.println("Общая сумма с учетом скидки: " + discountPrice + " рублей.");

        System.out.println("\n3. Вывод на консоль слова JAVA.");
        char letterJ = 'J';
        char letterA = 'a';
        char letterVCap = 'V';
        char letterVLow = 'v';
        System.out.println("    " + letterJ + "    " + letterA + "  " 
                                    + letterVLow + "     " + letterVLow + "  " + letterA);
        System.out.println("    " + letterJ + "   " + letterA + " " + letterA + "  "
                                    + letterVLow + "   " + letterVLow + "  " 
                                    + letterA + " " + letterA);
        System.out.println(" " + letterJ + "  " + letterJ + "  "
                                    + letterA + letterA + letterA + letterA + letterA + "  "
                                    + letterVCap + " " + letterVCap + "  " 
                                    + letterA + letterA + letterA + letterA + letterA);
        System.out.println("  " + letterJ + letterJ + "  " + letterA + "     " + letterA + "  " 
                                    + letterVCap + "  " + letterA + "     " + letterA); 


       System.out.println("\n4. Отображение min и max значений числовых типов данных."); 
       byte maxByte = 127;
       short maxShort = 32_767;
       int maxInt = 2_147_483_647;
       long maxLong = 9_223_372_036_854_775_807L;
       System.out.println("Первоначальные значения переменных:  " + maxByte);
       maxByte++;
       System.out.println("Значение после инкремента:          " + maxByte);
       maxByte--;
       System.out.println("Значение после декремента:           " + maxByte);
       System.out.println("\nПервоначальные значения переменных:  " + maxShort);
       maxShort++;
       System.out.println("Значение после инкремента:          " + maxShort);
        maxShort--;
       System.out.println("Значение после декремента:           " + maxShort);
       System.out.println("\nПервоначальные значения переменных:  " + maxInt);
       maxInt++;
       System.out.println("Значение после инкремента:          " + maxInt);
       maxInt--;
       System.out.println("Значение после декремента:           " + maxInt);
       System.out.println("\nПервоначальные значения переменных:  " + maxLong);
       maxLong++;
       System.out.println("Значение после инкремента:          " +  maxLong);
       maxLong--;
       System.out.println("Значение после декремента:           " + maxLong);

       System.out.println("\n5. Перестановка значений переменных.");
       int a = 2;
       int b = 5;
       System.out.println("1. С помощью третьей переменной");
       System.out.println("Исходные значение переменных: a = " + a + ", b = " + b);
       int c = a;
       a = b;
       b = c;
       System.out.println("Новые значение переменных:    a = " + a + ", b = " + b);
       System.out.println("\n2. С помощью арифметических операций");
       System.out.println("Исходные значение переменных: a = " + a + ", b = " + b);
       a += b;
       b = a - b;
       a -= b;
       System.out.println("Новые значение переменных:    a = " + a + ", b = " + b);
       System.out.println("\n3. С помощью побитовой операции");
       System.out.println("Исходные значение переменных: a = " + a + ", b = " + b);
       a ^= b;
       b = a ^ b;
       a ^= b;
       System.out.println("Новые значение переменных:    a = " + a + ", b = " + b); 

       System.out.println("\n6. Вывод символов и их кодов.");
       char a1 = '#';
       char b1 = '&';
       char c1 = '@';
       char d1 = '^';
       char e1 = '_';
       System.out.println("Код символа           Соответствующий ему символ из ASCII-таблицы");
       System.out.println("   " + a1 + "                         " + (int) a1);
       System.out.println("   " + b1 + "                         " + (int) b1);
       System.out.println("   " + c1 + "                         " + (int) c1);
       System.out.println("   " + d1 + "                         " + (int) d1);
       System.out.println("   " + e1 + "                         " + (int) e1);  

       System.out.println("\n7. Отображение количества сотен, десятков и единиц числа.");
       int srcNum = 123;
       int x = srcNum / 100;
       int y = srcNum % 100 / 10;
       int z = srcNum % 10;
       System.out.println("Число " + srcNum + " содержит " + x + " сотен, " + y + " десятков, "
                + z + " единиц."); 

       System.out.println("\n8. Вывод на консоль ASCII-арт Дюка.");
       char slash = '/';
       char backSlash = '\\';
       char openBracket = '(';
       char endBracket = ')';
       char underline = '_';
       System.out.println("    " + slash + backSlash);
       System.out.println("   " + slash + "  " + backSlash);
       System.out.println("  " + slash + underline + openBracket + " " + endBracket + backSlash);
       System.out.println(" " + slash + "      " + backSlash);
       System.out.println("" + slash + underline + underline + underline + underline
                            + slash + backSlash + underline + underline + backSlash); 

       System.out.println("\n9. Произведение и сумма цифр числа.");
       int srcNum1 = 345;
       int sum = srcNum1 / 100 + (srcNum1 % 100 / 10) + (srcNum1 % 10);
       int mult =  srcNum1 / 100 * (srcNum1 % 100 / 10) * (srcNum1 % 10);
       System.out.println("Сумма цифр числа " + srcNum + " = " + sum);
       System.out.println("Произведение цифр числа " + srcNum + " = " + mult);

       System.out.println("\n10. Преобразование секунд.");
       int seconds = 86399;
       int hours = seconds / 3600;
       int minutes = seconds % 3600 / 60;
       seconds = seconds % 60;
       System.out.println("Результат в формате ЧЧ:ММ:СС    " + hours + ":" + minutes + ":" + seconds);
    }
}





