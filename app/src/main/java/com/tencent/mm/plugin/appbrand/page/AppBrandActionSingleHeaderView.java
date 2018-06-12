package com.tencent.mm.plugin.appbrand.page;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.plugin.appbrand.s.g;
import com.tencent.mm.plugin.appbrand.s.h;

public class AppBrandActionSingleHeaderView
  extends LinearLayout
{
  private ImageView bOA;
  private TextView ePz;
  
  public AppBrandActionSingleHeaderView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init(paramContext);
  }
  
  @TargetApi(11)
  public AppBrandActionSingleHeaderView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init(paramContext);
  }
  
  private void init(Context paramContext)
  {
    ((LayoutInflater)paramContext.getSystemService("layout_inflater")).inflate(s.h.appbrand_action_single_header, this);
    this.bOA = ((ImageView)findViewById(s.g.appbrand_action_single_header_image));
    this.ePz = ((TextView)findViewById(s.g.appbrand_action_single_header_text));
  }
  
  public ImageView getImageView()
  {
    return this.bOA;
  }
  
  public void setImageDrawable(Drawable paramDrawable)
  {
    this.bOA.setImageDrawable(paramDrawable);
  }
  
  public void setImageResource(int paramInt)
  {
    this.bOA.setImageResource(paramInt);
  }
  
  public void setTextViewText(String paramString)
  {
    this.ePz.setText(paramString);
  }
  
  public void setTextViewTextColor(int paramInt)
  {
    this.ePz.setTextColor(paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/page/AppBrandActionSingleHeaderView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */