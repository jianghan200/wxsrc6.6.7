package com.tencent.mm.plugin.mmsight.model;

import android.content.Context;
import com.tencent.mm.compatible.e.d.a.a;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

final class n
{
  boolean lgD = false;
  d.a.a lgE;
  final Object lock = new byte[0];
  
  public final d.a.a s(Context paramContext, int paramInt)
  {
    if (paramContext == null) {
      return null;
    }
    long l1 = bi.VF();
    long l2 = Thread.currentThread().getId();
    synchronized (this.lock)
    {
      this.lgD = false;
      this.lgE = null;
      e.post(new n.1(this, l2, l1, paramContext, paramInt), "SightCamera_openCamera");
    }
    try
    {
      this.lock.wait(30000L);
      if ((this.lgE != null) && (this.lgE.ddt != null))
      {
        x.i("MicroMsg.SightCamera.OpenCameraThread", "Open Camera Succ thread:%d Time:%d camera:%s", new Object[] { Long.valueOf(l2), Long.valueOf(bi.VF() - l1), this.lgE.ddt });
        paramContext = this.lgE;
        return paramContext;
        paramContext = finally;
        throw paramContext;
      }
    }
    catch (InterruptedException paramContext)
    {
      for (;;)
      {
        x.e("MicroMsg.SightCamera.OpenCameraThread", "Lock wait failed e:%s", new Object[] { paramContext.getMessage() });
      }
      this.lgD = true;
      x.e("MicroMsg.SightCamera.OpenCameraThread", "Open Camera Timeout:%d", new Object[] { Long.valueOf(bi.VF() - l1) });
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/mmsight/model/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */