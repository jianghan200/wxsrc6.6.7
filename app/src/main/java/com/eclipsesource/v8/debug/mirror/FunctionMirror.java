package com.eclipsesource.v8.debug.mirror;

import com.eclipsesource.v8.V8Object;

public class FunctionMirror
  extends ObjectMirror
{
  private static final String NAME = "name";
  private static final String SCRIPT = "script";
  
  FunctionMirror(V8Object paramV8Object)
  {
    super(paramV8Object);
  }
  
  public String getName()
  {
    return this.v8Object.executeStringFunction("name", null);
  }
  
  public String getScriptName()
  {
    V8Object localV8Object = this.v8Object.executeObjectFunction("script", null);
    try
    {
      String str = localV8Object.executeStringFunction("name", null);
      return str;
    }
    finally
    {
      localV8Object.release();
    }
  }
  
  public boolean isFunction()
  {
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/eclipsesource/v8/debug/mirror/FunctionMirror.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */