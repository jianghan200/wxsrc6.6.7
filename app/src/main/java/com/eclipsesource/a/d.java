package com.eclipsesource.a;

final class d
  extends h
{
  private final String string;
  
  d(String paramString)
  {
    if (paramString == null) {
      throw new NullPointerException("string is null");
    }
    this.string = paramString;
  }
  
  final void a(i parami)
  {
    parami.aa(this.string);
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool2 = false;
    boolean bool1;
    if (this == paramObject) {
      bool1 = true;
    }
    do
    {
      do
      {
        return bool1;
        bool1 = bool2;
      } while (paramObject == null);
      bool1 = bool2;
    } while (getClass() != paramObject.getClass());
    paramObject = (d)paramObject;
    return this.string.equals(((d)paramObject).string);
  }
  
  public final int hS()
  {
    return Integer.parseInt(this.string, 10);
  }
  
  public final long hT()
  {
    return Long.parseLong(this.string, 10);
  }
  
  public final double hU()
  {
    return Double.parseDouble(this.string);
  }
  
  public final int hashCode()
  {
    return this.string.hashCode();
  }
  
  public final boolean isNumber()
  {
    return true;
  }
  
  public final String toString()
  {
    return this.string;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/eclipsesource/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */