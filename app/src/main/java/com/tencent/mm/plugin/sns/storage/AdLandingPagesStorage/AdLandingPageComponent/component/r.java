package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Looper;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.a.e;
import com.tencent.mm.bp.a;
import com.tencent.mm.plugin.sight.decode.ui.b;
import com.tencent.mm.plugin.sns.i.e;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.i;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.w;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d;
import com.tencent.mm.pluginsdk.ui.h.b;
import com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONException;
import org.json.JSONObject;

public final class r
  extends y
  implements b, h.b
{
  private Context context;
  private ag dvh;
  private ProgressBar eIB;
  private View gFD;
  ImageView jBN;
  private long lxh = 0L;
  AdLandingVideoWrapper nEF;
  VideoPlayerSeekBar nEG;
  private ImageView nEH;
  private ImageView nEI;
  private TextView nEJ;
  private Runnable nEK;
  boolean nEL = false;
  boolean nEM = false;
  boolean nEN = false;
  boolean nEO = true;
  boolean nEP = true;
  private boolean nEQ = false;
  private boolean nER = true;
  private boolean nES = false;
  private boolean nET = false;
  private boolean nEU = false;
  private boolean nEV = false;
  int nEW = 0;
  private int nEX = 0;
  private int nEY = 0;
  private int nEZ = 0;
  int nFa = 0;
  int nFb = 0;
  private ac nFc = null;
  private View.OnClickListener nFd = new r.5(this);
  private View.OnClickListener nFe = new r.6(this);
  private View.OnClickListener nFf = new r.7(this);
  private View.OnClickListener nFg = new r.8(this);
  
  public r(Context paramContext, w paramw, ViewGroup paramViewGroup)
  {
    super(paramContext, paramw, paramViewGroup);
    this.context = paramContext;
    this.dvh = new ag(Looper.getMainLooper());
    this.nEK = new r.1(this);
    this.nFc = new r.3(this, paramContext);
  }
  
  private void aBJ()
  {
    x.d("MicroMsg.Sns.AdLandingPageNewStreamVideoComponent", "starting play");
    if (this.nET)
    {
      x.i("MicroMsg.Sns.AdLandingPageNewStreamVideoComponent", "last download fail ,try again");
      this.nEF.c(false, ((w)this.nDt).nAP, 0);
      wP(0);
      return;
    }
    this.dvh.post(new r.9(this));
    this.lxh = System.currentTimeMillis();
    this.nEY += 1;
  }
  
  public final void W(int paramInt1, int paramInt2, int paramInt3)
  {
    super.W(paramInt1, paramInt2, paramInt3);
    x.d("MicroMsg.Sns.AdLandingPageNewStreamVideoComponent", "height " + paramInt2);
    if ((paramInt1 == 0) || (paramInt2 == 0)) {}
    label36:
    label226:
    do
    {
      NetworkInfo localNetworkInfo;
      do
      {
        do
        {
          break label36;
          break label36;
          do
          {
            return;
          } while (paramInt1 < 0);
          if (paramInt1 < 0.5F * paramInt2) {
            break;
          }
        } while ((this.nEQ) && (!this.nER));
        this.nER = false;
        this.nEQ = true;
        localNetworkInfo = ((ConnectivityManager)ad.getContext().getSystemService("connectivity")).getActiveNetworkInfo();
        if ((!this.nEP) || ((this.nEP) && (localNetworkInfo != null) && (localNetworkInfo.getType() == 1)))
        {
          ik(true);
          ah.i(new r.2(this), 3000L);
        }
        if (this.nEP)
        {
          if ((localNetworkInfo == null) || ((localNetworkInfo != null) && (localNetworkInfo.getType() != 1)))
          {
            this.nEI.setVisibility(0);
            this.nES = false;
            this.nEP = false;
            return;
          }
          this.nES = true;
          this.nEP = false;
        }
        if (this.nEW != 0) {
          break;
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
        bzC();
        break label226;
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
          }
        }
        if (this.nEW != 3) {
          break;
        }
        if (this.nEO) {
          bzy();
        } else {
          bzC();
        }
      }
      this.nER = false;
      this.nEQ = false;
      bAf();
    } while (this.nEW != 1);
    this.nEW = 2;
  }
  
  public final boolean aa(JSONObject paramJSONObject)
  {
    if (!super.aa(paramJSONObject)) {
      return false;
    }
    try
    {
      paramJSONObject.put("streamVideoDuraion", this.nEF.getVideoDurationSec() * 1000);
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
      x.printErrStackTrace("MicroMsg.Sns.AdLandingPageNewStreamVideoComponent", paramJSONObject, "", new Object[0]);
      return false;
    }
  }
  
  public final void ajO()
  {
    if (this.nEF != null) {
      this.nEF.SL();
    }
    this.nEN = true;
  }
  
  final void bAf()
  {
    x.d("MicroMsg.Sns.AdLandingPageNewStreamVideoComponent", "pause play");
    this.dvh.post(new r.10(this));
    if (this.lxh != 0L)
    {
      this.nEX = ((int)(this.nEX + (System.currentTimeMillis() - this.lxh)));
      this.lxh = 0L;
    }
  }
  
  public final void bu(String paramString1, String paramString2)
  {
    this.nET = false;
  }
  
  public final void bv(String paramString1, String paramString2)
  {
    this.nEZ += 1;
    ik(true);
    if (this.lxh != 0L)
    {
      this.nEX = ((int)(this.nEX + (System.currentTimeMillis() - this.lxh)));
      this.lxh = 0L;
    }
    this.nEW = 5;
    this.nEF.SL();
  }
  
  public final void bw(String paramString1, String paramString2) {}
  
  public final void bx(String paramString1, String paramString2)
  {
    if (this.jBN.getVisibility() == 0)
    {
      this.jBN.setVisibility(8);
      this.eIB.setVisibility(8);
    }
  }
  
  public final void by(String paramString1, String paramString2) {}
  
  public final void bz(String paramString1, String paramString2) {}
  
  public final void bzA()
  {
    super.bzA();
  }
  
  public final void bzB()
  {
    super.bzB();
    bAf();
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
    this.nEH.setImageDrawable(a.f(this.context, i.e.landing_page_video_sound_on));
    this.nEF.setMute(false);
    this.nEO = false;
  }
  
  public final View bzM()
  {
    View localView = this.contentView.findViewById(i.f.content_root);
    localView.setBackgroundColor(-16777216);
    int k = this.hmV;
    int j = this.hmW;
    int i = j;
    if (((w)this.nDt).nBA == 1)
    {
      i = j;
      if ((int)((w)this.nDt).width > 0) {
        i = k * (int)((w)this.nDt).height / (int)((w)this.nDt).width;
      }
    }
    else
    {
      localView.setPadding((int)((w)this.nDt).nBa, (int)((w)this.nDt).nAY, (int)((w)this.nDt).nBb, (int)((w)this.nDt).nAZ);
    }
    localView.setLayoutParams(new RelativeLayout.LayoutParams(k, i));
    localView.setMinimumHeight(i);
    this.nEF = ((AdLandingVideoWrapper)localView.findViewById(i.f.video_view));
    this.nEF.setIMMVideoViewCallback(this);
    this.nEF.setOnClickListener(this.nFg);
    this.nEF.c(false, ((w)this.nDt).nAP, 0);
    this.nEF.setIsShowBasicControls(true);
    this.eIB = ((ProgressBar)localView.findViewById(i.f.progressbar));
    this.jBN = ((ImageView)localView.findViewById(i.f.thumb_iv));
    Object localObject = d.eH("adId", ((w)this.nDt).nBz);
    if (!e.cn((String)localObject)) {
      this.nEU = false;
    }
    if (this.nEU)
    {
      this.jBN.setImageBitmap(MMBitmapFactory.decodeFile((String)localObject));
      this.nEJ = ((TextView)localView.findViewById(i.f.errorTv));
      this.nEJ.setText(this.context.getString(i.j.download_fail));
      this.gFD = localView.findViewById(i.f.sns_ad_native_landing_pages_sight_background);
      this.gFD.setVisibility(4);
      this.nEG = new VideoPlayerSeekBar(this.context);
      this.nEG.setVisibility(4);
      if (this.nFc != null)
      {
        localObject = this.nFc;
        if (this.nEG.getVisibility() != 0) {
          break label654;
        }
      }
    }
    label654:
    for (boolean bool = true;; bool = false)
    {
      ((ac)localObject).il(bool);
      this.nEG.setIplaySeekCallback(this);
      this.nEG.setOnPlayButtonClickListener(this.nFd);
      localObject = new RelativeLayout.LayoutParams(k - a.fromDPToPix(this.context, 30), -2);
      ((RelativeLayout.LayoutParams)localObject).addRule(12);
      this.nEG.setLayoutParams((ViewGroup.LayoutParams)localObject);
      this.nEF.setVideoFooterView(this.nEG);
      this.nEH = ((ImageView)localView.findViewById(i.f.sns_ad_native_landing_pages_sight_voice_btn));
      this.nEH.setVisibility(4);
      this.nEH.setOnClickListener(this.nFe);
      this.nEH.setPadding(0, 0, a.fromDPToPix(this.context, 8), 0);
      this.nEI = ((ImageView)localView.findViewById(i.f.status_btn));
      this.nEI.setImageDrawable(a.f(this.context, i.i.shortvideo_play_btn));
      this.nEI.setVisibility(8);
      this.nEI.setOnClickListener(this.nFf);
      ((ViewGroup)this.nEG.getParent()).removeView(this.nEG);
      ((RelativeLayout.LayoutParams)localObject).bottomMargin = 0;
      ((ViewGroup)localView).addView(this.nEG, (ViewGroup.LayoutParams)localObject);
      return this.contentView;
      d.b("adId", ((w)this.nDt).nBz, false, 1000000001, new r.4(this));
      break;
    }
  }
  
  protected final void bzQ() {}
  
  public final void bzy()
  {
    super.bzy();
    this.nEH.setImageDrawable(a.f(this.context, i.e.landing_page_video_sound_off));
    this.nEF.setMute(true);
    this.nEO = true;
  }
  
  public final void bzz()
  {
    super.bzz();
    this.nEF.ajZ();
  }
  
  public final void d(String paramString1, String paramString2, int paramInt1, int paramInt2) {}
  
  public final void d(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2)
  {
    x.e("MicroMsg.Sns.AdLandingPageNewStreamVideoComponent", "online play error, %s", new Object[] { paramString3 });
    this.nET = true;
  }
  
  protected final int getLayout()
  {
    return i.g.sns_ad_native_landing_pages_item_new_stream;
  }
  
  final void ik(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.nEG.setVisibility(0);
      this.nEH.setVisibility(0);
      this.gFD.setVisibility(0);
      if (this.nFc != null) {
        this.nFc.il(true);
      }
      this.dvh.postDelayed(this.nEK, 5000L);
      return;
    }
    this.nEG.setVisibility(4);
    this.nEH.setVisibility(8);
    this.gFD.setVisibility(4);
    if (this.nFc != null) {
      this.nFc.il(false);
    }
    this.dvh.removeCallbacks(this.nEK);
  }
  
  public final void kV(int paramInt)
  {
    x.i("MicroMsg.Sns.AdLandingPageNewStreamVideoComponent", "onSeek time " + paramInt);
    if (this.nEO) {
      bzy();
    }
    for (;;)
    {
      wP(paramInt);
      return;
      bzD();
      bzC();
    }
  }
  
  final void wP(int paramInt)
  {
    if (this.nEF != null)
    {
      this.nEI.setVisibility(8);
      if (this.jBN.getVisibility() == 0) {
        this.eIB.setVisibility(0);
      }
      this.nEF.x(paramInt, true);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */