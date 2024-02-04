package HomeWork_12.UnsortedList;

import java.util.*;

public class UnsortedWordsList {

    public static void main(String[] args) {

        // Создаем список слов
        List<String> words = new ArrayList<>();
        words.add("C++");
        words.add("C#");
        words.add("Pascal");
        words.add("pascal");
        words.add("VBScript");
        words.add("vbscript");
        words.add("Java");
        words.add("java");
        words.add("JavaScript");
        words.add("javascript");
        words.add("Python");
        words.add("python");
        words.add("PHP");
        words.add("php");
        words.add("Swift");
        words.add("swift");
        words.add("ruby");
        words.add("Ruby");
        words.add("TypeScript");
        words.add("typescript");

        // Генерируем рандомный текст из слов в нашем листе
        String randomText = generateRandomText(words, 100);
        System.out.println(randomText);     //Выводим на экран рандомный текст из наших слов

        // Создаем 'Map' для подсчета частоты вхождения слов
        Map<String, Integer> wordFrequencyMap = new HashMap<>();


        String[] wordsInText = randomText.split("\\s+");

        // Обходим каждое слово в тексте
        for (String separateWord : wordsInText) {
            // Если слово уже есть в карте, увеличиваем его счетчик
            if (wordFrequencyMap.containsKey(separateWord)) {               // Если boolean 'containsKey' возвращает нам 'true',
                int wordsCount = wordFrequencyMap.get(separateWord);
                // извлекаем текущее значение счетчика для этого слова с помощью абстрактного метода 'get'
                wordFrequencyMap.put(separateWord, wordsCount + 1);
                // Увеличиваем счётчик 'wordsCount', при помощи абстрактного метода 'put'
            } else {
                // Если слова еще нет в карте (boolean 'containsKey' возвращает нам 'false'), добавляем его с начальным счетчиком 1
                wordFrequencyMap.put(separateWord, 1);
            }
        }

        // Выводим уникальные слова и их частоту вхождения при помощи цикла 'for each'
        for (String wordsFrequency : wordFrequencyMap.keySet()) {
            System.out.println(wordsFrequency + ": " + wordFrequencyMap.get(wordsFrequency));
        }
    }
    public static String generateRandomText(List<String> randomWords, int textLength) {
        String randomText = "";
        Random random = new Random();

        for (int i = 0; i < textLength; i++) {
            // Получаем случайное слово из списка
            String randomWord = randomWords.get(random.nextInt(randomWords.size()));
            //генерируем случайное число, используем его в качестве индекса, чтобы получить случайное слово из списка
            randomText += randomWord + " ";
            //Присваиваем выбранное слово в пустую строку и добавляем пробел, чтоб отделить слова
        }

        return randomText;
    }
}
