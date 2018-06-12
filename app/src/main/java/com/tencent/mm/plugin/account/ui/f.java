package com.tencent.mm.plugin.account.ui;

import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelsimple.q;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.applet.SecurityImage.b;

public final class f
  extends SecurityImage.b
{
  private static f eRR = null;
  public String account = null;
  public String eIY = null;
  public byte[] eIZ = null;
  public String eJa = null;
  public String eJb = null;
  public String eRP = null;
  public int eRQ = 0;
  
  public static String YF()
  {
    if (eRR != null) {
      return eRR.account;
    }
    return null;
  }
  
  public static String YG()
  {
    if (eRR != null) {
      return eRR.eIY;
    }
    return null;
  }
  
  public static void a(f paramf)
  {
    eRR = paramf;
  }
  
  public final void Xe()
  {
    if (!bi.oW(this.eRP))
    {
      localq = new q(this.account, this.eRP, this.trX.getSecCodeType(), "", "", "", 0, "", false, true);
      g.DF().a(localq, 0);
      return;
    }
    q localq = new q(this.account, this.eIY, this.trX.getSecCodeType(), "", "", "", 0, "", false, false);
    g.DF().a(localq, 0);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/account/ui/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */