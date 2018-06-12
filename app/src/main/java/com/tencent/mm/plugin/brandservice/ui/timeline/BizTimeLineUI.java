package com.tencent.mm.plugin.brandservice.ui.timeline;

import android.app.ProgressDialog;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.support.v7.app.ActionBar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.mm.ac.z;
import com.tencent.mm.g.a.k;
import com.tencent.mm.plugin.brandservice.b.d;
import com.tencent.mm.plugin.brandservice.b.e;
import com.tencent.mm.plugin.brandservice.b.g;
import com.tencent.mm.plugin.brandservice.b.h;
import com.tencent.mm.plugin.fav.a.n;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.q;
import com.tencent.mm.storage.r;
import com.tencent.mm.storage.r.a;
import com.tencent.mm.storage.r.b;
import com.tencent.mm.storage.r.c;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;
import com.tencent.mm.ui.statusbar.DrawStatusBarActivity;
import java.util.List;
import java.util.Map;

public class BizTimeLineUI
  extends DrawStatusBarActivity
  implements i
{
  private static long hsm = 0L;
  private static long hsn = 0L;
  private static long hso = 0L;
  private static int hsp = 0;
  private View eLM;
  private ListView eVT;
  private TextView emptyTipTv;
  private g hqQ = new g();
  private View hsd;
  private View hse;
  private ImageView hsf;
  private LinearLayout hsg;
  private TextView hsh;
  private TextView hsi;
  private View hsj;
  private a hsk;
  private e hsl;
  private long hsq = 0L;
  private r.c hsr = new BizTimeLineUI.6(this);
  private com.tencent.mm.sdk.b.c hss = new com.tencent.mm.sdk.b.c() {};
  
  private void avl()
  {
    long l = System.currentTimeMillis();
    List localList;
    boolean bool;
    if ((hsm != 0L) && (hsn != 0L) && (hsp > 0) && (l - hsm < 180000L))
    {
      localList = z.Ne().gh(hsn);
      bool = true;
      x.i("MicroMsg.BizTimeLineUI", "initListView %d/%d  orderFlag %d, keep %b", new Object[] { Long.valueOf(hsm), Long.valueOf(l), Long.valueOf(hsn), Boolean.valueOf(bool) });
      this.hsk = new a(this, localList, bool);
      Object localObject = this.hsk;
      int i = hsp;
      ((a)localObject).hqQ.hrZ = i;
      this.eVT = ((ListView)findViewById(b.d.biz_time_line_lv));
      localObject = this.eVT;
      this.hsd = getLayoutInflater().inflate(b.e.biz_time_line_footer_layout, null);
      ((ListView)localObject).addFooterView(this.hsd);
      localObject = this.eVT;
      this.eLM = getLayoutInflater().inflate(b.e.biz_time_line_header_layout, null);
      ((ListView)localObject).addHeaderView(this.eLM);
      this.hsg = ((LinearLayout)findViewById(b.d.new_msg_tips_layout));
      this.hsh = ((TextView)findViewById(b.d.new_msg_tips_tv));
      this.hsf = ((ImageView)findViewById(b.d.new_msg_tips_icon_iv));
      avk();
      this.hsg.setOnClickListener(new BizTimeLineUI.1(this));
      this.eVT.setAdapter(this.hsk);
      this.eVT.setFooterDividersEnabled(false);
      this.eVT.setOnScrollListener(new BizTimeLineUI.8(this));
      if (this.hsk.getCount() > 0) {
        break label396;
      }
      this.emptyTipTv.setVisibility(0);
      this.eVT.setVisibility(8);
    }
    for (;;)
    {
      this.eVT.postDelayed(new BizTimeLineUI.9(this, bool), 100L);
      if (localList.size() < 10) {
        avm();
      }
      return;
      localList = r.n(z.Ne().dCZ.query("BizTimeLineInfo", null, null, null, null, null, "orderFlag DESC limit 10"));
      bool = false;
      break;
      label396:
      this.emptyTipTv.setVisibility(8);
      this.eVT.setVisibility(0);
    }
  }
  
  public final void avj()
  {
    if (this.hsk != null) {
      this.hsk.notifyDataSetChanged();
    }
  }
  
  public final void avk()
  {
    int i = z.Nf().axd();
    if (i > 0)
    {
      this.hsg.setVisibility(0);
      this.hsh.setText(getString(b.h.biz_time_line_new_msg_count, new Object[] { Integer.valueOf(i) }));
      q localq = z.Nf().ckB();
      if (localq != null)
      {
        this.hsf.setVisibility(0);
        a.b.a(this.hsf, localq.field_talker);
        return;
      }
      this.hsf.setVisibility(8);
      return;
    }
    this.hsg.setVisibility(8);
  }
  
  public final void avm()
  {
    if (this.hsd != null)
    {
      ProgressBar localProgressBar = (ProgressBar)findViewById(b.d.biz_time_line_loading_more_pb);
      TextView localTextView = (TextView)findViewById(b.d.biz_time_line_loading_more_tv);
      localProgressBar.setVisibility(8);
      localTextView.setText(getString(b.h.biz_time_line_loading_no_more_tips));
    }
  }
  
  public final void avn()
  {
    if (this.hsk == null) {}
    while (this.hsk.gxs.size() <= 0) {
      return;
    }
    long l = ((q)this.hsk.gxs.get(0)).field_orderFlag;
    int i = z.Ne().gi(l);
    x.d("MicroMsg.BizTimeLineUI", "updateActionBarCustomView %d", new Object[] { Integer.valueOf(i) });
    if (i > 0)
    {
      DL(4);
      if (this.hse.getVisibility() == 8) {
        this.hse.setVisibility(4);
      }
      this.hsi.setText(getString(b.h.biz_time_line_new_update_count, new Object[] { Integer.valueOf(i) }));
      this.hse.post(new BizTimeLineUI.4(this, l));
      return;
    }
    this.hse.setVisibility(8);
    DL(0);
  }
  
  public final void avo()
  {
    x.d("MicroMsg.BizTimeLineUI", "hideActionBarCustomView");
    if (this.hse.getVisibility() != 8) {
      this.hse.setVisibility(8);
    }
    DL(0);
  }
  
  protected final int getLayoutId()
  {
    return b.e.biz_time_line_activity;
  }
  
  protected final int getStatusBarColor()
  {
    if (Build.VERSION.SDK_INT >= 21) {
      return -1052684;
    }
    return super.getStatusBarColor();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    lF(-1052684);
    setTitleBarDoubleClickListener(new BizTimeLineUI.13(this));
    paramBundle = com.tencent.mm.model.c.c.Jx().fJ("100045");
    boolean bool;
    if ((paramBundle.isValid()) && ("1".equals(paramBundle.ckq().get("isOpenSearch"))))
    {
      bool = true;
      x.d("MicroMsg.BizTimeLineUI", "open search entrance:%b", new Object[] { Boolean.valueOf(bool) });
      if (bool) {
        addIconOptionMenu(0, b.h.top_item_desc_search, b.g.actionbar_icon_dark_search, new BizTimeLineUI.11(this));
      }
      addIconOptionMenu(1, b.g.actionbar_menu_list_icon, new BizTimeLineUI.12(this));
      setMMTitle(b.h.biz_time_line_title);
      nS(-16777216);
      setBackBtn(new BizTimeLineUI.2(this), b.g.actionbar_icon_dark_back);
      this.hse = getLayoutInflater().inflate(b.e.biz_time_line_action_bar_update_view, null);
      this.hsi = ((TextView)this.hse.findViewById(b.d.biz_time_line_update_count_tv));
      this.hsi.setTextSize(1, 15.0F);
      this.hsj = this.hse.findViewById(b.d.biz_time_line_update_count_layout);
      ((LinearLayout)this.mController.mActionBar.getCustomView()).addView(this.hse);
      paramBundle = (LinearLayout.LayoutParams)this.hse.getLayoutParams();
      paramBundle.width = -1;
      paramBundle.weight = 1.0F;
      this.hse.setLayoutParams(paramBundle);
      this.hsj.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          BizTimeLineUI.e(BizTimeLineUI.this);
        }
      });
      this.hse.setVisibility(8);
      this.emptyTipTv = ((TextView)findViewById(b.d.empty_msg_tip_tv));
      this.emptyTipTv.setText(b.h.biz_time_line_empty_biz_msg_tip);
      this.hsl = new e(this);
      paramBundle = this.hsl;
      com.tencent.mm.sdk.b.a.sFg.b(paramBundle.fIu);
      paramBundle = new d();
      if (!d.avi()) {
        break label412;
      }
      avl();
    }
    for (;;)
    {
      z.Nf().a(this.hsr, Looper.getMainLooper());
      com.tencent.mm.pluginsdk.e.l(this);
      paramBundle = this.hqQ;
      com.tencent.mm.kernel.g.Em().H(new g.2(paramBundle));
      this.hsq = System.currentTimeMillis();
      com.tencent.mm.sdk.b.a.sFg.b(this.hss);
      return;
      bool = false;
      break;
      label412:
      getString(b.h.app_tip);
      com.tencent.mm.sdk.f.e.post(new d.1(paramBundle, new Runnable()
      {
        public final void run()
        {
          if (this.hsv != null) {
            this.hsv.dismiss();
          }
          BizTimeLineUI.a(BizTimeLineUI.this);
        }
      }), "BizTimeLineMigrateThread");
    }
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    Object localObject = this.hsl;
    com.tencent.mm.sdk.b.a.sFg.c(((e)localObject).fIu);
    hsm = System.currentTimeMillis();
    if ((this.hsk != null) && (this.eVT != null))
    {
      localObject = this.hsk.avf();
      if (localObject != null) {
        hsn = ((q)localObject).field_orderFlag;
      }
      localObject = this.hsk.nz(hsp);
      if (localObject == null) {
        break label198;
      }
      hso = ((q)localObject).field_orderFlag;
    }
    for (;;)
    {
      localObject = this.hsk;
      int i = hsp;
      z.Ne().a(((a)localObject).hnE);
      ((a)localObject).hqQ.hsa = i;
      localObject = ((a)localObject).hqQ;
      com.tencent.mm.kernel.g.Em().H(new g.1((g)localObject));
      z.Nf().a(this.hsr);
      if (this.hsq != 0L) {
        com.tencent.mm.plugin.report.service.h.mEJ.h(13932, new Object[] { Integer.valueOf((int)(System.currentTimeMillis() - this.hsq) / 1000), Integer.valueOf(1) });
      }
      com.tencent.mm.sdk.b.a.sFg.c(this.hss);
      return;
      label198:
      x.w("MicroMsg.BizTimeLineUI", "FirstVisibleItem is null %d", new Object[] { Integer.valueOf(hsp) });
    }
  }
  
  protected void onPause()
  {
    super.onPause();
    if (this.hsk != null)
    {
      localObject = this.hsk.hqN;
      if (((h)localObject).isPlaying()) {
        ((h)localObject).avp().stopPlay();
      }
    }
    Object localObject = z.Ne();
    ((r)localObject).dCZ.fV("BizTimeLineInfo", "update BizTimeLineInfo set hasShow = 1 where hasShow != 1 ");
    r.a locala = new r.a();
    locala.sNY = r.b.sOc;
    ((r)localObject).b(locala);
  }
  
  protected void onResume()
  {
    super.onResume();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */