import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Task1

        int [] mass = new int[] {1,2,3};
        float [] mass1 = new float[] {1.57F, 7.654F, 9.986F};

        int [] random = new int[] {2,8,6};


        //Task2

        int [] random1 = new int[3];
        random1[0] = 2;
        random1[1] = 8;
        random1[2] = 6;

        for (int index = 0; index < random1.length; index++){
            if (index == random1.length - 1) {
                System.out.println(random1[index]);
                break;
            }
            System.out.print(random1[index] + ",");
        }

        //Task3

        int [] random2 = new int[3];
        random2[0] = 2;
        random2[1] = 8;
        random2[2] = 6;

        for (int index = 0; index < random2.length / 2; index++){
            int revers = random2[index];
            random2[index] = random2[random2.length - 1 - index];
            random2[random2.length - 1 - index] = revers;

            }
            System.out.print(Arrays.toString(random2));

        System.out.println();

        //Task4

        int [] mass2 = new int[] {1,2,3};
        for (int i = 0; i < mass2.length; i++) {
            boolean worked = i % 2 == 0;
            if (worked) {
                mass2[i] += 1;
                System.out.print(mass2[i] + ",");
            } else {
                System.out.print(mass2[i] + ",");
            }
        }


            }

        }


