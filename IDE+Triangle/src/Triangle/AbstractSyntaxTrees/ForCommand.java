/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class ForCommand extends Command {

  public ForCommand (VarDeclarationInitialization vAST,Expression eAST1, Command cAST, SourcePosition thePosition) {
    super (thePosition);
    V1 = vAST;
    E1 = eAST1;
    C = cAST;
  }

  public Object visit(Visitor v, Object o) {
    //return v.visitForCommand(this, o);
    return null;
  }
  public VarDeclarationInitialization V1;
  public Expression E1;
  public Command C;
}