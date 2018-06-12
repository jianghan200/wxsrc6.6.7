package com.tencent.mm.plugin.exdevice.c.a;

import com.tencent.mm.network.q;
import com.tencent.mm.plugin.exdevice.a.b;
import com.tencent.mm.protocal.c.px;
import com.tencent.mm.protocal.c.py;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.lang.ref.WeakReference;

public final class a
  extends com.tencent.mm.plugin.exdevice.a.a<px, py>
{
  String appId;
  String bKv;
  String byN;
  String isU;
  private WeakReference<b<a>> isV;
  
  public a(String paramString1, String paramString2, String paramString3, String paramString4, b<a> paramb)
  {
    this.byN = bi.oV(paramString1);
    this.bKv = bi.oV(paramString2);
    this.isU = bi.oV(paramString3);
    this.appId = bi.oV(paramString4);
    this.isV = new WeakReference(paramb);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneConnectedRouter", "ap: connected router end. errType: %d, errCode: %d, errMsg: %s, resp: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString, paramq.toString() });
    super.a(paramInt1, paramInt2, paramInt3, paramString, paramq, paramArrayOfByte);
    paramq = (b)this.isV.get();
    if (paramq != null) {
      paramq.b(paramInt2, paramInt3, paramString, this);
    }
  }
  
  public final int getType()
  {
    return 1799;
  }
  
  protected final String getUri()
  {
    return "/cgi-bin/mmoc-bin/hardware/mydevice/connectedrouter";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/exdevice/c/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */