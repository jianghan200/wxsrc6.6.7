package com.eclipsesource.a;

final class c
  extends h
{
  private final boolean abC;
  private final boolean abD;
  private final boolean abE;
  private final String value;
  
  c(String paramString)
  {
    this.value = paramString;
    this.abC = "null".equals(paramString);
    this.abD = "true".equals(paramString);
    this.abE = "false".equals(paramString);
  }
  
  final void a(i parami)
  {
    parami.Z(this.value);
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
    paramObject = (c)paramObject;
    return this.value.equals(((c)paramObject).value);
  }
  
  public final boolean hR()
  {
    if (this.abC) {
      return super.hR();
    }
    return this.abD;
  }
  
  public final int hashCode()
  {
    return this.value.hashCode();
  }
  
  public final boolean isBoolean()
  {
    return (this.abD) || (this.abE);
  }
  
  public final String toString()
  {
    return this.value;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/eclipsesource/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */