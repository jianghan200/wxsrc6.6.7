package com.tencent.neattextview.textview.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spannable.Factory;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.text.style.CharacterStyle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.LruCache;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnTouchListener;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.tencent.neattextview.textview.a.a;
import com.tencent.neattextview.textview.layout.NeatLayout;
import java.util.ArrayList;

public class NeatTextView
  extends View
  implements a
{
  private static final LruCache<String, Boolean> vbe = new LruCache(500);
  private static final LruCache<a, com.tencent.neattextview.textview.layout.b> vbf = new LruCache(500);
  private static final HandlerThread vbg;
  private static Handler vbh;
  private int HB = 0;
  private ColorStateList bv;
  private TextPaint dG;
  private int gg = Integer.MAX_VALUE;
  private CharSequence iq;
  private int kgE = Integer.MAX_VALUE;
  public CharSequence mText;
  private int qMj = Integer.MAX_VALUE;
  private int tzM;
  private Spannable.Factory tzO = Spannable.Factory.getInstance();
  private TextUtils.TruncateAt tzP;
  private float tzV = 0.0F;
  private com.tencent.neattextview.textview.layout.b vaO;
  private boolean vbi = false;
  public boolean vbj;
  private TextView vbk;
  private ColorStateList vbl;
  private ColorStateList vbm;
  private int vbn;
  private int vbo = 0;
  private TextView.BufferType vbp = TextView.BufferType.NORMAL;
  private b vbq;
  private boolean vbr = true;
  private b vbs;
  private int vbt = 8388659;
  private boolean vbu = true;
  private d vbv;
  
  static
  {
    Object localObject = new HandlerThread("PreMeasuredThread", -8);
    vbg = (HandlerThread)localObject;
    ((HandlerThread)localObject).start();
    localObject = vbg.getLooper();
    if (localObject != null) {
      vbh = new Handler((Looper)localObject);
    }
  }
  
  public NeatTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext, paramAttributeSet, 0);
  }
  
  public NeatTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext, paramAttributeSet, paramInt);
  }
  
  private void a(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    this.vbq = new b(getContext(), this);
    Object localObject = new TextView(paramContext);
    ((TextView)localObject).setClickable(true);
    ((TextView)localObject).setFocusable(true);
    this.vbk = ((TextView)localObject);
    this.dG = getWrappedTextView().getPaint();
    localObject = paramContext.obtainStyledAttributes(paramAttributeSet, a.a.NeatTextView, paramInt, 0);
    int i = 15;
    int j = -16777216;
    int k = -7829368;
    int m = -16776961;
    int n = -1;
    paramContext = null;
    for (;;)
    {
      int i7;
      int i5;
      int i2;
      int i3;
      int i4;
      try
      {
        int i6 = ((TypedArray)localObject).getIndexCount();
        paramInt = 0;
        if (paramInt >= i6) {
          break label983;
        }
        i7 = ((TypedArray)localObject).getIndex(paramInt);
        if (i7 == a.a.NeatTextView_android_textSize)
        {
          i5 = ((TypedArray)localObject).getDimensionPixelSize(i7, 15);
          paramAttributeSet = paramContext;
          i1 = n;
          i2 = m;
          i3 = k;
          i4 = j;
        }
        else if (i7 == a.a.NeatTextView_android_textColor)
        {
          i4 = ((TypedArray)localObject).getColor(i7, -16777216);
          paramAttributeSet = paramContext;
          i1 = n;
          i2 = m;
          i3 = k;
          i5 = i;
        }
        else if (i7 == a.a.NeatTextView_android_singleLine)
        {
          if (((TypedArray)localObject).getBoolean(i7, false))
          {
            i1 = 1;
            setMaxLines(i1);
            paramAttributeSet = paramContext;
            i1 = n;
            i2 = m;
            i3 = k;
            i4 = j;
            i5 = i;
          }
        }
      }
      finally
      {
        ((TypedArray)localObject).recycle();
      }
      int i1 = -1;
      continue;
      if (i7 == a.a.NeatTextView_android_lines)
      {
        setLines(((TypedArray)localObject).getInt(i7, -1));
        paramAttributeSet = paramContext;
        i1 = n;
        i2 = m;
        i3 = k;
        i4 = j;
        i5 = i;
      }
      else if (i7 == a.a.NeatTextView_android_gravity)
      {
        setTextGravity(((TypedArray)localObject).getInt(i7, 16));
        paramAttributeSet = paramContext;
        i1 = n;
        i2 = m;
        i3 = k;
        i4 = j;
        i5 = i;
      }
      else if (i7 == a.a.NeatTextView_android_maxWidth)
      {
        setMaxWidth(((TypedArray)localObject).getDimensionPixelSize(i7, -1));
        paramAttributeSet = paramContext;
        i1 = n;
        i2 = m;
        i3 = k;
        i4 = j;
        i5 = i;
      }
      else if (i7 == a.a.NeatTextView_android_lineSpacingExtra)
      {
        setSpacingAdd(((TypedArray)localObject).getDimensionPixelSize(i7, (int)this.tzV));
        paramAttributeSet = paramContext;
        i1 = n;
        i2 = m;
        i3 = k;
        i4 = j;
        i5 = i;
      }
      else if (i7 == a.a.NeatTextView_android_minWidth)
      {
        setMinWidth(((TypedArray)localObject).getDimensionPixelSize(i7, -1));
        paramAttributeSet = paramContext;
        i1 = n;
        i2 = m;
        i3 = k;
        i4 = j;
        i5 = i;
      }
      else if (i7 == a.a.NeatTextView_android_minHeight)
      {
        setMinHeight(((TypedArray)localObject).getDimensionPixelSize(i7, -1));
        paramAttributeSet = paramContext;
        i1 = n;
        i2 = m;
        i3 = k;
        i4 = j;
        i5 = i;
      }
      else if (i7 == a.a.NeatTextView_android_maxHeight)
      {
        setMaxHeight(((TypedArray)localObject).getDimensionPixelSize(i7, -1));
        paramAttributeSet = paramContext;
        i1 = n;
        i2 = m;
        i3 = k;
        i4 = j;
        i5 = i;
      }
      else if (i7 == a.a.NeatTextView_android_maxLines)
      {
        setMaxLines(((TypedArray)localObject).getInt(i7, -1));
        paramAttributeSet = paramContext;
        i1 = n;
        i2 = m;
        i3 = k;
        i4 = j;
        i5 = i;
      }
      else if (i7 == a.a.NeatTextView_android_text)
      {
        paramAttributeSet = ((TypedArray)localObject).getString(i7);
        i1 = n;
        i2 = m;
        i3 = k;
        i4 = j;
        i5 = i;
      }
      else if (i7 == a.a.NeatTextView_android_width)
      {
        setWidth(((TypedArray)localObject).getDimensionPixelSize(i7, -1));
        paramAttributeSet = paramContext;
        i1 = n;
        i2 = m;
        i3 = k;
        i4 = j;
        i5 = i;
      }
      else if (i7 == a.a.NeatTextView_android_height)
      {
        setHeight(((TypedArray)localObject).getDimensionPixelSize(i7, -1));
        paramAttributeSet = paramContext;
        i1 = n;
        i2 = m;
        i3 = k;
        i4 = j;
        i5 = i;
      }
      else if (i7 == a.a.NeatTextView_android_hint)
      {
        setHint(((TypedArray)localObject).getText(i7));
        paramAttributeSet = paramContext;
        i1 = n;
        i2 = m;
        i3 = k;
        i4 = j;
        i5 = i;
      }
      else if (i7 == a.a.NeatTextView_android_textColorHint)
      {
        i3 = ((TypedArray)localObject).getColor(i7, -7829368);
        paramAttributeSet = paramContext;
        i1 = n;
        i2 = m;
        i4 = j;
        i5 = i;
      }
      else if (i7 == a.a.NeatTextView_android_textColorLink)
      {
        i2 = ((TypedArray)localObject).getColor(i7, -16776961);
        paramAttributeSet = paramContext;
        i1 = n;
        i3 = k;
        i4 = j;
        i5 = i;
      }
      else if (i7 == a.a.NeatTextView_android_ellipsize)
      {
        i1 = ((TypedArray)localObject).getInt(i7, n);
        paramAttributeSet = paramContext;
        i2 = m;
        i3 = k;
        i4 = j;
        i5 = i;
      }
      else
      {
        paramAttributeSet = paramContext;
        i1 = n;
        i2 = m;
        i3 = k;
        i4 = j;
        i5 = i;
        if (i7 == a.a.NeatTextView_smartLetter)
        {
          this.vbu = ((TypedArray)localObject).getBoolean(i7, true);
          paramAttributeSet = paramContext;
          i1 = n;
          i2 = m;
          i3 = k;
          i4 = j;
          i5 = i;
          break label1106;
          label983:
          ((TypedArray)localObject).recycle();
          setTextColor(j);
          setRawTextSize(i);
          setLinkTextColor(m);
          setHintTextColor(k);
          switch (n)
          {
          }
          for (;;)
          {
            if (!TextUtils.isEmpty(paramContext)) {
              Q(paramContext);
            }
            getWrappedTextView().setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
            return;
            setEllipsize(TextUtils.TruncateAt.START);
            continue;
            setEllipsize(TextUtils.TruncateAt.MIDDLE);
            continue;
            setEllipsize(TextUtils.TruncateAt.END);
          }
        }
      }
      label1106:
      paramInt += 1;
      paramContext = paramAttributeSet;
      n = i1;
      m = i2;
      k = i3;
      j = i4;
      i = i5;
    }
  }
  
  private void cEl()
  {
    this.vaO = null;
    Handler localHandler;
    d locald;
    if (vbh != null)
    {
      if ((this.mText != null) || (this.iq == null)) {
        break label70;
      }
      localHandler = vbh;
      locald = new d(this.iq.toString(), this.dG);
      this.vbv = locald;
      localHandler.post(locald);
    }
    for (;;)
    {
      requestLayout();
      invalidate();
      label70:
      do
      {
        return;
      } while (this.mText == null);
      localHandler = vbh;
      locald = new d(this.mText.toString(), this.dG);
      this.vbv = locald;
      localHandler.post(locald);
    }
  }
  
  private void setRawTextSize(float paramFloat)
  {
    if (paramFloat != this.dG.getTextSize())
    {
      this.dG.setTextSize(paramFloat);
      if (this.vaO != null)
      {
        cEl();
        requestLayout();
        invalidate();
      }
    }
  }
  
  private void updateTextColors()
  {
    int i = this.bv.getColorForState(getDrawableState(), 0);
    if (i != this.tzM) {
      this.tzM = i;
    }
    for (int j = 1;; j = 0)
    {
      i = j;
      int k;
      if (this.vbm != null)
      {
        k = this.vbm.getColorForState(getDrawableState(), 0);
        i = j;
        if (k != this.dG.linkColor)
        {
          this.dG.linkColor = k;
          i = 1;
        }
      }
      j = i;
      if (this.vbl != null)
      {
        k = this.vbl.getColorForState(getDrawableState(), 0);
        j = i;
        if (k != this.vbn)
        {
          this.vbn = k;
          if (this.mText != null)
          {
            j = i;
            if (this.mText.length() != 0) {}
          }
          else
          {
            j = 1;
          }
        }
      }
      if (j != 0) {
        invalidate();
      }
      return;
    }
  }
  
  public final com.tencent.neattextview.textview.layout.b Hg(int paramInt)
  {
    if (!TextUtils.isEmpty(this.mText))
    {
      NeatLayout localNeatLayout = new NeatLayout(this.mText, null);
      localNeatLayout.a(getPaint(), paramInt, 2.14748365E9F, getPaddingLeft(), getPaddingTop(), this.tzV, this.kgE, this.tzP, this.vbu);
      return localNeatLayout;
    }
    return null;
  }
  
  public void Q(CharSequence paramCharSequence)
  {
    boolean bool2 = false;
    Object localObject2 = TextView.BufferType.NORMAL;
    this.vbp = ((TextView.BufferType)localObject2);
    Object localObject1 = paramCharSequence;
    if (paramCharSequence == null) {
      localObject1 = "";
    }
    boolean bool1;
    if (localObject2 == TextView.BufferType.NORMAL)
    {
      paramCharSequence = TextUtils.stringOrSpannedString((CharSequence)localObject1);
      this.mText = paramCharSequence;
      if (cAs())
      {
        localObject1 = paramCharSequence.toString();
        localObject2 = (Boolean)vbe.get(localObject1);
        if (localObject2 != null) {
          break label185;
        }
        if (((String)localObject1).matches("^[\\u0001-\\u00b7\\u4E00-\\u9FA5\\ue001-\\ue537\\u2005-\\u2027\\u3001-\\u3011\\uff01-\\uffe5\\u2100-\\u2900[\\ud83c\\udc00-\\ud83c\\udfff]|[\\ud83d\\udc00-\\ud83d\\udfff]]+$")) {
          break label180;
        }
        bool1 = true;
        label90:
        vbe.put(localObject1, Boolean.valueOf(bool1));
      }
    }
    for (;;)
    {
      if (bool1) {
        bool2 = true;
      }
      this.vbj = bool2;
      if (!this.vbj) {
        break label194;
      }
      if (getLayoutParams() != null) {
        getWrappedTextView().setLayoutParams(getLayoutParams());
      }
      getWrappedTextView().setText(paramCharSequence);
      requestLayout();
      invalidate();
      return;
      paramCharSequence = (CharSequence)localObject1;
      if (localObject2 != TextView.BufferType.SPANNABLE) {
        break;
      }
      paramCharSequence = this.tzO.newSpannable((CharSequence)localObject1);
      break;
      label180:
      bool1 = false;
      break label90;
      label185:
      bool1 = ((Boolean)localObject2).booleanValue();
    }
    label194:
    cEl();
  }
  
  public boolean cAs()
  {
    return this.vbr;
  }
  
  public final int getCurrentHintTextColor()
  {
    if (this.vbl != null) {
      return this.vbn;
    }
    return this.tzM;
  }
  
  public final int getCurrentTextColor()
  {
    return this.tzM;
  }
  
  public CharSequence getHint()
  {
    return this.iq;
  }
  
  public float getHorizontalOffset()
  {
    if (((this.vbt & 0x7) != 3) && (this.vaO != null)) {
      return (getMeasuredHeight() - this.vaO.cEh()[0]) / 2.0F;
    }
    return getPaddingLeft();
  }
  
  public com.tencent.neattextview.textview.layout.b getLayout()
  {
    return this.vaO;
  }
  
  public int getLineCount()
  {
    if (this.vaO != null) {
      return this.vaO.val.size();
    }
    return 0;
  }
  
  public b getOnDoubleClickListener()
  {
    return this.vbs;
  }
  
  public TextPaint getPaint()
  {
    return this.dG;
  }
  
  public int getTextGravity()
  {
    return this.vbt;
  }
  
  public float getTextSize()
  {
    return getPaint().getTextSize();
  }
  
  public float getVerticalOffset()
  {
    if (((this.vbt & 0x70) != 48) && (this.vaO != null)) {
      return (getMeasuredHeight() - this.vaO.cEh()[1]) / 2.0F;
    }
    return getPaddingTop();
  }
  
  public TextView getWrappedTextView()
  {
    return this.vbk;
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    int j = this.tzM;
    int i = j;
    if (!TextUtils.isEmpty(this.iq))
    {
      i = j;
      if (TextUtils.isEmpty(this.mText))
      {
        i = j;
        if (this.vbl != null) {
          i = this.vbn;
        }
      }
    }
    this.dG.setColor(i);
    this.dG.drawableState = getDrawableState();
    if (this.vbj)
    {
      paramCanvas.save();
      paramCanvas.translate(getPaddingLeft(), getPaddingTop());
      localLayout = getWrappedTextView().getLayout();
      if (localLayout != null) {
        localLayout.draw(paramCanvas);
      }
      paramCanvas.restore();
    }
    while (this.vaO == null)
    {
      Layout localLayout;
      return;
    }
    if (this.vaO.cEi() != null) {
      this.vaO.cEi().set(this.dG);
    }
    this.vaO.a(paramCanvas, getPaddingLeft(), getVerticalOffset());
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    if ((TextUtils.isEmpty(this.mText)) && (TextUtils.isEmpty(this.iq)))
    {
      super.onMeasure(paramInt1, paramInt2);
      return;
    }
    if (this.vbj)
    {
      getWrappedTextView().measure(paramInt1, paramInt2);
      setMeasuredDimension(getWrappedTextView().getMeasuredWidth(), getWrappedTextView().getMeasuredHeight());
      return;
    }
    int m = View.MeasureSpec.getMode(paramInt1);
    int k = View.MeasureSpec.getMode(paramInt2);
    int j = View.MeasureSpec.getSize(paramInt1);
    int i = View.MeasureSpec.getSize(paramInt2);
    paramInt1 = j;
    if (j <= 0)
    {
      paramInt1 = j;
      if (k == 0) {
        paramInt1 = getResources().getDisplayMetrics().widthPixels;
      }
    }
    paramInt2 = i;
    if (i <= 0)
    {
      paramInt2 = i;
      if (k == 0) {
        paramInt2 = Integer.MAX_VALUE;
      }
    }
    if ((this.gg > 0) && (this.gg < paramInt1)) {
      paramInt1 = this.gg;
    }
    for (;;)
    {
      if ((this.qMj > 0) && (this.qMj < paramInt2)) {
        paramInt2 = this.qMj;
      }
      for (;;)
      {
        i = getPaddingLeft();
        j = getPaddingRight();
        int n = getPaddingTop();
        int i1 = getPaddingBottom();
        float f1 = getResources().getConfiguration().fontScale;
        int i2 = getResources().getConfiguration().orientation;
        Object localObject1 = this.mText;
        float f2 = getTextSize();
        Object localObject2 = getPaint().getFontMetricsInt();
        localObject2 = new a((CharSequence)localObject1, new int[] { paramInt1 - i - j, paramInt2 - n - i1 }, f2, (Paint.FontMetricsInt)localObject2, f1, i2);
        if (this.vbi)
        {
          this.vaO = null;
          this.vbi = false;
          if (this.vaO == null)
          {
            if ((!TextUtils.isEmpty(this.mText)) || (TextUtils.isEmpty(this.iq))) {
              break label554;
            }
            localCharSequence = this.iq;
            if (this.vbv != null) {
              break label538;
            }
          }
        }
        label538:
        for (localObject1 = null;; localObject1 = this.vbv.d(this.dG))
        {
          this.vaO = new NeatLayout(localCharSequence, (float[])localObject1);
          this.vaO.a(getPaint(), localObject2.vby[0], localObject2.vby[1], getPaddingLeft(), getPaddingTop(), this.tzV, this.kgE, this.tzP, this.vbu);
          vbf.put(localObject2, this.vaO);
          localObject1 = this.vaO.cEh();
          if (m != 1073741824) {
            paramInt1 = (int)Math.min(localObject1[0] + getPaddingLeft() + getPaddingRight(), this.gg);
          }
          if (k != 1073741824) {
            paramInt2 = (int)Math.min(localObject1[1] + getPaddingTop() + getPaddingBottom(), this.qMj);
          }
          setMeasuredDimension(Math.max(paramInt1, this.HB), Math.max(paramInt2, this.vbo));
          return;
          this.vaO = ((com.tencent.neattextview.textview.layout.b)vbf.get(localObject2));
          break;
        }
        label554:
        CharSequence localCharSequence = this.mText;
        if (this.vbv == null) {}
        for (localObject1 = null;; localObject1 = this.vbv.d(this.dG))
        {
          this.vaO = new NeatLayout(localCharSequence, (float[])localObject1);
          break;
        }
      }
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if ((this.vbq != null) && (this.vbq.onTouch(this, paramMotionEvent))) {
      return true;
    }
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public void setEllipsize(TextUtils.TruncateAt paramTruncateAt)
  {
    if (this.tzP != paramTruncateAt)
    {
      this.tzP = paramTruncateAt;
      if (this.vaO != null)
      {
        this.vaO = null;
        requestLayout();
        invalidate();
      }
    }
  }
  
  public void setHeight(int paramInt)
  {
    this.vbi = true;
    this.qMj = paramInt;
    getWrappedTextView().setMaxHeight(paramInt);
    requestLayout();
    invalidate();
  }
  
  public final void setHint(int paramInt)
  {
    setHint(getContext().getResources().getText(paramInt));
  }
  
  public final void setHint(CharSequence paramCharSequence)
  {
    this.iq = TextUtils.stringOrSpannedString(paramCharSequence);
    getWrappedTextView().setHint(this.iq);
    if (TextUtils.isEmpty(this.mText)) {
      cEl();
    }
  }
  
  public final void setHintTextColor(int paramInt)
  {
    this.vbl = ColorStateList.valueOf(paramInt);
    getWrappedTextView().setHintTextColor(paramInt);
    updateTextColors();
  }
  
  public void setLines(int paramInt)
  {
    this.vbi = true;
    this.kgE = paramInt;
    getWrappedTextView().setLines(paramInt);
    requestLayout();
    invalidate();
  }
  
  public final void setLinkTextColor(int paramInt)
  {
    this.vbm = ColorStateList.valueOf(paramInt);
    updateTextColors();
  }
  
  public void setMaxHeight(int paramInt)
  {
    this.vbi = true;
    this.qMj = paramInt;
    getWrappedTextView().setMaxHeight(paramInt);
    requestLayout();
    invalidate();
  }
  
  public void setMaxLines(int paramInt)
  {
    this.vbi = true;
    this.kgE = paramInt;
    getWrappedTextView().setMaxLines(paramInt);
    requestLayout();
    invalidate();
  }
  
  public void setMaxWidth(int paramInt)
  {
    this.vbi = true;
    this.gg = paramInt;
    getWrappedTextView().setMaxWidth(paramInt);
    requestLayout();
    invalidate();
  }
  
  public void setMinHeight(int paramInt)
  {
    this.vbi = true;
    this.vbo = paramInt;
    getWrappedTextView().setMinHeight(paramInt);
    requestLayout();
    invalidate();
  }
  
  public void setMinWidth(int paramInt)
  {
    this.vbi = true;
    this.HB = paramInt;
    getWrappedTextView().setMinWidth(paramInt);
    requestLayout();
    invalidate();
  }
  
  public void setNeatEnable(boolean paramBoolean)
  {
    this.vbr = paramBoolean;
  }
  
  public void setOnDoubleClickListener(b paramb)
  {
    this.vbs = paramb;
  }
  
  public void setPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((paramInt1 != getPaddingLeft()) || (paramInt3 != getPaddingRight()) || (paramInt2 != getPaddingTop()) || (paramInt4 != getPaddingBottom())) {
      this.vaO = null;
    }
    super.setPadding(paramInt1, paramInt2, paramInt3, paramInt4);
    getWrappedTextView().setPadding(paramInt1, paramInt2, paramInt3, paramInt4);
    invalidate();
  }
  
  public void setSmartLetterEnable(boolean paramBoolean)
  {
    this.vbu = paramBoolean;
  }
  
  public void setSpacingAdd(int paramInt)
  {
    this.vbi = true;
    this.tzV = paramInt;
    getWrappedTextView().setLineSpacing(paramInt, 1.0F);
    requestLayout();
    invalidate();
  }
  
  public void setTextColor(int paramInt)
  {
    this.bv = ColorStateList.valueOf(paramInt);
    getWrappedTextView().setTextColor(paramInt);
    updateTextColors();
  }
  
  public void setTextGravity(int paramInt)
  {
    getWrappedTextView().setGravity(paramInt);
    if ((0x800007 & paramInt) == 0) {
      paramInt = 0x800003 | paramInt;
    }
    for (;;)
    {
      int i = paramInt;
      if ((paramInt & 0x70) == 0) {
        i = paramInt | 0x30;
      }
      this.vbt = i;
      if (i != this.vbt) {
        invalidate();
      }
      return;
    }
  }
  
  public void setTextSize(float paramFloat)
  {
    setTextSize(2, paramFloat);
  }
  
  public final void setTextSize(int paramInt, float paramFloat)
  {
    Object localObject = getContext();
    if (localObject == null) {}
    for (localObject = Resources.getSystem();; localObject = ((Context)localObject).getResources())
    {
      setRawTextSize(TypedValue.applyDimension(paramInt, paramFloat, ((Resources)localObject).getDisplayMetrics()));
      return;
    }
  }
  
  public void setWidth(int paramInt)
  {
    this.vbi = true;
    this.gg = paramInt;
    getWrappedTextView().setMaxWidth(paramInt);
    requestLayout();
    invalidate();
  }
  
  private static final class a
  {
    float duz;
    float fontScale;
    int orientation;
    CharSequence text;
    int vbw = 1;
    Paint.FontMetricsInt vbx;
    int[] vby;
    
    a(CharSequence paramCharSequence, int[] paramArrayOfInt, float paramFloat1, Paint.FontMetricsInt paramFontMetricsInt, float paramFloat2, int paramInt)
    {
      this.vby = paramArrayOfInt;
      if (TextUtils.isEmpty(paramCharSequence)) {}
      for (paramArrayOfInt = "";; paramArrayOfInt = paramCharSequence)
      {
        this.text = paramArrayOfInt;
        this.duz = paramFloat1;
        this.vbx = paramFontMetricsInt;
        this.fontScale = paramFloat2;
        this.orientation = paramInt;
        if (!(paramCharSequence instanceof Spannable)) {
          break;
        }
        paramCharSequence = (CharacterStyle[])((Spannable)paramCharSequence).getSpans(0, paramCharSequence.length(), CharacterStyle.class);
        int j = paramCharSequence.length;
        paramInt = i;
        while (paramInt < j)
        {
          paramArrayOfInt = paramCharSequence[paramInt];
          i = this.vbw;
          this.vbw = (paramArrayOfInt.hashCode() + i);
          paramInt += 1;
        }
      }
    }
    
    public final boolean equals(Object paramObject)
    {
      if ((paramObject instanceof a))
      {
        paramObject = (a)paramObject;
        return (this.duz == ((a)paramObject).duz) && (this.fontScale == ((a)paramObject).fontScale) && (this.vby[0] == paramObject.vby[0]) && (this.vby[1] == paramObject.vby[1]) && (this.vbx.descent == ((a)paramObject).vbx.descent) && (this.vbx.top == ((a)paramObject).vbx.top) && (this.vbx.bottom == ((a)paramObject).vbx.bottom) && (this.vbx.ascent == ((a)paramObject).vbx.ascent) && (this.vbx.leading == ((a)paramObject).vbx.leading) && (this.text.equals(((a)paramObject).text));
      }
      return false;
    }
    
    public final int hashCode()
    {
      return (int)(this.vbw + this.text.hashCode() + this.duz * this.fontScale * this.orientation + this.vby[0] + this.vby[1]);
    }
  }
  
  public static abstract interface b
  {
    public abstract boolean dK(View paramView);
  }
  
  public static abstract interface c
    extends View.OnTouchListener
  {}
  
  static final class d
    implements Runnable
  {
    volatile boolean dDR = false;
    TextPaint dtU = new TextPaint();
    String text;
    float[] vbz;
    
    d(String paramString, TextPaint paramTextPaint)
    {
      this.dtU.set(paramTextPaint);
      this.text = paramString;
    }
    
    public final float[] d(Paint paramPaint)
    {
      if (paramPaint.getTextSize() != this.dtU.getTextSize()) {}
      while (!this.dDR) {
        return null;
      }
      return this.vbz;
    }
    
    public final void run()
    {
      this.vbz = new float[this.text.length()];
      this.dtU.getTextWidths(this.text, this.vbz);
      this.dDR = true;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/neattextview/textview/view/NeatTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */