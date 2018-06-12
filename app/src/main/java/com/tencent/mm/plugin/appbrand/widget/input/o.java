package com.tencent.mm.plugin.appbrand.widget.input;

import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Layout;
import android.text.Layout.Alignment;
import android.text.Spannable;
import android.text.Spannable.Factory;
import android.text.TextUtils;
import android.text.method.MetaKeyKeyListener;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.mm.plugin.appbrand.jsapi.o.c;
import com.tencent.mm.plugin.appbrand.jsapi.o.c.f;
import com.tencent.mm.plugin.appbrand.widget.b.b;
import com.tencent.mm.plugin.appbrand.widget.b.e;
import com.tencent.mm.plugin.appbrand.widget.g.a;
import com.tencent.mm.sdk.platformtools.x;

public final class o
  extends w
{
  private a gEC;
  private final InputFilter gHD = new o.4(this);
  private float gHE = 0.0F;
  private float gHF = 1.2F;
  private float gHG = getTextSize();
  private boolean gHH = false;
  private MotionEvent gHI;
  private boolean gHJ = false;
  final ac<o> gHK = new ac(this);
  private float gcx;
  
  public o(Context paramContext)
  {
    super(paramContext);
    super.setSingleLine(false);
    super.setLineSpacing(0.0F, 1.0F);
    super.setVerticalScrollbarPosition(2);
    super.setSpannableFactory(new Spannable.Factory()
    {
      public final Spannable newSpannable(CharSequence paramAnonymousCharSequence)
      {
        paramAnonymousCharSequence = super.newSpannable(paramAnonymousCharSequence);
        if ((o.a(o.this) != null) && (!TextUtils.isEmpty(paramAnonymousCharSequence))) {
          paramAnonymousCharSequence.setSpan(o.a(o.this), 0, paramAnonymousCharSequence.length(), 18);
        }
        return paramAnonymousCharSequence;
      }
    });
    super.a(new o.2(this));
    super.setOnLongClickListener(new o.3(this));
    this.gcx = ViewConfiguration.get(paramContext).getScaledTouchSlop();
    setAutoHeight(false);
    b(0.0F, false);
  }
  
  private void b(float paramFloat, boolean paramBoolean)
  {
    float f = paramFloat;
    if (paramFloat <= 0.0F) {
      f = this.gHF * this.gHG + this.gHE;
    }
    if ((this.gEC != null) && (!this.gEC.af(f))) {}
    do
    {
      return;
      this.gEC = new a(f);
    } while (!paramBoolean);
    if (hasFocus())
    {
      invalidate();
      return;
    }
    apP();
    setText(getEditableText());
    apQ();
  }
  
  public final void D(float paramFloat1, float paramFloat2)
  {
    if (!isEnabled()) {
      return;
    }
    if (apd())
    {
      int i = af.b.a(this, paramFloat1, paramFloat2);
      if (i >= 0) {
        setSelection(i);
      }
    }
    super.performClick();
  }
  
  public final boolean apd()
  {
    if (!this.gHH)
    {
      apL();
      getMeasuredHeight();
    }
    return (!isFocusable()) && (!apz());
  }
  
  protected final void apu()
  {
    if (this.gHH)
    {
      if (getMeasuredHeight() <= getMaxHeight()) {
        break label31;
      }
      setMeasuredDimension(getMeasuredWidth(), getMaxHeight());
    }
    label31:
    while ((getMeasuredHeight() >= getMinHeight()) || (getMinHeight() <= 0)) {
      return;
    }
    setMeasuredDimension(getMeasuredWidth(), getMinHeight());
  }
  
  public final boolean apv()
  {
    return true;
  }
  
  public final boolean apw()
  {
    return false;
  }
  
  public final void apx()
  {
    af.cg(this).restartInput(this);
  }
  
  final Editable c(Editable paramEditable)
  {
    paramEditable = super.c(paramEditable);
    if ((this.gEC != null) && (!TextUtils.isEmpty(paramEditable))) {
      paramEditable.setSpan(this.gEC, 0, paramEditable.length(), 18);
    }
    return paramEditable;
  }
  
  public final boolean canScrollVertically(int paramInt)
  {
    if (apL() <= getHeight()) {
      return false;
    }
    return super.canScrollVertically(paramInt);
  }
  
  public final View getInputPanel()
  {
    return u.cb(this);
  }
  
  public final int getLineHeight()
  {
    if (this.gEC != null) {
      return this.gEC.height;
    }
    return super.getLineHeight();
  }
  
  @Deprecated
  public final float getLineSpacingExtra()
  {
    return super.getLineSpacingExtra();
  }
  
  @Deprecated
  public final float getLineSpacingMultiplier()
  {
    return super.getLineSpacingMultiplier();
  }
  
  protected final void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int k = 1;
    int i;
    float f1;
    float f2;
    label228:
    label394:
    label468:
    label495:
    label550:
    float f3;
    if ((apd()) && ((getParent() instanceof e)))
    {
      ac localac;
      Object localObject2;
      if ((paramMotionEvent.getActionMasked() != 0) || (((e)getParent()).D(paramMotionEvent)))
      {
        localac = this.gHK;
        b.a(localac.TAG, "processTouchEvent", paramMotionEvent);
        localObject2 = localac.gIY;
        i = paramMotionEvent.getActionIndex();
        f1 = paramMotionEvent.getX(i);
        f2 = paramMotionEvent.getY(i);
        if ((paramMotionEvent.getActionMasked() != 0) && (localac.gJb == null))
        {
          x.v(localac.TAG, "[textscroll] no pointer down before, just return");
          localac.apS();
        }
      }
      else
      {
        return false;
      }
      Object localObject1;
      Object localObject3;
      switch (paramMotionEvent.getActionMasked())
      {
      default: 
        i = 0;
        localObject1 = localac.gIY;
        localObject3 = localac.gIY.getText();
        if ((((TextView)localObject1).canScrollVertically(-1)) || (((TextView)localObject1).canScrollVertically(1))) {
          switch (paramMotionEvent.getActionMasked())
          {
          }
        }
        break;
      }
      for (;;)
      {
        int j = 0;
        label687:
        label984:
        label1072:
        label1101:
        label1247:
        label1334:
        label1378:
        label1396:
        do
        {
          for (;;)
          {
            boolean bool = i | j;
            b.a(localac.TAG, "[textscroll] handled | " + bool, paramMotionEvent);
            return bool;
            x.v(localac.TAG, "[apptouch] ACTION_UP, pointerDown %B", new Object[] { Boolean.valueOf(localac.gJc) });
            if ((localac.gJc) && (localac.gJb != null))
            {
              localObject1 = c.bL(localac.gIY);
              if ((localac.gJa != null) && (Math.abs(localac.gJa.x - ((c.f)localObject1).x) <= 1.0F) && (Math.abs(localac.gJa.y - ((c.f)localObject1).y) <= 1.0F)) {
                break label394;
              }
              x.v(localac.TAG, "[apptouch] check tap on ACTION_UP, but view has moved.");
            }
            for (;;)
            {
              localac.apS();
              i = 0;
              break;
              if (!localac.a(localac.gJb, paramMotionEvent)) {
                x.v(localac.TAG, "[apptouch] check tap on ACTION_UP exceed tap scope");
              } else {
                ((z)localObject2).D(f1, f2);
              }
            }
            localac.gJb = MotionEvent.obtain(paramMotionEvent);
            localac.gJa = c.bL((View)localObject2);
            if (localObject2 != null)
            {
              localObject1 = ((View)localObject2).getParent();
              if ((localObject1 != null) && ((localObject1 instanceof ViewGroup))) {
                if (((ViewGroup)localObject1).shouldDelayChildPressedState())
                {
                  i = 1;
                  ((EditText)localObject2).removeCallbacks(localac.gJd);
                  if (i == 0) {
                    break label550;
                  }
                  ((EditText)localObject2).postDelayed(localac.gJd, ViewConfiguration.getTapTimeout());
                }
              }
            }
            for (;;)
            {
              i = 1;
              break;
              localObject1 = ((ViewParent)localObject1).getParent();
              break label468;
              i = 0;
              break label495;
              localac.gJd.run();
            }
            localac.apS();
            i = 0;
            break;
            f3 = localac.gIZ;
            if ((f1 >= -f3) && (f2 >= -f3) && (f1 < ((View)localObject2).getWidth() + f3) && (f2 < ((View)localObject2).getHeight() + f3)) {}
            for (i = 1;; i = 0)
            {
              if ((i != 0) && (localac.a(localac.gJb, paramMotionEvent))) {
                break label687;
              }
              localac.gJc = false;
              ((EditText)localObject2).removeCallbacks(localac.gJd);
              ((EditText)localObject2).removeCallbacks(localac.gJe);
              i = 0;
              break;
            }
            i = 1;
            break;
            localObject2 = (ae.a[])((Spannable)localObject3).getSpans(0, ((Spannable)localObject3).length(), ae.a.class);
            j = 0;
            while (j < localObject2.length)
            {
              ((Spannable)localObject3).removeSpan(localObject2[j]);
              j += 1;
            }
            ((Spannable)localObject3).setSpan(new ae.a(paramMotionEvent.getX(), paramMotionEvent.getY(), ((TextView)localObject1).getScrollX(), ((TextView)localObject1).getScrollY()), 0, 0, 17);
            j = k;
            continue;
            localObject1 = ae.d((TextView)localObject1);
            if ((localObject1 != null) && (localObject1.length > 0))
            {
              j = k;
              if (localObject1[0].gJq) {}
            }
            else
            {
              j = 0;
            }
          }
          localObject2 = (ae.a[])((Spannable)localObject3).getSpans(0, ((Spannable)localObject3).length(), ae.a.class);
          if (localObject2.length <= 0) {
            break label228;
          }
          if (!localObject2[0].gJp)
          {
            j = ViewConfiguration.get(((TextView)localObject1).getContext()).getScaledTouchSlop();
            if ((Math.abs(paramMotionEvent.getX() - localObject2[0].Yr) >= j) || (Math.abs(paramMotionEvent.getY() - localObject2[0].Ys) >= j)) {
              localObject2[0].gJp = true;
            }
          }
          if (!localObject2[0].gJp) {
            break label228;
          }
          localObject2[0].gJq = true;
          if (((paramMotionEvent.getMetaState() & 0x1) != 0) || (MetaKeyKeyListener.getMetaState((CharSequence)localObject3, 1) == 1) || (MetaKeyKeyListener.getMetaState((CharSequence)localObject3, 2048) != 0))
          {
            j = 1;
            if (j == 0) {
              break label1072;
            }
            f2 = paramMotionEvent.getX() - localObject2[0].Yr;
          }
          for (f1 = paramMotionEvent.getY() - localObject2[0].Ys;; f1 = localObject2[0].Ys - paramMotionEvent.getY())
          {
            localObject2[0].Yr = paramMotionEvent.getX();
            localObject2[0].Ys = paramMotionEvent.getY();
            if (!localObject2[0].gJs) {
              break label1101;
            }
            localObject2[0].gJs = false;
            localObject2[0].gJp = false;
            break;
            j = 0;
            break label984;
            f2 = localObject2[0].Yr - paramMotionEvent.getX();
          }
          int i2 = ((TextView)localObject1).getScrollX();
          int i3 = (int)f2;
          j = ((TextView)localObject1).getScrollY();
          int m = (int)f1;
          int n = ((TextView)localObject1).getTotalPaddingTop();
          int i1 = ((TextView)localObject1).getTotalPaddingBottom();
          localObject3 = ((TextView)localObject1).getLayout();
          m = Math.max(Math.min(m + j, ((Layout)localObject3).getHeight() - (((TextView)localObject1).getHeight() - (n + i1))), 0);
          n = ((TextView)localObject1).getScrollX();
          i1 = ((TextView)localObject1).getScrollY();
          j = ((TextView)localObject1).getTotalPaddingLeft();
          int i4 = ((TextView)localObject1).getTotalPaddingRight();
          i4 = ((TextView)localObject1).getWidth() - (j + i4);
          j = ((Layout)localObject3).getLineForVertical(m);
          Layout.Alignment localAlignment = ((Layout)localObject3).getParagraphAlignment(j);
          int i5;
          if (((Layout)localObject3).getParagraphDirection(j) > 0)
          {
            j = 1;
            i5 = i4 + 0;
            if (i5 >= i4) {
              break label1378;
            }
            if (localAlignment != Layout.Alignment.ALIGN_CENTER) {
              break label1334;
            }
            j = 0 - (i4 - i5) / 2;
          }
          for (;;)
          {
            ((TextView)localObject1).scrollTo(j, m);
            if ((n == ((TextView)localObject1).getScrollX()) && (i1 == ((TextView)localObject1).getScrollY())) {
              break label1396;
            }
            ((TextView)localObject1).cancelLongPress();
            localObject2[0].gJr = true;
            j = k;
            break;
            j = 0;
            break label1247;
            if (((j != 0) && (localAlignment == Layout.Alignment.ALIGN_OPPOSITE)) || ((j == 0) && (localAlignment == Layout.Alignment.ALIGN_NORMAL)))
            {
              j = 0 - (i4 - i5);
            }
            else
            {
              j = 0;
              continue;
              j = Math.max(Math.min(i3 + i2, 0), 0);
            }
          }
          j = k;
        } while (localObject2[0].gJr);
        ae.d((TextView)localObject1);
      }
    }
    switch (paramMotionEvent.getActionMasked())
    {
    }
    for (;;)
    {
      return super.onTouchEvent(paramMotionEvent);
      this.gHJ = false;
      if (this.gHI != null)
      {
        this.gHI.recycle();
        this.gHI = null;
      }
      if (this.gHJ)
      {
        i = af.b.a(this, paramMotionEvent.getX(paramMotionEvent.getActionIndex()), paramMotionEvent.getY(paramMotionEvent.getActionIndex()));
        if (i >= 0) {
          setSelection(i);
        }
      }
      if (getParent() == null)
      {
        return true;
        this.gHI = MotionEvent.obtain(paramMotionEvent);
        this.gHJ = true;
        continue;
        if (this.gHJ)
        {
          f1 = this.gHI.getX(this.gHI.getActionIndex());
          f2 = this.gHI.getY(this.gHI.getActionIndex());
          f3 = paramMotionEvent.getX(paramMotionEvent.getActionIndex());
          float f4 = paramMotionEvent.getY(paramMotionEvent.getActionIndex());
          if ((Math.abs(f1 - f3) > this.gcx) || (Math.abs(f2 - f4) > this.gcx))
          {
            cancelLongPress();
            setPressed(false);
            this.gHJ = false;
          }
        }
      }
    }
  }
  
  public final boolean performHapticFeedback(int paramInt1, int paramInt2)
  {
    return super.performHapticFeedback(paramInt1, paramInt2);
  }
  
  public final void scrollBy(int paramInt1, int paramInt2)
  {
    super.scrollBy(paramInt1, paramInt2);
  }
  
  public final void scrollTo(int paramInt1, int paramInt2)
  {
    super.scrollTo(paramInt1, paramInt2);
  }
  
  public final void setAutoHeight(boolean paramBoolean)
  {
    this.gHH = paramBoolean;
    if (!this.gHH) {}
    for (paramBoolean = true;; paramBoolean = false)
    {
      setVerticalScrollBarEnabled(paramBoolean);
      return;
    }
  }
  
  public final void setFilters(InputFilter[] paramArrayOfInputFilter)
  {
    int i = 0;
    InputFilter[] arrayOfInputFilter = paramArrayOfInputFilter;
    if (this.gHD != null)
    {
      arrayOfInputFilter = paramArrayOfInputFilter;
      if (paramArrayOfInputFilter == null) {
        arrayOfInputFilter = new InputFilter[0];
      }
      paramArrayOfInputFilter = new InputFilter[arrayOfInputFilter.length + 1];
      while (i < arrayOfInputFilter.length)
      {
        paramArrayOfInputFilter[i] = arrayOfInputFilter[i];
        i += 1;
      }
      paramArrayOfInputFilter[i] = this.gHD;
      arrayOfInputFilter = paramArrayOfInputFilter;
    }
    super.setFilters(arrayOfInputFilter);
  }
  
  public final void setGravity(int paramInt)
  {
    super.setGravity(paramInt & 0xFFFFFFAF & 0xFFFFFFEF | 0x30);
  }
  
  public final void setInputType(int paramInt)
  {
    super.setInputType(0x20000 | paramInt);
  }
  
  public final void setLineHeight(float paramFloat)
  {
    if (paramFloat <= 0.0F) {
      return;
    }
    b(paramFloat, true);
  }
  
  public final void setLineSpace(float paramFloat)
  {
    setLineSpacing(paramFloat, this.gHF);
  }
  
  public final void setLineSpacing(float paramFloat1, float paramFloat2)
  {
    this.gHE = paramFloat1;
    this.gHF = paramFloat2;
    b(0.0F, true);
  }
  
  public final void setSingleLine(boolean paramBoolean) {}
  
  public final void setTextSize(int paramInt, float paramFloat)
  {
    super.setTextSize(paramInt, paramFloat);
    this.gHG = TypedValue.applyDimension(paramInt, paramFloat, getResources().getDisplayMetrics());
    b(0.0F, true);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/input/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */