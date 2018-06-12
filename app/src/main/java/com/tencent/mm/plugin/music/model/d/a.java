package com.tencent.mm.plugin.music.model.d;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.oe;
import com.tencent.mm.protocal.c.of;
import com.tencent.mm.sdk.platformtools.x;

public final class a
  extends l
  implements k
{
  private b dZf;
  private com.tencent.mm.ab.e diJ;
  public oe lza;
  
  public a(int paramInt, com.tencent.mm.an.a parama)
  {
    b.a locala = new b.a();
    locala.dIF = 940;
    locala.uri = "/cgi-bin/micromsg-bin/checkmusic";
    locala.dIG = new oe();
    locala.dIH = new of();
    this.dZf = locala.KT();
    this.lza = ((oe)this.dZf.dID.dIL);
    this.lza.otY = paramInt;
    this.lza.jQb = parama.field_appId;
    this.lza.rsq = parama.field_songAlbumUrl;
    this.lza.rsr = parama.field_songHAlbumUrl;
    this.lza.rst = parama.field_songWifiUrl;
    this.lza.rsu = parama.field_songWapLinkUrl;
    this.lza.rss = parama.field_songWebUrl;
    this.lza.bHD = parama.field_songName;
    this.lza.rsp = parama.field_musicId;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.dZf, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.Music.NetSceneCheckMusic", "netId %d | errType %d | errCode %d | errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 940;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/music/model/d/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */