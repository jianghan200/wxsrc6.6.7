package com.tencent.mm.plugin.appbrand.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.tencent.mm.plugin.appbrand.jsapi.base.e;
import com.tencent.mm.plugin.appbrand.widget.g.a;

@SuppressLint({"AppCompatCustomView"})
public class f
  extends TextView
  implements e
{
  private a gEC;
  private boolean gEe;
  
  public f(Context paramContext)
  {
    super(paramContext);
    super.setIncludeFontPadding(false);
    super.setLineSpacing(0.0F, 1.0F);
    super.setSpannableFactory(new f.1(this));
  }
  
  public final boolean ail()
  {
    return this.gEe;
  }
  
  public void setInterceptEvent(boolean paramBoolean)
  {
    this.gEe = paramBoolean;
  }
  
  public void setLineHeight(int paramInt)
  {
    if (this.gEC == null) {
      this.gEC = new a(paramInt);
    }
    if (!this.gEC.af(paramInt)) {
      return;
    }
    invalidate();
  }
  
  public void setText(CharSequence paramCharSequence, TextView.BufferType paramBufferType)
  {
    TextView.BufferType localBufferType = paramBufferType;
    if (paramBufferType == TextView.BufferType.NORMAL) {
      localBufferType = TextView.BufferType.SPANNABLE;
    }
    super.setText(paramCharSequence, localBufferType);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */