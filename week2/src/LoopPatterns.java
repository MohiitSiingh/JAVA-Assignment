public class LoopPatterns {
    public static void main(String[] args) {
        System.out.println("Printing different pattern of number and * ");
        System.out.println("Pattern A : " );
        RectangularPattern();

        System.out.println("Pattern B : " );
        TriangularPattern();

         System.out.println("Pattern C : " );
         TriangularPatternUp();

          System.out.println("Pattern D : " );
          PatternforNumTriangular();

          System.out.println("Pattern E : " );
          PatternforNum();

    }
    static void RectangularPattern(){
        for(int i = 0 ; i < 4 ; i++){
            for(int j = 0 ; j < 4 ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void TriangularPattern(){
        for (int i = 0 ; i < 4 ; i++){
            for(int j = 0 ; j <= i ; j++){
                System.out.print("* ");
            }
             System.out.println();
        }
    }
       static void TriangularPatternUp(){
        for (int i = 4 ; i > 0 ; i--){
            for(int j = i ; j < 0 ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void PatternforNumTriangular(){
        for (int i = 1 ; i <= 4 ; i++){
            for(int j = 1 ; j <= i; j++){
                System.out.print(" " + j);
            }
             System.out.println();
        }
    }
     static void PatternforNum(){
        for (int i = 1 ; i <= 4 ; i++){
            for(int j = 1 ; j <= i; j++){
                System.out.print(" " +i);
            }
             System.out.println();
        }
    }
}
