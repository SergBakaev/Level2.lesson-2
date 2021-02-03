public class MyArrayDataException  extends MainException{

    public MyArrayDataException(int i , int j) {
        super(String.format("В массиве есть символ или строка в [%d,%d]", i,j));
    }
}
