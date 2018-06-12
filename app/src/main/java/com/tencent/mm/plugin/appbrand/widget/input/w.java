package com.tencent.mm.plugin.appbrand.widget.input;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.support.v4.e.a;
import android.text.Editable;
import android.text.Layout.Alignment;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.text.style.AlignmentSpan.Standard;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.plugin.appbrand.s.f;
import com.tencent.mm.plugin.appbrand.widget.b.d;
import com.tencent.mm.pointers.PBool;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

@SuppressLint({"AppCompatCustomView"})
public abstract class w
  extends EditText
  implements d, z
{
  InputConnection gHZ;
  private final Map<z.c, Object> gIA = new a();
  private final a gIB = new a((byte)0);
  private final PasswordTransformationMethod gIC = new k();
  private final x gID = new x(this);
  private boolean gIE;
  private int gIF = 0;
  private boolean gIG = false;
  private final int[] gIH = new int[2];
  private z.b gII;
  char gIJ = '\000';
  boolean gIw = false;
  private final com.tencent.mm.plugin.appbrand.widget.input.autofill.b gIx;
  private final Map<z.a, Object> gIy = new a();
  private final Map<View.OnFocusChangeListener, Object> gIz = new a();
  private volatile int mInputId = -1;
  
  public w(Context paramContext)
  {
    super(paramContext);
    setBackgroundDrawable(null);
    setIncludeFontPadding(false);
    me(3);
    setSingleLine(true);
    setTextCursorDrawable(s.f.app_brand_web_edit_text_cursor);
    setTextIsSelectable(true);
    setFocusable(true);
    setFocusableInTouchMode(true);
    if (Build.VERSION.SDK_INT >= 16) {
      setLineSpacing(0.0F, 1.0F);
    }
    setTypeface(Typeface.SANS_SERIF);
    super.addTextChangedListener(this.gIB);
    super.setPadding(0, 0, 0, 0);
    super.setEditableFactory(new w.1(this));
    if (apw()) {}
    for (this.gIx = new com.tencent.mm.plugin.appbrand.widget.input.autofill.b(this);; this.gIx = null)
    {
      this.gIE = true;
      return;
    }
  }
  
  private void me(int paramInt)
  {
    setGravity(getGravity() & 0xFF7FFFFC & 0xFF7FFFFA | paramInt);
    paramInt = getGravity();
    Object localObject = getHint();
    if (!TextUtils.isEmpty((CharSequence)localObject))
    {
      Spannable localSpannable = af.r((CharSequence)localObject);
      switch (paramInt & 0x7)
      {
      default: 
        localObject = Layout.Alignment.ALIGN_NORMAL;
        localSpannable.setSpan(new AlignmentSpan.Standard((Layout.Alignment)localObject), 0, getHint().length(), 18);
        super.setHint(localSpannable);
        if (Build.VERSION.SDK_INT >= 17) {
          switch (w.3.azD[localObject.ordinal()])
          {
          default: 
            paramInt = 5;
          }
        }
        break;
      }
    }
    for (;;)
    {
      super.setTextAlignment(paramInt);
      return;
      localObject = Layout.Alignment.ALIGN_OPPOSITE;
      break;
      localObject = Layout.Alignment.ALIGN_CENTER;
      break;
      paramInt = 4;
      continue;
      paramInt = 6;
    }
  }
  
  public void D(float paramFloat1, float paramFloat2)
  {
    throw new IllegalStateException("Should implement performClick(float, float) in this class!");
  }
  
  public final void a(View.OnFocusChangeListener paramOnFocusChangeListener)
  {
    if (paramOnFocusChangeListener != null) {
      this.gIz.put(paramOnFocusChangeListener, this);
    }
  }
  
  public final void a(z.a parama)
  {
    this.gIy.put(parama, this);
  }
  
  public final void a(z.c paramc)
  {
    this.gIA.put(paramc, this);
  }
  
  public void addTextChangedListener(TextWatcher paramTextWatcher)
  {
    a locala = this.gIB;
    if (paramTextWatcher != null) {
      locala.gIL.put(paramTextWatcher, locala);
    }
  }
  
  public final int apL()
  {
    return mf(getLineCount()) + getPaddingBottom();
  }
  
  public final void apM()
  {
    me(3);
  }
  
  public final void apN()
  {
    me(5);
  }
  
  public final void apO()
  {
    me(1);
  }
  
  final void apP()
  {
    this.gIF += 1;
  }
  
  final void apQ()
  {
    this.gIF = Math.max(0, this.gIF - 1);
  }
  
  public boolean apd()
  {
    return false;
  }
  
  public boolean apw()
  {
    return true;
  }
  
  protected abstract void apx();
  
  public boolean apz()
  {
    return this.gIG;
  }
  
  public final void b(View.OnFocusChangeListener paramOnFocusChangeListener)
  {
    if (paramOnFocusChangeListener != null) {
      this.gIz.remove(paramOnFocusChangeListener);
    }
  }
  
  Editable c(Editable paramEditable)
  {
    return this.gID.c(paramEditable);
  }
  
  public void clearFocus()
  {
    if ((getParent() instanceof ViewGroup))
    {
      ((ViewGroup)getParent()).setFocusableInTouchMode(true);
      ((ViewGroup)getParent()).setDescendantFocusability(131072);
    }
    super.clearFocus();
  }
  
  public final void destroy()
  {
    this.gIy.clear();
    this.gIA.clear();
    this.gIz.clear();
    this.gIB.gIL.clear();
    if (this.gIx != null)
    {
      com.tencent.mm.plugin.appbrand.widget.input.autofill.b localb = this.gIx;
      com.tencent.mm.plugin.appbrand.widget.input.autofill.c localc = localb.gJX;
      i.l(localc.gKi).a(localc.gKh);
      localb.gKa = null;
      localb.gJV.dismiss();
    }
    super.setOnFocusChangeListener(null);
  }
  
  public com.tencent.mm.plugin.appbrand.widget.input.autofill.b getAutoFillController()
  {
    return this.gIx;
  }
  
  public int getInputId()
  {
    return this.mInputId;
  }
  
  public char getLastKeyPressed()
  {
    return this.gIJ;
  }
  
  public final View getView()
  {
    return this;
  }
  
  public final int mf(int paramInt)
  {
    int i = getPaddingTop() + (int)(paramInt * (getLineHeight() + getLineSpacingExtra()));
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.AppBrand.WebEditText", "calculateLinePosition, lineNumber %d, returnHeight %d, layout %s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), getLayout() });
    return i;
  }
  
  protected void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    if (!this.gIy.isEmpty())
    {
      paramConfiguration = (z.a[])this.gIy.keySet().toArray(new z.a[this.gIy.size()]);
      int j = paramConfiguration.length;
      int i = 0;
      while (i < j)
      {
        paramConfiguration[i].apR();
        i += 1;
      }
    }
  }
  
  public InputConnection onCreateInputConnection(EditorInfo paramEditorInfo)
  {
    this.gHZ = new w.2(this, super.onCreateInputConnection(paramEditorInfo));
    return this.gHZ;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
  }
  
  protected void onFocusChanged(boolean paramBoolean, int paramInt, Rect paramRect)
  {
    super.onFocusChanged(paramBoolean, paramInt, paramRect);
    if (!paramBoolean) {
      clearComposingText();
    }
    if (paramBoolean) {
      apx();
    }
    if (!this.gIz.isEmpty())
    {
      paramRect = (View.OnFocusChangeListener[])this.gIz.keySet().toArray(new View.OnFocusChangeListener[this.gIz.size()]);
      int i = paramRect.length;
      paramInt = 0;
      while (paramInt < i)
      {
        paramRect[paramInt].onFocusChange(this, paramBoolean);
        paramInt += 1;
      }
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    if ((bool) && (paramInt == 66)) {
      this.gIJ = '\n';
    }
    return bool;
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((this.gII != null) && (this.gII.lV(paramInt))) {
      return true;
    }
    return super.onKeyUp(paramInt, paramKeyEvent);
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    com.tencent.mm.sdk.platformtools.x.v("MicroMsg.AppBrand.WebEditText", "[scrollUp] input onLayout");
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    com.tencent.mm.sdk.platformtools.x.v("MicroMsg.AppBrand.WebEditText", "[scrollUp] input onMeasure");
    super.onMeasure(paramInt1, paramInt2);
    if (!this.gIA.isEmpty())
    {
      Object[] arrayOfObject = this.gIA.keySet().toArray();
      paramInt2 = arrayOfObject.length;
      paramInt1 = 0;
      while (paramInt1 < paramInt2)
      {
        z.c localc = (z.c)arrayOfObject[paramInt1];
        getMeasuredWidth();
        getMeasuredHeight();
        localc.apy();
        paramInt1 += 1;
      }
    }
  }
  
  public final void q(CharSequence paramCharSequence)
  {
    apP();
    Editable localEditable = getEditableText();
    if (localEditable == null) {
      setText(paramCharSequence, TextView.BufferType.EDITABLE);
    }
    for (;;)
    {
      apQ();
      return;
      clearComposingText();
      if (TextUtils.isEmpty(paramCharSequence)) {
        localEditable.clear();
      } else {
        localEditable.replace(0, localEditable.length(), paramCharSequence);
      }
    }
  }
  
  public final void r(p paramp)
  {
    Object localObject;
    if (this.gIx != null)
    {
      localObject = this.gIx.gJX;
      ((com.tencent.mm.plugin.appbrand.widget.input.autofill.c)localObject).gKi = paramp;
      paramp = i.l(paramp);
      localObject = ((com.tencent.mm.plugin.appbrand.widget.input.autofill.c)localObject).gKh;
      if (localObject != null) {
        break label35;
      }
    }
    label35:
    while (paramp.gGQ.containsKey(localObject)) {
      return;
    }
    paramp.gGQ.put(localObject, paramp);
  }
  
  public void removeTextChangedListener(TextWatcher paramTextWatcher)
  {
    a locala = this.gIB;
    if (paramTextWatcher != null) {
      locala.gIL.remove(paramTextWatcher);
    }
  }
  
  public boolean requestFocus(int paramInt, Rect paramRect)
  {
    if ((130 == paramInt) && (paramRect == null) && ((getParent() instanceof ViewGroup)))
    {
      ((ViewGroup)getParent()).setDescendantFocusability(262144);
      ((ViewGroup)getParent()).setFocusableInTouchMode(false);
    }
    return super.requestFocus(paramInt, paramRect);
  }
  
  public final void s(p paramp)
  {
    if (this.gIx != null)
    {
      com.tencent.mm.plugin.appbrand.widget.input.autofill.c localc = this.gIx.gJX;
      i.l(paramp).a(localc.gKh);
    }
  }
  
  public void setFixed(boolean paramBoolean)
  {
    this.gIG = paramBoolean;
  }
  
  public void setInputId(int paramInt)
  {
    this.mInputId = paramInt;
  }
  
  public void setInputType(int paramInt)
  {
    if (getInputType() == paramInt) {
      return;
    }
    super.setInputType(paramInt);
  }
  
  public void setMaxHeight(int paramInt)
  {
    if (getMaxHeight() == paramInt) {
      return;
    }
    super.setMaxHeight(paramInt);
  }
  
  public void setMinHeight(int paramInt)
  {
    if (getMinHeight() == paramInt) {
      return;
    }
    super.setMinHeight(paramInt);
  }
  
  public void setOnComposingDismissedListener(com.tencent.mm.plugin.appbrand.widget.input.a.b paramb)
  {
    this.gID.gIR = paramb;
  }
  
  @Deprecated
  public void setOnFocusChangeListener(View.OnFocusChangeListener paramOnFocusChangeListener)
  {
    super.setOnFocusChangeListener(paramOnFocusChangeListener);
  }
  
  public void setOnKeyUpPostImeListener(z.b paramb)
  {
    this.gII = paramb;
  }
  
  public void setPasswordMode(boolean paramBoolean)
  {
    apP();
    this.gIw = paramBoolean;
    if (paramBoolean) {}
    for (PasswordTransformationMethod localPasswordTransformationMethod = this.gIC;; localPasswordTransformationMethod = null)
    {
      setTransformationMethod(localPasswordTransformationMethod);
      apQ();
      return;
    }
  }
  
  public void setSelection(int paramInt)
  {
    if (getEditableText() == null) {
      return;
    }
    super.setSelection(Math.min(paramInt, getEditableText().length()));
  }
  
  public void setSelection(int paramInt1, int paramInt2)
  {
    super.setSelection(paramInt1, paramInt2);
  }
  
  public void setSingleLine(boolean paramBoolean) {}
  
  public void setText(CharSequence paramCharSequence, TextView.BufferType paramBufferType)
  {
    super.setText(paramCharSequence, paramBufferType);
  }
  
  public final void setTextCursorDrawable(int paramInt)
  {
    try
    {
      new com.tencent.mm.compatible.loader.c(this, "mCursorDrawableRes", TextView.class.getName()).set(Integer.valueOf(paramInt));
      return;
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.AppBrand.WebEditText", "setTextCursorDrawable, exp = %s", new Object[] { bi.i(localException) });
    }
  }
  
  public final void setTextSize(float paramFloat)
  {
    setTextSize(0, paramFloat);
  }
  
  public void setTextSize(int paramInt, float paramFloat)
  {
    super.setTextSize(paramInt, paramFloat);
  }
  
  public void setTypeface(Typeface paramTypeface)
  {
    super.setTypeface(paramTypeface);
  }
  
  public void setTypeface(Typeface paramTypeface, int paramInt)
  {
    super.setTypeface(paramTypeface, paramInt);
  }
  
  public String toString()
  {
    return String.format(Locale.US, "[%s|%s]", new Object[] { getClass().getSimpleName(), Integer.valueOf(getInputId()) });
  }
  
  private final class a
    implements TextWatcher
  {
    final Map<TextWatcher, Object> gIL = new a();
    
    private a() {}
    
    public final void afterTextChanged(Editable paramEditable)
    {
      Object localObject;
      int i;
      int j;
      if (e.apl())
      {
        localObject = new PBool();
        PInt localPInt = new PInt();
        String str = w.a(paramEditable, (PBool)localObject, localPInt);
        i = localPInt.value;
        if ((((PBool)localObject).value) && (!bi.oW(str)))
        {
          j = Selection.getSelectionEnd(paramEditable);
          boolean bool = w.a(w.this);
          w.this.post(new w.a.1(this, bool, str, j, i));
        }
      }
      for (;;)
      {
        return;
        if (!w.a(w.this))
        {
          w.b(w.this);
          if (this.gIL.isEmpty()) {
            break;
          }
          localObject = (TextWatcher[])this.gIL.keySet().toArray(new TextWatcher[this.gIL.size()]);
          j = localObject.length;
          i = 0;
          while (i < j)
          {
            localObject[i].afterTextChanged(paramEditable);
            i += 1;
          }
        }
      }
    }
    
    public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
    {
      if ((!w.a(w.this)) && (!this.gIL.isEmpty()))
      {
        TextWatcher[] arrayOfTextWatcher = (TextWatcher[])this.gIL.keySet().toArray(new TextWatcher[this.gIL.size()]);
        int j = arrayOfTextWatcher.length;
        int i = 0;
        while (i < j)
        {
          arrayOfTextWatcher[i].beforeTextChanged(paramCharSequence, paramInt1, paramInt2, paramInt3);
          i += 1;
        }
      }
    }
    
    public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
    {
      if ((!w.a(w.this)) && (!this.gIL.isEmpty()))
      {
        TextWatcher[] arrayOfTextWatcher = (TextWatcher[])this.gIL.keySet().toArray(new TextWatcher[this.gIL.size()]);
        int j = arrayOfTextWatcher.length;
        int i = 0;
        while (i < j)
        {
          arrayOfTextWatcher[i].onTextChanged(paramCharSequence, paramInt1, paramInt2, paramInt3);
          i += 1;
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/input/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */