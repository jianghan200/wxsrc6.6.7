package com.tencent.mm.plugin.appbrand.widget.actionbar;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;
import android.widget.TextView;
import com.tencent.mm.plugin.appbrand.page.a.a;
import com.tencent.mm.plugin.appbrand.s.e;
import com.tencent.mm.plugin.appbrand.s.g;
import com.tencent.mm.plugin.appbrand.s.h;
import com.tencent.mm.plugin.appbrand.s.i;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.svg.a.b;

public class AppBrandOptionButton
  extends FrameLayout
{
  ImageButton gFA;
  private int gFv = s.i.app_brand_actionbar_option_light;
  private ObjectAnimator gFw;
  public boolean gFx = true;
  private View gFy;
  private TextView gFz;
  
  public AppBrandOptionButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init(paramContext);
  }
  
  public AppBrandOptionButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init(paramContext);
  }
  
  private int getActionBarHeight()
  {
    return getResources().getDimensionPixelSize(s.e.wechat_abc_action_bar_default_height);
  }
  
  private void init(Context paramContext)
  {
    this.gFy = LayoutInflater.from(paramContext).inflate(s.h.action_option_view, this, false);
    this.gFz = ((TextView)this.gFy.findViewById(s.g.action_option_text));
    this.gFz.setMaxLines(1);
    this.gFz.setClickable(false);
    this.gFz.setBackground(null);
    addView(this.gFy, new FrameLayout.LayoutParams(-2, -1, 17));
    this.gFy.setVisibility(8);
    this.gFA = new ImageButton(paramContext);
    this.gFA.setClickable(false);
    this.gFA.setBackground(null);
    addView(this.gFA, new FrameLayout.LayoutParams(getActionBarHeight(), -1, 17));
    this.gFw = ObjectAnimator.ofFloat(this.gFA, "alpha", new float[] { 1.0F, 0.0F, 1.0F });
    this.gFw.setDuration(2000L);
    this.gFw.setInterpolator(new AccelerateInterpolator());
    this.gFw.setRepeatCount(-1);
    this.gFw.setRepeatMode(1);
  }
  
  protected final void a(a.a parama, int paramInt)
  {
    x.i("MicroMsg.AppBrandOptionButton", "setImageButtonStatus status %s", new Object[] { parama });
    switch (AppBrandOptionButton.3.glK[parama.ordinal()])
    {
    }
    for (;;)
    {
      this.gFx = true;
      this.gFy.setVisibility(8);
      this.gFA.setVisibility(0);
      this.gFA.setImageResource(getImageButtonResource());
      this.gFA.setColorFilter(paramInt, PorterDuff.Mode.SRC_ATOP);
      if (this.gFv != s.i.app_brand_actionbar_option_dark) {
        break;
      }
      post(new Runnable()
      {
        public final void run()
        {
          AppBrandOptionButton.a(AppBrandOptionButton.this).end();
        }
      });
      return;
      this.gFv = s.i.app_brand_actionbar_capsule_lbs_dark;
      continue;
      this.gFv = s.i.app_brand_actionbar_capsule_video_dark;
      continue;
      this.gFv = s.i.app_brand_actionbar_capsule_voice_dark;
      continue;
      this.gFv = s.i.app_brand_actionbar_option_dark;
    }
    post(new AppBrandOptionButton.1(this));
  }
  
  protected int getImageButtonResource()
  {
    return this.gFv;
  }
  
  public final void reset()
  {
    this.gFx = true;
    this.gFy.setVisibility(8);
    this.gFA.setVisibility(0);
    if (!(this.gFA.getDrawable() instanceof b)) {
      this.gFA.setImageResource(getImageButtonResource());
    }
  }
  
  public void setColor(int paramInt)
  {
    this.gFz.setTextColor(paramInt);
    if ((this.gFA.getDrawable() == null) || ((this.gFA.getDrawable() instanceof b)))
    {
      this.gFA.setImageResource(getImageButtonResource());
      this.gFA.setColorFilter(paramInt, PorterDuff.Mode.SRC_ATOP);
    }
  }
  
  public void setIcon(Bitmap paramBitmap)
  {
    if ((paramBitmap == null) || (paramBitmap.isRecycled())) {
      return;
    }
    this.gFx = false;
    this.gFA.setImageDrawable(new BitmapDrawable(getResources(), paramBitmap));
    this.gFA.setVisibility(0);
    this.gFy.setVisibility(8);
  }
  
  public void setText(String paramString)
  {
    this.gFx = false;
    this.gFz.setText(paramString);
    this.gFy.setVisibility(0);
    this.gFA.setVisibility(8);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandOptionButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */