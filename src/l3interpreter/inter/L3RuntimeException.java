package l3interpreter.inter;

import org.antlr.v4.runtime.IntStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class L3RuntimeException extends RecognitionException{

  private static final long serialVersionUID = 1L;

  
  public L3RuntimeException(String message,Recognizer<?, ?> recognizer, IntStream input, ParserRuleContext ctx) {
    super(message,recognizer, input, ctx);
  }

}
