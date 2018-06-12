package com.tencent.mm.plugin.exdevice.i;

import com.tencent.mm.plugin.exdevice.b.h;
import com.tencent.mm.plugin.exdevice.model.ad;
import com.tencent.mm.plugin.exdevice.service.m;
import com.tencent.mm.plugin.exdevice.service.u;
import com.tencent.mm.sdk.platformtools.x;

public final class b
  extends a
  implements d
{
  private final d izx;
  
  public b(com.tencent.mm.plugin.exdevice.b.c paramc, d paramd)
  {
    super(paramc, paramd);
    a(this);
    this.izx = paramd;
  }
  
  public final void a(long paramLong, int paramInt1, int paramInt2, String paramString)
  {
    x.i("MicroMsg.exdevice.ExDeviceTaskSwitchViewPush", "onTaskSceneEnd, SwitchViewPush taskId = %d, errType = %d, errCode = %d, errMsg = %s", new Object[] { Long.valueOf(paramLong), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    com.tencent.mm.plugin.exdevice.h.b localb;
    if (2 == ((h)this.izu).aGE())
    {
      x.i("MicroMsg.exdevice.ExDeviceTaskSwitchViewPush", "Switch view push has been sended to device, now try to check close strategy");
      localb = ad.aHe().Ak(this.izu.hjj);
      if (localb == null)
      {
        x.e("MicroMsg.exdevice.ExDeviceTaskSwitchViewPush", "get hdinfo by mac failed!!!, Mac = %d", new Object[] { Long.valueOf(this.izu.hjj) });
        if (this.izx != null) {
          this.izx.a(paramLong, paramInt1, paramInt2, paramString);
        }
        return;
      }
      switch (localb.field_closeStrategy)
      {
      default: 
        x.e("MicroMsg.exdevice.ExDeviceTaskSwitchViewPush", "Error close strategy(%d)", new Object[] { Integer.valueOf(localb.field_closeStrategy) });
      }
    }
    while (this.izx != null)
    {
      this.izx.a(paramLong, paramInt1, paramInt2, paramString);
      return;
      x.i("MicroMsg.exdevice.ExDeviceTaskSwitchViewPush", "the close Strategy is %d, stop channel(device id = %d)", new Object[] { Integer.valueOf(localb.field_closeStrategy), Long.valueOf(this.izu.hjj) });
      if (u.aHG().isY != null)
      {
        u.aHG().isY.cT(this.izu.hjj);
        continue;
        x.i("MicroMsg.exdevice.ExDeviceTaskSwitchViewPush", "the close Strategy is %d, Record it(%d) in the shut down device list", new Object[] { Integer.valueOf(localb.field_closeStrategy), Long.valueOf(this.izu.hjj) });
        if (!com.tencent.mm.plugin.exdevice.h.a.A("shut_down_device", this.izu.hjj)) {
          x.e("MicroMsg.exdevice.ExDeviceTaskSwitchViewPush", "MMExDeviceCore.getDeviceInfoManager().addShutDownDevice failed!!!");
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/exdevice/i/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */