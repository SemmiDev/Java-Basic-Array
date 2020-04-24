package Array.tahap1;

public class Main {
    public static void main(String[] args) {   
        int[] arr = new int[10];
        int nElems = 0;
        arr[0] = 1;
        nElems++;
        arr[1] = 2;
        nElems++;
        arr[2] = 3;
        nElems++;
        arr[3] = 4;
        nElems++;
        arr[4] = 5;
        nElems++;
        arr[5] = 6;
        nElems++;
        
        for(int d : arr){
            System.out.println(d);
        }        
        
        
        // Linier search
        // sequential search
        int searchKey = 4;
        boolean found = false;
        
        for(int i = 0; i < nElems; i++){
            if(arr[i] == (searchKey)){
                found = true;
                break; // artinya kita tidak perlu melanjutkan pencariannya
            }
        }
        if(found)
            System.out.print("found!!!");
        else
             System.out.print("found!!!");
}
}
