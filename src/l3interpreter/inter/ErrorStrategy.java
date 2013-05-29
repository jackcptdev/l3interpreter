package l3interpreter.inter;


import org.antlr.v4.runtime.DefaultErrorStrategy;
import org.antlr.v4.runtime.InputMismatchException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Token;

public class ErrorStrategy extends DefaultErrorStrategy {

  @Override
  public void recover(Parser recognizer, RecognitionException e) {
    throw new RuntimeException(e);
  }

  @Override
  public void sync(Parser recognizer) {}

  @Override
  public Token recoverInline(Parser recognizer) throws RecognitionException {
    throw new RuntimeException(new InputMismatchException(recognizer));
  }


}
