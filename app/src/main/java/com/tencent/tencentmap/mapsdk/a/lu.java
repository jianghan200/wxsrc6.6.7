package com.tencent.tencentmap.mapsdk.a;

public final class lu
  extends mf
  implements Cloneable
{
  static lt s;
  public long a = 0L;
  public lt b = null;
  public long c = 0L;
  public String d = "";
  public String e = "";
  public String f = "";
  public String g = "";
  public String h = "";
  public String i = "";
  public String j = "";
  public String k = "";
  public String l = "";
  public String m = "";
  public String n = "";
  public String o = "";
  public String p = "";
  public String q = "";
  public String r = "";
  
  static
  {
    if (!lu.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      t = bool;
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
      while (t) {}
      throw new AssertionError();
    }
    return localObject1;
  }
  
  public final void display(StringBuilder paramStringBuilder, int paramInt)
  {
    paramStringBuilder = new mb(paramStringBuilder, paramInt);
    paramStringBuilder.a(this.a, "lCurrTime");
    paramStringBuilder.a(this.b, "stResult");
    paramStringBuilder.a(this.c, "uAccIp");
    paramStringBuilder.a(this.d, "strSessionId");
    paramStringBuilder.a(this.e, "strLC");
    paramStringBuilder.a(this.f, "strToken");
    paramStringBuilder.a(this.g, "strFr");
    paramStringBuilder.a(this.h, "strPf");
    paramStringBuilder.a(this.i, "strImei");
    paramStringBuilder.a(this.j, "strMobver");
    paramStringBuilder.a(this.k, "strNettp");
    paramStringBuilder.a(this.l, "strImsi");
    paramStringBuilder.a(this.m, "strOsVersion");
    paramStringBuilder.a(this.n, "strSoftVersion");
    paramStringBuilder.a(this.o, "strOfflineVersion");
    paramStringBuilder.a(this.p, "strChannel");
    paramStringBuilder.a(this.q, "strMachineModel");
    paramStringBuilder.a(this.r, "strUserNetType");
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
    paramStringBuilder.a(this.k, true);
    paramStringBuilder.a(this.l, true);
    paramStringBuilder.a(this.m, true);
    paramStringBuilder.a(this.n, true);
    paramStringBuilder.a(this.o, true);
    paramStringBuilder.a(this.p, true);
    paramStringBuilder.a(this.q, true);
    paramStringBuilder.a(this.r, false);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == null) {}
    do
    {
      return false;
      paramObject = (lu)paramObject;
    } while ((!mg.a(this.a, ((lu)paramObject).a)) || (!mg.a(this.b, ((lu)paramObject).b)) || (!mg.a(this.c, ((lu)paramObject).c)) || (!mg.a(this.d, ((lu)paramObject).d)) || (!mg.a(this.e, ((lu)paramObject).e)) || (!mg.a(this.f, ((lu)paramObject).f)) || (!mg.a(this.g, ((lu)paramObject).g)) || (!mg.a(this.h, ((lu)paramObject).h)) || (!mg.a(this.i, ((lu)paramObject).i)) || (!mg.a(this.j, ((lu)paramObject).j)) || (!mg.a(this.k, ((lu)paramObject).k)) || (!mg.a(this.l, ((lu)paramObject).l)) || (!mg.a(this.m, ((lu)paramObject).m)) || (!mg.a(this.n, ((lu)paramObject).n)) || (!mg.a(this.o, ((lu)paramObject).o)) || (!mg.a(this.p, ((lu)paramObject).p)) || (!mg.a(this.q, ((lu)paramObject).q)) || (!mg.a(this.r, ((lu)paramObject).r)));
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
    if (s == null) {
      s = new lt();
    }
    this.b = ((lt)parammd.a(s, 1, false));
    this.c = parammd.a(this.c, 2, false);
    this.d = parammd.a(3, false);
    this.e = parammd.a(4, false);
    this.f = parammd.a(5, false);
    this.g = parammd.a(6, false);
    this.h = parammd.a(7, false);
    this.i = parammd.a(8, false);
    this.j = parammd.a(9, false);
    this.k = parammd.a(10, false);
    this.l = parammd.a(11, false);
    this.m = parammd.a(12, false);
    this.n = parammd.a(13, false);
    this.o = parammd.a(14, false);
    this.p = parammd.a(15, false);
    this.q = parammd.a(16, false);
    this.r = parammd.a(17, false);
  }
  
  public final void writeTo(me paramme)
  {
    paramme.a(this.a, 0);
    if (this.b != null) {
      paramme.a(this.b, 1);
    }
    paramme.a(this.c, 2);
    if (this.d != null) {
      paramme.a(this.d, 3);
    }
    if (this.e != null) {
      paramme.a(this.e, 4);
    }
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
    if (this.k != null) {
      paramme.a(this.k, 10);
    }
    if (this.l != null) {
      paramme.a(this.l, 11);
    }
    if (this.m != null) {
      paramme.a(this.m, 12);
    }
    if (this.n != null) {
      paramme.a(this.n, 13);
    }
    if (this.o != null) {
      paramme.a(this.o, 14);
    }
    if (this.p != null) {
      paramme.a(this.p, 15);
    }
    if (this.q != null) {
      paramme.a(this.q, 16);
    }
    if (this.r != null) {
      paramme.a(this.r, 17);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/lu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */