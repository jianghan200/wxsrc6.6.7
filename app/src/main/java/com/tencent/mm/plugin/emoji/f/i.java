package com.tencent.mm.plugin.emoji.f;

import android.content.ContentValues;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.acs;
import com.tencent.mm.protocal.c.act;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.emotion.g;
import com.tencent.mm.storage.emotion.h;
import com.tencent.mm.storage.emotion.h.a;
import java.io.IOException;

public final class i
  extends com.tencent.mm.ab.l
  implements k
{
  private final b diG;
  private com.tencent.mm.ab.e doG;
  private String iiH;
  
  public i(String paramString)
  {
    b.a locala = new b.a();
    locala.dIG = new acs();
    locala.dIH = new act();
    locala.uri = "/cgi-bin/micromsg-bin/mmgetdesignersimpleinfo";
    locala.dIF = 239;
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
    this.iiH = paramString;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.doG = parame1;
    ((acs)this.diG.dID.dIL).rwl = this.iiH;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.emoji.NetSceneGetDesignerSimpleInfo", "onGYNetEnd ErrType:%d, errCode:%d, errMsg", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    Object localObject;
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = com.tencent.mm.plugin.emoji.model.i.aEA().igD;
      paramArrayOfByte = this.iiH;
      localObject = aEM();
      if ((!bi.oW(paramArrayOfByte)) && (localObject != null)) {
        break label93;
      }
      x.w("MicroMsg.emoji.EmotionDesignerInfo", "saveDesignerSimpleInfoResponseByID failed. designerID or response is null.");
    }
    for (;;)
    {
      this.doG.a(paramInt2, paramInt3, paramString, this);
      return;
      try
      {
        label93:
        g localg = new g();
        localg.field_designerIDAndType = (paramArrayOfByte + h.a.tcZ.value);
        localg.field_content = ((act)localObject).toByteArray();
        localObject = localg.wH();
        new StringBuilder().append(paramArrayOfByte).append(h.a.tcZ.value).toString();
        if (paramq.diF.replace("EmotionDesignerInfo", "designerIDAndType", (ContentValues)localObject) <= 0L) {
          break label237;
        }
        x.i("MicroMsg.emoji.EmotionDesignerInfo", "saveDesignerSimpleInfoResponseByID success. designerID:%s", new Object[] { paramArrayOfByte });
      }
      catch (IOException paramq)
      {
        x.e("MicroMsg.emoji.EmotionDesignerInfo", "saveDesignerSimpleInfoResponseByID exception:%s", new Object[] { bi.i(paramq) });
      }
      continue;
      label237:
      x.i("MicroMsg.emoji.EmotionDesignerInfo", "saveDesignerSimpleInfoResponseByID failed. designerID:%s", new Object[] { paramArrayOfByte });
    }
  }
  
  public final act aEM()
  {
    if (this.diG == null) {
      return null;
    }
    return (act)this.diG.dIE.dIL;
  }
  
  public final int getType()
  {
    return 239;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/emoji/f/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */