package com.tencent.mm.plugin.emoji.f;

import android.content.ContentValues;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.emoji.e.j;
import com.tencent.mm.plugin.emoji.model.i;
import com.tencent.mm.protocal.c.adi;
import com.tencent.mm.protocal.c.adj;
import com.tencent.mm.protocal.c.tr;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.emotion.n;
import java.io.IOException;

public final class o
  extends com.tencent.mm.ab.l
  implements com.tencent.mm.network.k
{
  public static int iiS = 0;
  public static int iiT = 1;
  public static int iiU = 1;
  public static int iiV = 2;
  public static int iiW = 256;
  private final b diG;
  private com.tencent.mm.ab.e diJ;
  private int iiX;
  private String iil;
  
  public o(String paramString, int paramInt)
  {
    b.a locala = new b.a();
    locala.dIG = new adi();
    locala.dIH = new adj();
    locala.uri = "/cgi-bin/micromsg-bin/mmgetemotionreward";
    locala.dIF = 822;
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
    this.iil = paramString;
    this.iiX = paramInt;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    parame1 = (adi)this.diG.dID.dIL;
    parame1.rem = this.iil;
    parame1.qZc = this.iiX;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.emoji.NetSceneGetEmotionReward", "errType:%d, errCode:%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    Object localObject;
    if ((paramInt2 == 0) && (paramInt3 == 0)) {
      if (this.iiX == iiS)
      {
        paramq = i.aEA().igC;
        paramArrayOfByte = this.iil;
        localObject = aES();
        if ((bi.oW(paramArrayOfByte)) || (localObject == null)) {
          x.w("MicroMsg.emoji.EmotionRewardInfoStorage", "saveEmotionRewardResponseWithPID failed. productId or response is null.");
        }
      }
      else
      {
        if ((aES() == null) || (aES().rHP == null)) {
          break label275;
        }
        i.aEA().igE.dg(this.iil, aES().rHP.rbZ);
        i.aEB().bh(this.iil, aES().rHP.rbZ);
      }
    }
    for (;;)
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
      try
      {
        com.tencent.mm.storage.emotion.k localk = new com.tencent.mm.storage.emotion.k();
        localk.field_productID = paramArrayOfByte;
        localk.field_content = ((adj)localObject).toByteArray();
        localObject = localk.wH();
        if (paramq.diF.replace("EmotionRewardInfo", "productID", (ContentValues)localObject) <= 0L) {
          break label256;
        }
        x.i("MicroMsg.emoji.EmotionRewardInfoStorage", "saveEmotionRewardResponseWithPID success. ProductId:%s", new Object[] { paramArrayOfByte });
      }
      catch (IOException paramq)
      {
        x.e("MicroMsg.emoji.EmotionRewardInfoStorage", "saveEmotionRewardResponseWithPID exception:%s", new Object[] { bi.i(paramq) });
      }
      break;
      label256:
      x.i("MicroMsg.emoji.EmotionRewardInfoStorage", "saveEmotionRewardResponseWithPID failed. ProductId:%s", new Object[] { paramArrayOfByte });
      break;
      label275:
      x.i("MicroMsg.emoji.NetSceneGetEmotionReward", "getEmotionRewardRespone is null. so i think no such product reward information");
      i.aEA().igE.dg(this.iil, iiW);
      i.aEB().bh(this.iil, iiW);
      continue;
      if (paramInt3 == 1)
      {
        i.aEA().igE.dg(this.iil, iiW);
        i.aEB().bh(this.iil, iiW);
      }
    }
  }
  
  public final adj aES()
  {
    return (adj)this.diG.dIE.dIL;
  }
  
  public final int getType()
  {
    return 822;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/emoji/f/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */