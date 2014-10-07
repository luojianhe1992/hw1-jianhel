package cmu.jianhel.hw1;



import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.jcas.JCas;

import com.aliasi.chunk.Chunk;

import com.aliasi.chunk.Chunker;

import com.aliasi.chunk.Chunking;

import com.aliasi.util.AbstractExternalizable;

public class jianhelAnnotator extends JCasAnnotator_ImplBase {

  @Override
  public void process(JCas aJCas) throws AnalysisEngineProcessException {
    
    //make the JCas file into String
    String text = aJCas.getDocumentText();
    
    //store the position
    int begin = 0;
    int end = 0;
    
    //initialize the file
    File modelFile = new File("./home/jianhe/git/hw1-jianhel/hw1-jianhel/modelFromLingpipe/ne-en-bio-genetag.HmmChunker");
    
    //initialize the chunker as null
    Chunker chunker = null;
    
    try{
      chunker = (Chunker) AbstractExternalizable.readObject(modelFile);
    }
    catch (IOException e1)
    {
      e1.printStackTrace();
    }
    catch (ClassNotFoundException e1)
    {
      e1.printStackTrace();
    }
    
    //use the "\n" to divide into different pattern
    Pattern eol = Pattern.compile("\n");
    
    //and also according to the pattern to divide into matcher
    Matcher matcher = eol.matcher(text);
    
    //find out the biology phrase
    while ( matcher.find()){
      end = matcher.start();
      String line = text.substring(begin , end);
      String[] fields = line.split(" ",2);
      Chunking chunking = chunker.chunk(fields[1]);
      Iterator<Chunk> citer = chunking.chunkSet().iterator();
      
      //set value for the typeSystem
      while( citer.hasNext())
      {
        Chunk c = citer.next();
        jianhelTypeSystem j = new jianhelTypeSystem();
        
        //the sentence position
        j.setFnTypeSystem1(fields[0]);
        
        //the gene name
        j.setFnTypeSystem4(fields[1].substring(c.start(),c.end()));
        
        
        //the start position
        j.setFnTypeSystem2(c.start());
        
        //the end position
        j.setFnTypeSystem3(c.end());
        
      }
      //make the pointer move, and move to another sentence to annotate
     begin = matcher.end();
    }
  }
}
