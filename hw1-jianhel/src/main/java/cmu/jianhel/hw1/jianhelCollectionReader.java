package cmu.jianhel.hw1;
import org.apache.uima.collection.CollectionReader_ImplBase;
import org.apache.uima.jcas.JCas;




//the import part from the example
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.uima.cas.CAS;
import org.apache.uima.cas.CASException;
import org.apache.uima.collection.CollectionException;


//import org.apache.uima.jcas.JCas;

import org.apache.uima.resource.ResourceConfigurationException;
import org.apache.uima.resource.ResourceInitializationException;
import org.apache.uima.util.FileUtils;
import org.apache.uima.util.Progress;
import org.apache.uima.util.ProgressImpl;
//



public class jianhelCollectionReader extends CollectionReader_ImplBase {

  //use the String variable to store the URL of the input data
  public static final String PARAM_INPUTDIR = "InputDirectory";

  //use the arrayList variable to store the file
  private ArrayList<File> mFiles;

  
  //use the int variable to store the current index of the file
  private int mCurrentIndex;

  //initialize the resource
  public void initialize() throws ResourceInitializationException {
    
    //put the input directory into the File
    File directory = new File(((String) getConfigParameterValue(PARAM_INPUTDIR)).trim());
    
    //initialize the mCurrentIndex
    mCurrentIndex = 0;

    //exception throw
    if (!directory.exists() || !directory.isDirectory()) {
      throw new ResourceInitializationException(ResourceConfigurationException.DIRECTORY_NOT_FOUND,
              new Object[] { PARAM_INPUTDIR, this.getMetaData().getName(), directory.getPath() });
    }
    
    //use a file arraylist to store
    mFiles = new ArrayList<File>();
    
    //add the file from the directory
    addFilesFromDir(directory);
  }
  
  //add the file from the directory
  private void addFilesFromDir(File dir) {
    File[] files = dir.listFiles();
    for (int i = 0; i < files.length; i++) {
      if (!files[i].getName().equals("sample.in")){
        //if find the sample.in file, add the file into myfile.
        mFiles.add(files[i]);
        break;
      } 
    }
  }
  
  
  
  //judge if there is the next
  public boolean hasNext() {
    return mCurrentIndex < mFiles.size();
  }

  //get the next
  public void getNext(CAS aCAS) throws IOException, CollectionException {
    JCas jcas;
    try {
      jcas = aCAS.getJCas();
    } catch (CASException e) {
      throw new CollectionException(e);
    }

    //define the variable file to store the next file
    File file = (File) mFiles.get(mCurrentIndex++);
    String text = FileUtils.file2String(file);
  
    
    //put the content of the document in CAS
    jcas.setDocumentText(text);
  }
    

  //close the process
  public void close() throws IOException {
  }

  //get the new progress
  public Progress[] getProgress() {
    return new Progress[] { new ProgressImpl(mCurrentIndex, mFiles.size(), Progress.ENTITIES) };
  }


}
  
  
  
  


