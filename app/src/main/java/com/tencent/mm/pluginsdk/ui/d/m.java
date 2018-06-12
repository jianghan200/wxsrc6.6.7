package com.tencent.mm.pluginsdk.ui.d;

import android.content.Context;
import android.os.Looper;
import android.text.Layout;
import android.text.Spanned;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.widget.TextView;
import com.tencent.mm.kiss.widget.textview.StaticTextView;
import com.tencent.mm.plugin.comm.a.e;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class m
  implements View.OnTouchListener
{
  private static boolean DEBUG = false;
  private static int qQr;
  private static int um = ViewConfiguration.getTapTimeout();
  String fmS;
  private n qQn = null;
  private boolean qQo = false;
  private View qQp = null;
  private boolean qQq = false;
  private Context qQs = null;
  private ag qQt = new ag(Looper.getMainLooper());
  private b qQu = new b((byte)0);
  private a qQv = new a();
  private View view;
  
  static
  {
    int i = ViewConfiguration.getLongPressTimeout();
    qQr = i;
    if (i > um * 2) {
      qQr -= um;
    }
    x.d("MicroMsg.PressSpanTouchListener", "long press timeout:%d", new Object[] { Integer.valueOf(qQr) });
  }
  
  public m() {}
  
  public m(Context paramContext)
  {
    this.qQs = paramContext;
  }
  
  private void Cs(int paramInt)
  {
    if (this.view != null) {
      this.qQt.postDelayed(this.qQv, qQr - paramInt);
    }
  }
  
  private void H(MotionEvent paramMotionEvent)
  {
    if ((paramMotionEvent.getAction() == 3) || (paramMotionEvent.getAction() == 1)) {
      aXL();
    }
  }
  
  public final void aXL()
  {
    if (this.qQn != null)
    {
      this.qQn.lmQ = false;
      this.qQn.setContext(null);
      this.qQp.invalidate();
      this.qQp = null;
      this.qQn = null;
    }
  }
  
  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    if ((!(paramView instanceof TextView)) && (!(paramView instanceof StaticTextView))) {
      return false;
    }
    int i;
    int j;
    if (paramMotionEvent.getAction() == 0)
    {
      i = (int)paramMotionEvent.getRawX();
      j = (int)paramMotionEvent.getRawY();
      paramView.setTag(a.e.touch_loc, new int[] { i, j });
    }
    this.view = paramView;
    Layout localLayout;
    CharSequence localCharSequence;
    MotionEvent localMotionEvent;
    Object localObject;
    int k;
    if ((paramView instanceof TextView))
    {
      localLayout = ((TextView)paramView).getLayout();
      localCharSequence = ((TextView)paramView).getText();
      if (DEBUG) {
        x.d("MicroMsg.PressSpanTouchListener", "ontouch action: %d, isLongPress:%b " + localLayout + " " + (localCharSequence instanceof Spanned) + " " + bi.cjd().toString(), new Object[] { Integer.valueOf(paramMotionEvent.getAction()), Boolean.valueOf(this.qQq) });
      }
      localMotionEvent = MotionEvent.obtain(paramMotionEvent);
      if (((localCharSequence instanceof Spanned)) && (localLayout != null))
      {
        localObject = (Spanned)localCharSequence;
        i = localMotionEvent.getAction();
        paramView.invalidate();
        if ((paramView == null) || (localObject == null) || (!e.a(paramView, (Spanned)localObject)))
        {
          if ((i != 1) && (i != 0) && (i != 2) && (i != 3)) {
            break label827;
          }
          j = (int)localMotionEvent.getX();
          i = (int)localMotionEvent.getY();
          if (!(paramView instanceof StaticTextView)) {
            break label447;
          }
          if (j >= ((StaticTextView)paramView).getHorizontalDrawOffset())
          {
            k = localLayout.getWidth();
            if (j <= ((StaticTextView)paramView).getHorizontalDrawOffset() + k) {
              break label406;
            }
          }
          H(localMotionEvent);
        }
      }
    }
    label406:
    label447:
    label567:
    label827:
    label913:
    label1020:
    label1281:
    label1329:
    for (;;)
    {
      localMotionEvent.recycle();
      if (DEBUG) {
        x.d("MicroMsg.PressSpanTouchListener", "ontouch action2: %d, isLongPress:%b " + localLayout + " " + (localCharSequence instanceof Spanned) + " processResult: false " + bi.cjd().toString(), new Object[] { Integer.valueOf(paramMotionEvent.getAction()), Boolean.valueOf(this.qQq) });
      }
      return false;
      localLayout = ((StaticTextView)paramView).getTvLayout();
      localCharSequence = ((StaticTextView)paramView).getText();
      break;
      if (i >= ((StaticTextView)paramView).getVerticalDrawOffset())
      {
        k = localLayout.getHeight();
        if (i <= ((StaticTextView)paramView).getVerticalDrawOffset() + k) {}
      }
      else
      {
        H(localMotionEvent);
        continue;
        if ((paramView instanceof TextView))
        {
          if (j >= ((TextView)paramView).getTotalPaddingLeft())
          {
            k = localLayout.getWidth();
            if (j <= ((TextView)paramView).getTotalPaddingLeft() + k) {}
          }
          else
          {
            H(localMotionEvent);
            continue;
          }
          if (i >= ((TextView)paramView).getTotalPaddingTop())
          {
            k = localLayout.getHeight();
            if (i <= ((TextView)paramView).getTotalPaddingTop() + k) {}
          }
          else
          {
            H(localMotionEvent);
            continue;
          }
        }
      }
      if ((paramView instanceof TextView))
      {
        j -= ((TextView)paramView).getTotalPaddingLeft();
        i -= ((TextView)paramView).getTotalPaddingTop();
        k = paramView.getScrollX();
        j = localLayout.getOffsetForHorizontal(localLayout.getLineForVertical(i + paramView.getScrollY()), j + k);
        i = j;
        if ((paramView instanceof TextView))
        {
          i = j;
          if (j < ((Spanned)localObject).length()) {
            i = j + 1;
          }
        }
        j = localMotionEvent.getAction();
        localObject = (n[])((Spanned)localObject).getSpans(i, i, n.class);
        i = localObject.length - 1;
        if (DEBUG) {
          x.d("MicroMsg.PressSpanTouchListener", "processPress action: %d, isLongPress:%b " + localObject.length + " " + this.qQn + " " + bi.cjd().toString(), new Object[] { Integer.valueOf(localMotionEvent.getAction()), Boolean.valueOf(this.qQq) });
        }
        if (localObject.length == 0) {
          break label1281;
        }
        if (j != 1) {
          break label1020;
        }
        this.qQt.removeCallbacks(this.qQu);
        this.qQt.removeCallbacks(this.qQv);
        if (!this.qQq) {
          break label913;
        }
        aXL();
        this.qQq = false;
        paramView.setClickable(this.qQo);
        if (DEBUG) {
          x.i("MicroMsg.PressSpanTouchListener", "processPress action1 " + localMotionEvent.getAction());
        }
      }
      for (;;)
      {
        if (!DEBUG) {
          break label1329;
        }
        x.i("MicroMsg.PressSpanTouchListener", "processTouch action2 " + localMotionEvent.getAction());
        break;
        if ((paramView instanceof StaticTextView))
        {
          j -= ((StaticTextView)paramView).getHorizontalDrawOffset();
          i -= ((StaticTextView)paramView).getVerticalDrawOffset();
          break label567;
        }
        j -= paramView.getPaddingLeft();
        i -= paramView.getPaddingTop();
        break label567;
        this.qQq = false;
        if (this.qQn != null)
        {
          this.qQn.setSessionId(this.fmS);
          if (this.qQs != null) {
            this.qQn.setContext(this.qQs);
          }
          this.qQn.onClick(paramView);
        }
        for (;;)
        {
          paramView.setClickable(this.qQo);
          aXL();
          if (!DEBUG) {
            break;
          }
          x.i("MicroMsg.PressSpanTouchListener", "processPress action2 " + localMotionEvent.getAction());
          break;
          x.e("MicroMsg.PressSpanTouchListener", "ACTION_UP error, lastClickSpan is null");
        }
        if ((j == 0) || (j == 2))
        {
          if ((j == 0) && (qQr > 0)) {
            Cs(0);
          }
          if (j == 0) {
            this.qQo = paramView.isClickable();
          }
          aXL();
          this.qQn = localObject[i];
          this.qQp = paramView;
          localObject[i].setContext(null);
          localObject[i].lmQ = true;
          localObject[i].mEnable = true;
          paramView.invalidate();
          if (this.qQq)
          {
            localObject[i].lmQ = false;
            localObject[i].mEnable = false;
            paramView.setClickable(this.qQo);
            if (DEBUG) {
              x.i("MicroMsg.PressSpanTouchListener", "processPress action3 " + localMotionEvent.getAction());
            }
          }
          else if (DEBUG)
          {
            x.i("MicroMsg.PressSpanTouchListener", "processPress action4 " + localMotionEvent.getAction());
          }
        }
        else if (j == 3)
        {
          this.qQt.removeCallbacks(this.qQu);
          this.qQt.removeCallbacks(this.qQv);
          paramView.setClickable(this.qQo);
          aXL();
          if (DEBUG)
          {
            x.i("MicroMsg.PressSpanTouchListener", "processPress action5 " + localMotionEvent.getAction());
            continue;
            aXL();
          }
        }
        else
        {
          if (j == 1) {
            this.qQq = false;
          }
          if (DEBUG) {
            x.i("MicroMsg.PressSpanTouchListener", "processPress action6 " + localMotionEvent.getAction());
          }
        }
      }
    }
  }
  
  final class a
    implements Runnable
  {
    a() {}
    
    public final void run()
    {
      if ((m.a(m.this) != null) && (m.a(m.this).isPressed()))
      {
        x.d("MicroMsg.PressSpanTouchListener", "long pressed timeout");
        m.b(m.this);
        m.this.aXL();
      }
    }
  }
  
  private final class b
    implements Runnable
  {
    private b() {}
    
    public final void run()
    {
      m.a(m.this, m.bB());
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/pluginsdk/ui/d/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */