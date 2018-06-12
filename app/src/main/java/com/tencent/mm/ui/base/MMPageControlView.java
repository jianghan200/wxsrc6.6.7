package com.tencent.mm.ui.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.mm.w.a.g;
import com.tencent.mm.w.a.h;
import java.util.HashMap;
import java.util.Map;

public class MMPageControlView
  extends LinearLayout
{
  public ImageView bOA;
  public Context context;
  public int count;
  public Map<Integer, ImageView> map = new HashMap();
  public int twg = a.h.mmpage_control_image;
  
  public MMPageControlView(Context paramContext)
  {
    super(paramContext);
    this.context = paramContext;
  }
  
  public MMPageControlView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.context = paramContext;
  }
  
  public final void eS(int paramInt1, int paramInt2)
  {
    this.count = paramInt1;
    wR(paramInt2);
  }
  
  public void setIndicatorLayoutRes(int paramInt)
  {
    this.twg = paramInt;
  }
  
  public void setPage(int paramInt)
  {
    wR(paramInt);
  }
  
  public void wR(int paramInt)
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
        break label156;
      }
      if (this.map.size() > i) {
        this.bOA = ((ImageView)this.map.get(Integer.valueOf(i)));
      }
      if (this.bOA == null)
      {
        this.bOA = ((ImageView)View.inflate(this.context, this.twg, null).findViewById(a.g.mmpage_control_img));
        this.map.put(Integer.valueOf(i), this.bOA);
      }
      this.bOA.setSelected(true);
    }
    for (;;)
    {
      if (i == 0) {
        this.bOA.setPadding(0, 0, 0, 0);
      }
      addView(this.bOA);
      i += 1;
      break label20;
      break;
      label156:
      if (this.map.size() > i) {
        this.bOA = ((ImageView)this.map.get(Integer.valueOf(i)));
      }
      if (this.bOA == null)
      {
        this.bOA = ((ImageView)View.inflate(this.context, this.twg, null).findViewById(a.g.mmpage_control_img));
        this.map.put(Integer.valueOf(i), this.bOA);
      }
      this.bOA.setSelected(false);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ui/base/MMPageControlView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */