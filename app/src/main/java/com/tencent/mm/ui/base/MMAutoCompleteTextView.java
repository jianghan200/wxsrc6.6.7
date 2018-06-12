package com.tencent.mm.ui.base;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.widget.AutoCompleteTextView;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.w.a.f;

public class MMAutoCompleteTextView
  extends AutoCompleteTextView
{
  final Drawable qFN = getResources().getDrawable(a.f.list_clear);
  private a ttD;
  
  public MMAutoCompleteTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.qFN.setBounds(0, 0, this.qFN.getIntrinsicWidth(), this.qFN.getIntrinsicHeight());
    cdi();
    setOnTouchListener(new MMAutoCompleteTextView.1(this));
    addTextChangedListener(new MMAutoCompleteTextView.2(this));
    setOnFocusChangeListener(new MMAutoCompleteTextView.3(this));
  }
  
  private void cdi()
  {
    if ((getText().toString().equals("")) || (!isFocused()))
    {
      cdk();
      return;
    }
    setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], this.qFN, getCompoundDrawables()[3]);
  }
  
  private void cdk()
  {
    setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], null, getCompoundDrawables()[3]);
  }
  
  public void setSpilter(String paramString)
  {
    if (!bi.oW(paramString))
    {
      this.ttD = new a(paramString);
      addTextChangedListener(this.ttD);
    }
  }
  
  private final class a
    implements TextWatcher
  {
    private String ttF;
    
    public a(String paramString)
    {
      this.ttF = paramString;
    }
    
    public final void afterTextChanged(Editable paramEditable)
    {
      if (paramEditable.toString().endsWith(this.ttF)) {
        MMAutoCompleteTextView.this.showDropDown();
      }
    }
    
    public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
    
    public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/ui/base/MMAutoCompleteTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */