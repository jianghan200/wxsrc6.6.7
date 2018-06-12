package com.tencent.mm.pluginsdk.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.plugin.ae.a.a;
import com.tencent.mm.plugin.ae.a.b;
import com.tencent.mm.plugin.sight.decode.ui.b;
import com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar;
import com.tencent.mm.pluginsdk.ui.tools.f.a;
import com.tencent.mm.pluginsdk.ui.tools.f.b;
import com.tencent.mm.pluginsdk.ui.tools.f.c;
import com.tencent.mm.pluginsdk.ui.tools.f.d;
import com.tencent.mm.pluginsdk.ui.tools.f.e;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.al.a;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public abstract class AbstractVideoView
  extends RelativeLayout
  implements h, f.a, f.b, f.c, f.d, f.e
{
  private boolean Fd = false;
  public String TAG = "MicroMsg.AbstractVideoView";
  private int aBN = 0;
  protected ag dvh = new ag(Looper.getMainLooper());
  public h.b gbe;
  public com.tencent.mm.pluginsdk.ui.tools.f hEl;
  protected TextView hSJ;
  protected ImageView iYZ;
  protected ProgressBar jfO;
  public Context mContext;
  protected TextView nPr;
  private View.OnClickListener qEA = new View.OnClickListener()
  {
    public final void onClick(View paramAnonymousView)
    {
      x.i(AbstractVideoView.this.TAG, "%s seek bar play button on click ", new Object[] { AbstractVideoView.this.avy() });
      paramAnonymousView = AbstractVideoView.this;
      if (paramAnonymousView.hEl != null)
      {
        if (paramAnonymousView.isPlaying()) {
          paramAnonymousView.pause();
        }
      }
      else {
        return;
      }
      if (bi.oW(paramAnonymousView.hEl.getVideoPath()))
      {
        paramAnonymousView.start();
        return;
      }
      paramAnonymousView.play();
    }
  };
  private h.c qEB = null;
  protected k qEC = new k();
  public boolean qEh = true;
  protected RelativeLayout qEi;
  protected LinearLayout qEj;
  protected VideoPlayerSeekBar qEk;
  protected g qEl;
  protected boolean qEm;
  protected boolean qEn = true;
  public int qEo = 0;
  public boolean qEp = false;
  public int qEq = 0;
  public boolean qEr = true;
  public int qEs = -1;
  public boolean qEt = false;
  public long qEu = 0L;
  public int qEv = 0;
  protected al qEw = new al(new AbstractVideoView.1(this), true);
  protected al qEx = new al(new al.a()
  {
    public final boolean vD()
    {
      boolean bool = AbstractVideoView.this.isPlaying();
      int i = AbstractVideoView.this.getCurrPosMs();
      x.i(AbstractVideoView.this.TAG, "%s prepare start checker isplaying[%b] currPosMs[%d]", new Object[] { AbstractVideoView.this.avy(), Boolean.valueOf(bool), Integer.valueOf(i) });
      if ((AbstractVideoView.this.hEl != null) && (i <= 50)) {
        AbstractVideoView.this.hEl.x(0.0D);
      }
      return false;
    }
  }, false);
  protected al qEy = new al(new AbstractVideoView.5(this), true);
  private b qEz = new AbstractVideoView.6(this);
  
  public AbstractVideoView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public AbstractVideoView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public AbstractVideoView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.mContext = paramContext;
    initView();
  }
  
  private void jQ(boolean paramBoolean)
  {
    this.qEl.jQ(paramBoolean);
  }
  
  private void setVideoTotalTime(int paramInt)
  {
    if ((this.qEl != null) && (this.qEl.getVideoTotalTime() != paramInt)) {
      this.qEl.setVideoTotalTime(paramInt);
    }
  }
  
  public void SL()
  {
    x.i(this.TAG, "%s onUIPause %s", new Object[] { avy(), bi.cjd() });
    this.qEo = getCurrPosSec();
    this.qEp = isPlaying();
    this.qEv = 0;
    this.qEu = 0L;
    pause();
    SO();
    this.qEh = false;
    bQ(getReportIdkey() + 11);
  }
  
  public void SM()
  {
    x.i(this.TAG, "%s onUIResume %s", new Object[] { avy(), bi.cjd() });
    this.qEh = true;
    bQ(getReportIdkey() + 10);
  }
  
  public void SO()
  {
    this.qEw.SO();
    this.qEx.SO();
  }
  
  public void SP()
  {
    x.i(this.TAG, "%s on surface available", new Object[] { avy() });
    bS(false);
  }
  
  protected final void Tv(String paramString)
  {
    this.qEC.url = paramString;
  }
  
  public final void aYM()
  {
    x.d(this.TAG, "%s hide loading %s", new Object[] { avy(), bi.cjd() });
    this.dvh.post(new Runnable()
    {
      public final void run()
      {
        if ((AbstractVideoView.this.jfO != null) && (AbstractVideoView.this.jfO.getVisibility() != 8))
        {
          x.i(AbstractVideoView.this.TAG, "%s hide loading", new Object[] { AbstractVideoView.this.avy() });
          AbstractVideoView.this.jfO.setVisibility(8);
          if (AbstractVideoView.this.gbe != null) {
            AbstractVideoView.this.gbe.bz(AbstractVideoView.this.getSessionId(), AbstractVideoView.this.getMediaId());
          }
        }
      }
    });
  }
  
  public final void ajY()
  {
    this.qEj.removeView((View)this.qEl);
  }
  
  public void ajZ()
  {
    x.i(this.TAG, "%s onUIDestroy", new Object[] { avy() });
    stop();
    this.dvh.removeCallbacksAndMessages(null);
    SO();
    this.qEy.SO();
    bQ(getReportIdkey() + 12);
  }
  
  public final void aoi()
  {
    this.dvh.post(new AbstractVideoView.8(this));
  }
  
  public final String avy()
  {
    return hashCode();
  }
  
  public final void bCy()
  {
    if (this.qEC.qGw == 0L) {
      this.qEC.qGw = bi.VF();
    }
  }
  
  public boolean bIj()
  {
    return true;
  }
  
  public final void bQ(long paramLong)
  {
    if (this.qEB != null) {
      this.qEB.bQ(paramLong);
    }
  }
  
  public void bR(boolean paramBoolean)
  {
    x.i(this.TAG, "%s on seek complete startPlay[%b]", new Object[] { avy(), Boolean.valueOf(paramBoolean) });
    if (this.hEl != null) {
      this.hEl.setOneTimeVideoTextureUpdateCallback(this);
    }
    aYM();
    jQ(paramBoolean);
    mH(getCurrPosSec());
    if (paramBoolean)
    {
      bS(false);
      this.qEp = false;
      if (this.gbe != null) {
        this.gbe.bx(getSessionId(), getMediaId());
      }
    }
  }
  
  public void bS(boolean paramBoolean)
  {
    x.d(this.TAG, "%s start timer rightNow[%b]", new Object[] { avy(), Boolean.valueOf(paramBoolean) });
    this.qEw.J(500L, 500L);
  }
  
  public com.tencent.mm.pluginsdk.ui.tools.f bT(Context paramContext)
  {
    return null;
  }
  
  public final void bfs()
  {
    x.i(this.TAG, "%s onTextureUpdate ", new Object[] { avy() });
    aYM();
  }
  
  public final void ccU()
  {
    if (this.qEC.nPP == 0L) {
      this.qEC.nPP = bi.VF();
    }
  }
  
  public final void ccV()
  {
    this.qEC.qGz = bi.VF();
  }
  
  public final void ccW()
  {
    this.qEC.qGA = bi.VF();
    if (this.qEC.qGz > 0L)
    {
      k localk = this.qEC;
      localk.qGB += this.qEC.qGA - this.qEC.qGz;
    }
  }
  
  public final void ccX()
  {
    k localk = this.qEC;
    localk.blockCount += 1;
  }
  
  public final void ccY()
  {
    int k;
    int j;
    int i;
    if ((this.qEC.qGA > 0L) && (this.qEC.qGz > 0L))
    {
      k = (int)((this.qEC.qGA - this.qEC.qGz) / 1000L);
      if (!ao.isWifi(this.mContext)) {
        break label146;
      }
      j = 70;
      i = 74;
    }
    for (;;)
    {
      int m = getReportIdkey();
      int n = getReportIdkey();
      i = bi.f((Integer)com.tencent.mm.plugin.report.f.a(k, new int[] { 1, 2, 3, 4 }, j + m, i + n));
      x.d(this.TAG, "%s rptResumeTime [%d]", new Object[] { avy(), Integer.valueOf(i) });
      bQ(i);
      label146:
      do
      {
        return;
        if (ao.is4G(this.mContext))
        {
          j = 75;
          i = 79;
          break;
        }
        if (ao.is3G(this.mContext))
        {
          j = 80;
          i = 84;
          break;
        }
      } while (!ao.is2G(this.mContext));
      j = 85;
      i = 89;
    }
  }
  
  public final int ck(int paramInt1, int paramInt2)
  {
    return 0;
  }
  
  public final void cl(int paramInt1, int paramInt2)
  {
    x.i(this.TAG, "%s on get video size [%d, %d]", new Object[] { avy(), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (this.gbe != null) {
      this.gbe.d(getSessionId(), getMediaId(), paramInt1, paramInt2);
    }
    bQ(getReportIdkey() + 8);
  }
  
  public int getCacheTimeSec()
  {
    return 0;
  }
  
  public int getCurrPosMs()
  {
    if (this.hEl != null) {
      return this.hEl.getCurrentPosition();
    }
    return 0;
  }
  
  public int getCurrPosSec()
  {
    if (this.hEl != null) {
      return Math.round(this.hEl.getCurrentPosition() * 1.0F / 1000.0F);
    }
    return 0;
  }
  
  public String getMediaId()
  {
    return "";
  }
  
  public int getPlayerType()
  {
    return this.qEq;
  }
  
  public abstract int getReportIdkey();
  
  public String getSessionId()
  {
    return "";
  }
  
  public int getVideoDurationSec()
  {
    if (this.hEl != null) {
      return Math.round(this.hEl.getDuration() * 1.0F / 1000.0F);
    }
    return -1;
  }
  
  public void initView()
  {
    x.i(this.TAG, "%s init view ", new Object[] { avy() });
    LayoutInflater.from(this.mContext).inflate(a.b.comm_video_view, this);
    this.iYZ = ((ImageView)findViewById(a.a.video_thumb));
    this.qEi = ((RelativeLayout)findViewById(a.a.video_root));
    this.nPr = ((TextView)findViewById(a.a.video_duration));
    this.jfO = ((ProgressBar)findViewById(a.a.video_loading));
    this.hSJ = ((TextView)findViewById(a.a.video_tips));
    this.qEj = ((LinearLayout)findViewById(a.a.video_footer_root));
    Object localObject = (VideoPlayerSeekBar)findViewById(a.a.video_player_seek_bar);
    this.qEk = ((VideoPlayerSeekBar)localObject);
    this.qEl = ((g)localObject);
    this.qEk.setIplaySeekCallback(this.qEz);
    this.qEk.setOnClickListener(this.qEA);
    this.hEl = bT(this.mContext);
    this.hEl.setVideoCallback(this);
    this.hEl.setOnSeekCompleteCallback(this);
    this.hEl.setOnInfoCallback(this);
    this.hEl.setOnSurfaceCallback(this);
    localObject = new RelativeLayout.LayoutParams(-1, -2);
    ((RelativeLayout.LayoutParams)localObject).addRule(13);
    this.qEi.addView((View)this.hEl, (ViewGroup.LayoutParams)localObject);
  }
  
  public boolean isPlaying()
  {
    boolean bool = false;
    if (this.hEl != null) {
      bool = this.hEl.isPlaying();
    }
    return bool;
  }
  
  public final boolean isPrepared()
  {
    boolean bool;
    if (this.hEl != null) {
      if ((!bi.oW(this.hEl.getVideoPath())) && (this.Fd)) {
        bool = true;
      }
    }
    for (;;)
    {
      x.d(this.TAG, "%s is prepared [%b] isPrepared[%b]", new Object[] { avy(), Boolean.valueOf(bool), Boolean.valueOf(this.Fd) });
      return bool;
      bool = false;
      continue;
      bool = false;
    }
  }
  
  public final void iy()
  {
    x.i(this.TAG, "%s onPrepared startWhenPrepared[%b] seekTimeWhenPrepared[%d] isPrepared[%b]", new Object[] { avy(), Boolean.valueOf(this.qEr), Integer.valueOf(this.qEs), Boolean.valueOf(this.Fd) });
    this.Fd = true;
    if (this.hEl != null) {
      this.hEl.setOneTimeVideoTextureUpdateCallback(this);
    }
    setVideoTotalTime(getVideoDurationSec());
    int i;
    int k;
    int j;
    if (this.qEr) {
      if (this.qEs < 0)
      {
        if ((play()) && (bIj())) {
          this.qEx.J(1000L, 1000L);
        }
        this.qEs = -1;
        this.qEr = true;
        this.qEv = 0;
        this.qEu = 0L;
        if (this.gbe != null) {
          this.gbe.bu(getSessionId(), getMediaId());
        }
        if (this.aBN > 0)
        {
          x.d(this.TAG, "%s start error check timer", new Object[] { avy() });
          this.qEy.J(5000L, 5000L);
        }
        bQ(getReportIdkey() + 2);
        if (this.qEC.qGx == 0L) {
          this.qEC.qGx = bi.VF();
        }
        i = getVideoDurationSec();
        this.qEC.duration = i;
        if ((this.qEC.qGw > 0L) && (this.qEC.qGx > 0L))
        {
          k = (int)((this.qEC.qGx - this.qEC.qGw) / 1000L);
          if (!ao.isWifi(this.mContext)) {
            break label460;
          }
          j = 20;
          i = 24;
        }
      }
    }
    for (;;)
    {
      label314:
      int m = getReportIdkey();
      int n = getReportIdkey();
      i = bi.f((Integer)com.tencent.mm.plugin.report.f.a(k, new int[] { 1, 2, 3, 4 }, j + m, i + n));
      x.d(this.TAG, "%s rptFirstPlayTime [%d]", new Object[] { avy(), Integer.valueOf(i) });
      bQ(i);
      label460:
      do
      {
        return;
        if (!ajG())
        {
          x(this.qEs, this.qEr);
          break;
        }
        play();
        break;
        if (this.qEs < 0) {}
        for (i = 0;; i = this.qEs)
        {
          x(i, this.qEr);
          break;
        }
        if (ao.is4G(this.mContext))
        {
          j = 25;
          i = 29;
          break label314;
        }
        if (ao.is3G(this.mContext))
        {
          j = 30;
          i = 34;
          break label314;
        }
      } while (!ao.is2G(this.mContext));
      j = 35;
      i = 39;
    }
  }
  
  public final boolean kW(int paramInt)
  {
    return x(paramInt, isPlaying());
  }
  
  public final void mH(int paramInt)
  {
    this.qEl.wQ(paramInt);
  }
  
  public void onError(int paramInt1, int paramInt2)
  {
    x.w(this.TAG, "%s onError info [%d %d] errorCount[%d]", new Object[] { avy(), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(this.aBN) });
    bQ(getReportIdkey() + 90);
    this.aBN += 1;
    if (this.aBN > 5)
    {
      bQ(getReportIdkey() + 92);
      this.qEC.qGC = paramInt1;
      this.qEC.qGD = paramInt2;
      h.b localb;
      String str2;
      String str3;
      String str1;
      if (this.gbe != null)
      {
        localb = this.gbe;
        str2 = getSessionId();
        str3 = getMediaId();
        if (paramInt1 != 64526) {
          break label162;
        }
        str1 = "MEDIA_ERR_SRC_NOT_SUPPORTED";
      }
      for (;;)
      {
        localb.d(str2, str3, str1, paramInt1, paramInt2);
        stop();
        aYM();
        return;
        label162:
        if (paramInt1 == 64529) {
          str1 = "MEDIA_ERR_SRC_NOT_SUPPORTED";
        } else if (paramInt1 == 64532)
        {
          if (!ao.isConnected(this.mContext)) {
            str1 = "MEDIA_ERR_NETWORK";
          } else {
            str1 = "MEDIA_ERR_DECODE";
          }
        }
        else if (!ao.isConnected(this.mContext)) {
          str1 = "MEDIA_ERR_NETWORK";
        } else {
          str1 = "MEDIA_ERR_DECODE";
        }
      }
    }
    paramInt2 = getCurrPosSec();
    if (this.qEs == -1) {}
    for (paramInt1 = paramInt2;; paramInt1 = this.qEs)
    {
      x.i(this.TAG, "%s onError now, try to start again. currPlaySec[%d] seekTimeWhenPrepared[%d] currPosSec[%d]", new Object[] { avy(), Integer.valueOf(paramInt1), Integer.valueOf(this.qEs), Integer.valueOf(paramInt2) });
      stop();
      aoi();
      this.dvh.postDelayed(new AbstractVideoView.3(this, paramInt1), 200L);
      return;
    }
  }
  
  public boolean pause()
  {
    x.i(this.TAG, "%s pause", new Object[] { avy() });
    bQ(getReportIdkey() + 4);
    if (this.hEl != null)
    {
      jQ(false);
      this.hEl.pause();
      SO();
      if (this.gbe != null) {
        this.gbe.bw(getSessionId(), getMediaId());
      }
      this.qEC.nPR = bi.VF();
      return true;
    }
    return false;
  }
  
  public boolean play()
  {
    if (!this.qEh) {
      x.w(this.TAG, "%s ui on pause now, why u call me to play? [%s]", new Object[] { avy(), bi.cjd() });
    }
    do
    {
      return false;
      bQ(getReportIdkey() + 3);
    } while (this.hEl == null);
    boolean bool = this.hEl.start();
    x.i(this.TAG, "%s video play [%b] isPlayOnUiPause[%b]", new Object[] { avy(), Boolean.valueOf(bool), Boolean.valueOf(this.qEp) });
    jQ(bool);
    if (bool)
    {
      this.qEp = false;
      bS(false);
      if (this.gbe != null) {
        this.gbe.bx(getSessionId(), getMediaId());
      }
    }
    return bool;
  }
  
  public void setCover(Bitmap paramBitmap)
  {
    x.i(this.TAG, "%s set cover", new Object[] { avy() });
    if ((paramBitmap != null) && (!paramBitmap.isRecycled())) {
      this.iYZ.setImageBitmap(paramBitmap);
    }
  }
  
  public void setFullDirection(int paramInt) {}
  
  public void setIMMVideoViewCallback(h.b paramb)
  {
    this.gbe = paramb;
  }
  
  public void setIsShowBasicControls(boolean paramBoolean)
  {
    x.i(this.TAG, "%s is show seek bar[%b]", new Object[] { avy(), Boolean.valueOf(paramBoolean) });
    this.qEm = paramBoolean;
    if (this.qEm)
    {
      this.dvh.post(new AbstractVideoView.10(this));
      return;
    }
    this.dvh.post(new AbstractVideoView.11(this));
  }
  
  public void setMute(boolean paramBoolean)
  {
    if (this.hEl != null) {
      this.hEl.setMute(paramBoolean);
    }
  }
  
  public void setReporter(h.c paramc)
  {
    this.qEB = paramc;
  }
  
  public void setVideoFooterView(g paramg)
  {
    if (!(paramg instanceof View))
    {
      x.w(this.TAG, "%s set video footer view but is not view", new Object[] { avy() });
      return;
    }
    ajY();
    this.qEl = paramg;
    this.qEn = false;
    this.qEj.addView((View)this.qEl);
  }
  
  public void stop()
  {
    x.i(this.TAG, "%s stop [%s]", new Object[] { avy(), bi.cjd() });
    bQ(getReportIdkey() + 6);
    if (this.hEl != null) {
      this.hEl.stop();
    }
    this.qEs = -1;
    this.qEr = true;
    this.Fd = false;
    this.qEv = 0;
    this.qEu = 0L;
    SO();
    this.dvh.postDelayed(new AbstractVideoView.2(this), 10L);
    this.qEC.qGy = bi.VF();
    int j;
    int i;
    label227:
    Object localObject;
    if (this.qEC.blockCount > 0)
    {
      if (ao.isWifi(this.mContext))
      {
        j = 41;
        i = 45;
        int k = getReportIdkey();
        int m = getReportIdkey();
        i = bi.f((Integer)com.tencent.mm.plugin.report.f.a(this.qEC.blockCount, new int[] { 1, 2, 3, 4 }, j + k, i + m));
        x.d(this.TAG, "%s rptBlockCount [%d]", new Object[] { avy(), Integer.valueOf(i) });
        bQ(i);
      }
    }
    else if (this.qEC.qGw != 0L)
    {
      localObject = new StringBuffer();
      ((StringBuffer)localObject).append(this.qEC.qGw).append(",");
      ((StringBuffer)localObject).append(this.qEC.qGx).append(",");
      ((StringBuffer)localObject).append(this.qEC.qGy).append(",");
      ((StringBuffer)localObject).append(this.qEC.nPR).append(",");
      ((StringBuffer)localObject).append(this.qEC.qGz).append(",");
      ((StringBuffer)localObject).append(this.qEC.qGA).append(",");
      ((StringBuffer)localObject).append(this.qEC.qGB).append(",");
      ((StringBuffer)localObject).append(this.qEC.blockCount).append(",");
      if (this.qEC.qGx <= 0L) {
        break label792;
      }
      l = this.qEC.qGx - this.qEC.qGw;
      label429:
      ((StringBuffer)localObject).append(l).append(",");
      ((StringBuffer)localObject).append(this.qEC.url).append(",");
      ((StringBuffer)localObject).append(this.qEC.duration).append(",");
      ((StringBuffer)localObject).append(this.qEC.qGC).append(",");
      ((StringBuffer)localObject).append(this.qEC.qGD).append(",");
      ((StringBuffer)localObject).append(this.qEC.nPP).append(",");
      if (this.qEC.nPP <= this.qEC.qGw) {
        break label798;
      }
    }
    label792:
    label798:
    for (long l = this.qEC.nPP - this.qEC.qGw;; l = 0L)
    {
      ((StringBuffer)localObject).append(l).append(",");
      ((StringBuffer)localObject).append(getPlayerType());
      localObject = ((StringBuffer)localObject).toString();
      x.i(this.TAG, "%s rpt video kv stat{%s}", new Object[] { avy(), localObject });
      if (this.qEB != null) {
        this.qEB.pV((String)localObject);
      }
      localObject = this.qEC;
      ((k)localObject).qGw = 0L;
      ((k)localObject).qGx = 0L;
      ((k)localObject).qGy = 0L;
      ((k)localObject).nPR = 0L;
      ((k)localObject).qGz = 0L;
      ((k)localObject).qGA = 0L;
      ((k)localObject).qGB = 0L;
      ((k)localObject).blockCount = 0;
      ((k)localObject).url = "";
      ((k)localObject).duration = 0;
      ((k)localObject).qGC = 0;
      ((k)localObject).qGD = 0;
      ((k)localObject).nPP = 0L;
      return;
      if (ao.is4G(this.mContext))
      {
        j = 46;
        i = 50;
        break;
      }
      if (ao.is3G(this.mContext))
      {
        j = 51;
        i = 55;
        break;
      }
      if (!ao.is2G(this.mContext)) {
        break label227;
      }
      j = 56;
      i = 60;
      break;
      l = 0L;
      break label429;
    }
  }
  
  public void wd()
  {
    x.i(this.TAG, "%s onCompletion", new Object[] { avy() });
    aYM();
    SO();
    if (this.gbe != null) {
      this.gbe.bv(getSessionId(), getMediaId());
    }
    this.qEv = 0;
    this.qEu = 0L;
    bQ(getReportIdkey() + 7);
  }
  
  public boolean x(int paramInt, boolean paramBoolean)
  {
    boolean bool2 = isPrepared();
    int j = getVideoDurationSec();
    if ((j > 0) && (paramInt > j)) {}
    for (int i = j;; i = paramInt)
    {
      boolean bool1;
      if (this.hEl != null) {
        if (!bi.oW(this.hEl.getVideoPath())) {
          bool1 = true;
        }
      }
      for (;;)
      {
        x.l(this.TAG, "%s seek to [%d %d] seconds afterPlay[%b] isPrepared[%b] duration[%d] hadSetPath[%b]", new Object[] { avy(), Integer.valueOf(i), Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean), Boolean.valueOf(bool2), Integer.valueOf(j), Boolean.valueOf(bool1) });
        bQ(getReportIdkey() + 5);
        if (!bool2) {
          break;
        }
        if (this.hEl == null) {
          break label196;
        }
        aoi();
        mH(i);
        this.hEl.d(i * 1000, paramBoolean);
        return paramBoolean;
        bool1 = false;
        continue;
        bool1 = false;
      }
      this.qEs = i;
      if (bool1) {
        this.qEr = true;
      }
      for (;;)
      {
        label196:
        return false;
        this.qEr = paramBoolean;
        start();
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/pluginsdk/ui/AbstractVideoView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */