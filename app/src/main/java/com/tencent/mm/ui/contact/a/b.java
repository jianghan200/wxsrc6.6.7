package com.tencent.mm.ui.contact.a;

import android.content.Context;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.plugin.selectcontact.a.c;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;

public final class b
  extends e
{
  public String bgn;
  public int jxE = 0;
  private boolean umr;
  
  public b(int paramInt)
  {
    super(paramInt);
  }
  
  public final void ck(Context paramContext)
  {
    if ((this.jxE != 0) && (this.bgn != null))
    {
      this.umD = this.jxE;
      this.umC = this.bgn;
      return;
    }
    ab localab = this.guS;
    if (!this.umr)
    {
      g.Ek();
      localab = ((i)g.l(i.class)).FR().Yg(this.username);
      this.guS = localab;
      this.umr = true;
    }
    if (localab == null)
    {
      this.eCh = "";
      return;
    }
    this.eCh = j.a(paramContext, ((com.tencent.mm.plugin.messenger.a.b)g.l(com.tencent.mm.plugin.messenger.a.b.class)).c(localab), com.tencent.mm.bp.a.ad(paramContext, a.c.NormalTextSize));
    this.username = localab.field_username;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/ui/contact/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */