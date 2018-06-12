package com.tencent.mm.plugin.qqmail.b;

import com.tencent.mm.a.g;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.f;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.l.a;
import com.tencent.mm.ab.l.b;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.protocal.c.pt;
import com.tencent.mm.protocal.c.pu;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Random;

public final class m
  extends l
  implements k
{
  private String bSS;
  private String clientId = null;
  private int dHI = 0;
  private int dHJ = 0;
  private f dVg;
  private b diG;
  private com.tencent.mm.ab.e diJ;
  private String mcV = null;
  private String mcW;
  private int mcX = 0;
  
  public m(String paramString1, String paramString2, String[] paramArrayOfString, int paramInt, f paramf)
  {
    this.mcV = paramString1;
    this.mcX = paramInt;
    this.dVg = paramf;
    if (!bi.oW(paramString1))
    {
      this.clientId = (g.u(paramString1.getBytes()) + "_" + System.nanoTime() + "_" + new Random().nextInt());
      this.dHI = paramString1.getBytes().length;
      this.dHJ = 0;
    }
    if (!bi.oW(paramString2)) {
      this.bSS = paramString2;
    }
    if (paramArrayOfString != null)
    {
      this.mcW = "";
      int i = paramArrayOfString.length;
      paramInt = 0;
      while (paramInt < i)
      {
        paramString1 = paramArrayOfString[paramInt];
        this.mcW = (this.mcW + paramString1 + ",");
        paramInt += 1;
      }
      this.mcW = this.mcW.substring(0, this.mcW.length() - 1);
    }
    x.i("MicroMsg.NetSceneComposeSend", "NetSceneComposeSend, clientId: %s, totalLen: %d", new Object[] { this.clientId, Integer.valueOf(this.dHI) });
  }
  
  protected final int Cc()
  {
    return 100;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    if (bi.oW(this.mcV))
    {
      x.e("MicroMsg.NetSceneComposeSend", "doScene, sendContent is null");
      return -1;
    }
    int k = Math.min(this.dHI - this.dHJ, 32768);
    x.i("MicroMsg.NetSceneComposeSend", "doScene, dataLen: %d", new Object[] { Integer.valueOf(k) });
    parame1 = new byte[k];
    Object localObject = this.mcV.getBytes();
    int i = this.dHJ;
    int j = 0;
    while (i < this.dHJ + k)
    {
      parame1[j] = localObject[i];
      j += 1;
      i += 1;
    }
    if (bi.bC(parame1))
    {
      x.e("MicroMsg.NetSceneComposeSend", "doScene, sendData is null");
      return -1;
    }
    localObject = new b.a();
    ((b.a)localObject).dIG = new pt();
    ((b.a)localObject).dIH = new pu();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/composesend";
    ((b.a)localObject).dIF = 485;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (pt)this.diG.dID.dIL;
    ((pt)localObject).rcc = this.clientId;
    ((pt)localObject).rdV = this.dHI;
    ((pt)localObject).rdW = this.dHJ;
    ((pt)localObject).rdX = k;
    ((pt)localObject).rtX = this.bSS;
    ((pt)localObject).rtY = this.mcW;
    ((pt)localObject).rtZ = ((int)(this.dHI + this.mcX * 1.3333334F));
    x.i("MicroMsg.NetSceneComposeSend", "doScene, realSize: %d", new Object[] { Integer.valueOf(((pt)localObject).rtZ) });
    ((pt)localObject).rtW = ab.O(parame1);
    i = a(parame, this.diG, this);
    x.i("MicroMsg.NetSceneComposeSend", "doScene, ret: %d", new Object[] { Integer.valueOf(i) });
    return i;
  }
  
  protected final int a(q paramq)
  {
    if (bi.oW(this.mcV))
    {
      x.e("MicroMsg.NetSceneComposeSend", "securityVerificationChecked failed, content is null");
      return l.b.dJn;
    }
    return l.b.dJm;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneComposeSend", "onGYNetEnd, netId: %d, errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 != 0) || (paramInt3 != 0)) {
      if (this.diJ != null) {
        this.diJ.a(paramInt2, paramInt3, paramString, this);
      }
    }
    do
    {
      return;
      this.dHJ = ((pu)((b)paramq).dIE.dIL).rdW;
      if (this.diJ != null) {
        this.diJ.a(paramInt2, paramInt3, paramString, this);
      }
      if (this.dVg != null) {
        this.dVg.a(this.dHJ, this.dHI, this);
      }
      if (this.dHJ >= this.dHI) {
        break;
      }
      x.i("MicroMsg.NetSceneComposeSend", "onGYNetEnd, startPos: %d, totalLen: %d, continue to upload", new Object[] { Integer.valueOf(this.dHJ), Integer.valueOf(this.dHI) });
    } while (a(this.dIX, this.diJ) >= 0);
    x.e("MicroMsg.NetSceneComposeSend", "continue to upload fail");
    return;
    x.i("MicroMsg.NetSceneComposeSend", "finished upload");
  }
  
  protected final void a(l.a parama) {}
  
  public final int getType()
  {
    return 485;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/qqmail/b/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */