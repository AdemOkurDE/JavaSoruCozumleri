package s04_forLoops;

public class S12_NestedForLoop {
    /*
    Soru – Asagidaki sekilleri yazdirin
            * 		    * * * * * * * * * 		* * * * * * *
            * * 		* * * * * * * * * 		* * * * *
            * * * 		* * * * * * * * * 		* * *
            * * * * 	* * * * * * * * * 		*
     */
    public static void main(String[] args) {
        System.out.println("Sekil - 1 :\n");
        for (int i = 1; i <5 ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }

        System.out.println("\nSekil - 2 :\n");
        for (int i = 1; i <5 ; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }

        System.out.println("\nSekil - 3 :\n");
        for (int i = 7; i >0 ; i--,i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }

    }
}
