package com.tencent.tencentmap.mapsdk.a;

public final class lt
  extends mf
  implements Cloneable
{
  public int a = 0;
  public String b = "";
  public int c = 0;
  
  static
  {
    if (!lt.class.desiredAssertionStatus()) {}
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
    paramStringBuilder.a(this.a, "iErrCode");
    paramStringBuilder.a(this.b, "strErrDesc");
    paramStringBuilder.a(this.c, "iSubErrCode");
  }
  
  public final void displaySimple(StringBuilder paramStringBuilder, int paramInt)
  {
    paramStringBuilder = new mb(paramStringBuilder, paramInt);
    paramStringBuilder.a(this.a, true);
    paramStringBuilder.a(this.b, true);
    paramStringBuilder.a(this.c, false);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == null) {}
    do
    {
      return false;
      paramObject = (lt)paramObject;
    } while ((!mg.a(this.a, ((lt)paramObject).a)) || (!mg.a(this.b, ((lt)paramObject).b)) || (!mg.a(this.c, ((lt)paramObject).c)));
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
    this.a = parammd.a(this.a, 0, true);
    this.b = parammd.a(1, true);
    this.c = parammd.a(this.c, 2, false);
  }
  
  public final void writeTo(me paramme)
  {
    paramme.a(this.a, 0);
    paramme.a(this.b, 1);
    paramme.a(this.c, 2);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/lt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */