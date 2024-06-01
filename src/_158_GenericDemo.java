public class _158_GenericDemo<T> {
    T data[] =(T[]) new Object[3];

    public static void main(String[] args) {
        _158_GenericDemo<String> gd = new _158_GenericDemo<>();
        gd.data[0] = "Hi";
        gd.data[1] = "Bye";
        gd.data[2] = "10";

    }
}
