package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.v;
import com.tencent.mm.bg.d;
import com.tencent.mm.plugin.sns.i.a;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ad;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.i;
import com.tencent.mm.protocal.c.afl;
import com.tencent.mm.protocal.c.afm;
import com.tencent.mm.protocal.c.yw;
import com.tencent.mm.protocal.c.yx;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;

@a(3)
public class SnsAdNativeLandingPagesPreviewUI
  extends MMActivity
{
  private static boolean f(Intent paramIntent, String paramString)
  {
    if ((!bi.oW(paramString)) && (ad.Nb(paramString)))
    {
      paramString = ad.Nc(paramString);
      if (bi.oW(paramString)) {
        return false;
      }
      paramIntent.putExtra("sns_landing_pages_xml", "");
      paramIntent.putExtra("sns_landing_pages_too_large_xml_path", paramString);
    }
    return true;
  }
  
  private boolean g(Intent paramIntent, String paramString)
  {
    if (e.Nf(paramString))
    {
      paramIntent.setClass(this, SnsAdNativeLandingPagesUI.class);
      startActivity(paramIntent);
      finish();
      if (paramIntent.getBooleanExtra("sns_landing_pages_need_enter_and_exit_animation", false))
      {
        overridePendingTransition(0, 0);
        return true;
      }
      overridePendingTransition(i.a.slide_right_in, i.a.slide_left_out);
      return true;
    }
    x.i("SnsAdNativeLandingPagesPreviewUI", "unknown canvas goto webview, " + paramString);
    int i = paramString.indexOf("<shareWebUrl>");
    if (i >= 0)
    {
      int j = paramString.indexOf("</shareWebUrl>");
      if (j > i + 13)
      {
        paramIntent = paramString.substring(i + 13, j);
        paramString = new Intent();
        paramString.putExtra("rawUrl", paramIntent);
        paramString.putExtra("showShare", true);
        d.b(this, "webview", ".ui.tools.WebViewUI", paramString);
        finish();
        overridePendingTransition(i.a.slide_right_in, i.a.slide_left_out);
        return true;
      }
    }
    return false;
  }
  
  protected final int getLayoutId()
  {
    return i.g.sns_ad_native_landing_pages_preview_ui;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    ad.I(this);
    Intent localIntent = getIntent();
    if (localIntent == null) {
      finish();
    }
    label114:
    label123:
    label264:
    label277:
    label295:
    label395:
    do
    {
      return;
      Object localObject = localIntent.getStringExtra("sns_landing_pages_xml");
      int i;
      long l;
      String str1;
      String str2;
      if (localIntent.hasExtra("sns_landing_pages_canvasid"))
      {
        i = 1;
        l = localIntent.getLongExtra("sns_landing_pages_pageid", 0L);
        str1 = localIntent.getStringExtra("sns_landing_pages_canvasid");
        str2 = localIntent.getStringExtra("sns_landing_pages_canvas_ext");
        if (!TextUtils.isEmpty((CharSequence)localObject)) {
          break label277;
        }
        paramBundle = (Bundle)localObject;
        if (localIntent.getIntExtra("sns_landing_pages_no_store", 0) != 1)
        {
          if (i != 1) {
            break label264;
          }
          paramBundle = i.bAE().k(str1, str2, 0, 0);
          localIntent.putExtra("sns_landing_pages_xml", paramBundle);
        }
        if (!TextUtils.isEmpty(paramBundle)) {
          continue;
        }
        localObject = findViewById(i.f.progressbar);
        ((View)localObject).setVisibility(0);
        paramBundle = new b.a();
        if ((i != 0) || (l <= 0L)) {
          break label295;
        }
        x.i("SnsAdNativeLandingPagesPreviewUI", "intent without canvas xml, pageId:%d", new Object[] { Long.valueOf(l) });
        paramBundle.dIG = new yw();
        paramBundle.dIH = new yx();
        paramBundle.uri = "/cgi-bin/mmoc-bin/adplayinfo/get_adcanvasinfo";
        paramBundle.dIF = 1286;
        paramBundle = paramBundle.KT();
        ((yw)paramBundle.dID.dIL).rEZ = l;
      }
      for (;;)
      {
        v.a(paramBundle, new SnsAdNativeLandingPagesPreviewUI.1(this, (View)localObject, i, str1, str2, l, localIntent));
        return;
        i = 0;
        break;
        paramBundle = i.bAE().h(l, 0, 0);
        break label114;
        paramBundle = (Bundle)localObject;
        if (f(localIntent, (String)localObject)) {
          break label123;
        }
        finish();
        return;
        if ((i != 1) || (bi.oW(str1))) {
          break label395;
        }
        x.i("SnsAdNativeLandingPagesPreviewUI", "intent without canvas xml, canvasId:%s", new Object[] { str1 });
        paramBundle.dIG = new afl();
        paramBundle.dIH = new afm();
        paramBundle.uri = "/cgi-bin/mmux-bin/wxaapp/mmuxwxa_getofficialcanvasinfo";
        paramBundle.dIF = 1890;
        paramBundle = paramBundle.KT();
        afl localafl = (afl)paramBundle.dID.dIL;
        localafl.rJs = str1;
        localafl.rJt = str2;
      }
      x.e("SnsAdNativeLandingPagesPreviewUI", "intent without canvas xml, or pageId!");
      finish();
      return;
    } while (g(localIntent, paramBundle));
    finish();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesPreviewUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */