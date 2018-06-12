package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.Display;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.mm.modelsns.SnsAdClick;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.f;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.g;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.g.a;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.i;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.j;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.s;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e;
import com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI;
import com.tencent.mm.pluginsdk.ui.d.c;
import com.tencent.mm.pluginsdk.ui.d.c.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.List;
import java.util.Map;

public class l
  extends k
{
  RelativeLayout kFI;
  Button nDG;
  View nDH;
  
  public l(Context paramContext, com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.l paraml, ViewGroup paramViewGroup)
  {
    super(paramContext, paraml, paramViewGroup);
  }
  
  protected final com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.l bAa()
  {
    return (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.l)this.nDt;
  }
  
  protected final void bAb()
  {
    Object localObject4 = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.l)this.nDt;
    Object localObject1 = "";
    int j = 0;
    int i;
    if ((this.context instanceof Activity))
    {
      localObject1 = ad.Na(((Activity)this.context).getIntent().getStringExtra("sns_landing_pages_rawSnsId"));
      i = ((Activity)this.context).getIntent().getIntExtra("sns_landig_pages_from_source", 0);
      j = ((Activity)this.context).getIntent().getIntExtra("sns_landing_pages_adType", 0);
    }
    for (;;)
    {
      Object localObject2;
      Object localObject3;
      if (((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.l)localObject4).bID == 4)
      {
        localObject2 = (f)localObject4;
        localObject1 = ((f)localObject2).hwD;
        if (!(this.context instanceof SnsAdNativeLandingPagesUI)) {
          break label1440;
        }
        localObject3 = (SnsAdNativeLandingPagesUI)this.context;
        localObject4 = ((f)localObject2).hvN;
        if ((localObject4 != null) && (((SnsAdNativeLandingPagesUI)localObject3).nSn.containsKey(localObject4))) {
          localObject1 = (String)((SnsAdNativeLandingPagesUI)localObject3).nSn.get(localObject4);
        }
      }
      label565:
      label592:
      label977:
      label1018:
      label1024:
      label1426:
      label1440:
      for (;;)
      {
        x.i("MicroMsg.Sns.AdLandingPageBtnComponent", "ext is " + (String)localObject1);
        localObject3 = new Intent();
        ((Intent)localObject3).putExtra("key_card_id", ((f)localObject2).hvN);
        ((Intent)localObject3).putExtra("key_card_ext", (String)localObject1);
        ((Intent)localObject3).putExtra("key_from_scene", 21);
        ((Intent)localObject3).putExtra("key_stastic_scene", 15);
        com.tencent.mm.bg.d.b(this.context, "card", ".ui.CardDetailUI", (Intent)localObject3);
        do
        {
          return;
          break;
          if (((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.l)localObject4).bID != 8) {
            break label592;
          }
        } while (!((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.l)this.nDt instanceof j));
        localObject3 = "";
        if (((this.context instanceof Activity)) && (bzT().nBm == 2)) {
          localObject3 = ((Activity)this.context).getIntent().getStringExtra("sns_landing_pages_sessionId");
        }
        for (localObject2 = ((Activity)this.context).getIntent().getStringExtra("sns_landing_pages_ad_buffer");; localObject2 = "")
        {
          localObject3 = String.format("%s:%s:%s:%s:%d:%s:%s:%d", new Object[] { localObject3, localObject2, ((j)(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.l)this.nDt).nAW, String.valueOf(System.currentTimeMillis() / 1000L), Integer.valueOf(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.l)localObject4).nBm), ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.l)localObject4).ntU, localObject1, Integer.valueOf(i) });
          localObject4 = (j)this.nDt;
          if ((this.context instanceof SnsAdNativeLandingPagesUI))
          {
            localObject1 = (SnsAdNativeLandingPagesUI)this.context;
            if (((SnsAdNativeLandingPagesUI)localObject1).nyk == null)
            {
              localObject1 = "";
              localObject2 = (SnsAdNativeLandingPagesUI)this.context;
              if (((SnsAdNativeLandingPagesUI)localObject2).fxE != null) {
                break label565;
              }
              localObject2 = "";
            }
          }
          for (;;)
          {
            localObject1 = e.m(((j)localObject4).cbs, new String[] { String.format("gdt_vid=%s", new Object[] { localObject2 }), String.format("weixinadinfo=%s.%s.0.0", new Object[] { localObject1, localObject2 }) });
            AdLandingPagesProxy.getInstance().doOpenAppBrand(((j)localObject4).username, (String)localObject1, (String)localObject3);
            return;
            localObject1 = ((SnsAdNativeLandingPagesUI)localObject1).nyk;
            break;
            localObject2 = ((SnsAdNativeLandingPagesUI)localObject2).fxE;
            continue;
            localObject1 = ((j)localObject4).nyk;
            localObject2 = ((j)localObject4).nyj;
          }
          if (((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.l)localObject4).bID == 9)
          {
            localObject1 = (g)localObject4;
            localObject2 = new Intent();
            ((Intent)localObject2).putExtra("map_view_type", 1);
            ((Intent)localObject2).putExtra("kwebmap_slat", ((g)localObject1).nAk.kCw);
            ((Intent)localObject2).putExtra("kwebmap_lng", ((g)localObject1).nAk.kCx);
            ((Intent)localObject2).putExtra("kwebmap_scale", ((g)localObject1).nAk.bSz);
            ((Intent)localObject2).putExtra("kPoiName", ((g)localObject1).nAk.bWB);
            ((Intent)localObject2).putExtra("Kwebmap_locaion", ((g)localObject1).nAk.kCz);
            x.i("MicroMsg.Sns.AdLandingPageBtnComponent", "locatint to slat " + ((g)localObject1).nAk.kCw + ", slong " + ((g)localObject1).nAk.kCx + ", " + ((g)localObject1).nAk.bWB);
            com.tencent.mm.bg.d.b(this.context, "location", ".ui.RedirectUI", (Intent)localObject2, 2);
            return;
          }
          if (((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.l)localObject4).bID == 10)
          {
            if (c.a.qPG == null) {
              break;
            }
            localObject1 = (i)localObject4;
            if (((i)localObject1).nAj.size() > 1)
            {
              c.a.qPG.a(this.context, ((i)localObject1).nAj, new l.5(this));
              return;
            }
            if (((i)localObject1).nAj.size() <= 0) {
              break;
            }
            AdLandingPagesProxy.getInstance().confirmDialPhoneNum((Activity)this.context, (String)((i)localObject1).nAj.get(0));
            return;
          }
          if (((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.l)localObject4).bID == 11)
          {
            if (!(this.context instanceof SnsAdNativeLandingPagesUI)) {
              break;
            }
            localObject1 = (SnsAdNativeLandingPagesUI)this.context;
            localObject2 = ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.l)localObject4).nAG;
            localObject3 = ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.l)localObject4).nAD;
            localObject5 = ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.l)localObject4).nAE;
            String str = ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.l)localObject4).nAF;
            boolean bool1;
            boolean bool2;
            if (((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.l)localObject4).nAB == 1)
            {
              bool1 = true;
              if (((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.l)localObject4).nAC != 1) {
                break label1018;
              }
              bool2 = true;
              if (((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.l)this.nDt).nAA != 1) {
                break label1024;
              }
            }
            for (boolean bool3 = true;; bool3 = false)
            {
              ((SnsAdNativeLandingPagesUI)localObject1).a((s)localObject2, (String)localObject3, (String)localObject5, str, bool1, bool2, bool3);
              return;
              bool1 = false;
              break;
              bool2 = false;
              break label977;
            }
          }
          Object localObject5 = new Intent();
          localObject3 = ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.l)localObject4).nAs;
          localObject2 = localObject3;
          if (!TextUtils.isEmpty(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.l)localObject4).nyj))
          {
            localObject2 = localObject3;
            if (!TextUtils.isEmpty(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.l)localObject4).nyk)) {
              localObject2 = ad.l((String)localObject3, new String[] { "traceid=" + ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.l)localObject4).nyj + "&aid=" + ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.l)localObject4).nyk });
            }
          }
          x.i("MicroMsg.Sns.AdLandingPageBtnComponent", "open url %s", new Object[] { localObject2 });
          ((Intent)localObject5).putExtra("rawUrl", (String)localObject2);
          ((Intent)localObject5).putExtra("useJs", true);
          ((Intent)localObject5).putExtra("type", 65281);
          ((Intent)localObject5).putExtra("geta8key_scene", 2);
          if (((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.l)this.nDt).nBm == 0)
          {
            localObject1 = new SnsAdClick((String)localObject1, ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.l)this.nDt).ntU, j, i);
            localObject2 = new Bundle();
            ((Bundle)localObject2).putParcelable("KSnsAdTag", (Parcelable)localObject1);
            ((Intent)localObject5).putExtra("jsapiargs", (Bundle)localObject2);
          }
          long l;
          if (((this.context instanceof Activity)) && (((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.l)this.nDt).nBm == 2))
          {
            localObject2 = ((Activity)this.context).getIntent().getStringExtra("sns_landing_pages_sessionId");
            localObject1 = ((Activity)this.context).getIntent().getStringExtra("sns_landing_pages_ad_buffer");
            if (!bi.oW((String)localObject2))
            {
              l = System.currentTimeMillis() / 1000L;
              if (bi.oW((String)localObject1)) {
                break label1426;
              }
            }
          }
          for (;;)
          {
            localObject1 = String.format("official_mall_%s_%s_%s_%s", new Object[] { localObject1, localObject2, ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.l)this.nDt).nAW, String.valueOf(l) });
            ((Intent)localObject5).putExtra("prePublishId", (String)localObject1);
            ((Intent)localObject5).putExtra("KPublisherId", (String)localObject1);
            ((Intent)localObject5).putExtra("pay_channel", 47);
            com.tencent.mm.bg.d.b(this.context, "webview", ".ui.tools.WebViewUI", (Intent)localObject5);
            return;
            localObject1 = "";
          }
        }
      }
      i = 0;
    }
  }
  
  @TargetApi(17)
  public final View bzM()
  {
    View localView = this.contentView;
    this.kFI = ((RelativeLayout)localView.findViewById(i.f.sns_ad_native_landing_pages_item_btn_relative));
    this.nDG = ((Button)localView.findViewById(i.f.sns_ad_native_landing_pages_item_btn_btn));
    this.nDH = localView.findViewById(i.f.sns_ad_native_landing_pages_item_gray_cover);
    return localView;
  }
  
  @TargetApi(17)
  protected final void bzQ()
  {
    this.nDh = 0;
    int i = ((WindowManager)this.context.getSystemService("window")).getDefaultDisplay().getWidth();
    int j = i;
    if (((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.l)this.nDt).nBc > 0.0F)
    {
      j = i;
      if (((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.l)this.nDt).nBc < i * 2)
      {
        i = (int)((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.l)this.nDt).nBc;
        j = (int)((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.l)this.nDt).nBa;
        j = (int)((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.l)this.nDt).nBb + (i + j);
      }
    }
    this.kFI.setBackgroundColor(this.backgroundColor);
    if (!bi.oW(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.l)this.nDt).nAy))
    {
      com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d.b("adId", ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.l)this.nDt).nAy, false, 0, new l.1(this));
      this.nDG.setText(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.l)this.nDt).title);
      d(this.nDG);
      this.nDG.setTextSize(0, ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.l)this.nDt).azb);
      if ((((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.l)this.nDt).nAu == null) || (((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.l)this.nDt).nAu.length() <= 0)) {}
    }
    for (;;)
    {
      try
      {
        i = Color.parseColor(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.l)this.nDt).nAu);
        this.nDG.setTextColor(i);
      }
      catch (Exception localException1)
      {
        try
        {
          this.nDG.setTextAlignment(4);
          if (((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.l)this.nDt).height > 0.0F)
          {
            this.nDG.setLayoutParams(new RelativeLayout.LayoutParams(j - (int)((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.l)this.nDt).nBa - (int)((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.l)this.nDt).nBb, (int)((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.l)this.nDt).height));
            if (((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.l)this.nDt).nAz != 1) {
              continue;
            }
            this.nDH.setLayoutParams(new RelativeLayout.LayoutParams(j - (int)((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.l)this.nDt).nBa - (int)((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.l)this.nDt).nBb, this.nDH.getLayoutParams().height));
            this.nDH.setVisibility(0);
            this.nDH.setOnLongClickListener(new View.OnLongClickListener()
            {
              public final boolean onLongClick(View paramAnonymousView)
              {
                l.a(l.this);
                return true;
              }
            });
            this.nDH.setOnClickListener(new l.3(this));
            return;
            GradientDrawable localGradientDrawable = new GradientDrawable();
            localGradientDrawable.setShape(0);
            if ((bi.oW(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.l)this.nDt).nAx)) || (((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.l)this.nDt).nAv <= 0.0F)) {
              break label691;
            }
            try
            {
              i = Color.parseColor(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.l)this.nDt).nAx);
              localGradientDrawable.setStroke((int)((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.l)this.nDt).nAv, i);
              i = 1;
              if (bi.oW(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.l)this.nDt).nAw)) {}
            }
            catch (Exception localException3)
            {
              try
              {
                i = Color.parseColor(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.l)this.nDt).nAw);
                localGradientDrawable.setColor(i);
                i = 1;
                if (i == 0) {
                  break;
                }
                this.nDG.setBackgroundDrawable(localGradientDrawable);
                break;
                localException3 = localException3;
                x.e("MicroMsg.Sns.AdLandingPageBtnComponent", bi.i(localException3));
                i = 0;
              }
              catch (Exception localException4)
              {
                x.e("MicroMsg.Sns.AdLandingPageBtnComponent", bi.i(localException4));
                i = 0;
                continue;
              }
            }
            localException1 = localException1;
            x.e("MicroMsg.Sns.AdLandingPageBtnComponent", "invalid color! %s", new Object[] { ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.l)this.nDt).nAu });
            continue;
          }
        }
        catch (Exception localException2)
        {
          x.e("MicroMsg.Sns.AdLandingPageBtnComponent", "the device has no method btn.setTextAlignment");
          continue;
          this.nDG.setLayoutParams(new RelativeLayout.LayoutParams(j - (int)((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.l)this.nDt).nBa - (int)((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.l)this.nDt).nBb, this.nDG.getLayoutParams().height));
          continue;
          this.nDH.setVisibility(8);
          return;
        }
      }
      label691:
      i = 0;
    }
  }
  
  protected void d(Button paramButton)
  {
    paramButton.setOnClickListener(new l.4(this));
  }
  
  protected final int getLayout()
  {
    return i.g.sns_ad_native_landing_pages_item_btn;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */