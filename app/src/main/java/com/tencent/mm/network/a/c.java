package com.tencent.mm.network.a;

import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.p;
import com.tencent.mm.sdk.platformtools.x;
import java.net.InetAddress;

public final class c
{
  private InetAddress euc;
  private int port;
  private int type;
  
  private c(InetAddress paramInetAddress, int paramInt1, int paramInt2)
  {
    this.euc = paramInetAddress;
    this.port = paramInt1;
    this.type = paramInt2;
  }
  
  public static c oA(String paramString)
  {
    if (paramString == null) {}
    do
    {
      return null;
      paramString = paramString.split(":");
    } while ((paramString == null) || (paramString.length != 3));
    try
    {
      paramString = new c(p.Wh(paramString[0]), Integer.parseInt(paramString[1]), Integer.parseInt(paramString[2]));
      return paramString;
    }
    catch (Exception paramString)
    {
      x.e("MicroMsg.InAddress", "exception:%s", new Object[] { bi.i(paramString) });
    }
    return null;
  }
  
  public final String toString()
  {
    String str = "hc";
    if (this.type == 2) {
      str = "dns";
    }
    for (;;)
    {
      return this.euc.getHostAddress() + ":" + this.port + "(" + str + ")";
      if (this.type == 3) {
        str = "svrdns";
      } else if (this.type == 4) {
        str = "waphc";
      } else if (this.type == 5) {
        str = "newdns";
      } else if (this.type == 6) {
        str = "auth";
      } else if (this.type == 7) {
        str = "debug";
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/network/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */