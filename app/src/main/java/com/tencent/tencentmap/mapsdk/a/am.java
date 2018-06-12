package com.tencent.tencentmap.mapsdk.a;

import com.qq.sim.Millis100TimeProvider;
import java.net.InetAddress;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class am
  implements ah
{
  private static final AtomicInteger p = new AtomicInteger(0);
  String a;
  String b;
  byte[] c;
  Map<String, String> d;
  Map<String, String> e;
  ao f;
  boolean g;
  boolean h;
  io i = null;
  int j;
  int k;
  aq l;
  public li m;
  int n = -1;
  int o = -1;
  
  public am(String paramString1, String paramString2, byte[] paramArrayOfByte, int paramInt, Map<String, String> paramMap1, Map<String, String> paramMap2, ao paramao, ar paramar, boolean paramBoolean)
  {
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramArrayOfByte;
    this.d = paramMap1;
    this.e = paramMap2;
    this.f = paramao;
    this.g = paramao.g();
    this.f.b(paramString1);
    this.f.a(paramString2);
    this.f.a(paramar);
    this.h = paramBoolean;
    this.k = paramInt;
    if (paramBoolean)
    {
      this.i = new io((short)1, (byte)0, this.j, paramao.h(), paramString1, paramString2, paramArrayOfByte, paramInt, paramMap1, paramMap2);
      return;
    }
    this.i = new io((short)1, (byte)1, this.j, paramao.h(), paramString1, paramString2, paramArrayOfByte, paramInt, paramMap1, paramMap2);
  }
  
  private static String k()
  {
    try
    {
      byte[] arrayOfByte1 = InetAddress.getByName(mj.a).getAddress();
      int i1 = (int)(Millis100TimeProvider.INSTANCE.currentTimeMillis() & 0xFFFFFFFF);
      int i2 = (int)(Thread.currentThread().getId() & 0xFFFFFFFF);
      short s = (short)(p.getAndIncrement() & 0xFFFF);
      return String.format("%02x%02x%02x%02x%08x%08x%04x", new Object[] { Byte.valueOf(arrayOfByte1[0]), Byte.valueOf(arrayOfByte1[1]), Byte.valueOf(arrayOfByte1[2]), Byte.valueOf(arrayOfByte1[3]), Integer.valueOf(i1), Integer.valueOf(i2), Short.valueOf(s) });
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        byte[] arrayOfByte2 = new byte[4];
        byte[] tmp120_119 = arrayOfByte2;
        tmp120_119[0] = 127;
        byte[] tmp125_120 = tmp120_119;
        tmp125_120[1] = 0;
        byte[] tmp130_125 = tmp125_120;
        tmp130_125[2] = 0;
        byte[] tmp135_130 = tmp130_125;
        tmp135_130[3] = 1;
        tmp135_130;
      }
    }
  }
  
  public String a()
  {
    return this.a;
  }
  
  public boolean a(int paramInt)
  {
    return (this.j & paramInt) != 0;
  }
  
  public int b()
  {
    return this.n;
  }
  
  public void b(int paramInt)
  {
    this.j |= paramInt;
    this.i.c = this.j;
  }
  
  public int c()
  {
    return this.o;
  }
  
  public io d()
  {
    return this.i;
  }
  
  public ao e()
  {
    return this.f;
  }
  
  public boolean f()
  {
    return this.h;
  }
  
  public void g()
  {
    at.a locala = at.a.a().e;
    String str;
    int i1;
    int i2;
    int i3;
    if (locala.a)
    {
      if (locala.e == -1) {
        locala.a = false;
      }
      str = k();
      i1 = 0;
      i2 = 0;
      i3 = 0;
    }
    while (str.length() == 0)
    {
      return;
      str = locala.b;
      i3 = locala.c;
      i2 = locala.d;
      i1 = locala.e;
    }
    this.m = new li();
    this.m.a = str;
    this.m.g = i3;
    this.m.h = i2;
    this.m.i = i1;
    this.m.b = null;
    this.m.c = this.a;
    this.m.d = this.b;
    this.m.e = "";
    this.m.f = null;
    locala.b = str;
    locala.c = i3;
    locala.d = (i2 + 1);
    locala.e = i1;
    this.e.put("STATUS_SAMPLE_KEY", str + "|" + i3 + "|" + i2);
    b(8);
  }
  
  public void h()
  {
    if (this.e.containsKey("STATUS_GRID_KEY"))
    {
      String str = (String)this.e.get("STATUS_GRID_KEY");
      if (this.l.taf_Router() != null) {
        this.o = this.l.taf_Router().a(str);
      }
      if (this.o == -1)
      {
        at.b localb = at.a.a();
        if ((str.equals(localb.c)) && (localb.b != -1)) {
          this.o = localb.b;
        }
      }
      if (this.o != -1)
      {
        this.e.put("STATUS_GRID_CODE", String.valueOf(this.o));
        b(2);
      }
    }
  }
  
  public void i()
  {
    this.n = at.a.a().a;
    if (this.n != -1) {
      b(1);
    }
  }
  
  public void j()
  {
    String str = at.a.a().d;
    if ((str != null) && (str.trim().length() != 0)) {
      this.e.put("STATUS_DYED_KEY", str);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */