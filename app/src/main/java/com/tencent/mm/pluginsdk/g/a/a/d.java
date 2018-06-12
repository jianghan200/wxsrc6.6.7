package com.tencent.mm.pluginsdk.g.a.a;

import com.tencent.mm.a.g;
import com.tencent.mm.pluginsdk.g.a.b.e;
import com.tencent.mm.pluginsdk.g.a.c.l;
import com.tencent.mm.pluginsdk.g.a.c.m;
import com.tencent.mm.pluginsdk.g.a.c.n.a;
import com.tencent.mm.pluginsdk.g.a.d.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

final class d
  extends n.a<c>
{
  public d(c paramc)
  {
    super(paramc);
  }
  
  protected final m a(com.tencent.mm.pluginsdk.g.a.c.j paramj)
  {
    c localc = (c)ach();
    String str1 = i.Ti(localc.qBy);
    String str2 = localc.bKg;
    if ((localc.pON) && (bi.oV(g.cu(i.Ti(localc.qBy))).equals(str2)))
    {
      x.i("MicroMsg.ResDownloader.CheckResUpdate.NetworkRequestRunner", "file already cached and valid, send complete status");
      return new m(localc, a.Io(str1));
    }
    if ((!bi.bC(((c)ach()).qCe)) && (a.v(i.Ti(((c)ach()).qBy), ((c)ach()).qCe)) && (bi.oV(g.cu(i.Ti(((c)ach()).qBy))).equals(((c)ach()).bKg))) {
      return new m((l)ach(), a.Io(i.Ti(((c)ach()).qBy)));
    }
    paramj = super.a(paramj);
    x.i("MicroMsg.ResDownloader.CheckResUpdate.NetworkRequestRunner", "%s: network get over, received response = " + paramj, new Object[] { localc.qBy });
    if (paramj == null) {
      return new m("CheckResUpdate", cco(), getURL(), getFilePath(), 0L, "", new e());
    }
    if (paramj.status == 2)
    {
      if ((!bi.oW(((c)ach()).bKg)) && (((c)ach()).bKg.equals(g.cu(getFilePath())))) {
        x.i("MicroMsg.ResDownloader.CheckResUpdate.NetworkRequestRunner", "%s: file valid, md5 ok", new Object[] { localc.qBy });
      }
    }
    else {
      return paramj;
    }
    x.i("MicroMsg.ResDownloader.CheckResUpdate.NetworkRequestRunner", "%s: file invalid, md5 not match", new Object[] { localc.qBy });
    return new m("CheckResUpdate", cco(), getURL(), getFilePath(), paramj.cfA, paramj.aBC, new com.tencent.mm.pluginsdk.g.a.b.c());
  }
  
  public final String aca()
  {
    return "CheckResUpdate";
  }
  
  public final boolean acg()
  {
    if (super.acg())
    {
      j.n(((c)ach()).qBG, 12L);
      return true;
    }
    j.n(((c)ach()).qBG, 27L);
    return false;
  }
  
  public final boolean bM(long paramLong)
  {
    if ((((c)ach()).fileSize > 0L) && (((c)ach()).fileSize != a.Io(getFilePath()) + paramLong)) {
      return false;
    }
    return super.bM(paramLong);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/pluginsdk/g/a/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */