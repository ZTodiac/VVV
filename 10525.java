/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Abdallah-PC
 */
 class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        // TODO code application logic here
       BufferedReader br;
        try {
        	//new FileReader("E:\\ComputerScience\\Fourth Year\\Eight\\CS315\\LEc18-3\\Qwerty\\file.txt")
            br = new BufferedReader(new InputStreamReader(System.in));
            String input1 = "";
       while ( (input1 = br.readLine()) != null)
       {
              String outy="";
              String input2 = br.readLine();
              String[] firstLine = input1.split("");
              String[] secondLine = input2.split("");
            for (int i = 0; i <firstLine.length;i++)
            {
                for (int j = 0; j < secondLine.length;j++)
                {
                    if (firstLine[i].equals(secondLine[j]))
                    {
                        String x=firstLine[i];
                        outy += x;
                        secondLine[j] =" ";
                        break;
                    }
                }
            }
            char []x=outy.toCharArray();
            Arrays.sort(x);
                System.out.println(x);
       }
       
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
