package com.tencent.mm.plugin.address.b.b;

import android.app.Dialog;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashSet;

public final class a
  implements e
{
  private HashSet<l> eXE;
  private HashSet<l> eXF;
  private Dialog eXG;
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if (this.eXF.contains(paraml))
    {
      this.eXF.remove(paraml);
      x.d("MicroMsg.InvoiceNetSceneMgr", "has find scene ");
    }
    for (;;)
    {
      if ((this.eXF.isEmpty()) && (this.eXE.isEmpty()) && (this.eXG != null))
      {
        this.eXG.dismiss();
        this.eXG = null;
      }
      return;
      if (this.eXE.contains(paraml))
      {
        this.eXE.remove(paraml);
        x.d("MicroMsg.InvoiceNetSceneMgr", "has find forcescenes ");
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/address/b/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */