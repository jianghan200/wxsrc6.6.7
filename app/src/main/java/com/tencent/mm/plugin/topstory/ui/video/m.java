package com.tencent.mm.plugin.topstory.ui.video;

import android.content.Context;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelvideo.MMVideoView;
import com.tencent.mm.plugin.topstory.ui.d;
import com.tencent.mm.pluginsdk.ui.h.b;
import com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.protocal.c.bti;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;

public final class m
  extends MMVideoView
{
  private String bJK = "";
  private a oAb;
  private bti ozj;
  
  public m(Context paramContext, a parama)
  {
    super(paramContext);
    this.mContext = paramContext;
    this.oAb = parama;
  }
  
  private static boolean bIi()
  {
    try
    {
      g.Ek();
      boolean bool = g.Ei().DT().getBoolean(aa.a.sVF, false);
      return bool;
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.TopStory.TopStoryVideoView", localException, "check need reset error", new Object[0]);
    }
    return false;
  }
  
  public final void L(String paramString, int paramInt)
  {
    super.L(paramString, paramInt);
    if ((paramInt != 0) && (this.gbe != null)) {
      this.gbe.d(getSessionId(), getMediaId(), "download error", paramInt, 0);
    }
  }
  
  public final void Ov(String paramString)
  {
    this.bJK = paramString;
    start();
  }
  
  protected final void SJ()
  {
    this.elO.elS = 4;
    this.elO.elT = 2;
  }
  
  public final void SL()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.TopStory.TopStoryVideoView", "%s onUIPause", new Object[] { avy() });
    if (this.qEh)
    {
      this.qEo = getCurrPosSec();
      this.qEp = isPlaying();
      this.qEv = 0;
      this.qEu = 0L;
      pause();
      SO();
      this.qEh = false;
      bQ(getReportIdkey() + 11);
    }
  }
  
  public final void SM()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.TopStory.TopStoryVideoView", "%s onUIResume", new Object[] { avy() });
    if (!this.qEh)
    {
      this.qEh = true;
      if (this.hEl != null)
      {
        if (!this.qEp) {
          break label62;
        }
        play();
      }
    }
    for (;;)
    {
      bQ(getReportIdkey() + 10);
      return;
      label62:
      ((VideoPlayerTextureView)this.hEl).bdC();
    }
  }
  
  protected final boolean a(int paramInt, PInt paramPInt1, PInt paramPInt2)
  {
    paramPInt1.value = Math.max(paramInt, this.elJ);
    boolean bool2;
    if ((this.elD == 1) || (this.elD == 0)) {
      if ((this.elE != null) && (bIi()))
      {
        paramPInt2.value = 0;
        paramPInt1.value = 0;
        bool2 = this.elE.b(paramInt + 1, paramPInt1, paramPInt2);
        bool1 = bool2;
        if (!bool2)
        {
          paramPInt1.value = paramInt;
          paramPInt1.value += 4;
        }
      }
    }
    for (boolean bool1 = bool2;; bool1 = false)
    {
      bool2 = bool1;
      if (this.elD == 2)
      {
        if (this.elE != null)
        {
          bool1 = this.elE.b(paramInt, paramPInt1, paramPInt2);
          paramPInt2.value += 4;
        }
        bool2 = bool1;
        if (!bool1)
        {
          paramPInt1.value = (paramInt - 8);
          if (paramPInt1.value < 0) {
            paramPInt1.value = 0;
          }
          paramPInt2.value = (paramPInt1.value + this.elK + 8);
          bool2 = bool1;
        }
      }
      if ((this.elD == 3) || (this.elD == 4))
      {
        paramPInt1.value = this.elJ;
        paramPInt2.value = (this.elF + 1);
      }
      if (paramPInt2.value >= this.elF + 1) {
        paramPInt2.value = (this.elF + 1);
      }
      if (paramPInt2.value < paramPInt1.value)
      {
        paramPInt1.value += 2;
        return false;
      }
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.TopStory.TopStoryVideoView", "%s calcDownloadRange2 range[%d, %d, %b] playTime[%d] playStatus[%d] cache[%d, %d] [%s]", new Object[] { avy(), Integer.valueOf(paramPInt1.value), Integer.valueOf(paramPInt2.value), Boolean.valueOf(bool2), Integer.valueOf(paramInt), Integer.valueOf(this.elD), Integer.valueOf(this.elJ), Integer.valueOf(this.elK), this.elz });
      return true;
      bool2 = false;
      break;
    }
  }
  
  public final void ajZ()
  {
    super.ajZ();
    this.oAb = null;
  }
  
  protected final boolean bIj()
  {
    return false;
  }
  
  public final void bIk()
  {
    ((TopStoryVideoPlayTextureView)this.hEl).setAlpha(1.0F);
  }
  
  protected final com.tencent.mm.pluginsdk.ui.tools.f bT(Context paramContext)
  {
    paramContext = new TopStoryVideoPlayTextureView(paramContext);
    paramContext.setOpenWithNoneSurface(true);
    paramContext.setNeedResetExtractor(bIi());
    paramContext.setIsOnlineVideoType(true);
    return paramContext;
  }
  
  public final int getCurrPosMs()
  {
    int i = 0;
    if (this.hEl != null) {
      i = this.hEl.getCurrentPosition();
    }
    if (this.elG > 0) {
      i = this.elG * 1000;
    }
    return i;
  }
  
  public final int getCurrPosSec()
  {
    int i = 0;
    if (this.hEl != null) {
      i = Math.round(this.hEl.getCurrentPosition() * 1.0F / 1000.0F);
    }
    if (this.elG > 0) {
      i = this.elG;
    }
    return i;
  }
  
  public final String getSessionId()
  {
    return this.bJK;
  }
  
  public final void h(String paramString, int paramInt1, int paramInt2)
  {
    if (!bi.fS(this.elz, paramString)) {}
    do
    {
      return;
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.TopStory.TopStoryVideoView", "%s download  onProgress [%d, %d]", new Object[] { avy(), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    } while ((!this.elI) || (this.elD != 3));
    iC(getCurrPosSec());
  }
  
  public final boolean iD(int paramInt)
  {
    boolean bool2;
    if (this.elC == 3)
    {
      bool2 = true;
      return bool2;
    }
    PInt localPInt1 = new PInt();
    PInt localPInt2 = new PInt();
    for (;;)
    {
      try
      {
        PInt localPInt3 = new PInt();
        PInt localPInt4 = new PInt();
        if ((paramInt != 0) || (this.elE == null) || (!bIi())) {
          break label219;
        }
        localPInt4.value = 0;
        localPInt3.value = 0;
        bool1 = this.elE.b(paramInt + 1, localPInt3, localPInt4);
        if (!bool1) {
          break label212;
        }
        i = localPInt4.value;
        if ((this.ely == null) || (this.elE == null) || (!this.elE.a(paramInt, i, localPInt1, localPInt2))) {
          break label210;
        }
        bool1 = this.ely.isVideoDataAvailable(this.elz, localPInt1.value, localPInt2.value);
        bool2 = bool1;
        if (!bool1) {
          break;
        }
        try
        {
          this.elJ = i;
          return bool1;
        }
        catch (Exception localException1) {}
      }
      catch (Exception localException2)
      {
        bool1 = false;
        continue;
      }
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.TopStory.TopStoryVideoView", "%s check video data error %s ", new Object[] { avy(), localException1.toString() });
      return bool1;
      label210:
      return false;
      label212:
      int i = paramInt + 1;
      continue;
      label219:
      boolean bool1 = false;
    }
  }
  
  protected final void initView()
  {
    super.initView();
  }
  
  public final boolean isPlaying()
  {
    boolean bool2 = super.isPlaying();
    if ((bool2) && (this.elD == 3)) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.TopStory.TopStoryVideoView", "%s result [%b] is playing[%b] playStatus[%d]", new Object[] { avy(), Boolean.valueOf(bool1), Boolean.valueOf(bool2), Integer.valueOf(this.elD) });
      return bool2;
    }
  }
  
  public final void onError(int paramInt1, int paramInt2)
  {
    super.onError(paramInt1, paramInt2);
    switch (paramInt2)
    {
    default: 
      return;
    case -2: 
      try
      {
        g.Ek();
        g.Ei().DT().a(aa.a.sVF, Boolean.valueOf(true));
        if ((this.hEl instanceof TopStoryVideoPlayTextureView)) {
          ((TopStoryVideoPlayTextureView)this.hEl).setNeedResetExtractor(true);
        }
        com.tencent.mm.plugin.websearch.api.a.b.kB(com.tencent.mm.plugin.websearch.api.a.b.pMG);
        return;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.TopStory.TopStoryVideoView", localException, "%s onError [%s]", new Object[] { avy(), localException.toString() });
        }
      }
    case -1: 
      com.tencent.mm.plugin.websearch.api.a.b.kB(com.tencent.mm.plugin.websearch.api.a.b.pMF);
      return;
    }
    com.tencent.mm.plugin.websearch.api.a.b.kB(com.tencent.mm.plugin.websearch.api.a.b.pMH);
  }
  
  public final void setVideoInfo(bti parambti)
  {
    super.c(false, parambti.videoUrl, parambti.sqR);
    this.ozj = parambti;
    this.elz = d.ak(parambti.sqS, parambti.sqT);
    this.elA = (this.oAb.bHW() + this.elz + ".mp4");
  }
  
  public final void start()
  {
    super.start();
    com.tencent.mm.plugin.websearch.api.a.a.kB(5);
  }
  
  public final void stop()
  {
    super.stop();
    this.ozj = null;
  }
  
  public final boolean x(int paramInt, boolean paramBoolean)
  {
    int i = paramInt;
    if (this.elE != null)
    {
      int j = this.elE.VM();
      i = paramInt;
      if (paramInt > j)
      {
        i = paramInt;
        if (j > 0)
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.TopStory.TopStoryVideoView", "%s seek to reset time ori[%d] last key frame[%d]", new Object[] { avy(), Integer.valueOf(paramInt), Integer.valueOf(j) });
          i = j;
        }
      }
    }
    return super.x(i, paramBoolean);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/topstory/ui/video/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */