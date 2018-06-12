package com.tencent.tencentmap.mapsdk.a;

import java.util.HashMap;
import java.util.Map;

public final class jp
  extends mf
  implements Cloneable
{
  static byte[] i;
  static Map<String, String> j;
  public short a = 0;
  public byte b = 0;
  public int c = 0;
  public int d = 0;
  public int e = 0;
  public byte[] f = null;
  public Map<String, String> g = null;
  public String h = "";
  
  static
  {
    if (!jp.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      k = bool;
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
      while (k) {}
      throw new AssertionError();
    }
    return localObject1;
  }
  
  public final void display(StringBuilder paramStringBuilder, int paramInt)
  {
    paramStringBuilder = new mb(paramStringBuilder, paramInt);
    paramStringBuilder.a(this.a, "iVersion");
    paramStringBuilder.a(this.b, "cPacketType");
    paramStringBuilder.a(this.c, "iRequestId");
    paramStringBuilder.a(this.d, "iMessageType");
    paramStringBuilder.a(this.e, "iRet");
    paramStringBuilder.a(this.f, "sBuffer");
    paramStringBuilder.a(this.g, "status");
    paramStringBuilder.a(this.h, "sResultDesc");
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
    paramStringBuilder.a(this.h, false);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == null) {}
    do
    {
      return false;
      paramObject = (jp)paramObject;
    } while ((!mg.a(this.a, ((jp)paramObject).a)) || (!mg.a(this.b, ((jp)paramObject).b)) || (!mg.a(this.c, ((jp)paramObject).c)) || (!mg.a(this.d, ((jp)paramObject).d)) || (!mg.a(this.e, ((jp)paramObject).e)) || (!mg.a(this.f, ((jp)paramObject).f)) || (!mg.a(this.g, ((jp)paramObject).g)) || (!mg.a(this.h, ((jp)paramObject).h)));
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
    this.a = parammd.a(this.a, 1, true);
    this.b = parammd.a(this.b, 2, true);
    this.c = parammd.a(this.c, 3, true);
    this.d = parammd.a(this.d, 4, true);
    this.e = parammd.a(this.e, 5, true);
    if (i == null)
    {
      byte[] arrayOfByte = (byte[])new byte[1];
      i = arrayOfByte;
      ((byte[])arrayOfByte)[0] = 0;
    }
    this.f = ((byte[])parammd.a(i, 6, true));
    if (j == null)
    {
      j = new HashMap();
      j.put("", "");
    }
    this.g = ((Map)parammd.a(j, 7, true));
    this.h = parammd.a(8, false);
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
    if (this.h != null) {
      paramme.a(this.h, 8);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/jp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */