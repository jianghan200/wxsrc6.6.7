package com.tencent.tencentmap.mapsdk.a;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class fb
  implements ew
{
  private boolean a = false;
  private boolean b = false;
  private boolean c = true;
  private String d = null;
  private int[] e = null;
  private String f = "";
  private String g = null;
  private boolean h = true;
  private boolean i = true;
  private Map j = new HashMap();
  private byte[] k = null;
  private long l = 0L;
  private int m = 32768;
  private int n = 10000;
  private int o = 10000;
  private int p = 3;
  private boolean q = true;
  private List r = new ArrayList();
  private volatile boolean s = false;
  private String t = "";
  
  public fb(String paramString, int[] paramArrayOfInt)
  {
    this.d = paramString;
    this.e = paramArrayOfInt;
    if ((this.e != null) && (this.e[0] != -1)) {}
    for (this.f = (this.d + ":" + this.e[0]);; this.f = this.d)
    {
      this.t = fz.b(this.d);
      return;
    }
  }
  
  public final String a()
  {
    return this.t;
  }
  
  public final void a(int paramInt)
  {
    if ((paramInt > 5120) && (paramInt < 2097152)) {
      this.m = paramInt;
    }
  }
  
  public final void a(long paramLong)
  {
    this.l = paramLong;
  }
  
  public final void a(fd paramfd)
  {
    this.r.add(paramfd);
  }
  
  public final void a(String paramString)
  {
    this.g = paramString;
  }
  
  public final void a(String paramString1, String paramString2)
  {
    if ((TextUtils.isEmpty(paramString1)) || (TextUtils.isEmpty(paramString2))) {
      return;
    }
    this.j.put(paramString1, paramString2);
  }
  
  public final void a(Map paramMap)
  {
    this.j.putAll(paramMap);
  }
  
  public final void a(boolean paramBoolean)
  {
    this.a = paramBoolean;
  }
  
  public final void a(byte[] paramArrayOfByte)
  {
    this.k = paramArrayOfByte;
  }
  
  public final void b(int paramInt)
  {
    if ((paramInt > 6000) && (paramInt < 60000)) {
      this.n = paramInt;
    }
  }
  
  public final void b(String paramString) {}
  
  public final void b(boolean paramBoolean)
  {
    this.b = paramBoolean;
  }
  
  public final boolean b()
  {
    return this.a;
  }
  
  public final String c()
  {
    return this.d;
  }
  
  public final void c(int paramInt) {}
  
  public final void d(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt <= 8)) {
      this.p = paramInt;
    }
  }
  
  public final int[] d()
  {
    return this.e;
  }
  
  public final String e()
  {
    return this.g;
  }
  
  public final boolean f()
  {
    return this.h;
  }
  
  public final Map g()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.putAll(this.j);
    return localHashMap;
  }
  
  public final byte[] h()
  {
    return this.k;
  }
  
  public final int i()
  {
    return this.m;
  }
  
  public final int j()
  {
    return this.p;
  }
  
  public final boolean k()
  {
    return this.q;
  }
  
  public final boolean l()
  {
    return this.s;
  }
  
  public final boolean m()
  {
    return this.i;
  }
  
  public final String n()
  {
    return this.f;
  }
  
  public final int o()
  {
    return this.o;
  }
  
  public final boolean p()
  {
    return this.b;
  }
  
  public final long q()
  {
    return this.l;
  }
  
  public final boolean r()
  {
    return this.c;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/fb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */