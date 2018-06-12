package com.eclipsesource.v8.debug;

import com.eclipsesource.v8.V8Object;

public class BreakEvent
  extends EventData
{
  private static final String SOURCE_COLUMN = "sourceColumn";
  private static final String SOURCE_LINE = "sourceLine";
  private static final String SOURCE_LINE_TEXT = "sourceLineText";
  
  BreakEvent(V8Object paramV8Object)
  {
    super(paramV8Object);
  }
  
  public int getSourceColumn()
  {
    return this.v8Object.executeIntegerFunction("sourceColumn", null);
  }
  
  public int getSourceLine()
  {
    return this.v8Object.executeIntegerFunction("sourceLine", null);
  }
  
  public String getSourceLineText()
  {
    return this.v8Object.executeStringFunction("sourceLineText", null);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/eclipsesource/v8/debug/BreakEvent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */