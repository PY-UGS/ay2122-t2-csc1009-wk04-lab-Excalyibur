import java.util.Arrays;
import java.io.*;
import java.util.*;

public class StackLab4 {
    public static void main(String[] args) {
        Stack stackprog = new Stack();

        for (int i=0;i<10; i++) {
            stackprog.push(i);
        }
            //System.out.println(Arrays.toString(stackprog.printstack()));
        while (!stackprog.Empty()){
            //System.out.println(Arrays.toString(stackprog.printstack()));
            System.out.print(stackprog.pop()+" ");



        }

    }
}

