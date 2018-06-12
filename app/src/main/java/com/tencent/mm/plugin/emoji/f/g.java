package com.tencent.mm.plugin.emoji.f;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.model.au;
import com.tencent.mm.modelcdntran.d;
import com.tencent.mm.modelcdntran.i.a;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.tk;
import com.tencent.mm.protocal.c.ud;
import com.tencent.mm.protocal.c.ue;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import java.io.File;

public final class g
  extends l
  implements com.tencent.mm.network.k
{
  boolean dJO;
  public String dVk = "";
  private final com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e doG;
  private int fdx;
  EmojiGroupInfo iiA;
  public String iiv;
  public String iiw;
  public String iix;
  private int iiy;
  private i.a iiz = new g.1(this);
  
  public g(String paramString)
  {
    this(paramString, null, "", 1, 0);
  }
  
  public g(String paramString, byte paramByte)
  {
    this(paramString, null, "", 1, 1);
  }
  
  public g(String paramString1, String paramString2)
  {
    this(paramString1, null, paramString2, 0, 0);
  }
  
  public g(String paramString1, String paramString2, String paramString3)
  {
    this(paramString1, paramString2, paramString3, 0, 0);
  }
  
  private g(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2)
  {
    this.iiv = paramString1;
    this.iiw = paramString3;
    this.iix = paramString2;
    this.iiA = null;
    this.iiy = paramInt1;
    this.fdx = paramInt2;
    paramString1 = new b.a();
    paramString1.dIG = new ud();
    paramString1.dIH = new ue();
    paramString1.uri = "/cgi-bin/micromsg-bin/exchangeemotionpack";
    paramString1.dIF = 423;
    paramString1.dII = 213;
    paramString1.dIJ = 1000000213;
    this.diG = paramString1.KT();
  }
  
  static void g(String paramString1, int paramInt1, int paramInt2, String paramString2)
  {
    com.tencent.mm.plugin.emoji.model.i.aEC().g(paramString1, paramInt1, paramInt2, paramString2);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    x.d("MicroMsg.emoji.NetSceneExchangeEmotionPack", "doScene");
    this.doG = parame1;
    if (this.fdx == 0) {
      g(this.iiv, 6, 0, this.dVk);
    }
    parame1 = (ud)this.diG.dID.dIL;
    parame1.rem = this.iiv;
    parame1.rxN = this.iix;
    parame1.rxO = this.iiy;
    parame1.otY = this.fdx;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.emoji.NetSceneExchangeEmotionPack", "onGYNetEnd ErrType:%d, errCode:%d, errMsg", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.doG.a(paramInt2, paramInt3, paramString, this);
      g(this.iiv, -1, 0, this.dVk);
      return;
    }
    if (this.fdx == 0)
    {
      paramq = new File(com.tencent.mm.compatible.util.e.dgj);
      if (!paramq.exists()) {
        paramq.mkdirs();
      }
      long l = System.currentTimeMillis();
      paramq = new StringBuilder();
      au.HU();
      this.dVk = d.a("downzip", l, com.tencent.mm.model.c.Df(), "emoji");
      paramq = ((ue)this.diG.dIE.dIL).rxP;
      paramArrayOfByte = new com.tencent.mm.modelcdntran.i();
      paramArrayOfByte.field_mediaId = this.dVk;
      paramArrayOfByte.field_fullpath = (com.tencent.mm.compatible.util.e.dgj + this.iiv);
      paramArrayOfByte.field_fileType = com.tencent.mm.modelcdntran.b.MediaType_FILE;
      paramArrayOfByte.field_totalLen = paramq.ruE;
      paramArrayOfByte.field_aesKey = paramq.rwn;
      paramArrayOfByte.field_fileId = paramq.jPK;
      paramArrayOfByte.field_priority = com.tencent.mm.modelcdntran.b.dOk;
      paramArrayOfByte.dPV = this.iiz;
      paramArrayOfByte.field_needStorage = true;
      this.dJO = false;
      if (!com.tencent.mm.modelcdntran.g.ND().b(paramArrayOfByte, -1)) {
        x.e("MicroMsg.emoji.NetSceneExchangeEmotionPack", "add task failed:");
      }
    }
    for (;;)
    {
      this.doG.a(paramInt2, paramInt3, paramString, this);
      paramString = new k(this.iiv);
      au.DF().a(paramString, 0);
      return;
      x.i("MicroMsg.emoji.NetSceneExchangeEmotionPack", "add custom emoji.need no download pack");
    }
  }
  
  protected final void cancel()
  {
    super.cancel();
    this.dJO = true;
  }
  
  public final int getType()
  {
    return 423;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/emoji/f/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */