package com.tencent.mm.wallet_core.ui.formview;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnFocusChangeListener;
import android.widget.RelativeLayout;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.k;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ac;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.y;
import com.tenpay.android.wechat.TenpaySecureEditText;

public final class EditHintPasswdView
  extends RelativeLayout
  implements View.OnFocusChangeListener
{
  private static final int uZo = a.e.edit_passwd_bg_selector;
  private View.OnFocusChangeListener eYB = null;
  private int oTn = 1;
  private TenpaySecureEditText uZp = null;
  private int uZq = 6;
  private int uZr = uZo;
  private int uZs = 1;
  private a uZt = null;
  
  public EditHintPasswdView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, -1);
  }
  
  public EditHintPasswdView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, a.k.PwdAttr, paramInt, 0);
    this.oTn = paramAttributeSet.getInteger(a.k.PwdAttr_format, 1);
    this.uZr = paramAttributeSet.getResourceId(a.k.PwdAttr_EditTextBg, uZo);
    this.uZs = paramAttributeSet.getInteger(a.k.PwdAttr_PwdEncryptType, 1);
    paramAttributeSet.recycle();
    this.uZp = ((TenpaySecureEditText)y.gq(paramContext).inflate(a.g.hint_view_passwd, this, true).findViewById(a.f.wallet_content));
    b.a(this.uZp, this.oTn);
    this.uZq = getNumberSize();
    if (this.uZp != null)
    {
      this.uZp.setBackgroundResource(this.uZr);
      this.uZp.setImeOptions(6);
      this.uZp.setInputType(128);
      this.uZp.addTextChangedListener(new EditHintPasswdView.1(this));
      this.uZp.setOnFocusChangeListener(this);
      super.setEnabled(true);
      super.setClickable(true);
      return;
    }
    x.e("MicroMsg.EditHintPasswdView", "hy: no edit text view");
  }
  
  private boolean ZF()
  {
    return (this.uZp != null) && (this.uZp.getInputLength() == this.uZq);
  }
  
  private int getNumberSize()
  {
    switch (this.oTn)
    {
    case 2: 
    case 5: 
    case 6: 
    case 7: 
    default: 
      x.i("MicroMsg.EditHintPasswdView", "hy: error or not set format. use default");
    case 1: 
      return 6;
    case 3: 
      return 3;
    case 4: 
      return 4;
    }
    return 4;
  }
  
  public final void bqn()
  {
    if (this.uZp != null) {
      this.uZp.ClearInput();
    }
  }
  
  public final int getEncrType()
  {
    return this.uZs;
  }
  
  public final int getFormat()
  {
    return this.oTn;
  }
  
  public final String getMd5Value()
  {
    if (this.uZp != null) {
      return ac.ce(this.uZp.getText().toString());
    }
    x.w("MicroMsg.EditHintPasswdView", "hy: edit view is null");
    return "";
  }
  
  public final a getOnEditInputValidListener()
  {
    return this.uZt;
  }
  
  public final View.OnFocusChangeListener getOnFocusChangeListener()
  {
    return this.eYB;
  }
  
  public final String getText()
  {
    if (this.uZp != null) {
      return c.a.a(this.uZs, this.uZp);
    }
    x.w("MicroMsg.EditHintPasswdView", "hy: no edit view");
    return "";
  }
  
  public final void onFocusChange(View paramView, boolean paramBoolean)
  {
    if (this.eYB != null) {
      this.eYB.onFocusChange(this, paramBoolean);
    }
    if (this.uZt != null) {
      this.uZt.fE(ZF());
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    setMeasuredDimension(getDefaultSize(BackwardSupportUtil.b.b(getContext(), 960.0F), paramInt1), getDefaultSize(BackwardSupportUtil.b.b(getContext(), 720.0F), paramInt2));
    paramInt2 = getMeasuredWidth();
    if (this.uZq == 0) {}
    for (paramInt1 = paramInt2 / 6;; paramInt1 = paramInt2 / this.uZq)
    {
      int i = View.MeasureSpec.makeMeasureSpec(paramInt2, 1073741824);
      int j = View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824);
      setMeasuredDimension(getDefaultSize(paramInt2, i), getDefaultSize(paramInt1, j));
      super.onMeasure(i, j);
      return;
    }
  }
  
  public final void setEditTextMaxLength(int paramInt)
  {
    if (this.uZp != null)
    {
      InputFilter[] arrayOfInputFilter1 = this.uZp.getFilters();
      InputFilter[] arrayOfInputFilter2 = new InputFilter[arrayOfInputFilter1.length + 1];
      int i = 0;
      while (i < arrayOfInputFilter1.length)
      {
        arrayOfInputFilter2[i] = arrayOfInputFilter1[i];
        i += 1;
      }
      arrayOfInputFilter2[(arrayOfInputFilter2.length - 1)] = new InputFilter.LengthFilter(paramInt);
      this.uZp.setFilters(arrayOfInputFilter2);
    }
  }
  
  public final void setEditTextSize(float paramFloat)
  {
    if (this.uZp != null) {
      this.uZp.setTextSize(paramFloat);
    }
  }
  
  public final void setEncrType(int paramInt)
  {
    this.uZs = paramInt;
  }
  
  public final void setOnFocusChangeListener(View.OnFocusChangeListener paramOnFocusChangeListener)
  {
    this.eYB = paramOnFocusChangeListener;
  }
  
  public final void setOnInputValidListener(a parama)
  {
    this.uZt = parama;
  }
  
  public static abstract interface a
  {
    public abstract void fE(boolean paramBoolean);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/wallet_core/ui/formview/EditHintPasswdView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */