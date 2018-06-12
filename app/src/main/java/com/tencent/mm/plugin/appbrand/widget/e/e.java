package com.tencent.mm.plugin.appbrand.widget.e;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;

public final class e
  extends FrameLayout
{
  public static final int gMA = Color.parseColor("#000000");
  public static final int gMp = Color.parseColor("#000000");
  public static final int gMq = Color.parseColor("#000000");
  private float bhr = 0.0F;
  private float bhs = 0.0F;
  private int gMB;
  private int gMC;
  private int gMD;
  private int gME;
  private TextView gMz;
  public int x = 0;
  public int y = 0;
  
  public e(Context paramContext)
  {
    super(paramContext);
    setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
    this.gMz = new TextView(paramContext);
    paramContext = new LinearLayout.LayoutParams(-2, -2);
    this.gMz.setLayoutParams(paramContext);
    addView(this.gMz);
  }
  
  public final float getAnchorX()
  {
    return this.bhr;
  }
  
  public final float getAnchorY()
  {
    return this.bhs;
  }
  
  public final void m(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GradientDrawable localGradientDrawable = new GradientDrawable();
    localGradientDrawable.setCornerRadius(paramInt1);
    localGradientDrawable.setStroke(paramInt2, paramInt3);
    localGradientDrawable.setColor(paramInt4);
    this.gMz.setBackgroundDrawable(localGradientDrawable);
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)getChildAt(0).getLayoutParams();
    if ((this.x >= 0) && (this.y >= 0)) {
      localLayoutParams.gravity = 85;
    }
    for (;;)
    {
      super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
      return;
      if ((this.x >= 0) && (this.y <= 0)) {
        localLayoutParams.gravity = 53;
      } else if ((this.x <= 0) && (this.y >= 0)) {
        localLayoutParams.gravity = 83;
      } else if ((this.x <= 0) && (this.y <= 0)) {
        localLayoutParams.gravity = 51;
      }
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    this.gMB = getMeasuredWidth();
    this.gMC = getMeasuredHeight();
    if ((-this.gMB < this.x) && (this.x < 0))
    {
      this.gMD = this.gMB;
      this.bhr = (Math.abs(this.x) / (this.gMB * 1.0F));
      if ((-this.gMC >= this.y) || (this.y >= 0)) {
        break label179;
      }
      this.gME = this.gMC;
      this.bhs = (Math.abs(this.y) / (this.gMC * 1.0F));
    }
    for (;;)
    {
      setMeasuredDimension(this.gMD, this.gME);
      return;
      if (this.x >= 0)
      {
        this.gMD = (this.gMB + Math.abs(this.x));
        this.bhr = 0.0F;
        break;
      }
      this.gMD = Math.abs(this.x);
      this.bhr = 1.0F;
      break;
      label179:
      if (this.y >= 0)
      {
        this.gME = (this.gMC + Math.abs(this.y));
        this.bhs = 0.0F;
      }
      else
      {
        this.gME = Math.abs(this.y);
        this.bhs = 1.0F;
      }
    }
  }
  
  public final void setGravity(String paramString)
  {
    if (paramString.equals("left"))
    {
      this.gMz.setGravity(3);
      return;
    }
    if (paramString.equals("right"))
    {
      this.gMz.setGravity(5);
      return;
    }
    paramString.equals("center");
    this.gMz.setGravity(17);
  }
  
  public final void setText(String paramString)
  {
    this.gMz.setText(paramString);
  }
  
  public final void setTextColor(int paramInt)
  {
    this.gMz.setTextColor(paramInt);
  }
  
  public final void setTextPadding(int paramInt)
  {
    this.gMz.setPadding(paramInt, paramInt, paramInt, paramInt);
  }
  
  public final void setTextSize(int paramInt)
  {
    this.gMz.setTextSize(paramInt);
  }
  
  public final void setX(int paramInt)
  {
    this.x = paramInt;
  }
  
  public final void setY(int paramInt)
  {
    this.y = paramInt;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/e/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */