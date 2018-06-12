package com.tencent.mm.plugin.sns.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;

public class ClassifyHeader
  extends LinearLayout
{
  private TextView fAK;
  private ImageView kYV;
  private Context mContext;
  
  public ClassifyHeader(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init(paramContext);
  }
  
  @TargetApi(11)
  public ClassifyHeader(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init(paramContext);
  }
  
  private void init(Context paramContext)
  {
    this.mContext = paramContext;
    paramContext = View.inflate(this.mContext, i.g.classify_header, this);
    this.kYV = ((ImageView)paramContext.findViewById(i.f.left_iv));
    this.fAK = ((TextView)paramContext.findViewById(i.f.header_desc));
  }
  
  public void setDesc(String paramString)
  {
    this.fAK.setText(paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/ClassifyHeader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */