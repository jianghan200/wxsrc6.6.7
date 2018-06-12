package com.tencent.mm.plugin.wallet_payu.security_question.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.k;
import com.tencent.mm.ui.tools.CustomFitTextView;
import com.tencent.mm.w.a.d;

public class WalletPayUSecurityQuestionView
  extends LinearLayout
{
  private Context mContext;
  private TextView pGu;
  private CustomFitTextView pGv;
  String pGw;
  
  public WalletPayUSecurityQuestionView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, -1);
  }
  
  public WalletPayUSecurityQuestionView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    this.mContext = paramContext;
    paramContext = "";
    Object localObject = "";
    boolean bool;
    if (paramAttributeSet != null)
    {
      TypedArray localTypedArray = this.mContext.obtainStyledAttributes(paramAttributeSet, a.k.EditHintView, -1, 0);
      paramInt = localTypedArray.getResourceId(a.k.EditHintView_tipmsg, 0);
      if (paramInt != 0) {
        paramContext = this.mContext.getString(paramInt);
      }
      paramInt = localTypedArray.getResourceId(a.k.EditHintView_hint, 0);
      paramAttributeSet = (AttributeSet)localObject;
      if (paramInt != 0) {
        paramAttributeSet = this.mContext.getString(paramInt);
      }
      bool = localTypedArray.getBoolean(a.k.EditHintView_android_clickable, false);
      localTypedArray.recycle();
    }
    for (;;)
    {
      localObject = LayoutInflater.from(this.mContext).inflate(a.g.payu_view_secret_question, this, true);
      this.pGu = ((TextView)((View)localObject).findViewById(a.f.tip_tv));
      this.pGv = ((CustomFitTextView)((View)localObject).findViewById(a.f.pre_filled_tv));
      this.pGu.setText(paramContext);
      paramContext = this.pGv;
      paramContext.a(paramAttributeSet, paramContext.maxLines, paramContext.uwQ, paramContext.uwO, paramContext.getResources().getColor(a.d.hint_text_color));
      if (!bool)
      {
        this.pGv.setEnabled(false);
        this.pGv.setFocusable(false);
        this.pGv.setClickable(false);
        this.pGv.setBackgroundResource(a.e.transparent_background);
        setBackgroundResource(a.e.list_item_normal);
        return;
      }
      this.pGv.setEnabled(false);
      this.pGv.setTextColor(getResources().getColor(a.c.wallet_common_clickable_text_color));
      this.pGv.setFocusable(false);
      this.pGv.setClickable(false);
      this.pGv.setBackgroundResource(a.e.transparent_background);
      setBackgroundResource(a.e.comm_list_item_selector);
      return;
      bool = false;
      paramContext = "";
      paramAttributeSet = (AttributeSet)localObject;
    }
  }
  
  public String getCurrentQuestion()
  {
    return this.pGw;
  }
  
  public void setQuestionText(String paramString)
  {
    this.pGw = paramString;
    KeyListener localKeyListener = this.pGv.getKeyListener();
    this.pGv.setInputType(1);
    this.pGv.setKeyListener(null);
    setValStr(paramString);
    this.pGv.setKeyListener(localKeyListener);
  }
  
  public void setValStr(String paramString)
  {
    CustomFitTextView localCustomFitTextView = this.pGv;
    localCustomFitTextView.a(paramString, 3, false, -1, localCustomFitTextView.getCurrentTextColor());
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/wallet_payu/security_question/ui/WalletPayUSecurityQuestionView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */