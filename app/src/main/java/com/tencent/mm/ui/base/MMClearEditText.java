package com.tencent.mm.ui.base;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnTouchListener;
import android.widget.EditText;
import android.widget.TextView.SavedState;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.e.c.b;
import com.tencent.mm.w.a.e;
import com.tencent.mm.w.a.f;

public class MMClearEditText
  extends EditText
{
  public String gLA = "";
  private View.OnFocusChangeListener mqZ = null;
  private View.OnTouchListener oQM = new MMClearEditText.3(this);
  public boolean qFM = false;
  final Drawable qFN = getResources().getDrawable(a.f.list_clear);
  int qrg = 0;
  private boolean ttU = false;
  
  public MMClearEditText(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    crs();
  }
  
  public MMClearEditText(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    crs();
  }
  
  private void Tx(String paramString)
  {
    int i = getSelectionStart();
    setText(b.d(getContext(), paramString, getTextSize()));
    int j = getText().length() - paramString.length();
    if (j > 0)
    {
      i += j;
      if (i <= getText().length()) {
        setSelection(i);
      }
      return;
    }
    setSelection(i);
  }
  
  private void cdi()
  {
    if ((getText().toString().equals("")) || (!isFocused())) {
      cdk();
    }
    while (this.ttU) {
      return;
    }
    setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], this.qFN, getCompoundDrawables()[3]);
  }
  
  private void cdk()
  {
    setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], null, getCompoundDrawables()[3]);
  }
  
  private void crs()
  {
    this.qFN.setBounds(0, 0, this.qFN.getIntrinsicWidth(), this.qFN.getIntrinsicHeight());
    x.d("MicroMsg.MMClearEditText", "imgX width %d height %d", new Object[] { Integer.valueOf(this.qFN.getIntrinsicWidth()), Integer.valueOf(this.qFN.getIntrinsicHeight()) });
    cdi();
    setHeight(this.qFN.getIntrinsicHeight() + getResources().getDimensionPixelSize(a.e.OneDPPadding) * 5);
    setOnTouchListener(this.oQM);
    addTextChangedListener(new TextWatcher()
    {
      public final void afterTextChanged(Editable paramAnonymousEditable) {}
      
      public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3) {}
      
      public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        MMClearEditText.a(MMClearEditText.this);
      }
    });
    super.setOnFocusChangeListener(new View.OnFocusChangeListener()
    {
      public final void onFocusChange(View paramAnonymousView, boolean paramAnonymousBoolean)
      {
        if (MMClearEditText.b(MMClearEditText.this) != null) {
          MMClearEditText.b(MMClearEditText.this).onFocusChange(paramAnonymousView, paramAnonymousBoolean);
        }
        MMClearEditText.a(MMClearEditText.this);
      }
    });
  }
  
  public View.OnTouchListener getDefaultOnTouchListener()
  {
    return this.oQM;
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof TextView.SavedState))
    {
      super.onRestoreInstanceState(paramParcelable);
      return;
    }
    if (!this.qFM) {
      paramParcelable = View.BaseSavedState.EMPTY_STATE;
    }
    super.onRestoreInstanceState(paramParcelable);
  }
  
  public boolean onTextContextMenuItem(int paramInt)
  {
    boolean bool = super.onTextContextMenuItem(paramInt);
    String str;
    if (paramInt == 16908322)
    {
      this.qrg = 0;
      str = getText().toString();
    }
    try
    {
      Tx(str);
      return bool;
    }
    catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
    {
      x.e("MicroMsg.MMClearEditText", "!!MMClearEditText Exception %d", new Object[] { Integer.valueOf(this.qrg) });
      if (this.qrg < 3)
      {
        this.qrg += 1;
        Tx(" " + str);
        return bool;
      }
      x.e("MicroMsg.MMClearEditText", "!!MMClearEditText, IndexOutOfBoundsException cannot fix");
    }
    return bool;
  }
  
  public void setOnFocusChangeListener(View.OnFocusChangeListener paramOnFocusChangeListener)
  {
    this.mqZ = paramOnFocusChangeListener;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/ui/base/MMClearEditText.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */