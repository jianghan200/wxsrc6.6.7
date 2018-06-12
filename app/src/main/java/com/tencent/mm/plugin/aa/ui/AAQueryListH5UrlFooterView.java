package com.tencent.mm.plugin.aa.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.ui.y;

public class AAQueryListH5UrlFooterView
  extends LinearLayout
{
  private TextView eBT;
  
  public AAQueryListH5UrlFooterView(Context paramContext)
  {
    super(paramContext);
    init(paramContext);
  }
  
  public AAQueryListH5UrlFooterView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init(paramContext);
  }
  
  public AAQueryListH5UrlFooterView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init(paramContext);
  }
  
  private void init(Context paramContext)
  {
    this.eBT = ((TextView)y.gq(paramContext).inflate(a.g.aa_record_list_h5url_footer, this, true).findViewById(a.f.aa_record_bottom_link_tv));
  }
  
  public TextView getBottomLinkTv()
  {
    return this.eBT;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/aa/ui/AAQueryListH5UrlFooterView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */