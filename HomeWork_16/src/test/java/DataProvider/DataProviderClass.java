package DataProvider;

import org.testng.annotations.DataProvider;

import java.util.Collections;

public class DataProviderClass {

    @DataProvider(name = "firstUserParams")
    public Object[][] getFirstUserParams() {
        return new Object[][]{
                {"Belinda", 60} // Ожидаемое имя и возраст первого пользователя после сортировки
        };
    }

    @DataProvider(name = "seventhUserParams")
    public Object[][] getSeventhUserParams() {
        return new Object[][]{
                {"Keanu", 15} // Ожидаемое имя и возраст седьмого пользователя из списка после сортировки
        };
    }

    @DataProvider(name = "negativeTestData")
    public Object[][] negativeTestData() {
        //Возвращаем двумерный массив объектов, в котором первое значение 'null',
        // а второй - это пустой лист, созданный при помощи коллекции 'Collections.emptyList()'
        return new Object[][]{
                {null},
                {Collections.emptyList()}
        };
    }
}
