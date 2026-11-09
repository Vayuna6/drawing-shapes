public class ShapesFinal {
    public static void main(String[] args) {
    Turtle jana = new Turtle ();
       
        // Task 1: Draw a regular shape
         for (int i = 0; i <= 5; i++){
         jana.forward(50);
         jana.right(72);
         }

         
        // Task 2: Draw a regular shape many times
        jana.up();
        jana.left(180);
        jana.forward(100);
        jana.down();
        for (int n = 0; n <= 9; n++)
        {
            for (int i = 0; i <= 5; i++)
            {
             jana.forward(50);
               jana.right(72);
            }
            jana.right(80);
        }   
        

        


        // Task 3: How many times does Turtle turn!
        int sumTurn = 0;
         for (int n = 0; n <= 9; n++)
        {
            for (int i = 0; i <= 5; i++)
            {
             jana.forward(50);
               jana.right(72);
               sumTurn = sumTurn +1;
            }
            jana.right(80);
            sumTurn = sumTurn + 1;
        }   

         System.out.println("Jana has turned a total of " + sumTurn + " times");

        // Extension 1:


        // Extension 2:

    }
}
