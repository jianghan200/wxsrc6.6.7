package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.ViewGroup;
import android.widget.Button;
import com.tencent.mm.bg.d;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.k;
import com.tencent.mm.sdk.platformtools.bi;
import org.json.JSONObject;

public final class t
  extends l
{
  public t(Context paramContext, k paramk, ViewGroup paramViewGroup)
  {
    super(paramContext, paramk, paramViewGroup);
  }
  
  private boolean bAg()
  {
    return ((k)bAa()).nAp == 1;
  }
  
  private boolean bAh()
  {
    return ((k)bAa()).nAq == 1;
  }
  
  public final void b(Context paramContext, String paramString1, String paramString2, int paramInt)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("sns_landig_pages_from_source", 14);
    localIntent.putExtra("sns_landig_pages_origin_from_source", bAa().nBk);
    localIntent.putExtra("sns_landing_pages_xml", "");
    String str2;
    String str1;
    JSONObject localJSONObject;
    if (bAh())
    {
      localIntent.putExtra("sns_landing_pages_canvasid", paramString1);
      localIntent.putExtra("sns_landing_pages_canvas_ext", paramString2);
      if (bAg())
      {
        paramString1 = new int[2];
        this.nDG.getLocationOnScreen(paramString1);
        localIntent.putExtra("img_gallery_top", paramString1[1]);
        localIntent.putExtra("img_gallery_left", paramString1[0]);
        localIntent.putExtra("img_gallery_width", this.nDG.getWidth());
        localIntent.putExtra("img_gallery_height", this.nDG.getHeight());
      }
      localIntent.putExtra("sns_landing_pages_need_enter_and_exit_animation", bAg());
      localIntent.putExtra("sns_landing_pages_extra", "");
      localIntent.putExtra("sns_landing_pages_no_store", paramInt);
      localIntent.putExtra("sns_landing_pages_ux_info", bAa().ntU);
      localIntent.putExtra("sns_landing_is_native_sight_ad", bAa().nBl);
      if (((paramContext instanceof Activity)) && (bAh()) && (bAa().nBm == 2))
      {
        str2 = ((Activity)paramContext).getIntent().getStringExtra("sns_landing_pages_sessionId");
        paramString2 = ((Activity)paramContext).getIntent().getStringExtra("sns_landing_pages_ad_buffer");
        if (!bi.oW(str2))
        {
          str1 = String.valueOf(System.currentTimeMillis() / 1000L);
          localJSONObject = new JSONObject();
        }
      }
    }
    for (;;)
    {
      try
      {
        localJSONObject.put("sessionId", str1);
        localJSONObject.put("cid", bAa().nAW);
        if (bi.oW(paramString2)) {
          continue;
        }
        paramString1 = paramString2;
        localJSONObject.put("adBuffer", paramString1);
        localJSONObject.put("preSessionId", str2);
      }
      catch (Exception paramString1)
      {
        continue;
      }
      localIntent.putExtra("sns_landing_pages_search_extra", localJSONObject.toString());
      localIntent.putExtra("sns_landing_pages_sessionId", str1);
      localIntent.putExtra("sns_landing_pages_ad_buffer", paramString2);
      if ((paramContext instanceof Activity))
      {
        paramString1 = ((Activity)paramContext).getIntent().getStringExtra("sns_landing_pages_rawSnsId");
        paramString2 = ((Activity)paramContext).getIntent().getStringExtra("sns_landing_pages_share_sns_id");
        localIntent.putExtra("sns_landing_pages_rawSnsId", paramString1);
        localIntent.putExtra("sns_landing_pages_share_sns_id", paramString2);
      }
      d.b(paramContext, "sns", ".ui.SnsAdNativeLandingPagesPreviewUI", localIntent);
      return;
      localIntent.putExtra("sns_landing_pages_pageid", bi.WV(paramString1));
      break;
      paramString1 = "";
    }
  }
  
  protected final void d(Button paramButton)
  {
    paramButton.setOnClickListener(new t.1(this));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */