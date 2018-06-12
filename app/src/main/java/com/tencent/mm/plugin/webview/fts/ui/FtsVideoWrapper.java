package com.tencent.mm.plugin.webview.fts.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.mm.model.d;
import com.tencent.mm.model.d.a;
import com.tencent.mm.modelvideo.MMVideoView;
import com.tencent.mm.pluginsdk.ui.CommonVideoView;
import com.tencent.mm.pluginsdk.ui.g;
import com.tencent.mm.pluginsdk.ui.h.a;
import com.tencent.mm.pluginsdk.ui.h.b;
import com.tencent.mm.pluginsdk.ui.h.c;
import com.tencent.mm.pluginsdk.ui.h.d;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public class FtsVideoWrapper
  extends RelativeLayout
  implements d.a, com.tencent.mm.pluginsdk.ui.h, h.a, h.b, h.c
{
  private boolean avH;
  private com.tencent.mm.pluginsdk.ui.h gbd;
  private h.b gbe;
  private g gbf;
  private h.d gbg = h.d.qFA;
  private boolean gbh = false;
  private float gbi = -1.0F;
  private int gbj;
  private boolean gbk;
  private d gbl;
  private Context mContext;
  private String url;
  
  public FtsVideoWrapper(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public FtsVideoWrapper(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.mContext = paramContext;
    this.gbl = new d();
  }
  
  private com.tencent.mm.pluginsdk.ui.h ajW()
  {
    CommonVideoView localCommonVideoView = new CommonVideoView(this.mContext);
    localCommonVideoView.setReporter(this);
    localCommonVideoView.setIMMVideoViewCallback(this);
    return localCommonVideoView;
  }
  
  public final void SL()
  {
    if (this.gbd != null) {
      this.gbd.SL();
    }
    this.gbl.bv(false);
    setKeepScreenOn(false);
  }
  
  public final void SM()
  {
    if (this.gbd != null) {
      this.gbd.SM();
    }
  }
  
  public final void aa(String paramString, boolean paramBoolean)
  {
    x.i("MicroMsg.AppBrandVideoWrapper", "%d onDownloadFinish path [%s] isPlayNow [%b]", new Object[] { Integer.valueOf(hashCode()), paramString, Boolean.valueOf(paramBoolean) });
    if (paramBoolean) {
      return;
    }
    if ((this.gbd instanceof MMVideoView))
    {
      this.gbd.stop();
      this.gbd.ajY();
      removeView((View)this.gbd);
      x.i("MicroMsg.AppBrandVideoWrapper", "%d onDownloadFinish use common video view !", new Object[] { Integer.valueOf(hashCode()) });
      this.gbd = ajW();
    }
    for (int i = 1;; i = 0)
    {
      setScaleType(this.gbg);
      ac(this.gbi);
      setMute(this.gbh);
      if (i == 0) {
        break;
      }
      setVideoFooterView(this.gbf);
      paramString = new RelativeLayout.LayoutParams(-1, -2);
      paramString.addRule(13);
      addView((View)this.gbd, paramString);
      this.gbd.c(this.avH, this.url, this.gbj);
      this.gbd.start();
      return;
    }
  }
  
  public final boolean ac(float paramFloat)
  {
    if (paramFloat <= 0.0F) {}
    do
    {
      return false;
      this.gbi = paramFloat;
    } while (this.gbd == null);
    return this.gbd.ac(this.gbi);
  }
  
  public final boolean ajG()
  {
    if (this.gbd != null) {
      return this.gbd.ajG();
    }
    return false;
  }
  
  public final void ajY()
  {
    if (this.gbd != null) {
      this.gbd.ajY();
    }
  }
  
  public final void ajZ()
  {
    if (this.gbd != null) {
      this.gbd.ajZ();
    }
    this.gbl.bv(false);
    setKeepScreenOn(false);
  }
  
  public final void bQ(long paramLong)
  {
    com.tencent.mm.plugin.report.service.h.mEJ.a(600L, paramLong, 1L, false);
  }
  
  public final void bu(String paramString1, String paramString2)
  {
    x.i("MicroMsg.AppBrandVideoWrapper", "%d onPrepared", new Object[] { Integer.valueOf(hashCode()) });
    if (this.gbe != null) {
      this.gbe.bu(paramString1, paramString2);
    }
  }
  
  public final void bv(String paramString1, String paramString2)
  {
    x.i("MicroMsg.AppBrandVideoWrapper", "%d onVideoEnded", new Object[] { Integer.valueOf(hashCode()) });
    if (this.gbe != null) {
      this.gbe.bv(paramString1, paramString2);
    }
  }
  
  public final void bw(String paramString1, String paramString2)
  {
    x.d("MicroMsg.AppBrandVideoWrapper", "%d onVideoPause", new Object[] { Integer.valueOf(hashCode()) });
    setKeepScreenOn(false);
    this.gbl.bv(false);
    if (this.gbe != null) {
      this.gbe.bw(paramString1, paramString2);
    }
  }
  
  public final void bx(String paramString1, String paramString2)
  {
    x.d("MicroMsg.AppBrandVideoWrapper", "%d onVideoPlay", new Object[] { Integer.valueOf(hashCode()) });
    setKeepScreenOn(true);
    this.gbl.a(this);
    if (this.gbe != null) {
      this.gbe.bx(paramString1, paramString2);
    }
  }
  
  public final void by(String paramString1, String paramString2)
  {
    if (this.gbe != null) {
      this.gbe.by(paramString1, paramString2);
    }
  }
  
  public final void bz(String paramString1, String paramString2)
  {
    if (this.gbe != null) {
      this.gbe.bz(paramString1, paramString2);
    }
  }
  
  public final void c(boolean paramBoolean, String paramString, int paramInt)
  {
    this.gbj = paramInt;
    this.avH = paramBoolean;
    PString localPString = new PString();
    localPString.value = paramString;
    bi.oW(localPString.value);
    this.gbk = false;
    this.url = localPString.value;
    if (this.gbd == null)
    {
      x.i("MicroMsg.AppBrandVideoWrapper", "%d use common video view !", new Object[] { Integer.valueOf(hashCode()) });
      this.gbd = ajW();
      paramInt = 1;
    }
    for (;;)
    {
      setScaleType(this.gbg);
      ac(this.gbi);
      setMute(this.gbh);
      if (paramInt != 0)
      {
        setVideoFooterView(this.gbf);
        paramString = new RelativeLayout.LayoutParams(-1, -2);
        paramString.addRule(13);
        addView((View)this.gbd, paramString);
      }
      this.gbd.c(this.avH, this.url, this.gbj);
      return;
      if ((this.gbd instanceof MMVideoView))
      {
        this.gbd.stop();
        this.gbd.ajY();
        removeView((View)this.gbd);
        x.i("MicroMsg.AppBrandVideoWrapper", "%d use common video view !", new Object[] { Integer.valueOf(hashCode()) });
        this.gbd = ajW();
        paramInt = 1;
      }
      else
      {
        x.i("MicroMsg.AppBrandVideoWrapper", "%d use last common video view !", new Object[] { Integer.valueOf(hashCode()) });
        this.gbd.stop();
        paramInt = 0;
      }
    }
  }
  
  public final void d(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    x.i("MicroMsg.AppBrandVideoWrapper", "%d onGetVideoSize[%d %d]", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (this.gbe != null) {
      this.gbe.d(paramString1, paramString2, paramInt1, paramInt2);
    }
  }
  
  public final void d(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2)
  {
    x.w("MicroMsg.AppBrandVideoWrapper", "%d onError[%s %d, %d]", new Object[] { Integer.valueOf(hashCode()), paramString3, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (this.gbe != null) {
      this.gbe.d(paramString1, paramString2, paramString3, paramInt1, paramInt2);
    }
  }
  
  public int getCacheTimeSec()
  {
    if (this.gbd != null) {
      return this.gbd.getCacheTimeSec();
    }
    return 0;
  }
  
  public int getCurrPosMs()
  {
    if (this.gbd != null) {
      return this.gbd.getCurrPosMs();
    }
    return 0;
  }
  
  public int getCurrPosSec()
  {
    if (this.gbd != null) {
      return this.gbd.getCurrPosSec();
    }
    return 0;
  }
  
  public int getPlayerType()
  {
    if (this.gbd != null) {
      return this.gbd.getPlayerType();
    }
    return 0;
  }
  
  public int getVideoDurationSec()
  {
    if (this.gbd != null) {
      return this.gbd.getVideoDurationSec();
    }
    return this.gbj;
  }
  
  public final boolean isPlaying()
  {
    if (this.gbd != null) {
      return this.gbd.isPlaying();
    }
    return false;
  }
  
  public final boolean kW(int paramInt)
  {
    if (this.gbd != null) {
      return this.gbd.kW(paramInt);
    }
    return false;
  }
  
  public final void pV(String paramString)
  {
    com.tencent.mm.plugin.report.service.h.mEJ.k(14349, paramString);
  }
  
  public final boolean pause()
  {
    boolean bool = false;
    if (this.gbd != null)
    {
      setKeepScreenOn(false);
      this.gbl.bv(false);
      bool = this.gbd.pause();
    }
    return bool;
  }
  
  public void setCover(Bitmap paramBitmap)
  {
    if (this.gbd != null) {
      this.gbd.setCover(paramBitmap);
    }
  }
  
  public void setFullDirection(int paramInt)
  {
    if (this.gbd != null) {
      this.gbd.setFullDirection(paramInt);
    }
  }
  
  public void setIMMVideoViewCallback(h.b paramb)
  {
    this.gbe = paramb;
  }
  
  public void setIsShowBasicControls(boolean paramBoolean)
  {
    if (this.gbd != null) {
      this.gbd.setIsShowBasicControls(paramBoolean);
    }
  }
  
  public void setKeepScreenOn(boolean paramBoolean)
  {
    x.d("MicroMsg.AppBrandVideoWrapper", "set keep screen on[%b] stack[%s]", new Object[] { Boolean.valueOf(paramBoolean), bi.cjd() });
    super.setKeepScreenOn(paramBoolean);
  }
  
  public void setMute(boolean paramBoolean)
  {
    this.gbh = paramBoolean;
    if (this.gbd != null) {
      this.gbd.setMute(this.gbh);
    }
  }
  
  public void setScaleType(h.d paramd)
  {
    this.gbg = paramd;
    if (this.gbd != null) {
      this.gbd.setScaleType(this.gbg);
    }
  }
  
  public void setVideoFooterView(g paramg)
  {
    this.gbf = paramg;
    if (this.gbd != null) {
      this.gbd.setVideoFooterView(this.gbf);
    }
  }
  
  public final void start()
  {
    if (this.gbd != null)
    {
      this.gbd.start();
      setKeepScreenOn(true);
      this.gbl.a(this);
    }
  }
  
  public final void stop()
  {
    if (this.gbd != null)
    {
      this.gbd.stop();
      this.gbl.bv(false);
      setKeepScreenOn(false);
    }
  }
  
  public final boolean x(int paramInt, boolean paramBoolean)
  {
    if (this.gbd != null) {
      return this.gbd.x(paramInt, paramBoolean);
    }
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/webview/fts/ui/FtsVideoWrapper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */