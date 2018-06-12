package com.tencent.mm.plugin.card.model;

import android.text.TextUtils;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.card.d.t;
import com.tencent.mm.protocal.c.la;
import com.tencent.mm.protocal.c.lb;
import com.tencent.mm.protocal.c.lc;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;

public final class v
  extends l
  implements k
{
  private final b diG;
  private com.tencent.mm.ab.e diJ;
  public String hxc;
  public ArrayList<la> hxd;
  
  public v(String paramString1, float paramFloat1, float paramFloat2, String paramString2)
  {
    this.hxc = paramString1;
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new lb();
    ((b.a)localObject).dIH = new lc();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/cardshoplbs";
    ((b.a)localObject).dIF = 563;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (lb)this.diG.dID.dIL;
    ((lb)localObject).huU = paramString1;
    ((lb)localObject).bUg = paramFloat1;
    ((lb)localObject).bSx = paramFloat2;
    ((lb)localObject).cac = paramString2;
    x.d("MicroMsg.NetSceneCardShopLBS", "<init>, cardId = %s, longtitude = %f, latitude = %f, card_id = %s", new Object[] { paramString1, Float.valueOf(paramFloat1), Float.valueOf(paramFloat2), paramString2 });
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    if (bi.oW(((lb)this.diG.dID.dIL).huU))
    {
      x.e("MicroMsg.NetSceneCardShopLBS", "doScene fail, cardId is null");
      return -1;
    }
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneCardShopLBS", "onGYNetEnd, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = ((lc)this.diG.dIE.dIL).hwU;
      if (TextUtils.isEmpty(paramq)) {
        x.e("MicroMsg.NetSceneCardShopLBS", "onGYNetEnd fail, json_ret is empty");
      }
      this.hxd = t.yi(paramq);
      if (this.hxd != null) {
        x.d("MicroMsg.NetSceneCardShopLBS", "onGYNetEnd, respList size = %d", new Object[] { Integer.valueOf(this.hxd.size()) });
      }
    }
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 563;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/card/model/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */