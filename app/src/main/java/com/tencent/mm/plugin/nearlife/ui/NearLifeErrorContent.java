package com.tencent.mm.plugin.nearlife.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;

public class NearLifeErrorContent
  extends FrameLayout
{
  private View contentView;
  private ListView eZb;
  private TextView lEt;
  private View lEu;
  private Context mContext;
  
  public NearLifeErrorContent(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.mContext = paramContext;
    init();
  }
  
  public NearLifeErrorContent(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.mContext = paramContext;
    init();
  }
  
  private void init()
  {
    this.contentView = View.inflate(this.mContext, R.i.near_life_error_content, this);
    this.lEt = ((TextView)this.contentView.findViewById(R.h.near_life_not_found));
    this.lEu = this.contentView.findViewById(R.h.nearby_life_locate_failed);
  }
  
  public void setListView(ListView paramListView)
  {
    this.eZb = paramListView;
  }
  
  public final void tW(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return;
    case 0: 
      this.lEt.setVisibility(8);
      this.lEu.setVisibility(8);
      this.eZb.setVisibility(0);
      return;
    case 1: 
      this.lEt.setVisibility(0);
      this.lEu.setVisibility(8);
      this.eZb.setVisibility(8);
      return;
    }
    this.lEt.setVisibility(8);
    this.lEu.setVisibility(0);
    this.eZb.setVisibility(8);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/nearlife/ui/NearLifeErrorContent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */