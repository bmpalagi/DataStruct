import java.util.Stack;
import java.util.LinkedList;
import java.util.ListIterator;

public class MazeSolverDemo
{
   public static void main(String[] args)
   {
      System.out.println("A maze without cycles.");
      Maze maze = new Maze(new String[] {
         "*****************************",
         "** ***                      *",
         "** *** * ********************",
         "** *** *         *          *",
         "** *** * *******   **** *****",
         "**     * ************** *****",
         "****** ******* *******  *****",
         "******         ******* ******",
         "*      ******* ******* ******",
         "* **** ******* **           *",
         "*    ********* ******* ******",
         "* ****         ***     ******",
         "************** **************"}
      );

      MazeSolver.solve(maze, 5, 8);


   }
}
