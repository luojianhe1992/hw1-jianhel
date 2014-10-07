package cmu.jianhel.hw1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import org.apache.uima.cas.CAS;
import org.apache.uima.cas.CASException;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.collection.CasConsumer_ImplBase;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.tcas.Annotation;
import org.apache.uima.resource.ResourceProcessException;



import cmu.jianhel.hw1.jianhelTypeSystem;
import cmu.jianhel.hw1.Evaluater;

public class jianhelCasConsumer extends CasConsumer_ImplBase {


  //get annotated data from CAS, and output formatted data to file.
   
  @Override
  public void processCas(CAS aCAS) throws ResourceProcessException {
    //define the JCas variable
    JCas jcas;
    
    //use the class Evaluater in the file of Evaluator.java
    Evaluater evaluater = new Evaluater();
    
    //define the variable path to store the output file
    String path = "./hw1-jianhel.out";
    
    try {
      
      //make the file from CAS to JCas
      jcas = aCAS.getJCas();
      
      
      //set evaluater's answer text, and later use the file sample.out to compare
      String pathname = "./src/main/resources/sample.out"; //set answer file's path 
      
      //use the function to evaluate the precision
      evaluater.setAnswerText(pathname);
      
      //define the variable to store the output file
      FileWriter fw = new FileWriter(path,true);
      
      //define the variable to store the output file
      BufferedWriter bw = new BufferedWriter(fw); 
      
      //define the variable to JCas file's index
      FSIterator<Annotation> it = jcas.getAnnotationIndex(jianhelTypeSystem.type).iterator();
      
      //use to count
      int total_ans = 0;
      while(it.hasNext())
      {
        //use the variable to iterately output the file
        jianhelTypeSystem ga = (jianhelTypeSystem) it.next();
          bw.write(ga.getFnTypeSystem1() + "|" + ga.getFnTypeSystem2() + " " + ga.getFnTypeSystem3() + 
                  "|" + ga.getFnTypeSystem4());
        bw.newLine();
        
        //judge the precision
        evaluater.judgeAnswer(ga.getFnTypeSystem4());
        
        //count the answer
        total_ans++;
      }
      
      //finish the buffer
      bw.close();
      
      //finish the writer
      fw.close();
      
      //use the function to calculate the precision
      evaluater.setAnswernum(total_ans);
      
      
    } catch (CASException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    evaluater.printReport();
    
  }
        
}
