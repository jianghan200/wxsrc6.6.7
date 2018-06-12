package com.tencent.mm.ui.contact;

import android.app.Activity;
import android.content.res.Resources;
import android.database.Cursor;
import com.tencent.mm.g.c.am;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.plugin.selectcontact.a.g;
import com.tencent.mm.plugin.selectcontact.a.h;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ai;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.az;
import com.tencent.mm.ui.contact.a.a;
import com.tencent.mm.ui.contact.a.b;
import com.tencent.mm.ui.contact.a.e;
import java.util.List;

public final class w
  extends o
  implements m.b
{
  private Cursor eCC;
  private int mBL;
  private List<String> ulj;
  private int ulk;
  private boolean ull;
  private int ulm = 0;
  
  public w(MMBaseSelectContactUI paramMMBaseSelectContactUI, List<String> paramList)
  {
    this(paramMMBaseSelectContactUI, paramList, true, false, false, 0);
  }
  
  public w(MMBaseSelectContactUI paramMMBaseSelectContactUI, List<String> paramList, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, int paramInt)
  {
    super(paramMMBaseSelectContactUI, paramList, paramBoolean1, paramBoolean2);
    x.i("MicroMsg.RecentConversationAdapter", "create!");
    this.ull = paramBoolean3;
    this.ulm = paramInt;
    aMk();
    ((i)com.tencent.mm.kernel.g.l(i.class)).FW().a(this);
  }
  
  private void aMk()
  {
    int j = 0;
    x.i("MicroMsg.RecentConversationAdapter", "resetData");
    if (this.eCC != null)
    {
      this.eCC.close();
      this.eCC = null;
    }
    if (s.fb(this.ulm, 4))
    {
      this.eCC = ((i)com.tencent.mm.kernel.g.l(i.class)).FW().a(com.tencent.mm.model.s.dAS, this.gRN, this.ukn, "");
      if (!this.ull) {
        break label210;
      }
    }
    label210:
    for (int i = 2;; i = 0)
    {
      if (this.ulj != null) {
        j = this.ulj.size();
      }
      this.ulk = j;
      this.mBL = (i + this.ulk);
      clearCache();
      return;
      if (s.fb(this.ulm, 16))
      {
        this.eCC = ((i)com.tencent.mm.kernel.g.l(i.class)).FW().a(com.tencent.mm.model.s.dAU, this.gRN, this.ukn, "");
        break;
      }
      this.eCC = ((i)com.tencent.mm.kernel.g.l(i.class)).FW().a(com.tencent.mm.model.s.dAN, this.gRN, this.ukn, "");
      break;
    }
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
    ((i)com.tencent.mm.kernel.g.l(i.class)).FW().b(this);
  }
  
  public final int getCount()
  {
    return this.eCC.getCount() + this.mBL + 1;
  }
  
  protected final a iW(int paramInt)
  {
    ai localai = null;
    Object localObject;
    if (this.mBL > this.ulk) {
      if (paramInt == this.ulk)
      {
        localObject = new com.tencent.mm.ui.contact.a.g(paramInt);
        ((com.tencent.mm.ui.contact.a.g)localObject).jyx = this.ujW.getActivity().getResources().getString(a.h.select_contact_official_accounts_title);
      }
    }
    for (;;)
    {
      if (paramInt == this.mBL)
      {
        localObject = new com.tencent.mm.ui.contact.a.g(paramInt);
        ((com.tencent.mm.ui.contact.a.g)localObject).jyx = this.ujW.getActivity().getResources().getString(a.h.select_contact_conversation_cur);
      }
      do
      {
        do
        {
          do
          {
            return (a)localObject;
            if (paramInt != this.ulk + 1) {
              break label364;
            }
            localObject = new b(paramInt);
            String str = this.ujW.getActivity().getResources().getString(a.h.select_contact_official_accounts_title);
            ((b)localObject).jxE = a.g.default_servicebrand_contact;
            ((b)localObject).bgn = str;
            break;
            if (paramInt >= this.ulk) {
              break label214;
            }
            localObject = localai;
          } while (this.ulj == null);
          localObject = localai;
        } while (paramInt < 0);
        localObject = localai;
      } while (paramInt >= this.ulj.size());
      localObject = new b(paramInt);
      ((b)localObject).username = ((String)this.ulj.get(paramInt));
      return (a)localObject;
      label214:
      if ((paramInt > this.mBL) && (this.eCC.moveToPosition(paramInt - this.mBL - 1)))
      {
        localObject = new e(paramInt);
        localai = new ai();
        localai.d(this.eCC);
        com.tencent.mm.kernel.g.Ek();
        ((a)localObject).guS = ((i)com.tencent.mm.kernel.g.l(i.class)).FR().Yb(localai.field_username);
        if (((a)localObject).guS == null)
        {
          com.tencent.mm.kernel.g.Ek();
          ((a)localObject).guS = ((i)com.tencent.mm.kernel.g.l(i.class)).FR().Yf(localai.field_username);
        }
        ((a)localObject).ujX = bwq();
        return (a)localObject;
      }
      x.e("MicroMsg.RecentConversationAdapter", "create Data Item Error position=%d", new Object[] { Integer.valueOf(paramInt) });
      return (a)localObject;
      label364:
      localObject = null;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/ui/contact/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */