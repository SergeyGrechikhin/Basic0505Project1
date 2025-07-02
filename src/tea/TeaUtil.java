package tea;

public class TeaUtil {
    public Tea[] sortByManufacturer(Tea[] teas){

        Tea[] unsortedArray = teas.clone();

        int len = unsortedArray.length; // длина массива

        for (int i = 0; i < len - 1; i++) {
            // находим индекс минимального (по производителю) элемента в диапазоне [i.. len - 1]
            int minIdx = i;

            for (int j = i + 1; j < len; j++) {
                String manuJ = unsortedArray[j].getManufacturer();
                String manuMin = unsortedArray[minIdx].getManufacturer();

                // сравниваем значения производителей у текущего элемента
                // и того, который "числится" пока что минимальным
                if (manuJ.compareToIgnoreCase(manuMin) < 0 ) {
                    minIdx = j;
                }
            }

            // меняем местами unsortedArray[i] и unsortedArray[minIdx]
            if (minIdx != i) {
                Tea temp = unsortedArray[i];
                unsortedArray[i] = unsortedArray[minIdx];
                unsortedArray[minIdx] = temp;
            }
        }

        return unsortedArray;

    }
}
