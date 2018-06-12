package com.tencent.mm.plugin.wallet_core.ui.view;

import android.content.Context;
import android.text.TextUtils.TruncateAt;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.sdk.platformtools.bi;

public class SwitchPhoneItemView
  extends RelativeLayout
{
  private TextView pzA;
  private TextView pzB;
  ImageView pzC;
  private int pzD = 0;
  
  public SwitchPhoneItemView(Context paramContext)
  {
    this(paramContext, 0);
  }
  
  public SwitchPhoneItemView(Context paramContext, int paramInt)
  {
    super(paramContext);
    this.pzD = paramInt;
    co(paramContext);
  }
  
  public SwitchPhoneItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    co(paramContext);
  }
  
  public SwitchPhoneItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    co(paramContext);
  }
  
  private void co(Context paramContext)
  {
    if (this.pzD > 0) {}
    for (paramContext = inflate(paramContext, this.pzD, this);; paramContext = inflate(paramContext, a.g.wallet_switch_verify_phone_item, this))
    {
      this.pzA = ((TextView)paramContext.findViewById(a.f.phone_number_tv));
      this.pzB = ((TextView)paramContext.findViewById(a.f.phone_desc_tv));
      this.pzC = ((ImageView)paramContext.findViewById(a.f.phone_check_iv));
      return;
    }
  }
  
  public final void a(CharSequence paramCharSequence1, CharSequence paramCharSequence2)
  {
    if (!bi.K(paramCharSequence1)) {
      this.pzA.setText(paramCharSequence1);
    }
    while (!bi.K(paramCharSequence2))
    {
      this.pzB.setMaxLines(2);
      this.pzB.setSelected(true);
      this.pzB.setEllipsize(TextUtils.TruncateAt.MIDDLE);
      this.pzB.setText(paramCharSequence2);
      this.pzB.setMovementMethod(LinkMovementMethod.getInstance());
      return;
      this.pzA.setVisibility(8);
    }
    this.pzB.setVisibility(8);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/ui/view/SwitchPhoneItemView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */