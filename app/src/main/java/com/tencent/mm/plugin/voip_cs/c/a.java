package com.tencent.mm.plugin.voip_cs.c;

import android.widget.TextView;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.x;

public final class a
{
  public al eOf = new al(new a.1(this), true);
  public TextView ih;
  public int[] oQE;
  public int oQF;
  public int oQG;
  
  public final void bLJ()
  {
    if (this.eOf != null) {
      this.eOf.SO();
    }
    x.k("MicroMsg.DynamicTextWrap", "stop textview: " + this.ih, new Object[0]);
    this.ih = null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/voip_cs/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */