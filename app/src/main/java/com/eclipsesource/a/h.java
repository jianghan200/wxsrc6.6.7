package com.eclipsesource.a;

import java.io.IOException;
import java.io.Serializable;
import java.io.StringWriter;

public abstract class h
  implements Serializable
{
  @Deprecated
  public static final h abw = a.abw;
  @Deprecated
  public static final h abx = a.abx;
  @Deprecated
  public static final h aby = a.aby;
  
  private String a(l paraml)
  {
    StringWriter localStringWriter = new StringWriter();
    if (paraml == null) {
      try
      {
        throw new NullPointerException("config is null");
      }
      catch (IOException paraml)
      {
        throw new RuntimeException(paraml);
      }
    }
    m localm = new m(localStringWriter);
    a(paraml.a(localm));
    localm.flush();
    return localStringWriter.toString();
  }
  
  abstract void a(i parami);
  
  public boolean equals(Object paramObject)
  {
    return super.equals(paramObject);
  }
  
  public b hQ()
  {
    throw new UnsupportedOperationException("Not an array: " + toString());
  }
  
  public boolean hR()
  {
    throw new UnsupportedOperationException("Not a boolean: " + toString());
  }
  
  public int hS()
  {
    throw new UnsupportedOperationException("Not a number: " + toString());
  }
  
  public long hT()
  {
    throw new UnsupportedOperationException("Not a number: " + toString());
  }
  
  public double hU()
  {
    throw new UnsupportedOperationException("Not a number: " + toString());
  }
  
  public e hV()
  {
    throw new UnsupportedOperationException("Not an object: " + toString());
  }
  
  public int hashCode()
  {
    return super.hashCode();
  }
  
  public String ie()
  {
    throw new UnsupportedOperationException("Not a string: " + toString());
  }
  
  public boolean isArray()
  {
    return false;
  }
  
  public boolean isBoolean()
  {
    return false;
  }
  
  public boolean isNumber()
  {
    return false;
  }
  
  public boolean isObject()
  {
    return false;
  }
  
  public boolean isString()
  {
    return false;
  }
  
  public String toString()
  {
    return a(l.ace);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/eclipsesource/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */