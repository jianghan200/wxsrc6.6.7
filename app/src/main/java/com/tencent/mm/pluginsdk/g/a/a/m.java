package com.tencent.mm.pluginsdk.g.a.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bho;
import com.tencent.mm.protocal.c.oi;
import com.tencent.mm.protocal.c.oj;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;
import java.util.List;

public final class m
  extends n
{
  public m() {}
  
  public m(int paramInt)
  {
    x.i("MicroMsg.ResDownloader.CheckResUpdate.NetSceneCheckResUpdate", "NetSceneCheckResUpdate init, resType:%d", new Object[] { Integer.valueOf(paramInt) });
    bho localbho = new bho();
    localbho.hcE = paramInt;
    this.qCJ.clear();
    this.qCJ.add(localbho);
  }
  
  protected final q ccA()
  {
    b.a locala = new b.a();
    oi localoi = new oi();
    localoi.rsF.addAll(this.qCJ);
    locala.dIG = localoi;
    locala.dIH = new oj();
    locala.uri = "/cgi-bin/micromsg-bin/checkresupdate";
    locala.dIF = 721;
    locala.dII = 0;
    locala.dIJ = 0;
    return locala.KT();
  }
  
  protected final String getTag()
  {
    return "MicroMsg.ResDownloader.CheckResUpdate.NetSceneCheckResUpdate";
  }
  
  public final int getType()
  {
    return 721;
  }
  
  protected final oj i(q paramq)
  {
    return (oj)((b)paramq).dIE.dIL;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/pluginsdk/g/a/a/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */