package com.tencent.mm.plugin.backup.bakoldlogic.c;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.zt;
import com.tencent.mm.protocal.c.zu;
import com.tencent.mm.protocal.y;
import com.tencent.mm.sdk.platformtools.x;

public final class e
  extends l
  implements k
{
  private final com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  public byte[] hax;
  private final String id;
  
  public e(String paramString)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new zt();
    ((b.a)localObject).dIH = new zu();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getbakchatkey";
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    ((b.a)localObject).dIF = 596;
    this.diG = ((b.a)localObject).KT();
    localObject = (zt)this.diG.dID.dIL;
    ((zt)localObject).ID = paramString;
    ((zt)localObject).rFA = y.cgt().ver;
    this.id = paramString;
    x.i("MicroMsg.NetSceneGetBakchatkey", "init id:%s, ver:0x%x", new Object[] { ((zt)localObject).ID, Integer.valueOf(((zt)localObject).rFA) });
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneGetBakchatkey", "errType %d,  errCode %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      this.hax = ((zu)this.diG.dIE.dIL).reV.siK.lR;
      paramq = this.id;
      if (this.hax == null) {}
      for (paramInt1 = 0;; paramInt1 = this.hax.length)
      {
        x.i("MicroMsg.NetSceneGetBakchatkey", "id:%s,  key len:%d", new Object[] { paramq, Integer.valueOf(paramInt1) });
        if (this.hax == null) {
          break label191;
        }
        paramArrayOfByte = this.hax;
        paramq = "";
        paramInt1 = 0;
        while (paramInt1 < paramArrayOfByte.length)
        {
          paramq = paramq + Integer.toHexString(paramArrayOfByte[paramInt1] & 0xFF) + " ";
          paramInt1 += 1;
        }
      }
      x.i("MicroMsg.NetSceneGetBakchatkey", "dump bakchat: %s", new Object[] { paramq });
    }
    label191:
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final void cancel()
  {
    super.cancel();
  }
  
  public final int getType()
  {
    return 596;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/backup/bakoldlogic/c/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */