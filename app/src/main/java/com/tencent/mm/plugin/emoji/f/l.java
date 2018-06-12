package com.tencent.mm.plugin.emoji.f;

import android.content.ContentValues;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.adc;
import com.tencent.mm.protocal.c.add;
import com.tencent.mm.protocal.c.to;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.emotion.j;

public final class l
  extends com.tencent.mm.ab.l
  implements k
{
  private int aIs;
  private final b diG;
  private com.tencent.mm.ab.e diJ;
  private int fdx;
  public String iiv;
  
  public l(String paramString, int paramInt)
  {
    this(paramString, paramInt, -1);
  }
  
  public l(String paramString, int paramInt1, int paramInt2)
  {
    this.iiv = paramString;
    this.fdx = paramInt1;
    this.aIs = paramInt2;
    paramString = new b.a();
    paramString.dIG = new adc();
    paramString.dIH = new add();
    paramString.uri = "/cgi-bin/micromsg-bin/getemotiondetail";
    paramString.dIF = 412;
    paramString.dII = 211;
    paramString.dIJ = 1000000211;
    this.diG = paramString.KT();
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    x.i("MicroMsg.emoji.NetSceneGetEmotionDetail", "ProductID:%s, Scene:%d, Version:%d", new Object[] { this.iiv, Integer.valueOf(this.fdx), Integer.valueOf(this.aIs) });
    this.diJ = parame1;
    parame1 = (adc)this.diG.dID.dIL;
    parame1.rem = this.iiv;
    parame1.otY = this.fdx;
    parame1.hcD = this.aIs;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.emoji.NetSceneGetEmotionDetail", "ErrType:" + paramInt2 + "   errCode:" + paramInt3);
    if ((paramInt2 != 0) && (paramInt3 != 0) && (paramInt3 != 5))
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    Object localObject;
    String str;
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = com.tencent.mm.plugin.emoji.model.i.aEA().igB;
      paramArrayOfByte = this.iiv;
      localObject = (add)this.diG.dIE.dIL;
      str = w.fD(ad.getContext());
      if ((bi.oW(paramArrayOfByte)) || (localObject == null)) {
        x.w("MicroMsg.emoji.EmotionDetailInfoStorage", "saveEmotionRewardResponseWithPID failed. productId or response is null.");
      }
    }
    try
    {
      com.tencent.mm.storage.emotion.i locali = new com.tencent.mm.storage.emotion.i();
      locali.field_productID = paramArrayOfByte;
      locali.field_content = ((add)localObject).toByteArray();
      locali.field_lan = str;
      localObject = locali.wH();
      if (paramq.diF.replace("EmotionDetailInfo", "productID", (ContentValues)localObject) > 0L) {
        x.i("MicroMsg.emoji.EmotionDetailInfoStorage", "saveEmotionDetailResponseWithPID success. ProductId:%s", new Object[] { paramArrayOfByte });
      }
      for (;;)
      {
        this.diJ.a(paramInt2, paramInt3, paramString, this);
        return;
        x.i("MicroMsg.emoji.EmotionDetailInfoStorage", "saveEmotionDetailResponseWithPID failed. ProductId:%s", new Object[] { paramArrayOfByte });
      }
    }
    catch (Exception paramq)
    {
      for (;;)
      {
        x.e("MicroMsg.emoji.EmotionDetailInfoStorage", "saveEmotionRewardResponseWithPID exception:%s", new Object[] { bi.i(paramq) });
      }
    }
  }
  
  public final to aEO()
  {
    new to();
    return ((add)this.diG.dIE.dIL).rHx;
  }
  
  public final int getType()
  {
    return 412;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/emoji/f/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */