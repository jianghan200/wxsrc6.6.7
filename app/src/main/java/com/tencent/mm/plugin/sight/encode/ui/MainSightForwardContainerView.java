package com.tencent.mm.plugin.sight.encode.ui;

import android.annotation.TargetApi;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.media.MediaPlayer;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.RelativeLayout;
import com.tencent.mm.R.a;
import com.tencent.mm.a.e;
import com.tencent.mm.compatible.b.j;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.plugin.ak.a.h;
import com.tencent.mm.plugin.sight.encode.a.b.3;
import com.tencent.mm.plugin.sight.encode.a.b.4;
import com.tencent.mm.plugin.sight.encode.a.b.a;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMFragmentActivity;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MainSightForwardContainerView
  extends RelativeLayout
  implements AdapterView.OnItemClickListener, a
{
  public View kWn;
  private int mDuration = 1;
  private boolean mIsPause = false;
  private boolean mIsPlaying = false;
  public String nfA = "";
  private boolean nfB = false;
  public String nfC = "";
  public float nfD = 1.0F;
  private com.tencent.mm.plugin.sight.encode.a.b nfE = new com.tencent.mm.plugin.sight.encode.a.b();
  private boolean nfF = false;
  public MMFragmentActivity nfG;
  private boolean nfH = false;
  private com.tencent.mm.sdk.b.c nfI = new MainSightForwardContainerView.5(this);
  private boolean nfJ = false;
  private MediaPlayer nfK;
  public MainSightSelectContactView nfs;
  public SightCameraView nft;
  private b nfu;
  public View nfv;
  public View nfw;
  public View nfx;
  private Dialog nfy = null;
  private boolean nfz = true;
  
  public MainSightForwardContainerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public MainSightForwardContainerView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public final boolean BD()
  {
    return !this.nfz;
  }
  
  public final void aEI()
  {
    com.tencent.mm.sdk.b.a.sFg.c(this.nfI);
  }
  
  public final void aTi()
  {
    if (this.nfy == null) {}
    for (boolean bool = true;; bool = false)
    {
      x.i("MicroMsg.MainSightContainerView", "do send to friend, loadingDialog null %B", new Object[] { Boolean.valueOf(bool) });
      if ((!bi.oW(this.nfC)) && (!this.nfs.bwx())) {
        break;
      }
      return;
    }
    Object localObject1 = this.nfs.getSelectedContact();
    com.tencent.mm.plugin.report.service.h.mEJ.h(11443, new Object[] { Integer.valueOf(1), Integer.valueOf(3), Integer.valueOf(((List)localObject1).size()) });
    Object localObject2 = new MainSightForwardContainerView.6(this, (List)localObject1);
    com.tencent.mm.plugin.sight.encode.a.b localb;
    String str1;
    int i;
    String str2;
    String str3;
    if (((List)localObject1).size() == 1)
    {
      localb = this.nfE;
      str1 = this.nfC;
      i = this.mDuration;
      str2 = this.nfA;
      str3 = (String)((List)localObject1).get(0);
      if (bi.oW(str1))
      {
        x.w("MicroMsg.SightRecorderHelper", "remux and send sight error: in path is null");
        com.tencent.mm.plugin.sight.encode.a.b.a((b.a)localObject2, -1);
        label177:
        if ((this.nfs.getSelectedContact().size() > 1) || (this.nfu == null)) {
          break label850;
        }
        localObject2 = (String)this.nfs.getSelectedContact().get(0);
        this.nfu.Lq((String)localObject2);
      }
    }
    label820:
    label850:
    for (bool = false;; bool = true)
    {
      if (this.nfG != null) {
        localObject2 = this.nfG.getAssets();
      }
      try
      {
        localObject2 = ((AssetManager)localObject2).openFd("sight_send_song.wav");
        this.nfK = new j();
        this.nfK.setDataSource(((AssetFileDescriptor)localObject2).getFileDescriptor(), ((AssetFileDescriptor)localObject2).getStartOffset(), ((AssetFileDescriptor)localObject2).getLength());
        ((AssetFileDescriptor)localObject2).close();
        this.nfK.setOnCompletionListener(new MainSightForwardContainerView.7(this));
        this.nfK.setLooping(false);
        this.nfK.prepare();
        this.nfK.start();
        hO(bool);
        localObject1 = ((List)localObject1).iterator();
        while (((Iterator)localObject1).hasNext())
        {
          if (!((String)((Iterator)localObject1).next()).toLowerCase().endsWith("@chatroom")) {
            break label820;
          }
          com.tencent.mm.plugin.report.service.h.mEJ.h(11442, new Object[] { Integer.valueOf(1), Integer.valueOf(2) });
        }
        if (bi.oW(str3))
        {
          x.w("MicroMsg.SightRecorderHelper", "remux and send sight error: toUser null");
          com.tencent.mm.plugin.sight.encode.a.b.a((b.a)localObject2, -1);
          break label177;
        }
        if ((!e.cn(str1)) || (e.cm(str1) <= 0))
        {
          x.w("MicroMsg.SightRecorderHelper", "file not exist or file size error");
          com.tencent.mm.ui.base.h.bA(ad.getContext(), ad.getContext().getString(a.h.short_video_input_file_error));
          break label177;
        }
        String str4 = com.tencent.mm.a.g.cu(str1);
        x.i("MicroMsg.SightRecorderHelper", "do share to friends, check md5 target[%s] current[%s]", new Object[] { str2, str4 });
        if (!bi.aG(str2, "").equals(str4))
        {
          x.e("MicroMsg.SightRecorderHelper", "error md5, return");
          com.tencent.mm.plugin.sight.encode.a.b.a((b.a)localObject2, -1);
          break label177;
        }
        com.tencent.mm.kernel.g.Ek();
        if (com.tencent.mm.kernel.g.Em().H(new b.3(localb, str3, (b.a)localObject2, str1, i)) >= 0) {
          break label177;
        }
        x.e("MicroMsg.SightRecorderHelper", "post short video encoder error");
        com.tencent.mm.plugin.sight.encode.a.b.a((b.a)localObject2, -1);
        break label177;
        localb = this.nfE;
        str1 = this.nfC;
        i = this.mDuration;
        str2 = this.nfA;
        if (bi.oW(str1))
        {
          x.w("MicroMsg.SightRecorderHelper", "remux and send sight error: in path is null");
          com.tencent.mm.plugin.sight.encode.a.b.a((b.a)localObject2, -1);
          break label177;
        }
        if ((localObject1 == null) || (((List)localObject1).isEmpty()))
        {
          x.w("MicroMsg.SightRecorderHelper", "remux and send sight error: toUser list empty");
          com.tencent.mm.plugin.sight.encode.a.b.a((b.a)localObject2, -1);
          break label177;
        }
        if ((!e.cn(str1)) || (e.cm(str1) <= 0))
        {
          x.w("MicroMsg.SightRecorderHelper", "file not exist or file size error");
          com.tencent.mm.ui.base.h.bA(ad.getContext(), ad.getContext().getString(a.h.short_video_input_file_error));
          break label177;
        }
        str3 = com.tencent.mm.a.g.cu(str1);
        x.i("MicroMsg.SightRecorderHelper", "do share to friends, check md5 target[%s] current[%s]", new Object[] { str2, str3 });
        if (!bi.aG(str2, "").equals(str3))
        {
          x.e("MicroMsg.SightRecorderHelper", "error md5, return");
          com.tencent.mm.plugin.sight.encode.a.b.a((b.a)localObject2, -1);
          break label177;
        }
        com.tencent.mm.kernel.g.Ek();
        if (com.tencent.mm.kernel.g.Em().H(new b.4(localb, str1, (List)localObject1, str2, (b.a)localObject2, i)) >= 0) {
          break label177;
        }
        x.e("MicroMsg.SightRecorderHelper", "post short video encoder error");
        com.tencent.mm.plugin.sight.encode.a.b.a((b.a)localObject2, -1);
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          x.printErrStackTrace("MicroMsg.MainSightContainerView", localIOException, "", new Object[0]);
          continue;
          com.tencent.mm.plugin.report.service.h.mEJ.h(11442, new Object[] { Integer.valueOf(1), Integer.valueOf(1) });
        }
      }
    }
  }
  
  public final void bwl()
  {
    this.nft.setVisibility(0);
    hP(true);
  }
  
  public final void bwm()
  {
    this.nft.setVisibility(4);
    hP(false);
  }
  
  public final void bwn()
  {
    boolean bool1 = true;
    x.i("MicroMsg.MainSightContainerView", "toggle play video, path %s, mute %B, playing %B", new Object[] { this.nfC, Boolean.valueOf(this.nfz), Boolean.valueOf(this.mIsPlaying) });
    if (!this.nft.isPlaying()) {
      this.nfz = true;
    }
    boolean bool2 = this.nfz;
    this.nft.aP(this.nfC, bool2);
    if (!this.nfz)
    {
      hP(false);
      this.mIsPlaying = true;
      if (this.nfz) {
        break label111;
      }
    }
    for (;;)
    {
      this.nfz = bool1;
      return;
      hP(true);
      break;
      label111:
      bool1 = false;
    }
  }
  
  public final void bwo()
  {
    this.nfx.setVisibility(8);
  }
  
  public int getViewHeight()
  {
    int j = getHeight();
    int i = j;
    if (j <= 0) {
      i = getResources().getDisplayMetrics().heightPixels;
    }
    return i;
  }
  
  public final void hN(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.nfx.setVisibility(0);
      setIsMute(true);
      return;
    }
    bwo();
    setIsMute(BD());
  }
  
  public final void hO(boolean paramBoolean)
  {
    if (this.nfB) {
      return;
    }
    this.nfB = true;
    bi.hideVKB(this);
    this.mIsPlaying = false;
    this.nfz = true;
    x.d("MicroMsg.MainSightContainerView", "dismiss sight view");
    this.nfH = false;
    this.nft.bwy();
    if ((this.nfu != null) && (paramBoolean)) {
      this.nfu.bwp();
    }
    if (this.nfs != null)
    {
      MainSightSelectContactView localMainSightSelectContactView = this.nfs;
      localMainSightSelectContactView.nfB = true;
      bi.hideVKB(localMainSightSelectContactView);
      localMainSightSelectContactView.ngg.bwt();
      localMainSightSelectContactView.ngq.clear();
      localMainSightSelectContactView.ngp.clear();
      localMainSightSelectContactView.CU.setAdapter(null);
      localMainSightSelectContactView.CU.clearAnimation();
      localMainSightSelectContactView.setVisibility(8);
    }
    setCameraShadowAlpha(0.85F);
    bwo();
    hP(false);
    this.nfA = "";
    aEI();
  }
  
  public final void hP(boolean paramBoolean)
  {
    if (this.nfF == paramBoolean) {}
    do
    {
      return;
      this.nfF = paramBoolean;
      if (!paramBoolean) {
        break;
      }
    } while (this.nfw.getVisibility() == 0);
    this.nft.postDelayed(new MainSightForwardContainerView.4(this), 100L);
    return;
    this.nfw.setVisibility(8);
    this.kWn.setVisibility(8);
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramInt -= 1;
    if ((MainSightSelectContactView.wg(paramInt)) && (this.mIsPlaying)) {
      bwn();
    }
    label384:
    label414:
    label507:
    label556:
    label562:
    label647:
    label649:
    label693:
    for (;;)
    {
      return;
      if (c.Ls(this.nfs.jd(paramInt)))
      {
        this.nfs.ngg.bws();
        return;
      }
      if (c.Lr(this.nfs.jd(paramInt)))
      {
        if (c.nfQ)
        {
          this.nfH = true;
          this.nft.bwy();
          paramAdapterView = this.nfG;
          paramView = com.tencent.mm.plugin.sight.base.d.Ll(this.nfC);
          String str1 = this.nfC;
          String str2 = this.nfA;
          x.i("MicroMsg.SightRecorderHelper", "share video path %s, thumb path %s", new Object[] { str1, paramView });
          Object localObject;
          if (!e.cn(paramView)) {
            localObject = com.tencent.mm.plugin.sight.base.d.ad(str1, 320, 240);
          }
          try
          {
            com.tencent.mm.sdk.platformtools.c.a((Bitmap)localObject, 60, Bitmap.CompressFormat.JPEG, paramView, true);
            localObject = new Intent();
            ((Intent)localObject).putExtra("KSightPath", str1);
            ((Intent)localObject).putExtra("KSightThumbPath", paramView);
            ((Intent)localObject).putExtra("sight_md5", str2);
            ((Intent)localObject).putExtra("KSightDraftEntrance", false);
            ((Intent)localObject).putExtra("Ksnsupload_source", 0);
            ((Intent)localObject).putExtra("KSnsPostManu", true);
            ((Intent)localObject).putExtra("KTouchCameraTime", bi.VE());
            com.tencent.mm.bg.d.b(paramAdapterView, "sns", ".ui.SightUploadUI", (Intent)localObject, 5985);
            if (this.nfJ)
            {
              com.tencent.mm.plugin.report.service.h.mEJ.h(11442, new Object[] { Integer.valueOf(3), Integer.valueOf(3) });
              return;
            }
          }
          catch (Exception localException)
          {
            for (;;)
            {
              x.printErrStackTrace("MicroMsg.SightRecorderHelper", localException, "", new Object[0]);
              x.e("MicroMsg.SightRecorderHelper", "save bitmap to image error");
            }
            com.tencent.mm.plugin.report.service.h.mEJ.h(11442, new Object[] { Integer.valueOf(1), Integer.valueOf(3) });
            return;
          }
        }
      }
      else
      {
        x.d("MicroMsg.MainSightContainerView", "on item click Item : %d", new Object[] { Integer.valueOf(paramInt) });
        paramAdapterView = this.nfs;
        boolean bool;
        if ((paramInt < 0) || (paramInt > paramAdapterView.ngi.getCount()))
        {
          paramAdapterView = this.nfs;
          if (paramAdapterView.ngi != null) {
            paramAdapterView.ngi.notifyDataSetChanged();
          }
          if (BD()) {
            break label562;
          }
          bwn();
          if (!this.nfs.ngg.bwr()) {
            break label647;
          }
          paramAdapterView = this.nfs;
          if (paramAdapterView.ngi.FM(paramInt) != null) {
            break label649;
          }
          bool = false;
        }
        for (;;)
        {
          if (!bool) {
            break label693;
          }
          this.nfs.ngg.bws();
          return;
          paramView = paramAdapterView.ngi.FM(paramInt);
          if (paramView == null) {
            break label384;
          }
          if (paramAdapterView.ngq.contains(paramView.guS.field_username))
          {
            paramAdapterView.ngq.remove(paramView.guS.field_username);
            c.nfQ = paramAdapterView.ngq.isEmpty();
            if (paramAdapterView.ngq.isEmpty()) {
              break label556;
            }
          }
          for (bool = true;; bool = false)
          {
            c.nfR = bool;
            break;
            paramAdapterView.ngq.add(paramView.guS.field_username);
            break label507;
          }
          if (this.nfs.bwx())
          {
            if (this.kWn.getVisibility() != 0) {
              break label414;
            }
            this.kWn.setVisibility(8);
            this.kWn.startAnimation(AnimationUtils.loadAnimation(this.nfG, R.a.fast_faded_out));
            break label414;
          }
          if (this.kWn.getVisibility() == 0) {
            break label414;
          }
          this.kWn.setVisibility(0);
          this.kWn.startAnimation(AnimationUtils.loadAnimation(this.nfG, R.a.fast_faded_in));
          break label414;
          break;
          if (paramAdapterView.ngi.FM(paramInt).guS == null) {
            bool = false;
          } else {
            bool = paramAdapterView.ngq.contains(paramAdapterView.ngi.FM(paramInt).guS.field_username);
          }
        }
      }
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if ((paramBoolean) && (!this.nfB) && (this.nfs != null))
    {
      x.d("MicroMsg.MainSightContainerView", "change size l: %d, t: %d, r: %d, b: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
      this.nfs.bww();
    }
  }
  
  public final void onPause()
  {
    if (this.nfH) {
      return;
    }
    this.nft.setVisibility(0);
    hP(false);
    this.nft.bwy();
    this.mIsPause = true;
  }
  
  public final void onResume()
  {
    int i;
    if (!this.nfB)
    {
      i = 1;
      if (i == 0) {
        break label57;
      }
      com.tencent.mm.sdk.b.a.sFg.c(this.nfI);
      com.tencent.mm.sdk.b.a.sFg.b(this.nfI);
    }
    for (;;)
    {
      if (this.mIsPause)
      {
        bwn();
        this.mIsPause = false;
      }
      return;
      i = 0;
      break;
      label57:
      aEI();
    }
  }
  
  @TargetApi(11)
  public void setCameraShadowAlpha(float paramFloat)
  {
    paramFloat = Math.min(1.0F, Math.max(0.0F, paramFloat));
    if (com.tencent.mm.compatible.util.d.fR(11)) {
      this.nfv.setAlpha(paramFloat);
    }
    for (;;)
    {
      x.d("MicroMsg.MainSightContainerView", "set alpha: %f", new Object[] { Float.valueOf(paramFloat) });
      if (paramFloat > 0.0F) {
        break;
      }
      this.nfv.setVisibility(8);
      AlphaAnimation localAlphaAnimation = new AlphaAnimation(1.0F, 0.0F);
      localAlphaAnimation.setDuration(500L);
      this.nfv.startAnimation(localAlphaAnimation);
      return;
      localAlphaAnimation = new AlphaAnimation(paramFloat, paramFloat);
      localAlphaAnimation.setDuration(0L);
      localAlphaAnimation.setFillAfter(true);
      this.nfv.startAnimation(localAlphaAnimation);
    }
    this.nfv.setVisibility(0);
  }
  
  public void setIMainSightViewCallback(b paramb)
  {
    this.nfu = paramb;
  }
  
  public void setIsForSns(boolean paramBoolean)
  {
    this.nfJ = paramBoolean;
  }
  
  public void setIsMute(boolean paramBoolean)
  {
    if (this.nft == null) {
      return;
    }
    this.nft.setIsMute(paramBoolean);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/sight/encode/ui/MainSightForwardContainerView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */