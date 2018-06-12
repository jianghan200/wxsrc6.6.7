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

public class AppBrandActionMultipleHeaderView
  extends LinearLayout
{
  private ImageView bOA;
  private TextView ePz;
  private String gmb;
  private String path;
  private int type;
  private String username;
  
  public AppBrandActionMultipleHeaderView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init(paramContext);
  }
  
  @TargetApi(11)
  public AppBrandActionMultipleHeaderView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init(paramContext);
  }
  
  private void init(Context paramContext)
  {
    ((LayoutInflater)paramContext.getSystemService("layout_inflater")).inflate(s.h.appbrand_action_multiple_header, this);
    this.bOA = ((ImageView)findViewById(s.g.appbrand_action_multiple_header_image));
    this.ePz = ((TextView)findViewById(s.g.appbrand_action_multiple_header_text));
  }
  
  public String getH5Url()
  {
    return this.gmb;
  }
  
  public ImageView getImageView()
  {
    return this.bOA;
  }
  
  public String getPath()
  {
    return this.path;
  }
  
  public int getType()
  {
    return this.type;
  }
  
  public String getUsername()
  {
    return this.username;
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


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/page/AppBrandActionMultipleHeaderView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */