
/* First created by JCasGen Mon Sep 09 17:00:33 EDT 2013 */
package edu.cmu.cs.lti.cx;

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

/** type system for ngram. inherited from annotation class. each token correspondes to a ngram in a sentence. the n is stored in feature NgramLen
 * Updated by JCasGen Mon Sep 09 23:14:55 EDT 2013
 * @generated */
public class Ngram_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Ngram_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Ngram_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Ngram(addr, Ngram_Type.this);
  			   Ngram_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Ngram(addr, Ngram_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Ngram.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.cs.lti.cx.Ngram");
 
  /** @generated */
  final Feature casFeat_NgramLen;
  /** @generated */
  final int     casFeatCode_NgramLen;
  /** @generated */ 
  public int getNgramLen(int addr) {
        if (featOkTst && casFeat_NgramLen == null)
      jcas.throwFeatMissing("NgramLen", "edu.cmu.cs.lti.cx.Ngram");
    return ll_cas.ll_getIntValue(addr, casFeatCode_NgramLen);
  }
  /** @generated */    
  public void setNgramLen(int addr, int v) {
        if (featOkTst && casFeat_NgramLen == null)
      jcas.throwFeatMissing("NgramLen", "edu.cmu.cs.lti.cx.Ngram");
    ll_cas.ll_setIntValue(addr, casFeatCode_NgramLen, v);}
    
  
 
  /** @generated */
  final Feature casFeat_TF;
  /** @generated */
  final int     casFeatCode_TF;
  /** @generated */ 
  public double getTF(int addr) {
        if (featOkTst && casFeat_TF == null)
      jcas.throwFeatMissing("TF", "edu.cmu.cs.lti.cx.Ngram");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_TF);
  }
  /** @generated */    
  public void setTF(int addr, double v) {
        if (featOkTst && casFeat_TF == null)
      jcas.throwFeatMissing("TF", "edu.cmu.cs.lti.cx.Ngram");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_TF, v);}
    
  
 
  /** @generated */
  final Feature casFeat_IDF;
  /** @generated */
  final int     casFeatCode_IDF;
  /** @generated */ 
  public double getIDF(int addr) {
        if (featOkTst && casFeat_IDF == null)
      jcas.throwFeatMissing("IDF", "edu.cmu.cs.lti.cx.Ngram");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_IDF);
  }
  /** @generated */    
  public void setIDF(int addr, double v) {
        if (featOkTst && casFeat_IDF == null)
      jcas.throwFeatMissing("IDF", "edu.cmu.cs.lti.cx.Ngram");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_IDF, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Ngram_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_NgramLen = jcas.getRequiredFeatureDE(casType, "NgramLen", "uima.cas.Integer", featOkTst);
    casFeatCode_NgramLen  = (null == casFeat_NgramLen) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_NgramLen).getCode();

 
    casFeat_TF = jcas.getRequiredFeatureDE(casType, "TF", "uima.cas.Double", featOkTst);
    casFeatCode_TF  = (null == casFeat_TF) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_TF).getCode();

 
    casFeat_IDF = jcas.getRequiredFeatureDE(casType, "IDF", "uima.cas.Double", featOkTst);
    casFeatCode_IDF  = (null == casFeat_IDF) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_IDF).getCode();

  }
}



    