package com.tencent.mm.plugin.exdevice.i;

import com.tencent.mm.model.au;
import com.tencent.mm.plugin.exdevice.e.e;
import com.tencent.mm.plugin.exdevice.service.p;
import com.tencent.mm.plugin.exdevice.service.u;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.x;
import junit.framework.Assert;

public class a
  implements c
{
  private long iyn = -1L;
  protected com.tencent.mm.plugin.exdevice.b.c izu = null;
  protected d izv = null;
  private m izw = null;
  
  public a(com.tencent.mm.plugin.exdevice.b.c paramc, d paramd)
  {
    this.izu = paramc;
    this.izv = paramd;
  }
  
  public final void a(long paramLong, int paramInt1, int paramInt2, String paramString, p paramp)
  {
    int j = 1;
    x.i("MicroMsg.exdevice.ExDeviceTask", "------onTaskEnd------ taskId = %d, errType = %d, errCode = %d, errMsg = %s, deviceId = %d, reqCmdId = %d, respCmdId = %d", new Object[] { Long.valueOf(paramLong), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, Long.valueOf(this.izu.hjj), Short.valueOf(this.izu.aGA()), Short.valueOf(this.izu.isC) });
    long l = this.izu.hjj;
    if (paramInt1 == 0) {}
    for (int i = 1;; i = 0)
    {
      com.tencent.mm.plugin.exdevice.g.a.l(l, i);
      if ((paramp == null) || (paramp == this.izw)) {
        break;
      }
      x.e("MicroMsg.exdevice.ExDeviceTask", "netCmd != mRemoteTask");
      return;
    }
    if ((-1 == paramInt1) && (-2 == paramInt2)) {
      x.e("MicroMsg.exdevice.ExDeviceTask", "Time Out in local!!!");
    }
    if (this.izu.isD != null)
    {
      i = this.izu.isD.iwS;
      if ((-5 == i) || (-3 == i) || (-4 == i))
      {
        x.w("MicroMsg.exdevice.ExDeviceTask", "ErrorCode = %d, destroy channel(deviceId = %d)", new Object[] { Integer.valueOf(this.izu.isD.iwS), Long.valueOf(this.izu.hjj) });
        if ((u.aHG().isY == null) || (!u.aHG().isY.cT(this.izu.hjj))) {
          break label315;
        }
      }
    }
    label315:
    for (i = j;; i = 0)
    {
      if (i == 0) {
        x.e("MicroMsg.exdevice.ExDeviceTask", "stopChannel Failed!!!");
      }
      if (this.izv != null) {
        this.izv.a(paramLong, paramInt1, paramInt2, paramString);
      }
      this.izw = null;
      return;
      i = 0;
      break;
    }
  }
  
  public final void a(d paramd)
  {
    this.izv = paramd;
  }
  
  public final boolean b(com.tencent.mm.plugin.exdevice.service.m paramm)
  {
    if (paramm == null)
    {
      x.e("MicroMsg.exdevice.ExDeviceTask", "dispatcher is null");
      return false;
    }
    if (this.izw != null)
    {
      x.e("MicroMsg.exdevice.ExDeviceTask", "Prev task is still working!!!");
      return false;
    }
    x.i("MicroMsg.exdevice.ExDeviceTask", "------startTask begin------cmdReqId = %d, cmdRespId = %d, deviceId = %d", new Object[] { Short.valueOf(this.izu.aGA()), Short.valueOf(this.izu.isC), Long.valueOf(this.izu.hjj) });
    m localm = new m(this.izu, this);
    long l = paramm.a(localm);
    if (-1L == l)
    {
      x.e("MicroMsg.exdevice.ExDeviceTask", "dispatcher.startTask Failed!!!");
      return false;
    }
    this.izw = localm;
    this.iyn = l;
    paramm = this.izw;
    Assert.assertNotNull(paramm.izR);
    paramm = paramm.izR;
    paramm.izK = false;
    paramm.izL = false;
    au.Em().cil().postDelayed(paramm.izM, 15000L);
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/exdevice/i/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */