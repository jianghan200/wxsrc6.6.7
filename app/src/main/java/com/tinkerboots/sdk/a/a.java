package com.tinkerboots.sdk.a;

import com.tinkerboots.sdk.a.a.b;

public final class a
{
  private static volatile a vGc;
  public long fqj = 10800000L;
  public boolean isDebug;
  public b vGb;
  public final com.tinkerboots.sdk.a.b.a vGd = com.tinkerboots.sdk.a.b.a.cJD();
  
  private a(b paramb)
  {
    this.vGb = paramb;
  }
  
  public static a a(b paramb)
  {
    if (vGc != null) {
      throw new RuntimeException("tinker server client is already init");
    }
    if (vGc == null) {}
    try
    {
      if (vGc == null) {
        vGc = new a(paramb);
      }
      return vGc;
    }
    finally {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tinkerboots/sdk/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */