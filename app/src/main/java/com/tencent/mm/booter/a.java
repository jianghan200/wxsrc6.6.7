package com.tencent.mm.booter;

import com.tencent.mm.model.ae;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ar;
import com.tencent.mm.sdk.platformtools.ar.a;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class a
  implements com.tencent.mm.model.ad
{
  private static volatile a cWx;
  private ar cWv = new ar();
  private ar.a cWw = new a.1(this);
  private List<ae> cWy = new ArrayList();
  private c cWz;
  
  private a()
  {
    this.cWv.a(this.cWw);
    this.cWv.fN(com.tencent.mm.sdk.platformtools.ad.getContext());
    if (this.cWz == null) {
      this.cWz = new a.2(this);
    }
    com.tencent.mm.sdk.b.a.sFg.b(this.cWz);
  }
  
  public static a xt()
  {
    if (cWx == null) {}
    try
    {
      if (cWx == null) {
        cWx = new a();
      }
      return cWx;
    }
    finally {}
  }
  
  public final void a(ae paramae)
  {
    if (paramae != null)
    {
      x.d("MicroMsg.BackgroundPlayer", "add callback : %s", new Object[] { paramae.toString() });
      this.cWy.add(paramae);
    }
  }
  
  public final void b(ae paramae)
  {
    if (paramae != null) {
      this.cWy.remove(paramae);
    }
  }
  
  public final void xu()
  {
    if (this.cWy == null) {}
    for (;;)
    {
      return;
      Iterator localIterator = this.cWy.iterator();
      while (localIterator.hasNext()) {
        ((ae)localIterator.next()).HB();
      }
    }
  }
  
  public final void xv()
  {
    if (this.cWy == null) {}
    for (;;)
    {
      return;
      Iterator localIterator = this.cWy.iterator();
      while (localIterator.hasNext()) {
        ((ae)localIterator.next()).HC();
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/booter/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */