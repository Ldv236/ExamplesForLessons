package org.exceptions;

public class DogNotFoundException extends RuntimeException {

    public DogNotFoundException(String message) {
        super(message);
    }

    public DogNotFoundException(int minIndex, int maxIndex, int requestIndex) {
        super(String.format("Псина не найдена, т.к. запрошен индекс %d, а ожидаемый диапазон индексов %d-%d"
                , requestIndex, minIndex, maxIndex));
    }
}
