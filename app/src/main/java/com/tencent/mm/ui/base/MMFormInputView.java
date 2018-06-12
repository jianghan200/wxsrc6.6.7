package com.tencent.mm.ui.base;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View.OnFocusChangeListener;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.w.a.g;
import com.tencent.mm.w.a.m;

public class MMFormInputView
  extends LinearLayout
{
  private TextView eCm;
  private View.OnFocusChangeListener jzz = null;
  private int layout = -1;
  private Context mContext = null;
  private EditText meN;
  private int qyt = -1;
  private int tuo = -1;
  private int[] tup;
  
  public MMFormInputView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, -1);
  }
  
  @TargetApi(11)
  public MMFormInputView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, a.m.FormItemView, paramInt, 0);
    this.tuo = paramAttributeSet.getResourceId(a.m.FormItemView_form_hint, -1);
    this.qyt = paramAttributeSet.getResourceId(a.m.FormItemView_form_title, -1);
    this.layout = paramAttributeSet.getResourceId(a.m.FormItemView_form_layout, this.layout);
    paramAttributeSet.recycle();
    inflate(paramContext, this.layout, this);
    this.mContext = paramContext;
  }
  
  public final void addTextChangedListener(TextWatcher paramTextWatcher)
  {
    if ((paramTextWatcher != null) && (this.meN != null))
    {
      this.meN.addTextChangedListener(paramTextWatcher);
      return;
    }
    x.w("MicroMsg.MMFormInputView", "watcher : %s, contentET : %s", new Object[] { paramTextWatcher, this.meN });
  }
  
  public EditText getContentEditText()
  {
    return this.meN;
  }
  
  public Editable getText()
  {
    if (this.meN != null) {
      return this.meN.getText();
    }
    x.e("MicroMsg.MMFormInputView", "contentET is null!");
    return null;
  }
  
  public TextView getTitleTextView()
  {
    return this.eCm;
  }
  
  public void onFinishInflate()
  {
    this.eCm = ((TextView)findViewById(a.g.title));
    this.meN = ((EditText)findViewById(a.g.edittext));
    if ((this.eCm == null) || (this.meN == null)) {
      x.w("MicroMsg.MMFormInputView", "titleTV : %s, contentET : %s", new Object[] { this.eCm, this.meN });
    }
    for (;;)
    {
      if (this.meN != null)
      {
        MMFormInputView.1 local1 = new MMFormInputView.1(this);
        this.meN.setOnFocusChangeListener(local1);
      }
      return;
      if (this.qyt != -1) {
        this.eCm.setText(this.qyt);
      }
      if (this.tuo != -1) {
        this.meN.setHint(this.tuo);
      }
    }
  }
  
  public void setFocusListener(View.OnFocusChangeListener paramOnFocusChangeListener)
  {
    this.jzz = paramOnFocusChangeListener;
  }
  
  public void setHint(int paramInt)
  {
    if (this.meN != null)
    {
      this.meN.setHint(paramInt);
      return;
    }
    x.e("MicroMsg.MMFormInputView", "contentET is null!");
  }
  
  public void setHint(String paramString)
  {
    if (this.meN != null)
    {
      this.meN.setHint(paramString);
      return;
    }
    x.e("MicroMsg.MMFormInputView", "contentET is null!");
  }
  
  public void setImeOption(int paramInt)
  {
    if (this.meN != null)
    {
      this.meN.setImeOptions(paramInt);
      return;
    }
    x.e("MicroMsg.MMFormInputView", "contentET is null!");
  }
  
  public void setInputType(int paramInt)
  {
    if (this.meN != null)
    {
      this.meN.setInputType(paramInt);
      return;
    }
    x.e("MicroMsg.MMFormInputView", "contentET is null!");
  }
  
  public void setText(String paramString)
  {
    if (this.meN != null)
    {
      this.meN.setText(paramString);
      return;
    }
    x.e("MicroMsg.MMFormInputView", "contentET is null!");
  }
  
  public void setTitle(int paramInt)
  {
    if (this.eCm != null)
    {
      this.eCm.setText(paramInt);
      return;
    }
    x.e("MicroMsg.MMFormInputView", "titleTV is null!");
  }
  
  public void setTitle(String paramString)
  {
    if (this.eCm != null)
    {
      this.eCm.setText(paramString);
      return;
    }
    x.e("MicroMsg.MMFormInputView", "titleTV is null!");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/ui/base/MMFormInputView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */