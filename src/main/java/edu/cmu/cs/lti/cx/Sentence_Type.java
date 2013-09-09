
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

/** sentences
 * Updated by JCasGen Mon Sep 09 17:00:33 EDT 2013
 * @generated */
public class Sentence_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Sentence_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Sentence_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Sentence(addr, Sentence_Type.this);
  			   Sentence_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Sentence(addr, Sentence_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Sentence.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.cs.lti.cx.Sentence");
 
  /** @generated */
  final Feature casFeat_TokenList;
  /** @generated */
  final int     casFeatCode_TokenList;
  /** @generated */ 
  public int getTokenList(int addr) {
        if (featOkTst && casFeat_TokenList == null)
      jcas.throwFeatMissing("TokenList", "edu.cmu.cs.lti.cx.Sentence");
    return ll_cas.ll_getRefValue(addr, casFeatCode_TokenList);
  }
  /** @generated */    
  public void setTokenList(int addr, int v) {
        if (featOkTst && casFeat_TokenList == null)
      jcas.throwFeatMissing("TokenList", "edu.cmu.cs.lti.cx.Sentence");
    ll_cas.ll_setRefValue(addr, casFeatCode_TokenList, v);}
    
   /** @generated */
  public int getTokenList(int addr, int i) {
        if (featOkTst && casFeat_TokenList == null)
      jcas.throwFeatMissing("TokenList", "edu.cmu.cs.lti.cx.Sentence");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_TokenList), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_TokenList), i);
	return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_TokenList), i);
  }
   
  /** @generated */ 
  public void setTokenList(int addr, int i, int v) {
        if (featOkTst && casFeat_TokenList == null)
      jcas.throwFeatMissing("TokenList", "edu.cmu.cs.lti.cx.Sentence");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_TokenList), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_TokenList), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_TokenList), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_NgramList;
  /** @generated */
  final int     casFeatCode_NgramList;
  /** @generated */ 
  public int getNgramList(int addr) {
        if (featOkTst && casFeat_NgramList == null)
      jcas.throwFeatMissing("NgramList", "edu.cmu.cs.lti.cx.Sentence");
    return ll_cas.ll_getRefValue(addr, casFeatCode_NgramList);
  }
  /** @generated */    
  public void setNgramList(int addr, int v) {
        if (featOkTst && casFeat_NgramList == null)
      jcas.throwFeatMissing("NgramList", "edu.cmu.cs.lti.cx.Sentence");
    ll_cas.ll_setRefValue(addr, casFeatCode_NgramList, v);}
    
   /** @generated */
  public int getNgramList(int addr, int i) {
        if (featOkTst && casFeat_NgramList == null)
      jcas.throwFeatMissing("NgramList", "edu.cmu.cs.lti.cx.Sentence");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_NgramList), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_NgramList), i);
	return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_NgramList), i);
  }
   
  /** @generated */ 
  public void setNgramList(int addr, int i, int v) {
        if (featOkTst && casFeat_NgramList == null)
      jcas.throwFeatMissing("NgramList", "edu.cmu.cs.lti.cx.Sentence");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_NgramList), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_NgramList), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_NgramList), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_RawString;
  /** @generated */
  final int     casFeatCode_RawString;
  /** @generated */ 
  public String getRawString(int addr) {
        if (featOkTst && casFeat_RawString == null)
      jcas.throwFeatMissing("RawString", "edu.cmu.cs.lti.cx.Sentence");
    return ll_cas.ll_getStringValue(addr, casFeatCode_RawString);
  }
  /** @generated */    
  public void setRawString(int addr, String v) {
        if (featOkTst && casFeat_RawString == null)
      jcas.throwFeatMissing("RawString", "edu.cmu.cs.lti.cx.Sentence");
    ll_cas.ll_setStringValue(addr, casFeatCode_RawString, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Sentence_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_TokenList = jcas.getRequiredFeatureDE(casType, "TokenList", "uima.cas.FSArray", featOkTst);
    casFeatCode_TokenList  = (null == casFeat_TokenList) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_TokenList).getCode();

 
    casFeat_NgramList = jcas.getRequiredFeatureDE(casType, "NgramList", "uima.cas.FSArray", featOkTst);
    casFeatCode_NgramList  = (null == casFeat_NgramList) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_NgramList).getCode();

 
    casFeat_RawString = jcas.getRequiredFeatureDE(casType, "RawString", "uima.cas.String", featOkTst);
    casFeatCode_RawString  = (null == casFeat_RawString) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_RawString).getCode();

  }
}



    