package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.ui.base.MMPageControlView;
import java.util.Map;

public class AdLandingControlView
  extends MMPageControlView
{
  public AdLandingControlView(Context paramContext)
  {
    super(paramContext);
  }
  
  public AdLandingControlView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  protected final void wR(int paramInt)
  {
    removeAllViews();
    if (paramInt >= this.count) {
      return;
    }
    int j = this.count;
    int i = 0;
    label20:
    if (i < j)
    {
      this.bOA = null;
      if (paramInt != i) {
        break label141;
      }
      if (this.map.size() > i) {
        this.bOA = ((ImageView)this.map.get(Integer.valueOf(i)));
      }
      if (this.bOA == null)
      {
        this.bOA = ((ImageView)View.inflate(this.context, this.twg, null).findViewById(i.f.mmpage_control_img));
        this.map.put(Integer.valueOf(i), this.bOA);
      }
      this.bOA.setSelected(true);
    }
    for (;;)
    {
      addView(this.bOA);
      i += 1;
      break label20;
      break;
      label141:
      if (this.map.size() > i) {
        this.bOA = ((ImageView)this.map.get(Integer.valueOf(i)));
      }
      if (this.bOA == null)
      {
        this.bOA = ((ImageView)View.inflate(this.context, this.twg, null).findViewById(i.f.mmpage_control_img));
        this.map.put(Integer.valueOf(i), this.bOA);
      }
      this.bOA.setSelected(false);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/widget/AdLandingControlView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */