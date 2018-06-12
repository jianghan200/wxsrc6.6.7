package com.tencent.mm.plugin.appbrand.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import com.tencent.mm.R.a;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.modelappbrand.b;
import com.tencent.mm.plugin.fts.ui.widget.FTSEditTextView.b;
import com.tencent.mm.plugin.fts.ui.widget.a.b;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.webview.stub.d;
import com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSMoreWebViewUI;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.lang.reflect.Field;
import java.util.List;

public class AppBrandSOSUI
  extends FTSSOSMoreWebViewUI
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
        x.e("MicroMsg.AppBrandSOSUI", "refresh keyword id error : %s", new Object[] { localRemoteException });
      }
    }
  }
  
  protected final boolean anv()
  {
    return true;
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
    localView1.setOnClickListener(new AppBrandSOSUI.1(this));
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
        break label301;
      }
      i += m - localRect.height();
    }
    for (;;)
    {
      localView1.setPadding(k, i + this.gvz.getPaddingTop(), this.gvz.getPaddingRight(), this.gvz.getPaddingBottom());
      addContentView(this.gvz, paramView);
      return;
      label301:
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
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    overridePendingTransition(R.a.pop_in, 0);
    this.gvB = getIntent().getStringExtra("key_session_id");
    this.scene = getIntent().getIntExtra("ftsbizscene", 0);
    x.i("MicroMsg.AppBrandSOSUI", "onCreate oreh report weAppSearchClickStream(13929) statSessionId:%s", new Object[] { this.gvB });
    h.mEJ.h(13929, new Object[] { this.gvB, "", Integer.valueOf(1), Integer.valueOf(this.scene) });
    paramBundle = new Intent();
    paramBundle.putExtra("key_session_id", this.gvB);
    paramBundle.putExtra("ftsbizscene", this.scene);
    setResult(-1, paramBundle);
  }
  
  public void onDestroy()
  {
    if ((this.scene == 3) || (this.scene == 16)) {
      h.mEJ.h(13929, new Object[] { this.gvB, b.dFx, Integer.valueOf(2), Integer.valueOf(this.scene) });
    }
    super.onDestroy();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/ui/AppBrandSOSUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */