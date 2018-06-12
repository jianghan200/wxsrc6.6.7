package com.tencent.mm.plugin.collect.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.mm.bp.a;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.ui.base.MMPullDownView;

public class CollectPullDownView
  extends MMPullDownView
{
  public CollectPullDownView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public CollectPullDownView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  protected final void aCz()
  {
    View localView1 = inflate(this.context, a.g.collect_bill_list_loading_view, null);
    View localView2 = inflate(this.context, a.g.collect_bill_list_loading_view, null);
    addView(localView1, 0, new FrameLayout.LayoutParams(-1, a.fromDPToPix(this.context, 48)));
    addView(localView2, new FrameLayout.LayoutParams(-1, a.fromDPToPix(this.context, 48)));
  }
  
  public void setLoadDataEnd(boolean paramBoolean)
  {
    this.tww = paramBoolean;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/collect/ui/CollectPullDownView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */