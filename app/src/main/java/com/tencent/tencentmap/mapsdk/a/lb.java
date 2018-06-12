package com.tencent.tencentmap.mapsdk.a;

import java.util.Arrays;

public final class lb
  extends mf
  implements Cloneable, Comparable<lb>
{
  public String a = "";
  public String b = "";
  public String c = "";
  public String d = "";
  public String e = "";
  public int f = 0;
  public int g = 0;
  public String h = "";
  public String i = "";
  public String j = "";
  public String k = "";
  
  static
  {
    if (!lb.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      l = bool;
      return;
    }
  }
  
  public lb() {}
  
  public lb(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt1, int paramInt2, String paramString6, String paramString7, String paramString8, String paramString9)
  {
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramString3;
    this.d = paramString4;
    this.e = paramString5;
    this.f = paramInt1;
    this.g = paramInt2;
    this.h = paramString6;
    this.i = paramString7;
    this.j = paramString8;
    this.k = paramString9;
  }
  
  public final int a(lb paramlb)
  {
    int i1 = 0;
    int[] arrayOfInt = new int[11];
    arrayOfInt[0] = mg.a(this.a, paramlb.a);
    arrayOfInt[1] = mg.a(this.b, paramlb.b);
    arrayOfInt[2] = mg.a(this.c, paramlb.c);
    arrayOfInt[3] = mg.a(this.d, paramlb.d);
    arrayOfInt[4] = mg.a(this.e, paramlb.e);
    arrayOfInt[5] = mg.b(this.f, paramlb.f);
    arrayOfInt[6] = mg.b(this.g, paramlb.g);
    arrayOfInt[7] = mg.a(this.h, paramlb.h);
    arrayOfInt[8] = mg.a(this.i, paramlb.i);
    arrayOfInt[9] = mg.a(this.j, paramlb.j);
    arrayOfInt[10] = mg.a(this.k, paramlb.k);
    int m = 0;
    for (;;)
    {
      int n = i1;
      if (m < 11)
      {
        if (arrayOfInt[m] != 0) {
          n = arrayOfInt[m];
        }
      }
      else {
        return n;
      }
      m += 1;
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
      while (l) {}
      throw new AssertionError();
    }
    return localObject1;
  }
  
  public final void display(StringBuilder paramStringBuilder, int paramInt)
  {
    paramStringBuilder = new mb(paramStringBuilder, paramInt);
    paramStringBuilder.a(this.a, "masterName");
    paramStringBuilder.a(this.b, "slaveName");
    paramStringBuilder.a(this.c, "interfaceName");
    paramStringBuilder.a(this.d, "masterIp");
    paramStringBuilder.a(this.e, "slaveIp");
    paramStringBuilder.a(this.f, "slavePort");
    paramStringBuilder.a(this.g, "returnValue");
    paramStringBuilder.a(this.h, "slaveSetName");
    paramStringBuilder.a(this.i, "slaveSetArea");
    paramStringBuilder.a(this.j, "slaveSetID");
    paramStringBuilder.a(this.k, "tafVersion");
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
    paramStringBuilder.a(this.i, true);
    paramStringBuilder.a(this.j, true);
    paramStringBuilder.a(this.k, false);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == null) {}
    do
    {
      return false;
      paramObject = (lb)paramObject;
    } while ((!mg.a(this.a, ((lb)paramObject).a)) || (!mg.a(this.b, ((lb)paramObject).b)) || (!mg.a(this.c, ((lb)paramObject).c)) || (!mg.a(this.d, ((lb)paramObject).d)) || (!mg.a(this.e, ((lb)paramObject).e)) || (!mg.a(this.f, ((lb)paramObject).f)) || (!mg.a(this.g, ((lb)paramObject).g)) || (!mg.a(this.h, ((lb)paramObject).h)) || (!mg.a(this.i, ((lb)paramObject).i)) || (!mg.a(this.j, ((lb)paramObject).j)) || (!mg.a(this.k, ((lb)paramObject).k)));
    return true;
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new int[] { mg.a(this.a), mg.a(this.b), mg.a(this.c), mg.a(this.d), mg.a(this.e), mg.a(this.f), mg.a(this.g), mg.a(this.h), mg.a(this.i), mg.a(this.j), mg.a(this.k) });
  }
  
  public final void readFrom(md parammd)
  {
    this.a = parammd.a(0, true);
    this.b = parammd.a(1, true);
    this.c = parammd.a(2, true);
    this.d = parammd.a(3, true);
    this.e = parammd.a(4, true);
    this.f = parammd.a(this.f, 5, true);
    this.g = parammd.a(this.g, 6, true);
    this.h = parammd.a(7, false);
    this.i = parammd.a(8, false);
    this.j = parammd.a(9, false);
    this.k = parammd.a(10, false);
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
    if (this.h != null) {
      paramme.a(this.h, 7);
    }
    if (this.i != null) {
      paramme.a(this.i, 8);
    }
    if (this.j != null) {
      paramme.a(this.j, 9);
    }
    if (this.k != null) {
      paramme.a(this.k, 10);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/lb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */