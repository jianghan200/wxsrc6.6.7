package com.tencent.mm.plugin.aa.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.ui.y;

public class AAQueryListLoadingMoreView
  extends LinearLayout
{
  public AAQueryListLoadingMoreView(Context paramContext)
  {
    super(paramContext);
    init(paramContext);
  }
  
  public AAQueryListLoadingMoreView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init(paramContext);
  }
  
  public AAQueryListLoadingMoreView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init(paramContext);
  }
  
  private void init(Context paramContext)
  {
    y.gq(paramContext).inflate(a.g.aa_record_list_loading_more, this, true);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/aa/ui/AAQueryListLoadingMoreView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */