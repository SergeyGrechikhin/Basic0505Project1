package javapro.lesson13.dto;

public class ResponceDTO <T> {
    private boolean success;
    private String message;
    private T data;

    public ResponceDTO(boolean success, T data, String message) {
        this.success = success;
        this.data = data;
        this.message = message;
    }

    public static <T>ResponceDTO<T> requestTrue(T data, String message) {
        return new ResponceDTO<>(true, data, message);
    }

    public static <T> ResponceDTO<T> requestFalse(T data, String message) {
        return new ResponceDTO<>(false,data,message);
    }

    public boolean isSuccess() {
        return success;
    }

    public T getData() {
        return data;
    }

    public String getMessage() {
        return message;
    }
}
