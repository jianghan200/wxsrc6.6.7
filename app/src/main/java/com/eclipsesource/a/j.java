package com.eclipsesource.a;

public final class j
  extends RuntimeException
{
  private final int column;
  private final int line;
  private final int offset;
  
  j(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    super(paramString + " at " + paramInt2 + ":" + paramInt3);
    this.offset = paramInt1;
    this.line = paramInt2;
    this.column = paramInt3;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/eclipsesource/a/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */