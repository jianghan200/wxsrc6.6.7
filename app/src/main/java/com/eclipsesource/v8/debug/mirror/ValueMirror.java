package com.eclipsesource.v8.debug.mirror;

import com.eclipsesource.v8.V8Object;

public class ValueMirror
  extends Mirror
{
  private static final String VALUE = "value";
  
  ValueMirror(V8Object paramV8Object)
  {
    super(paramV8Object);
  }
  
  public Object getValue()
  {
    return this.v8Object.executeFunction("value", null);
  }
  
  public boolean isValue()
  {
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/eclipsesource/v8/debug/mirror/ValueMirror.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */