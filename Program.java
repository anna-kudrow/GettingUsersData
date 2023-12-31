package Homework3;

//Приложение должно проверить введенные данные по количеству. Если количество не совпадает с требуемым, вернуть код ошибки,
//        обработать его и показать пользователю сообщение, что он ввел меньше и больше данных, чем требуется.
//
//        Приложение должно попытаться распарсить полученные значения и выделить из них требуемые параметры.
//        Если форматы данных не совпадают, нужно бросить исключение, соответствующее типу проблемы.
//        Можно использовать встроенные типы java и создать свои. Исключение должно быть корректно обработано,
//        пользователю выведено сообщение с информацией, что именно неверно.

import java.io.IOException;

public class Program {
    public static void main(String[] args) throws NotEnoughData, GenderException {
        InfoService infoService = new InfoService();
        SaveService writeServise = new SaveService();
        try{
            String personInfo = infoService.getInfo();
            System.out.println(personInfo);
            writeServise.saveData(personInfo);



        }catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
