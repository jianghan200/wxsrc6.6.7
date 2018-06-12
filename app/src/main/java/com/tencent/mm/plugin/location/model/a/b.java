package com.tencent.mm.plugin.location.model.a;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.apj;
import com.tencent.mm.protocal.c.apk;
import com.tencent.mm.sdk.platformtools.x;

public final class b
  extends l
  implements k
{
  public String Yy;
  public final com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  private Runnable egq;
  public int errCode;
  public int errType;
  public String fFG;
  public String kCu = "";
  
  public b(String paramString)
  {
    b.a locala = new b.a();
    locala.dIG = new apj();
    locala.dIH = new apk();
    locala.uri = "/cgi-bin/micromsg-bin/jointrackroom";
    locala.dIF = 490;
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
    ((apj)this.diG.dID.dIL).rSl = paramString;
    x.d("MicroMsg.NetSceneJoinTrackRoom", "chatNameId:" + paramString);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    this.errType = paramInt2;
    this.errCode = paramInt3;
    this.Yy = paramString;
    if (((com.tencent.mm.ab.b)paramq).dIE.dIL != null) {}
    for (paramq = (apk)((com.tencent.mm.ab.b)paramq).dIE.dIL;; paramq = null)
    {
      x.d("MicroMsg.NetSceneJoinTrackRoom", "onGYNetEnd errType %d errCode%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
      if (((paramInt3 == 0) || (paramInt3 >= 1000)) && (paramq != null))
      {
        this.kCu = paramq.rxQ;
        x.d("MicroMsg.NetSceneJoinTrackRoom", "get trackRoomid %s", new Object[] { this.kCu });
      }
      if (paramq != null) {
        this.fFG = paramq.rmO;
      }
      if (this.diJ != null) {
        this.diJ.a(paramInt2, paramInt3, paramString, this);
      }
      if (this.egq != null) {
        this.egq.run();
      }
      return;
    }
  }
  
  public final int getType()
  {
    return 490;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/location/model/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */