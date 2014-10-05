package cmu.jianhel.hw1;


/* First created by JCasGen Tue Sep 23 13:35:53 EDT 2014 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Tue Sep 23 13:35:53 EDT 2014
 * XML source: /home/jianhe/workspace/hw1-jianhel/src/main/resources/typeSystemDescriptor.xml
 * @generated */
public class jianhelTypeSystem extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(jianhelTypeSystem.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected jianhelTypeSystem() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public jianhelTypeSystem(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public jianhelTypeSystem(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public jianhelTypeSystem(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: fnTypeSystem1

  /** getter for fnTypeSystem1 - gets 
   * @generated
   * @return value of the feature 
   */
  public String getFnTypeSystem1() {
    if (jianhelTypeSystem_Type.featOkTst && ((jianhelTypeSystem_Type)jcasType).casFeat_fnTypeSystem1 == null)
      jcasType.jcas.throwFeatMissing("fnTypeSystem1", "jianhelTypeSystem");
    return jcasType.ll_cas.ll_getStringValue(addr, ((jianhelTypeSystem_Type)jcasType).casFeatCode_fnTypeSystem1);}
    
  /** setter for fnTypeSystem1 - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setFnTypeSystem1(String v) {
    if (jianhelTypeSystem_Type.featOkTst && ((jianhelTypeSystem_Type)jcasType).casFeat_fnTypeSystem1 == null)
      jcasType.jcas.throwFeatMissing("fnTypeSystem1", "jianhelTypeSystem");
    jcasType.ll_cas.ll_setStringValue(addr, ((jianhelTypeSystem_Type)jcasType).casFeatCode_fnTypeSystem1, v);}    
   
    
  //*--------------*
  //* Feature: fnTypeSystem2

  /** getter for fnTypeSystem2 - gets 
   * @generated
   * @return value of the feature 
   */
  public int getFnTypeSystem2() {
    if (jianhelTypeSystem_Type.featOkTst && ((jianhelTypeSystem_Type)jcasType).casFeat_fnTypeSystem2 == null)
      jcasType.jcas.throwFeatMissing("fnTypeSystem2", "jianhelTypeSystem");
    return jcasType.ll_cas.ll_getIntValue(addr, ((jianhelTypeSystem_Type)jcasType).casFeatCode_fnTypeSystem2);}
    
  /** setter for fnTypeSystem2 - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setFnTypeSystem2(int v) {
    if (jianhelTypeSystem_Type.featOkTst && ((jianhelTypeSystem_Type)jcasType).casFeat_fnTypeSystem2 == null)
      jcasType.jcas.throwFeatMissing("fnTypeSystem2", "jianhelTypeSystem");
    jcasType.ll_cas.ll_setIntValue(addr, ((jianhelTypeSystem_Type)jcasType).casFeatCode_fnTypeSystem2, v);}    
   
    
  //*--------------*
  //* Feature: fnTypeSystem3

  /** getter for fnTypeSystem3 - gets 
   * @generated
   * @return value of the feature 
   */
  public int getFnTypeSystem3() {
    if (jianhelTypeSystem_Type.featOkTst && ((jianhelTypeSystem_Type)jcasType).casFeat_fnTypeSystem3 == null)
      jcasType.jcas.throwFeatMissing("fnTypeSystem3", "jianhelTypeSystem");
    return jcasType.ll_cas.ll_getIntValue(addr, ((jianhelTypeSystem_Type)jcasType).casFeatCode_fnTypeSystem3);}
    
  /** setter for fnTypeSystem3 - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setFnTypeSystem3(int v) {
    if (jianhelTypeSystem_Type.featOkTst && ((jianhelTypeSystem_Type)jcasType).casFeat_fnTypeSystem3 == null)
      jcasType.jcas.throwFeatMissing("fnTypeSystem3", "jianhelTypeSystem");
    jcasType.ll_cas.ll_setIntValue(addr, ((jianhelTypeSystem_Type)jcasType).casFeatCode_fnTypeSystem3, v);}    
   
    
  //*--------------*
  //* Feature: fnTypeSystem4

  /** getter for fnTypeSystem4 - gets 
   * @generated
   * @return value of the feature 
   */
  public String getFnTypeSystem4() {
    if (jianhelTypeSystem_Type.featOkTst && ((jianhelTypeSystem_Type)jcasType).casFeat_fnTypeSystem4 == null)
      jcasType.jcas.throwFeatMissing("fnTypeSystem4", "jianhelTypeSystem");
    return jcasType.ll_cas.ll_getStringValue(addr, ((jianhelTypeSystem_Type)jcasType).casFeatCode_fnTypeSystem4);}
    
  /** setter for fnTypeSystem4 - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setFnTypeSystem4(String v) {
    if (jianhelTypeSystem_Type.featOkTst && ((jianhelTypeSystem_Type)jcasType).casFeat_fnTypeSystem4 == null)
      jcasType.jcas.throwFeatMissing("fnTypeSystem4", "jianhelTypeSystem");
    jcasType.ll_cas.ll_setStringValue(addr, ((jianhelTypeSystem_Type)jcasType).casFeatCode_fnTypeSystem4, v);}    
  }

    