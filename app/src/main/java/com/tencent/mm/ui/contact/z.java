package com.tencent.mm.ui.contact;

import android.database.Cursor;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.ui.contact.a.a;
import com.tencent.mm.ui.contact.a.d;
import java.util.ArrayList;

public final class z
  extends o
{
  private Cursor eCC;
  private String ugF;
  
  public z(MMBaseSelectContactUI paramMMBaseSelectContactUI, String paramString)
  {
    super(paramMMBaseSelectContactUI, new ArrayList(), false, false);
    this.ugF = paramString;
    g.Ek();
    this.eCC = ((i)g.l(i.class)).FR().d(this.ugF, "", this.gRN);
  }
  
  public final void finish()
  {
    super.finish();
    x.i("MicroMsg.SpecialContactAdapter", "finish!");
    if (this.eCC != null)
    {
      this.eCC.close();
      this.eCC = null;
    }
  }
  
  public final int getCount()
  {
    return this.eCC.getCount();
  }
  
  protected final a iW(int paramInt)
  {
    if ((paramInt >= 0) && (this.eCC.moveToPosition(paramInt)))
    {
      d locald = new d(paramInt);
      ab localab = new ab();
      localab.d(this.eCC);
      locald.guS = localab;
      locald.ujX = bwq();
      return locald;
    }
    x.e("MicroMsg.SpecialContactAdapter", "create Data Item Error position=%d", new Object[] { Integer.valueOf(paramInt) });
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ui/contact/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */