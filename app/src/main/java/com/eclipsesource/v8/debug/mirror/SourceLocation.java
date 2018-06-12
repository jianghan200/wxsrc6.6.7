package com.eclipsesource.v8.debug.mirror;

public class SourceLocation
{
  private final int column;
  private final int line;
  private final int position;
  private final String scriptName;
  private String sourceText;
  
  public SourceLocation(String paramString1, int paramInt1, int paramInt2, int paramInt3, String paramString2)
  {
    this.scriptName = paramString1;
    this.position = paramInt1;
    this.line = paramInt2;
    this.column = paramInt3;
    this.sourceText = paramString2;
  }
  
  public int getColumn()
  {
    return this.column;
  }
  
  public int getLine()
  {
    return this.line;
  }
  
  public int getPosition()
  {
    return this.position;
  }
  
  public String getScriptName()
  {
    return this.scriptName;
  }
  
  public String getSourceText()
  {
    return this.sourceText;
  }
  
  public String toString()
  {
    return this.scriptName + " : " + this.position + " : " + this.line + " : " + this.column + " : " + this.sourceText;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/eclipsesource/v8/debug/mirror/SourceLocation.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */