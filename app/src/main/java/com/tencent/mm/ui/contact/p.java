package com.tencent.mm.ui.contact;

import android.app.Activity;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Looper;
import com.tencent.mm.ac.a.c;
import com.tencent.mm.ac.a.j;
import com.tencent.mm.plugin.selectcontact.a.h;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.List;

public final class p
  extends q
{
  private String bWm;
  private Cursor eCC;
  private ag handler = new ag(Looper.getMainLooper());
  private String hpJ;
  private m.a ujV;
  private List<String> uko = null;
  
  public p(MMBaseSelectContactUI paramMMBaseSelectContactUI, String paramString)
  {
    super(paramMMBaseSelectContactUI, null, false, 0);
    this.hpJ = paramString;
    x.i("MicroMsg.MMSearchContactAdapter", "Create!");
    Wj();
  }
  
  private void Wj()
  {
    x.i("MicroMsg.MMSearchContactAdapter", "initData!");
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
  
  protected final boolean c(com.tencent.mm.ui.contact.a.a parama)
  {
    return true;
  }
  
  public final void finish()
  {
    super.finish();
    x.i("MicroMsg.MMSearchContactAdapter", "finish!");
    Wj();
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
    if ((paramInt >= 0) && (this.eCC.moveToPosition(paramInt)))
    {
      com.tencent.mm.ui.bizchat.a locala = new com.tencent.mm.ui.bizchat.a(paramInt);
      c localc = new c();
      localc.d(this.eCC);
      if (locala.hpD == -1L)
      {
        locala.hpD = localc.field_bizChatLocalId;
        if (!localc.isGroup()) {
          break label144;
        }
        locala.eCh = localc.field_chatName;
        locala.tEb = localc.field_headImageUrl;
        locala.username = localc.field_brandUserName;
      }
      for (;;)
      {
        if (bi.K(locala.eCh)) {
          locala.eCh = this.ujW.getActivity().getResources().getString(a.h.select_contact_room_head_name);
        }
        if (bi.oW(locala.username)) {
          locala.username = localc.field_brandUserName;
        }
        return locala;
        label144:
        j localj = ((com.tencent.mm.api.g)com.tencent.mm.kernel.g.l(com.tencent.mm.api.g.class)).cz(localc.field_bizChatServId);
        if (localj != null)
        {
          locala.eCh = localj.field_userName;
          locala.tEb = localj.field_headImageUrl;
          locala.username = localj.field_brandUserName;
        }
      }
    }
    x.e("MicroMsg.MMSearchContactAdapter", "create Data Item Error position=%d", new Object[] { Integer.valueOf(paramInt) });
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/ui/contact/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */