package com.tencent.mm.ui.base;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.bp.a;
import com.tencent.mm.w.a.d;

public class MMImageButton
  extends FrameLayout
{
  private ImageView bRk;
  private TextView lSz;
  
  public MMImageButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public MMImageButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramAttributeSet = new FrameLayout.LayoutParams(-2, -2);
    paramAttributeSet.gravity = 17;
    this.bRk = new ImageView(paramContext);
    this.bRk.setLayoutParams(paramAttributeSet);
    addView(this.bRk);
    paramAttributeSet = new FrameLayout.LayoutParams(-2, -2);
    paramAttributeSet.gravity = 17;
    this.lSz = new TextView(paramContext);
    this.lSz.setLayoutParams(paramAttributeSet);
    this.lSz.setClickable(false);
    this.lSz.setFocusable(false);
    this.lSz.setFocusableInTouchMode(false);
    this.lSz.setTextColor(a.ac(paramContext, a.d.mm_title_btn_text));
    addView(this.lSz);
  }
  
  public void setEnabled(boolean paramBoolean)
  {
    super.setEnabled(paramBoolean);
    this.lSz.setEnabled(paramBoolean);
    this.bRk.setEnabled(paramBoolean);
  }
  
  public void setImageDrawable(Drawable paramDrawable)
  {
    this.bRk.setImageDrawable(paramDrawable);
    this.bRk.setVisibility(0);
    this.lSz.setVisibility(8);
  }
  
  public void setImageRsource(int paramInt)
  {
    setImageDrawable(a.f(getContext(), paramInt));
  }
  
  public void setText(int paramInt)
  {
    this.lSz.setText(paramInt);
    this.lSz.setVisibility(0);
    this.bRk.setVisibility(8);
  }
  
  public void setText(String paramString)
  {
    this.lSz.setText(paramString);
    this.lSz.setVisibility(0);
    this.bRk.setVisibility(8);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ui/base/MMImageButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */