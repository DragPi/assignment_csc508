import java.util.Scanner;

public class AllSort {
    public static void main(String[] args) {
        int[] Stugrade = new int[0];
        int size;
        int sgpos = 0;
        int stupos;
        int index;
        int GradeInput;
        int option;
        int sortoption;
        boolean loop = true;
        boolean sortloop = true;
        boolean ask = true;
        Scanner sc = new Scanner(System.in);
        Selection selsort = new Selection();
        Heap heapsort = new Heap();
        Insertion insertsort = new Insertion();
        Merge Mergesort = new Merge();
        utility util = new utility();

        do {
            if (ask)
            {
                System.out.println("insert amount of student : ");
                size = sc.nextInt();
                Stugrade = new int[size];
                ask = false;
            }
            System.out.println("Menu ");
            System.out.println("1 - enter student grade in array");
            System.out.println("2 - display student grade list");
            System.out.println("3 - display student grade at index #");
            System.out.println("4 - sort array");
            System.out.println("5 - exit");
            System.out.println("Enter option : ");
            option = sc.nextInt();
            System.out.println(" ");

            switch (option)
            {
                case 1:

                    if (sgpos >= Stugrade.length)
                    {
                        System.out.println("student amount is "+Stugrade.length+" can't enter more student grade!");
                        System.out.println(" ");
                        util.timeDelay(1000);
                    }
                    else
                    {
                        System.out.println("Enter student grade for student no "+(sgpos+1)+" : ");
                        GradeInput = sc.nextInt();
                        util.timeDelay(1000);
                        if (GradeInput < 0 || GradeInput >100)
                        {
                            System.out.println("The grad you enter is invalid");
                        }
                        else
                        {
                            Stugrade[sgpos] = GradeInput;
                            sgpos++;
                        }

                    }
                    break;

                case 2:
                    stupos = 0;
                    System.out.println("=================================");
                        for (int i = 0; i < Stugrade.length ;i++)
                        {
                            if(Stugrade[stupos] >= 0 && Stugrade[stupos] <= 100)
                            {
                                System.out.println("student "+(stupos+1)+" : "+Stugrade[i]);
                                stupos++;
                            }
                        }
                    System.out.println("=================================");
                    System.out.println(" ");
                    break;
                case 3:
                    System.out.println("enter student number to display student grade");
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
                                System.out.println(" ");
                                heapsort.display(Stugrade);
                                System.out.println(" ");
                                System.out.println(" ");
                                sortloop = false;
                                break;
                            case 2:
                                insertsort.insertionSort(Stugrade, Stugrade.length);
                                System.out.println(" ");
                                insertsort.display(Stugrade);
                                System.out.println(" ");
                                System.out.println(" ");
                                sortloop = false;
                                break;
                            case 3:
                                Mergesort.mergeSort(Stugrade,0, Stugrade.length-1);
                                System.out.println(" ");
                                Mergesort.display(Stugrade);
                                System.out.println(" ");
                                System.out.println(" ");
                                sortloop = false;
                                break;
                            case 4:
                                selsort.selectionSort(Stugrade);
                                System.out.println(" ");
                                selsort.display(Stugrade);
                                System.out.println(" ");
                                System.out.println(" ");
                                sortloop = false;
                                break;
                            case 5:
                                sortloop = false;
                                break;
                            default:
                                System.out.println("option didn't exist");
                        }
                    }while (sortloop);
                    break;
                case 5:
                    loop = false;
                    break;
                default:
                    System.out.println("option didn't exist");
                    break;
            }
        }while(loop);


    }

}