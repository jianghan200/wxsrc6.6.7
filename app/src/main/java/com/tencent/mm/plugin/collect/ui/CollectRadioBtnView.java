package com.tencent.mm.plugin.collect.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.ui.y;

public class CollectRadioBtnView
  extends LinearLayout
{
  private TextView gsY;
  private ImageView hZd;
  
  public CollectRadioBtnView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init(paramContext);
  }
  
  public CollectRadioBtnView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init(paramContext);
  }
  
  private void init(Context paramContext)
  {
    paramContext = y.gq(paramContext).inflate(a.g.collect_bill_radio_btn, this);
    this.hZd = ((ImageView)paramContext.findViewById(a.f.radio_iv));
    this.gsY = ((TextView)paramContext.findViewById(a.f.title_tv));
  }
  
  public void setRadioSrc(int paramInt)
  {
    this.hZd.setImageResource(paramInt);
  }
  
  public void setTitleText(String paramString)
  {
    this.gsY.setText(paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/collect/ui/CollectRadioBtnView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */