import java.io.*;
import java.util.*;
/**
 * Клас Lab2 реалізує програму до лабораторної роботи №2
 *
 * @author Flyk Yevhenii
 * @version 1.0
 * @since version 1.0
 *
 */

public class Lab2FlykKI35 {
    /**
     * Статичний метод main є точкою входу в програму
     *
     * @param args
     * @throws FileNotFoundException
     *
     */

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        File name = new File("LAB_02.txt");
        PrintWriter fout = new PrintWriter(name);
        System.out.println("Enter the size of the square matrix: ");
        int size = in.nextInt();
        char[][] arr = new char[size][];

        for(int i = 0; i < size; ++i) {
            if (i + 1 <= size / 2) {
                arr[i] = new char[i + 1];
            } else {
                arr[i] = new char[size - i];
            }
        }

        System.out.println("Enter a placeholder character: ");
        String character = in.nextLine();
        character = in.nextLine();

        //System.out.println("Enter a second placeholder character: ");
        //String character2 = in.nextLine();
        //character2 = in.nextLine();


        label54:
        for(int i = 0; i < size; ++i) {
            int chIt;
            for(chIt = 0; chIt < arr[i].length; ++chIt) {
                if (character.length() != 1) {
                    if (character.length() == 0) {
                        System.out.println("No character entered");
                    } else {
                        System.out.println("Too many character entered");
                    }
                    break label54;
                }
                arr[i][chIt] = (char) character.codePointAt(0);
                if(i==size/2){
                    if(chIt%2==1){

                        arr[i][chIt] ='o';
                    }
                }
            }

            for(chIt = 0; chIt < size - arr[i].length; ++chIt) {
                System.out.print("  ");
                fout.print("  ");
            }

            for(chIt = 0; chIt < arr[i].length; ++chIt) {
                System.out.print(arr[i][chIt] + " ");
                fout.print(arr[i][chIt] + " ");
            }

            fout.print("\n");
            System.out.print("\n");
        }

        fout.close();
    }
}
