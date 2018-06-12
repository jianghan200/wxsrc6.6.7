package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.i;

public class SightLocationWidget
  extends LocationWidget
{
  public SightLocationWidget(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public SightLocationWidget(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  protected int getLayoutResource()
  {
    return i.g.location_widget;
  }
  
  protected int getNormalStateImageResource()
  {
    return i.i.sight_icon_location_normal;
  }
  
  protected int getSelectedStateImageResource()
  {
    return i.i.sight_icon_location_selected;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/SightLocationWidget.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */