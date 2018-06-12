package com.tencent.mm.plugin.fts.ui;

import android.app.Dialog;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.mm.g.a.sh;
import com.tencent.mm.g.a.tt;
import com.tencent.mm.modelgeo.a.a;
import com.tencent.mm.plugin.appbrand.n.g.a;
import com.tencent.mm.plugin.appbrand.n.g.c;
import com.tencent.mm.plugin.fts.a.f;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.plugin.fts.ui.widget.FTSLocalPageRelevantView;
import com.tencent.mm.plugin.fts.ui.widget.FTSMainUIEducationLayout;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.websearch.api.p;
import com.tencent.mm.plugin.websearch.api.r;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.e.i;
import com.tencent.mm.ui.s;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

@com.tencent.mm.ui.base.a(3)
public class FTSMainUI
  extends FTSBaseVoiceSearchUI
  implements a.a
{
  long ghF;
  private Dialog iwc;
  private int jsZ;
  int jvZ = -1;
  private FTSMainUIEducationLayout jwW;
  private LinearLayout jwX;
  private LinearLayout jwY;
  private LinearLayout jwZ;
  private View jxa;
  private View jxb;
  private FTSLocalPageRelevantView jxc;
  private TextView jxd;
  private TextView jxe;
  private View jxf;
  private View jxg;
  private TextView jxh;
  private String jxi;
  private Map<String, Integer> jxj = new HashMap();
  private j jxk;
  private j.b jxl = new FTSMainUI.6(this);
  private com.tencent.mm.plugin.websearch.api.d jxm = new FTSMainUI.3(this);
  private View.OnClickListener jxn = new FTSMainUI.5(this);
  private com.tencent.mm.sdk.b.c<tt> jxo = new FTSMainUI.13(this);
  
  private void aQO()
  {
    this.jwW.setVisibility(0);
    this.jwW.aL();
  }
  
  private void aQP()
  {
    this.jwW.setVisibility(8);
  }
  
  public final void K(int paramInt, boolean paramBoolean)
  {
    super.K(paramInt, paramBoolean);
    this.jxc.setVisibility(8);
    if ((!paramBoolean) && (paramInt == 0) && (this.jxk.jwS)) {
      this.jwZ.setVisibility(0);
    }
    while (!paramBoolean)
    {
      this.jxa.setVisibility(8);
      this.jxf.setVisibility(8);
      return;
      this.jwZ.setVisibility(8);
    }
    paramBoolean = com.tencent.mm.plugin.fts.a.d.Cx(this.bWm);
    boolean bool = com.tencent.mm.plugin.fts.a.d.Cy(this.bWm);
    if (paramInt > 0)
    {
      if ((paramBoolean) || (bool)) {
        this.jxg.setVisibility(0);
      }
      this.jxb.setVisibility(0);
    }
    for (;;)
    {
      if ((paramBoolean) || (bool)) {
        this.jxf.setVisibility(0);
      }
      this.jxa.setVisibility(0);
      if ((this.bWm == null) || (this.bWm.length() <= 0)) {
        break;
      }
      ((com.tencent.mm.plugin.websearch.api.e)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.websearch.api.e.class)).a(this.bWm, this.jxm);
      return;
      this.jxg.setVisibility(8);
      if ((paramBoolean) || (bool)) {
        this.jxb.setVisibility(0);
      } else {
        this.jxb.setVisibility(8);
      }
    }
  }
  
  protected final d a(e parame)
  {
    this.jxk = new j(parame, this.jsZ, this.jxl);
    return this.jxk;
  }
  
  public final void a(com.tencent.mm.plugin.fts.a.d.a.a parama) {}
  
  public final void a(boolean paramBoolean, String[] paramArrayOfString, long paramLong, int paramInt)
  {
    super.a(paramBoolean, paramArrayOfString, paramLong, paramInt);
    if (paramBoolean)
    {
      if ((paramArrayOfString != null) && (paramArrayOfString.length > 0)) {
        com.tencent.mm.plugin.fts.a.e.qf(1);
      }
      for (;;)
      {
        com.tencent.mm.bg.d.e(this, ".ui.voicesearch.VoiceSearchResultUI", new Intent().putExtra("VoiceSearchResultUI_Resultlist", paramArrayOfString).putExtra("VoiceSearchResultUI_VoiceId", paramLong).putExtra("VoiceSearchResultUI_ShowType", paramInt));
        return;
        com.tencent.mm.plugin.fts.a.e.qf(2);
      }
    }
    com.tencent.mm.plugin.fts.a.e.qf(4);
    com.tencent.mm.bg.d.e(this, ".ui.voicesearch.VoiceSearchResultUI", new Intent().putExtra("VoiceSearchResultUI_Resultlist", new String[0]).putExtra("VoiceSearchResultUI_Error", this.mController.tml.getString(n.g.search_contact_iap_err)).putExtra("VoiceSearchResultUI_VoiceId", paramLong).putExtra("VoiceSearchResultUI_ShowType", paramInt));
  }
  
  public final boolean a(boolean paramBoolean, float paramFloat1, float paramFloat2, int paramInt, double paramDouble1, double paramDouble2, double paramDouble3)
  {
    x.i("MicroMsg.FTS.FTSMainUI", "onGetLocation %b %f|%f", new Object[] { Boolean.valueOf(paramBoolean), Float.valueOf(paramFloat1), Float.valueOf(paramFloat2) });
    com.tencent.mm.modelgeo.c.OB().c(this);
    return false;
  }
  
  protected final void aQB()
  {
    switch (getIntent().getIntExtra("from_tab_index", -1))
    {
    default: 
      this.jsZ = 0;
      return;
    case 0: 
      this.jsZ = 1;
      return;
    case 1: 
      this.jsZ = 2;
      return;
    case 2: 
      this.jsZ = 3;
      return;
    }
    this.jsZ = 4;
  }
  
  protected final void aQD()
  {
    super.aQD();
    aQP();
    this.jwZ.setVisibility(8);
  }
  
  protected final void aQE()
  {
    super.aQE();
    aQP();
    this.jwZ.setVisibility(8);
    this.jwh.setVisibility(0);
    this.jwj.setVisibility(8);
  }
  
  protected final void aQF()
  {
    super.aQF();
    aQP();
    this.jwZ.setVisibility(8);
  }
  
  protected final void aQG()
  {
    super.aQG();
    aQO();
    this.jwZ.setVisibility(8);
  }
  
  protected final boolean aQH()
  {
    return w.chM();
  }
  
  protected final void aQI()
  {
    super.aQI();
    aQP();
    this.jwZ.setVisibility(8);
  }
  
  protected final void aQJ()
  {
    super.aQJ();
    aQO();
    this.jwZ.setVisibility(8);
  }
  
  protected final void aQK()
  {
    if (this.jwY != null) {
      this.jwY.setVisibility(0);
    }
  }
  
  protected final void aQL()
  {
    if (this.jwY != null) {
      this.jwY.setVisibility(8);
    }
  }
  
  protected final void aQy()
  {
    super.aQy();
    Object localObject = com.tencent.mm.pluginsdk.ui.d.j.a(this, f.a(getString(n.g.fts_on_search_network), "", com.tencent.mm.plugin.fts.a.a.d.b(this.bWm, this.bWm)).jrO, com.tencent.mm.bp.a.ad(this, n.b.NormalTextSize));
    this.jxd.setText((CharSequence)localObject);
    localObject = null;
    if (com.tencent.mm.plugin.fts.a.d.Cx(this.bWm)) {
      localObject = f.a(getString(n.g.fts_find_phone_qq_tip_prefix), "", com.tencent.mm.plugin.fts.a.a.d.b(this.bWm, this.bWm)).jrO;
    }
    for (;;)
    {
      localObject = com.tencent.mm.pluginsdk.ui.d.j.a(this, (CharSequence)localObject, com.tencent.mm.bp.a.ad(this, n.b.NormalTextSize));
      this.jxh.setText((CharSequence)localObject);
      return;
      if (com.tencent.mm.plugin.fts.a.d.Cy(this.bWm)) {
        localObject = f.a(getString(n.g.fts_find_wxid_tip_prefix), "", com.tencent.mm.plugin.fts.a.a.d.b(this.bWm, this.bWm)).jrO;
      }
    }
  }
  
  public final View ayg()
  {
    if (this.jwX == null)
    {
      this.jwX = ((LinearLayout)getLayoutInflater().inflate(n.e.fts_loading_footer, null));
      this.jxd = ((TextView)this.jwX.findViewById(n.d.search_network_tv));
      this.jxe = ((TextView)this.jwX.findViewById(n.d.fts_on_search_network_tv));
    }
    try
    {
      String str = r.PX("webSearchBar").optString("wording");
      x.i("MicroMsg.FTS.FTSMainUI", "set searchNetworkTips %s", new Object[] { str });
      this.jxe.setText(str);
      this.jxb = this.jwX.findViewById(n.d.search_network_divider);
      this.jxa = this.jwX.findViewById(n.d.search_network_layout);
      this.jxa.setOnClickListener(new FTSMainUI.8(this));
      this.jxc = new FTSLocalPageRelevantView(this);
      this.jxc.setOnRelevantClickListener(new FTSMainUI.9(this));
      int i = this.jwX.indexOfChild(this.jxa);
      if ((i >= 0) && (i < this.jwX.getChildCount())) {
        this.jwX.addView(this.jxc, i + 1);
      }
      this.jxh = ((TextView)this.jwX.findViewById(n.d.search_contact_tv));
      this.jxg = this.jwX.findViewById(n.d.search_contact_divider);
      this.jxf = this.jwX.findViewById(n.d.search_contact_layout);
      this.jxf.setOnClickListener(new FTSMainUI.10(this));
      this.jwY = ((LinearLayout)this.jwX.findViewById(n.d.footer_layout));
      return this.jwX;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  public void finish()
  {
    int i = 100;
    if (!this.mController.hideVKB()) {
      i = 0;
    }
    ah.i(new FTSMainUI.7(this), i);
  }
  
  protected final int getLayoutId()
  {
    return n.e.fts_main_ui;
  }
  
  public void onBackPressed()
  {
    finish();
  }
  
  public void onClickWxApp(View paramView)
  {
    if (paramView.getTag().equals("more-click"))
    {
      ((com.tencent.mm.plugin.appbrand.n.g)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.appbrand.n.g.class)).a(this, com.tencent.mm.plugin.fts.a.e.jqM, g.a.gsN);
      return;
    }
    if (paramView.getTag().equals("more-swipe"))
    {
      ((com.tencent.mm.plugin.appbrand.n.g)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.appbrand.n.g.class)).a(this, com.tencent.mm.plugin.fts.a.e.jqM, g.a.gsO);
      return;
    }
    ((com.tencent.mm.plugin.appbrand.n.g)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.appbrand.n.g.class)).a(this, (g.c)paramView.getTag(), com.tencent.mm.plugin.fts.a.e.jqM);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (Build.VERSION.SDK_INT >= 21)
    {
      paramBundle = TransitionInflater.from(this).inflateTransition(17760258);
      TransitionInflater.from(this).inflateTransition(17760258);
      paramBundle.excludeTarget(getWindow().getDecorView().findViewById(n.d.action_bar_container), true);
      paramBundle.excludeTarget(16908335, true);
      getWindow().setEnterTransition(paramBundle);
    }
    cqh();
    com.tencent.mm.plugin.fts.a.e.jqM = p.zK(3);
    paramBundle = String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", new Object[] { Integer.valueOf(this.jsZ), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), "", Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), "", Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), com.tencent.mm.plugin.fts.a.e.jqM, "" });
    x.d("MicroMsg.FTS.FTSReportLogic", "reportFTSEnterClick: %d, %s", new Object[] { Integer.valueOf(10991), paramBundle });
    h.mEJ.k(10991, paramBundle);
    this.jwW = ((FTSMainUIEducationLayout)findViewById(n.d.search_education_layout));
    this.jwZ = ((LinearLayout)findViewById(n.d.search_loading_view));
    this.jwW.setOnCellClickListener(this.jxn);
    this.jwW.setOnHotwordClickListener(new FTSMainUI.1(this));
    this.jwW.setNeedHotWord(false);
    com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.appbrand.widget.recentview.d.class);
    com.tencent.mm.modelgeo.c.OB().a(this, true);
    if (((n)com.tencent.mm.kernel.g.n(n.class)).getFTSImageLoader() == null)
    {
      finish();
      return;
    }
    ((n)com.tencent.mm.kernel.g.n(n.class)).getFTSImageLoader().aPO();
    r.zZ(3);
    com.tencent.mm.sdk.b.a.sFg.a(this.jxo);
  }
  
  protected void onDestroy()
  {
    com.tencent.mm.modelgeo.c.OB().c(this);
    if (((n)com.tencent.mm.kernel.g.n(n.class)).getFTSImageLoader() != null) {
      ((n)com.tencent.mm.kernel.g.n(n.class)).getFTSImageLoader().aPP();
    }
    com.tencent.mm.sdk.b.a.sFg.c(this.jxo);
    super.onDestroy();
  }
  
  protected void onResume()
  {
    super.onResume();
    Object localObject = new sh();
    ((sh)localObject).cdd.btC = 0L;
    com.tencent.mm.sdk.b.a.sFg.m((b)localObject);
    localObject = new Intent();
    ((Intent)localObject).setComponent(new ComponentName(e.i.thA, "com.tencent.mm.booter.MMReceivers$ToolsProcessReceiver"));
    ((Intent)localObject).putExtra("tools_process_action_code_key", "com.tencent.mm.intent.ACTION_START_TOOLS_PROCESS");
    sendBroadcast((Intent)localObject);
    if (this.jxa != null) {
      this.jxa.setEnabled(true);
    }
    if (!bi.oW(this.jxi))
    {
      this.bWm = this.jxi;
      this.jxi = null;
    }
    p.bSQ();
  }
  
  public final boolean pj(String paramString)
  {
    return super.pj(paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/fts/ui/FTSMainUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */