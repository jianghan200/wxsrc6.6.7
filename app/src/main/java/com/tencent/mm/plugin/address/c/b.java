package com.tencent.mm.plugin.address.c;

import android.app.Dialog;
import android.content.Context;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.model.au;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.h;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class b
  implements e
{
  HashSet<l> eXE = new HashSet();
  HashSet<l> eXF = new HashSet();
  Dialog eXG = null;
  private a eXT = null;
  private Set<Integer> eXU = new HashSet();
  private Context mContext;
  
  public b(Context paramContext, a parama)
  {
    this.mContext = paramContext;
    this.eXT = parama;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    int i = 1;
    if (this.eXF.contains(paraml))
    {
      this.eXF.remove(paraml);
      x.d("MicroMsg.WalletNetSceneMgr", "has find scene ");
    }
    for (;;)
    {
      if ((this.eXF.isEmpty()) && (this.eXE.isEmpty()) && (this.eXG != null))
      {
        this.eXG.dismiss();
        this.eXG = null;
      }
      if ((i != 0) && (this.eXT != null)) {
        this.eXT.f(paramInt1, paramInt2, paramString, paraml);
      }
      return;
      if (this.eXE.contains(paraml))
      {
        this.eXE.remove(paraml);
        x.d("MicroMsg.WalletNetSceneMgr", "has find forcescenes ");
      }
      else
      {
        i = 0;
      }
    }
  }
  
  public final void g(l paraml)
  {
    x.d("MicroMsg.WalletNetSceneMgr", "isShowProgress true");
    this.eXF.add(paraml);
    if ((this.eXG == null) || ((this.eXG != null) && (!this.eXG.isShowing())))
    {
      if (this.eXG != null) {
        this.eXG.dismiss();
      }
      this.eXG = h.a(this.mContext, "", true, new b.1(this));
    }
    au.DF().a(paraml, 0);
  }
  
  public final void jr(int paramInt)
  {
    this.eXU.add(Integer.valueOf(paramInt));
    au.DF().a(paramInt, this);
  }
  
  public final void js(int paramInt)
  {
    au.DF().b(paramInt, this);
    this.eXU.remove(Integer.valueOf(paramInt));
    if (this.eXU.isEmpty())
    {
      if (this.eXG != null)
      {
        this.eXG.dismiss();
        this.eXG = null;
      }
      Iterator localIterator = this.eXE.iterator();
      l locall;
      while (localIterator.hasNext())
      {
        locall = (l)localIterator.next();
        au.DF().c(locall);
      }
      localIterator = this.eXF.iterator();
      while (localIterator.hasNext())
      {
        locall = (l)localIterator.next();
        au.DF().c(locall);
      }
      this.eXE.clear();
      this.eXF.clear();
      this.eXT = null;
      this.mContext = null;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/address/c/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */