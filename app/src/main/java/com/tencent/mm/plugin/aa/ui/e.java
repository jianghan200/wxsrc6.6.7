package com.tencent.mm.plugin.aa.ui;

import android.database.Cursor;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.af;
import com.tencent.mm.plugin.chatroom.b.b;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.ui.contact.MMBaseSelectContactUI;
import com.tencent.mm.ui.contact.a.a;
import com.tencent.mm.ui.contact.a.d;
import com.tencent.mm.ui.contact.q;

public final class e
  extends q
{
  private String bWm;
  private String chatroomName;
  private String[] eCB;
  private Cursor eCC;
  
  public e(MMBaseSelectContactUI paramMMBaseSelectContactUI, String paramString)
  {
    super(paramMMBaseSelectContactUI, null, true, 0);
    this.chatroomName = paramString;
    paramMMBaseSelectContactUI = ((b)g.l(b.class)).Ga().il(this.chatroomName);
    if (paramMMBaseSelectContactUI != null) {
      this.eCB = bi.cW(paramMMBaseSelectContactUI);
    }
  }
  
  public final void a(String paramString, int[] paramArrayOfInt, boolean paramBoolean)
  {
    x.i("MicroMsg.AASelectSearchContactItem", "doSearch: %s", new Object[] { paramString });
    clearCache();
    this.bWm = paramString;
    if (this.eCC != null)
    {
      this.eCC.close();
      this.eCC = null;
    }
    if ((!bi.oW(this.bWm)) && (this.eCB != null))
    {
      g.Ek();
      this.eCC = ((i)g.l(i.class)).FR().a(this.eCB, "@all.chatroom", this.bWm, null, null);
    }
    notifyDataSetChanged();
    bA(paramString, true);
  }
  
  public final void finish()
  {
    super.finish();
    if (this.eCC != null)
    {
      this.eCC.close();
      this.eCC = null;
    }
  }
  
  public final int getCount()
  {
    if (this.eCC == null) {
      return 0;
    }
    return this.eCC.getCount();
  }
  
  protected final a iW(int paramInt)
  {
    d locald = null;
    if (this.eCC.moveToPosition(paramInt))
    {
      ab localab = new ab();
      localab.d(this.eCC);
      locald = new d(paramInt);
      locald.guS = localab;
      locald.ujX = true;
    }
    return locald;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/aa/ui/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */