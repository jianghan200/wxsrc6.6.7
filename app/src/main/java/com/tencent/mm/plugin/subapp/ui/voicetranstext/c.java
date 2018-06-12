package com.tencent.mm.plugin.subapp.ui.voicetranstext;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.modelvoice.g;
import com.tencent.mm.network.k;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.bws;
import com.tencent.mm.protocal.c.bwt;
import com.tencent.mm.protocal.c.bwu;
import com.tencent.mm.protocal.c.byo;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import junit.framework.Assert;

public final class c
  extends l
  implements k
{
  private final String TAG = "MicroMsg.NetSceneUploadVoiceForTrans";
  private String bZR;
  private com.tencent.mm.ab.b dIy;
  private com.tencent.mm.ab.e lCQ;
  private String mFileName;
  private String otU;
  private byo otW;
  private int otY;
  private String otZ;
  public bws oue;
  
  public c(c paramc)
  {
    this.otU = paramc.otU;
    this.otW = paramc.otW;
    this.oue = paramc.oue;
    this.mFileName = paramc.mFileName;
    this.otY = paramc.otY;
    this.otZ = paramc.otZ;
    this.bZR = paramc.bZR;
    x.d("MicroMsg.NetSceneUploadVoiceForTrans", "alvinluo voiceTrans constructor scene: %d, fromUser: %s, toUser: %s", new Object[] { Integer.valueOf(paramc.otY), paramc.otZ, paramc.bZR });
    bGD();
  }
  
  public c(String paramString1, bws parambws, int paramInt, String paramString2)
  {
    if (paramString2 != null) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      this.otU = paramString1;
      this.oue = parambws;
      this.otW = d.aI(paramInt, paramString2);
      this.mFileName = paramString2;
      bGD();
      return;
    }
  }
  
  public c(String paramString1, bws parambws, int paramInt1, String paramString2, int paramInt2, String paramString3, String paramString4)
  {
    if (paramString2 != null) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      x.d("MicroMsg.NetSceneUploadVoiceForTrans", "alvinluo voiceTrans scene: %d, fromUser: %s, toUser: %s", new Object[] { Integer.valueOf(paramInt2), paramString3, paramString4 });
      this.otU = paramString1;
      this.oue = parambws;
      this.otW = d.aI(paramInt1, paramString2);
      this.mFileName = paramString2;
      this.otY = paramInt2;
      this.otZ = paramString3;
      this.bZR = paramString4;
      bGD();
      return;
    }
  }
  
  private void bGD()
  {
    b.a locala = new b.a();
    locala.dIG = new bwt();
    locala.dIH = new bwu();
    locala.uri = "/cgi-bin/micromsg-bin/uploadvoicefortrans";
    locala.dIF = 547;
    locala.dII = 0;
    locala.dIJ = 0;
    this.dIy = locala.KT();
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.lCQ = parame1;
    if ((!bi.oW(this.mFileName)) && (!bi.oW(this.otU)) && (this.oue != null) && (this.otW != null)) {}
    for (int i = 1; i == 0; i = 0)
    {
      x.e("MicroMsg.NetSceneUploadVoiceForTrans", "doScene: Value not Valid, so, do nothing.");
      return -1;
    }
    bwt localbwt = (bwt)this.dIy.dID.dIL;
    localbwt.rsZ = this.otU;
    localbwt.rta = this.otW;
    localbwt.rtc = this.oue;
    Object localObject = this.mFileName;
    i = this.oue.rdW;
    int j = this.oue.rdX;
    parame1 = new bhy();
    localObject = com.tencent.mm.modelvoice.q.ok((String)localObject);
    if (localObject != null) {
      parame1 = ab.O(((com.tencent.mm.modelvoice.b)localObject).br(i, j).buf);
    }
    localbwt.rtW = parame1;
    localbwt.otY = this.otY;
    localbwt.jTv = this.otZ;
    localbwt.jTu = this.bZR;
    return a(parame, this.dIy, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    bGE();
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      this.oue = ((bwu)this.dIy.dIE.dIL).rtc;
      this.lCQ.a(paramInt2, paramInt3, paramString, this);
      if (bGE()) {
        if (this.oue == null) {
          break label115;
        }
      }
    }
    label115:
    for (boolean bool = true;; bool = false)
    {
      x.i("MicroMsg.NetSceneUploadVoiceForTrans", "succeeed finish: %B", new Object[] { Boolean.valueOf(bool) });
      return;
      x.d("MicroMsg.NetSceneUploadVoiceForTrans", "error upload: errType:%d, errCode:%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
      break;
    }
  }
  
  public final boolean bGE()
  {
    return (this.oue == null) || (this.oue.rdX <= 0);
  }
  
  public final int getType()
  {
    return 547;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/subapp/ui/voicetranstext/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */