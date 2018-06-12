package com.tencent.mm.ui.conversation.a;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.g.a.kd;
import com.tencent.mm.model.au;
import com.tencent.mm.model.q;
import com.tencent.mm.modelsimple.l;
import com.tencent.mm.platformtools.af;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.pluginsdk.ui.b.b;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.sdk.platformtools.x;
import java.lang.ref.WeakReference;

public final class n
  extends b
{
  private boolean dZm = false;
  TextView eCm;
  private TextView eCn;
  private ProgressDialog eHw = null;
  private TextView eSV;
  View gYR = null;
  private ImageView gmn;
  int oDy = 0;
  private TextView usE;
  private TextView usF;
  private ImageView usG;
  private ImageView usH;
  private ImageView usI;
  private ProgressBar usJ;
  String usK;
  private boolean usL = false;
  int usM;
  boolean usN;
  boolean usO;
  boolean usP;
  String usQ;
  al usR;
  com.tencent.mm.sdk.b.c<kd> usS;
  boolean usT = false;
  
  public n(Context paramContext)
  {
    super(paramContext);
    initialize();
  }
  
  private void initialize()
  {
    if ((!this.usL) && (this.view != null))
    {
      this.gYR = this.view.findViewById(R.h.nwview);
      this.eCm = ((TextView)this.view.findViewById(R.h.nw_detail));
      this.eCn = ((TextView)this.view.findViewById(R.h.nw_detail_tip));
      this.eSV = ((TextView)this.view.findViewById(R.h.nw_hint_tip));
      this.usE = ((TextView)this.view.findViewById(R.h.nw_btn));
      this.usJ = ((ProgressBar)this.view.findViewById(R.h.nw_prog));
      this.gmn = ((ImageView)this.view.findViewById(R.h.nw_icon));
      this.usG = ((ImageView)this.view.findViewById(R.h.close_icon));
      this.usH = ((ImageView)this.view.findViewById(R.h.forward_icon));
      this.usI = ((ImageView)this.view.findViewById(R.h.silent_icon));
      this.usF = ((TextView)this.view.findViewById(R.h.empty_space));
      this.usG.setVisibility(8);
      this.usL = true;
    }
  }
  
  public final boolean anR()
  {
    int j = 0;
    int i = au.DF().Lg();
    Object localObject = au.DF().getNetworkServerIp();
    this.usK = String.format("http://w.mail.qq.com/cgi-bin/report_mm?failuretype=1&devicetype=2&clientversion=%s&os=%s&username=%s&iport=%s&t=weixin_bulletin&f=xhtml&lang=%s", new Object[] { "0x" + Integer.toHexString(com.tencent.mm.protocal.d.qVN), com.tencent.mm.protocal.d.DEVICE_TYPE, q.GF(), localObject, w.chP() });
    initialize();
    x.i("MicroMsg.NetWarnView", "update st:%d", new Object[] { Integer.valueOf(i) });
    boolean bool1;
    boolean bool2;
    switch (i)
    {
    case 1: 
    case 4: 
    default: 
      bool1 = false;
      if (bool1)
      {
        this.eSV.setVisibility(8);
        this.eCm.setVisibility(0);
        this.gYR.setBackgroundResource(R.g.tips_bar_red_selector);
        localObject = new LinearLayout.LayoutParams(this.gmn.getLayoutParams());
        ((LinearLayout.LayoutParams)localObject).setMargins(com.tencent.mm.bp.a.fromDPToPix((Context)this.qJS.get(), 10), 0, com.tencent.mm.bp.a.fromDPToPix((Context)this.qJS.get(), 4), 0);
        this.gmn.setLayoutParams((ViewGroup.LayoutParams)localObject);
        this.gmn.setImageResource(R.k.tipsbar_icon_warning);
        this.usH.setVisibility(8);
        this.usI.setVisibility(8);
        this.usF.setVisibility(8);
        bool2 = bool1;
        label274:
        bool1 = bool2;
        if (!bool2)
        {
          this.usG.setVisibility(8);
          bool1 = bool2;
          if (af.ewG)
          {
            i = ao.getBackgroundLimitType((Context)this.qJS.get());
            if ((!ao.isLimited(i)) || (this.usT)) {
              break label1293;
            }
            this.eCm.setText(((Context)this.qJS.get()).getString(R.l.process_limited_warn_title));
            this.eCn.setText(((Context)this.qJS.get()).getString(R.l.process_limited_warn_message));
            this.eCn.setVisibility(0);
            this.usE.setVisibility(8);
            this.usJ.setVisibility(8);
            this.gmn.setVisibility(0);
            this.usG.setVisibility(0);
            this.gYR.setOnClickListener(new n.7(this, i));
            this.usG.setOnClickListener(new n.8(this, i));
            bool1 = true;
          }
        }
        label450:
        this.usI.setImageResource(R.k.chat_mute_notify_normal);
        this.usG.setImageResource(R.g.bottle_close_frame_state);
        localObject = this.gYR;
        if (!bool1) {
          break label1308;
        }
      }
      break;
    }
    label1025:
    label1071:
    label1216:
    label1288:
    label1293:
    label1308:
    for (i = j;; i = 8)
    {
      ((View)localObject).setVisibility(i);
      return bool1;
      this.eCm.setText(R.l.net_warn_no_network);
      this.eCn.setVisibility(8);
      this.usE.setVisibility(8);
      this.usJ.setVisibility(8);
      this.gmn.setVisibility(0);
      this.gYR.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          paramAnonymousView = new Intent();
          paramAnonymousView.putExtra("title", ((Context)n.this.qJS.get()).getString(R.l.net_warn_no_network));
          paramAnonymousView.putExtra("rawUrl", ((Context)n.this.qJS.get()).getString(R.l.net_warn_detail_doc));
          paramAnonymousView.putExtra("showShare", false);
          com.tencent.mm.bg.d.b((Context)n.this.qJS.get(), "webview", ".ui.tools.WebViewUI", paramAnonymousView);
        }
      });
      bool1 = true;
      break;
      this.eCm.setText(R.l.net_warn_connecting);
      this.eCn.setVisibility(8);
      this.usE.setVisibility(8);
      this.usJ.setVisibility(0);
      this.gmn.setVisibility(0);
      bool1 = true;
      break;
      if (this.oDy == 1) {
        this.eCm.setText(((Context)this.qJS.get()).getResources().getString(R.l.net_warn_diagnose_doing, new Object[] { Integer.valueOf(this.usM) }));
      }
      for (;;)
      {
        this.eCn.setVisibility(8);
        this.usE.setVisibility(8);
        this.usJ.setVisibility(8);
        this.gmn.setVisibility(0);
        this.gYR.setOnClickListener(new n.4(this));
        bool1 = true;
        break;
        this.eCm.setText(R.l.net_warn_diagnose_begin);
      }
      this.eCm.setText(R.l.net_warn_server_down);
      this.eCn.setText(((Context)this.qJS.get()).getString(R.l.net_warn_server_down_tip));
      this.eCn.setVisibility(0);
      this.usE.setVisibility(8);
      this.usJ.setVisibility(8);
      this.gmn.setVisibility(0);
      this.gYR.setOnClickListener(new n.5(this));
      bool1 = true;
      break;
      au.HU();
      if (com.tencent.mm.model.c.FM())
      {
        au.HU();
        if (l.il(com.tencent.mm.model.c.FN()))
        {
          localObject = au.DF();
          au.HU();
          ((o)localObject).a(new l(com.tencent.mm.model.c.FN()), 0);
          bool2 = bool1;
          break label274;
        }
      }
      au.HU();
      bool2 = bool1;
      if (!com.tencent.mm.model.c.FM()) {
        break label274;
      }
      bool2 = bool1;
      if (ai.oW(l.efv)) {
        break label274;
      }
      bool2 = bool1;
      if (l.QX()) {
        break label274;
      }
      this.gYR.setBackgroundResource(R.g.tips_bar_white_selector);
      localObject = new LinearLayout.LayoutParams(this.gmn.getLayoutParams());
      ((LinearLayout.LayoutParams)localObject).setMargins(com.tencent.mm.bp.a.fromDPToPix((Context)this.qJS.get(), 22), 0, com.tencent.mm.bp.a.fromDPToPix((Context)this.qJS.get(), 20), 0);
      this.gmn.setLayoutParams((ViewGroup.LayoutParams)localObject);
      this.eCm.setVisibility(8);
      this.eCn.setVisibility(8);
      this.eSV.setVisibility(0);
      if (q.gT(q.GL())) {
        if ((!l.Ra()) && (l.QY()))
        {
          this.eSV.setText(l.efC);
          this.usE.setVisibility(8);
          this.usJ.setVisibility(8);
          this.gmn.setPadding(0, 0, 0, 0);
          if (l.QW() != 1) {
            break label1216;
          }
          this.gmn.setImageResource(R.k.connectkeyboad_banner_icon_pc);
          this.gmn.setVisibility(0);
          this.usH.setVisibility(8);
          this.usI.setVisibility(8);
          localObject = this.usF;
          if (!q.gT(q.GL())) {
            break label1288;
          }
        }
      }
      for (i = 8;; i = 0)
      {
        ((TextView)localObject).setVisibility(i);
        localObject = new Intent();
        ((Intent)localObject).putExtra("intent.key.online_version", l.QZ());
        this.gYR.setOnClickListener(new n.6(this, (Intent)localObject));
        bool2 = true;
        break;
        this.eSV.setText(l.efv);
        break label1025;
        if ((!l.Ra()) && (l.QY()))
        {
          this.eSV.setText(l.efD);
          break label1025;
        }
        this.eSV.setText(l.efy);
        break label1025;
        if (l.QW() == 2)
        {
          if (l.QY())
          {
            this.gmn.setImageResource(R.k.connectkeyboad_banner_icon_maclock);
            break label1071;
          }
          this.gmn.setImageResource(R.k.connectkeyboad_banner_icon_mac);
          break label1071;
        }
        if (l.QW() == 3)
        {
          this.gmn.setImageResource(R.k.connectkeyboad_banner_icon_ipad);
          break label1071;
        }
        this.gmn.setImageResource(R.k.tipsbar_icon_default);
        break label1071;
      }
      this.usG.setVisibility(8);
      bool1 = bool2;
      break label450;
    }
  }
  
  final void czg()
  {
    if (this.usR != null)
    {
      this.usR.SO();
      this.usR = null;
    }
  }
  
  public final void destroy()
  {
    czg();
    if (this.usS != null) {
      com.tencent.mm.sdk.b.a.sFg.c(this.usS);
    }
  }
  
  public final int getLayoutId()
  {
    return R.i.net_warn_item;
  }
  
  public final int getOrder()
  {
    return 2;
  }
  
  public final void setVisibility(int paramInt)
  {
    if (this.gYR != null) {
      this.gYR.setVisibility(paramInt);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ui/conversation/a/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */