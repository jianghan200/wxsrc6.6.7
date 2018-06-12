package com.tencent.mm.plugin.brandservice.ui.timeline;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.mm.ac.z;
import com.tencent.mm.ak.a.a;
import com.tencent.mm.ak.o;
import com.tencent.mm.bg.d;
import com.tencent.mm.bt.h;
import com.tencent.mm.plugin.brandservice.b.d;
import com.tencent.mm.plugin.brandservice.b.e;
import com.tencent.mm.plugin.brandservice.b.h;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.q;
import com.tencent.mm.storage.r.a;
import com.tencent.mm.storage.r.b;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;
import com.tencent.mm.ui.statusbar.DrawStatusBarActivity;

public class BizTimeLineNewMsgUI
  extends DrawStatusBarActivity
  implements i
{
  private ListView eVT;
  private TextView emptyTipTv;
  private f hrX;
  
  private void setShowView(int paramInt)
  {
    if (paramInt <= 0)
    {
      this.emptyTipTv.setVisibility(0);
      this.eVT.setVisibility(8);
      return;
    }
    this.emptyTipTv.setVisibility(8);
    this.eVT.setVisibility(0);
  }
  
  public final void avj()
  {
    if (this.hrX != null) {
      this.hrX.notifyDataSetChanged();
    }
  }
  
  protected final int getLayoutId()
  {
    return b.e.biz_time_line_new_msg_activity;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.emptyTipTv = ((TextView)findViewById(b.d.empty_msg_tip_tv));
    this.emptyTipTv.setText(b.h.biz_time_line_empty_biz_new_msg_tip);
    setMMTitle(getString(b.h.biz_time_line_new_msg_title));
    this.hrX = new f(this, z.Nf().ckI());
    this.eVT = ((ListView)findViewById(b.d.biz_time_line_new_msg_lv));
    this.eVT.setAdapter(this.hrX);
    this.eVT.setFooterDividersEnabled(false);
    this.eVT.setOnScrollListener(new AbsListView.OnScrollListener()
    {
      public final void onScroll(AbsListView paramAnonymousAbsListView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3) {}
      
      public final void onScrollStateChanged(AbsListView paramAnonymousAbsListView, int paramAnonymousInt)
      {
        o.Pj().br(paramAnonymousInt);
      }
    });
    this.eVT.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        paramAnonymousAdapterView = BizTimeLineNewMsgUI.a(BizTimeLineNewMsgUI.this).nz(paramAnonymousInt);
        if (paramAnonymousAdapterView == null)
        {
          x.e("MicroMsg.BizTimeLineNewMsgUI", "onItemClick info is null");
          return;
        }
        paramAnonymousView = new Intent();
        paramAnonymousView.putExtra("Chat_User", paramAnonymousAdapterView.field_talker);
        paramAnonymousView.putExtra("finish_direct", true);
        d.e(BizTimeLineNewMsgUI.this.mController.tml, ".ui.chatting.ChattingUI", paramAnonymousView);
      }
    });
    setShowView(this.hrX.getCount());
    setBackBtn(new BizTimeLineNewMsgUI.1(this));
    lF(this.mController.cqm());
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    Object localObject = this.hrX;
    z.Nf().a(((f)localObject).hnE);
    localObject = z.Nf();
    ((t)localObject).dCZ.fV("BizTimeLineSingleMsgInfo", "update BizTimeLineSingleMsgInfo set status = 4 where status != 4");
    r.a locala = new r.a();
    locala.sNY = r.b.sOc;
    ((t)localObject).b(locala);
  }
  
  protected void onPause()
  {
    super.onPause();
  }
  
  protected void onResume()
  {
    super.onResume();
    setShowView(this.hrX.getCount());
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineNewMsgUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */