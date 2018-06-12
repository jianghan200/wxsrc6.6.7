package com.eclipsesource.v8.debug.mirror;

import com.eclipsesource.v8.V8Object;

public class ArrayMirror
  extends ObjectMirror
{
  private static final String LENGTH = "length";
  
  ArrayMirror(V8Object paramV8Object)
  {
    super(paramV8Object);
  }
  
  public boolean isArray()
  {
    return true;
  }
  
  public int length()
  {
    return this.v8Object.executeIntegerFunction("length", null);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/eclipsesource/v8/debug/mirror/ArrayMirror.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */