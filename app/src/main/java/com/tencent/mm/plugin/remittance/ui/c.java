package com.tencent.mm.plugin.remittance.ui;

import android.app.Activity;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.MergeCursor;
import android.widget.ListView;
import com.tencent.mm.g.c.am;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ai;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.az;
import com.tencent.mm.ui.contact.MMBaseSelectContactUI;
import com.tencent.mm.ui.contact.a.a;
import com.tencent.mm.ui.contact.a.e;
import com.tencent.mm.ui.contact.l;
import com.tencent.mm.ui.contact.n;
import com.tencent.mm.ui.contact.o;
import java.util.ArrayList;
import java.util.List;

public final class c
  extends o
  implements m.b
{
  private Cursor eCC;
  private int fromScene;
  int mBK;
  int mBL;
  private List<String> mBM;
  private int mBN = 0;
  
  public c(MMBaseSelectContactUI paramMMBaseSelectContactUI, List<String> paramList1, List<String> paramList2, int paramInt)
  {
    super(paramMMBaseSelectContactUI, paramList2, true, false);
    this.mBM = paramList1;
    this.fromScene = paramInt;
    x.i("MicroMsg.RecentConversationAdapter", "create!");
    aMk();
    ((i)com.tencent.mm.kernel.g.l(i.class)).FW().a(this);
  }
  
  private void aMk()
  {
    x.i("MicroMsg.RecentConversationAdapter", "resetData");
    if (this.eCC != null)
    {
      this.eCC.close();
      this.eCC = null;
    }
    this.mBN = 0;
    ArrayList localArrayList = new ArrayList();
    this.mBK = -1;
    this.mBL = -1;
    Object localObject;
    int i;
    if ((this.mBM != null) && (this.mBM.size() > 0))
    {
      com.tencent.mm.kernel.g.Ek();
      localObject = ((i)com.tencent.mm.kernel.g.l(i.class)).FR().di(this.mBM);
      localArrayList.add(localObject);
      i = ((Cursor)localObject).getCount();
      if (i > 0)
      {
        this.mBK = this.ujW.getContentLV().getHeaderViewsCount();
        this.mBN += 1;
      }
    }
    for (;;)
    {
      localObject = this.gRN;
      if (localObject != null)
      {
        ((List)localObject).addAll(this.mBM);
        label162:
        if (this.fromScene != 1) {
          break label283;
        }
        localObject = ((i)com.tencent.mm.kernel.g.l(i.class)).FW().a(s.dAO, (List)localObject, this.ukn, "");
        label199:
        if (((Cursor)localObject).getCount() <= 0) {
          break label334;
        }
        this.mBN += 1;
        if (i <= 0) {
          break label315;
        }
        this.mBL = (i + this.mBK + 1);
      }
      for (;;)
      {
        localArrayList.add(localObject);
        this.eCC = new MergeCursor((Cursor[])localArrayList.toArray(new Cursor[0]));
        return;
        this.mBK = -1;
        break;
        localObject = this.mBM;
        break label162;
        label283:
        localObject = ((i)com.tencent.mm.kernel.g.l(i.class)).FW().a(s.dAS, (List)localObject, this.ukn, "");
        break label199;
        label315:
        this.mBL = this.ujW.getContentLV().getHeaderViewsCount();
        continue;
        label334:
        this.mBL = -1;
      }
      i = 0;
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
    return this.eCC.getCount() + this.mBN;
  }
  
  protected final a iW(int paramInt)
  {
    Object localObject;
    if ((paramInt == this.mBL) || (paramInt == this.mBK))
    {
      localObject = new com.tencent.mm.ui.contact.a.g(paramInt);
      if (paramInt == this.mBK) {
        if (this.fromScene == 1) {
          ((com.tencent.mm.ui.contact.a.g)localObject).jyx = this.ujW.getActivity().getResources().getString(a.i.aa_recent_group);
        }
      }
      while (paramInt != this.mBL)
      {
        return (a)localObject;
        ((com.tencent.mm.ui.contact.a.g)localObject).jyx = this.ujW.getActivity().getResources().getString(a.i.remittance_recent_friends);
        return (a)localObject;
      }
      ((com.tencent.mm.ui.contact.a.g)localObject).jyx = this.ujW.getActivity().getResources().getString(a.i.wallet_select_conversation_cur);
      return (a)localObject;
    }
    int i;
    if (this.mBN == 2) {
      if (paramInt > this.mBL) {
        i = paramInt - 2;
      }
    }
    while (this.eCC.moveToPosition(i))
    {
      localObject = new e(paramInt);
      ai localai = new ai();
      localai.d(this.eCC);
      com.tencent.mm.kernel.g.Ek();
      ((a)localObject).guS = ((i)com.tencent.mm.kernel.g.l(i.class)).FR().Yb(localai.field_username);
      if (((a)localObject).guS == null)
      {
        com.tencent.mm.kernel.g.Ek();
        ((a)localObject).guS = ((i)com.tencent.mm.kernel.g.l(i.class)).FR().Yf(localai.field_username);
      }
      return (a)localObject;
      i = paramInt - 1;
      continue;
      if (this.mBN == 1)
      {
        i = paramInt - 1;
      }
      else
      {
        x.e("MicroMsg.RecentConversationAdapter", "Actually dead branch. position=%d", new Object[] { Integer.valueOf(paramInt) });
        i = paramInt;
      }
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/remittance/ui/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */