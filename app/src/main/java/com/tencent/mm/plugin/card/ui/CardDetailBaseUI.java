package com.tencent.mm.plugin.card.ui;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.plugin.card.a.a;
import com.tencent.mm.plugin.card.a.b;
import com.tencent.mm.plugin.card.a.c;
import com.tencent.mm.plugin.card.a.d;
import com.tencent.mm.plugin.card.a.e;
import com.tencent.mm.plugin.card.a.f;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;
import com.tencent.mm.ui.statusbar.DrawStatusBarActivity;
import com.tencent.mm.ui.y;

public abstract class CardDetailBaseUI
  extends DrawStatusBarActivity
{
  private TextView gsY;
  private View gxg;
  private ImageView hBu;
  private TextView hBv;
  ImageView hBw;
  private View hBx;
  
  public final void G(int paramInt, boolean paramBoolean)
  {
    this.gxg.setBackgroundColor(paramInt);
    if (paramBoolean)
    {
      this.gsY.setTextColor(getResources().getColor(a.a.black));
      this.hBv.setTextColor(getResources().getColor(a.a.black));
      this.hBu.setImageResource(a.f.actionbar_icon_dark_back);
      this.hBw.setImageResource(a.c.card_mm_title_btn_menu);
      this.hBx.setBackgroundColor(getResources().getColor(a.a.actionbar_devider_color));
      return;
    }
    this.gsY.setTextColor(getResources().getColor(a.a.white));
    this.hBv.setTextColor(getResources().getColor(a.a.white));
    this.hBu.setImageResource(a.f.actionbar_icon_dark_back);
    this.hBw.setImageResource(a.c.mm_title_btn_menu);
    this.hBx.setBackgroundColor(getResources().getColor(a.a.half_alpha_white));
  }
  
  public final void dQ(boolean paramBoolean)
  {
    ImageView localImageView = this.hBw;
    if (paramBoolean) {}
    for (int i = 0;; i = 8)
    {
      localImageView.setVisibility(i);
      return;
    }
  }
  
  public final void nS(int paramInt)
  {
    this.gsY.setTextColor(paramInt);
  }
  
  public final boolean noActionBar()
  {
    return false;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.gxg = y.gq(this.mController.tml).inflate(a.e.card_detail_action_bar, null);
    this.gxg.setBackgroundColor(getResources().getColor(a.a.action_bar_color));
    this.gsY = ((TextView)this.gxg.findViewById(a.d.title_area));
    this.hBv = ((TextView)this.gxg.findViewById(a.d.sub_title_area));
    this.hBu = ((ImageView)this.gxg.findViewById(a.d.arrow_area_btn));
    this.hBw = ((ImageView)this.gxg.findViewById(a.d.menu_icon));
    this.hBx = this.gxg.findViewById(a.d.divider);
    LinearLayout localLinearLayout;
    Object localObject;
    if ((this.mController.contentView != null) && (((ViewGroup)this.mController.contentView).getChildCount() > 0))
    {
      paramBundle = ((ViewGroup)this.mController.contentView).getChildAt(0);
      ((ViewGroup)this.mController.contentView).removeView(paramBundle);
      localLinearLayout = new LinearLayout(this);
      localLinearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
      localLinearLayout.setOrientation(1);
      localObject = getResources().getDisplayMetrics();
      if (((DisplayMetrics)localObject).widthPixels <= ((DisplayMetrics)localObject).heightPixels) {
        break label281;
      }
    }
    label281:
    for (int i = getResources().getDimensionPixelSize(a.b.DefaultActionbarHeightLand);; i = getResources().getDimensionPixelSize(a.b.DefaultActionbarHeightPort))
    {
      localObject = new LinearLayout.LayoutParams(-1, i);
      localLinearLayout.addView(this.gxg, (ViewGroup.LayoutParams)localObject);
      localLinearLayout.addView(paramBundle);
      ((ViewGroup)this.mController.contentView).addView(localLinearLayout);
      return;
    }
  }
  
  protected final void onCreateBeforeSetContentView()
  {
    super.onCreateBeforeSetContentView();
    supportRequestWindowFeature(10);
    supportRequestWindowFeature(1);
  }
  
  public final void setBackBtn(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    this.hBu.setOnClickListener(new CardDetailBaseUI.1(this, paramOnMenuItemClickListener));
  }
  
  public final void setMMSubTitle(String paramString)
  {
    this.hBv.setText(paramString);
  }
  
  public final void setMMTitle(String paramString)
  {
    this.gsY.setText(paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/card/ui/CardDetailBaseUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */