package com.tencent.mm.plugin.zero;

import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.plugin.zero.a.f;
import com.tencent.mm.protocal.c.pm;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class c
{
  public static volatile com.tencent.mm.by.c<f> qxT;
  private final f qxU;
  
  public c()
  {
    if (qxT != null)
    {
      this.qxU = ((f)qxT.get());
      return;
    }
    this.qxU = null;
  }
  
  public final boolean a(pm parampm, boolean paramBoolean)
  {
    if (!g.Eg().Dx())
    {
      x.e("MicroMsg.SyncDoCmdDelegate", "account storage disabled, discard all commands");
      return false;
    }
    long l = bi.VF();
    byte[] arrayOfByte = ab.a(parampm.rtN);
    x.i("MicroMsg.SyncDoCmdDelegate", "doCmd %d cmdid:%d buf:%d thr:[%d]", new Object[] { Long.valueOf(l), Integer.valueOf(parampm.rtM), Integer.valueOf(bi.bD(arrayOfByte)), Long.valueOf(Thread.currentThread().getId()) });
    if (bi.bC(arrayOfByte))
    {
      x.e("MicroMsg.SyncDoCmdDelegate", "docmd: no protobuf found.");
      return false;
    }
    try
    {
      if (this.qxU != null) {
        this.qxU.a(parampm, arrayOfByte, paramBoolean);
      }
      x.i("MicroMsg.SyncDoCmdDelegate", "doCmd FIN %d cmdid:%d Time:%d", new Object[] { Long.valueOf(l), Integer.valueOf(parampm.rtM), Long.valueOf(bi.bH(l)) });
      return true;
    }
    catch (Exception parampm)
    {
      x.printErrStackTrace("MicroMsg.SyncDoCmdDelegate", parampm, "", new Object[0]);
    }
    return false;
  }
  
  public final void bD(Object paramObject)
  {
    if (this.qxU != null) {
      this.qxU.bD(paramObject);
    }
  }
  
  public final void bE(Object paramObject)
  {
    if (this.qxU != null) {
      this.qxU.bE(paramObject);
    }
  }
  
  public final void bF(Object paramObject)
  {
    if (this.qxU != null) {
      this.qxU.bF(paramObject);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/zero/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */