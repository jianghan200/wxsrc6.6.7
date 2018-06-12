package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Environment;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ProgressBar;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.a.e;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.sight.decode.ui.b;
import com.tencent.mm.plugin.sns.i.d;
import com.tencent.mm.plugin.sns.i.e;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.i;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.w;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d;
import com.tencent.mm.plugin.sns.ui.OfflineVideoView;
import com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

public final class z
  extends y
{
  private Context context;
  boolean djm;
  ag dvh;
  String fOr;
  View gFD;
  int iGo;
  long lxh;
  VideoPlayerSeekBar nEG;
  ImageView nEH;
  private ImageView nEI;
  private TextView nEJ;
  boolean nEL;
  boolean nEO;
  boolean nEP;
  private boolean nEQ;
  private boolean nER;
  private boolean nES;
  boolean nET;
  boolean nEU;
  boolean nEV;
  int nEW;
  int nEX;
  private int nEY;
  int nEZ;
  OfflineVideoView nFA;
  private ProgressBar nFB;
  int nFC;
  boolean nFD;
  int nFG;
  boolean nFH;
  boolean nFI;
  boolean nFK;
  int nFa;
  int nFb;
  ac nFc;
  
  public final void W(int paramInt1, int paramInt2, int paramInt3)
  {
    super.W(paramInt1, paramInt2, paramInt3);
    x.d("MicroMsg.Sns.AdLandingPageStreamVideoComponentOnlinePlayer", "height " + paramInt2);
    if ((paramInt1 == 0) || (paramInt2 == 0)) {}
    label244:
    label276:
    label311:
    do
    {
      NetworkInfo localNetworkInfo;
      do
      {
        do
        {
          do
          {
            return;
            this.nFG = paramInt1;
            this.iGo = paramInt2;
          } while (paramInt1 < 0);
          if (paramInt1 < 0.5F * paramInt2) {
            break;
          }
        } while ((this.nEQ) && (!this.nER));
        this.nFK = false;
        this.nER = false;
        this.nEQ = true;
        localNetworkInfo = ((ConnectivityManager)ad.getContext().getSystemService("connectivity")).getActiveNetworkInfo();
        if ((!this.nEP) || ((this.nEP) && (localNetworkInfo != null) && (localNetworkInfo.getType() == 1)))
        {
          if (this.nFc != null) {
            this.nFc.il(true);
          }
          if (this.nEG.getVideoTotalTime() > 0)
          {
            this.nEG.setVisibility(0);
            this.nEH.setVisibility(0);
            this.gFD.setVisibility(0);
          }
          ah.i(new Runnable()
          {
            public final void run()
            {
              if (z.this.nFH) {
                return;
              }
              if (z.this.nFc != null) {
                z.this.nFc.il(false);
              }
              z.this.nEG.setVisibility(4);
              z.this.nEH.setVisibility(8);
              z.this.gFD.setVisibility(4);
            }
          }, 3000L);
        }
        if (this.nEP)
        {
          if ((localNetworkInfo != null) && ((localNetworkInfo == null) || (localNetworkInfo.getType() == 1))) {
            break;
          }
          this.nEI.setVisibility(0);
          this.nFD = false;
          this.nES = false;
        }
        if (this.nEW != 0) {
          break label311;
        }
      } while ((localNetworkInfo == null) || (localNetworkInfo.getType() != 1));
      if (this.nEO)
      {
        bzy();
        this.nEW = 1;
      }
      for (;;)
      {
        aBJ();
        return;
        this.nES = true;
        this.nEP = false;
        break label244;
        bzC();
        this.nFK = true;
        break label276;
        if (this.nEW == 2)
        {
          if (this.nEO) {
            bzy();
          }
          for (;;)
          {
            aBJ();
            this.nEW = 1;
            return;
            bzC();
            this.nFK = true;
          }
        }
        if (this.nEW != 3) {
          break;
        }
        if (this.nEO)
        {
          bzy();
        }
        else
        {
          bzC();
          this.nFK = true;
        }
      }
      this.nFK = false;
      this.nER = false;
      this.nEQ = false;
      bAf();
    } while (this.nEW != 1);
    this.nEW = 2;
  }
  
  final void aBJ()
  {
    if (this.nET)
    {
      x.i("MicroMsg.Sns.AdLandingPageStreamVideoComponentOnlinePlayer", "last download fail ,try again");
      this.nFA.bCl();
      return;
    }
    x.d("MicroMsg.Sns.AdLandingPageStreamVideoComponentOnlinePlayer", "starting play");
    if ((!this.nFI) && (!TextUtils.isEmpty(this.fOr)))
    {
      this.nFA.BK(this.fOr);
      this.nFI = true;
    }
    this.nEI.setVisibility(8);
    this.dvh.post(new z.10(this));
    this.lxh = System.currentTimeMillis();
    this.nEY += 1;
  }
  
  public final boolean aa(JSONObject paramJSONObject)
  {
    if (!super.aa(paramJSONObject)) {
      return false;
    }
    try
    {
      paramJSONObject.put("streamVideoDuraion", this.nFC * 1000);
      paramJSONObject.put("playTimeInterval", this.nEX);
      paramJSONObject.put("playCount", this.nEY);
      paramJSONObject.put("playCompletedCount", this.nEZ);
      paramJSONObject.put("clickPlayControlCount", this.nFa);
      paramJSONObject.put("clickVoiceControlCount", this.nFb);
      if (this.nES) {}
      for (String str = "1";; str = "0")
      {
        paramJSONObject.put("isAutoPlay", str);
        if (!this.nEU)
        {
          str = com.tencent.mm.sdk.platformtools.ac.ce(((w)this.nDt).nBz);
          localJSONObject = new JSONObject();
          localJSONObject.put("urlMd5", str);
          localJSONObject.put("needDownload", 1);
          paramJSONObject.put("thumbUrlInfo", localJSONObject);
        }
        if (this.nEV) {
          break;
        }
        str = com.tencent.mm.sdk.platformtools.ac.ce(((w)this.nDt).nAP);
        JSONObject localJSONObject = new JSONObject();
        localJSONObject.put("urlMd5", str);
        localJSONObject.put("needDownload", 1);
        paramJSONObject.put("streamVideoUrlInfo", localJSONObject);
        break;
      }
      return true;
    }
    catch (JSONException paramJSONObject)
    {
      x.printErrStackTrace("MicroMsg.Sns.AdLandingPageStreamVideoComponentOnlinePlayer", paramJSONObject, "", new Object[0]);
      return false;
    }
  }
  
  final void bAf()
  {
    x.d("MicroMsg.Sns.AdLandingPageStreamVideoComponentOnlinePlayer", "pause play");
    if (!this.nFD) {
      this.nEI.setVisibility(0);
    }
    this.dvh.post(new z.1(this));
    if (this.lxh != 0L)
    {
      this.nEX = ((int)(this.nEX + (System.currentTimeMillis() - this.lxh)));
      this.lxh = 0L;
    }
  }
  
  public final int bAl()
  {
    if (this.nEG.getVisibility() == 0)
    {
      int[] arrayOfInt = new int[2];
      this.nEG.getLocationOnScreen(arrayOfInt);
      return this.hmW - arrayOfInt[1] - (this.nEG.getHeight() >>> 1);
    }
    return -1;
  }
  
  public final void bzA()
  {
    super.bzA();
  }
  
  public final void bzB()
  {
    super.bzB();
    bAf();
    this.nFK = false;
    if ((!this.nEQ) && (!this.nER)) {}
    do
    {
      return;
      this.nER = false;
      this.nEQ = false;
    } while (this.nEW != 1);
    this.nEW = 2;
  }
  
  public final void bzC()
  {
    super.bzC();
    this.nEH.setImageDrawable(com.tencent.mm.bp.a.f(this.context, i.e.landing_page_video_sound_on));
    this.nFA.setMute(false);
    this.nEO = false;
  }
  
  public final View bzM()
  {
    boolean bool2 = true;
    if (!e.cn(d.eH("adId", ((w)this.nDt).nBz))) {
      this.nEU = false;
    }
    if (!e.cn(Environment.getExternalStorageDirectory().toString() + "/tencent/MicroMsg/sns_ad_landingpages/adId_stream_" + com.tencent.mm.sdk.platformtools.ac.ce(((w)this.nDt).nAP))) {
      this.nEV = false;
    }
    View localView = this.contentView.findViewById(i.f.sns_ad_native_landing_pages_item_video_container);
    Object localObject1 = (ViewGroup)localView.findViewById(i.f.sns_ad_native_landing_pages_item_sight_container);
    this.nFA = new OfflineVideoView(this.context);
    Object localObject2 = new LinearLayout.LayoutParams(-1, -1);
    ((ViewGroup)localObject1).addView(this.nFA, 0, (ViewGroup.LayoutParams)localObject2);
    int i;
    if (((w)this.nDt).nBA == 1) {
      if ((int)((w)this.nDt).width > 0)
      {
        i = this.hmV * (int)((w)this.nDt).height / (int)((w)this.nDt).width;
        localObject2 = new RelativeLayout.LayoutParams(this.hmV, i);
        localView.setPadding((int)((w)this.nDt).nBa, (int)((w)this.nDt).nAY, (int)((w)this.nDt).nBb, (int)((w)this.nDt).nAZ);
        ((ViewGroup)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject2);
        localView.setLayoutParams((ViewGroup.LayoutParams)localObject2);
        localView.setMinimumHeight(i);
        localObject1 = d.eH("adId", ((w)this.nDt).nBz);
        if (!FileOp.cn((String)localObject1)) {
          break label1024;
        }
        this.nFA.NR((String)localObject1);
        label319:
        this.nEJ = ((TextView)localView.findViewById(i.f.errorTv));
        this.nEJ.setText(this.context.getString(i.j.download_fail));
        this.gFD = localView.findViewById(i.f.sns_ad_native_landing_pages_sight_background);
        if (this.gFD != null)
        {
          localObject1 = new RelativeLayout.LayoutParams(this.hmV, this.hmW);
          localObject2 = this.gFD.getParent();
          if ((localObject2 instanceof ViewGroup)) {
            ((ViewGroup)localObject2).removeView(this.gFD);
          }
          ((ViewGroup)localView).addView(this.gFD, (ViewGroup.LayoutParams)localObject1);
        }
        localObject1 = new RelativeLayout.LayoutParams(this.hmV - com.tencent.mm.bp.a.fromDPToPix(this.context, 30), -2);
        ((RelativeLayout.LayoutParams)localObject1).addRule(12);
        ((RelativeLayout.LayoutParams)localObject1).bottomMargin = this.context.getResources().getDimensionPixelSize(i.d.NoPadding);
        this.nEG = new VideoPlayerSeekBar(this.context);
        this.nEG.setVisibility(4);
        if (this.nFc != null)
        {
          localObject2 = this.nFc;
          if (this.nEG.getVisibility() != 0) {
            break label1055;
          }
          bool1 = true;
          label528:
          ((ac)localObject2).il(bool1);
        }
        this.nEG.setIplaySeekCallback(new b()
        {
          public final void ajO()
          {
            if (z.this.nFA != null) {
              z.this.nFA.bCm();
            }
          }
          
          public final void kV(int paramAnonymousInt)
          {
            x.i("MicroMsg.Sns.AdLandingPageStreamVideoComponentOnlinePlayer", "onSeek time " + paramAnonymousInt);
            if (z.this.nEO) {
              z.this.bzy();
            }
            for (;;)
            {
              z.this.nFA.S(paramAnonymousInt, z.this.nEG.bPb);
              return;
              z.this.bzC();
            }
          }
        });
        this.nEG.setOnPlayButtonClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            x.d("MicroMsg.Sns.AdLandingPageStreamVideoComponentOnlinePlayer", "btn onclick view [%b] bar[%b]", new Object[] { Boolean.valueOf(z.this.nFA.isPlaying()), Boolean.valueOf(z.this.nEG.bPb) });
            z.this.nFD = true;
            if (z.this.nEG.bPb)
            {
              z.this.bAf();
              z.this.nEW = 4;
              if (z.this.nzR)
              {
                paramAnonymousView = z.this;
                paramAnonymousView.nFa += 1;
              }
              return;
            }
            if (z.this.nEO) {
              z.this.bzy();
            }
            for (;;)
            {
              z.this.aBJ();
              z.this.nEW = 3;
              if (!z.this.nzP) {
                break;
              }
              z.this.bzD();
              break;
              z.this.bzC();
              z.this.nFK = true;
            }
          }
        });
        this.nEG.setIsPlay(this.nFA.isPlaying());
        this.nEG.seek(0);
        ((ViewGroup)localView).addView(this.nEG, (ViewGroup.LayoutParams)localObject1);
        this.nEH = ((ImageView)localView.findViewById(i.f.sns_ad_native_landing_pages_sight_voice_btn));
        this.nEH.setVisibility(0);
        this.nEH.setOnClickListener(new z.6(this));
        this.nEH.setPadding(0, 0, com.tencent.mm.bp.a.fromDPToPix(this.context, 8), com.tencent.mm.bp.a.fromDPToPix(this.context, 13));
        localObject1 = this.nEH.getParent();
        if ((localObject1 instanceof ViewGroup)) {
          ((ViewGroup)localObject1).removeView(this.nEH);
        }
        ((ViewGroup)localView).addView(this.nEH);
        this.nEI = ((ImageView)localView.findViewById(i.f.status_btn));
        this.nEI.setImageDrawable(com.tencent.mm.bp.a.f(this.context, i.i.shortvideo_play_btn));
        this.nEI.setVisibility(8);
        this.nEI.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            z.this.nFD = true;
            z.this.aBJ();
            z.this.nEP = false;
            if (z.this.nEL) {
              if (z.this.nEO) {
                z.this.bzy();
              }
            }
            for (;;)
            {
              z.this.nEW = 3;
              z.this.nEG.setVisibility(0);
              z.this.nEH.setVisibility(0);
              z.this.gFD.setVisibility(0);
              if (z.this.nFc != null) {
                z.this.nFc.il(true);
              }
              ah.i(new z.7.1(this), 10000L);
              return;
              z.this.bzC();
              z.this.nFK = true;
              continue;
              z.this.bzC();
              z.this.nFK = true;
              z.this.nEL = true;
            }
          }
        });
        this.nFA.setVideoCallback(new z.8(this));
        this.nEG.setVisibility(4);
        this.nEH.setVisibility(8);
        this.gFD.setVisibility(4);
        if (this.nFc != null)
        {
          localObject1 = this.nFc;
          if (this.nEG.getVisibility() != 0) {
            break label1060;
          }
        }
      }
    }
    label1024:
    label1055:
    label1060:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      ((ac)localObject1).il(bool1);
      this.nFA.setOnClickListener(new z.9(this));
      this.nFB = ((ProgressBar)localView.findViewById(i.f.progressbar));
      this.nFB.setVisibility(8);
      return this.contentView;
      ((ViewGroup)localObject1).setLayoutParams(new RelativeLayout.LayoutParams(this.hmV, this.hmW));
      localView.setLayoutParams(new RelativeLayout.LayoutParams(this.hmV, this.hmW));
      localView.setMinimumHeight(this.hmW);
      break;
      i = this.hmW;
      localObject2 = new RelativeLayout.LayoutParams(this.hmV, i);
      localView.setPadding((int)((w)this.nDt).nBa, (int)((w)this.nDt).nAY, (int)((w)this.nDt).nBb, (int)((w)this.nDt).nAZ);
      ((ViewGroup)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject2);
      localView.setLayoutParams((ViewGroup.LayoutParams)localObject2);
      localView.setMinimumHeight(i);
      break;
      d.b("adId", ((w)this.nDt).nBz, false, 1000000001, new z.3(this));
      break label319;
      bool1 = false;
      break label528;
    }
  }
  
  protected final void bzQ()
  {
    x.i("MicroMsg.Sns.AdLandingPageStreamVideoComponentOnlinePlayer", getClass().getName() + "not support update now");
  }
  
  public final void bzy()
  {
    super.bzy();
    this.nEH.setImageDrawable(com.tencent.mm.bp.a.f(this.context, i.e.landing_page_video_sound_off));
    this.nFA.setMute(true);
    this.nEO = true;
  }
  
  public final void bzz()
  {
    super.bzz();
    this.nFA.onDestroy();
  }
  
  protected final int getLayout()
  {
    return i.g.sns_ad_native_landing_pages_item_sight;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */