package com.tencent.mm.plugin.radar.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TableLayout;

public final class RadarSpecialTableLayout
  extends TableLayout
{
  private boolean mly;
  
  public RadarSpecialTableLayout(Context paramContext)
  {
    super(paramContext);
  }
  
  public RadarSpecialTableLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int j;
    int i;
    if ((!this.mly) && (paramInt2 < 0))
    {
      j = paramInt4 - paramInt2;
      i = 1;
    }
    for (;;)
    {
      this.mly = false;
      if (i == 0)
      {
        super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
        return;
      }
      layout(paramInt1, 0, paramInt3, j);
      return;
      i = 0;
      j = 0;
    }
  }
  
  public final void s(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.mly = true;
    super.layout(paramInt1, paramInt2, paramInt3, paramInt4);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/radar/ui/RadarSpecialTableLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */