

/* First created by JCasGen Tue Sep 10 21:14:07 EDT 2013 */
package edu.cmu.cs.lti.cx;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.TOP;
import org.apache.uima.jcas.cas.DoubleArray;


/** Evaluation of a ranked answer list
 * Updated by JCasGen Tue Sep 10 21:14:07 EDT 2013
 * XML source: /home/cx/workspace/11791/hw1-cx/desc/hw1-typesystem.xml
 * @generated */
public class Evaluator extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Evaluator.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Evaluator() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Evaluator(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Evaluator(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: PredictedScoreArray

  /** getter for PredictedScoreArray - gets Ranked list of predicted scores
   * @generated */
  public DoubleArray getPredictedScoreArray() {
    if (Evaluator_Type.featOkTst && ((Evaluator_Type)jcasType).casFeat_PredictedScoreArray == null)
      jcasType.jcas.throwFeatMissing("PredictedScoreArray", "edu.cmu.cs.lti.cx.Evaluator");
    return (DoubleArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluator_Type)jcasType).casFeatCode_PredictedScoreArray)));}
    
  /** setter for PredictedScoreArray - sets Ranked list of predicted scores 
   * @generated */
  public void setPredictedScoreArray(DoubleArray v) {
    if (Evaluator_Type.featOkTst && ((Evaluator_Type)jcasType).casFeat_PredictedScoreArray == null)
      jcasType.jcas.throwFeatMissing("PredictedScoreArray", "edu.cmu.cs.lti.cx.Evaluator");
    jcasType.ll_cas.ll_setRefValue(addr, ((Evaluator_Type)jcasType).casFeatCode_PredictedScoreArray, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for PredictedScoreArray - gets an indexed value - Ranked list of predicted scores
   * @generated */
  public double getPredictedScoreArray(int i) {
    if (Evaluator_Type.featOkTst && ((Evaluator_Type)jcasType).casFeat_PredictedScoreArray == null)
      jcasType.jcas.throwFeatMissing("PredictedScoreArray", "edu.cmu.cs.lti.cx.Evaluator");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluator_Type)jcasType).casFeatCode_PredictedScoreArray), i);
    return jcasType.ll_cas.ll_getDoubleArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluator_Type)jcasType).casFeatCode_PredictedScoreArray), i);}

  /** indexed setter for PredictedScoreArray - sets an indexed value - Ranked list of predicted scores
   * @generated */
  public void setPredictedScoreArray(int i, double v) { 
    if (Evaluator_Type.featOkTst && ((Evaluator_Type)jcasType).casFeat_PredictedScoreArray == null)
      jcasType.jcas.throwFeatMissing("PredictedScoreArray", "edu.cmu.cs.lti.cx.Evaluator");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluator_Type)jcasType).casFeatCode_PredictedScoreArray), i);
    jcasType.ll_cas.ll_setDoubleArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluator_Type)jcasType).casFeatCode_PredictedScoreArray), i, v);}
   
    
  //*--------------*
  //* Feature: GroundTruthScoreArray

  /** getter for GroundTruthScoreArray - gets corresponding ground truth score, one to one correspondence with PredictedScoreArray
   * @generated */
  public DoubleArray getGroundTruthScoreArray() {
    if (Evaluator_Type.featOkTst && ((Evaluator_Type)jcasType).casFeat_GroundTruthScoreArray == null)
      jcasType.jcas.throwFeatMissing("GroundTruthScoreArray", "edu.cmu.cs.lti.cx.Evaluator");
    return (DoubleArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluator_Type)jcasType).casFeatCode_GroundTruthScoreArray)));}
    
  /** setter for GroundTruthScoreArray - sets corresponding ground truth score, one to one correspondence with PredictedScoreArray 
   * @generated */
  public void setGroundTruthScoreArray(DoubleArray v) {
    if (Evaluator_Type.featOkTst && ((Evaluator_Type)jcasType).casFeat_GroundTruthScoreArray == null)
      jcasType.jcas.throwFeatMissing("GroundTruthScoreArray", "edu.cmu.cs.lti.cx.Evaluator");
    jcasType.ll_cas.ll_setRefValue(addr, ((Evaluator_Type)jcasType).casFeatCode_GroundTruthScoreArray, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for GroundTruthScoreArray - gets an indexed value - corresponding ground truth score, one to one correspondence with PredictedScoreArray
   * @generated */
  public double getGroundTruthScoreArray(int i) {
    if (Evaluator_Type.featOkTst && ((Evaluator_Type)jcasType).casFeat_GroundTruthScoreArray == null)
      jcasType.jcas.throwFeatMissing("GroundTruthScoreArray", "edu.cmu.cs.lti.cx.Evaluator");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluator_Type)jcasType).casFeatCode_GroundTruthScoreArray), i);
    return jcasType.ll_cas.ll_getDoubleArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluator_Type)jcasType).casFeatCode_GroundTruthScoreArray), i);}

  /** indexed setter for GroundTruthScoreArray - sets an indexed value - corresponding ground truth score, one to one correspondence with PredictedScoreArray
   * @generated */
  public void setGroundTruthScoreArray(int i, double v) { 
    if (Evaluator_Type.featOkTst && ((Evaluator_Type)jcasType).casFeat_GroundTruthScoreArray == null)
      jcasType.jcas.throwFeatMissing("GroundTruthScoreArray", "edu.cmu.cs.lti.cx.Evaluator");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluator_Type)jcasType).casFeatCode_GroundTruthScoreArray), i);
    jcasType.ll_cas.ll_setDoubleArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluator_Type)jcasType).casFeatCode_GroundTruthScoreArray), i, v);}
  }

    