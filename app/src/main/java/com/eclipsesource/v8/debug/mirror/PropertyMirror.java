package com.eclipsesource.v8.debug.mirror;

import com.eclipsesource.v8.V8Object;

public class PropertyMirror
  extends Mirror
{
  PropertyMirror(V8Object paramV8Object)
  {
    super(paramV8Object);
  }
  
  public String getName()
  {
    return this.v8Object.executeStringFunction("name", null);
  }
  
  public Mirror getValue()
  {
    V8Object localV8Object = this.v8Object.executeObjectFunction("value", null);
    try
    {
      ValueMirror localValueMirror = createMirror(localV8Object);
      return localValueMirror;
    }
    finally
    {
      localV8Object.release();
    }
  }
  
  public boolean isProperty()
  {
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/eclipsesource/v8/debug/mirror/PropertyMirror.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */