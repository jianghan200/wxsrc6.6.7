package com.tencent.mm.plugin.appbrand.widget.e;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.plugin.appbrand.q.f;

public final class c
  extends LinearLayout
{
  public static final int gMp = Color.parseColor("#000000");
  public static final int gMq = Color.parseColor("#000000");
  private TextView eGX;
  
  public c(Context paramContext)
  {
    super(paramContext);
    setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
    setOrientation(1);
    setGravity(17);
    this.eGX = new TextView(paramContext);
    this.eGX.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
    addView(this.eGX);
    int i = f.lP(3);
    setPadding(i, i, i, i);
  }
  
  public final void ca(int paramInt1, int paramInt2)
  {
    b localb = new b();
    localb.Tl = paramInt1;
    localb.cN.setColor(paramInt2);
    setBackgroundDrawable(localb);
  }
  
  public final void setGravity(String paramString)
  {
    if (paramString.equals("left"))
    {
      this.eGX.setGravity(3);
      return;
    }
    if (paramString.equals("right"))
    {
      this.eGX.setGravity(5);
      return;
    }
    paramString.equals("center");
    this.eGX.setGravity(17);
  }
  
  public final void setText(String paramString)
  {
    this.eGX.setText(paramString);
  }
  
  public final void setTextColor(int paramInt)
  {
    this.eGX.setTextColor(paramInt);
  }
  
  public final void setTextSize(int paramInt)
  {
    this.eGX.setTextSize(paramInt);
  }
  
  public final void setTitlePadding(int paramInt)
  {
    this.eGX.setPadding(paramInt, paramInt, paramInt, paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/e/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */