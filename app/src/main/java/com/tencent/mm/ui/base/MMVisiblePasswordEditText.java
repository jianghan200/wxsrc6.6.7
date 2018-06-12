package com.tencent.mm.ui.base;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.EditText;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.w.a.e;
import com.tencent.mm.w.a.j;

public class MMVisiblePasswordEditText
  extends EditText
{
  public String gLA = "";
  final Drawable tzc = getResources().getDrawable(a.j.login_showpassword_icon);
  final Drawable tzd = getResources().getDrawable(a.j.login_showpassword_icon_activa);
  private boolean tze = false;
  
  public MMVisiblePasswordEditText(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    crs();
  }
  
  public MMVisiblePasswordEditText(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    crs();
  }
  
  private void crX()
  {
    int i = getSelectionStart();
    int j = getSelectionEnd();
    if (this.tze)
    {
      setInputType(1);
      setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], this.tzd, getCompoundDrawables()[3]);
    }
    for (;;)
    {
      setSelection(i, j);
      return;
      setInputType(129);
      setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], this.tzc, getCompoundDrawables()[3]);
    }
  }
  
  private void crs()
  {
    this.tzc.setBounds(0, 0, this.tzc.getIntrinsicWidth(), this.tzc.getIntrinsicHeight());
    this.tzd.setBounds(0, 0, this.tzd.getIntrinsicWidth(), this.tzd.getIntrinsicHeight());
    x.d("MicroMsg.MMVisiblePasswordEditText", "closeEye width %d height %d", new Object[] { Integer.valueOf(this.tzc.getIntrinsicWidth()), Integer.valueOf(this.tzc.getIntrinsicHeight()) });
    crX();
    setHeight(this.tzc.getIntrinsicHeight() + getResources().getDimensionPixelSize(a.e.OneDPPadding) * 5);
    setOnTouchListener(new MMVisiblePasswordEditText.1(this));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ui/base/MMVisiblePasswordEditText.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */