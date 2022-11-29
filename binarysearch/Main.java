package binarysearch;

public class Main {
    private boolean BinarySearch(int[] Arr, int L, int R, int value) {
        //Base ***TODO
        if(L == R) return false;
        
        int middle = (L+R)/2;
        if(Arr[middle] == value) return true;
        
        if(value > Arr[middle]) {
            L = middle + 1;
        } 
        else {
            R = middle - 1;
        }
        return BinarySearch(Arr, L, R, value);
        
    }
    
    public static void main(String[] args) {
        int[] Arr = {0,10,20,30,40,50,60,70,80,90};
        int objective = 60;
        
        boolean located = 
        new Main().BinarySearch(Arr, 0, Arr.length-1, objective);
        System.out.println("Located: " + located);
    }
}
