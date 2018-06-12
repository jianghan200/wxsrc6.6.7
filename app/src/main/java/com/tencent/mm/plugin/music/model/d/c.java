package com.tencent.mm.plugin.music.model.d;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ahq;
import com.tencent.mm.protocal.c.ahr;
import com.tencent.mm.sdk.platformtools.x;

public final class c
  extends l
  implements k
{
  private b dZf;
  private com.tencent.mm.ab.e diJ;
  private ahq lzd;
  public String lze = "";
  public String playUrl = "";
  
  public c(String paramString)
  {
    b.a locala = new b.a();
    locala.dIF = 769;
    locala.uri = "/cgi-bin/micromsg-bin/getshakemusicurl";
    locala.dIG = new ahq();
    locala.dIH = new ahr();
    this.dZf = locala.KT();
    this.lzd = ((ahq)this.dZf.dID.dIL);
    this.lzd.rKR = paramString;
    this.playUrl = paramString;
    x.i("MicroMsg.Music.NetSceneGetShakeMusicUrl", "request music url:%s", new Object[] { paramString });
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.dZf, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.Music.NetSceneGetShakeMusicUrl", "netId %d | errType %d | errCode %d | errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    paramq = (ahr)this.dZf.dIE.dIL;
    this.diJ.a(paramInt2, paramInt3, paramString, this);
    if (paramq != null)
    {
      this.lze = paramq.rKR;
      x.i("MicroMsg.Music.NetSceneGetShakeMusicUrl", "tempPlayUrl:%s", new Object[] { this.lze });
      return;
    }
    x.e("MicroMsg.Music.NetSceneGetShakeMusicUrl", "response is null");
  }
  
  public final int getType()
  {
    return 769;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/music/model/d/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */