package com.intellij.plugins.thrift.config.target;

import java.util.Collection;
import java.util.Collections;

/**
 * 24.06.2014 12:10
 *
 * @author xBlackCat
 */ //Graphviz
public class Graphviz extends Generator {
  private static final Arg[] ARGS = new Arg[]{Arg.bool("exceptions")};
  /**
   * Whether to draw arrows from functions to exception.
   */
  private boolean exceptions;

  protected Graphviz() {
    super(GeneratorType.Graphviz);
  }

  public void setExceptions(boolean exceptions) {
    this.exceptions = exceptions;
  }

  @Override
  protected Collection<String> getOptions() {
    if (exceptions) {
      return Collections.singleton("exceptions");
    }

    return null;
  }
}
