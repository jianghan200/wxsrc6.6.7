package com.tencent.mm.ui.contact;

import android.os.Looper;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.a.b;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.ay;
import com.tencent.mm.ui.contact.a.a;
import com.tencent.mm.ui.contact.a.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class r
  extends q
{
  private String bWm;
  private ag handler = new ag(Looper.getMainLooper());
  private m.a ujV;
  private Map<String, String> ukC = new HashMap();
  private List<String> ukD = new ArrayList();
  private List<String> uko;
  
  public r(MMBaseSelectContactUI paramMMBaseSelectContactUI, List<String> paramList, boolean paramBoolean, String paramString)
  {
    super(paramMMBaseSelectContactUI, paramList, paramBoolean, 0);
    this.uko = paramList;
    if (!bi.oW(paramString))
    {
      this.ukD = bi.F(paramString.split(","));
      if (this.ukD != null)
      {
        paramMMBaseSelectContactUI = this.ukD.iterator();
        while (paramMMBaseSelectContactUI.hasNext())
        {
          paramList = (String)paramMMBaseSelectContactUI.next();
          paramString = ((b)g.l(b.class)).gT(paramList);
          if (!bi.oW(paramString)) {
            this.ukC.put(paramString, paramList);
          }
        }
      }
    }
    Wj();
  }
  
  private void Wj()
  {
    this.bWm = null;
    clearCache();
  }
  
  public final void a(m.a parama)
  {
    this.ujV = parama;
  }
  
  public final void bA(String paramString, boolean paramBoolean)
  {
    if (this.ujV != null) {
      this.ujV.q(paramString, getCount(), paramBoolean);
    }
  }
  
  protected final boolean c(a parama)
  {
    return true;
  }
  
  public final void finish()
  {
    super.finish();
    Wj();
  }
  
  public final int getCount()
  {
    if (this.ukD == null) {
      return 0;
    }
    return this.ukD.size();
  }
  
  protected final a iW(int paramInt)
  {
    d locald = new d(paramInt);
    locald.bWm = this.bWm;
    g.Ek();
    locald.guS = ((i)g.l(i.class)).FR().Ye((String)this.ukD.get(paramInt));
    locald.ujX = bwq();
    return locald;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/ui/contact/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */