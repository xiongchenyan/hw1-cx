

/* First created by JCasGen Mon Sep 09 17:00:33 EDT 2013 */
package edu.cmu.cs.lti.cx;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** type system for question. inherited from sentence.
 * Updated by JCasGen Tue Sep 10 23:20:43 EDT 2013
 * XML source: /home/cx/workspace/11791/hw1-cx/desc/hw1-typesystem.xml
 * @generated */
public class Question extends Sentence {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Question.class);
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
  protected Question() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Question(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Question(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Question(JCas jcas, int begin, int end) {
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
  //* Feature: QuestionType

  /** getter for QuestionType - gets question type: what?why?when? etc.
   * @generated */
  public String getQuestionType() {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_QuestionType == null)
      jcasType.jcas.throwFeatMissing("QuestionType", "edu.cmu.cs.lti.cx.Question");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Question_Type)jcasType).casFeatCode_QuestionType);}
    
  /** setter for QuestionType - sets question type: what?why?when? etc. 
   * @generated */
  public void setQuestionType(String v) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_QuestionType == null)
      jcasType.jcas.throwFeatMissing("QuestionType", "edu.cmu.cs.lti.cx.Question");
    jcasType.ll_cas.ll_setStringValue(addr, ((Question_Type)jcasType).casFeatCode_QuestionType, v);}    
   
    
  //*--------------*
  //* Feature: ConfidentScore

  /** getter for ConfidentScore - gets The confident score of system in answering this sentence.
   * @generated */
  public double getConfidentScore() {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_ConfidentScore == null)
      jcasType.jcas.throwFeatMissing("ConfidentScore", "edu.cmu.cs.lti.cx.Question");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Question_Type)jcasType).casFeatCode_ConfidentScore);}
    
  /** setter for ConfidentScore - sets The confident score of system in answering this sentence. 
   * @generated */
  public void setConfidentScore(double v) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_ConfidentScore == null)
      jcasType.jcas.throwFeatMissing("ConfidentScore", "edu.cmu.cs.lti.cx.Question");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Question_Type)jcasType).casFeatCode_ConfidentScore, v);}    
  }

    