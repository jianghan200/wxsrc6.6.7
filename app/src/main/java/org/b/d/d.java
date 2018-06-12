package org.b.d;

public final class d
  implements Comparable<d>
{
  final String aAL;
  final String value;
  
  public d(String paramString1, String paramString2)
  {
    this.aAL = paramString1;
    this.value = paramString2;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == null) {}
    do
    {
      do
      {
        return false;
        if (paramObject == this) {
          return true;
        }
      } while (!(paramObject instanceof d));
      paramObject = (d)paramObject;
    } while ((!((d)paramObject).aAL.equals(this.aAL)) || (!((d)paramObject).value.equals(this.value)));
    return true;
  }
  
  public final int hashCode()
  {
    return this.aAL.hashCode() + this.value.hashCode();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/org/b/d/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */