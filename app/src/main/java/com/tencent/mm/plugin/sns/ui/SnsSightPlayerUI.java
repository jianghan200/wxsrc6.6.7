package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnCreateContextMenuListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.ab.l;
import com.tencent.mm.g.a.px;
import com.tencent.mm.g.a.py;
import com.tencent.mm.g.a.rz;
import com.tencent.mm.model.ad;
import com.tencent.mm.model.d.a;
import com.tencent.mm.model.m;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.sns.a.b.c;
import com.tencent.mm.plugin.sns.a.b.h;
import com.tencent.mm.plugin.sns.a.b.j;
import com.tencent.mm.plugin.sns.a.b.j.a;
import com.tencent.mm.plugin.sns.a.b.j.b;
import com.tencent.mm.plugin.sns.a.b.j.c;
import com.tencent.mm.plugin.sns.a.b.j.d;
import com.tencent.mm.plugin.sns.a.b.j.e;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.i.c;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.an;
import com.tencent.mm.plugin.sns.model.b.b;
import com.tencent.mm.pluginsdk.ui.tools.VideoSightView;
import com.tencent.mm.pluginsdk.ui.tools.f.a;
import com.tencent.mm.protocal.c.ate;
import com.tencent.mm.protocal.c.brh;
import com.tencent.mm.protocal.c.bri;
import com.tencent.mm.protocal.c.bsu;
import com.tencent.mm.protocal.c.qc;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.av;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.ak;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.tools.k;
import com.tencent.mm.ui.widget.MMPinProgressBtn;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@com.tencent.mm.ui.base.a(3)
public class SnsSightPlayerUI
  extends MMActivity
  implements d.a, b.b
{
  private float aaZ = 0.0F;
  private float aba = 0.0F;
  private String bNH = "";
  private String bOX = "";
  private VelocityTracker cE;
  private ate caK = null;
  private int ccR = 0;
  public k contextMenuHelper;
  private boolean dDR = false;
  private String dXA = "";
  private int duration = 0;
  private com.tencent.mm.model.d gbl;
  private GestureDetector gbw;
  Bundle hDg;
  private boolean hDh = false;
  com.tencent.mm.ui.tools.f hDi;
  private int hDj = 0;
  private int hDk = 0;
  private int hDl = 0;
  private int hDm = 0;
  com.tencent.mm.pluginsdk.ui.tools.f hEl = null;
  n.d hqV = new SnsSightPlayerUI.6(this);
  private boolean huc = false;
  private int iYO = 0;
  private String imagePath = "";
  private TextView jcm = null;
  private boolean jcp = false;
  private ImageView jdG;
  private float nTE = 1.0F;
  private int nTF = 0;
  private int nTG = 0;
  private boolean nZf = false;
  private boolean nZh = false;
  private boolean nZi = false;
  private boolean nZj = false;
  private int ncW = 0;
  private TextView ndP = null;
  private boolean ndQ = false;
  ViewGroup ndZ;
  private int neh = 0;
  private int nei = 0;
  public int nep = 0;
  private boolean nkG = false;
  private h oaT = new h("SnsSightPlayerUI");
  private String oaU = "";
  private TextView oaV = null;
  private MMPinProgressBtn oaW = null;
  private com.tencent.mm.plugin.sns.storage.n oaX = null;
  private String oaY = "";
  private RelativeLayout oaZ;
  View.OnCreateContextMenuListener oba = new SnsSightPlayerUI.5(this);
  private int scene = 0;
  
  private void U(int paramInt, boolean paramBoolean)
  {
    if ((this.nei == 0) || (this.neh == 0))
    {
      localObject = getResources().getDisplayMetrics();
      this.nei = ((DisplayMetrics)localObject).heightPixels;
      this.neh = ((DisplayMetrics)localObject).widthPixels;
    }
    Object localObject = this.ndZ.getLayoutParams();
    RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)this.oaV.getLayoutParams();
    LinearLayout.LayoutParams localLayoutParams1 = new LinearLayout.LayoutParams(-1, -2);
    if (paramInt == 1)
    {
      localLayoutParams1.width = this.neh;
      localLayoutParams1.height = ((int)(this.neh * 1.0D * 240.0D / 320.0D));
      localLayoutParams.addRule(12, 0);
      localLayoutParams.addRule(1, 0);
      localLayoutParams.addRule(11, -1);
      localLayoutParams.addRule(3, this.ndZ.getId());
      findViewById(i.f.tips_tv).setVisibility(0);
    }
    for (;;)
    {
      x.i("MicroMsg.SnsSightPlayerUI", "orientation " + paramInt + " " + localLayoutParams1.width + " " + localLayoutParams1.height);
      ((View)this.hEl).setLayoutParams(localLayoutParams1);
      if ((this.hEl instanceof com.tencent.mm.plugin.sight.decode.a.a)) {
        ((com.tencent.mm.plugin.sight.decode.a.a)this.hEl).dt(localLayoutParams1.width, localLayoutParams1.height);
      }
      ((ViewGroup.LayoutParams)localObject).height = localLayoutParams1.height;
      ((ViewGroup.LayoutParams)localObject).width = localLayoutParams1.width;
      this.ndP.setLayoutParams(localLayoutParams);
      this.ndZ.setLayoutParams((ViewGroup.LayoutParams)localObject);
      ((View)this.hEl).requestLayout();
      if (!paramBoolean) {
        xy(paramInt);
      }
      return;
      localLayoutParams1.height = this.neh;
      localLayoutParams1.width = ((int)(this.neh * 1.0D * 320.0D / 240.0D));
      localLayoutParams.addRule(11, 0);
      localLayoutParams.addRule(3, 0);
      localLayoutParams.addRule(12, -1);
      localLayoutParams.addRule(1, this.ndZ.getId());
      findViewById(i.f.tips_tv).setVisibility(8);
    }
  }
  
  private void bAf()
  {
    x.i("MicroMsg.SnsSightPlayerUI", "snsSightplayui pauseplay");
    this.hEl.pause();
    this.hEl.onDetach();
    this.gbl.bv(false);
  }
  
  private void hL(boolean paramBoolean)
  {
    this.hEl.start();
    this.duration = this.hEl.getDuration();
    x.i("MicroMsg.SnsSightPlayerUI", "startplay get duration " + this.duration);
    this.gbl.a(this);
    com.tencent.mm.plugin.sns.a.b.a.a locala;
    if (paramBoolean)
    {
      locala = this.oaT.njs;
      if (getResources().getConfiguration().orientation != 2) {
        break label116;
      }
    }
    label116:
    for (int i = 2;; i = 1)
    {
      locala.nkt = i;
      this.oaT.njs.nku = bi.VG();
      this.oaT.njs.nks = 2;
      return;
    }
  }
  
  private void xy(int paramInt)
  {
    if (!this.nkG) {}
    while (!this.hEl.isPlaying()) {
      return;
    }
    if (this.duration == 0) {
      this.duration = this.hEl.getDuration();
    }
    this.oaT.wh(this.duration);
    this.oaT.njs.nku = bi.VG();
    com.tencent.mm.plugin.sns.a.b.a.a locala = this.oaT.njs;
    if (paramInt == 2) {}
    for (paramInt = 2;; paramInt = 1)
    {
      locala.nkt = paramInt;
      this.oaT.njs.nks = 2;
      x.i("MicroMsg.SnsSightPlayerUI", "duration " + this.duration + " orient " + this.oaT.njs.nkt);
      return;
    }
  }
  
  public final void LR(String paramString) {}
  
  public final void aS(String paramString, boolean paramBoolean) {}
  
  public final void aT(String paramString, boolean paramBoolean)
  {
    x.i("MicroMsg.SnsSightPlayerUI", "onSightFinish " + paramString);
    if ((this.nkG) && (!bi.oW(paramString)) && (this.caK != null) && (paramString.equals(this.caK.ksA)) && (FileOp.cn(this.dXA)))
    {
      this.oaT.njk = 1;
      this.hEl.setVideoPath(this.dXA);
      hL(true);
      if (this.oaW != null) {
        this.oaW.setVisibility(8);
      }
    }
  }
  
  public final void ayH()
  {
    int k = this.ndZ.getWidth();
    int j = this.ndZ.getHeight();
    int i = j;
    if (this.hDl != 0)
    {
      i = j;
      if (this.hDm != 0) {
        i = (int)(k / this.hDl * this.hDm);
      }
    }
    this.hDi.fh(k, i);
    this.hDi.u(this.hDk, this.hDj, this.hDl, this.hDm);
    if (this.nTE != 1.0D)
    {
      int m = ak.gs(this.mController.tml);
      this.hDi.uzR = (1.0F / this.nTE);
      if ((this.nTF != 0) || (this.nTG != 0))
      {
        j = (int)(this.ndZ.getWidth() / 2 * (1.0F - this.nTE));
        k = this.nTF;
        i = (int)((m + this.ndZ.getHeight()) / 2 - i / 2 * this.nTE + this.nTG);
        this.hDi.fi(j + k, i);
      }
    }
    this.hDi.a(this.ndZ, this.jdG, new SnsSightPlayerUI.4(this), null);
  }
  
  public final void bxb() {}
  
  public void finish()
  {
    if (!this.dDR)
    {
      super.finish();
      this.dDR = true;
    }
  }
  
  protected final int getForceOrientation()
  {
    return 7;
  }
  
  protected final int getLayoutId()
  {
    return i.g.sns_sight_player_ui;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (4097 == paramInt1)
    {
      Object localObject1;
      if (-1 == paramInt2)
      {
        localObject1 = paramIntent.getStringExtra("Select_Conv_User");
        String str1 = paramIntent.getStringExtra("custom_send_text");
        Iterator localIterator = bi.F(((String)localObject1).split(",")).iterator();
        String str2;
        label146:
        Object localObject3;
        bri localbri;
        label242:
        label262:
        label291:
        label458:
        do
        {
          if (!localIterator.hasNext()) {
            break label843;
          }
          str2 = (String)localIterator.next();
          if (this.scene == 0)
          {
            localObject1 = af.byo().Nl(this.bNH);
            if (localObject1 != null)
            {
              if (!com.tencent.mm.model.s.fq(str2)) {
                break;
              }
              localObject2 = new px();
              ((px)localObject2).caD.bSZ = i.g((com.tencent.mm.plugin.sns.storage.n)localObject1);
              ((px)localObject2).caD.bKW = ((com.tencent.mm.plugin.sns.storage.n)localObject1).bBe();
              com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject2);
            }
          }
          localObject2 = this.oaX.bAJ();
          if (!this.nkG) {
            break label696;
          }
          localObject3 = this.oaX.bAF();
          localbri = new bri();
          localbri.rBq = this.caK.oig;
          localbri.dyJ = this.caK.rVL;
          if (((bsu)localObject2).sqc.ruz != 15) {
            break label643;
          }
          localbri.dyP = this.oaX.bAH().ntU;
          localbri.dyQ = ((bsu)localObject2).ksA;
          if (!bi.oW(this.caK.rVP)) {
            break label672;
          }
          localObject1 = ((bsu)localObject2).spZ;
          localbri.dyL = ((String)localObject1);
          if (!bi.oW(this.caK.rVO)) {
            break label684;
          }
          localObject1 = this.caK.rVE;
          localbri.dyO = ((String)localObject1);
          if ((localObject3 != null) && (((com.tencent.mm.plugin.sns.storage.b)localObject3).nyL == 0))
          {
            localbri.dyN = ((com.tencent.mm.plugin.sns.storage.b)localObject3).nyN;
            localbri.dyM = ((com.tencent.mm.plugin.sns.storage.b)localObject3).nyM;
          }
          if (localObject3 != null) {
            localbri.dyN = ((com.tencent.mm.plugin.sns.storage.b)localObject3).nxZ;
          }
          i = i.LQ(this.dXA);
          x.i("MicroMsg.SnsSightPlayerUI", "send adsight to %s, videopath %s, thumbpath %s url: %s time: %d streamvideothumburl %s, duration: %s", new Object[] { str2, this.dXA, this.imagePath, this.caK.rVL, Integer.valueOf(this.caK.oig), localbri.dyO, Integer.valueOf(i) });
          com.tencent.mm.plugin.messenger.a.g.bcT().a(this, str2, this.dXA, this.imagePath, 43, i, localbri, ((bsu)localObject2).nNV);
          if (str1 != null) {
            com.tencent.mm.plugin.messenger.a.g.bcT().dF(str1, str2);
          }
          com.tencent.mm.ui.widget.snackbar.b.h(this, getString(i.j.has_send));
        } while (!this.nkG);
        localObject1 = new c(this.oaX.bBn(), 12, 5, "", 2, this.oaX.bAK());
        com.tencent.mm.kernel.g.Ek();
        com.tencent.mm.kernel.g.Eh().dpP.a((l)localObject1, 0);
        boolean bool = com.tencent.mm.model.s.fq(str2);
        Object localObject2 = j.d.nke;
        if (bool)
        {
          localObject1 = j.c.nkb;
          label561:
          localObject3 = j.e.nkl;
          if (!bool) {
            break label784;
          }
        }
        label643:
        label672:
        label684:
        label696:
        label784:
        for (int i = m.gK(str2);; i = 0)
        {
          j.a((j.d)localObject2, (j.c)localObject1, (j.e)localObject3, i, this.oaX);
          break;
          localObject2 = new py();
          ((py)localObject2).caE.bSZ = i.g((com.tencent.mm.plugin.sns.storage.n)localObject1);
          ((py)localObject2).caE.bKW = ((com.tencent.mm.plugin.sns.storage.n)localObject1).bBe();
          com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject2);
          break label146;
          localbri.dyP = ((bsu)localObject2).sqh.dyP;
          localbri.dyQ = ((bsu)localObject2).sqh.dyQ;
          break label242;
          localObject1 = this.caK.rVP;
          break label262;
          localObject1 = this.caK.rVO;
          break label291;
          i = i.LQ(this.dXA);
          x.i("MicroMsg.SnsSightPlayerUI", "send sight to %s, videopath %s, thumbpath %s, duration: %s", new Object[] { str2, this.dXA, this.imagePath, Integer.valueOf(i) });
          com.tencent.mm.plugin.messenger.a.g.bcT().a(this, str2, this.dXA, this.imagePath, 43, i, ((bsu)localObject2).nNV);
          break label458;
          localObject1 = j.c.nka;
          break label561;
        }
      }
      if (this.nkG)
      {
        localObject1 = new c(this.oaX.bBn(), 13, 5, "", 2, this.oaX.bAK());
        com.tencent.mm.kernel.g.Ek();
        com.tencent.mm.kernel.g.Eh().dpP.a((l)localObject1, 0);
      }
    }
    label843:
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public void onBackPressed()
  {
    ayH();
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    x.i("MicroMsg.SnsSightPlayerUI", "onConfigurationChanged " + paramConfiguration.orientation + " " + this.nep);
    if (this.nep == paramConfiguration.orientation) {
      return;
    }
    int i = paramConfiguration.orientation;
    U(paramConfiguration.orientation, false);
    this.nep = paramConfiguration.orientation;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    if (getIntent().getExtras() != null) {
      getIntent().getExtras().setClassLoader(getClass().getClassLoader());
    }
    this.scene = getIntent().getIntExtra("intent_from_scene", -1);
    long l = System.currentTimeMillis();
    super.onCreate(paramBundle);
    this.mController.hideTitleView();
    af.byj().a(this);
    if (Build.VERSION.SDK_INT >= 21) {
      getWindow().setStatusBarColor(getResources().getColor(i.c.black));
    }
    if (com.tencent.mm.compatible.util.d.fR(19))
    {
      getWindow().setFlags(201327616, 201327616);
      this.hDg = paramBundle;
      this.gbl = new com.tencent.mm.model.d();
      this.dXA = getIntent().getStringExtra("intent_videopath");
      this.imagePath = getIntent().getStringExtra("intent_thumbpath");
      this.bNH = getIntent().getStringExtra("intent_localid");
      this.nkG = getIntent().getBooleanExtra("intent_isad", false);
      this.oaX = af.byo().Nl(this.bNH);
      if (!this.nkG) {
        break label342;
      }
      if (this.oaX != null) {
        break label239;
      }
    }
    label239:
    Object localObject1;
    for (int i = 0;; i = 1)
    {
      if (i != 0) {
        break label342;
      }
      finish();
      return;
      getWindow().setFlags(1024, 1024);
      break;
      this.caK = ((ate)this.oaX.bAJ().sqc.ruA.get(0));
      paramBundle = an.s(af.getAccSnsPath(), this.caK.ksA);
      localObject1 = i.k(this.caK);
      this.oaY = (paramBundle + (String)localObject1);
      this.bOX = (paramBundle + i.e(this.caK));
    }
    label342:
    if (com.tencent.mm.p.a.vv() != null) {
      com.tencent.mm.p.a.vv().xv();
    }
    this.oaT.njm = bi.VG();
    this.oaZ = ((RelativeLayout)findViewById(i.f.content_root));
    this.oaZ.setOnTouchListener(new SnsSightPlayerUI.1(this));
    x.d("MicroMsg.SnsSightPlayerUI", com.tencent.mm.compatible.util.g.Ab() + " initView: fullpath:" + this.dXA + ", imagepath:" + this.imagePath);
    this.hDi = new com.tencent.mm.ui.tools.f(this.mController.tml);
    this.jdG = ((ImageView)findViewById(i.f.gallery_bg));
    this.jdG.setLayerType(2, null);
    this.ndP = ((TextView)findViewById(i.f.tips_tv));
    this.oaW = ((MMPinProgressBtn)findViewById(i.f.sight_downloading_pb));
    this.ndZ = ((ViewGroup)findViewById(i.f.video_container));
    this.hEl = com.tencent.mm.pluginsdk.ui.tools.o.fb(this.mController.tml);
    paramBundle = new LinearLayout.LayoutParams(-1, -2);
    this.jcm = ((TextView)findViewById(i.f.show_ad_sight));
    this.ndZ.addView((View)this.hEl, 0, paramBundle);
    this.oaV = ((TextView)findViewById(i.f.time_counter_tv));
    this.oaV.setText("");
    if (!this.nkG) {
      this.oaV.setVisibility(8);
    }
    if (this.nkG) {
      if (this.caK == null)
      {
        this.jcm.setVisibility(8);
        com.tencent.mm.pluginsdk.ui.tools.n.a(this.jcm, (VideoSightView)this.hEl);
        label657:
        this.hEl.setVideoCallback(new f.a()
        {
          public final int ck(int paramAnonymousInt1, int paramAnonymousInt2)
          {
            return 0;
          }
          
          public final void cl(int paramAnonymousInt1, int paramAnonymousInt2) {}
          
          public final void iy()
          {
            x.d("MicroMsg.SnsSightPlayerUI", com.tencent.mm.compatible.util.g.Ab() + " onPrepared");
            SnsSightPlayerUI.a(SnsSightPlayerUI.this, true);
          }
          
          public final void onError(int paramAnonymousInt1, int paramAnonymousInt2)
          {
            x.e("MicroMsg.SnsSightPlayerUI", "on play video error, what %d extra %d", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
            SnsSightPlayerUI.f(SnsSightPlayerUI.this).stop();
            if (SnsSightPlayerUI.g(SnsSightPlayerUI.this)) {
              return;
            }
            SnsSightPlayerUI.h(SnsSightPlayerUI.this);
            com.tencent.mm.sdk.a.b.A(Base64.encodeToString((com.tencent.mm.plugin.sight.base.d.bvD() + "[SnsSightPlayerUI] on play video error, what " + paramAnonymousInt1 + " extra " + paramAnonymousInt2 + ", path=" + bi.aG(SnsSightPlayerUI.c(SnsSightPlayerUI.this), "")).getBytes(), 2), "FullScreenPlaySight");
            String str = SnsSightPlayerUI.c(SnsSightPlayerUI.this);
            ah.A(new SnsSightPlayerUI.9.1(this, com.tencent.mm.ak.o.Pf().a(str, com.tencent.mm.bp.a.getDensity(SnsSightPlayerUI.this.mController.tml), SnsSightPlayerUI.this.mController.tml, -1), str));
          }
          
          public final void wd()
          {
            x.d("MicroMsg.SnsSightPlayerUI", "on completion");
            if (!SnsSightPlayerUI.i(SnsSightPlayerUI.this)) {
              SnsSightPlayerUI.j(SnsSightPlayerUI.this).post(new SnsSightPlayerUI.9.2(this));
            }
            SnsSightPlayerUI.f(SnsSightPlayerUI.this).setLoop(true);
            com.tencent.mm.plugin.sns.a.b.a.a locala = SnsSightPlayerUI.k(SnsSightPlayerUI.this).njs;
            locala.nkp += 1;
            SnsSightPlayerUI.a(SnsSightPlayerUI.this, false);
          }
        });
        findViewById(i.f.video_container).setOnClickListener(new SnsSightPlayerUI.10(this));
        ((View)this.hEl).setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            SnsSightPlayerUI.this.ayH();
          }
        });
        this.gbw = new GestureDetector(this.mController.tml, new SnsSightPlayerUI.12(this));
        ((View)this.hEl).setOnTouchListener(new SnsSightPlayerUI.13(this));
        if (!FileOp.cn(this.dXA)) {
          break label1267;
        }
        if (this.dXA != null)
        {
          this.hEl.stop();
          this.hEl.setVideoPath(this.dXA);
        }
        this.oaW.setVisibility(8);
      }
    }
    for (this.oaT.njk = 1;; this.oaT.njk = 0)
    {
      x.d("MicroMsg.SnsSightPlayerUI", System.currentTimeMillis() - l + " initView end");
      paramBundle = new rz();
      paramBundle.ccO.type = 1;
      com.tencent.mm.sdk.b.a.sFg.m(paramBundle);
      if (this.contextMenuHelper == null) {
        this.contextMenuHelper = new k(this.mController.tml);
      }
      this.contextMenuHelper.a((View)this.hEl, this.oba, this.hqV);
      ((View)this.hEl).post(new SnsSightPlayerUI.14(this));
      return;
      if (bi.oW(this.caK.rVL))
      {
        x.i("MicroMsg.SnsSightPlayerUI", "onCreate: there is no attachurl, show more info btn");
        paramBundle = this.oaX.bAJ();
        Object localObject2 = this.oaX.bAF();
        localObject1 = ((com.tencent.mm.plugin.sns.storage.b)localObject2).nyM;
        localObject2 = ((com.tencent.mm.plugin.sns.storage.b)localObject2).nyN;
        if ((!bi.oW((String)localObject1)) && (!bi.oW((String)localObject2)))
        {
          this.jcm.setVisibility(0);
          this.jcm.setText((CharSequence)localObject1);
          this.jcm.setOnClickListener(new SnsSightPlayerUI.7(this, paramBundle, (String)localObject2));
          break;
        }
        this.jcm.setVisibility(8);
        break;
      }
      localObject1 = getResources().getString(i.j.sns_ad_sight_full);
      paramBundle = (Bundle)localObject1;
      if (this.caK.oig / 60 > 0) {
        paramBundle = (String)localObject1 + getResources().getString(i.j.sns_ad_sight_full_m, new Object[] { Integer.valueOf(this.caK.oig / 60) });
      }
      localObject1 = paramBundle;
      if (this.caK.oig % 60 > 0) {
        localObject1 = paramBundle + getResources().getString(i.j.sns_ad_sight_full_s, new Object[] { Integer.valueOf(this.caK.oig % 60) });
      }
      paramBundle = (String)localObject1 + getResources().getString(i.j.sns_ad_sight_full_end);
      this.jcm.setText(paramBundle);
      this.jcm.setVisibility(0);
      this.jcm.setOnClickListener(new SnsSightPlayerUI.8(this));
      break;
      this.jcm.setVisibility(8);
      break label657;
      label1267:
      af.byj().a(this.caK, 6, null, av.tbu);
      this.oaW.setVisibility(0);
      this.oaW.cAt();
    }
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    Object localObject;
    int i;
    label40:
    int j;
    label143:
    boolean bool;
    if (this.nkG)
    {
      if (this.oaX == null)
      {
        localObject = "";
        String str = this.oaT.bwN();
        if (this.oaX != null) {
          break label430;
        }
        i = 0;
        long l2 = this.oaT.njl - this.oaT.egP;
        long l1 = l2;
        if (l2 < 0L)
        {
          x.e("MicroMsg.SnsSightPlayerUI", "reportVideo minus staytime found! totaltime[%d], offscreenTime[%ld]", new Object[] { Integer.valueOf(this.oaT.njl), Long.valueOf(this.oaT.egP) });
          l1 = this.oaT.njl;
        }
        int k = (int)l1;
        com.tencent.mm.kernel.g.Ek();
        com.tencent.mm.ab.o localo = com.tencent.mm.kernel.g.Eh().dpP;
        if (this.scene != 0) {
          break label441;
        }
        j = 1;
        localo.a(new com.tencent.mm.plugin.sns.a.b.d((String)localObject, j, 2, this.oaT.njl, null, null, 2, str, -1, i, k, k, 0), 0);
      }
    }
    else
    {
      x.d("MicroMsg.SnsSightPlayerUI", "on dismiss");
      if ((this.nkG) && (this.oaX != null) && (this.oaX.xb(32))) {
        j.a(j.b.njT, j.a.njO, this.oaX);
      }
      af.byj().b(this);
      localObject = com.tencent.mm.modelsns.b.p(getIntent());
      if (localObject != null)
      {
        if (!this.nkG) {
          break label452;
        }
        if (bi.oW(this.caK.rVL)) {
          break label446;
        }
        bool = true;
        label270:
        ((com.tencent.mm.modelsns.b)localObject).bP(bool);
      }
    }
    for (;;)
    {
      ((com.tencent.mm.modelsns.b)localObject).update();
      ((com.tencent.mm.modelsns.b)localObject).RD();
      if (com.tencent.mm.p.a.vv() != null) {
        com.tencent.mm.p.a.vv().xu();
      }
      if (this.hEl != null)
      {
        this.hEl.setVideoCallback(null);
        this.hEl.stop();
        this.hEl.onDetach();
      }
      if (!this.ndQ)
      {
        localObject = new rz();
        ((rz)localObject).ccO.type = 0;
        ((rz)localObject).ccO.ccP = this.ncW;
        ((rz)localObject).ccO.ccQ = this.iYO;
        ((rz)localObject).ccO.ccR = this.ccR;
        com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject);
      }
      this.gbl.bv(false);
      return;
      localObject = this.oaX.bBn();
      break;
      label430:
      i = this.oaX.bBq();
      break label40;
      label441:
      j = 2;
      break label143;
      label446:
      bool = false;
      break label270;
      label452:
      ((com.tencent.mm.modelsns.b)localObject).bP(false);
    }
  }
  
  public void onPause()
  {
    super.onPause();
    int i = getResources().getConfiguration().orientation;
    x.i("MicroMsg.SnsSightPlayerUI", "onpause  " + i);
    xy(i);
    if (!this.nZf)
    {
      bAf();
      x.v("check", "onclick");
      new ag().post(new SnsSightPlayerUI.2(this));
    }
    for (;;)
    {
      if (this.oaT != null) {
        this.oaT.egO = bi.VG();
      }
      return;
      bAf();
    }
  }
  
  protected void onResume()
  {
    super.onResume();
    if (!this.huc)
    {
      int i = getResources().getConfiguration().orientation;
      x.i("MicroMsg.SnsSightPlayerUI", "initOrientation " + i);
      if (getResources().getConfiguration().orientation == 2) {
        U(getResources().getConfiguration().orientation, true);
      }
      this.huc = true;
    }
    if ((this.nei == 0) || (this.neh == 0))
    {
      DisplayMetrics localDisplayMetrics = getResources().getDisplayMetrics();
      this.nei = localDisplayMetrics.heightPixels;
      this.neh = localDisplayMetrics.widthPixels;
    }
    if ((this.nZf) && (FileOp.cn(this.dXA)))
    {
      hL(false);
      this.nZf = false;
    }
    if (this.oaT != null) {
      this.oaT.onResume();
    }
  }
  
  public void onStart()
  {
    Bundle localBundle = this.hDg;
    if (!this.hDh)
    {
      this.hDh = true;
      if (Build.VERSION.SDK_INT >= 12)
      {
        this.hDj = getIntent().getIntExtra("img_gallery_top", 0);
        this.hDk = getIntent().getIntExtra("img_gallery_left", 0);
        this.hDl = getIntent().getIntExtra("img_gallery_width", 0);
        this.hDm = getIntent().getIntExtra("img_gallery_height", 0);
        this.hDi.u(this.hDk, this.hDj, this.hDl, this.hDm);
        if (localBundle == null) {
          this.ndZ.getViewTreeObserver().addOnPreDrawListener(new SnsSightPlayerUI.3(this));
        }
      }
    }
    super.onStart();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/SnsSightPlayerUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */