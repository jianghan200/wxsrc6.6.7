package com.tencent.mm.pluginsdk.ui.d;

import android.text.style.CharacterStyle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.tencent.mm.plugin.comm.a.e;
import com.tencent.neattextview.textview.view.NeatTextView;

public final class f
  extends com.tencent.neattextview.textview.view.b
{
  private m qPI;
  
  public f(NeatTextView paramNeatTextView, m paramm)
  {
    super(paramNeatTextView.getContext(), paramNeatTextView);
    this.qPI = paramm;
  }
  
  protected final void cancel(int paramInt)
  {
    if (this.vbB != null)
    {
      CharacterStyle localCharacterStyle = this.vbB.vab;
      if ((localCharacterStyle instanceof n)) {
        ((n)localCharacterStyle).lmQ = false;
      }
    }
    super.cancel(paramInt);
  }
  
  public final boolean onDown(MotionEvent paramMotionEvent)
  {
    boolean bool = super.onDown(paramMotionEvent);
    if (this.vbB != null)
    {
      paramMotionEvent = this.vbB.vab;
      if ((paramMotionEvent instanceof n)) {
        ((n)paramMotionEvent).lmQ = true;
      }
    }
    return bool;
  }
  
  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    int i = (int)paramMotionEvent.getRawX();
    int j = (int)paramMotionEvent.getRawY();
    paramView.setTag(a.e.touch_loc, new int[] { i, j });
    if ((paramView instanceof NeatTextView))
    {
      NeatTextView localNeatTextView = (NeatTextView)paramView;
      if ((!localNeatTextView.cAs()) || (localNeatTextView.vbj))
      {
        if ((paramMotionEvent.getAction() == 3) || (paramMotionEvent.getAction() == 1)) {
          localNeatTextView.getWrappedTextView().setPressed(false);
        }
        for (;;)
        {
          return this.qPI.onTouch(localNeatTextView.getWrappedTextView(), paramMotionEvent);
          if (paramMotionEvent.getAction() == 0) {
            localNeatTextView.getWrappedTextView().setPressed(true);
          }
        }
      }
    }
    return super.onTouch(paramView, paramMotionEvent);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/pluginsdk/ui/d/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */