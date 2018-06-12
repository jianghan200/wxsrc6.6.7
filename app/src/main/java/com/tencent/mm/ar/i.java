package com.tencent.mm.ar;

import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.bi;

public final class i
  implements com.tencent.mm.ab.e
{
  public i()
  {
    g.Eh().dpP.a(159, this);
    g.Eh().dpP.a(160, this);
    k localk = new k(5);
    g.Eh().dpP.a(localk, 0);
  }
  
  private static void Qk()
  {
    g.Ei().DT().set(81939, Long.valueOf(bi.VF()));
  }
  
  private void release()
  {
    g.Eh().dpP.b(159, this);
    g.Eh().dpP.b(160, this);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if ((!(paraml instanceof com.tencent.mm.ab.n)) || (((com.tencent.mm.ab.n)paraml).Lf() != 5)) {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.LangPackageUpdater", "another scene");
    }
    int i;
    do
    {
      return;
      i = paraml.getType();
      if (i == 159)
      {
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          Qk();
          paramString = r.Qp().ik(5);
          if ((paramString == null) || (paramString.length == 0))
          {
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LangPackageUpdater", "error no pkg found.");
            release();
            return;
          }
          paramString = paramString[0];
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LangPackageUpdater", "dkregcode Pkg id:" + paramString.id + " version:" + paramString.version + " status:" + paramString.status + " type:" + paramString.bPh);
          if (5 != paramString.status)
          {
            release();
            return;
          }
          paramString = new j(paramString.id, 5);
          g.Eh().dpP.a(paramString, 0);
          return;
        }
        release();
        return;
      }
    } while (i != 160);
    if ((paramInt1 == 0) && (paramInt2 == 0)) {
      Qk();
    }
    release();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/ar/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */