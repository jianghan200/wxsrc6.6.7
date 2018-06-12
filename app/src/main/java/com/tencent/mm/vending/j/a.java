package com.tencent.mm.vending.j;

public class a
{
  public Object[] uRO;
  
  public static <$1> b<$1> cz($1 param$1)
  {
    b localb = new b();
    localb.uRO = new Object[] { param$1 };
    return (b)localb;
  }
  
  public static <$1, $2> c<$1, $2> x($1 param$1, $2 param$2)
  {
    c localc = new c();
    localc.uRO = new Object[] { param$1, param$2 };
    return (c)localc;
  }
  
  public final <T> T get(int paramInt)
  {
    if (this.uRO.length <= paramInt) {
      return null;
    }
    return (T)this.uRO[paramInt];
  }
  
  public final int size()
  {
    if (this.uRO == null) {
      return 0;
    }
    return this.uRO.length;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    int j = 1;
    Object[] arrayOfObject = this.uRO;
    int k = arrayOfObject.length;
    int i = 0;
    if (i < k)
    {
      Object localObject = arrayOfObject[i];
      if (j != 0) {
        j = 0;
      }
      for (;;)
      {
        localStringBuilder.append(localObject);
        i += 1;
        break;
        localStringBuilder.append(",");
      }
    }
    return localStringBuilder.toString();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/vending/j/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */