package edu.stanford.nlp.ling;

public class IndexCategoryWordTag extends CategoryWordTag implements HasIndex {

  private String docID;
  private int index;
  private int sentIndex = -1;

  public IndexCategoryWordTag(int index, String category, String word, String tag) {
    super(category, word, tag);
    this.index = index;
  }

  public IndexCategoryWordTag(Label label) {
    super(label);
    if (label instanceof HasIndex) {
      HasIndex index = (HasIndex) label;
      this.index = index.index();
      this.docID = index.docID();
      this.sentIndex = index.sentIndex();
    }
  }

  @Override
  public String docID() {
    return docID;
  }

  @Override
  public void setDocID(String docID) {
    this.docID = docID;
  }

  @Override
  public int sentIndex() {
    return sentIndex;
  }

  @Override
  public void setSentIndex(int sentIndex) {
    this.sentIndex = sentIndex;
  }

  @Override
  public int index() {
    return index;
  }

  @Override
  public void setIndex(int index) {
    this.index = index;
  }
}
