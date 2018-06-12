package com.tencent.mm.ui.conversation;

import android.widget.ListView;
import com.tencent.mm.pluginsdk.ui.d;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.x;

public final class k
{
  d hLH = new d(new k.1(this));
  g unL;
  ListView unh;
  boolean urj = false;
  private ah urk;
  private Runnable urm;
  int urn = -1;
  
  final void czb()
  {
    if (!this.urj)
    {
      x.d("MicroMsg.PreLoadHelper", "Jacks cancel PreLoad.");
      this.urj = true;
    }
    if ((this.urk != null) && (this.urm != null)) {
      this.urk.cil().removeCallbacks(this.urm);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/ui/conversation/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */