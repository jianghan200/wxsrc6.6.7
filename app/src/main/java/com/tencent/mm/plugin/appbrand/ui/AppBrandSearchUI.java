package com.tencent.mm.plugin.appbrand.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v7.app.ActionBar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.modelappbrand.b;
import com.tencent.mm.plugin.appbrand.p;
import com.tencent.mm.plugin.fts.ui.widget.FTSEditTextView;
import com.tencent.mm.plugin.fts.ui.widget.FTSEditTextView.b;
import com.tencent.mm.plugin.fts.ui.widget.a;
import com.tencent.mm.plugin.fts.ui.widget.a.b;
import com.tencent.mm.plugin.webview.stub.d;
import com.tencent.mm.plugin.webview.ui.tools.WebViewUI;
import com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI;
import com.tencent.mm.plugin.webview.ui.tools.fts.FTSSearchTabWebViewUI;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.ak;
import java.lang.reflect.Field;
import java.util.List;

public class AppBrandSearchUI
  extends FTSSearchTabWebViewUI
{
  private String gvA;
  private String gvB;
  private View gvz;
  private int scene;
  
  private int any()
  {
    try
    {
      Class localClass = Class.forName("com.android.internal.R$dimen");
      Object localObject = localClass.newInstance();
      int i = bi.getInt(localClass.getField("status_bar_height").get(localObject).toString(), 0);
      i = getResources().getDimensionPixelSize(i);
      return i;
    }
    catch (Exception localException) {}
    return 0;
  }
  
  public final void a(String paramString1, String paramString2, List<a.b> paramList, FTSEditTextView.b paramb)
  {
    if (!TextUtils.isEmpty(paramString2)) {
      this.gvz.setVisibility(8);
    }
    try
    {
      this.gcO.g(10001, null);
      super.a(paramString1, paramString2, paramList, paramb);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        x.e("MicroMsg.AppBrandSearchUI", "refresh keyword id error : %s", new Object[] { localRemoteException });
      }
    }
  }
  
  protected final void ant()
  {
    super.ant();
    if (this.jwl != null)
    {
      ((ImageView)this.jwl.findViewById(R.h.ab_back_btn)).getDrawable().setColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
      FTSEditTextView localFTSEditTextView = (FTSEditTextView)this.jwl.findViewById(R.h.fts_edittext);
      localFTSEditTextView.getIconView().setImageResource(R.k.appbrand_actionbar_search_view_icon_black);
      ((ImageButton)localFTSEditTextView.findViewById(R.h.clear_btn)).getDrawable().setColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
      localFTSEditTextView.getEditText().setHintTextColor(getResources().getColor(R.e.light_bg_hint_color));
      localFTSEditTextView.getEditText().setTextColor(-16777216);
      k.c(this);
    }
  }
  
  protected final int anu()
  {
    if ((Build.VERSION.SDK_INT >= 23) && ((!com.tencent.mm.compatible.util.h.Ae()) || (!AppBrandNearbyWebViewUI.Af())))
    {
      ak.g(getWindow());
      return -855310;
    }
    if (Build.VERSION.SDK_INT >= 21) {
      return p.feh;
    }
    return super.anu();
  }
  
  public final boolean anx()
  {
    this.gvz.setVisibility(8);
    return super.anx();
  }
  
  protected final void dealContentView(View paramView)
  {
    super.dealContentView(paramView);
    this.gvA = getIntent().getStringExtra("key_nearby_url");
    getIntent().getStringExtra("key_nearby_list_id");
    this.gvz = getLayoutInflater().inflate(R.i.app_brand_search_ui_recommend_page, (ViewGroup)paramView, false);
    View localView1 = this.gvz.findViewById(R.h.nearbyV);
    localView1.setOnClickListener(new AppBrandSearchUI.1(this));
    if (TextUtils.isEmpty(this.gvA))
    {
      localView1.setVisibility(8);
      this.gvz.setVisibility(8);
    }
    while ((paramView instanceof FrameLayout))
    {
      ((FrameLayout)paramView).addView(this.gvz);
      return;
      localView1.setVisibility(0);
      this.gvz.setVisibility(0);
    }
    paramView = paramView.getLayoutParams();
    int k;
    Rect localRect;
    int i;
    if (getWindow().hasFeature(9))
    {
      localView1 = this.gvz;
      k = this.gvz.getPaddingLeft();
      localRect = new Rect();
      int j = getActionBarHeight();
      View localView2 = getWindow().getDecorView();
      localView2.getWindowVisibleDisplayFrame(localRect);
      int m = localView2.getHeight();
      int[] arrayOfInt = new int[2];
      localView2.getLocationOnScreen(arrayOfInt);
      i = j;
      if (m == 0) {
        i = j + any();
      }
      if ((m - localRect.height() < 0) || (arrayOfInt[1] <= 200)) {
        break label302;
      }
      i += m - localRect.height();
    }
    for (;;)
    {
      localView1.setPadding(k, i + this.gvz.getPaddingTop(), this.gvz.getPaddingRight(), this.gvz.getPaddingBottom());
      addContentView(this.gvz, paramView);
      return;
      label302:
      i += localRect.top;
    }
  }
  
  protected final String getHint()
  {
    String str = getIntent().getStringExtra("key_search_place_holder");
    if ((str != null) && (str.length() > 0)) {
      return str;
    }
    return super.getHint();
  }
  
  protected final void initView()
  {
    super.initView();
    getSupportActionBar().setBackgroundDrawable(new ColorDrawable(-855310));
    AL(-16777216);
  }
  
  protected final void j(int paramInt, Bundle paramBundle)
  {
    super.j(paramInt, paramBundle);
    switch (paramInt)
    {
    default: 
      return;
    }
    String str = paramBundle.getString("fts_key_json_data");
    paramInt = paramBundle.getInt("fts_key_is_cache_data", 0);
    int i = paramBundle.getInt("fts_key_is_expired", 1);
    this.handler.post(new AppBrandSearchUI.2(this, str, paramInt, i));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    lF(getResources().getColor(R.e.normal_actionbar_color));
    this.gvB = getIntent().getStringExtra("key_session_id");
    this.scene = getIntent().getIntExtra("ftsbizscene", 0);
    x.i("MicroMsg.AppBrandSearchUI", "onCreate oreh report weAppSearchClickStream(13929) statSessionId:%s", new Object[] { this.gvB });
    com.tencent.mm.plugin.report.service.h.mEJ.h(13929, new Object[] { this.gvB, "", Integer.valueOf(1), Integer.valueOf(this.scene) });
    paramBundle = new Intent();
    paramBundle.putExtra("key_session_id", this.gvB);
    paramBundle.putExtra("ftsbizscene", this.scene);
    setResult(-1, paramBundle);
  }
  
  public void onDestroy()
  {
    if ((this.scene == 3) || (this.scene == 16)) {
      com.tencent.mm.plugin.report.service.h.mEJ.h(13929, new Object[] { this.gvB, b.dFx, Integer.valueOf(2), Integer.valueOf(this.scene) });
    }
    super.onDestroy();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/ui/AppBrandSearchUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */