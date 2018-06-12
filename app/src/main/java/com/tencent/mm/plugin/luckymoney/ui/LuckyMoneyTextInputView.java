package com.tencent.mm.plugin.luckymoney.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.ui.widget.MMEditText;

public class LuckyMoneyTextInputView
  extends LinearLayout
  implements b
{
  private TextView gsY;
  private f kLt;
  private MMEditText kMR;
  
  public LuckyMoneyTextInputView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramContext = LayoutInflater.from(paramContext).inflate(a.g.lucky_money_text_input_view, this, true);
    this.kMR = ((MMEditText)paramContext.findViewById(a.f.lucky_money_text));
    this.gsY = ((TextView)paramContext.findViewById(a.f.lucky_money_text_input_title));
    this.kMR.setOnFocusChangeListener(new View.OnFocusChangeListener()
    {
      public final void onFocusChange(View paramAnonymousView, boolean paramAnonymousBoolean)
      {
        if (LuckyMoneyTextInputView.a(LuckyMoneyTextInputView.this) != null)
        {
          paramAnonymousView = LuckyMoneyTextInputView.a(LuckyMoneyTextInputView.this);
          LuckyMoneyTextInputView.this.getInputViewId();
          paramAnonymousView.baD();
        }
      }
    });
  }
  
  public final int baC()
  {
    return 0;
  }
  
  public String getInput()
  {
    return this.kMR.getText().toString();
  }
  
  public int getInputViewId()
  {
    return getId();
  }
  
  public final void onError() {}
  
  public final String rV(int paramInt)
  {
    return null;
  }
  
  public final void restore() {}
  
  public void setHintText(String paramString)
  {
    this.kMR.setHint(paramString);
  }
  
  public void setOnInputValidChangerListener(f paramf)
  {
    this.kLt = paramf;
  }
  
  public void setTitle(String paramString)
  {
    this.gsY.setText(paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyTextInputView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */