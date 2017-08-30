package org.javacc.parser;

public interface ParserCodeGenerator {
  /**
   * Genrate the code for the parser. Note that the code generator just
   * produces a buffer.
   */
  void generateCode(CodeGeneratorSettings settings, CodeGenHelper codeGenerator, ParserData tokenizerData);

  /**
   * Complete the code generation and save any output file(s).
   */
  void finish(CodeGeneratorSettings settings, CodeGenHelper codeGenerator, ParserData tokenizerData);
}
