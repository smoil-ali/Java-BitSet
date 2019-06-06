import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        BitSet b1=new BitSet(n);
        BitSet b2=new BitSet(n);
        for(int i=0;i<m;i++){
            String op=sc.next();
            int val1=sc.nextInt();
            int val2=sc.nextInt();
            if(op.equals("AND")){
                if(val1==1){
                    b1.and(b2);
                    System.out.println(b1.cardinality()+" "+b2.cardinality());
                }else{
                    b2.and(b1);
                    System.out.println(b1.cardinality()+" "+b2.cardinality());
                }
            }else if(op.equals("OR")){
                if(val1==1){
                    b1.or(b2);
                    System.out.println(b1.cardinality()+" "+b2.cardinality());
                }else{
                    b2.or(b1);
                    System.out.println(b1.cardinality()+" "+b2.cardinality());
                }
            }else if(op.equals("XOR")){
                if(val1==1){
                    b1.xor(b2);
                    System.out.println(b1.cardinality()+" "+b2.cardinality());
                }else{
                    b2.xor(b1);
                    System.out.println(b1.cardinality()+" "+b2.cardinality());
                }
            }else if(op.equals("FLIP")){
                if(val1==1){
                    b1.flip(val2);
                    System.out.println(b1.cardinality()+" "+b2.cardinality());
                }else{
                    b2.flip(val2);
                    System.out.println(b1.cardinality()+" "+b2.cardinality());
                }
            }else if(op.equals("SET")){
                if(val1==1){
                    b1.set(val2);
                    System.out.println(b1.cardinality()+" "+b2.cardinality());
                }else{
                    b2.set(val2);
                    System.out.println(b1.cardinality()+" "+b2.cardinality());
                }
            }

        }
       
    }
}

