/* Generated By:JJTree: Do not edit this line. ASTMyOtherID.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTMyOtherID extends SimpleNode {
  private String name;

  public ASTMyOtherID(int id) {
    super(id);
  }

  public ASTMyOtherID(Eg4 p, int id) {
    super(p, id);
  }

  /**
   * Set the name.
   * @param n the name
   */
  public void setName(String n) {
    name = n;
  }

  /**
   * {@inheritDoc}
   * @see org.javacc.examples.jjtree.eg2.SimpleNode#toString()
   */
  public String toString() {
    return "Identifier: " + name;
  }

  /** Accept the visitor. **/
  public Object jjtAccept(Eg4Visitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=dd8419f9ee354eee64c155709605c1f5 (do not edit this line) */
