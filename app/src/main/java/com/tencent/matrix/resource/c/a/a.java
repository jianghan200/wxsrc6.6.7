package com.tencent.matrix.resource.c.a;

public final class a
{
  public final int bsa;
  public final b bsb;
  public final Object bsc;
  
  public a(int paramInt, b paramb, Object paramObject)
  {
    this.bsa = paramInt;
    this.bsb = paramb;
    this.bsc = paramObject;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (!(paramObject instanceof a)) {
        return false;
      }
      paramObject = (a)paramObject;
      if (this.bsa != ((a)paramObject).bsa) {
        return false;
      }
      if (!this.bsb.equals(((a)paramObject).bsb)) {
        return false;
      }
    } while (((this.bsc == null) || (this.bsc.equals(((a)paramObject).bsc))) && ((((a)paramObject).bsc == null) || (((a)paramObject).bsc.equals(this.bsc))));
    return false;
  }
  
  public final int hashCode()
  {
    return (this.bsb.hashCode() << 31) + this.bsa;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/matrix/resource/c/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */