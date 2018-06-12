package com.eclipsesource.v8.debug.mirror;

import com.eclipsesource.v8.V8Object;

public class UndefinedMirror
  extends ValueMirror
{
  UndefinedMirror(V8Object paramV8Object)
  {
    super(paramV8Object);
  }
  
  public boolean isUndefined()
  {
    return true;
  }
  
  public String toString()
  {
    return "undefined";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/eclipsesource/v8/debug/mirror/UndefinedMirror.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */