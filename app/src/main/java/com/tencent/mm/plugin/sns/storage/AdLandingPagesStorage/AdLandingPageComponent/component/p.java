package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.v;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.mm.ui.widget.MMWebView.a;
import com.tencent.xweb.n;

public final class p
  extends i
{
  MMWebView dEn;
  FrameLayout nED;
  
  public p(Context paramContext, v paramv, ViewGroup paramViewGroup)
  {
    super(paramContext, paramv, paramViewGroup);
  }
  
  public final View bzM()
  {
    this.nED = ((FrameLayout)this.contentView);
    this.dEn = MMWebView.a.cS(this.context);
    this.nED.addView(this.dEn);
    return this.nED;
  }
  
  protected final void bzQ()
  {
    WindowManager localWindowManager = (WindowManager)this.context.getSystemService("window");
    int i = localWindowManager.getDefaultDisplay().getWidth();
    int j = localWindowManager.getDefaultDisplay().getHeight();
    this.dEn.setVerticalScrollBarEnabled(false);
    this.dEn.setHorizontalScrollBarEnabled(false);
    this.dEn.getSettings().setJavaScriptEnabled(true);
    this.dEn.loadUrl(((v)this.nDt).kck);
    this.dEn.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    this.dEn.setVisibility(0);
    this.nED.setPadding(this.nED.getPaddingLeft(), (int)((v)this.nDt).nAY, this.nED.getPaddingRight(), (int)((v)this.nDt).nAZ);
    this.nED.setLayoutParams(new LinearLayout.LayoutParams(i, j));
  }
  
  protected final View bzR()
  {
    return new FrameLayout(this.context);
  }
  
  protected final int getLayout()
  {
    return Integer.MAX_VALUE;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */