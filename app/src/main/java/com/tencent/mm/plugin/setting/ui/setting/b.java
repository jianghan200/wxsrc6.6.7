package com.tencent.mm.plugin.setting.ui.setting;

import android.widget.LinearLayout;

final class b
{
  LinearLayout mVA;
  LinearLayout mVB;
  LinearLayout mVC;
  LinearLayout mVy;
  LinearLayout mVz;
  
  public final void La(String paramString)
  {
    if (paramString.equals("downloading"))
    {
      this.mVy.setVisibility(0);
      this.mVz.setVisibility(8);
      this.mVA.setVisibility(8);
      this.mVB.setVisibility(8);
      this.mVC.setVisibility(8);
    }
    do
    {
      return;
      if (paramString.equals("downloaded"))
      {
        this.mVy.setVisibility(8);
        this.mVz.setVisibility(0);
        this.mVA.setVisibility(8);
        this.mVB.setVisibility(8);
        this.mVC.setVisibility(8);
        return;
      }
      if (paramString.equals("undownloaded"))
      {
        this.mVy.setVisibility(8);
        this.mVz.setVisibility(8);
        this.mVA.setVisibility(0);
        this.mVB.setVisibility(8);
        this.mVC.setVisibility(8);
        return;
      }
      if (paramString.equals("using"))
      {
        this.mVy.setVisibility(8);
        this.mVz.setVisibility(8);
        this.mVA.setVisibility(8);
        this.mVB.setVisibility(0);
        this.mVC.setVisibility(8);
        return;
      }
    } while (!paramString.equals("canceling"));
    this.mVy.setVisibility(8);
    this.mVz.setVisibility(8);
    this.mVA.setVisibility(8);
    this.mVB.setVisibility(8);
    this.mVC.setVisibility(0);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/setting/ui/setting/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */