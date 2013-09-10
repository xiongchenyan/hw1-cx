
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

/** type system for question. inherited from sentence.
 * Updated by JCasGen Mon Sep 09 23:14:55 EDT 2013
 * @generated */
public class Question_Type extends Sentence_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Question_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Question_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Question(addr, Question_Type.this);
  			   Question_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Question(addr, Question_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Question.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.cs.lti.cx.Question");
 
  /** @generated */
  final Feature casFeat_QuestionType;
  /** @generated */
  final int     casFeatCode_QuestionType;
  /** @generated */ 
  public String getQuestionType(int addr) {
        if (featOkTst && casFeat_QuestionType == null)
      jcas.throwFeatMissing("QuestionType", "edu.cmu.cs.lti.cx.Question");
    return ll_cas.ll_getStringValue(addr, casFeatCode_QuestionType);
  }
  /** @generated */    
  public void setQuestionType(int addr, String v) {
        if (featOkTst && casFeat_QuestionType == null)
      jcas.throwFeatMissing("QuestionType", "edu.cmu.cs.lti.cx.Question");
    ll_cas.ll_setStringValue(addr, casFeatCode_QuestionType, v);}
    
  
 
  /** @generated */
  final Feature casFeat_ConfidentScore;
  /** @generated */
  final int     casFeatCode_ConfidentScore;
  /** @generated */ 
  public double getConfidentScore(int addr) {
        if (featOkTst && casFeat_ConfidentScore == null)
      jcas.throwFeatMissing("ConfidentScore", "edu.cmu.cs.lti.cx.Question");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_ConfidentScore);
  }
  /** @generated */    
  public void setConfidentScore(int addr, double v) {
        if (featOkTst && casFeat_ConfidentScore == null)
      jcas.throwFeatMissing("ConfidentScore", "edu.cmu.cs.lti.cx.Question");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_ConfidentScore, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Question_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_QuestionType = jcas.getRequiredFeatureDE(casType, "QuestionType", "uima.cas.String", featOkTst);
    casFeatCode_QuestionType  = (null == casFeat_QuestionType) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_QuestionType).getCode();

 
    casFeat_ConfidentScore = jcas.getRequiredFeatureDE(casType, "ConfidentScore", "uima.cas.Double", featOkTst);
    casFeatCode_ConfidentScore  = (null == casFeat_ConfidentScore) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_ConfidentScore).getCode();

  }
}



    