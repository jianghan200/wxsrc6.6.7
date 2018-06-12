package com.tencent.mm.plugin.location.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.plugin.map.a.e;
import com.tencent.mm.plugin.map.a.f;
import com.tencent.mm.ui.base.MMImageButton;

public class ShareHeader
  extends LinearLayout
{
  private TextView eBO;
  private ViewGroup kFw;
  private MMImageButton kFx;
  private MMImageButton kFy;
  private Context mContext;
  
  public ShareHeader(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.mContext = paramContext;
    init();
  }
  
  @TargetApi(11)
  public ShareHeader(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.mContext = paramContext;
    init();
  }
  
  private void init()
  {
    View localView = View.inflate(this.mContext, a.f.share_header, this);
    this.kFw = ((ViewGroup)localView.findViewById(a.e.header_bar));
    this.kFx = ((MMImageButton)localView.findViewById(a.e.title_left_button));
    this.kFy = ((MMImageButton)localView.findViewById(a.e.title_right_button));
    this.eBO = ((TextView)localView.findViewById(a.e.title));
  }
  
  public ViewGroup getHeaderBar()
  {
    return this.kFw;
  }
  
  public void setOnLeftClickListener(View.OnClickListener paramOnClickListener)
  {
    this.kFx.setOnClickListener(paramOnClickListener);
  }
  
  public void setOnRightClickListener(View.OnClickListener paramOnClickListener)
  {
    this.kFy.setOnClickListener(paramOnClickListener);
  }
  
  public void setTitle(String paramString)
  {
    this.eBO.setText(paramString);
  }
  
  public void setTitleColor(int paramInt)
  {
    this.eBO.setTextColor(paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/location/ui/ShareHeader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */