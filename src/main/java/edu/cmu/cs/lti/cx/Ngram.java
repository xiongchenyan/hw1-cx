

/* First created by JCasGen Mon Sep 09 17:00:33 EDT 2013 */
package edu.cmu.cs.lti.cx;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.tcas.Annotation;


/** type system for ngram. inherited from annotation class. each token correspondes to a ngram in a sentence. the n is stored in feature NgramLen
 * Updated by JCasGen Tue Sep 10 23:20:43 EDT 2013
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
  //* Feature: NgramLen

  /** getter for NgramLen - gets the n of ngram.
   * @generated */
  public int getNgramLen() {
    if (Ngram_Type.featOkTst && ((Ngram_Type)jcasType).casFeat_NgramLen == null)
      jcasType.jcas.throwFeatMissing("NgramLen", "edu.cmu.cs.lti.cx.Ngram");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Ngram_Type)jcasType).casFeatCode_NgramLen);}
    
  /** setter for NgramLen - sets the n of ngram. 
   * @generated */
  public void setNgramLen(int v) {
    if (Ngram_Type.featOkTst && ((Ngram_Type)jcasType).casFeat_NgramLen == null)
      jcasType.jcas.throwFeatMissing("NgramLen", "edu.cmu.cs.lti.cx.Ngram");
    jcasType.ll_cas.ll_setIntValue(addr, ((Ngram_Type)jcasType).casFeatCode_NgramLen, v);}    
   
    
  //*--------------*
  //* Feature: TF

  /** getter for TF - gets ngram frequency in current document/sentence
   * @generated */
  public double getTF() {
    if (Ngram_Type.featOkTst && ((Ngram_Type)jcasType).casFeat_TF == null)
      jcasType.jcas.throwFeatMissing("TF", "edu.cmu.cs.lti.cx.Ngram");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Ngram_Type)jcasType).casFeatCode_TF);}
    
  /** setter for TF - sets ngram frequency in current document/sentence 
   * @generated */
  public void setTF(double v) {
    if (Ngram_Type.featOkTst && ((Ngram_Type)jcasType).casFeat_TF == null)
      jcasType.jcas.throwFeatMissing("TF", "edu.cmu.cs.lti.cx.Ngram");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Ngram_Type)jcasType).casFeatCode_TF, v);}    
   
    
  //*--------------*
  //* Feature: IDF

  /** getter for IDF - gets invert document frequency of this ngram in copus
   * @generated */
  public double getIDF() {
    if (Ngram_Type.featOkTst && ((Ngram_Type)jcasType).casFeat_IDF == null)
      jcasType.jcas.throwFeatMissing("IDF", "edu.cmu.cs.lti.cx.Ngram");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Ngram_Type)jcasType).casFeatCode_IDF);}
    
  /** setter for IDF - sets invert document frequency of this ngram in copus 
   * @generated */
  public void setIDF(double v) {
    if (Ngram_Type.featOkTst && ((Ngram_Type)jcasType).casFeat_IDF == null)
      jcasType.jcas.throwFeatMissing("IDF", "edu.cmu.cs.lti.cx.Ngram");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Ngram_Type)jcasType).casFeatCode_IDF, v);}    
  }

    