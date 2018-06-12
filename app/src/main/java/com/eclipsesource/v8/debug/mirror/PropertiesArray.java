package com.eclipsesource.v8.debug.mirror;

import com.eclipsesource.v8.Releasable;
import com.eclipsesource.v8.V8Array;
import com.eclipsesource.v8.V8Object;

public class PropertiesArray
  implements Releasable
{
  private V8Array v8Array;
  
  PropertiesArray(V8Array paramV8Array)
  {
    this.v8Array = paramV8Array.twin();
  }
  
  public PropertyMirror getProperty(int paramInt)
  {
    V8Object localV8Object = this.v8Array.getObject(paramInt);
    try
    {
      PropertyMirror localPropertyMirror = new PropertyMirror(localV8Object);
      return localPropertyMirror;
    }
    finally
    {
      localV8Object.release();
    }
  }
  
  public int length()
  {
    return this.v8Array.length();
  }
  
  public void release()
  {
    if (!this.v8Array.isReleased()) {
      this.v8Array.release();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/eclipsesource/v8/debug/mirror/PropertiesArray.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */