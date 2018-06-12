package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Environment;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ProgressBar;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.a.e;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.sns.i.d;
import com.tencent.mm.plugin.sns.i.e;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.i;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.q;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d.a;
import com.tencent.mm.plugin.sns.ui.OfflineVideoView;
import com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI;
import com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

public final class x
  extends com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.a
{
  public static int nFJ = 999;
  private Context context;
  private boolean djm;
  private ag dvh;
  private String fOr;
  private View gFD;
  int iGo = 0;
  private long lxh = 0L;
  VideoPlayerSeekBar nEG;
  ImageView nEH;
  private ImageView nEI;
  private TextView nEJ;
  private boolean nEL = false;
  boolean nEO = true;
  private boolean nEP = true;
  private boolean nEQ = false;
  private boolean nER = true;
  private boolean nES = false;
  private boolean nET = false;
  boolean nEU = true;
  boolean nEV = true;
  private int nEW = 0;
  private int nEX = 0;
  private int nEY = 0;
  private int nEZ = 0;
  private OfflineVideoView nFA;
  private ProgressBar nFB;
  private int nFC;
  private boolean nFD = true;
  private int nFE = 0;
  int nFF = 0;
  int nFG = 0;
  private boolean nFH = false;
  private boolean nFI;
  private boolean nFK = false;
  private int nFa = 0;
  int nFb = 0;
  ac nFc = null;
  public int njo = 0;
  public int njp = 0;
  public int njq = 0;
  
  public x(Context paramContext, q paramq, ViewGroup paramViewGroup)
  {
    super(paramContext, paramq, paramViewGroup);
    this.context = paramContext;
    this.dvh = new ag(Looper.getMainLooper());
    this.nFc = new x.1(this, paramContext);
  }
  
  private void aBJ()
  {
    if (this.nET)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Sns.AdLandingPageSightVideoComponent", "last download fail ,try again");
      this.nFA.bCl();
      return;
    }
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.Sns.AdLandingPageSightVideoComponent", "starting play");
    if ((!this.nFI) && (!TextUtils.isEmpty(this.fOr)))
    {
      this.nFA.BK(this.fOr);
      this.nFI = true;
    }
    this.nEI.setVisibility(8);
    this.dvh.post(new x.2(this));
    this.lxh = System.currentTimeMillis();
    this.nEY += 1;
  }
  
  private void bAf()
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.Sns.AdLandingPageSightVideoComponent", "pause play");
    if (!this.nFD) {
      this.nEI.setVisibility(0);
    }
    this.dvh.post(new Runnable()
    {
      public final void run()
      {
        x.a(x.this).bCm();
        x.this.nEG.setIsPlay(false);
      }
    });
    if (this.lxh != 0L)
    {
      this.nEX = ((int)(this.nEX + (System.currentTimeMillis() - this.lxh)));
      this.lxh = 0L;
    }
  }
  
  private boolean bAj()
  {
    if (!bi.oW(((q)this.nDt).nAm))
    {
      Intent localIntent = new Intent();
      localIntent.putExtra("sns_landig_pages_from_source", 14);
      localIntent.putExtra("sns_landig_pages_origin_from_source", ((q)this.nDt).nBk);
      localIntent.putExtra("sns_landing_pages_ux_info", ((q)this.nDt).ntU);
      localIntent.putExtra("sns_landing_pages_xml", "");
      localIntent.putExtra("sns_landing_pages_canvasid", ((q)this.nDt).nAm);
      localIntent.putExtra("sns_landing_pages_canvas_ext", ((q)this.nDt).nAn);
      localIntent.putExtra("sns_landing_pages_no_store", ((q)this.nDt).nAo);
      localIntent.putExtra("sns_landing_pages_need_enter_and_exit_animation", true);
      String str3;
      String str1;
      String str2;
      JSONObject localJSONObject;
      if (((this.context instanceof Activity)) && (((q)this.nDt).nBm == 2))
      {
        str3 = ((Activity)this.context).getIntent().getStringExtra("sns_landing_pages_sessionId");
        str1 = ((Activity)this.context).getIntent().getStringExtra("sns_landing_pages_ad_buffer");
        if (!bi.oW(str3))
        {
          str2 = String.valueOf(System.currentTimeMillis() / 1000L);
          localJSONObject = new JSONObject();
        }
      }
      for (;;)
      {
        try
        {
          localJSONObject.put("sessionId", str2);
          localJSONObject.put("cid", ((q)this.nDt).nAW);
          if (bi.oW(str1)) {
            continue;
          }
          localObject = str1;
          localJSONObject.put("adBuffer", localObject);
          localJSONObject.put("preSessionId", str3);
        }
        catch (Exception localException)
        {
          Object localObject;
          continue;
        }
        localIntent.putExtra("sns_landing_pages_search_extra", localJSONObject.toString());
        localIntent.putExtra("sns_landing_pages_sessionId", str2);
        localIntent.putExtra("sns_landing_pages_ad_buffer", str1);
        localObject = new int[2];
        this.nFA.getLocationOnScreen((int[])localObject);
        localIntent.putExtra("img_gallery_top", localObject[1]);
        localIntent.putExtra("img_gallery_left", localObject[0]);
        localIntent.putExtra("img_gallery_width", this.nFA.getWidth());
        localIntent.putExtra("img_gallery_height", this.nFA.getHeight());
        com.tencent.mm.bg.d.b(this.context, "sns", ".ui.SnsAdNativeLandingPagesPreviewUI", localIntent);
        return true;
        localObject = "";
      }
    }
    return false;
  }
  
  public final void W(int paramInt1, int paramInt2, int paramInt3)
  {
    super.W(paramInt1, paramInt2, paramInt3);
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.Sns.AdLandingPageSightVideoComponent", "height " + paramInt2);
    if ((paramInt1 == 0) || (paramInt2 == 0)) {}
    label233:
    label256:
    label291:
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
            this.nEG.setVisibility(4);
            this.nEH.setVisibility(0);
            this.gFD.setVisibility(0);
          }
          ah.i(new Runnable()
          {
            public final void run()
            {
              if (x.k(x.this)) {
                return;
              }
              if (x.this.nFc != null) {
                x.this.nFc.il(false);
              }
              x.this.nEG.setVisibility(4);
              x.this.nEH.setVisibility(8);
              x.j(x.this).setVisibility(4);
            }
          }, 3000L);
        }
        if (this.nEP)
        {
          if (localNetworkInfo != null) {
            break;
          }
          this.nEI.setVisibility(0);
          this.nFD = false;
          this.nES = false;
        }
        if (this.nEW != 0) {
          break label291;
        }
      } while (localNetworkInfo == null);
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
        break label233;
        bzC();
        this.nFK = true;
        break label256;
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
  
  public final boolean aa(JSONObject paramJSONObject)
  {
    if (!super.aa(paramJSONObject)) {
      return false;
    }
    try
    {
      paramJSONObject.put("sightDuration", this.nFC * 1000);
      paramJSONObject.put("playTimeInterval", this.nEX);
      paramJSONObject.put("playCount", this.nEY);
      paramJSONObject.put("playCompletedCount", this.nEZ);
      paramJSONObject.put("clickVoiceControlCount", this.nFb);
      if (this.nES) {}
      for (String str = "1";; str = "0")
      {
        paramJSONObject.put("isAutoPlay", str);
        if (((q)this.nDt).type == 61) {
          paramJSONObject.put("clickSightCount", this.nFF);
        }
        JSONObject localJSONObject;
        if (!this.nEV)
        {
          str = com.tencent.mm.sdk.platformtools.ac.ce(((q)this.nDt).nAN);
          localJSONObject = new JSONObject();
          localJSONObject.put("urlMd5", str);
          localJSONObject.put("needDownload", 1);
          paramJSONObject.put("sightUrlInfo", localJSONObject);
        }
        if (!this.nEU)
        {
          str = com.tencent.mm.sdk.platformtools.ac.ce(((q)this.nDt).nAO);
          localJSONObject = new JSONObject();
          localJSONObject.put("urlMd5", str);
          localJSONObject.put("needDownload", 1);
          paramJSONObject.put("thumbUrlInfo", localJSONObject);
        }
        paramJSONObject.put("streamVideoEnterCount", this.nFE);
        paramJSONObject.put("streamVideoPlayCount", this.njo);
        paramJSONObject.put("streamVideoPlayCompleteCount", this.njp);
        paramJSONObject.put("streamVideoTotalPlayTimeInMs", this.njq);
        return true;
      }
      return false;
    }
    catch (JSONException paramJSONObject)
    {
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.Sns.AdLandingPageSightVideoComponent", paramJSONObject, "", new Object[0]);
    }
  }
  
  public final void bAi()
  {
    q localq = (q)this.nDt;
    if (bi.oW(localq.nAP))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.Sns.AdLandingPageSightVideoComponent", "on long video button click without streamVideoUrl!");
      return;
    }
    if (!(this.context instanceof Activity))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.Sns.AdLandingPageSightVideoComponent", "on long video button click but context not activity!");
      return;
    }
    com.tencent.mm.sdk.platformtools.x.v("MicroMsg.Sns.AdLandingPageSightVideoComponent", "on long video button click, jumpto [%s]", new Object[] { localq.nAP });
    Intent localIntent = new Intent();
    localIntent.setClass(this.context, VideoAdPlayerUI.class);
    localIntent.putExtra("IsAd", true);
    localIntent.putExtra("KMediaId", com.tencent.mm.sdk.platformtools.ac.ce(localq.nAP));
    localIntent.putExtra("KThumUrl", localq.nAO);
    localIntent.putExtra("KStremVideoUrl", localq.nAP);
    localIntent.putExtra("ForceLandscape", true);
    localIntent.putExtra("ShareBtnHidden", 1);
    localIntent.putExtra("KComponentCid", bzU());
    ((Activity)this.context).startActivityForResult(localIntent, nFJ);
    this.nFE += 1;
  }
  
  public final void bAk()
  {
    if ((this.nFA != null) && (this.nEG != null) && (Math.abs(this.nFA.getCurrentPosition() - this.nEG.getmPosition()) > 1)) {
      this.nFA.R(this.nEG.getmPosition(), true);
    }
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
    int i = 1;
    if (!e.cn(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d.eH("adId", ((q)this.nDt).nAO))) {
      this.nEU = false;
    }
    if (!e.cn(Environment.getExternalStorageDirectory().toString() + "/tencent/MicroMsg/sns_ad_landingpages/adId_stream_" + com.tencent.mm.sdk.platformtools.ac.ce(((q)this.nDt).nAN))) {
      this.nEV = false;
    }
    Object localObject1 = this.contentView.findViewById(i.f.sns_ad_native_landing_pages_item_video_container);
    Object localObject2 = (ViewGroup)((View)localObject1).findViewById(i.f.sns_ad_native_landing_pages_item_sight_container);
    this.nFA = new OfflineVideoView(this.context);
    Object localObject3 = new LinearLayout.LayoutParams(-1, -1);
    ((ViewGroup)localObject2).addView(this.nFA, 0, (ViewGroup.LayoutParams)localObject3);
    int j;
    label313:
    boolean bool;
    if (((q)this.nDt).nAT == 1) {
      if ((int)((q)this.nDt).width > 0)
      {
        j = this.hmV * (int)((q)this.nDt).height / (int)((q)this.nDt).width;
        localObject3 = new RelativeLayout.LayoutParams(this.hmV, j);
        ((View)localObject1).setPadding((int)((q)this.nDt).nBa, (int)((q)this.nDt).nAY, (int)((q)this.nDt).nBb, (int)((q)this.nDt).nAZ);
        ((ViewGroup)localObject2).setLayoutParams((ViewGroup.LayoutParams)localObject3);
        ((View)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject3);
        localObject2 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d.eH("adId", ((q)this.nDt).nAO);
        if (!FileOp.cn((String)localObject2)) {
          break label1187;
        }
        this.nFA.NR((String)localObject2);
        this.nEJ = ((TextView)((View)localObject1).findViewById(i.f.errorTv));
        this.nEJ.setText(this.context.getString(i.j.download_fail));
        this.gFD = ((View)localObject1).findViewById(i.f.sns_ad_native_landing_pages_sight_background);
        if (this.gFD != null)
        {
          localObject2 = new RelativeLayout.LayoutParams(-1, -1);
          localObject3 = this.gFD.getParent();
          if ((localObject3 instanceof ViewGroup)) {
            ((ViewGroup)localObject3).removeView(this.gFD);
          }
          ((ViewGroup)localObject1).addView(this.gFD, (ViewGroup.LayoutParams)localObject2);
        }
        localObject2 = new RelativeLayout.LayoutParams(this.hmV - com.tencent.mm.bp.a.fromDPToPix(this.context, 30), -2);
        ((RelativeLayout.LayoutParams)localObject2).addRule(12);
        ((RelativeLayout.LayoutParams)localObject2).bottomMargin = this.context.getResources().getDimensionPixelSize(i.d.NoPadding);
        this.nEG = new VideoPlayerSeekBar(this.context);
        this.nEG.setVisibility(4);
        if (this.nFc != null)
        {
          localObject3 = this.nFc;
          if (this.nEG.getVisibility() != 0) {
            break label1218;
          }
          bool = true;
          label517:
          ((ac)localObject3).il(bool);
        }
        this.nEG.setIplaySeekCallback(new x.6(this));
        this.nEG.setOnPlayButtonClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            com.tencent.mm.sdk.platformtools.x.d("MicroMsg.Sns.AdLandingPageSightVideoComponent", "btn onclick view [%b] bar[%b]", new Object[] { Boolean.valueOf(x.a(x.this).isPlaying()), Boolean.valueOf(x.this.nEG.bPb) });
            x.b(x.this);
            if (x.this.nEG.bPb)
            {
              x.c(x.this);
              x.a(x.this, 4);
              x.f(x.this);
              return;
            }
            if (x.this.nEO) {
              x.this.bzy();
            }
            for (;;)
            {
              x.e(x.this);
              x.a(x.this, 3);
              if (!x.this.nzP) {
                break;
              }
              x.this.bzD();
              break;
              x.this.bzC();
              x.d(x.this);
            }
          }
        });
        this.nEG.setIsPlay(this.nFA.isPlaying());
        this.nEG.seek(0);
        ((ViewGroup)localObject1).addView(this.nEG, (ViewGroup.LayoutParams)localObject2);
        this.nEH = ((ImageView)((View)localObject1).findViewById(i.f.sns_ad_native_landing_pages_sight_voice_btn));
        this.nEH.setVisibility(0);
        this.nEH.setOnClickListener(new x.8(this));
        this.nEH.setPadding(0, 0, com.tencent.mm.bp.a.fromDPToPix(this.context, 8), com.tencent.mm.bp.a.fromDPToPix(this.context, 13));
        localObject2 = this.nEH.getParent();
        if ((localObject2 instanceof ViewGroup)) {
          ((ViewGroup)localObject2).removeView(this.nEH);
        }
        ((ViewGroup)localObject1).addView(this.nEH);
        this.nEI = ((ImageView)((View)localObject1).findViewById(i.f.status_btn));
        this.nEI.setImageDrawable(com.tencent.mm.bp.a.f(this.context, i.i.shortvideo_play_btn));
        this.nEI.setVisibility(8);
        this.nEI.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            x.b(x.this);
            x.e(x.this);
            x.h(x.this);
            if (x.i(x.this)) {
              if (x.this.nEO) {
                x.this.bzy();
              }
            }
            for (;;)
            {
              x.a(x.this, 3);
              x.this.nEG.setVisibility(4);
              x.this.nEH.setVisibility(0);
              x.j(x.this).setVisibility(0);
              if (x.this.nFc != null) {
                x.this.nFc.il(true);
              }
              ah.i(new x.9.1(this), 10000L);
              return;
              x.this.bzC();
              x.d(x.this);
              continue;
              x.this.bzC();
              x.d(x.this);
              x.g(x.this);
            }
          }
        });
        this.nFA.setVideoCallback(new x.10(this));
        this.nEG.setVisibility(4);
        this.nEH.setVisibility(8);
        this.gFD.setVisibility(4);
        if (this.nFc != null)
        {
          localObject2 = this.nFc;
          if (this.nEG.getVisibility() != 0) {
            break label1224;
          }
          bool = true;
          label820:
          ((ac)localObject2).il(bool);
        }
        this.nFA.setOnClickListener(new x.11(this));
        this.nFB = ((ProgressBar)((View)localObject1).findViewById(i.f.progressbar));
        this.nFB.setVisibility(8);
        localObject1 = (q)this.nDt;
        if ((((q)localObject1).bID != 1) || (((q)localObject1).nAQ.length() <= 0) || (((q)localObject1).nAP.length() <= 0)) {
          break label1230;
        }
      }
    }
    for (;;)
    {
      if (i != 0)
      {
        localObject1 = this.contentView.findViewById(i.f.sns_ad_native_landing_pages_item_stream_video_click_area);
        ((View)localObject1).setVisibility(0);
        localObject2 = (Button)((View)localObject1).findViewById(i.f.sns_ad_native_landing_pages_item_stream_video_click_area_button);
        ((Button)localObject2).setTextColor(((q)this.nDt).nAR);
        ((Button)localObject2).setText(((q)this.nDt).nAQ);
        ((Button)localObject2).setOnClickListener(new x.12(this));
        ((View)localObject1).findViewById(i.f.sns_ad_native_landing_pages_item_stream_video_click_area_separator).setBackgroundColor(((q)this.nDt).nAS);
      }
      return this.contentView;
      ((ViewGroup)localObject2).setLayoutParams(new RelativeLayout.LayoutParams(this.hmV, this.hmW));
      ((View)localObject1).setLayoutParams(new RelativeLayout.LayoutParams(this.hmV, this.hmW));
      ((View)localObject1).setMinimumHeight(this.hmW);
      break;
      j = (int)((q)this.nDt).width;
      int k = (int)((q)this.nDt).height;
      ((ViewGroup)localObject2).setLayoutParams(new RelativeLayout.LayoutParams(j, k));
      localObject2 = new RelativeLayout.LayoutParams(j, k);
      ((RelativeLayout.LayoutParams)localObject2).leftMargin = ((int)((q)this.nDt).nBa);
      ((RelativeLayout.LayoutParams)localObject2).rightMargin = ((int)((q)this.nDt).nBb);
      ((RelativeLayout.LayoutParams)localObject2).topMargin = ((int)((q)this.nDt).nAY);
      ((RelativeLayout.LayoutParams)localObject2).bottomMargin = ((int)((q)this.nDt).nAZ);
      ((View)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject2);
      break;
      label1187:
      com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d.b("adId", ((q)this.nDt).nAO, false, 1000000001, new d.a()
      {
        public final void MX(String paramAnonymousString)
        {
          x.a(x.this).NR(paramAnonymousString);
        }
        
        public final void bxo() {}
        
        public final void bzS() {}
      });
      break label313;
      label1218:
      bool = false;
      break label517;
      label1224:
      bool = false;
      break label820;
      label1230:
      i = 0;
    }
  }
  
  protected final void bzQ()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Sns.AdLandingPageSightVideoComponent", getClass().getName() + "not support update now");
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


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */