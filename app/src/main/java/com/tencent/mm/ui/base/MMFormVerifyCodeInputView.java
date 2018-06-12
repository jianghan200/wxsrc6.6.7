package com.tencent.mm.ui.base;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.w.a.g;
import com.tencent.mm.w.a.k;
import com.tencent.mm.w.a.m;

public class MMFormVerifyCodeInputView
  extends LinearLayout
{
  private TextView eCm;
  private Button eVi;
  private al eeo;
  private View.OnFocusChangeListener jzz = null;
  private int layout = -1;
  private Context mContext = null;
  private EditText meN;
  private int qyt = -1;
  private int tuA = 60;
  private int tuB = this.tuA;
  private View.OnClickListener tuC = null;
  private int tuo = -1;
  private int[] tup;
  private TextView tuy;
  private int tuz = -1;
  
  public MMFormVerifyCodeInputView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, -1);
  }
  
  @TargetApi(11)
  public MMFormVerifyCodeInputView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, a.m.FormItemView, paramInt, 0);
    this.tuo = paramAttributeSet.getResourceId(a.m.FormItemView_form_hint, -1);
    this.qyt = paramAttributeSet.getResourceId(a.m.FormItemView_form_title, -1);
    this.tuz = paramAttributeSet.getResourceId(a.m.FormItemView_form_btn_title, -1);
    this.layout = paramAttributeSet.getResourceId(a.m.FormItemView_form_layout, this.layout);
    paramAttributeSet.recycle();
    inflate(paramContext, this.layout, this);
    this.mContext = paramContext;
  }
  
  public final void addTextChangedListener(TextWatcher paramTextWatcher)
  {
    if (this.meN != null)
    {
      this.meN.addTextChangedListener(paramTextWatcher);
      return;
    }
    x.w("MicroMsg.MMFormVerifyCodeInputView", "watcher : %s, contentET : %s", new Object[] { paramTextWatcher, this.meN });
  }
  
  public final void cru()
  {
    this.eVi.setVisibility(8);
    this.tuy.setVisibility(0);
    this.tuy.setText(getContext().getString(a.k.mobile_input_send_sms_timer_title, new Object[] { Integer.valueOf(this.tuA) }));
    if (this.eeo != null)
    {
      this.eeo.SO();
      this.eeo.J(1000L, 1000L);
    }
    do
    {
      return;
      if (getContext() != null)
      {
        this.eeo = new al(getContext().getMainLooper(), new MMFormVerifyCodeInputView.3(this), true);
        this.eeo.J(1000L, 1000L);
        return;
      }
    } while (this.eeo == null);
    this.eeo.SO();
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
    x.e("MicroMsg.MMFormVerifyCodeInputView", "contentET is null!");
    return null;
  }
  
  public TextView getTitleTextView()
  {
    return this.eCm;
  }
  
  public void onFinishInflate()
  {
    super.onFinishInflate();
    this.eCm = ((TextView)findViewById(a.g.title));
    this.meN = ((EditText)findViewById(a.g.edittext));
    this.tuy = ((TextView)findViewById(a.g.timer));
    this.eVi = ((Button)findViewById(a.g.send_verify_code_btn));
    if ((this.eCm == null) || (this.meN == null) || (this.tuy == null) || (this.eVi == null)) {
      x.w("MicroMsg.MMFormVerifyCodeInputView", "titleTV : %s, contentET : %s, timerTv: %s, sendSmsBtn: %s", new Object[] { this.eCm, this.meN, this.tuy, this.eVi });
    }
    for (;;)
    {
      if (this.meN != null)
      {
        MMFormVerifyCodeInputView.1 local1 = new MMFormVerifyCodeInputView.1(this);
        this.meN.setOnFocusChangeListener(local1);
      }
      if (this.eVi != null) {
        this.eVi.setOnClickListener(new MMFormVerifyCodeInputView.2(this));
      }
      return;
      if (this.qyt != -1) {
        this.eCm.setText(this.qyt);
      }
      if (this.tuo != -1) {
        this.meN.setHint(this.tuo);
      }
      if (this.tuz != -1) {
        this.eVi.setText(this.tuz);
      }
    }
  }
  
  public final void reset()
  {
    if (this.eeo != null) {
      this.eeo.SO();
    }
    this.meN.setText("");
    this.tuy.setVisibility(8);
    this.tuB = this.tuA;
    this.eVi.setVisibility(0);
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
    x.e("MicroMsg.MMFormVerifyCodeInputView", "contentET is null!");
  }
  
  public void setHint(String paramString)
  {
    if (this.meN != null)
    {
      this.meN.setHint(paramString);
      return;
    }
    x.e("MicroMsg.MMFormVerifyCodeInputView", "contentET is null!");
  }
  
  public void setImeOption(int paramInt)
  {
    if (this.meN != null)
    {
      this.meN.setImeOptions(paramInt);
      return;
    }
    x.e("MicroMsg.MMFormVerifyCodeInputView", "contentET is null!");
  }
  
  public void setInputType(int paramInt)
  {
    if (this.meN != null)
    {
      this.meN.setInputType(paramInt);
      return;
    }
    x.e("MicroMsg.MMFormVerifyCodeInputView", "contentET is null!");
  }
  
  public void setSendSmsBtnClickListener(View.OnClickListener paramOnClickListener)
  {
    this.tuC = paramOnClickListener;
  }
  
  public void setSmsBtnText(int paramInt)
  {
    if (this.eVi != null)
    {
      this.eVi.setText(paramInt);
      return;
    }
    x.e("MicroMsg.MMFormVerifyCodeInputView", "sendSmsBtn is null!");
  }
  
  public void setSmsBtnText(String paramString)
  {
    if (this.eVi != null)
    {
      this.eVi.setText(paramString);
      return;
    }
    x.e("MicroMsg.MMFormVerifyCodeInputView", "sendSmsBtn is null!");
  }
  
  public void setText(String paramString)
  {
    if (this.meN != null)
    {
      this.meN.setText(paramString);
      return;
    }
    x.e("MicroMsg.MMFormVerifyCodeInputView", "contentET is null!");
  }
  
  public void setTitle(int paramInt)
  {
    if (this.eCm != null)
    {
      this.eCm.setText(paramInt);
      return;
    }
    x.e("MicroMsg.MMFormVerifyCodeInputView", "titleTV is null!");
  }
  
  public void setTitle(String paramString)
  {
    if (this.eCm != null)
    {
      this.eCm.setText(paramString);
      return;
    }
    x.e("MicroMsg.MMFormVerifyCodeInputView", "titleTV is null!");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/ui/base/MMFormVerifyCodeInputView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */