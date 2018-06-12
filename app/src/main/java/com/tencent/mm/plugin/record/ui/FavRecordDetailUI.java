package com.tencent.mm.plugin.record.ui;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.R.g;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.fz;
import com.tencent.mm.g.a.fz.b;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.protocal.c.vx;
import com.tencent.mm.protocal.c.wl;
import com.tencent.mm.protocal.c.wr;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.s;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FavRecordDetailUI
  extends RecordMsgBaseUI
{
  private boolean bUY = true;
  private j.a iXr = new FavRecordDetailUI.1(this);
  private com.tencent.mm.plugin.fav.a.g jaq;
  private long msC = -1L;
  private boolean msD = true;
  private boolean msE = false;
  
  protected final void bqA()
  {
    this.msC = getIntent().getLongExtra("key_detail_info_id", -1L);
    this.bUY = getIntent().getBooleanExtra("show_share", true);
    this.jaq = com.tencent.mm.plugin.record.b.b.eo(this.msC);
    if (this.jaq == null)
    {
      finish();
      return;
    }
    F(this.jaq);
    Object localObject1 = new b();
    ((b)localObject1).msw = this.jaq;
    ((b)localObject1).msv = this.jaq.field_favProto.rBI;
    Object localObject2 = ((b)localObject1).msv;
    if (localObject2 == null) {
      this.msD = false;
    }
    for (;;)
    {
      super.bqA();
      this.msU.a((a)localObject1);
      localObject1 = ((b)localObject1).msv;
      if (localObject1 != null) {
        e.post(new FavRecordDetailUI.4(this, (List)localObject1), "calc_fav_record_info");
      }
      ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().c(this.iXr);
      ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnStorage().a(((d)this.msU).msy);
      return;
      if (((List)localObject2).size() == 0)
      {
        this.msD = false;
      }
      else
      {
        localObject2 = ((List)localObject2).iterator();
        for (;;)
        {
          if (((Iterator)localObject2).hasNext()) {
            if (((vx)((Iterator)localObject2).next()).rAw != 0)
            {
              this.msD = false;
              break;
            }
          }
        }
        this.msD = true;
      }
    }
  }
  
  protected final h bqB()
  {
    return new d(this, new c(this));
  }
  
  protected final String bqC()
  {
    if ((14 == this.jaq.field_type) && (!bi.oW(this.jaq.field_favProto.title))) {
      return this.jaq.field_favProto.title;
    }
    wr localwr = this.jaq.field_favProto.rBG;
    if ((localwr != null) && (!bi.oW(localwr.rBh)))
    {
      String str2 = r.gT(localwr.rBh);
      String str3;
      String str1;
      if (com.tencent.mm.model.q.GF().equals(localwr.bSS))
      {
        str3 = com.tencent.mm.plugin.record.b.h.gU(localwr.toUser);
        str1 = str2;
        if (!bi.aG(str3, "").equals(localwr.toUser)) {
          str1 = str2 + " - " + str3;
        }
      }
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.x.v("MicroMsg.FavRecordDetailUI", "display name, source from[%s] to[%s]", new Object[] { localwr.bSS, localwr.toUser });
        return str1;
        str3 = com.tencent.mm.plugin.record.b.h.gU(localwr.bSS);
        str1 = str2;
        if (!bi.aG(str3, "").equals(localwr.bSS)) {
          str1 = str2 + " - " + str3;
        }
      }
    }
    com.tencent.mm.sdk.platformtools.x.v("MicroMsg.FavRecordDetailUI", "display name, from item info user[%s]", new Object[] { this.jaq.field_fromUser });
    return com.tencent.mm.plugin.record.b.h.gU(this.jaq.field_fromUser);
  }
  
  protected final String bqD()
  {
    LinkedList localLinkedList = this.jaq.field_favProto.rBI;
    if (localLinkedList.size() > 0) {
      return ((vx)localLinkedList.getFirst()).rAm;
    }
    return null;
  }
  
  protected final String bqE()
  {
    LinkedList localLinkedList = this.jaq.field_favProto.rBI;
    if (localLinkedList.size() > 0) {
      return ((vx)localLinkedList.getLast()).rAm;
    }
    return null;
  }
  
  protected final void bqF()
  {
    if (!this.bUY) {
      return;
    }
    addIconOptionMenu(0, R.l.top_item_desc_more, R.g.mm_title_btn_menu, new FavRecordDetailUI.2(this));
  }
  
  protected final void c(int paramInt1, int paramInt2, Intent paramIntent)
  {
    Object localObject;
    if ((4097 == paramInt1) && (-1 == paramInt2))
    {
      localObject = new fz();
      ((fz)localObject).bOL.type = 32;
      ((fz)localObject).bOL.bJA = this.msC;
      com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject);
      if (((fz)localObject).bOM.bPd) {
        com.tencent.mm.ui.base.h.bA(this.mController.tml, getString(R.l.Fav_NotDownload_CannotForward));
      }
    }
    else
    {
      return;
    }
    if (paramIntent == null)
    {
      localObject = null;
      if (paramIntent != null) {
        break label221;
      }
    }
    label221:
    for (paramIntent = null;; paramIntent = paramIntent.getStringExtra("custom_send_text"))
    {
      p localp = com.tencent.mm.ui.base.h.a(this.mController.tml, getString(R.l.favorite_forward_tips), false, null);
      fz localfz = new fz();
      localfz.bOL.type = 13;
      localfz.bOL.context = this.mController.tml;
      localfz.bOL.toUser = ((String)localObject);
      localfz.bOL.bOR = paramIntent;
      localfz.bOL.bJA = this.msC;
      localfz.bOL.bOQ = new FavRecordDetailUI.3(this, localp);
      com.tencent.mm.sdk.b.a.sFg.m(localfz);
      return;
      localObject = paramIntent.getStringExtra("Select_Conv_User");
      break;
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
  }
  
  protected void onDestroy()
  {
    ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().d(this.iXr);
    if (this.msU != null) {
      ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnStorage().b(((d)this.msU).msy);
    }
    this.msE = true;
    super.onDestroy();
  }
  
  protected void onResume()
  {
    super.onResume();
    Object localObject2 = (b)((d)this.msU).msQ;
    com.tencent.mm.plugin.fav.a.g localg;
    if (((b)localObject2).msw != null)
    {
      localg = com.tencent.mm.plugin.record.b.b.eo(((b)localObject2).msw.field_localId);
      if ((localg != null) && (localg.field_favProto != null)) {
        break label51;
      }
    }
    for (;;)
    {
      return;
      label51:
      Object localObject1 = localg.field_favProto.rBI;
      localObject2 = ((b)localObject2).msv.iterator();
      do
      {
        if (!((Iterator)localObject2).hasNext()) {
          break;
        }
      } while (((LinkedList)localObject1).contains((vx)((Iterator)localObject2).next()));
      for (int i = 1; i != 0; i = 0)
      {
        localObject1 = new b();
        ((b)localObject1).msw = localg;
        ((b)localObject1).msv = localg.field_favProto.rBI;
        this.msU.a((a)localObject1);
        return;
      }
    }
  }
  
  protected void onStop()
  {
    super.onStop();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/record/ui/FavRecordDetailUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */