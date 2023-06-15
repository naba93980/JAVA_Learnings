package Array;
public class ArrayDemo{
    public static void main(String[] args) {
        int arr[];
        int arr2[]={10,20,30,40,50};
        int arr3[]=new int[3];  // default value are set based on datatype
        int arr4[]=new int[]{1,2,3,4,5};

        for(int element:arr4){
            System.out.println(element);
        }
    }
}