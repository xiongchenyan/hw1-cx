
/* First created by JCasGen Tue Sep 10 21:14:07 EDT 2013 */
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
import org.apache.uima.jcas.cas.TOP_Type;

/** Evaluation of a ranked answer list
 * Updated by JCasGen Tue Sep 10 21:14:07 EDT 2013
 * @generated */
public class Evaluator_Type extends TOP_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Evaluator_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Evaluator_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Evaluator(addr, Evaluator_Type.this);
  			   Evaluator_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Evaluator(addr, Evaluator_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Evaluator.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.cs.lti.cx.Evaluator");
 
  /** @generated */
  final Feature casFeat_PredictedScoreArray;
  /** @generated */
  final int     casFeatCode_PredictedScoreArray;
  /** @generated */ 
  public int getPredictedScoreArray(int addr) {
        if (featOkTst && casFeat_PredictedScoreArray == null)
      jcas.throwFeatMissing("PredictedScoreArray", "edu.cmu.cs.lti.cx.Evaluator");
    return ll_cas.ll_getRefValue(addr, casFeatCode_PredictedScoreArray);
  }
  /** @generated */    
  public void setPredictedScoreArray(int addr, int v) {
        if (featOkTst && casFeat_PredictedScoreArray == null)
      jcas.throwFeatMissing("PredictedScoreArray", "edu.cmu.cs.lti.cx.Evaluator");
    ll_cas.ll_setRefValue(addr, casFeatCode_PredictedScoreArray, v);}
    
   /** @generated */
  public double getPredictedScoreArray(int addr, int i) {
        if (featOkTst && casFeat_PredictedScoreArray == null)
      jcas.throwFeatMissing("PredictedScoreArray", "edu.cmu.cs.lti.cx.Evaluator");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_PredictedScoreArray), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_PredictedScoreArray), i);
	return ll_cas.ll_getDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_PredictedScoreArray), i);
  }
   
  /** @generated */ 
  public void setPredictedScoreArray(int addr, int i, double v) {
        if (featOkTst && casFeat_PredictedScoreArray == null)
      jcas.throwFeatMissing("PredictedScoreArray", "edu.cmu.cs.lti.cx.Evaluator");
    if (lowLevelTypeChecks)
      ll_cas.ll_setDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_PredictedScoreArray), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_PredictedScoreArray), i);
    ll_cas.ll_setDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_PredictedScoreArray), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_GroundTruthScoreArray;
  /** @generated */
  final int     casFeatCode_GroundTruthScoreArray;
  /** @generated */ 
  public int getGroundTruthScoreArray(int addr) {
        if (featOkTst && casFeat_GroundTruthScoreArray == null)
      jcas.throwFeatMissing("GroundTruthScoreArray", "edu.cmu.cs.lti.cx.Evaluator");
    return ll_cas.ll_getRefValue(addr, casFeatCode_GroundTruthScoreArray);
  }
  /** @generated */    
  public void setGroundTruthScoreArray(int addr, int v) {
        if (featOkTst && casFeat_GroundTruthScoreArray == null)
      jcas.throwFeatMissing("GroundTruthScoreArray", "edu.cmu.cs.lti.cx.Evaluator");
    ll_cas.ll_setRefValue(addr, casFeatCode_GroundTruthScoreArray, v);}
    
   /** @generated */
  public double getGroundTruthScoreArray(int addr, int i) {
        if (featOkTst && casFeat_GroundTruthScoreArray == null)
      jcas.throwFeatMissing("GroundTruthScoreArray", "edu.cmu.cs.lti.cx.Evaluator");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_GroundTruthScoreArray), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_GroundTruthScoreArray), i);
	return ll_cas.ll_getDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_GroundTruthScoreArray), i);
  }
   
  /** @generated */ 
  public void setGroundTruthScoreArray(int addr, int i, double v) {
        if (featOkTst && casFeat_GroundTruthScoreArray == null)
      jcas.throwFeatMissing("GroundTruthScoreArray", "edu.cmu.cs.lti.cx.Evaluator");
    if (lowLevelTypeChecks)
      ll_cas.ll_setDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_GroundTruthScoreArray), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_GroundTruthScoreArray), i);
    ll_cas.ll_setDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_GroundTruthScoreArray), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Evaluator_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_PredictedScoreArray = jcas.getRequiredFeatureDE(casType, "PredictedScoreArray", "uima.cas.DoubleArray", featOkTst);
    casFeatCode_PredictedScoreArray  = (null == casFeat_PredictedScoreArray) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_PredictedScoreArray).getCode();

 
    casFeat_GroundTruthScoreArray = jcas.getRequiredFeatureDE(casType, "GroundTruthScoreArray", "uima.cas.DoubleArray", featOkTst);
    casFeatCode_GroundTruthScoreArray  = (null == casFeat_GroundTruthScoreArray) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_GroundTruthScoreArray).getCode();

  }
}



    