
/* First created by JCasGen Mon Sep 09 16:37:32 EDT 2013 */
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

/** type system for Token. inherited from annotation class. each token correspondes to a token in a sentence.
 * Updated by JCasGen Tue Sep 10 21:11:55 EDT 2013
 * @generated */
public class Token_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Token_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Token_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Token(addr, Token_Type.this);
  			   Token_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Token(addr, Token_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Token.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.cs.lti.cx.Token");
 
  /** @generated */
  final Feature casFeat_postag;
  /** @generated */
  final int     casFeatCode_postag;
  /** @generated */ 
  public String getPostag(int addr) {
        if (featOkTst && casFeat_postag == null)
      jcas.throwFeatMissing("postag", "edu.cmu.cs.lti.cx.Token");
    return ll_cas.ll_getStringValue(addr, casFeatCode_postag);
  }
  /** @generated */    
  public void setPostag(int addr, String v) {
        if (featOkTst && casFeat_postag == null)
      jcas.throwFeatMissing("postag", "edu.cmu.cs.lti.cx.Token");
    ll_cas.ll_setStringValue(addr, casFeatCode_postag, v);}
    
  
 
  /** @generated */
  final Feature casFeat_StemRes;
  /** @generated */
  final int     casFeatCode_StemRes;
  /** @generated */ 
  public String getStemRes(int addr) {
        if (featOkTst && casFeat_StemRes == null)
      jcas.throwFeatMissing("StemRes", "edu.cmu.cs.lti.cx.Token");
    return ll_cas.ll_getStringValue(addr, casFeatCode_StemRes);
  }
  /** @generated */    
  public void setStemRes(int addr, String v) {
        if (featOkTst && casFeat_StemRes == null)
      jcas.throwFeatMissing("StemRes", "edu.cmu.cs.lti.cx.Token");
    ll_cas.ll_setStringValue(addr, casFeatCode_StemRes, v);}
    
  
 
  /** @generated */
  final Feature casFeat_TermNum;
  /** @generated */
  final int     casFeatCode_TermNum;
  /** @generated */ 
  public int getTermNum(int addr) {
        if (featOkTst && casFeat_TermNum == null)
      jcas.throwFeatMissing("TermNum", "edu.cmu.cs.lti.cx.Token");
    return ll_cas.ll_getIntValue(addr, casFeatCode_TermNum);
  }
  /** @generated */    
  public void setTermNum(int addr, int v) {
        if (featOkTst && casFeat_TermNum == null)
      jcas.throwFeatMissing("TermNum", "edu.cmu.cs.lti.cx.Token");
    ll_cas.ll_setIntValue(addr, casFeatCode_TermNum, v);}
    
  
 
  /** @generated */
  final Feature casFeat_TF;
  /** @generated */
  final int     casFeatCode_TF;
  /** @generated */ 
  public double getTF(int addr) {
        if (featOkTst && casFeat_TF == null)
      jcas.throwFeatMissing("TF", "edu.cmu.cs.lti.cx.Token");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_TF);
  }
  /** @generated */    
  public void setTF(int addr, double v) {
        if (featOkTst && casFeat_TF == null)
      jcas.throwFeatMissing("TF", "edu.cmu.cs.lti.cx.Token");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_TF, v);}
    
  
 
  /** @generated */
  final Feature casFeat_IDF;
  /** @generated */
  final int     casFeatCode_IDF;
  /** @generated */ 
  public double getIDF(int addr) {
        if (featOkTst && casFeat_IDF == null)
      jcas.throwFeatMissing("IDF", "edu.cmu.cs.lti.cx.Token");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_IDF);
  }
  /** @generated */    
  public void setIDF(int addr, double v) {
        if (featOkTst && casFeat_IDF == null)
      jcas.throwFeatMissing("IDF", "edu.cmu.cs.lti.cx.Token");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_IDF, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Token_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_postag = jcas.getRequiredFeatureDE(casType, "postag", "uima.cas.String", featOkTst);
    casFeatCode_postag  = (null == casFeat_postag) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_postag).getCode();

 
    casFeat_StemRes = jcas.getRequiredFeatureDE(casType, "StemRes", "uima.cas.String", featOkTst);
    casFeatCode_StemRes  = (null == casFeat_StemRes) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_StemRes).getCode();

 
    casFeat_TermNum = jcas.getRequiredFeatureDE(casType, "TermNum", "uima.cas.Integer", featOkTst);
    casFeatCode_TermNum  = (null == casFeat_TermNum) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_TermNum).getCode();

 
    casFeat_TF = jcas.getRequiredFeatureDE(casType, "TF", "uima.cas.Double", featOkTst);
    casFeatCode_TF  = (null == casFeat_TF) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_TF).getCode();

 
    casFeat_IDF = jcas.getRequiredFeatureDE(casType, "IDF", "uima.cas.Double", featOkTst);
    casFeatCode_IDF  = (null == casFeat_IDF) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_IDF).getCode();

  }
}



    