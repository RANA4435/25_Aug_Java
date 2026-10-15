import java.util.*;

class searchElement
{
    public static void main(String args[])
    {
        int[] arr = new int[5];
        int lastNumber = 0;

        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = Integer.parseInt(args[i]);

            if(i == arr.length - 1)
            {
                lastNumber = arr[i];
            }
        }

        for (int i=0; i< arr.length; i++){
			if (lastNumber == arr[i]){
				System.out.println("find");
				return;
		}
		}
		
    }
}