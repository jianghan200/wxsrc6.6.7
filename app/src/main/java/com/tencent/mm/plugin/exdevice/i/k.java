package com.tencent.mm.plugin.exdevice.i;

import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.exdevice.model.ae;
import com.tencent.mm.plugin.exdevice.model.s;
import com.tencent.mm.plugin.exdevice.service.m;
import com.tencent.mm.sdk.platformtools.x;

public final class k
  extends ae
  implements e
{
  private int iis = -1;
  private String ius = null;
  private String iut = null;
  private String izI = null;
  
  public k(String paramString1, String paramString2, String paramString3, int paramInt)
  {
    this.ius = paramString1;
    this.izI = paramString2;
    this.iut = paramString3;
    this.iis = paramInt;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    x.i("MicroMsg.exdevice.MMWifiStatusSubscribeTaskExcuter", "onSceneEnd. errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    au.DF().b(1090, this);
  }
  
  public final boolean a(m paramm, d paramd)
  {
    x.i("MicroMsg.exdevice.MMWifiStatusSubscribeTaskExcuter", "excute MMWifiStatusSubscribeTaskExcuter. brandName=" + this.ius + ",deviceType=" + this.izI + ",deviceId=" + this.iut + ",reqType=" + this.iis);
    au.DF().a(1090, this);
    paramm = new s(this.ius, this.izI, this.iut, this.iis);
    au.DF().a(paramm, 0);
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/exdevice/i/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */