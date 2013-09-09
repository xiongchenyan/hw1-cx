

/* First created by JCasGen Mon Sep 09 17:00:33 EDT 2013 */
package edu.cmu.cs.lti.cx;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Mon Sep 09 17:00:33 EDT 2013
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
  //* Feature: Score

  /** getter for Score - gets 
   * @generated */
  public double getScore() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_Score == null)
      jcasType.jcas.throwFeatMissing("Score", "edu.cmu.cs.lti.cx.Answer");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Answer_Type)jcasType).casFeatCode_Score);}
    
  /** setter for Score - sets  
   * @generated */
  public void setScore(double v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_Score == null)
      jcasType.jcas.throwFeatMissing("Score", "edu.cmu.cs.lti.cx.Answer");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Answer_Type)jcasType).casFeatCode_Score, v);}    
  }

    