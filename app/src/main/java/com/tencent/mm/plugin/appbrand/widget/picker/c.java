package com.tencent.mm.plugin.appbrand.widget.picker;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.View.MeasureSpec;
import com.tencent.mm.bp.a;

public class c
  extends YANumberPicker
  implements e<String>
{
  private String[] gNb;
  private int gNd;
  
  public c(Context paramContext)
  {
    super(paramContext);
    setDividerHeight(a.fromDPToPix(paramContext, 2));
    setDividerColor(Color.parseColor("#1AAD19"));
    setItemPaddingVertical(a.fromDPToPix(paramContext, 8));
    setNormalTextColor(Color.parseColor("#A5A5A5"));
    setSelectedTextColor(-16777216);
  }
  
  public final void a(d paramd) {}
  
  public final void aqo()
  {
    aqA();
  }
  
  public final void aqp() {}
  
  public final void b(d paramd) {}
  
  public final View getView()
  {
    return this;
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    if (this.gNd > 0) {
      paramInt1 = View.MeasureSpec.makeMeasureSpec(this.gNd, 1073741824);
    }
    super.onMeasure(paramInt1, paramInt2);
  }
  
  public final void setForceWidth(int paramInt)
  {
    this.gNd = paramInt;
  }
  
  public final void setOptionsArray(String[] paramArrayOfString)
  {
    if ((paramArrayOfString == null) || (paramArrayOfString.length <= 0))
    {
      setEnabled(false);
      setVisibility(4);
      return;
    }
    setEnabled(true);
    setVisibility(0);
    this.gNb = paramArrayOfString;
    int i = getMinValue();
    int j = getMaxValue();
    int k = paramArrayOfString.length - 1;
    if (k - i + 1 > j - i + 1)
    {
      setDisplayedValues(paramArrayOfString);
      setMaxValue(k);
      return;
    }
    setMaxValue(k);
    setDisplayedValues(paramArrayOfString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/picker/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */