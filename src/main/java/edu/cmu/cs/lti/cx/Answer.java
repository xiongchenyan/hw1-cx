

/* First created by JCasGen Mon Sep 09 17:00:33 EDT 2013 */
package edu.cmu.cs.lti.cx;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** type system for answer. inherited from sentence.

 * Updated by JCasGen Mon Sep 09 23:14:54 EDT 2013
 * XML source: /home/cx/workspace/11791/hw1-cx/desc/hw1-typesystem.xml
 * @generated */
public class Answer extends Sentence {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Answer.class);
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
  protected Answer() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Answer(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Answer(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Answer(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: PredictedScore

  /** getter for PredictedScore - gets predicted score of this sentence. 
   * @generated */
  public double getPredictedScore() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_PredictedScore == null)
      jcasType.jcas.throwFeatMissing("PredictedScore", "edu.cmu.cs.lti.cx.Answer");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Answer_Type)jcasType).casFeatCode_PredictedScore);}
    
  /** setter for PredictedScore - sets predicted score of this sentence.  
   * @generated */
  public void setPredictedScore(double v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_PredictedScore == null)
      jcasType.jcas.throwFeatMissing("PredictedScore", "edu.cmu.cs.lti.cx.Answer");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Answer_Type)jcasType).casFeatCode_PredictedScore, v);}    
   
    
  //*--------------*
  //* Feature: GroundTruthScore

  /** getter for GroundTruthScore - gets ground truth score for this answer.
   * @generated */
  public double getGroundTruthScore() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_GroundTruthScore == null)
      jcasType.jcas.throwFeatMissing("GroundTruthScore", "edu.cmu.cs.lti.cx.Answer");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Answer_Type)jcasType).casFeatCode_GroundTruthScore);}
    
  /** setter for GroundTruthScore - sets ground truth score for this answer. 
   * @generated */
  public void setGroundTruthScore(double v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_GroundTruthScore == null)
      jcasType.jcas.throwFeatMissing("GroundTruthScore", "edu.cmu.cs.lti.cx.Answer");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Answer_Type)jcasType).casFeatCode_GroundTruthScore, v);}    
  }

    