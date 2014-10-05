package cmu.jianhel.hw1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;


//define to calculate the precision

public class Evaluater {
  
  //the initialized value of the attribute
    private int correct_num = 0;
    private int answer_num = 0;
    private int supposed_num = 0;
    private String AnswerText = "";
    
   //use to set the answer text
    public void setAnswerText(String pathname) throws IOException
    {
      //use the variable file to store the answer file
      File filename = new File(pathname);
      InputStreamReader reader = new InputStreamReader(new FileInputStream(filename)); 
      BufferedReader br = new BufferedReader(reader); 
      StringBuffer sb = new StringBuffer();
      String line = "";  
      
      //use the function the read the file a line by a line, which define below
      line = br.readLine();  
      while (line != null) {  
          line = br.readLine(); //one line each time
          sb.append(line);
          supposed_num++;
      }
      br.close();
      reader.close();
      AnswerText = sb.toString();
    }
    
    //the function is used to calculated the precision
    public double getPrecision()
    {
      return (double)correct_num / answer_num;
    }
    
    //the function is used to calculate the recall
    public double getRecall()
    {
      return (double)correct_num / supposed_num;
    }
    
    
    //the function is used to make judgement about whether the answer is right
    public void judgeAnswer(String ans)
    {
      if(AnswerText == "") return;
      if(AnswerText.contains(ans))
      {
        correct_num++;
      }
    }
    
    
    public void setAnswernum(int num)
    {
      answer_num = num;
    }

    /**
     * Calculate F-Score:
     * F-Score = 2 * precision * recall / (precision + recall)
     * @return FScore
     */
    
    //calculate the fScore
    public double getfScore()
    {
      double precision = getPrecision();
      double recall = getRecall();
      return 2.0*precision*recall / (precision + recall);
    }
    
    //print out function
    public void printReport()
    {
      System.out.println();
      System.out.println("Correct Num:" + correct_num);
      System.out.println("Total Returned Answer:" + answer_num);
      System.out.println("Supposed Answer Num:" + supposed_num);
      System.out.println("Precision:" + getPrecision());
      System.out.println("Recall:" + getRecall());
      System.out.println("F-score:" + getfScore());
    }
}