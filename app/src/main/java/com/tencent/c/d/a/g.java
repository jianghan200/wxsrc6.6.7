package com.tencent.c.d.a;

import com.tencent.c.d.b.d.a;
import com.tencent.c.f.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class g
  implements b
{
  private final Pattern tNW = Pattern.compile("^/system/xbin/ku\\.sud$|^daemonsu:|^k_worker/[1-9]\\d*:[1-9]\\d*$|^kr_worker/[1-9]\\d*:[1-9]\\d*$|^km_worker/[1-9]\\d*:[1-9]\\d*$|^tworker/[1-9]\\d*:[1-9]\\d*$|^tu_worker/[1-9]\\d*:[1-9]\\d*$|^tq_worker/[1-9]\\d*:[1-9]\\d*$|^kworker/[1-9]\\d{2}$|^permmgrd$|^360sguard$|^/data/data/[\\w\\-\\.]+/");
  private final List<d.a> vjo = new ArrayList();
  
  public final void a(d.a parama)
  {
    if (parama.uid != 0) {}
    while (parama.vjv != 1) {
      return;
    }
    this.vjo.add(parama);
  }
  
  public final boolean cFe()
  {
    Iterator localIterator = this.vjo.iterator();
    while (localIterator.hasNext())
    {
      d.a locala = (d.a)localIterator.next();
      h.d("SingleProcessAnalyzer : " + locala.toString());
      if ((locala.name != null) && (this.tNW.matcher(locala.name).find()))
      {
        h.i("SingleProcessAnalyzer match : " + locala.toString());
        return true;
      }
    }
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/c/d/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */