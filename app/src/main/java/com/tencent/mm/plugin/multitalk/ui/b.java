package com.tencent.mm.plugin.multitalk.ui;

import android.database.Cursor;
import com.tencent.mm.model.af;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.ui.contact.MMBaseSelectContactUI;
import com.tencent.mm.ui.contact.q;

public final class b
  extends q
{
  private String bWm;
  private String chatroomName;
  private String[] eCB;
  private Cursor eCC;
  
  public b(MMBaseSelectContactUI paramMMBaseSelectContactUI, String paramString)
  {
    super(paramMMBaseSelectContactUI, null, true, 0);
    this.chatroomName = paramString;
    au.HU();
    paramMMBaseSelectContactUI = c.Ga().il(this.chatroomName);
    if (paramMMBaseSelectContactUI != null) {
      this.eCB = bi.cW(paramMMBaseSelectContactUI);
    }
  }
  
  public final void a(String paramString, int[] paramArrayOfInt, boolean paramBoolean)
  {
    x.i("MicroMsg.multitalk.MultiTalkSelectSearchAdapter", "doSearch: %s", new Object[] { paramString });
    clearCache();
    this.bWm = paramString;
    if (this.eCC != null)
    {
      this.eCC.close();
      this.eCC = null;
    }
    if ((!bi.oW(this.bWm)) && (this.eCB != null))
    {
      au.HU();
      this.eCC = c.FR().a(this.eCB, "@all.chatroom", this.bWm, null, null);
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
  
  protected final com.tencent.mm.ui.contact.a.a iW(int paramInt)
  {
    com.tencent.mm.plugin.multitalk.ui.widget.a locala = null;
    if (this.eCC.moveToPosition(paramInt))
    {
      ab localab = new ab();
      localab.d(this.eCC);
      locala = new com.tencent.mm.plugin.multitalk.ui.widget.a(paramInt);
      locala.guS = localab;
      locala.ujX = bwq();
      locala.bWm = this.bWm;
    }
    return locala;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/multitalk/ui/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */