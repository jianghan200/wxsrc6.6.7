package com.tencent.mm.plugin.webview.c;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.bjd;
import com.tencent.mm.protocal.c.bje;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class b
  extends l
  implements k
{
  private final com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e doG;
  private long ihD = 0L;
  private byte[] iiD = null;
  private String iiF;
  private int iis;
  int pNI = -1;
  boolean pNJ = true;
  
  public b(int paramInt1, String paramString, byte[] paramArrayOfByte, int paramInt2, long paramLong)
  {
    b.a locala = new b.a();
    locala.dIG = new bjd();
    locala.dIH = new bje();
    locala.uri = "/cgi-bin/micromsg-bin/mmsearchemotion";
    locala.dIF = 234;
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
    this.iis = paramInt1;
    this.iiF = paramString;
    this.iiD = paramArrayOfByte;
    this.pNI = paramInt2;
    this.ihD = paramLong;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.doG = parame1;
    bjd localbjd = (bjd)this.diG.dID.dIL;
    if (!bi.bC(this.iiD))
    {
      localbjd.rHj = ab.O(this.iiD);
      this.pNJ = false;
      localbjd.rHm = this.ihD;
      if (localbjd.rHj != null) {
        break label115;
      }
    }
    label115:
    for (parame1 = "Buf is NULL";; parame1 = localbjd.rHj.toString())
    {
      x.d("MicroMsg.emoji.NetSceneSearchEmotion", parame1);
      localbjd.rgA = this.iis;
      localbjd.rHk = this.iiF;
      return a(parame, this.diG, this);
      localbjd.rHj = new bhy();
      this.pNJ = true;
      break;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.emoji.NetSceneSearchEmotion", "netId %d | errType %d | errCode %d | errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.doG.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final bje bTD()
  {
    if (this.diG == null) {
      return null;
    }
    return (bje)this.diG.dIE.dIL;
  }
  
  public final int getType()
  {
    return 234;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/webview/c/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */