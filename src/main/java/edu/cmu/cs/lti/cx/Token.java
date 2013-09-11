

/* First created by JCasGen Mon Sep 09 16:37:32 EDT 2013 */
package edu.cmu.cs.lti.cx;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** type system for Token. inherited from annotation class. each token correspondes to a token in a sentence.
 * Updated by JCasGen Tue Sep 10 23:20:43 EDT 2013
 * XML source: /home/cx/workspace/11791/hw1-cx/desc/hw1-typesystem.xml
 * @generated */
public class Token extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Token.class);
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
  protected Token() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Token(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Token(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Token(JCas jcas, int begin, int end) {
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
  //* Feature: Postag

  /** getter for Postag - gets the postag of this token
   * @generated */
  public String getPostag() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_Postag == null)
      jcasType.jcas.throwFeatMissing("Postag", "edu.cmu.cs.lti.cx.Token");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Token_Type)jcasType).casFeatCode_Postag);}
    
  /** setter for Postag - sets the postag of this token 
   * @generated */
  public void setPostag(String v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_Postag == null)
      jcasType.jcas.throwFeatMissing("Postag", "edu.cmu.cs.lti.cx.Token");
    jcasType.ll_cas.ll_setStringValue(addr, ((Token_Type)jcasType).casFeatCode_Postag, v);}    
   
    
  //*--------------*
  //* Feature: StemRes

  /** getter for StemRes - gets the stemming result of this token
   * @generated */
  public String getStemRes() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_StemRes == null)
      jcasType.jcas.throwFeatMissing("StemRes", "edu.cmu.cs.lti.cx.Token");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Token_Type)jcasType).casFeatCode_StemRes);}
    
  /** setter for StemRes - sets the stemming result of this token 
   * @generated */
  public void setStemRes(String v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_StemRes == null)
      jcasType.jcas.throwFeatMissing("StemRes", "edu.cmu.cs.lti.cx.Token");
    jcasType.ll_cas.ll_setStringValue(addr, ((Token_Type)jcasType).casFeatCode_StemRes, v);}    
   
    
  //*--------------*
  //* Feature: TermNum

  /** getter for TermNum - gets number of terms in this token. most time 1, based on different tokenizer, could be more than 1.
   * @generated */
  public int getTermNum() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_TermNum == null)
      jcasType.jcas.throwFeatMissing("TermNum", "edu.cmu.cs.lti.cx.Token");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Token_Type)jcasType).casFeatCode_TermNum);}
    
  /** setter for TermNum - sets number of terms in this token. most time 1, based on different tokenizer, could be more than 1. 
   * @generated */
  public void setTermNum(int v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_TermNum == null)
      jcasType.jcas.throwFeatMissing("TermNum", "edu.cmu.cs.lti.cx.Token");
    jcasType.ll_cas.ll_setIntValue(addr, ((Token_Type)jcasType).casFeatCode_TermNum, v);}    
   
    
  //*--------------*
  //* Feature: TF

  /** getter for TF - gets term frequency of this term in document/sentence
   * @generated */
  public double getTF() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_TF == null)
      jcasType.jcas.throwFeatMissing("TF", "edu.cmu.cs.lti.cx.Token");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Token_Type)jcasType).casFeatCode_TF);}
    
  /** setter for TF - sets term frequency of this term in document/sentence 
   * @generated */
  public void setTF(double v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_TF == null)
      jcasType.jcas.throwFeatMissing("TF", "edu.cmu.cs.lti.cx.Token");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Token_Type)jcasType).casFeatCode_TF, v);}    
   
    
  //*--------------*
  //* Feature: IDF

  /** getter for IDF - gets invert document frequency of this term in copus.
   * @generated */
  public double getIDF() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_IDF == null)
      jcasType.jcas.throwFeatMissing("IDF", "edu.cmu.cs.lti.cx.Token");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Token_Type)jcasType).casFeatCode_IDF);}
    
  /** setter for IDF - sets invert document frequency of this term in copus. 
   * @generated */
  public void setIDF(double v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_IDF == null)
      jcasType.jcas.throwFeatMissing("IDF", "edu.cmu.cs.lti.cx.Token");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Token_Type)jcasType).casFeatCode_IDF, v);}    
  }

    