package com.tencent.mm.ui.fts.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageView;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.plugin.fts.ui.widget.FTSEditTextView;

public class SOSEditTextView
  extends FTSEditTextView
{
  private View utM;
  
  public SOSEditTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public SOSEditTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  protected final void aQS()
  {
    ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(R.i.sos_edittext_view, this, true);
  }
  
  public final void czi()
  {
    getEditText().setOnFocusChangeListener(this.jzz);
  }
  
  @SuppressLint({"WrongViewCast"})
  protected final void init()
  {
    super.init();
    this.utM = findViewById(R.h.voice_btn_container);
    getEditText().setOnFocusChangeListener(null);
    getEditText().setHintTextColor(getResources().getColor(R.e.light_bg_hint_color));
    getEditText().setTextColor(getResources().getColor(R.e.normal_text_color));
  }
  
  public void setIconRes(Drawable paramDrawable)
  {
    getIconView().setImageDrawable(paramDrawable);
  }
  
  public void setVoiceBtnClickListener(View.OnClickListener paramOnClickListener)
  {
    if (this.utM != null) {
      this.utM.setOnClickListener(paramOnClickListener);
    }
  }
  
  public void setVoiceImageButtonVisibile(int paramInt)
  {
    if (this.utM != null) {
      this.utM.setVisibility(paramInt);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ui/fts/widget/SOSEditTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */