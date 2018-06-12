package com.eclipsesource.a;

final class g
  extends h
{
  private final String string;
  
  g(String paramString)
  {
    if (paramString == null) {
      throw new NullPointerException("string is null");
    }
    this.string = paramString;
  }
  
  final void a(i parami)
  {
    parami.writeString(this.string);
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
    paramObject = (g)paramObject;
    return this.string.equals(((g)paramObject).string);
  }
  
  public final int hashCode()
  {
    return this.string.hashCode();
  }
  
  public final String ie()
  {
    return this.string;
  }
  
  public final boolean isString()
  {
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/eclipsesource/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */