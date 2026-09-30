public class ArrayPrac {
public static void main(String[] args) {
    

    int [] arr1 = {1,2,3};

    int [] arr2 = {2,2,3,3,4};

    int []result = new int[arr1.length + arr2.length];

    int i = 0 ;
    int j = 0 , k = 0;

    while(i < arr1.length && j < arr2.length)
    {
        if(arr1[i] > arr2[j])
        {
            result[k] = arr2[j];
            k++;
            j++;
        }
    
        else
        {
            result[i] = arr1[i];
            k++;
            i++;
        }
    }

    while(i < arr1.length)
    {
        result[k] = arr1[i];
        i++;
        k++;
    }
    while(j < arr2.length)
    {
        result[k] = arr2[j];
        i++;
        j++;
    }
    for(int h = 0 ; h < result.length ; h++)
    System.out.println(result[h]);
    }
}
