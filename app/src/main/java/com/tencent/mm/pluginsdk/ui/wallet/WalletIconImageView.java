package com.tencent.mm.pluginsdk.ui.wallet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.i;

public class WalletIconImageView
  extends ImageView
{
  private int jp = 4;
  private int qUD = -1;
  private View.OnClickListener qUE = null;
  
  public WalletIconImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, -1);
  }
  
  public WalletIconImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public final void cfD()
  {
    super.setVisibility(this.jp);
    super.setImageResource(this.qUD);
    super.setOnClickListener(this.qUE);
  }
  
  public void setImageResource(int paramInt)
  {
    this.qUD = paramInt;
    super.setImageResource(paramInt);
  }
  
  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    this.qUE = paramOnClickListener;
  }
  
  public void setToClearState(View.OnClickListener paramOnClickListener)
  {
    super.setVisibility(0);
    super.setImageResource(a.e.list_clear);
    super.setContentDescription(getContext().getString(a.i.clear_btn));
    super.setOnClickListener(paramOnClickListener);
  }
  
  public void setVisibility(int paramInt)
  {
    this.jp = paramInt;
    super.setVisibility(paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/pluginsdk/ui/wallet/WalletIconImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */