package com.tencent.mm.plugin.label.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.MMTagPanel;

public class MMLabelPanel
  extends MMTagPanel
{
  public MMLabelPanel(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public MMLabelPanel(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  protected final void aMU()
  {
    x.d("MicroMsg.Label.MMLabelPanel", "cpan[onPreDelTag]");
    if (getTagCount() > 0) {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/label/ui/widget/MMLabelPanel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */