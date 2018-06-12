package com.tencent.tencentmap.mapsdk.a;

import java.util.Arrays;

public final class fl
  extends mf
  implements Cloneable, Comparable<fl>
{
  public String a = "";
  public int b = 0;
  public int c = 0;
  public int d = 0;
  public int e = 0;
  public int f = 0;
  public int g = 0;
  public String h = "";
  public int i = 0;
  
  static
  {
    if (!fl.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      j = bool;
      return;
    }
  }
  
  public final int a(fl paramfl)
  {
    int n = 0;
    int[] arrayOfInt = new int[6];
    arrayOfInt[0] = mg.a(this.a, paramfl.a);
    arrayOfInt[1] = mg.b(this.b, paramfl.b);
    arrayOfInt[2] = mg.b(this.c, paramfl.c);
    arrayOfInt[3] = mg.b(this.d, paramfl.d);
    arrayOfInt[4] = mg.b(this.e, paramfl.e);
    arrayOfInt[5] = mg.b(this.i, paramfl.i);
    int k = 0;
    for (;;)
    {
      int m = n;
      if (k < 6)
      {
        if (arrayOfInt[k] != 0) {
          m = arrayOfInt[k];
        }
      }
      else {
        return m;
      }
      k += 1;
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
    paramStringBuilder.a(this.a, "host");
    paramStringBuilder.a(this.b, "port");
    paramStringBuilder.a(this.c, "timeout");
    paramStringBuilder.a(this.d, "istcp");
    paramStringBuilder.a(this.e, "grid");
    paramStringBuilder.a(this.f, "groupworkid");
    paramStringBuilder.a(this.g, "grouprealid");
    paramStringBuilder.a(this.h, "setId");
    paramStringBuilder.a(this.i, "qos");
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
      paramObject = (fl)paramObject;
    } while ((!mg.a(this.a, ((fl)paramObject).a)) || (!mg.a(this.b, ((fl)paramObject).b)) || (!mg.a(this.c, ((fl)paramObject).c)) || (!mg.a(this.d, ((fl)paramObject).d)) || (!mg.a(this.e, ((fl)paramObject).e)) || (!mg.a(this.i, ((fl)paramObject).i)));
    return true;
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new int[] { mg.a(this.a), mg.a(this.b), mg.a(this.c), mg.a(this.d), mg.a(this.e), mg.a(this.i) });
  }
  
  public final void readFrom(md parammd)
  {
    this.a = parammd.a(0, true);
    this.b = parammd.a(this.b, 1, true);
    this.c = parammd.a(this.c, 2, true);
    this.d = parammd.a(this.d, 3, true);
    this.e = parammd.a(this.e, 4, true);
    this.f = parammd.a(this.f, 5, false);
    this.g = parammd.a(this.g, 6, false);
    this.h = parammd.a(7, false);
    this.i = parammd.a(this.i, 8, false);
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
    paramme.a(this.i, 8);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/fl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */