package com.tencent.mm.plugin.sport.c;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bvq;
import com.tencent.mm.protocal.c.bvr;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Date;
import java.util.TimeZone;

public final class f
  extends l
  implements k
{
  private b diG = null;
  private com.tencent.mm.ab.e diJ = null;
  private bvq ooY;
  
  public f(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, String paramString3, int paramInt4)
  {
    x.i("MicroMsg.Sport.NetSceneUploadDeviceStep", "NetSceneUploadDeviceStep %s, %s, %s, %s, %s", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    b.a locala = new b.a();
    locala.dIG = new bvq();
    locala.dIH = new bvr();
    locala.uri = "/cgi-bin/mmoc-bin/hardware/uploaddevicestep";
    locala.dIF = 1261;
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
    this.ooY = ((bvq)this.diG.dID.dIL);
    this.ooY.byN = paramString1;
    this.ooY.bKv = paramString2;
    this.ooY.ssb = paramInt1;
    this.ooY.ssc = paramInt2;
    this.ooY.blZ = paramInt3;
    paramString1 = this.ooY;
    paramString2 = TimeZone.getDefault();
    paramInt2 = paramString2.getRawOffset() / 1000;
    if ((paramString2.useDaylightTime()) && (paramString2.inDaylightTime(new Date(System.currentTimeMillis())))) {}
    for (paramInt1 = 1;; paramInt1 = 0)
    {
      paramString1.ssd = String.valueOf(paramInt1 + paramInt2 / 3600);
      this.ooY.ssf = paramString3;
      this.ooY.ssi = paramInt4;
      return;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.Sport.NetSceneUploadDeviceStep", "NetSceneUploadDeviceStep end: errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 1261;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/sport/c/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */