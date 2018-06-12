package com.tencent.mm.plugin.translate;

import android.os.Looper;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.o;
import com.tencent.mm.bt.h.d;
import com.tencent.mm.g.a.rt;
import com.tencent.mm.model.ar;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.translate.a.c.a;
import com.tencent.mm.plugin.translate.a.c.b;
import com.tencent.mm.plugin.translate.a.d;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.at;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Queue;

public final class a
  implements ar
{
  ag handler = new ag(Looper.getMainLooper());
  com.tencent.mm.plugin.translate.a.c oEg = c.b.oEu;
  at oEh = new at(5, "ProcessTranslatedMessage", 1, Looper.getMainLooper());
  private c.a oEi = new a.1(this);
  private com.tencent.mm.sdk.b.c oEj = new com.tencent.mm.sdk.b.c() {};
  private com.tencent.mm.sdk.b.c oEk = new a.3(this);
  
  public final HashMap<Integer, h.d> Ci()
  {
    return null;
  }
  
  public final void bn(boolean paramBoolean)
  {
    com.tencent.mm.plugin.translate.a.c localc = this.oEg;
    c.a locala = this.oEi;
    if ((locala == null) || (localc.dlt.contains(locala))) {}
    for (;;)
    {
      com.tencent.mm.sdk.b.a.sFg.b(this.oEj);
      com.tencent.mm.sdk.b.a.sFg.b(this.oEk);
      return;
      localc.dlt.add(locala);
    }
  }
  
  public final void bo(boolean paramBoolean) {}
  
  public final void gi(int paramInt) {}
  
  public final void onAccountRelease()
  {
    com.tencent.mm.sdk.b.a.sFg.c(this.oEj);
    com.tencent.mm.sdk.b.a.sFg.c(this.oEk);
    com.tencent.mm.plugin.translate.a.c localc = this.oEg;
    Object localObject = this.oEi;
    if ((localObject == null) || (!localc.dlt.contains(localObject))) {}
    for (;;)
    {
      localc = this.oEg;
      if (localc.oEr == null) {
        break;
      }
      localObject = localc.oEr;
      int j = localObject.length;
      int i = 0;
      while (i < j)
      {
        e locale = localObject[i];
        if (locale != null)
        {
          au.DF().b(631, locale);
          if (locale.oEB != null)
          {
            locale.oED.SO();
            au.DF().c(locale.oEB);
          }
          locale.bIS();
          locale.oEz = null;
        }
        i += 1;
      }
      localc.dlt.remove(localObject);
    }
    localc.oEt.clear();
    localc.oEs.clear();
    localc.dlt.clear();
    localc.htY = 0;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/translate/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */