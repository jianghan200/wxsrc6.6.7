package com.tencent.tencentmap.mapsdk.a;

import java.util.ArrayList;

public final class lv
  extends mf
  implements Cloneable
{
  static byte[] k;
  static byte[] l;
  static ArrayList<lx> m;
  public short a = 0;
  public int b = 0;
  public String c = "";
  public int d = 0;
  public byte e = 0;
  public String f = "";
  public String g = "";
  public byte[] h = null;
  public byte[] i = null;
  public ArrayList<lx> j = null;
  
  static
  {
    if (!lv.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      n = bool;
      return;
    }
  }
  
  public final byte[] a()
  {
    return this.i;
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
      while (n) {}
      throw new AssertionError();
    }
    return localObject1;
  }
  
  public final void display(StringBuilder paramStringBuilder, int paramInt)
  {
    paramStringBuilder = new mb(paramStringBuilder, paramInt);
    paramStringBuilder.a(this.a, "shVer");
    paramStringBuilder.a(this.b, "eCmd");
    paramStringBuilder.a(this.c, "strSubCmd");
    paramStringBuilder.a(this.d, "iSeqNo");
    paramStringBuilder.a(this.e, "cEncodeType");
    paramStringBuilder.a(this.f, "sAppId");
    paramStringBuilder.a(this.g, "uin");
    paramStringBuilder.a(this.h, "head");
    paramStringBuilder.a(this.i, "busiBuff");
    paramStringBuilder.a(this.j, "vTag");
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
    paramStringBuilder.a(this.j, false);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == null) {}
    do
    {
      return false;
      paramObject = (lv)paramObject;
    } while ((!mg.a(this.a, ((lv)paramObject).a)) || (!mg.a(this.b, ((lv)paramObject).b)) || (!mg.a(this.c, ((lv)paramObject).c)) || (!mg.a(this.d, ((lv)paramObject).d)) || (!mg.a(this.e, ((lv)paramObject).e)) || (!mg.a(this.f, ((lv)paramObject).f)) || (!mg.a(this.g, ((lv)paramObject).g)) || (!mg.a(this.h, ((lv)paramObject).h)) || (!mg.a(this.i, ((lv)paramObject).i)) || (!mg.a(this.j, ((lv)paramObject).j)));
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
    this.b = parammd.a(this.b, 1, true);
    this.c = parammd.a(2, true);
    this.d = parammd.a(this.d, 3, false);
    this.e = parammd.a(this.e, 4, false);
    this.f = parammd.a(5, false);
    this.g = parammd.a(6, false);
    Object localObject;
    if (k == null)
    {
      localObject = new byte[1];
      k = (byte[])localObject;
      localObject[0] = 0;
    }
    this.h = parammd.a(k, 7, false);
    if (l == null)
    {
      localObject = new byte[1];
      l = (byte[])localObject;
      localObject[0] = 0;
    }
    this.i = parammd.a(l, 8, false);
    if (m == null)
    {
      m = new ArrayList();
      localObject = new lx();
      m.add(localObject);
    }
    this.j = ((ArrayList)parammd.a(m, 9, false));
  }
  
  public final void writeTo(me paramme)
  {
    paramme.a(this.a, 0);
    paramme.a(this.b, 1);
    paramme.a(this.c, 2);
    paramme.a(this.d, 3);
    paramme.b(this.e, 4);
    if (this.f != null) {
      paramme.a(this.f, 5);
    }
    if (this.g != null) {
      paramme.a(this.g, 6);
    }
    if (this.h != null) {
      paramme.a(this.h, 7);
    }
    if (this.i != null) {
      paramme.a(this.i, 8);
    }
    if (this.j != null) {
      paramme.a(this.j, 9);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/lv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */