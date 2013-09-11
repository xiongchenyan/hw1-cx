
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
 * Updated by JCasGen Tue Sep 10 23:20:43 EDT 2013
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
 
 
  /** @generated */
  final Feature casFeat_NDCG;
  /** @generated */
  final int     casFeatCode_NDCG;
  /** @generated */ 
  public int getNDCG(int addr) {
        if (featOkTst && casFeat_NDCG == null)
      jcas.throwFeatMissing("NDCG", "edu.cmu.cs.lti.cx.Evaluator");
    return ll_cas.ll_getRefValue(addr, casFeatCode_NDCG);
  }
  /** @generated */    
  public void setNDCG(int addr, int v) {
        if (featOkTst && casFeat_NDCG == null)
      jcas.throwFeatMissing("NDCG", "edu.cmu.cs.lti.cx.Evaluator");
    ll_cas.ll_setRefValue(addr, casFeatCode_NDCG, v);}
    
   /** @generated */
  public double getNDCG(int addr, int i) {
        if (featOkTst && casFeat_NDCG == null)
      jcas.throwFeatMissing("NDCG", "edu.cmu.cs.lti.cx.Evaluator");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_NDCG), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_NDCG), i);
  return ll_cas.ll_getDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_NDCG), i);
  }
   
  /** @generated */ 
  public void setNDCG(int addr, int i, double v) {
        if (featOkTst && casFeat_NDCG == null)
      jcas.throwFeatMissing("NDCG", "edu.cmu.cs.lti.cx.Evaluator");
    if (lowLevelTypeChecks)
      ll_cas.ll_setDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_NDCG), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_NDCG), i);
    ll_cas.ll_setDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_NDCG), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_MAP;
  /** @generated */
  final int     casFeatCode_MAP;
  /** @generated */ 
  public int getMAP(int addr) {
        if (featOkTst && casFeat_MAP == null)
      jcas.throwFeatMissing("MAP", "edu.cmu.cs.lti.cx.Evaluator");
    return ll_cas.ll_getRefValue(addr, casFeatCode_MAP);
  }
  /** @generated */    
  public void setMAP(int addr, int v) {
        if (featOkTst && casFeat_MAP == null)
      jcas.throwFeatMissing("MAP", "edu.cmu.cs.lti.cx.Evaluator");
    ll_cas.ll_setRefValue(addr, casFeatCode_MAP, v);}
    
   /** @generated */
  public double getMAP(int addr, int i) {
        if (featOkTst && casFeat_MAP == null)
      jcas.throwFeatMissing("MAP", "edu.cmu.cs.lti.cx.Evaluator");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_MAP), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_MAP), i);
  return ll_cas.ll_getDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_MAP), i);
  }
   
  /** @generated */ 
  public void setMAP(int addr, int i, double v) {
        if (featOkTst && casFeat_MAP == null)
      jcas.throwFeatMissing("MAP", "edu.cmu.cs.lti.cx.Evaluator");
    if (lowLevelTypeChecks)
      ll_cas.ll_setDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_MAP), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_MAP), i);
    ll_cas.ll_setDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_MAP), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_Precision;
  /** @generated */
  final int     casFeatCode_Precision;
  /** @generated */ 
  public int getPrecision(int addr) {
        if (featOkTst && casFeat_Precision == null)
      jcas.throwFeatMissing("Precision", "edu.cmu.cs.lti.cx.Evaluator");
    return ll_cas.ll_getRefValue(addr, casFeatCode_Precision);
  }
  /** @generated */    
  public void setPrecision(int addr, int v) {
        if (featOkTst && casFeat_Precision == null)
      jcas.throwFeatMissing("Precision", "edu.cmu.cs.lti.cx.Evaluator");
    ll_cas.ll_setRefValue(addr, casFeatCode_Precision, v);}
    
   /** @generated */
  public double getPrecision(int addr, int i) {
        if (featOkTst && casFeat_Precision == null)
      jcas.throwFeatMissing("Precision", "edu.cmu.cs.lti.cx.Evaluator");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_Precision), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_Precision), i);
  return ll_cas.ll_getDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_Precision), i);
  }
   
  /** @generated */ 
  public void setPrecision(int addr, int i, double v) {
        if (featOkTst && casFeat_Precision == null)
      jcas.throwFeatMissing("Precision", "edu.cmu.cs.lti.cx.Evaluator");
    if (lowLevelTypeChecks)
      ll_cas.ll_setDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_Precision), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_Precision), i);
    ll_cas.ll_setDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_Precision), i, v);
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

 
    casFeat_NDCG = jcas.getRequiredFeatureDE(casType, "NDCG", "uima.cas.DoubleArray", featOkTst);
    casFeatCode_NDCG  = (null == casFeat_NDCG) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_NDCG).getCode();

 
    casFeat_MAP = jcas.getRequiredFeatureDE(casType, "MAP", "uima.cas.DoubleArray", featOkTst);
    casFeatCode_MAP  = (null == casFeat_MAP) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_MAP).getCode();

 
    casFeat_Precision = jcas.getRequiredFeatureDE(casType, "Precision", "uima.cas.DoubleArray", featOkTst);
    casFeatCode_Precision  = (null == casFeat_Precision) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Precision).getCode();

  }
}



    