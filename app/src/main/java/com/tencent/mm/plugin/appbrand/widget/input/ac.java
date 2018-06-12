package com.tencent.mm.plugin.appbrand.widget.input;

import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.EditText;
import com.tencent.mm.plugin.appbrand.jsapi.o.c.f;
import com.tencent.mm.plugin.appbrand.widget.b.b;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Locale;

final class ac<Input extends EditText,  extends z>
{
  final String TAG;
  final Input gIY;
  final float gIZ;
  c.f gJa;
  MotionEvent gJb;
  boolean gJc = false;
  final Runnable gJd = new ac.1(this);
  final Runnable gJe = new ac.2(this);
  
  ac(Input paramInput)
  {
    this.gIY = paramInput;
    this.TAG = ("MicroMsg.AppBrand.InputFakeTapEventEmitter" + String.format(Locale.US, "[%s]", new Object[] { paramInput.toString() }));
    this.gIZ = ViewConfiguration.get(paramInput.getContext()).getScaledTouchSlop();
  }
  
  final boolean a(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2)
  {
    float f1 = paramMotionEvent1.getX(paramMotionEvent1.getActionIndex());
    float f2 = paramMotionEvent1.getY(paramMotionEvent1.getActionIndex());
    float f3 = paramMotionEvent2.getX(paramMotionEvent2.getActionIndex());
    float f4 = paramMotionEvent2.getY(paramMotionEvent2.getActionIndex());
    x.v(this.TAG, "[apptouch] checkTapArea touchSlop %f, X[%f:%f], Y[%f:%f], [%s : %s]", new Object[] { Float.valueOf(this.gIZ), Float.valueOf(f1), Float.valueOf(f3), Float.valueOf(f2), Float.valueOf(f4), b.C(paramMotionEvent1), b.C(paramMotionEvent2) });
    return (Math.abs(f4 - f2) <= this.gIZ) && (Math.abs(f3 - f1) <= this.gIZ);
  }
  
  final void apS()
  {
    this.gJc = false;
    this.gIY.removeCallbacks(this.gJd);
    this.gIY.removeCallbacks(this.gJe);
    this.gJa = null;
    if (this.gJb != null)
    {
      this.gJb.recycle();
      this.gJb = null;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/input/ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */