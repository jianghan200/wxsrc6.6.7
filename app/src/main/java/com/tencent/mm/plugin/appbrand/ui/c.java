package com.tencent.mm.plugin.appbrand.ui;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.plugin.appbrand.report.a;
import com.tencent.mm.plugin.appbrand.s.i;

public final class c
  extends AppBrandLauncherUI.a
{
  static c bM(String paramString1, String paramString2)
  {
    c localc = new c();
    Bundle localBundle = new Bundle(2);
    localBundle.putString("extra_title", paramString1);
    localBundle.putString("extra_tip", paramString2);
    localc.setArguments(localBundle);
    return localc;
  }
  
  public final void initView()
  {
    LinearLayout localLinearLayout = new LinearLayout(getContext());
    localLinearLayout.setOrientation(1);
    Object localObject1 = new ImageView(getContext());
    ((ImageView)localObject1).setImageResource(s.i.app_brand_launcher_blank_tip_icon);
    Object localObject2 = new LinearLayout.LayoutParams(lG(50), lG(50));
    ((LinearLayout.LayoutParams)localObject2).topMargin = lG(91);
    ((LinearLayout.LayoutParams)localObject2).gravity = 1;
    localLinearLayout.addView((View)localObject1, (ViewGroup.LayoutParams)localObject2);
    localObject2 = new TextView(getContext());
    ((TextView)localObject2).setTextSize(2, 14.0F);
    ((TextView)localObject2).setTextColor(Color.parseColor("#B2B2B2"));
    ((TextView)localObject2).setGravity(17);
    if (getArguments() == null) {}
    for (localObject1 = "";; localObject1 = getArguments().getString("extra_tip"))
    {
      ((TextView)localObject2).setText((CharSequence)localObject1);
      localObject1 = new LinearLayout.LayoutParams(-2, -2);
      ((LinearLayout.LayoutParams)localObject1).topMargin = lG(16);
      ((LinearLayout.LayoutParams)localObject1).gravity = 1;
      localLinearLayout.addView((View)localObject2, (ViewGroup.LayoutParams)localObject1);
      ((ViewGroup)this.FU).addView(localLinearLayout, new ViewGroup.LayoutParams(-1, -1));
      a.a(this.fdx, "", "", 0, "", this.guK);
      return;
    }
  }
  
  public final void onResume()
  {
    super.onResume();
    FragmentActivity localFragmentActivity = getActivity();
    if (getArguments() == null) {}
    for (String str = "";; str = getArguments().getString("extra_title"))
    {
      localFragmentActivity.setTitle(str);
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/ui/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */