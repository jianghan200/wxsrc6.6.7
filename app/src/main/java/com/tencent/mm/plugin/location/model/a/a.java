package com.tencent.mm.plugin.location.model.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.uh;
import com.tencent.mm.protocal.c.ui;
import com.tencent.mm.sdk.platformtools.x;

public final class a
  extends l
  implements k
{
  public final b diG;
  private com.tencent.mm.ab.e diJ;
  private Runnable egq;
  
  public a(String paramString)
  {
    b.a locala = new b.a();
    locala.dIG = new uh();
    locala.dIH = new ui();
    locala.uri = "/cgi-bin/micromsg-bin/exittrackroom";
    locala.dIF = 491;
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
    ((uh)this.diG.dID.dIL).rxQ = paramString;
    x.d("MicroMsg.NetSceneExitTrackRoom", "trackRoomId:" + paramString);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneExitTrackRoom", "onGYNetEnd errType %d errCode%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.diJ != null) {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
    if (this.egq != null) {
      this.egq.run();
    }
  }
  
  public final int getType()
  {
    return 491;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/location/model/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */