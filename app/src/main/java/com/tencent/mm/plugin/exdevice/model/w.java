package com.tencent.mm.plugin.exdevice.model;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.exdevice.h.c;
import com.tencent.mm.plugin.exdevice.service.f;
import com.tencent.mm.plugin.exdevice.service.u;
import com.tencent.mm.protocal.c.alx;
import com.tencent.mm.protocal.c.amb;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.bkk;
import com.tencent.mm.protocal.c.bkl;
import com.tencent.mm.sdk.platformtools.x;

public final class w
  extends l
  implements k
{
  private com.tencent.mm.ab.e doG = null;
  String ivG;
  public com.tencent.mm.ab.b ivx = null;
  
  public w(long paramLong1, String paramString1, String paramString2, long paramLong2, long paramLong3, byte[] paramArrayOfByte, int paramInt)
  {
    x.i("MicroMsg.exdevice.NetSceneSendHardDeviceMsg", "NetSceneSendHardDeviceMsg deviceType = %s, deviceId = %s, sessionId = %d, createTime = %d, data length = %d, msgType = %d", new Object[] { paramString1, paramString2, Long.valueOf(paramLong2), Long.valueOf(paramLong3), Integer.valueOf(paramArrayOfByte.length), Integer.valueOf(paramInt) });
    this.ivG = paramString2;
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bkk();
    ((b.a)localObject).dIH = new bkl();
    ((b.a)localObject).dIF = 538;
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/sendharddevicemsg";
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.ivx = ((b.a)localObject).KT();
    localObject = (bkk)this.ivx.dID.dIL;
    alx localalx = new alx();
    localalx.reT = paramString1;
    localalx.hbO = paramString2;
    ((bkk)localObject).rhk = localalx;
    paramString1 = new amb();
    paramString1.rON = paramLong2;
    paramString1.lOH = ((int)paramLong3);
    paramString1.rfy = new bhy().bq(paramArrayOfByte);
    paramString1.hcE = paramInt;
    ((bkk)localObject).sjY = paramString1;
    if (paramLong1 != 0L) {
      ((bkk)localObject).rOI = new bhy().bq(u.aHF().m(paramLong1, 2));
    }
    do
    {
      return;
      paramString1 = ad.aHe().Al(paramString2);
    } while (paramString1 == null);
    ((bkk)localObject).rOI = new bhy().bq(paramString1.field_sessionBuf);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.doG = parame1;
    return a(parame, this.ivx, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.exdevice.NetSceneSendHardDeviceMsg", "onGYNetEnd netId = " + paramInt1 + " errType = " + paramInt2 + " errCode = " + paramInt3 + paramString);
    this.doG.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 538;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/exdevice/model/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */