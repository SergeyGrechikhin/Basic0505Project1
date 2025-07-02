package tea;

import java.util.Arrays;

public class TeaCollection {
    private Tea[] teas;
    private int teaCounter = 0; // - индекс элемента массива, то есть в какую текущую ячейку
    // массива мы положим очердной элемент (если массив не заполнен полностью)
    private int teaIndex = 1; // - нумерация экземпляра класса


    public TeaCollection(int sizeIfTeaCollection) {
        this.teas = new Tea[sizeIfTeaCollection];
    }

    public Tea add(Tea newTea){
        /*
        в экземпляре класса tea, ссылку на который будут передавать в этот метод,
        будут заполненны ВСЕ поля, кроме поля id
        так как этот экземпляр класса будет создаваться на основе данных, полученных
        от пользователя, то id в нем будет отсутсвовать (будет = 0)
         */

        if (teaCounter < teas.length) {
            Tea tea = new Tea(teaIndex,
                    newTea.getManufacturer(),
                    newTea.getType(),
                    newTea.getVariety());
            teaIndex++;

            teas[teaCounter] = tea;
            teaCounter++;

            return tea;
        } else {
            return null;
        }
    }

    public Tea add2(Tea newTea){
        /*
      Процедура "удаления" элементов из массива в самом простом варианте заключается
      в том, что в ячейку массива прописывается null. Тем самым мы "стираем" ссылку на
      экземпляр класса и у нас больше нет никакой переменной (или ячейки массива),
      где бы эта ссылка хранилась.

      Если мы будем реализовывать процедуру "удаления" элементов из нашего массива,
      то это значит, что какие-то элементы массива могут быть "null"

      То есть среди элементов будут null и чтобы добавить новый элемент нам
      нужно будет пройтись по всему массиву и найти первую незанятую ячейку
      и положить новый элемент туда
         */

//        for (int i = 0; i < teas.length; i++) {
//            if (teas[i] == null) {
//                Tea tea = new Tea(teaIndex,
//                        newTea.getManufacturer(),
//                        newTea.getType(),
//                        newTea.getVariety());
//                teaIndex++;
//
//                teas[i] = tea;
//                return tea;
//            } else {
//                return null;
//            }
//
//        }

        return null;
    }


    public Tea updateTea(int idTeaForUpdate, String newManufacturer){
        /*
        если в этот метод будут передавать id того экземпляра класса, в котором
        надо поменять производителя, то мы сперва должны будем возпользоваться
        методом поиска нужно нам элемента по его id, а затем поменять значение
        в поле производитель.
        А если нам УЖЕ передают ссылку на нужный элемент (то есть это элемент
        был найден на уровне сервиса), то мы просто меняем содержимое поля
        производитель.
         */

        Tea teaForUpdate = findById(idTeaForUpdate);
        teaForUpdate.setManufacturer(newManufacturer);
        return teaForUpdate;

    }


    public boolean deleteTea(int idForDelete){
        /*
        вариант1 :
        массив из 5 элементов заполненно 3 элемента
        teas.length = 5, индексы от 0 до 4
        0,1 и 2  - заняты, а 3 и 4 свободны
        teaCounter = 3 - указывает на 3ю ячейку как на свободную
        куда надо добавлять будет очередной элемент

        допустим что надо удалить элемент с индексом 1
        идем в цикле - находим элемен с индексом 1 (i = 1)
        и в эту ячейку прописываем null

        теперь в цикле от 1 до меньше чем 3 - 1 (до 2) делаем следующее:
        j= 1
        берем элемент из ячейки № 2 и ее записываем в ячейку №1

        j=2 то условие цикла не выполняется и выходим из цикла

        берем ячейку № 2 и в нее записываем null

        и уменьшаем счетчик teaCounter на 1

         вариант2 :
        массив из 5 элементов заполненно 5 элемента
        teas.length = 5, индексы от 0 до 4
        0,1,2,3,4  - заняты
        teaCounter = 5 - указывает на 5ю ячейку которой нет - все заняты
        некуда добавлять очередной элемент

        допустим что надо удалить элемент с индексом 4 (последний)
        идем в цикле - находим элемент с индексом 4 (i = 4)
        и в эту ячейку прописываем null

        теперь в цикле от 4 до меньше чем 5 - 1 (до 4) делаем следующее:
        j= 4 то условие цикла не выполняется и сразу выходим из цикла

        берем ячейку № 4 и в нее записываем null

        и уменьшаем счетчик teaCounter на 1
         */
        for (int i = 0; i < teaCounter; i++) {
            if (teas[i].getId() == idForDelete) {
                teas[i] = null;
                // сдвигаем все элементы вправо от найденного
                for (int j = i; j < teaCounter - 1; j++) {
                    teas[j] = teas[j + 1];
                }
                // "зануляем" последний "висящий" элемент
                teas[teaCounter - 1] = null;
                // уменьшаем счетчик реально существующих элементов
                teaCounter--;
                return true;
            }
        }
        return false;
    }

    // -------- методы для поиска ---------

    public Tea[] findAll(){

        Tea[] tea = new Tea[teaCounter];

        for (int i = 0; i < teaCounter; i++) {
            tea[i] = teas[i];
        }
        return tea;

    }


    public Tea findById(int idTeaForSearch) {
        for (int i = 0; i < teaCounter; i++) {
            if (teas[i].getId() == idTeaForSearch){
                return teas[i];
            }
        }
        return null;
    }

    public Tea[] findByTeaManufacturer(String manuTeaForSearch) {

        int teasCounter = 0;
        for (int i = 0; i < teaCounter; i++) {
            if (teas[i].getManufacturer().equals(manuTeaForSearch)){
                teasCounter++;
            }
        }

        Tea[] foundedTea = new Tea[teasCounter];
        int foundedTeaIndex = 0;

        for (int i = 0; i < teaCounter; i++) {
            if (teas[i].getManufacturer().equals(manuTeaForSearch)){
                foundedTea[foundedTeaIndex] = teas[i];
                foundedTeaIndex++;
            }
        }

        return foundedTea;
    }
    public Tea[] findByTeaType(String typeTeaForSearch) {

        int teasCounter = 0;
        for (int i = 0; i < teaCounter; i++) {
            if (teas[i].getType().equals(typeTeaForSearch)){
                teasCounter++;
            }
        }

        Tea[] foundedTea = new Tea[teasCounter];
        int foundedTeaIndex = 0;

        for (int i = 0; i < teaCounter; i++) {
            if (teas[i].getType().equals(typeTeaForSearch)){
                foundedTea[foundedTeaIndex] = teas[i];
                foundedTeaIndex++;
            }
        }

        return foundedTea;
    }

    public Tea[] findByTeaVariety(String varietyTeaForSearch) {
        int teasCounter = 0;
        for (int i = 0; i < teaCounter; i++) {
            if (teas[i].getVariety().equals(varietyTeaForSearch)){
                teasCounter++;
            }
        }

        Tea[] foundedTea = new Tea[teasCounter];
        int foundedTeaIndex = 0;

        for (int i = 0; i < teaCounter; i++) {
            if (teas[i].getVariety().equals(varietyTeaForSearch)){
                foundedTea[foundedTeaIndex] = teas[i];
                foundedTeaIndex++;
            }
        }

        return foundedTea;
    }

//
//    public Tea[] findByTeaCriteria(String searchCriteria, String teaParamForSearch) {
//        int teasCounter = 0;
//        for (int i = 0; i < teaCounter; i++) {
//
//            if (searchCriteria.equals("type") && teas[i].getType().equals(teaParamForSearch)){
//                teasCounter++;
//            }
//
//            if (searchCriteria.equals("variety") && teas[i].getVariety().equals(teaParamForSearch)){
//                teasCounter++;
//            }
//        }
//
//        Tea[] foundedTea = new Tea[teasCounter];
//        int foundedTeaIndex = 0;
//
//        for (int i = 0; i < teaCounter; i++) {
//            if (searchCriteria.equals("type") && teas[i].getType().equals(teaParamForSearch)){
//                foundedTea[foundedTeaIndex] = teas[i];
//                foundedTeaIndex++;
//            }
//
//            if (searchCriteria.equals("variety") && teas[i].getVariety().equals(teaParamForSearch)){
//                foundedTea[foundedTeaIndex] = teas[i];
//                foundedTeaIndex++;
//            }
//        }
//
//        return foundedTea;
//    }
//
//
public Tea[] findByType(String typeForSearch ){
    Tea[] results = new Tea[teaCounter];
    int index = 0;
    for( int i = 0; i < teaCounter; i++ ){
        if ( teas[i] != null && teas[i].getType().equals(typeForSearch)) {
            results[index++] = teas[i];
        }
    }

    return Arrays.copyOf(results, index);
}
}
