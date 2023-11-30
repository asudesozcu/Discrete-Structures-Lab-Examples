
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author sozcu
 */
public class q3 {

    static char [] intersection(char[] arr, char unıon[]) {
        int number = 0;
        String check = "";
        for (int i = 0; i < unıon.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (unıon[i] == arr[j]) {
                    number++;
                    break;
                }
            }
            if (number == 1) {
                check += unıon;
            }
            number = 0;
        }
        char [] newarr= new char [check.length()];
        for (int i = 0; i < newarr.length; i++) {
            newarr[i]=check.charAt(i);
            
        } return newarr;
    }
    
char [] union(char [] A, char [] B){
    char []newarr;
    int samechcount=0;
    
    for (int i = 0; i < A.length; i++) {
        for (int j = 0; j < B.length; j++) {
            if(A[i]==B[j]){
                samechcount++;
                break;
            }
            
        }
    } newarr= new char[A.length+B.length-samechcount];
    int k=0;
    for (int i = 0; i < A.length; i++) {
        newarr [k++]=A[i];
        
    }
    for (int i = 0; i < B.length; i++) {
        boolean exist=false;
        for (int j = 0; j < newarr.length; j++) {
            if(B[i]== newarr[j]){
                exist=true;
                break;
            }
        }if(!exist){
            newarr[k++]=B[i];
        }
        
    } return newarr;
}
    public static void main(String[] args) {
        char a[] = {'b', 'd', 'g', 'h'};
        char u[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        char b[] = {'a', 'b', 'g'};
        char ch[ ]=intersection(a, u);
        
       

    }
        
    
}
