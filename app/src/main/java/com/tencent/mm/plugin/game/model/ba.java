package com.tencent.mm.plugin.game.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.als;
import com.tencent.mm.protocal.c.alt;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.sdk.platformtools.x;

public final class ba
  extends l
  implements k
{
  private String appId;
  private com.tencent.mm.ab.e diJ;
  final b ivx;
  
  public ba(String paramString)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new als();
    ((b.a)localObject).dIH = new alt();
    ((b.a)localObject).uri = "/cgi-bin/mmgame-bin/gethvgamemenu";
    ((b.a)localObject).dIF = 1369;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.appId = paramString;
    this.ivx = ((b.a)localObject).KT();
    localObject = (als)this.ivx.dID.dIL;
    ((als)localObject).jRj = w.chP();
    ((als)localObject).eJQ = bi.fS(ad.getContext());
    ((als)localObject).jQb = paramString;
    x.i("MicroMsg.NetSceneHVGameGetMenu", "lang=%s, country=%s, appid=%s", new Object[] { ((als)localObject).jRj, ((als)localObject).eJQ, ((als)localObject).jQb });
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.ivx, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneHVGameGetMenu", "errType = " + paramInt2 + ", errCode = " + paramInt3 + ", errMsg = " + paramString);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    if ((alt)((b)paramq).dIE.dIL == null)
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 1369;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/game/model/ba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */