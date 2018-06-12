package com.tencent.mm.plugin.music.model.d;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.an.a;
import com.tencent.mm.an.c;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.protocal.c.agw;
import com.tencent.mm.protocal.c.agx;
import com.tencent.mm.sdk.platformtools.x;

public final class b
  extends l
  implements k
{
  public a bTF;
  private com.tencent.mm.ab.b dZf;
  private com.tencent.mm.ab.e diJ;
  public agx lzb;
  public boolean lzc;
  
  public b(a parama, boolean paramBoolean)
  {
    this.bTF = parama;
    this.lzc = paramBoolean;
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new agw();
    ((b.a)localObject).dIH = new agx();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getqqmusiclyric";
    ((b.a)localObject).dIF = 520;
    this.dZf = ((b.a)localObject).KT();
    localObject = (agw)this.dZf.dID.dIL;
    ((agw)localObject).rKe = parama.field_songId;
    if (parama.field_songWebUrl != null) {
      ((agw)localObject).rKf = ab.O(parama.field_songWebUrl.getBytes());
    }
    if (c.Qh())
    {
      i = 0;
      ((agw)localObject).rKg = i;
      if (!c.Qg()) {
        break label201;
      }
    }
    label201:
    for (int i = 1;; i = 0)
    {
      ((agw)localObject).rKh = i;
      x.i("MicroMsg.Music.NetSceneGetQQMusicLyric", "songId=%d, url=%s IsOutsideGFW=%d ShakeMusicGlobalSwitch=%d", new Object[] { Integer.valueOf(parama.field_songId), parama.field_songWebUrl, Integer.valueOf(((agw)localObject).rKg), Integer.valueOf(((agw)localObject).rKh) });
      return;
      i = 1;
      break;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.dZf, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.Music.NetSceneGetQQMusicLyric", "netId %d | errType %d | errCode %d | errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    this.lzb = ((agx)this.dZf.dIE.dIL);
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 520;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/music/model/d/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */