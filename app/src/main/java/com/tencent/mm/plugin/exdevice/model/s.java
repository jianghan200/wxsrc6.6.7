package com.tencent.mm.plugin.exdevice.model;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.exdevice.h.c;
import com.tencent.mm.protocal.c.ame;
import com.tencent.mm.protocal.c.amf;
import com.tencent.mm.protocal.c.bhp;
import com.tencent.mm.protocal.c.bhz;
import com.tencent.mm.protocal.c.fl;
import com.tencent.mm.sdk.platformtools.x;

public final class s
  extends l
  implements k
{
  private com.tencent.mm.ab.e doG = null;
  private String ius = null;
  private com.tencent.mm.ab.b ivF = null;
  
  public s(String paramString1, String paramString2, String paramString3, int paramInt)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new ame();
    ((b.a)localObject).dIH = new amf();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/device/subscribestatus";
    ((b.a)localObject).dIF = 1090;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.ivF = ((b.a)localObject).KT();
    localObject = (ame)this.ivF.dID.dIL;
    ((ame)localObject).rgu = com.tencent.mm.bk.b.Uw(paramString2);
    ((ame)localObject).rgs = com.tencent.mm.bk.b.Uw(paramString3);
    ((ame)localObject).jRb = paramInt;
    this.ius = paramString1;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.doG = parame1;
    return a(parame, this.ivF, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.exdevice.NetSceneHardDeviceStatusSubscribe", "onGYNetEnd netId = " + paramInt1 + " errType = " + paramInt2 + " errCode = " + paramInt3 + paramString);
    ad.aHe().Al(this.ius);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = ((amf)this.ivF.dIE.dIL).six;
      paramInt1 = paramq.rfn;
      if (paramq.rgv.siN) {
        paramq = paramq.rgv.siM;
      }
      x.i("MicroMsg.exdevice.NetSceneHardDeviceStatusSubscribe", "HardDeviceStatusSubResponse: ret=" + paramInt1 + ",msg=" + paramString);
    }
    this.doG.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 1090;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/exdevice/model/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */