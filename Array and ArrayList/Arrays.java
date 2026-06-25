import java.util.*;

public class Arrays {
    
    public static void main(String[] args) {
        
        //synatx:
        // datatype[] var = new datatype[size];

        // int[] rollno = new  int[5];
        // //or dirctly:
        // int[] rollno2 = {1,346,7,85,3};

        int[] ros;        // declaration of array ros is defined in the stack.
        ros = new int[5]; // initialisation: actually here the object is being created in the memory(heap).
        
        // 1. Array obejects are in heap.
        // 2. Heap objects are not continous java say that.
        // 3. Dynamic memory allocatiion. (at runtime).
        // Hence : Array in the java(internally) may not be continous. reason - JVM
        //             but theoritically arrays are contionous.

        // in java it is depend on the JVM is that it in the continous manner or not.
        

        // arrays element is accessed by the indeces.

        System.out.println("ans is :" + ros[1]);   //return 0.  initally have zero.

        String[] str = new String[5];
        System.out.println("ans is :"+str[2]);   // retun null. initially. 

        // String sttr = null;    //you con assign nll to the not-premitives(like String).
        // int k = null;          //null not assigned to the primitives(like int).



        // take input
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i =0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        // output:
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i] + " ");
            
        }

        for(int i : arr){  //forEach loop.
            System.out.println(i+ " ");
        }

    }
}
