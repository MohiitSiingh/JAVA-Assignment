public class LoopPatterns {
    public static void main(String[] args) {
        System.out.println("Printing different pattern of number and * ");
        System.out.println("Pattern A : " );
        RectangularPattern(4);

        System.out.println("Pattern B : " );
        TriangularPattern(4);

         System.out.println("Pattern C : " );
         TriangularPatternUp(4);

          System.out.println("Pattern D : " );
          PatternforNumTriangular(4);

          System.out.println("Pattern E : " );
          PatternforNum(4);

    }
    static void RectangularPattern(int size){
       
        for(int i = 0 ; i < size ; i++){
            for(int j = 0 ; j < size ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void TriangularPattern(int size){
        for (int i = 0 ; i < size ; i++){
            for(int j = 0 ; j <= i ; j++){
                System.out.print("* ");
            }
             System.out.println();
        }
    }
       static void TriangularPatternUp(int size){
        for (int i = size ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void PatternforNumTriangular(int size){
        for (int i = 1 ; i <= size ; i++){
            for(int j = 1 ; j <= i; j++){
                System.out.print(" " + j);
            }
             System.out.println();
        }
    }
     static void PatternforNum(int size){
        for (int i = 1 ; i <= size ; i++){
            for(int j = 1 ; j <= i; j++){
                System.out.print(" " +i);
            }
             System.out.println();
        }
    }
}
