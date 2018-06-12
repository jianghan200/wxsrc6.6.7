package com.tencent.mm.at;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.l.b;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.bvo;
import com.tencent.mm.protocal.c.bvp;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import java.io.File;

public final class b
  extends l
  implements k
{
  private String bSw;
  private String clientId;
  private int dHI;
  private int dHJ;
  private com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  public String edD;
  private String username;
  
  private b(String paramString)
  {
    this.username = paramString;
    this.dHI = 0;
    this.dHJ = 0;
    paramString = new StringBuilder();
    g.Eg();
    this.clientId = (com.tencent.mm.kernel.a.Df() + System.currentTimeMillis());
  }
  
  public b(String paramString1, String paramString2)
  {
    this(paramString1);
    this.bSw = paramString2;
  }
  
  protected final int Cc()
  {
    return 100;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    if ((this.bSw == null) || (this.bSw.length() == 0))
    {
      x.e("MicroMsg.NetSceneUploadCardImg", "imgPath is null or length = 0");
      return -1;
    }
    if (!com.tencent.mm.a.e.cn(this.bSw))
    {
      x.e("MicroMsg.NetSceneUploadCardImg", "The img does not exist, imgPath = " + this.bSw);
      return -1;
    }
    if (this.dHI == 0) {
      this.dHI = ((int)new File(this.bSw).length());
    }
    parame1 = new b.a();
    parame1.dIG = new bvo();
    parame1.dIH = new bvp();
    parame1.uri = "/cgi-bin/micromsg-bin/uploadcardimg";
    parame1.dIF = 575;
    parame1.dII = 0;
    parame1.dIJ = 0;
    this.diG = parame1.KT();
    int i = Math.min(this.dHI - this.dHJ, 32768);
    parame1 = com.tencent.mm.a.e.e(this.bSw, this.dHJ, i);
    if (parame1 == null)
    {
      x.e("MicroMsg.NetSceneUploadCardImg", "readFromFile error");
      return -1;
    }
    x.i("MicroMsg.NetSceneUploadCardImg", "doScene uploadLen:%d, total: %d", new Object[] { Integer.valueOf(parame1.length), Integer.valueOf(this.dHI) });
    bvo localbvo = (bvo)this.diG.dID.dIL;
    localbvo.rvx = this.username;
    localbvo.rdV = this.dHI;
    localbvo.rdW = this.dHJ;
    localbvo.rtW = new bhy().bq(parame1);
    localbvo.rdX = localbvo.rtW.siI;
    localbvo.rcc = this.clientId;
    return a(parame, this.diG, this);
  }
  
  protected final int a(q paramq)
  {
    if ((this.bSw == null) || (this.bSw.length() == 0)) {
      return l.b.dJn;
    }
    return l.b.dJm;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneUploadCardImg", "onGYNetEnd:%s, %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      x.e("MicroMsg.NetSceneUploadCardImg", "upload card img error");
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    paramq = (bvp)((com.tencent.mm.ab.b)paramq).dIE.dIL;
    this.edD = paramq.rXt;
    this.dHJ = paramq.rdW;
    if (this.dHJ < this.dHI)
    {
      if (a(this.dIX, this.diJ) < 0)
      {
        x.e("MicroMsg.NetSceneUploadCardImg", "doScene again failed");
        this.diJ.a(3, -1, "", this);
      }
      x.d("MicroMsg.NetSceneUploadCardImg", "doScene again");
      return;
    }
    if (!bi.oW(this.edD))
    {
      paramq = ((i)g.l(i.class)).FR().Yg(this.username);
      if ((paramq != null) && ((int)paramq.dhP > 0) && (com.tencent.mm.l.a.gd(paramq.field_type)))
      {
        paramq.dU(this.edD);
        ((i)g.l(i.class)).FR().a(this.username, paramq);
      }
    }
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 575;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/at/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */