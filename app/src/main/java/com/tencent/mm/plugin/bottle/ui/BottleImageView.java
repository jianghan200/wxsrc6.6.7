package com.tencent.mm.plugin.bottle.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.widget.ImageView;

public class BottleImageView
  extends ImageView
{
  int Om;
  int On;
  int Oo;
  int Op;
  Context context;
  private int hlh;
  private int hli;
  Animation hlj = new BottleImageView.1(this);
  
  public BottleImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.context = paramContext;
    aup();
  }
  
  public BottleImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.context = paramContext;
    aup();
  }
  
  private void aup()
  {
    Drawable localDrawable = getBackground();
    if (localDrawable != null)
    {
      this.hlh = localDrawable.getIntrinsicWidth();
      this.hli = localDrawable.getIntrinsicHeight();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/bottle/ui/BottleImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */