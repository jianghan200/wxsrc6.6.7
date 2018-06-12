package com.tencent.mm.plugin.emoji.f;

import android.content.ContentValues;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.plugin.emoji.model.i;
import com.tencent.mm.protocal.c.acq;
import com.tencent.mm.protocal.c.acr;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.emotion.g;
import com.tencent.mm.storage.emotion.h.a;
import java.io.IOException;

public final class h
  extends com.tencent.mm.ab.l
  implements k
{
  private final b diG;
  private com.tencent.mm.ab.e doG;
  public int eKI;
  private int iiC;
  public byte[] iiD;
  private int iiE;
  private String iiF;
  private int iiG;
  
  public h(int paramInt1, int paramInt2, int paramInt3, String paramString, int paramInt4, byte[] paramArrayOfByte)
  {
    b.a locala = new b.a();
    locala.dIG = new acq();
    locala.dIH = new acr();
    locala.uri = "/cgi-bin/micromsg-bin/mmgetdesigneremojilist";
    locala.dIF = 821;
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
    this.eKI = paramInt1;
    this.iiC = paramInt2;
    this.iiE = paramInt3;
    this.iiF = paramString;
    this.iiD = paramArrayOfByte;
    this.iiG = paramInt4;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.doG = parame1;
    acq localacq = (acq)this.diG.dID.dIL;
    if (this.iiD != null)
    {
      localacq.rHj = ab.O(this.iiD);
      if (localacq.rHj != null) {
        break label118;
      }
    }
    label118:
    for (parame1 = "Buf is NULL";; parame1 = localacq.rHj.toString())
    {
      x.d("MicroMsg.emoji.NetSceneGetDesignerEmojiList", parame1);
      localacq.rHi = this.iiC;
      localacq.qZc = this.eKI;
      localacq.rwr = this.iiE;
      localacq.rHk = this.iiF;
      localacq.rHl = this.iiG;
      return a(parame, this.diG, this);
      localacq.rHj = new bhy();
      break;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.emoji.NetSceneGetDesignerEmojiList", "onGYNetEnd ErrType:%d, errCode:%d, errMsg", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    String str;
    Object localObject;
    if (((paramInt2 == 0) && (paramInt3 == 0)) || ((paramInt2 == 4) && ((paramInt3 == 2) || (paramInt3 == 3)) && ((this.iiD == null) || (this.iiD.length <= 0)) && (this.eKI != 3)))
    {
      paramArrayOfByte = i.aEA().igD;
      str = this.iiC;
      localObject = aEL();
      if ((!bi.oW(str)) && (localObject != null)) {
        break label180;
      }
      x.w("MicroMsg.emoji.EmotionDesignerInfo", "saveDesignerEmojiListResponseByUIN failed. designerID or response is null.");
    }
    for (;;)
    {
      paramq = (acr)((b)paramq).dIE.dIL;
      if (paramq.rHj != null) {
        this.iiD = ab.a(paramq.rHj);
      }
      this.doG.a(paramInt2, paramInt3, paramString, this);
      return;
      try
      {
        label180:
        g localg = new g();
        localg.field_designerIDAndType = (str + h.a.tdb.value);
        localg.field_content = ((acr)localObject).toByteArray();
        localObject = localg.wH();
        new StringBuilder().append(str).append(h.a.tdb.value).toString();
        if (paramArrayOfByte.diF.replace("EmotionDesignerInfo", "designerIDAndType", (ContentValues)localObject) <= 0L) {
          break label324;
        }
        x.i("MicroMsg.emoji.EmotionDesignerInfo", "savePersonalDesignerResponseByUIN success. designerID:%s", new Object[] { str });
      }
      catch (IOException paramArrayOfByte)
      {
        x.e("MicroMsg.emoji.EmotionDesignerInfo", "saveDesignerSimpleInfoResponseByID exception:%s", new Object[] { bi.i(paramArrayOfByte) });
      }
      continue;
      label324:
      x.i("MicroMsg.emoji.EmotionDesignerInfo", "savePersonalDesignerResponseByUIN failed. designerID:%s", new Object[] { str });
    }
  }
  
  public final acr aEL()
  {
    if (this.diG == null) {
      return null;
    }
    return (acr)this.diG.dIE.dIL;
  }
  
  public final int getType()
  {
    return 821;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/emoji/f/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */