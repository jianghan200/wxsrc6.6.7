package com.tencent.mm.plugin.appbrand.page;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.bw.a.c;
import com.tencent.mm.plugin.appbrand.s.g;
import com.tencent.mm.plugin.appbrand.s.h;

public class AppBrandActionHeaderLayout
  extends LinearLayout
{
  public LinearLayout glR;
  public HorizontalScrollView glS;
  public AppBrandActionSingleHeaderView glT;
  private AppBrandActionMultipleHeaderView glU;
  private AppBrandActionMultipleHeaderView glV;
  private AppBrandActionMultipleHeaderView glW;
  private AppBrandActionMultipleHeaderView glX;
  private TextView glY;
  private int glZ = 1;
  private int gma = 2;
  private String mAppId;
  private Context mContext;
  
  public AppBrandActionHeaderLayout(Context paramContext)
  {
    super(paramContext);
    co(paramContext);
  }
  
  public AppBrandActionHeaderLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    co(paramContext);
  }
  
  @TargetApi(11)
  public AppBrandActionHeaderLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    co(paramContext);
  }
  
  private void co(Context paramContext)
  {
    this.mContext = paramContext;
    ((LayoutInflater)this.mContext.getSystemService("layout_inflater")).inflate(s.h.appbrand_action_game_header_layout, this);
    this.glR = ((LinearLayout)findViewById(s.g.appbrand_action_header_single_layout));
    this.glS = ((HorizontalScrollView)findViewById(s.g.appbrand_action_header_hscrollview));
    this.glT = ((AppBrandActionSingleHeaderView)findViewById(s.g.appbrand_action_single_header_view));
    this.glU = ((AppBrandActionMultipleHeaderView)findViewById(s.g.appbrand_action_multiple_header_view1));
    this.glV = ((AppBrandActionMultipleHeaderView)findViewById(s.g.appbrand_action_multiple_header_view2));
    this.glW = ((AppBrandActionMultipleHeaderView)findViewById(s.g.appbrand_action_multiple_header_view3));
    this.glX = ((AppBrandActionMultipleHeaderView)findViewById(s.g.appbrand_action_multiple_header_view4));
    this.glY = ((TextView)findViewById(s.g.appbrand_action_header_status));
    this.glU.setVisibility(8);
    this.glV.setVisibility(8);
    this.glW.setVisibility(8);
    this.glX.setVisibility(8);
    this.glY.setVisibility(8);
  }
  
  public void setActionHeaderStyle(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.glT.setTextViewTextColor(this.mContext.getResources().getColor(a.c.white_text_color));
      this.glU.setTextViewTextColor(this.mContext.getResources().getColor(a.c.white_text_color));
      this.glV.setTextViewTextColor(this.mContext.getResources().getColor(a.c.white_text_color));
      this.glW.setTextViewTextColor(this.mContext.getResources().getColor(a.c.white_text_color));
      this.glX.setTextViewTextColor(this.mContext.getResources().getColor(a.c.white_text_color));
      this.glY.setTextColor(this.mContext.getResources().getColor(a.c.white_text_color));
      return;
    }
    this.glT.setTextViewTextColor(this.mContext.getResources().getColor(a.c.bottom_sheet_text_color));
    this.glU.setTextViewTextColor(this.mContext.getResources().getColor(a.c.bottom_sheet_text_color));
    this.glV.setTextViewTextColor(this.mContext.getResources().getColor(a.c.bottom_sheet_text_color));
    this.glW.setTextViewTextColor(this.mContext.getResources().getColor(a.c.bottom_sheet_text_color));
    this.glX.setTextViewTextColor(this.mContext.getResources().getColor(a.c.bottom_sheet_text_color));
    this.glY.setTextColor(this.mContext.getResources().getColor(a.c.bottom_sheet_text_color));
  }
  
  public void setAppId(String paramString)
  {
    this.mAppId = paramString;
  }
  
  public void setStatusId(int paramInt)
  {
    this.glY.setText(paramInt);
    this.glY.setVisibility(0);
    this.glR.setVisibility(8);
    this.glS.setVisibility(8);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/page/AppBrandActionHeaderLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */