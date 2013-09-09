

/* First created by JCasGen Mon Sep 09 17:00:33 EDT 2013 */
package edu.cmu.cs.lti.cx;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.tcas.Annotation;


/** sentences
 * Updated by JCasGen Mon Sep 09 17:00:33 EDT 2013
 * XML source: /home/cx/workspace/11791/hw1-cx/desc/hw1-typesystem.xml
 * @generated */
public class Sentence extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Sentence.class);
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
  protected Sentence() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Sentence(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Sentence(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Sentence(JCas jcas, int begin, int end) {
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

  /** getter for TokenList - gets list of tokens
   * @generated */
  public FSArray getTokenList() {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_TokenList == null)
      jcasType.jcas.throwFeatMissing("TokenList", "edu.cmu.cs.lti.cx.Sentence");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_TokenList)));}
    
  /** setter for TokenList - sets list of tokens 
   * @generated */
  public void setTokenList(FSArray v) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_TokenList == null)
      jcasType.jcas.throwFeatMissing("TokenList", "edu.cmu.cs.lti.cx.Sentence");
    jcasType.ll_cas.ll_setRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_TokenList, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for TokenList - gets an indexed value - list of tokens
   * @generated */
  public Token getTokenList(int i) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_TokenList == null)
      jcasType.jcas.throwFeatMissing("TokenList", "edu.cmu.cs.lti.cx.Sentence");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_TokenList), i);
    return (Token)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_TokenList), i)));}

  /** indexed setter for TokenList - sets an indexed value - list of tokens
   * @generated */
  public void setTokenList(int i, Token v) { 
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_TokenList == null)
      jcasType.jcas.throwFeatMissing("TokenList", "edu.cmu.cs.lti.cx.Sentence");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_TokenList), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_TokenList), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: NgramList

  /** getter for NgramList - gets list of ngrams
   * @generated */
  public FSArray getNgramList() {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_NgramList == null)
      jcasType.jcas.throwFeatMissing("NgramList", "edu.cmu.cs.lti.cx.Sentence");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_NgramList)));}
    
  /** setter for NgramList - sets list of ngrams 
   * @generated */
  public void setNgramList(FSArray v) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_NgramList == null)
      jcasType.jcas.throwFeatMissing("NgramList", "edu.cmu.cs.lti.cx.Sentence");
    jcasType.ll_cas.ll_setRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_NgramList, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for NgramList - gets an indexed value - list of ngrams
   * @generated */
  public Ngram getNgramList(int i) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_NgramList == null)
      jcasType.jcas.throwFeatMissing("NgramList", "edu.cmu.cs.lti.cx.Sentence");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_NgramList), i);
    return (Ngram)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_NgramList), i)));}

  /** indexed setter for NgramList - sets an indexed value - list of ngrams
   * @generated */
  public void setNgramList(int i, Ngram v) { 
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_NgramList == null)
      jcasType.jcas.throwFeatMissing("NgramList", "edu.cmu.cs.lti.cx.Sentence");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_NgramList), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_NgramList), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: RawString

  /** getter for RawString - gets raw string
   * @generated */
  public String getRawString() {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_RawString == null)
      jcasType.jcas.throwFeatMissing("RawString", "edu.cmu.cs.lti.cx.Sentence");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Sentence_Type)jcasType).casFeatCode_RawString);}
    
  /** setter for RawString - sets raw string 
   * @generated */
  public void setRawString(String v) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_RawString == null)
      jcasType.jcas.throwFeatMissing("RawString", "edu.cmu.cs.lti.cx.Sentence");
    jcasType.ll_cas.ll_setStringValue(addr, ((Sentence_Type)jcasType).casFeatCode_RawString, v);}    
  }

    