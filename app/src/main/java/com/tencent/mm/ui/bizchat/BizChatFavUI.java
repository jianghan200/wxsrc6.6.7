package com.tencent.mm.ui.bizchat;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.ac.a.b.a;
import com.tencent.mm.ac.a.d;
import com.tencent.mm.ac.a.d.a;
import com.tencent.mm.ac.a.s;
import com.tencent.mm.ac.n;
import com.tencent.mm.ac.z;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.kernel.g;
import com.tencent.mm.l.a;
import com.tencent.mm.model.al;
import com.tencent.mm.model.au;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMSlideDelView.c;
import com.tencent.mm.ui.base.MMSlideDelView.f;
import com.tencent.mm.ui.base.MMSlideDelView.g;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.tools.k;

public class BizChatFavUI
  extends MMActivity
  implements n
{
  private TextView emptyTipTv;
  private p guT;
  private ListView hkY;
  private n.d hlb;
  private long hpD;
  private String hpJ;
  private boolean isCurrentActivity;
  private d.a tEA;
  private c tEF;
  private b.a tEz;
  
  public final void a(int paramInt, l paraml)
  {
    if (this.guT != null) {
      this.guT.dismiss();
    }
  }
  
  protected final int getLayoutId()
  {
    return R.i.enterprise_bizchat_fav;
  }
  
  protected final void initView()
  {
    this.hkY = ((ListView)findViewById(R.h.tmessage_lv));
    this.emptyTipTv = ((TextView)findViewById(R.h.empty_msg_tip_tv));
    this.emptyTipTv.setText(R.l.bizchat_no_fav_conversation);
    this.hkY.setOnScrollListener(new BizChatFavUI.8(this));
    this.tEF = new c(this, new BizChatFavUI.9(this), this.hpJ);
    this.tEF.setGetViewPositionCallback(new MMSlideDelView.c()
    {
      public final int cl(View paramAnonymousView)
      {
        return BizChatFavUI.e(BizChatFavUI.this).getPositionForView(paramAnonymousView);
      }
    });
    this.tEF.setPerformItemClickListener(new MMSlideDelView.g()
    {
      public final void t(View paramAnonymousView, int paramAnonymousInt)
      {
        BizChatFavUI.e(BizChatFavUI.this).performItemClick(paramAnonymousView, paramAnonymousInt, 0L);
      }
    });
    this.tEF.a(new MMSlideDelView.f()
    {
      public final void bv(Object paramAnonymousObject)
      {
        if (paramAnonymousObject == null) {
          x.e("MicroMsg.BizChatFavUI", "onItemDel object null");
        }
      }
    });
    this.hkY.setAdapter(this.tEF);
    this.hlb = new BizChatFavUI.13(this);
    k localk = new k(this);
    this.hkY.setOnItemLongClickListener(new BizChatFavUI.2(this, localk));
    this.hkY.setOnItemClickListener(new BizChatFavUI.3(this));
    setBackBtn(new BizChatFavUI.7(this));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.hpJ = getIntent().getStringExtra("Contact_User");
    x.i("MicroMsg.BizChatFavUI", "[registerListener]");
    this.tEz = new BizChatFavUI.1(this);
    this.tEA = new BizChatFavUI.6(this);
    z.Nb().a(this.tEz, getMainLooper());
    z.Na().a(this.tEA, getMainLooper());
    initView();
    z.Ng();
    paramBundle = new s(this.hpJ);
    g.Eh().dpP.a(paramBundle, 0);
  }
  
  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    paramView = (AdapterView.AdapterContextMenuInfo)paramContextMenuInfo;
    this.hpD = ((com.tencent.mm.ac.a.c)this.tEF.getItem(paramView.position)).field_bizChatLocalId;
    paramContextMenu.add(paramView.position, 0, 1, R.l.bizchat_remove_fav);
  }
  
  public void onDestroy()
  {
    x.i("MicroMsg.BizChatFavUI", "[unRegitListener]");
    z.Nb().a(this.tEz);
    z.Na().a(this.tEA);
    this.tEF.aYc();
    super.onDestroy();
  }
  
  public void onPause()
  {
    this.tEF.onPause();
    this.isCurrentActivity = false;
    au.getNotification().eJ("");
    super.onPause();
  }
  
  public void onResume()
  {
    super.onResume();
    au.HU();
    ab localab = com.tencent.mm.model.c.FR().Yg(this.hpJ);
    if ((localab == null) || (!a.gd(localab.field_type)))
    {
      finish();
      return;
    }
    setTitleMuteIconVisibility(8);
    this.isCurrentActivity = true;
    this.tEF.a(null, null);
    au.getNotification().eJ(this.hpJ);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/ui/bizchat/BizChatFavUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */