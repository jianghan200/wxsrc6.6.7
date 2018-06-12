package com.tencent.mm.plugin.exdevice.f.a;

import com.tencent.mm.network.q;
import com.tencent.mm.plugin.exdevice.a.b;
import com.tencent.mm.plugin.exdevice.model.ad;
import com.tencent.mm.protocal.c.rf;
import com.tencent.mm.protocal.c.rg;
import com.tencent.mm.sdk.platformtools.x;
import java.lang.ref.WeakReference;

public final class h
  extends com.tencent.mm.plugin.exdevice.a.a<rf, rg>
{
  private final WeakReference<b<h>> isV;
  String username;
  
  public h(String paramString, b<h> paramb)
  {
    this.username = paramString;
    this.isV = new WeakReference(paramb);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneDelFollow", "hy: del follow end. errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    super.a(paramInt1, paramInt2, paramInt3, paramString, paramq, paramArrayOfByte);
    if ((paramInt2 == 0) && (paramInt3 == 0)) {
      ad.aHg().Ag(this.username);
    }
    paramq = (b)this.isV.get();
    if (paramq != null) {
      paramq.b(paramInt2, paramInt3, paramString, this);
    }
  }
  
  public final int getType()
  {
    return 1792;
  }
  
  protected final String getUri()
  {
    return "/cgi-bin/mmoc-bin/hardware/delfollow";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/exdevice/f/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */