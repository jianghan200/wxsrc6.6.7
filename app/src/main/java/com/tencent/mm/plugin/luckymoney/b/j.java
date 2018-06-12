package com.tencent.mm.plugin.luckymoney.b;

import android.content.Context;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.wallet_core.c.m;
import com.tencent.mm.wallet_core.d.f;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class j
  implements com.tencent.mm.ab.e, com.tencent.mm.wallet_core.d.e
{
  private String dox;
  HashSet<l> eXE = new HashSet();
  HashSet<l> eXF = new HashSet();
  private Set<Integer> eXU = new HashSet();
  private f kQv = null;
  private Context mContext;
  p tipDialog = null;
  
  public j(Context paramContext, f paramf)
  {
    this.mContext = paramContext;
    this.kQv = paramf;
  }
  
  private void k(l paraml)
  {
    if ((paraml != null) && ((paraml instanceof m))) {
      ((m)paraml).dox = this.dox;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    int i;
    if (this.eXF.contains(paraml))
    {
      this.eXF.remove(paraml);
      x.d("MicroMsg.WalletNetSceneMgr", "has find scene ");
      i = 1;
    }
    for (;;)
    {
      if ((this.eXF.isEmpty()) && (this.eXE.isEmpty())) {
        if (this.tipDialog != null)
        {
          this.tipDialog.dismiss();
          this.tipDialog = null;
        }
      }
      for (boolean bool = true;; bool = false)
      {
        if ((i != 0) && (this.kQv != null)) {
          this.kQv.b(paramInt1, paramInt2, paramString, paraml, bool);
        }
        return;
        if (!this.eXE.contains(paraml)) {
          break label144;
        }
        this.eXE.remove(paraml);
        x.d("MicroMsg.WalletNetSceneMgr", "has find forcescenes ");
        i = 1;
        break;
      }
      label144:
      i = 0;
    }
  }
  
  public final void a(l paraml, boolean paramBoolean)
  {
    k(paraml);
    this.eXE.add(paraml);
    if ((paramBoolean) && ((this.tipDialog == null) || ((this.tipDialog != null) && (!this.tipDialog.isShowing()))))
    {
      if (this.tipDialog != null) {
        this.tipDialog.dismiss();
      }
      this.tipDialog = h.a(this.mContext, this.mContext.getString(a.i.loading_tips), false, new j.1(this));
    }
    g.Ek();
    g.Eh().dpP.a(paraml, 0);
  }
  
  public final void b(l paraml, boolean paramBoolean)
  {
    x.d("MicroMsg.WalletNetSceneMgr", "isShowProgress " + paramBoolean);
    k(paraml);
    this.eXF.add(paraml);
    if ((paramBoolean) && ((this.tipDialog == null) || ((this.tipDialog != null) && (!this.tipDialog.isShowing()))))
    {
      if (this.tipDialog != null) {
        this.tipDialog.dismiss();
      }
      this.tipDialog = h.a(this.mContext, this.mContext.getString(a.i.loading_tips), true, new j.2(this));
    }
    g.Ek();
    g.Eh().dpP.a(paraml, 0);
  }
  
  public final void baT()
  {
    if (this.tipDialog != null)
    {
      this.tipDialog.dismiss();
      this.tipDialog = null;
    }
    Iterator localIterator = this.eXE.iterator();
    l locall;
    while (localIterator.hasNext())
    {
      locall = (l)localIterator.next();
      g.Ek();
      g.Eh().dpP.c(locall);
    }
    localIterator = this.eXF.iterator();
    while (localIterator.hasNext())
    {
      locall = (l)localIterator.next();
      g.Ek();
      g.Eh().dpP.c(locall);
    }
    this.eXE.clear();
    this.eXF.clear();
  }
  
  public final boolean baU()
  {
    return (!this.eXF.isEmpty()) || (!this.eXE.isEmpty());
  }
  
  public final void baV()
  {
    if ((this.tipDialog != null) && (this.tipDialog.isShowing())) {
      this.tipDialog.dismiss();
    }
  }
  
  public final void jr(int paramInt)
  {
    this.eXU.add(Integer.valueOf(paramInt));
    g.Ek();
    g.Eh().dpP.a(paramInt, this);
  }
  
  public final void js(int paramInt)
  {
    g.Ek();
    g.Eh().dpP.b(paramInt, this);
    this.eXU.remove(Integer.valueOf(paramInt));
    if (this.eXU.isEmpty())
    {
      baT();
      this.kQv = null;
      this.mContext = null;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/luckymoney/b/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */