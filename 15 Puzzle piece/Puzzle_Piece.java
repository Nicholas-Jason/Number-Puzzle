
/**
 * Write a description of class Puzzle_Piece here.
 *
 * @author Nicholas-Jason Roache
 * @version June 12, 2018
 */

public class Puzzle_Piece
{
    // instance variables - replace the example below with your own
    int n = 0;
    String [][] puzzle;
    /**
     * Constructor for objects of class Puzzle_Piece
     */
    public Puzzle_Piece(int n)
    {
        // initialise instance variables
        this.n = n;
        puzzle = new String [n] [n];
    }

    public void populatePuzzle()
    {
        int x = 1;
        for(int i = 0;i< puzzle.length;i++)
        {
            for(int j = 0; j < puzzle[i].length;j++)
            {
                puzzle[i][j] = Integer.toString(x);
                x++;
                if(j == puzzle.length - 1 && i == puzzle.length - 1)
                {
                    puzzle[i][j] = " ";
                }
            }
            
        }
        
    }
    
    public void move_to_Right()
    {
        for(int i = 0;i< puzzle.length;i++)
        {
            for(int j = 0; j < puzzle[i].length;j++)
            {
                if(j < puzzle[i].length - 1)
                {
                    String temp = puzzle[i][j+1];
                    if (temp ==" ")
                    {
                        //Does not move other pieces
                        String prev = puzzle[i][j];
                        puzzle[i][j] = temp;
                        puzzle[i][j+1] = prev;
                        
                    }
                }
            }
        }
    }
    
    public void move_to_Left()
    {
     for(int i = 0;i< puzzle.length;i++)
        {
            for(int j = 0; j < puzzle[i].length;j++)
            {
                if(j >0)
                {
                    String temp = puzzle[i][j-1];
                    if (temp ==" ")
                    {
                        //Does not move other pieces
                        String prev = puzzle[i][j];
                        puzzle[i][j] = temp;
                        puzzle[i][j-1] = prev;
                        
                    }
                }
            }
        }
    }
    
    public void move_Down()
    {
        for(int i = 0;i< puzzle.length;i++)
        {
            for(int j = 0; j < puzzle[i].length;j++)
            {
                if(i + 1 != puzzle.length)
                {
                    String temp = puzzle[i+1][j];
                    if (temp ==" ")
                    {
                        //Does not move other pieces
                        String prev = puzzle[i][j];
                        puzzle[i][j] = temp;
                        puzzle[i+1][j] = prev;
                        
                    }
                }
            }
        }
    }
    
    public void move_Up()
    {
        for(int i = 0;i< puzzle.length;i++)
        {
            for(int j = 0; j < puzzle[i].length;j++)
            {
                if(i >0)
                {
                    String temp = puzzle[i-1][j];
                    if (temp ==" ")
                    {
                        //Does not move other pieces
                        String prev = puzzle[i][j];
                        puzzle[i][j] = temp;
                        puzzle[i-1][j] = prev;
                        
                    }
                }
            }
        }
    }
    
    public static void main(String [] args)
    {
        Puzzle_Piece p = new Puzzle_Piece(3);
        p.populatePuzzle();
        for(int o = 0; o < p.puzzle[2].length;o++)
        {
            System.out.println(p.puzzle[2][o]);
        }
        
        p.move_to_Right();
        p.move_Down();
        p.move_to_Left();
        p.move_Up();
        for(int m= 0; m < p.puzzle[2].length;m++)
        {
              System.out.println(p.puzzle[2][m]);
        }

        
    }
    }
    
    
    


    }
    
  
    
 
}
