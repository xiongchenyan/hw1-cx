

/* First created by JCasGen Mon Sep 09 16:37:32 EDT 2013 */
package edu.cmu.cs.lti.cx;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Mon Sep 09 17:00:33 EDT 2013
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
  //* Feature: postag

  /** getter for postag - gets 
   * @generated */
  public String getPostag() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_postag == null)
      jcasType.jcas.throwFeatMissing("postag", "edu.cmu.cs.lti.cx.Token");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Token_Type)jcasType).casFeatCode_postag);}
    
  /** setter for postag - sets  
   * @generated */
  public void setPostag(String v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_postag == null)
      jcasType.jcas.throwFeatMissing("postag", "edu.cmu.cs.lti.cx.Token");
    jcasType.ll_cas.ll_setStringValue(addr, ((Token_Type)jcasType).casFeatCode_postag, v);}    
   
    
  //*--------------*
  //* Feature: StemRes

  /** getter for StemRes - gets the stemming term of this token
   * @generated */
  public String getStemRes() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_StemRes == null)
      jcasType.jcas.throwFeatMissing("StemRes", "edu.cmu.cs.lti.cx.Token");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Token_Type)jcasType).casFeatCode_StemRes);}
    
  /** setter for StemRes - sets the stemming term of this token 
   * @generated */
  public void setStemRes(String v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_StemRes == null)
      jcasType.jcas.throwFeatMissing("StemRes", "edu.cmu.cs.lti.cx.Token");
    jcasType.ll_cas.ll_setStringValue(addr, ((Token_Type)jcasType).casFeatCode_StemRes, v);}    
   
    
  //*--------------*
  //* Feature: TermNum

  /** getter for TermNum - gets number of terms in this token.
   * @generated */
  public int getTermNum() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_TermNum == null)
      jcasType.jcas.throwFeatMissing("TermNum", "edu.cmu.cs.lti.cx.Token");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Token_Type)jcasType).casFeatCode_TermNum);}
    
  /** setter for TermNum - sets number of terms in this token. 
   * @generated */
  public void setTermNum(int v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_TermNum == null)
      jcasType.jcas.throwFeatMissing("TermNum", "edu.cmu.cs.lti.cx.Token");
    jcasType.ll_cas.ll_setIntValue(addr, ((Token_Type)jcasType).casFeatCode_TermNum, v);}    
  }

    