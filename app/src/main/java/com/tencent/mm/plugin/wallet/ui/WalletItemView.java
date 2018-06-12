package com.tencent.mm.plugin.wallet.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.k;

public class WalletItemView
  extends LinearLayout
{
  private String cZH;
  private TextView gsY;
  private String lQs;
  private int lSS = 1;
  private TextView lSk;
  private Object mData = null;
  private int mType = 0;
  
  public WalletItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public WalletItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, a.k.WalletItemView, paramInt, 0);
    paramInt = paramAttributeSet.getResourceId(a.k.WalletItemView_walletTitle, 0);
    if (paramInt != 0) {
      this.cZH = paramContext.getString(paramInt);
    }
    paramInt = paramAttributeSet.getResourceId(a.k.WalletItemView_walletSummary, 0);
    if (paramInt != 0) {
      this.lQs = paramContext.getString(paramInt);
    }
    this.lSS = paramAttributeSet.getInt(a.k.WalletItemView_android_lines, 1);
    paramAttributeSet.recycle();
    paramContext = LayoutInflater.from(paramContext).inflate(a.g.wallet_item_view, this, true);
    this.gsY = ((TextView)paramContext.findViewById(a.f.title_tv));
    this.lSk = ((TextView)paramContext.findViewById(a.f.summary_tv));
    if (this.gsY != null) {
      this.gsY.setText(this.cZH);
    }
    if (this.lSk != null)
    {
      this.lSk.setText(this.lQs);
      this.lSk.setLines(this.lSS);
    }
  }
  
  public Object getData()
  {
    return this.mData;
  }
  
  public int getType()
  {
    return this.mType;
  }
  
  public void setSummary(Spanned paramSpanned)
  {
    this.lQs = paramSpanned.toString();
    this.lSk.setText(this.lQs);
  }
  
  public void setSummary(String paramString)
  {
    this.lQs = paramString;
    this.lSk.setText(this.lQs);
  }
  
  public void setTitle(String paramString)
  {
    this.cZH = paramString;
    this.gsY.setText(this.cZH);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/wallet/ui/WalletItemView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */