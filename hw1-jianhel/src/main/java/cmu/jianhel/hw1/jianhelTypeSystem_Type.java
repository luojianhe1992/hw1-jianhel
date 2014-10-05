package cmu.jianhel.hw1;

/* First created by JCasGen Tue Sep 23 13:35:53 EDT 2014 */

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Tue Sep 23 13:35:53 EDT 2014
 * @generated */
public class jianhelTypeSystem_Type extends Annotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (jianhelTypeSystem_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = jianhelTypeSystem_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new jianhelTypeSystem(addr, jianhelTypeSystem_Type.this);
  			   jianhelTypeSystem_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new jianhelTypeSystem(addr, jianhelTypeSystem_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = jianhelTypeSystem.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("jianhelTypeSystem");
 
  /** @generated */
  final Feature casFeat_fnTypeSystem1;
  /** @generated */
  final int     casFeatCode_fnTypeSystem1;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getFnTypeSystem1(int addr) {
        if (featOkTst && casFeat_fnTypeSystem1 == null)
      jcas.throwFeatMissing("fnTypeSystem1", "jianhelTypeSystem");
    return ll_cas.ll_getStringValue(addr, casFeatCode_fnTypeSystem1);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setFnTypeSystem1(int addr, String v) {
        if (featOkTst && casFeat_fnTypeSystem1 == null)
      jcas.throwFeatMissing("fnTypeSystem1", "jianhelTypeSystem");
    ll_cas.ll_setStringValue(addr, casFeatCode_fnTypeSystem1, v);}
    
  
 
  /** @generated */
  final Feature casFeat_fnTypeSystem2;
  /** @generated */
  final int     casFeatCode_fnTypeSystem2;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getFnTypeSystem2(int addr) {
        if (featOkTst && casFeat_fnTypeSystem2 == null)
      jcas.throwFeatMissing("fnTypeSystem2", "jianhelTypeSystem");
    return ll_cas.ll_getIntValue(addr, casFeatCode_fnTypeSystem2);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setFnTypeSystem2(int addr, int v) {
        if (featOkTst && casFeat_fnTypeSystem2 == null)
      jcas.throwFeatMissing("fnTypeSystem2", "jianhelTypeSystem");
    ll_cas.ll_setIntValue(addr, casFeatCode_fnTypeSystem2, v);}
    
  
 
  /** @generated */
  final Feature casFeat_fnTypeSystem3;
  /** @generated */
  final int     casFeatCode_fnTypeSystem3;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getFnTypeSystem3(int addr) {
        if (featOkTst && casFeat_fnTypeSystem3 == null)
      jcas.throwFeatMissing("fnTypeSystem3", "jianhelTypeSystem");
    return ll_cas.ll_getIntValue(addr, casFeatCode_fnTypeSystem3);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setFnTypeSystem3(int addr, int v) {
        if (featOkTst && casFeat_fnTypeSystem3 == null)
      jcas.throwFeatMissing("fnTypeSystem3", "jianhelTypeSystem");
    ll_cas.ll_setIntValue(addr, casFeatCode_fnTypeSystem3, v);}
    
  
 
  /** @generated */
  final Feature casFeat_fnTypeSystem4;
  /** @generated */
  final int     casFeatCode_fnTypeSystem4;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getFnTypeSystem4(int addr) {
        if (featOkTst && casFeat_fnTypeSystem4 == null)
      jcas.throwFeatMissing("fnTypeSystem4", "jianhelTypeSystem");
    return ll_cas.ll_getStringValue(addr, casFeatCode_fnTypeSystem4);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setFnTypeSystem4(int addr, String v) {
        if (featOkTst && casFeat_fnTypeSystem4 == null)
      jcas.throwFeatMissing("fnTypeSystem4", "jianhelTypeSystem");
    ll_cas.ll_setStringValue(addr, casFeatCode_fnTypeSystem4, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public jianhelTypeSystem_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_fnTypeSystem1 = jcas.getRequiredFeatureDE(casType, "fnTypeSystem1", "uima.cas.String", featOkTst);
    casFeatCode_fnTypeSystem1  = (null == casFeat_fnTypeSystem1) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_fnTypeSystem1).getCode();

 
    casFeat_fnTypeSystem2 = jcas.getRequiredFeatureDE(casType, "fnTypeSystem2", "uima.cas.Integer", featOkTst);
    casFeatCode_fnTypeSystem2  = (null == casFeat_fnTypeSystem2) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_fnTypeSystem2).getCode();

 
    casFeat_fnTypeSystem3 = jcas.getRequiredFeatureDE(casType, "fnTypeSystem3", "uima.cas.Integer", featOkTst);
    casFeatCode_fnTypeSystem3  = (null == casFeat_fnTypeSystem3) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_fnTypeSystem3).getCode();

 
    casFeat_fnTypeSystem4 = jcas.getRequiredFeatureDE(casType, "fnTypeSystem4", "uima.cas.String", featOkTst);
    casFeatCode_fnTypeSystem4  = (null == casFeat_fnTypeSystem4) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_fnTypeSystem4).getCode();

  }
}



    