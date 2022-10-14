public class VariablesTheme {

    public static void main(String arg[]){
        System.out.println("\n1. Создание переменных и вывод их значений на консоль.");
        byte prosAmount = 1;
        short systemType = 64;
        int memoryCapacity = 8076;
        long virtualMemoryCapacity = 14476;
        float prosFrequency = 1.9f;
        double display = 15.60;
        char networkAdapters = '4';
        System.out.println("Количество процессоров: " + prosAmount);
        System.out.println("Тип системы: x" + systemType + "-based PC ");
        System.out.println("Полный объем физической памяти: " + memoryCapacity + " МБ");
        System.out.println("Виртуальная память: Макс. размер: " + virtualMemoryCapacity + " МБ");
        System.out.println("Частота процессора: " + prosFrequency + " МГц");
        System.out.println("Диагональ экрана: " + display + " дюймов");
        System.out.println("Число сетевых адаптеров: " + networkAdapters);

        System.out.println("\n2. Расчет стоимости товара со скидкой");
        double penPrice = 100, bookPrice = 200, discount = 13.5, allPriceWithDiscount;
        float discountPercent = 11.0f;
        allPriceWithDiscount = (penPrice + bookPrice) * (100 - discount) / 100;
        discount = (penPrice + bookPrice) - allPriceWithDiscount;
        System.out.println("Сумма скидки: " + discount + " рублей.");
        System.out.println("Общая сумма с учетом скидки: " + allPriceWithDiscount +" рублей.");

        System.out.println("\n3. Вывод на консоль слова JAVA.");
        char letterJ = 'J', letterA = 'a', letterVCap = 'V', letterVLow = 'v';
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
       byte minByte = -128, maxByte = 127;
       short minShort = -32_768, maxShort = 32_767;
       int minInt = -2_147_483_648, maxInt = 2_147_483_647;
       long minLong = -9_223_372_036_854_775_808L, maxLong = 9_223_372_036_854_775_807L;
       System.out.println("Первоначальные значения переменных:  " + minByte + "    " + maxByte );
       System.out.println("Значение после инкремента:           " + minByte++ + "    " + maxByte++);
       System.out.println("Значение после декремента:           " + minByte-- + "    " + maxByte--);
       System.out.println("\nПервоначальные значения переменных:  " + minShort + "    " + maxShort );
       System.out.println("Значение после инкремента:           " + minShort++ + "    " + maxShort++);
       System.out.println("Значение после декремента:           " + minShort-- + "    " + maxShort--);
       System.out.println("\nПервоначальные значения переменных:  " + minInt + "    " + maxInt );
       System.out.println("Значение после инкремента:           " + minInt++ + "    " + maxInt++);
       System.out.println("Значение после декремента:           " + minInt-- + "    " + maxInt--);
       System.out.println("\nПервоначальные значения переменных:  " + minLong + "    " + maxLong );
       System.out.println("Значение после инкремента:           " + minLong++ + "    " + maxLong++);
       System.out.println("Значение после декремента:           " + minLong-- + "    " + maxLong--); 

       System.out.println("\n5. Перестановка значений переменных.");
       int a = 2, b = 5;
       System.out.println("1. С помощью третьей переменной");
       System.out.println("Исходные значение переменных: a = " + a + ", b = " + b);
       int c = a;
       a = b;
       b = c;
       System.out.println("Новые значение переменных:    a = " + a + ", b = " + b);
       System.out.println("\n2. С помощью арифметических операций");
       System.out.println("Исходные значение переменных: a = " + a + ", b = " + b);
       a = a + b;
       b = a - b;
       a = a - b;
       System.out.println("Новые значение переменных:    a = " + a + ", b = " + b);
       System.out.println("\n3. С помощью побитовой операции");
       System.out.println("Исходные значение переменных: a = " + a + ", b = " + b);
       a = a ^ b;
       b = a ^ b;
       a = a ^ b;
       System.out.println("Новые значение переменных:    a = " + a + ", b = " + b); 

       System.out.println("\n6. Вывод символов и их кодов.");
       int  a1 = 35, b1 = 38, c1 = 64, d1 = 94, e1 = 95;
       System.out.println("Код символа           Соответствующий ему символ из ASCII-тафблицы");
       System.out.println("   " + a1 + "                         " + (char)a1);
       System.out.println("   " + b1 + "                         " + (char)b1);
       System.out.println("   " + c1 + "                         " + (char)c1);
       System.out.println("   " + d1 + "                         " + (char)d1);
       System.out.println("   " + e1 + "                         " + (char)e1);  

       System.out.println("\n7. Отображение количества сотен, десятков и единиц числа.");
       int n1 = 123, x, y, z;
       x = n1 / 100;
       y = n1 % 100 / 10;
       z = n1 % 100 % 10;
       System.out.println("Число " + n1 + " содержит " + x + " сотен, " + y + " десятков, " + z + " единиц."); 

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
       int n = 345, sum, mult;
       sum = n / 100 + ( n % 100 / 10) + (n % 100 % 10);
       mult =  n / 100 * ( n % 100 / 10) * (n % 100 % 10);
       System.out.println("Сумма цифр числа " + n + " = " + sum);
       System.out.println("Произведение цифр числа " + n + " = " + mult);

       System.out.println("\n10. Преобразование секунд.");
       int seconds = 86399, hours, minutes;
       hours = seconds / 3600;
       minutes = seconds % 3600 / 60;
       seconds = seconds % 3600 % 60;
       System.out.println("Результат в формате ЧЧ:ММ:СС    " + hours + ":" + minutes + ":" + seconds);
    }
}





