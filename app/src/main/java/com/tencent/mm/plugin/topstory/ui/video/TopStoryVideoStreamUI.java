package com.tencent.mm.plugin.topstory.ui.video;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.v;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.topstory.ui.b.b;
import com.tencent.mm.plugin.topstory.ui.b.d;
import com.tencent.mm.plugin.topstory.ui.b.e;
import com.tencent.mm.plugin.topstory.ui.b.g;
import com.tencent.mm.protocal.c.bnq;
import com.tencent.mm.protocal.c.bth;
import com.tencent.mm.protocal.c.bti;
import com.tencent.mm.protocal.c.xe;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMFragmentActivity.a;
import com.tencent.mm.ui.base.FlowLayout;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class TopStoryVideoStreamUI
  extends MMActivity
  implements com.tencent.mm.plugin.topstory.a.c, a
{
  private boolean fYk = false;
  private com.tencent.mm.ui.base.o kXg;
  private ImageButton lAV;
  private View mTX;
  private LinearLayoutManager nCW;
  private RecyclerView oAC;
  private ViewGroup oAD;
  private View oAE;
  private TextView oAF;
  private ProgressDialog oAG;
  private f oAH;
  private l oAI;
  private boolean oAJ = false;
  private long oAK = -1L;
  private int oAL;
  private View oAM;
  private View oAN;
  private b oAO;
  private b.a oAP = new TopStoryVideoStreamUI.5(this);
  i oAQ;
  private e oAR;
  private o oAS;
  j oAT;
  private g oAU;
  private View oAV;
  private FlowLayout oAW;
  private List<Integer> oAX = new ArrayList();
  private bth oyK;
  
  private void bIf()
  {
    this.oAN.setVisibility(0);
    this.oAM.setVisibility(0);
    this.oAK = bi.VG();
    this.oAI.yh(this.oAI.oAr.size());
  }
  
  private void bIg()
  {
    this.oAN.setVisibility(0);
    this.oAM.setVisibility(0);
    this.oAI.yh(0);
  }
  
  public final void Ou(String paramString)
  {
    this.oAN.setVisibility(4);
    this.oAM.setVisibility(4);
    if (this.oAG != null)
    {
      this.oAG.dismiss();
      this.oAG = null;
    }
    if (!ao.isNetworkConnected(this))
    {
      Toast.makeText(this, getString(b.g.recommend_video_fetch_network_failed), 1).show();
      return;
    }
    if (!bi.oW(paramString))
    {
      Toast.makeText(this, paramString, 1).show();
      return;
    }
    Toast.makeText(this, getString(b.g.recommend_video_fetch_server_failed), 1).show();
  }
  
  public final void a(f paramf)
  {
    this.oAH = paramf;
    if ((this.oAQ.jMc) && (!this.oAI.oAu)) {
      bIf();
    }
  }
  
  public final RecyclerView bAt()
  {
    return this.oAC;
  }
  
  public final void bHK()
  {
    this.mTX.animate().alpha(0.1F).setDuration(200L).setStartDelay(3000L);
    if ((this.oyK.sqN != null) && (this.oAF != null)) {
      this.oAF.animate().alpha(0.1F).setDuration(200L).setStartDelay(3000L);
    }
  }
  
  public final void bHL()
  {
    this.mTX.animate().cancel();
    this.mTX.setAlpha(1.0F);
    if ((this.oyK.sqN != null) && (this.oAF != null)) {
      this.oAF.setAlpha(1.0F);
    }
  }
  
  public final void bHM()
  {
    this.oAN.setVisibility(4);
    this.oAM.setVisibility(4);
    if (this.oAG != null)
    {
      this.oAG.dismiss();
      this.oAG = null;
    }
    if (this.oAH != null)
    {
      this.oAH.bIb();
      this.oAH = null;
    }
  }
  
  public final boolean bHN()
  {
    return this.oAI.oAu;
  }
  
  public final List<bti> bHO()
  {
    return this.oAI.oAr;
  }
  
  public final int bHP()
  {
    return this.oAL;
  }
  
  public final i bHQ()
  {
    return this.oAQ;
  }
  
  public final e bHR()
  {
    return this.oAR;
  }
  
  public final o bHS()
  {
    return this.oAS;
  }
  
  public final bth bHT()
  {
    return this.oyK;
  }
  
  public final j bHU()
  {
    return this.oAT;
  }
  
  public final g bHV()
  {
    return this.oAU;
  }
  
  public final String bHW()
  {
    return com.tencent.mm.plugin.topstory.a.g.Os(this.oyK.sqA);
  }
  
  public final boolean bHX()
  {
    return bIh();
  }
  
  protected final boolean bIh()
  {
    return this.oyK.scene != 36;
  }
  
  public final MMActivity baA()
  {
    return this;
  }
  
  public final void dM(int paramInt1, int paramInt2)
  {
    if (((paramInt2 == 2) || (paramInt2 == 1)) && (this.oAJ)) {
      bIg();
    }
    Object localObject = this.oAQ;
    if (((i)localObject).jMc) {
      ((i)localObject).oAg.dN(paramInt1, paramInt2);
    }
    localObject = this.oAS;
    if (paramInt1 == 0) {
      if ((((o)localObject).oCg) && (((o)localObject).oCj))
      {
        ((o)localObject).oCj = false;
        ((o)localObject).bGR();
      }
    }
    for (;;)
    {
      if (!this.oAQ.jMc)
      {
        localObject = h.a(this);
        if (localObject != null) {
          ((com.tencent.mm.plugin.topstory.ui.a.c)localObject).oCJ.dN(paramInt1, paramInt2);
        }
      }
      return;
      if ((paramInt2 == 0) && (((o)localObject).oCg) && (((o)localObject).bIB()))
      {
        ((o)localObject).oCj = true;
        ((o)localObject).bAf();
      }
    }
  }
  
  public final int getForceOrientation()
  {
    if (this.oAQ.jMc) {
      return 0;
    }
    return 1;
  }
  
  protected final int getLayoutId()
  {
    return b.e.top_story_video_stream_ui;
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    k localk = k.oAn;
    if (paramInt1 == 1024) {
      if (paramInt2 == -1)
      {
        Toast.makeText(ad.getContext(), b.g.app_shared, 1).show();
        com.tencent.mm.plugin.topstory.a.h.a(bHT(), localk.oAo, "1", q.GF(), "");
      }
    }
    for (;;)
    {
      if ((paramInt1 == 10001) && (this.oAR.aEY()))
      {
        paramIntent = h.a(this);
        if (paramIntent != null) {
          paramIntent.iE(false);
        }
      }
      return;
      if ((paramInt1 == 2048) && (paramInt2 == -1))
      {
        Object localObject = paramIntent.getStringArrayListExtra("SendMsgUsernames");
        if ((localObject != null) && (((ArrayList)localObject).size() > 0))
        {
          paramIntent = new StringBuilder("");
          StringBuilder localStringBuilder = new StringBuilder("");
          localObject = ((ArrayList)localObject).iterator();
          if (((Iterator)localObject).hasNext())
          {
            String str = (String)((Iterator)localObject).next();
            if (com.tencent.mm.model.s.fq(str))
            {
              paramIntent.append(3);
              paramIntent.append(";");
            }
            for (;;)
            {
              localStringBuilder.append(str);
              localStringBuilder.append(";");
              break;
              paramIntent.append(2);
              paramIntent.append(";");
            }
          }
          com.tencent.mm.plugin.topstory.a.h.a(bHT(), localk.oAo, paramIntent.toString(), q.GF(), localStringBuilder.toString());
        }
      }
    }
  }
  
  public void onBackPressed()
  {
    if (this.oAQ.jMc)
    {
      this.oAQ.bId();
      return;
    }
    super.onBackPressed();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    ((com.tencent.mm.plugin.boots.a.c)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.boots.a.c.class)).ch(com.tencent.mm.plugin.boots.a.b.hjy, 885);
    paramBundle = getIntent().getByteArrayExtra("key_context");
    this.oyK = new bth();
    try
    {
      this.oyK.aG(paramBundle);
      ((com.tencent.mm.plugin.topstory.a.b)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.topstory.a.b.class)).onVideoListUICreate();
      this.oAU = new g();
      this.oAQ = new i();
      this.oAR = new e();
      this.oAR.ozW = this;
      this.oAS = new o();
      this.oAT = new j();
      if (!this.fYk)
      {
        this.oAO = new b(this);
        this.oAO.enable();
        this.oAO.ozK = this.oAP;
        this.fYk = true;
      }
      overridePendingTransition(MMFragmentActivity.a.tnC, MMFragmentActivity.a.tnD);
      if (getSupportActionBar() != null)
      {
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(0));
        getSupportActionBar().hide();
      }
      if (Build.VERSION.SDK_INT >= 21) {
        getWindow().setStatusBarColor(getResources().getColor(com.tencent.mm.plugin.topstory.ui.b.a.fts_recommend_video_list_bg_color));
      }
      paramBundle = this.oAQ;
      paramBundle.oAb = this;
      paramBundle.oAh = null;
      paramBundle.oAg = null;
      paramBundle.oAf = false;
      paramBundle.jMc = false;
      this.oAT.oAb = this;
      paramBundle = this.oAU;
      paramBundle.oAb = this;
      paramBundle.oAc = com.tencent.mm.plugin.topstory.a.g.Os(bHT().sqA);
      this.oAS.oAb = this;
      this.oAC = ((RecyclerView)findViewById(b.d.video_recycle_view));
      this.nCW = new com.tencent.mm.plugin.topstory.ui.a.b();
      this.oAI = new l(this, this.oyK);
      paramBundle = this.oAI;
      View localView1 = LayoutInflater.from(this).inflate(b.e.top_story_video_header, null);
      localView1.setClickable(false);
      localView1.setFocusableInTouchMode(false);
      localView1.setFocusable(false);
      localObject = localView1.findViewById(b.d.header_border_view);
      localView2 = localView1.findViewById(b.d.header_layout);
      if (this.oyK.sqN != null)
      {
        ((View)localObject).setVisibility(8);
        localView2.setVisibility(0);
        this.oAF = ((TextView)localView1.findViewById(b.d.header_title_tv));
        this.oAF.setText(this.oyK.sqN.title);
        localObject = (TextView)localView1.findViewById(b.d.sub_header_title_tv);
        if (!bi.oW(this.oyK.sqN.hwC))
        {
          ((TextView)localObject).setText(this.oyK.sqN.hwC);
          localView1.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
          paramBundle.addHeaderView(localView1);
          paramBundle = this.oAI;
          localView1 = LayoutInflater.from(this).inflate(b.e.top_story_video_list_loading_footer, null);
          localView1.setPadding(0, 0, 0, com.tencent.mm.bp.a.fl(this.mController.tml) * 2 / 5 - getResources().getDimensionPixelSize(b.b.top_story_video_list_header_height));
          localView1.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
          this.oAN = localView1.findViewById(b.d.footer_loading_tv);
          this.oAM = localView1.findViewById(b.d.footer_progress_bar);
          paramBundle.cW(localView1);
          this.oAC.setAdapter(this.oAI);
          this.oAC.setLayoutManager(this.nCW);
          this.oAC.setItemAnimator(new v());
          this.oAC.a(new TopStoryVideoStreamUI.1(this));
          this.mTX = findViewById(b.d.title_container);
          this.oAE = findViewById(b.d.title_tv);
          if (this.oyK.sqN != null) {
            this.oAE.setVisibility(8);
          }
          this.oAT.oAl = 2;
          this.oAD = ((ViewGroup)findViewById(b.d.fullscreen_holder));
          this.oAQ.oAh = this.oAD;
          this.lAV = ((ImageButton)findViewById(b.d.back_btn));
          this.lAV.getDrawable().setColorFilter(getResources().getColor(com.tencent.mm.plugin.topstory.ui.b.a.white), PorterDuff.Mode.SRC_ATOP);
          this.lAV.setOnClickListener(new TopStoryVideoStreamUI.2(this));
          if (!bIh()) {
            break label952;
          }
          if (!this.oAR.isConnected()) {
            break label933;
          }
          bIg();
          this.oAJ = false;
          if ((this.oyK.scene != 21) && (this.oyK.sqN == null)) {
            this.oAG = com.tencent.mm.ui.base.h.a(this, getString(b.g.loading_tips), true, new DialogInterface.OnCancelListener()
            {
              public final void onCancel(DialogInterface paramAnonymousDialogInterface)
              {
                TopStoryVideoStreamUI.this.finish();
              }
            });
          }
          this.oAI.oAs = true;
          if (this.oyK.sqP) {
            this.oAR.ozV = true;
          }
          this.oAC.post(new TopStoryVideoStreamUI.4(this));
          com.tencent.mm.plugin.websearch.api.a.a.kB(13);
          return;
        }
      }
    }
    catch (IOException paramBundle)
    {
      for (;;)
      {
        Object localObject;
        View localView2;
        finish();
        continue;
        ((TextView)localObject).setVisibility(8);
        continue;
        ((View)localObject).setVisibility(0);
        localView2.setVisibility(8);
        continue;
        label933:
        Toast.makeText(this, b.g.recommend_video_init_not_network_failed_hint, 1).show();
        this.oAJ = true;
        continue;
        label952:
        this.oAN.setVisibility(4);
        this.oAM.setVisibility(4);
      }
    }
  }
  
  protected void onDestroy()
  {
    Object localObject = this.oyK;
    long l = cql();
    if (l > 0L)
    {
      localObject = String.format("%s,%s,%s,%s", new Object[] { Integer.valueOf(((bth)localObject).scene), Long.valueOf(l), Long.valueOf(((bth)localObject).sqL), Integer.valueOf(3) });
      x.i("MicroMsg.TopStory.TopStoryReportApiLogic", "reportTopStoryVideoPageBrowseTime 15018 %s", new Object[] { localObject });
      com.tencent.mm.plugin.report.service.h.mEJ.k(15018, (String)localObject);
    }
    if (this.oAI != null)
    {
      localObject = this.oAI;
      com.tencent.mm.kernel.g.DF().b(1943, ((l)localObject).dKj);
    }
    if (this.fYk)
    {
      this.oAO.disable();
      this.oAO.ozK = null;
      this.oAO = null;
    }
    ((com.tencent.mm.plugin.topstory.a.b)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.topstory.a.b.class)).onVideoListUIDestroy(this.oyK);
    localObject = this.oAS;
    if (((o)localObject).oCd != null)
    {
      ((o)localObject).stopPlay();
      ((o)localObject).oCd.ajZ();
    }
    ((o)localObject).oAb = null;
    localObject = this.oAQ;
    ((i)localObject).oAb = null;
    ((i)localObject).oAh = null;
    ((i)localObject).oAg = null;
    ((i)localObject).oAf = false;
    ((i)localObject).jMc = false;
    localObject = this.oAR;
    com.tencent.mm.kernel.g.Eh().b(((e)localObject).hKh);
    ((e)localObject).ozW = null;
    ((e)localObject).ozX = 0;
    ((e)localObject).ozV = false;
    localObject = this.oAT;
    ((j)localObject).bIe();
    ((j)localObject).oAb = null;
    localObject = this.oAU;
    ((g)localObject).oAd.clear();
    com.tencent.mm.sdk.f.e.post(new g.a((g)localObject, ((g)localObject).oAc), "TopStory.DeleteVideoCacheTask");
    ((g)localObject).oAb = null;
    com.tencent.mm.plugin.websearch.api.a.a.kB(16);
    super.onDestroy();
  }
  
  public void onFeedBackItemClick(View paramView)
  {
    bti localbti = (bti)paramView.getTag();
    Object localObject;
    if (this.kXg == null)
    {
      localObject = LayoutInflater.from(this).inflate(b.e.top_story_feedback_layout, null);
      this.kXg = new com.tencent.mm.ui.base.o((View)localObject, com.tencent.mm.bp.a.fk(this), -2);
      this.kXg.setFocusable(true);
      this.oAW = ((FlowLayout)((View)localObject).findViewById(b.d.fb_content_fl));
      this.oAV = ((View)localObject).findViewById(b.d.disincline_btn);
      this.oAV.setOnClickListener(new TopStoryVideoStreamUI.6(this));
    }
    this.oAV.setTag(localbti);
    this.oAX.clear();
    this.oAW.removeAllViews();
    int i = 0;
    while (i < localbti.sre.size())
    {
      localObject = (xe)localbti.sre.get(i);
      View localView = LayoutInflater.from(this).inflate(b.e.top_story_feedback_content_item, this.oAW, false);
      CheckBox localCheckBox = (CheckBox)localView.findViewById(b.d.item_cb);
      localCheckBox.setTag(Integer.valueOf(i));
      localCheckBox.setText(((xe)localObject).bSc);
      localCheckBox.setOnCheckedChangeListener(new TopStoryVideoStreamUI.7(this));
      this.oAW.addView(localView);
      i += 1;
    }
    this.kXg.showAsDropDown(paramView, 0, 0);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 25) && (paramKeyEvent.getAction() == 0)) {
      if (this.oAQ.jMc) {
        this.oAQ.oAg.bIu();
      }
    }
    for (;;)
    {
      return super.onKeyDown(paramInt, paramKeyEvent);
      com.tencent.mm.plugin.topstory.ui.a.c localc = h.b(this);
      if ((localc != null) && (localc.oCJ != null))
      {
        localc.oCJ.bIu();
        continue;
        if ((paramInt == 24) && (paramKeyEvent.getAction() == 0)) {
          if (this.oAQ.jMc)
          {
            this.oAQ.oAg.setMute(false);
          }
          else
          {
            localc = h.b(this);
            if ((localc != null) && (localc.oCJ != null)) {
              localc.oCJ.setMute(false);
            }
          }
        }
      }
    }
  }
  
  protected void onPause()
  {
    super.onPause();
    o localo = this.oAS;
    if (localo.oCd != null) {
      localo.oCd.SL();
    }
    ((com.tencent.mm.plugin.topstory.a.b)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.topstory.a.b.class)).onVideoListUIPause();
    com.tencent.mm.plugin.websearch.api.a.a.kB(15);
  }
  
  protected void onResume()
  {
    super.onResume();
    ((com.tencent.mm.plugin.topstory.a.b)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.topstory.a.b.class)).onVideoListUIResume();
    Object localObject = this.oAS;
    if (((o)localObject).oCd != null)
    {
      ((o)localObject).oCd.SM();
      if (((o)localObject).oCe != null) {
        ((o)localObject).oCe.bIq();
      }
    }
    localObject = this.oAQ;
    if (((i)localObject).jMc) {
      ((i)localObject).bIc();
    }
    this.oAR.ozX = e.bIa();
    com.tencent.mm.plugin.websearch.api.a.a.kB(14);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public final void ye(int paramInt)
  {
    x.i("MicroMsg.TopStory.TopStoryVideoStreamUI", "tryToPlayPositionVideo %d", new Object[] { Integer.valueOf(paramInt) });
    this.oAC.smoothScrollToPosition(this.oAI.oAp.size() + paramInt);
  }
  
  public final void yf(int paramInt)
  {
    x.i("MicroMsg.TopStory.TopStoryVideoStreamUI", "selectPosition %d", new Object[] { Integer.valueOf(paramInt) });
    this.nCW.Q(this.oAI.oAp.size() + paramInt, 0);
  }
  
  public final void yg(int paramInt)
  {
    this.oAL = paramInt;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/topstory/ui/video/TopStoryVideoStreamUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */