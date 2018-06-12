package com.tencent.mm.ui.bizchat;

import android.app.Activity;
import android.content.res.Resources;
import android.database.Cursor;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.a.b;
import com.tencent.mm.ac.a.c;
import com.tencent.mm.ac.a.j;
import com.tencent.mm.ac.a.k;
import com.tencent.mm.ac.z;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.contact.MMBaseSelectContactUI;
import com.tencent.mm.ui.contact.a.g;
import com.tencent.mm.ui.contact.l;
import com.tencent.mm.ui.contact.n;
import com.tencent.mm.ui.contact.o;

public final class d
  extends o
  implements m.b
{
  private Cursor eCC;
  private String hpJ;
  private int mBL;
  
  public d(MMBaseSelectContactUI paramMMBaseSelectContactUI, String paramString)
  {
    super(paramMMBaseSelectContactUI, null, false, false);
    x.i("MicroMsg.RecentConversationAdapter", "create!");
    this.hpJ = paramString;
    aMk();
  }
  
  private void aMk()
  {
    x.i("MicroMsg.RecentConversationAdapter", "resetData");
    if (this.eCC != null)
    {
      this.eCC.close();
      this.eCC = null;
    }
    this.eCC = z.Nb().kY(this.hpJ);
    this.mBL = 0;
  }
  
  public final void a(int paramInt, m paramm, Object paramObject)
  {
    aMk();
    notifyDataSetChanged();
  }
  
  public final void finish()
  {
    super.finish();
    x.i("MicroMsg.RecentConversationAdapter", "finish!");
    if (this.eCC != null)
    {
      this.eCC.close();
      this.eCC = null;
    }
  }
  
  public final int getCount()
  {
    return this.eCC.getCount() + 1;
  }
  
  protected final com.tencent.mm.ui.contact.a.a iW(int paramInt)
  {
    if (paramInt == this.mBL)
    {
      localObject = new g(paramInt);
      ((g)localObject).jyx = this.ujW.getActivity().getResources().getString(R.l.select_conversation_cur);
    }
    a locala;
    com.tencent.mm.ac.a.a locala1;
    do
    {
      return (com.tencent.mm.ui.contact.a.a)localObject;
      if ((paramInt <= this.mBL) || (!this.eCC.moveToPosition(paramInt - this.mBL - 1))) {
        break;
      }
      locala = new a(paramInt);
      locala1 = new com.tencent.mm.ac.a.a();
      locala1.d(this.eCC);
      localObject = locala;
    } while (locala.hpD != -1L);
    locala.hpD = locala1.field_bizChatId;
    Object localObject = z.Na().ak(locala1.field_bizChatId);
    if (((c)localObject).isGroup())
    {
      locala.eCh = ((c)localObject).field_chatName;
      locala.tEb = ((c)localObject).field_headImageUrl;
      locala.username = ((c)localObject).field_brandUserName;
    }
    for (;;)
    {
      if (bi.K(locala.eCh)) {
        locala.eCh = this.ujW.getActivity().getResources().getString(R.l.room_head_name);
      }
      localObject = locala;
      if (!bi.oW(locala.username)) {
        break;
      }
      locala.username = locala1.field_brandUserName;
      return locala;
      localObject = z.Nc().cz(((c)localObject).field_bizChatServId);
      if (localObject != null)
      {
        locala.eCh = ((j)localObject).field_userName;
        locala.tEb = ((j)localObject).field_headImageUrl;
        locala.username = ((j)localObject).field_brandUserName;
      }
    }
    x.e("MicroMsg.RecentConversationAdapter", "create Data Item Error position=%d", new Object[] { Integer.valueOf(paramInt) });
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/ui/bizchat/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */