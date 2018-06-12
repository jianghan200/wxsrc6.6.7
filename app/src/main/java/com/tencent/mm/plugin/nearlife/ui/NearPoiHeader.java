package com.tencent.mm.plugin.nearlife.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;

public class NearPoiHeader
  extends LinearLayout
{
  private TextView fAK;
  private ImageView kYV;
  
  public NearPoiHeader(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init(paramContext);
  }
  
  @TargetApi(11)
  public NearPoiHeader(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init(paramContext);
  }
  
  private void init(Context paramContext)
  {
    paramContext = View.inflate(paramContext, R.i.near_header_item, this);
    this.kYV = ((ImageView)paramContext.findViewById(R.h.location_icon));
    this.fAK = ((TextView)paramContext.findViewById(R.h.life_item_title));
  }
  
  public void setText(CharSequence paramCharSequence)
  {
    this.fAK.setText(paramCharSequence);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/nearlife/ui/NearPoiHeader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */