package com.tencent.tencentmap.mapsdk.a;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

public final class io
  extends mf
{
  static byte[] k;
  static Map<String, String> l;
  public short a = 0;
  public byte b = 0;
  public int c = 0;
  public int d = 0;
  public String e = null;
  public String f = null;
  public byte[] g;
  public int h = 0;
  public Map<String, String> i;
  public Map<String, String> j;
  
  static
  {
    if (!io.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      m = bool;
      k = null;
      l = null;
      return;
    }
  }
  
  public io() {}
  
  public io(short paramShort, byte paramByte, int paramInt1, int paramInt2, String paramString1, String paramString2, byte[] paramArrayOfByte, int paramInt3, Map<String, String> paramMap1, Map<String, String> paramMap2)
  {
    this.a = paramShort;
    this.b = paramByte;
    this.c = paramInt1;
    this.d = paramInt2;
    this.e = paramString1;
    this.f = paramString2;
    this.g = paramArrayOfByte;
    this.h = paramInt3;
    this.i = paramMap1;
    this.j = paramMap2;
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
      while (m) {}
      throw new AssertionError();
    }
    return localObject1;
  }
  
  public final void display(StringBuilder paramStringBuilder, int paramInt)
  {
    paramStringBuilder = new mb(paramStringBuilder, paramInt);
    paramStringBuilder.a(this.a, "iVersion");
    paramStringBuilder.a(this.b, "cPacketType");
    paramStringBuilder.a(this.c, "iMessageType");
    paramStringBuilder.a(this.d, "iRequestId");
    paramStringBuilder.a(this.e, "sServantName");
    paramStringBuilder.a(this.f, "sFuncName");
    paramStringBuilder.a(this.g, "sBuffer");
    paramStringBuilder.a(this.h, "iTimeout");
    paramStringBuilder.a(this.i, "context");
    paramStringBuilder.a(this.j, "status");
  }
  
  public final boolean equals(Object paramObject)
  {
    paramObject = (io)paramObject;
    return (mg.a(1, ((io)paramObject).a)) && (mg.a(1, ((io)paramObject).b)) && (mg.a(1, ((io)paramObject).c)) && (mg.a(1, ((io)paramObject).d)) && (mg.a(Integer.valueOf(1), ((io)paramObject).e)) && (mg.a(Integer.valueOf(1), ((io)paramObject).f)) && (mg.a(Integer.valueOf(1), ((io)paramObject).g)) && (mg.a(1, ((io)paramObject).h)) && (mg.a(Integer.valueOf(1), ((io)paramObject).i)) && (mg.a(Integer.valueOf(1), ((io)paramObject).j));
  }
  
  public final void readFrom(md parammd)
  {
    try
    {
      this.a = parammd.a(this.a, 1, true);
      this.b = parammd.a(this.b, 2, true);
      this.c = parammd.a(this.c, 3, true);
      this.d = parammd.a(this.d, 4, true);
      this.e = parammd.a(5, true);
      this.f = parammd.a(6, true);
      if (k == null) {
        k = new byte[] { 0 };
      }
      this.g = ((byte[])parammd.a(k, 7, true));
      this.h = parammd.a(this.h, 8, true);
      HashMap localHashMap;
      if (l == null)
      {
        localHashMap = new HashMap();
        l = localHashMap;
        localHashMap.put("", "");
      }
      this.i = ((Map)parammd.a(l, 9, true));
      if (l == null)
      {
        localHashMap = new HashMap();
        l = localHashMap;
        localHashMap.put("", "");
      }
      this.j = ((Map)parammd.a(l, 10, true));
      return;
    }
    catch (Exception parammd)
    {
      System.out.println("RequestPacket decode error " + lz.a(this.g));
      throw new RuntimeException(parammd);
    }
  }
  
  public final void writeTo(me paramme)
  {
    paramme.a(this.a, 1);
    paramme.b(this.b, 2);
    paramme.a(this.c, 3);
    paramme.a(this.d, 4);
    paramme.a(this.e, 5);
    paramme.a(this.f, 6);
    paramme.a(this.g, 7);
    paramme.a(this.h, 8);
    paramme.a(this.i, 9);
    paramme.a(this.j, 10);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/io.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */