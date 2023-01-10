import java.util.*;

public class AllSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Stugrade[] = new int[100];
        int sgpos = 0;
        int stupos =0;
        boolean loop = true;
        boolean sortloop = true;
        int option = 0;
        int sortoption = 0;
        int GradeInput = 0;
        int index = 0;
        Selection selsort = new Selection();
        Heap heapsort = new Heap();
        Insertion insertsort = new Insertion();
        Merge Mergesort = new Merge();

        do {
            System.out.println("Menu ");
            System.out.println("1 - enter student grade in array");
            System.out.println("2 - display student grade list");
            System.out.println("3 - display student grade at index #");
            System.out.println("4 - sort array");
            System.out.println("5 - exit");

            option = sc.nextInt();

            switch (option)
            {
                case 1:
                    System.out.println("Enter student grade for student no "+(sgpos+1));
                    GradeInput = sc.nextInt();
                    if (GradeInput < 0 || GradeInput >100)
                    {
                        System.out.println("The Number you enter is not invalid");
                    }
                    else
                    {
                        Stugrade[sgpos] = GradeInput;
                        sgpos++;
                    }
                    break;
                case 2:
                    stupos = 0;
                    if (Stugrade[0] < 0 || Stugrade[0] > 100)
                    {
                        System.out.println("Array is empty");
                    }
                    else
                    {
                        for (int i = 0; i < Stugrade.length ;i++)
                        {
                            if(Stugrade[stupos] > 0 && Stugrade[stupos] <= 100)
                            {
                                System.out.println((stupos+1)+" : "+Stugrade[i]);
                                stupos++;
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("enter index of student to display");
                    index = sc.nextInt();
                    if (index < 0 || index > 100)
                    {
                        System.out.println("error");
                        System.out.println("please try again");
                    }
                    else
                    {
                        System.out.println("Grade for student "+index+ " : "+Stugrade[index-1]);
                    }
                    break;
                case 4:
                    do {
                        System.out.println("Sort Option");
                        System.out.println("1 - Heap Sorting");
                        System.out.println("2 - Insert Sorting");
                        System.out.println("3 - Merge Sorting");
                        System.out.println("4 - Selection Sorting");
                        System.out.println("5 - return to menu");

                        System.out.println("enter option : ");
                        sortoption = sc.nextInt();

                        switch (sortoption)
                        {
                            case 1:
                                heapsort.heapSort(Stugrade);
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                sortloop = false;
                                break;
                        }
                    }while (sortloop);
                    break;
                case 5:
                    loop = false;
                    break;
                default:
                    System.out.println("Option didnt exist");
                    break;
            }
        }while(loop);


    }

}