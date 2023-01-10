public class Selection {
    void selectionSort(int arr[])
    {
        int pos;
        int temp;
        for (int i = 0; i < arr.length; i++)
        {
            pos = i;
            for (int j = i+1; j < arr.length; j++)
            {
                if (arr[j] < arr[pos])                  //find the index of the minimum element
                {
                    pos = j;
                }
            }

            temp = arr[pos];            //swap the current element with the minimum element
            arr[pos] = arr[i];
            arr[i] = temp;
        }
    }

    void display(int arr[])                     //display the array
    {
        for (int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

}
