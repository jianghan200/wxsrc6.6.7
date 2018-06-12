package com.tencent.mm.plugin.appbrand.widget.input.a;

import android.os.Looper;
import android.text.Selection;
import com.tencent.mm.sdk.platformtools.ag;

public final class a
{
  private final ag H = new a.1(this, Looper.getMainLooper());
  public volatile c gKC;
  
  public final void a(CharSequence paramCharSequence, boolean paramBoolean)
  {
    if (paramCharSequence == null) {
      return;
    }
    paramCharSequence = this.H.obtainMessage(1000, Selection.getSelectionEnd(paramCharSequence), 0, paramCharSequence.toString());
    this.H.removeMessages(1000);
    ag localag = this.H;
    if (paramBoolean) {}
    for (long l = 150L;; l = 0L)
    {
      localag.sendMessageDelayed(paramCharSequence, l);
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/input/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */