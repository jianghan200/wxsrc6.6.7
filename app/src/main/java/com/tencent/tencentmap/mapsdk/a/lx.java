package com.tencent.tencentmap.mapsdk.a;

public final class lx
  extends mf
  implements Cloneable
{
  static byte[] c;
  public String a = "";
  public byte[] b = null;
  
  static
  {
    if (!lx.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      d = bool;
      return;
    }
  }
  
  public final Object clone()
  {
    Object localObject1 = null;
    try
    {
      Object localObject2 = super.clone();
      localObject1 = localObject2;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      while (d) {}
      throw new AssertionError();
    }
    return localObject1;
  }
  
  public final void display(StringBuilder paramStringBuilder, int paramInt)
  {
    paramStringBuilder = new mb(paramStringBuilder, paramInt);
    paramStringBuilder.a(this.a, "strId");
    paramStringBuilder.a(this.b, "value");
  }
  
  public final void displaySimple(StringBuilder paramStringBuilder, int paramInt)
  {
    paramStringBuilder = new mb(paramStringBuilder, paramInt);
    paramStringBuilder.a(this.a, true);
    paramStringBuilder.a(this.b, false);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == null) {}
    do
    {
      return false;
      paramObject = (lx)paramObject;
    } while ((!mg.a(this.a, ((lx)paramObject).a)) || (!mg.a(this.b, ((lx)paramObject).b)));
    return true;
  }
  
  public final int hashCode()
  {
    try
    {
      throw new Exception("Need define key first!");
    }
    catch (Exception localException) {}
    return 0;
  }
  
  public final void readFrom(md parammd)
  {
    this.a = parammd.a(0, true);
    if (c == null)
    {
      byte[] arrayOfByte = new byte[1];
      c = arrayOfByte;
      arrayOfByte[0] = 0;
    }
    this.b = parammd.a(c, 1, true);
  }
  
  public final void writeTo(me paramme)
  {
    paramme.a(this.a, 0);
    paramme.a(this.b, 1);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/lx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */