package com.tencent.tencentmap.mapsdk.a;

public final class li
  extends mf
  implements Cloneable
{
  public String a = "";
  public String b = "";
  public String c = "";
  public String d = "";
  public String e = "";
  public String f = "";
  public int g = 0;
  public int h = 0;
  public int i = 0;
  
  static
  {
    if (!li.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      j = bool;
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
      while (j) {}
      throw new AssertionError();
    }
    return localObject1;
  }
  
  public final void display(StringBuilder paramStringBuilder, int paramInt)
  {
    paramStringBuilder = new mb(paramStringBuilder, paramInt);
    paramStringBuilder.a(this.a, "unid");
    paramStringBuilder.a(this.b, "masterName");
    paramStringBuilder.a(this.c, "slaveName");
    paramStringBuilder.a(this.d, "interfaceName");
    paramStringBuilder.a(this.e, "masterIp");
    paramStringBuilder.a(this.f, "slaveIp");
    paramStringBuilder.a(this.g, "depth");
    paramStringBuilder.a(this.h, "width");
    paramStringBuilder.a(this.i, "parentWidth");
  }
  
  public final void displaySimple(StringBuilder paramStringBuilder, int paramInt)
  {
    paramStringBuilder = new mb(paramStringBuilder, paramInt);
    paramStringBuilder.a(this.a, true);
    paramStringBuilder.a(this.b, true);
    paramStringBuilder.a(this.c, true);
    paramStringBuilder.a(this.d, true);
    paramStringBuilder.a(this.e, true);
    paramStringBuilder.a(this.f, true);
    paramStringBuilder.a(this.g, true);
    paramStringBuilder.a(this.h, true);
    paramStringBuilder.a(this.i, false);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == null) {}
    do
    {
      return false;
      paramObject = (li)paramObject;
    } while ((!mg.a(this.a, ((li)paramObject).a)) || (!mg.a(this.b, ((li)paramObject).b)) || (!mg.a(this.c, ((li)paramObject).c)) || (!mg.a(this.d, ((li)paramObject).d)) || (!mg.a(this.e, ((li)paramObject).e)) || (!mg.a(this.f, ((li)paramObject).f)) || (!mg.a(this.g, ((li)paramObject).g)) || (!mg.a(this.h, ((li)paramObject).h)) || (!mg.a(this.i, ((li)paramObject).i)));
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
    this.b = parammd.a(1, true);
    this.c = parammd.a(2, true);
    this.d = parammd.a(3, true);
    this.e = parammd.a(4, true);
    this.f = parammd.a(5, true);
    this.g = parammd.a(this.g, 6, true);
    this.h = parammd.a(this.h, 7, true);
    this.i = parammd.a(this.i, 8, true);
  }
  
  public final void writeTo(me paramme)
  {
    paramme.a(this.a, 0);
    paramme.a(this.b, 1);
    paramme.a(this.c, 2);
    paramme.a(this.d, 3);
    paramme.a(this.e, 4);
    paramme.a(this.f, 5);
    paramme.a(this.g, 6);
    paramme.a(this.h, 7);
    paramme.a(this.i, 8);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/li.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */