import java.util.Stack;
import java.util.Set;
import java.util.HashSet;
/**
   Modify the maze solver program of Section 15.6.4 (below)
   to handle mazes with cycles.
   Keep a set of visited intersections.
   When you have previously seen an intersection, treat it
   as a dead end and do not add paths to the stack.
*/
public class MazeSolver
{
   /**
      Traverses a maze, printing out a path to the exit.
      @param maze the maze
      @param param the row of the starting position
      @param param the column of the starting position
   */
   public static void solve(Maze maze, int row, int column)
   {
      Stack<Path> s = new Stack<>();
      Stack<Path> usedPaths = new Stack<>();
      Stack<Path> finalPath = new Stack<>();
      boolean bool = true;
      for (Path p : maze.pathsFrom(row, column))
      {
         s.push(p);
      }
      while(!s.isEmpty()&& bool){
        Path path = s.pop();
        usedPaths.push(path);
        if(maze.isExit(path.getEndingRow(), path.getEndingColumn())){
            System.out.println("Yay");
            finalPath.push(path);
            bool = false;
        }
        for (Path p : maze.pathsFrom(path.getEndingRow(), path.getEndingColumn()))
        {
            if(!path.isOpposite(p)){
                s.push(p);
            }
        }
      }
     
      while(!usedPaths.isEmpty()){
        Path possPath = usedPaths.pop();
        if(possPath.getEndingRow() == finalPath.peek().getStartingRow() &&
        possPath.getEndingColumn() == finalPath.peek().getStartingColumn()){
            finalPath.push(possPath);
        } 
        }
       while(!finalPath.isEmpty()){
        System.out.println(finalPath.pop());
      }
    }
}