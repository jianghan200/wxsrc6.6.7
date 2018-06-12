package com.tencent.mm.plugin.sport.c;

import android.os.Build;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.cdm;
import com.tencent.mm.protocal.c.cdn;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.bn;

public final class e
  extends l
  implements k
{
  private b dZf;
  private com.tencent.mm.ab.e diJ;
  cdn ooX;
  
  public e()
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIF = 1947;
    ((b.a)localObject).uri = "/cgi-bin/mmoc-bin/hardware/getwxsportconfig";
    ((b.a)localObject).dIG = new cdm();
    ((b.a)localObject).dIH = new cdn();
    this.dZf = ((b.a)localObject).KT();
    localObject = (cdm)this.dZf.dID.dIL;
    ((cdm)localObject).hbP = com.tencent.mm.protocal.d.DEVICE_NAME;
    ((cdm)localObject).reT = bn.cmZ();
    ((cdm)localObject).rjM = Build.BRAND;
    ((cdm)localObject).rjL = Build.MODEL;
    ((cdm)localObject).syX = com.tencent.mm.protocal.d.qVJ;
    ((cdm)localObject).rjN = com.tencent.mm.protocal.d.qVK;
    ((cdm)localObject).rjO = com.tencent.mm.protocal.d.qVL;
    ((cdm)localObject).syY = com.tencent.mm.sdk.platformtools.d.CLIENT_VERSION;
    ((cdm)localObject).syZ = Build.MANUFACTURER;
    x.i("MicroMsg.Sport.NetSceneGetWeSportConfig", "request params=[%s, %s, %s, %s, %s, %s, %s, %s, %s]", new Object[] { ((cdm)localObject).reT, ((cdm)localObject).rjM, ((cdm)localObject).rjL, ((cdm)localObject).hbP, ((cdm)localObject).rjO, ((cdm)localObject).rjN, ((cdm)localObject).rjO, ((cdm)localObject).syY, ((cdm)localObject).syZ });
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.dZf, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.Sport.NetSceneGetWeSportConfig", "onGYNetEnd %d %d %d %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    this.ooX = ((cdn)this.dZf.dIE.dIL);
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 1947;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/sport/c/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */