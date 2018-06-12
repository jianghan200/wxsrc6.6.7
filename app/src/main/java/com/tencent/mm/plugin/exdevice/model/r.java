package com.tencent.mm.plugin.exdevice.model;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.exdevice.service.f;
import com.tencent.mm.plugin.exdevice.service.m;
import com.tencent.mm.plugin.exdevice.service.u;
import com.tencent.mm.protocal.c.alx;
import com.tencent.mm.protocal.c.alz;
import com.tencent.mm.protocal.c.ama;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.sdk.platformtools.x;

public final class r
  extends l
  implements k
{
  private String bKC;
  private com.tencent.mm.ab.b diG = null;
  private com.tencent.mm.ab.e diJ = null;
  String ivE;
  
  public r(String paramString1, String paramString2, String paramString3, int paramInt, byte[] paramArrayOfByte)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new alz();
    ((b.a)localObject).dIH = new ama();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/harddeviceauth";
    ((b.a)localObject).dIF = 541;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (alz)this.diG.dID.dIL;
    alx localalx = new alx();
    localalx.reT = paramString2;
    localalx.hbO = paramString3;
    ((alz)localObject).rhk = localalx;
    ((alz)localObject).rOG = paramInt;
    ((alz)localObject).rOH = new bhy().bq(paramArrayOfByte);
    this.ivE = paramString3;
    this.bKC = paramString1;
  }
  
  private byte[] DE()
  {
    Object localObject = (ama)this.diG.dIE.dIL;
    try
    {
      localObject = ((ama)localObject).rer.siK.lR;
      return (byte[])localObject;
    }
    catch (Exception localException)
    {
      x.printErrStackTrace("MicroMsg.exdevice.NetSceneHardDeviceAuth", localException, "", new Object[0]);
    }
    return null;
  }
  
  private byte[] aGZ()
  {
    Object localObject = (ama)this.diG.dIE.dIL;
    try
    {
      localObject = ((ama)localObject).rOI.siK.lR;
      return (byte[])localObject;
    }
    catch (Exception localException)
    {
      x.printErrStackTrace("MicroMsg.exdevice.NetSceneHardDeviceAuth", localException, "", new Object[0]);
    }
    return null;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.exdevice.NetSceneHardDeviceAuth", "onGYNetEnd netId = " + paramInt1 + " errType = " + paramInt2 + " errCode = " + paramInt3 + paramString);
    paramq = ad.aHe().Al(this.ivE);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      Object localObject = (ama)this.diG.dIE.dIL;
      if (paramq != null)
      {
        paramArrayOfByte = aGY();
        if (paramArrayOfByte != null) {
          paramq.field_authBuf = paramArrayOfByte;
        }
        paramq.cCO = ((ama)localObject).rOL;
        paramq.cpN = true;
        paramq.cCN = ((ama)localObject).rOK;
        paramq.cpN = true;
        localObject = DE();
        if (localObject != null)
        {
          u.aHF().b(paramq.field_mac, (byte[])localObject, 2);
          if (u.aHG().isY != null) {
            u.aHG().isY.setChannelSessionKey(paramq.field_mac, (byte[])localObject);
          }
          paramq.field_sessionKey = ((byte[])localObject);
        }
        localObject = aGZ();
        if (localObject != null)
        {
          u.aHF().b(paramq.field_mac, (byte[])localObject, 3);
          paramq.field_sessionBuf = ((byte[])localObject);
        }
        localObject = aGY();
        if (paramArrayOfByte != null)
        {
          u.aHF().b(paramq.field_mac, (byte[])localObject, 1);
          paramq.field_authBuf = paramArrayOfByte;
        }
        paramq.cCP = (System.currentTimeMillis() / 1000L);
        paramq.cpN = true;
        if (2 == u.aHF().cM(paramq.field_mac))
        {
          ad.aHp();
          e.e(this.bKC, paramq.field_url, 2, paramq.field_deviceID);
        }
        u.aHF().cP(paramq.field_mac);
        x.i("MicroMsg.exdevice.NetSceneHardDeviceAuth", "update local device auth infos = %b", new Object[] { Boolean.valueOf(ad.aHe().c(paramq, new String[0])) });
      }
    }
    for (;;)
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
      x.e("MicroMsg.exdevice.NetSceneHardDeviceAuth", "SubCoreExDevice.getHardDeviceInfoStorage().getByDeviceIdServer == null");
      continue;
      if (paramq != null)
      {
        u.aHF().cQ(paramq.field_mac);
        ad.aHp();
        e.e(this.bKC, paramq.field_url, 4, paramq.field_deviceID);
      }
      ad.aHp();
      e.bj(this.bKC, 3);
    }
  }
  
  public final byte[] aGY()
  {
    Object localObject = (ama)this.diG.dIE.dIL;
    try
    {
      localObject = ((ama)localObject).rOJ.siK.lR;
      return (byte[])localObject;
    }
    catch (Exception localException)
    {
      x.printErrStackTrace("MicroMsg.exdevice.NetSceneHardDeviceAuth", localException, "", new Object[0]);
    }
    return null;
  }
  
  public final int getType()
  {
    return 541;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/exdevice/model/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */