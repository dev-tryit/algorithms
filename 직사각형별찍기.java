import java.util.Scanner;
import java.util.*;
import java.util.stream.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        IntStream.range(0,b).forEach((bI)->{
            if(bI>0) System.out.println();
            IntStream.range(0,a).forEach((aI)->{
                System.out.print("*");
            });
        });
    }
}
