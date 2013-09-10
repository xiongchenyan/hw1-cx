
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

/** type system for answer. inherited from sentence.

 * Updated by JCasGen Mon Sep 09 23:14:55 EDT 2013
 * @generated */
public class Answer_Type extends Sentence_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Answer_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Answer_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Answer(addr, Answer_Type.this);
  			   Answer_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Answer(addr, Answer_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Answer.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.cs.lti.cx.Answer");
 
  /** @generated */
  final Feature casFeat_PredictedScore;
  /** @generated */
  final int     casFeatCode_PredictedScore;
  /** @generated */ 
  public double getPredictedScore(int addr) {
        if (featOkTst && casFeat_PredictedScore == null)
      jcas.throwFeatMissing("PredictedScore", "edu.cmu.cs.lti.cx.Answer");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_PredictedScore);
  }
  /** @generated */    
  public void setPredictedScore(int addr, double v) {
        if (featOkTst && casFeat_PredictedScore == null)
      jcas.throwFeatMissing("PredictedScore", "edu.cmu.cs.lti.cx.Answer");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_PredictedScore, v);}
    
  
 
  /** @generated */
  final Feature casFeat_GroundTruthScore;
  /** @generated */
  final int     casFeatCode_GroundTruthScore;
  /** @generated */ 
  public double getGroundTruthScore(int addr) {
        if (featOkTst && casFeat_GroundTruthScore == null)
      jcas.throwFeatMissing("GroundTruthScore", "edu.cmu.cs.lti.cx.Answer");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_GroundTruthScore);
  }
  /** @generated */    
  public void setGroundTruthScore(int addr, double v) {
        if (featOkTst && casFeat_GroundTruthScore == null)
      jcas.throwFeatMissing("GroundTruthScore", "edu.cmu.cs.lti.cx.Answer");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_GroundTruthScore, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Answer_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_PredictedScore = jcas.getRequiredFeatureDE(casType, "PredictedScore", "uima.cas.Double", featOkTst);
    casFeatCode_PredictedScore  = (null == casFeat_PredictedScore) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_PredictedScore).getCode();

 
    casFeat_GroundTruthScore = jcas.getRequiredFeatureDE(casType, "GroundTruthScore", "uima.cas.Double", featOkTst);
    casFeatCode_GroundTruthScore  = (null == casFeat_GroundTruthScore) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_GroundTruthScore).getCode();

  }
}



    