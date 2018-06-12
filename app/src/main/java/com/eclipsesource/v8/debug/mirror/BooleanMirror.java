package com.eclipsesource.v8.debug.mirror;

import com.eclipsesource.v8.V8Object;

public class BooleanMirror
  extends ValueMirror
{
  BooleanMirror(V8Object paramV8Object)
  {
    super(paramV8Object);
  }
  
  public boolean isBoolean()
  {
    return true;
  }
  
  public String toString()
  {
    return this.v8Object.executeStringFunction("toText", null);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/eclipsesource/v8/debug/mirror/BooleanMirror.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */