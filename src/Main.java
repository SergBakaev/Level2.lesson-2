public class Main {
    public static void main(String[] args) {

        String[][] normArr = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
        };
        String[][] sizeArr = {
                {"1", "2", "3", "4"},
                {"1", "2"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
        };
        String[][] noCharArr = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "", "3", "4"},
                {"1", "2", "3", "4"},
        };

        try {
            System.out.println(Convector.ConvectorArr(normArr));
        } catch (MainException e) {
            e.getMessage();
        }
        try {
            System.out.println(Convector.ConvectorArr(sizeArr));
        } catch (MainException e) {
            System.err.println(e.getMessage());
        }
        try {
            System.out.println(Convector.ConvectorArr(noCharArr));
        } catch (MainException e) {
            System.err.println(e.getMessage());
        }

    }
}

