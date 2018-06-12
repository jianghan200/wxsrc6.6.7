package com.tencent.mm.plugin.game.model;

import android.os.Build.VERSION;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.game.a.c;
import com.tencent.mm.plugin.game.d.aw;
import com.tencent.mm.plugin.game.d.ax;
import com.tencent.mm.plugin.game.d.d;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.sdk.platformtools.x;

public final class au
  extends l
  implements k
{
  private com.tencent.mm.ab.e diJ;
  private final com.tencent.mm.ab.b ivx;
  
  public au()
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new aw();
    ((b.a)localObject).dIH = new ax();
    ((b.a)localObject).uri = "/cgi-bin/mmgame-bin/getgamecenterglobalsetting";
    ((b.a)localObject).dIF = 1311;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.ivx = ((b.a)localObject).KT();
    aw localaw = (aw)this.ivx.dID.dIL;
    localaw.jRj = w.chP();
    String str = f.dz(ad.getContext());
    localObject = str;
    if (bi.oW(str)) {
      localObject = bi.fS(ad.getContext());
    }
    localaw.eJQ = ((String)localObject);
    localaw.jRk = com.tencent.mm.sdk.platformtools.e.bxk;
    localaw.jRl = new d();
    localaw.jRl.jPa = Build.VERSION.SDK_INT;
    localaw.jRl.jPb = com.b.a.a.b.V(ad.getContext());
    x.i("MicroMsg.NetSceneGetGameGlobalConfig", "lang=%s, country=%s, releaseChannel=%s, osVersion = %d, deviceLevel = %d", new Object[] { localaw.jRj, localaw.eJQ, Integer.valueOf(localaw.jRk), Integer.valueOf(localaw.jRl.jPa), Integer.valueOf(localaw.jRl.jPb) });
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.ivx, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneGetGameGlobalConfig", "errType = " + paramInt2 + ", errCode = " + paramInt3 + ", errMsg = " + paramString);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    paramq = (ax)((com.tencent.mm.ab.b)paramq).dIE.dIL;
    if (paramq == null)
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    ((c)g.l(c.class)).aSk().a("pb_game_global_config", paramq);
    h.aTL().Zy();
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 1311;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/game/model/au.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */