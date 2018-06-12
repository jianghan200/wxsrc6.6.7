package com.tencent.mm.ui.base;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.w.a.f;
import com.tencent.mm.w.a.h;
import com.tencent.mm.w.a.m;

public class MMDotView
  extends LinearLayout
{
  private int daw = 9;
  private int ttY = a.f.page_normal;
  private int ttZ = a.f.page_active;
  
  public MMDotView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init(paramContext, paramAttributeSet);
  }
  
  @TargetApi(11)
  public MMDotView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init(paramContext, paramAttributeSet);
  }
  
  private void init(Context paramContext, AttributeSet paramAttributeSet)
  {
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a.m.MMDotView);
    int i = paramContext.getResourceId(a.m.MMDotView_dot_count, 0);
    paramContext.recycle();
    setDotCount(i);
  }
  
  public void setDarkStyle(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.ttY = a.f.page_normal_dark;
      this.ttZ = a.f.page_active_dark;
      return;
    }
    this.ttY = a.f.page_normal;
    this.ttZ = a.f.page_active;
  }
  
  public void setDotCount(int paramInt)
  {
    x.v("MicroMsg.MMDotView", "setDotCount:%d", new Object[] { Integer.valueOf(paramInt) });
    if (paramInt < 0) {}
    ImageView localImageView;
    do
    {
      return;
      int i = paramInt;
      if (paramInt > this.daw)
      {
        x.i("MicroMsg.MMDotView", "large than max count");
        i = this.daw;
      }
      removeAllViews();
      while (i != 0)
      {
        localImageView = (ImageView)View.inflate(getContext(), a.h.mmpage_control_image, null);
        localImageView.setImageResource(this.ttY);
        addView(localImageView);
        i -= 1;
      }
      localImageView = (ImageView)getChildAt(0);
    } while (localImageView == null);
    localImageView.setImageResource(this.ttZ);
  }
  
  public void setInvertedStyle(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.ttY = a.f.page_active;
      this.ttZ = a.f.page_normal;
      return;
    }
    this.ttY = a.f.page_normal;
    this.ttZ = a.f.page_active;
  }
  
  public void setMaxCount(int paramInt)
  {
    x.d("MicroMsg.MMDotView", "setMaxCount:%d", new Object[] { Integer.valueOf(paramInt) });
    this.daw = paramInt;
  }
  
  public void setSelectedDot(int paramInt)
  {
    x.v("MicroMsg.MMDotView", "setSelectedDot:target index is %d", new Object[] { Integer.valueOf(paramInt) });
    int i;
    if (paramInt >= getChildCount()) {
      i = getChildCount() - 1;
    }
    for (;;)
    {
      x.v("MicroMsg.MMDotView", "setSelectedDot:after adjust index is %d", new Object[] { Integer.valueOf(i) });
      paramInt = 0;
      while (paramInt < getChildCount())
      {
        ((ImageView)getChildAt(paramInt)).setImageResource(this.ttY);
        paramInt += 1;
      }
      i = paramInt;
      if (paramInt < 0) {
        i = 0;
      }
    }
    ImageView localImageView = (ImageView)getChildAt(i);
    if (localImageView != null) {
      localImageView.setImageResource(this.ttZ);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/ui/base/MMDotView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */