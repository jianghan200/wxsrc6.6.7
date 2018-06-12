package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.VelocityTracker;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.tencent.mm.g.a.px;
import com.tencent.mm.g.a.py;
import com.tencent.mm.g.a.rz;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.plugin.messenger.a.g;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.i.d;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.an;
import com.tencent.mm.plugin.sns.model.aq;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.plugin.webview.ui.tools.widget.m;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.protocal.c.ate;
import com.tencent.mm.protocal.c.bsu;
import com.tencent.mm.protocal.c.qc;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.ak;
import com.tencent.mm.ui.base.n.c;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.tools.f;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@com.tencent.mm.ui.base.a(3)
public class SnsOnlineVideoActivity
  extends MMActivity
{
  private float aaZ = 0.0F;
  private float aba = 0.0F;
  private String bNH;
  private String bOX;
  private VelocityTracker cE;
  private ate caK;
  private String dXA;
  private GestureDetector gbw;
  private Bundle hDg;
  private boolean hDh = false;
  private f hDi;
  private int hDj = 0;
  private int hDk = 0;
  private int hDl = 0;
  private int hDm = 0;
  private boolean hEj;
  n.d hqV = new SnsOnlineVideoActivity.3(this);
  private RelativeLayout jdF;
  private ImageView jdG;
  private boolean jdl = true;
  private boolean ldV;
  private com.tencent.mm.ui.widget.a.d nMS;
  private boolean nPn;
  private n nSE;
  private float nTE = 1.0F;
  private int nTF = 0;
  private int nTG = 0;
  private Button nTv;
  private OnlineVideoView nZe;
  private boolean nZf = false;
  private boolean nZg;
  private boolean nZh = false;
  private boolean nZi = false;
  private boolean nZj = false;
  n.c nZk = new SnsOnlineVideoActivity.2(this);
  private int scene = 0;
  
  private void ayJ()
  {
    if (this.nPn)
    {
      x.i("MicroMsg.SnsOnlineVideoActivity", "it is preview mode, don't register menu.");
      return;
    }
    this.nZe.setOnLongClickListener(new SnsOnlineVideoActivity.7(this));
  }
  
  private void bDF()
  {
    boolean bool = ak.gt(this);
    int i = ak.gs(this);
    if ((this.ldV) && (bool) && (this.nTv != null) && (this.nTv.getVisibility() == 0))
    {
      ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)this.nTv.getLayoutParams();
      localMarginLayoutParams.bottomMargin = (i + localMarginLayoutParams.bottomMargin);
      this.nTv.setLayoutParams(localMarginLayoutParams);
    }
  }
  
  public final void ayH()
  {
    if ((this.nTv != null) && (this.nTv.getVisibility() == 0)) {
      this.nTv.setVisibility(8);
    }
    int k = this.jdF.getWidth();
    int j = this.jdF.getHeight();
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
      this.hDi.uzR = (1.0F / this.nTE);
      if ((this.nTF != 0) || (this.nTG != 0))
      {
        j = (int)(this.jdF.getWidth() / 2 * (1.0F - this.nTE));
        k = this.nTF;
        i = (int)(this.jdF.getHeight() / 2 + this.nTG - i / 2 * this.nTE);
        this.hDi.fi(j + k, i);
      }
    }
    this.hDi.a(this.nZe, this.jdG, new SnsOnlineVideoActivity.11(this), null);
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0))
    {
      x.d("MicroMsg.SnsOnlineVideoActivity", "dispatchKeyEvent");
      ayH();
      return true;
    }
    return super.dispatchKeyEvent(paramKeyEvent);
  }
  
  protected final int getForceOrientation()
  {
    return 2;
  }
  
  protected final int getLayoutId()
  {
    return i.g.sns_video_ui;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    x.i("MicroMsg.SnsOnlineVideoActivity", "on activity result reqCode %d resultCode %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((4097 == paramInt1) && (-1 == paramInt2))
    {
      Object localObject1 = paramIntent.getStringExtra("Select_Conv_User");
      String str1 = paramIntent.getStringExtra("custom_send_text");
      Iterator localIterator = bi.F(((String)localObject1).split(",")).iterator();
      if (localIterator.hasNext())
      {
        String str2 = (String)localIterator.next();
        if (this.scene == 0)
        {
          localObject1 = af.byo().Nl(this.bNH);
          if (localObject1 != null)
          {
            if (!com.tencent.mm.model.s.fq(str2)) {
              break label344;
            }
            localObject2 = new px();
            ((px)localObject2).caD.bSZ = i.g((n)localObject1);
            ((px)localObject2).caD.bKW = ((n)localObject1).bBe();
            com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject2);
          }
        }
        label172:
        Object localObject2 = this.nSE.bAJ();
        int i = i.LQ(this.dXA);
        ate localate;
        if (bi.oW(this.bOX))
        {
          localate = this.caK;
          if (localate == null) {
            localObject1 = "";
          }
        }
        for (;;)
        {
          this.bOX = ((String)localObject1);
          x.i("MicroMsg.SnsOnlineVideoActivity", "send sight to %s, videopath %s, thumbpath %s url: %s time: %d, duration: %s", new Object[] { str2, this.dXA, this.bOX, this.caK.rVL, Integer.valueOf(this.caK.oig), Integer.valueOf(i) });
          g.bcT().a(this, str2, this.dXA, this.bOX, 43, i, ((bsu)localObject2).nNV);
          if (str1 != null) {
            g.bcT().dF(str1, str2);
          }
          com.tencent.mm.ui.widget.snackbar.b.h(this, getString(i.j.has_send));
          break;
          label344:
          localObject2 = new py();
          ((py)localObject2).caE.bSZ = i.g((n)localObject1);
          ((py)localObject2).caE.bKW = ((n)localObject1).bBe();
          com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject2);
          break label172;
          String str3 = an.s(af.getAccSnsPath(), localate.ksA);
          localObject1 = str3 + i.e(localate);
          boolean bool = FileOp.cn((String)localObject1);
          x.d("MicroMsg.SnsVideoLogic", "get sns video thumb path %s [%b]", new Object[] { localObject1, Boolean.valueOf(bool) });
          if (!bool)
          {
            localObject1 = str3 + i.n(localate);
            x.i("MicroMsg.SnsVideoLogic", "get sns video thumb path %s", new Object[] { localObject1 });
            continue;
            localObject1 = this.bOX;
          }
        }
      }
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    if (paramConfiguration.orientation == 1)
    {
      x.d("MicroMsg.SnsOnlineVideoActivity", "vertical orientation");
      bDF();
    }
    do
    {
      do
      {
        do
        {
          return;
        } while (paramConfiguration.orientation != 2);
        x.d("MicroMsg.SnsOnlineVideoActivity", "horizontal orientation");
      } while ((this.nTv == null) || (this.nTv.getVisibility() != 0));
      paramConfiguration = (ViewGroup.MarginLayoutParams)this.nTv.getLayoutParams();
    } while (paramConfiguration.bottomMargin == getResources().getDimensionPixelSize(i.d.sns_game_more_button_bottom_margin));
    paramConfiguration.bottomMargin = getResources().getDimensionPixelSize(i.d.sns_game_more_button_bottom_margin);
    this.nTv.setLayoutParams(paramConfiguration);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    if (getIntent().getExtras() != null) {
      getIntent().getExtras().setClassLoader(getClass().getClassLoader());
    }
    super.onCreate(paramBundle);
    this.mController.hideTitleView();
    try
    {
      if (com.tencent.mm.compatible.util.d.fR(19))
      {
        getWindow().setFlags(201327616, 201327616);
        this.ldV = true;
        getWindow().addFlags(128);
        this.hDg = paramBundle;
        this.bOX = getIntent().getStringExtra("intent_thumbpath");
        this.bNH = getIntent().getStringExtra("intent_localid");
        this.scene = getIntent().getIntExtra("intent_from_scene", -1);
        this.nPn = getIntent().getBooleanExtra("intent_ispreview", false);
        this.hEj = getIntent().getBooleanExtra("intent_ismute", false);
        paramBundle = getIntent().getStringExtra("intent_videopath");
        x.i("MicroMsg.SnsOnlineVideoActivity", "init data get intent info finish. thumbPath %s localId %s scene %d isPreView %b isMute %b videoPath %s", new Object[] { this.bOX, this.bNH, Integer.valueOf(this.scene), Boolean.valueOf(this.nPn), Boolean.valueOf(this.hEj), paramBundle });
        if (this.nPn) {
          break label613;
        }
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        try
        {
          this.nSE = af.byo().Nl(this.bNH);
          this.caK = ((ate)this.nSE.bAJ().sqc.ruA.get(0));
          this.dXA = (an.s(af.getAccSnsPath(), this.caK.ksA) + i.j(this.caK));
          x.i("MicroMsg.SnsOnlineVideoActivity", "init data finish, sns info local id %s ", new Object[] { this.nSE.bBe() });
          this.jdF = ((RelativeLayout)findViewById(i.f.video_ui_root));
          this.nZe = ((OnlineVideoView)findViewById(i.f.video_view));
          if (this.nPn) {
            break label621;
          }
          this.nZe.a(this.caK, this.nSE.bBe(), this.nSE.field_createTime);
          this.nZe.setMute(this.hEj);
          this.jdG = ((ImageView)findViewById(i.f.gallery_bg));
          this.jdG.setLayerType(2, null);
          this.jdF.setOnTouchListener(new SnsOnlineVideoActivity.1(this));
          this.gbw = new GestureDetector(this.mController.tml, new SnsOnlineVideoActivity.4(this));
          this.nZe.setOnTouchListener(new SnsOnlineVideoActivity.5(this));
          this.hDi = new f(this.mController.tml);
          paramBundle = this.nSE;
          if (paramBundle != null) {
            break label698;
          }
          x.i("MicroMsg.SnsOnlineVideoActivity", "snsInfo is null, return");
          ayJ();
          paramBundle = new rz();
          paramBundle.ccO.type = 1;
          com.tencent.mm.sdk.b.a.sFg.m(paramBundle);
          return;
          getWindow().setFlags(1024, 1024);
          this.ldV = false;
          continue;
          localException = localException;
          x.printErrStackTrace("MicroMsg.SnsOnlineVideoActivity", localException, "", new Object[0]);
        }
        catch (Exception paramBundle)
        {
          x.e("MicroMsg.SnsOnlineVideoActivity", "init data exception " + paramBundle.toString());
          continue;
        }
        label613:
        this.dXA = paramBundle;
        continue;
        label621:
        paramBundle = this.nZe;
        Object localObject1 = this.dXA;
        Object localObject2 = this.bOX;
        paramBundle.nPo = ((String)localObject1);
        paramBundle.nPn = true;
        paramBundle.jdj.setImageBitmap(BackwardSupportUtil.b.e((String)localObject2, 1.0F));
        x.i("MicroMsg.OnlineVideoView", "%d set preview video %s isPreview %b ", new Object[] { Integer.valueOf(paramBundle.hashCode()), localObject1, Boolean.valueOf(paramBundle.nPn) });
        continue;
        label698:
        this.nTv = ((Button)findViewById(i.f.game_more_button));
        localObject1 = paramBundle.bAJ();
        if (localObject1 != null) {}
        for (paramBundle = ((bsu)localObject1).nsB;; paramBundle = null)
        {
          localObject2 = new ay();
          ag.a(this, (ay)localObject2, ((bsu)localObject1).nsB);
          if (!((ay)localObject2).ofl) {
            break label805;
          }
          this.nTv.setVisibility(0);
          this.nTv.setText(((ay)localObject2).ofm);
          this.nTv.setOnClickListener(new SnsOnlineVideoActivity.6(this, paramBundle, (bsu)localObject1));
          if (getRequestedOrientation() == 0) {
            break;
          }
          bDF();
          break;
        }
        label805:
        this.nTv.setVisibility(8);
      }
    }
  }
  
  protected void onDestroy()
  {
    this.nZe.onDestroy();
    try
    {
      getWindow().clearFlags(128);
      super.onDestroy();
      if ((this.nSE != null) && (this.nSE.bAJ().sqc.ruA.size() > 0))
      {
        String str = ((ate)this.nSE.bAJ().sqc.ruA.get(0)).jPK;
        int i = this.nSE.bAJ().sqj;
        PInt localPInt = new PInt();
        t.a(aq.D((ate)this.nSE.bAJ().sqc.ruA.get(0)), localPInt, new PInt());
        int j = this.nZe.getPlayVideoDuration();
        h.mEJ.h(15534, new Object[] { str, this.nSE.bAJ().ksA, Integer.valueOf(i), Integer.valueOf(localPInt.value * 1000), Integer.valueOf(j * 1000) });
      }
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  protected void onPause()
  {
    if (Build.VERSION.SDK_INT >= 21) {
      getWindow().setFlags(2048, 2048);
    }
    this.nZe.onPause();
    if (!this.nZf)
    {
      x.d("MicroMsg.SnsOnlineVideoActivity", "close Popup");
      if (!this.nZg) {
        break label81;
      }
      new com.tencent.mm.sdk.platformtools.ag().postDelayed(new Runnable()
      {
        public final void run()
        {
          SnsOnlineVideoActivity.this.finish();
        }
      }, 500L);
    }
    for (;;)
    {
      super.onPause();
      m.Bk(2);
      return;
      label81:
      new com.tencent.mm.sdk.platformtools.ag().post(new SnsOnlineVideoActivity.9(this));
    }
  }
  
  protected void onResume()
  {
    if (Build.VERSION.SDK_INT >= 21) {
      getWindow().clearFlags(2048);
    }
    if (!this.jdl) {
      this.nZe.onResume();
    }
    this.jdl = false;
    if (this.nZf) {
      this.nZf = false;
    }
    super.onResume();
    m.Bk(1);
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
          this.nZe.getViewTreeObserver().addOnPreDrawListener(new SnsOnlineVideoActivity.10(this));
        }
      }
    }
    super.onStart();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */