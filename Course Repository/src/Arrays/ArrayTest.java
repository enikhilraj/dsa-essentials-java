package Arrays;

public class ArrayTest {

    public static void main(String[] args) {
        int[] myArray = new int[100];

        for(int num: myArray) {
            System.out.println(num + ", ");
        }

        Object[] myObjArray = new Object[10];

        for(Object o: myObjArray) {
            System.out.println(o + ", ");
        }
    }

}
