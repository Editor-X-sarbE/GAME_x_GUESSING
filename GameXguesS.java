import javax.swing.JOptionPane;

public class GameXguesS 
{ 
    static int randomnumber = 1+(int)(5 * Math.random());
    static int atempt=0;
    static int inputno;

    public GameXguesS()
    {
      JOptionPane.showMessageDialog(null,"WELCOME TO THE NUMBER GUESSING  GAME \n             YOU HAVE  5  ATEMPTS :", "INSTRUCTIONS", JOptionPane.INFORMATION_MESSAGE);

      try 
      {
          while(inputno !=randomnumber)
            {
                if(atempt==5)
                {
                JOptionPane.showMessageDialog(null, "YOU  HAS  MAXIMUM  REACHED , COMPUTER  NUMBER= " + randomnumber, " PLEASE  TRY AGAIN :", JOptionPane.ERROR_MESSAGE);
                break;
                }
                 String x=JOptionPane.showInputDialog(null, "GUESS  THE  NUMBER  BETWEEN  \n                0-10 ", "GAME_x_GUESSING", JOptionPane.QUESTION_MESSAGE);
                inputno = Integer.parseInt(x);

             if(inputno == randomnumber)
             {

               JOptionPane.showMessageDialog(null, "CONGRATULATION  YOU  GUESSED  THE  NUMBER ", "MESSAGE",JOptionPane.INFORMATION_MESSAGE);
               atempt++;
               
              if (atempt == 1) 
              {
              JOptionPane.showMessageDialog(null, "NICE  TRY YOUR SCORE IS = 100 ", "MESSAGE",JOptionPane.INFORMATION_MESSAGE);
              }
              if (atempt == 2) 
              {  
                 JOptionPane.showMessageDialog(null, "NICE  TRY YOUR SCORE IS = 80", "MESSAGE",JOptionPane.INFORMATION_MESSAGE);
              }
              if (atempt == 3) 
              {
                JOptionPane.showMessageDialog(null, "NICE  TRY YOUR SCORE IS = 60", "MESSAGE",JOptionPane.INFORMATION_MESSAGE);
              }
              if (atempt == 4) 
              {
               JOptionPane.showMessageDialog(null, "NICE  TRY YOUR SCORE IS = 40", "MESSAGE",JOptionPane.INFORMATION_MESSAGE);
              }
              if (atempt == 5) 
              {
                JOptionPane.showMessageDialog(null, "NICE  TRY YOUR SCORE IS = 20", "MESSAGE",JOptionPane.INFORMATION_MESSAGE);
                break;
              }
            }
            else if (inputno > randomnumber) 
            {
                JOptionPane.showMessageDialog(null,"ENTER < ("+inputno+") NUMBERS", "OPTIONS :",JOptionPane.NO_OPTION);
                atempt++;
            } 
            else if (inputno < randomnumber) 
            {
                JOptionPane.showMessageDialog(null, "ENTER > ("+inputno+") NUMBERS", "OPTIONS :",JOptionPane.NO_OPTION);
                atempt++;
            } 
            else 
            {
                JOptionPane.showMessageDialog(null, "SORRY  PLEASE  TRY  AGAIN :", "INFORMATION", JOptionPane.ERROR_MESSAGE);
            }
        }
        System.exit(0);
      } 
      catch (Exception e) 
      {
        JOptionPane.showMessageDialog(null, "INPUT  NUMBER  :", "WARNNING", JOptionPane.ERROR_MESSAGE);
      }
    }

    public static void main(String[] args) 
    {
       new GameXguesS();    
    }
}
