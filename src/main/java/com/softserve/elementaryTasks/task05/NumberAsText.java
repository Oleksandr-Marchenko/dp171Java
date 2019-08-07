package com.softserve.elementaryTasks.task05;

class NumberAsText {
    private static String numText;

    private static final String[][] SAMPLE_TEXT = {
            {"", "од", "дв", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"},
            {"", "десять ", "двадцать ", "тридцать ", "сорок ", "пятьдесят ", "шестьдесят ",
                    "семьдесят ", "восемьдесят ", "девяносто "},
            {"", "сто ", "двести ", "триста ", "четыреста ", "пятьсот ", "шестьсот ",
                    "семьсот ", "восемьсот ", "девятьсот "}};

    private static final String[] SAMPLE_11_TO_19 = {"десять ", "одинадцать ", "двенадцать ",
            "тринадцать ", "четырнадцать ", "пятнадцать ",
            "шеснадцать ", "семьнадцать ", "восемьнадцать ", "девятнадцать ", "девятнадцать "};

    private static final String[][] TEXT_MILLION = {{"", "", "", ""},
            {"миллиардов ", "миллионов ", "тысяч ", ""},
            {"миллиард ", "миллион ", "тысяча ", ""},
            {"миллиарда ", "миллиона ", "тысячи ", ""},
            {"миллиардов ", "миллионов ", "тысяч ", ""}};

    static String numberAsText(long number) {

        numText = "";
        if (number < 0) {
            numText = "минус ";
            number = -number;
        }

        int billion = (int) (number / 1000000000);
        int million = (int) (number - (billion * 1000000000)) / 1000000;
        int thousand = (int) (number - (billion * 1000000000) - (million * 1000000)) / 1000;
        int toThousand = (int) (number % 1000);

        numText = numText + wordsToThousand(billion, 0) +
                wordsToThousand(million, 1) +
                wordsToThousand(thousand, 2) +
                wordsToThousand(toThousand, 3);

        return numText;
    }

    private static String wordsToThousand(int numericalValue, int index) {

        int hundreds = numericalValue / 100;
        int decimal = (numericalValue - (hundreds * 100)) / 10;
        int units = numericalValue % 10;

        numText = "";
        if (decimal == 1) {
            numText = SAMPLE_TEXT[2][hundreds] + SAMPLE_11_TO_19[units];
        } else {
            numText = SAMPLE_TEXT[2][hundreds] + SAMPLE_TEXT[1][decimal] + SAMPLE_TEXT[0][units];
        }

        if (index == 2) {
            if (units == 1 && decimal != 1) numText = numText + "на ";
            else if (units == 2 & decimal != 1) numText = numText + "е ";
            if (units > 1 && decimal != 1) numText = numText + " ";
        } else {
            if (units == 1 && decimal != 1) numText = numText + "ин ";
            if (units == 2 & decimal != 1) {
                numText = numText + "а ";
            } else if (units != 0 & decimal != 1) numText = numText + " ";
        }

        int indexA = 0;
        if (numericalValue != 0) {
            if (units == 0 || decimal == 1) indexA = 1;
            else if (units == 1) indexA = 2;
            else if (units > 1 & units < 5) indexA = 3;
            else indexA = 4;
        }
        numText = numText + TEXT_MILLION[indexA][index];

        return numText;
    }
}
