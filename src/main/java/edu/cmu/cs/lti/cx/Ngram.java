

/* First created by JCasGen Mon Sep 09 17:00:33 EDT 2013 */
package edu.cmu.cs.lti.cx;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Mon Sep 09 17:00:33 EDT 2013
 * XML source: /home/cx/workspace/11791/hw1-cx/desc/hw1-typesystem.xml
 * @generated */
public class Ngram extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Ngram.class);
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
  protected Ngram() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Ngram(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Ngram(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Ngram(JCas jcas, int begin, int end) {
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
  //* Feature: TokenList

  /** getter for TokenList - gets tokens of this ngram
   * @generated */
  public FSArray getTokenList() {
    if (Ngram_Type.featOkTst && ((Ngram_Type)jcasType).casFeat_TokenList == null)
      jcasType.jcas.throwFeatMissing("TokenList", "edu.cmu.cs.lti.cx.Ngram");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Ngram_Type)jcasType).casFeatCode_TokenList)));}
    
  /** setter for TokenList - sets tokens of this ngram 
   * @generated */
  public void setTokenList(FSArray v) {
    if (Ngram_Type.featOkTst && ((Ngram_Type)jcasType).casFeat_TokenList == null)
      jcasType.jcas.throwFeatMissing("TokenList", "edu.cmu.cs.lti.cx.Ngram");
    jcasType.ll_cas.ll_setRefValue(addr, ((Ngram_Type)jcasType).casFeatCode_TokenList, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for TokenList - gets an indexed value - tokens of this ngram
   * @generated */
  public Token getTokenList(int i) {
    if (Ngram_Type.featOkTst && ((Ngram_Type)jcasType).casFeat_TokenList == null)
      jcasType.jcas.throwFeatMissing("TokenList", "edu.cmu.cs.lti.cx.Ngram");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Ngram_Type)jcasType).casFeatCode_TokenList), i);
    return (Token)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Ngram_Type)jcasType).casFeatCode_TokenList), i)));}

  /** indexed setter for TokenList - sets an indexed value - tokens of this ngram
   * @generated */
  public void setTokenList(int i, Token v) { 
    if (Ngram_Type.featOkTst && ((Ngram_Type)jcasType).casFeat_TokenList == null)
      jcasType.jcas.throwFeatMissing("TokenList", "edu.cmu.cs.lti.cx.Ngram");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Ngram_Type)jcasType).casFeatCode_TokenList), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Ngram_Type)jcasType).casFeatCode_TokenList), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    