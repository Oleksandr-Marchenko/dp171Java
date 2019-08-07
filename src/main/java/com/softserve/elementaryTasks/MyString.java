package com.softserve.elementaryTasks;

public interface MyString {

    String TASK_01_DESCRIPTION = "Шахматная доска\n" +
            "Вывести шахматную доску с заданными размерами высоты и ширины, по принципу:\n" +
            "*  *  *  *  *  *\n" +
            "  *  *  *  *  *  *\n" +
            "*  *  *  *  *  *\n" +
            "  *  *  *  *  *  *\n" +
            "Программа запускается через вызов главного класса с параметрами.\n";

    String INPUT_STRING_TO_TASK_01 = "Enter y/yes to input height and width of the board or enter \n" +
            "anything else to choice default arguments";

    String TASK_03_DESCRIPTION = "Сортировка треугольников\n" +
            "Разработать консольную программу, выполняющую вывод треугольников в порядке убывания их площади. \n" +
            "После добавления каждого нового треугольника программа спрашивает, хочет ли пользователь добавить" +
            " ещё один.\n Если пользователь ответит “y” или “yes” (без учёта регистра), программа попросит " +
            "ввести\n данные для ещё одного треугольника, в противном случае – выводит результат в консоль.\n" +
            "\n" +
            "• Расчёт площади треугольника должен производится по формуле Герона.\n" +
            "• Каждый треугольник определяется именем и длинами его сторон. \n" +
            "Формат ввода (разделитель - запятая): <имя>, <длина стороны>, <длина стороны>, <длина стороны>\n" +
            "• Приложение должно обрабатывать ввод чисел с плавающей точкой.\n" +
            "• Ввод должен быть нечувствителен к регистру, пробелам, табам.\n" +
            "• Вывод данных должен быть следующем примере:\n" +
            "============= Triangles list: ===============\n" +
            "1.[Triangle first]: 17.23 сm\n" +
            "2.[Triangle 22]: 13 cm\n" +
            "3.[Triangle 1]: 1.5 cm\n";

    String QUESTION_TASK_03 = "Enter y/yes if you want to add one more Triangle";

    String INPUT_STRING_TO_TASK_03 = "Enter argument of Triangle in the format" +
            " <name>,<lengthSide1>,<lengthSide2>,<lengthSide3>";

    String INPUT_WRONG_SIDES_TASK_03 = "Name of triangle or sides are incorrect";


    String INPUT_STRING_TO_TASK_04 = "Enter argument of Triangle in the format <file path>,<row>" +
            " or " + "<file path>,<row>,<rowToReplace>";

    String TASK_05_DESCRIPTION = "Число в пропись\n" +
            "Нужно преобразовать целое число в прописной вариант: " +
            "12 – двенадцать.\nПрограмма запускается через вызов главного класса с параметрами.\n";

    String INPUT_STRING_TO_TASK_05 = "Enter an integer in the range from -999 999 999 999 to 999 999 999 999";

    String TASK_05_EXIT = "If you want to exit, enter 0:";

    String TASK_05_ARG = "Entered number is";
}
