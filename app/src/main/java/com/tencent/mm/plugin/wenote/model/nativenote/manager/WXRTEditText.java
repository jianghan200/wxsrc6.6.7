package com.tencent.mm.plugin.wenote.model.nativenote.manager;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView.t;
import android.text.Editable;
import android.text.Layout;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.Spanned;
import android.text.TextWatcher;
import android.text.style.ParagraphStyle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.TextView.BufferType;
import com.tencent.mm.plugin.wenote.model.nativenote.b.c;
import com.tencent.mm.plugin.wenote.model.nativenote.c.d;
import com.tencent.mm.plugin.wenote.model.nativenote.spans.k;
import com.tencent.mm.plugin.wenote.model.nativenote.spans.m;
import com.tencent.mm.plugin.wenote.model.nativenote.spans.n;
import com.tencent.mm.plugin.wenote.model.nativenote.spans.t;
import com.tencent.mm.plugin.wenote.model.nativenote.spans.u;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.widget.edittext.PasterEditText;
import java.util.ArrayList;

public class WXRTEditText
  extends PasterEditText
  implements SpanWatcher
{
  private al eOf = null;
  public int jDz = 0;
  public boolean qoP = false;
  public int qoR = 0;
  private int qqA = -1;
  private int qqB = -1;
  private boolean qqC = false;
  private boolean qqD;
  private int qqE;
  private int qqF;
  private String qqG;
  public String qqH = "";
  private Spannable qqI;
  int qqJ = 0;
  private WXRTEditText qqK = null;
  public RecyclerView.t qqL;
  private boolean qqM;
  private boolean qqN;
  private boolean qqO;
  private boolean qqP;
  private boolean qqQ;
  private boolean qqR = false;
  private boolean qqS;
  private j qqT;
  public boolean qqU = false;
  public boolean qqV = false;
  private int qqW = -1;
  private Paint qqX = null;
  private com.tencent.mm.plugin.wenote.model.nativenote.c.b qqY = null;
  private boolean qqZ = false;
  c qqz;
  private Path qra = null;
  private int qrb = -1;
  private int qrc = -1;
  private int qrd = -1;
  private boolean qre = false;
  TextWatcher qrf = new WXRTEditText.2(this);
  int qrg = 0;
  
  public WXRTEditText(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }
  
  public WXRTEditText(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init();
  }
  
  private void b(Spannable paramSpannable)
  {
    int i = getSelectionStart();
    com.tencent.mm.br.g localg = com.tencent.mm.br.g.cjL();
    getContext();
    setSpannableText(localg.a(paramSpannable, getTextSize()));
    int j = getText().length() - paramSpannable.length();
    if (j > 0)
    {
      i += j;
      if (i <= getText().length()) {
        setSelection(i);
      }
      return;
    }
    setSelection(i);
  }
  
  private void caf()
  {
    Editable localEditable = getText();
    if (localEditable.getSpans(0, localEditable.length(), getClass()) != null) {
      localEditable.setSpan(this, 0, localEditable.length(), 18);
    }
  }
  
  private void cag()
  {
    if (this.eOf == null)
    {
      this.eOf = new al(new WXRTEditText.3(this), false);
      return;
    }
    this.eOf.SO();
  }
  
  private void cah()
  {
    if (this.qqY == null)
    {
      this.qqY = new com.tencent.mm.plugin.wenote.model.nativenote.c.b();
      return;
    }
    this.qqY.reset();
  }
  
  private void et(int paramInt1, int paramInt2)
  {
    if (this.qqJ == 2)
    {
      com.tencent.mm.plugin.wenote.model.nativenote.c.e.cap().w(this.qqW, 1, this.qqW, 1);
      return;
    }
    if (this.qqJ == 1)
    {
      com.tencent.mm.plugin.wenote.model.nativenote.c.e.cap().w(this.qqW, 0, this.qqW, 0);
      return;
    }
    com.tencent.mm.plugin.wenote.model.nativenote.c.e.cap().w(this.qqW, paramInt1, this.qqW, paramInt2);
  }
  
  private j getRTLayout()
  {
    try
    {
      if ((this.qqT == null) || (this.qqS))
      {
        this.qqT = new j(getText());
        this.qqS = false;
      }
      j localj = this.qqT;
      return localj;
    }
    finally {}
  }
  
  private void init()
  {
    this.qqK = this;
    removeTextChangedListener(this.qrf);
    addTextChangedListener(this.qrf);
    setMovementMethod(com.tencent.mm.plugin.wenote.model.nativenote.spans.i.caI());
    this.qqW = -1;
    this.qqX = new Paint(1);
    this.qqX.setColor(1347529272);
    this.qqY = new com.tencent.mm.plugin.wenote.model.nativenote.c.b();
    this.qra = new Path();
    this.qrb = -1;
    this.qrc = -1;
    this.qrd = -1;
    if (com.tencent.mm.plugin.wenote.model.nativenote.c.e.isEnabled())
    {
      setHighlightColor(0);
      setCustomSelectionActionModeCallback(new WXRTEditText.1(this));
    }
  }
  
  private void setParagraphsAreUp2Date(boolean paramBoolean)
  {
    try
    {
      if (!this.qqQ) {
        this.qqP = paramBoolean;
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final String a(i parami)
  {
    if (parami == i.qrj) {
      return getText().toString();
    }
    if (parami == i.qrk) {
      return com.tencent.mm.plugin.wenote.model.nativenote.a.b.a(getText());
    }
    return "";
  }
  
  public final <V, C extends com.tencent.mm.plugin.wenote.model.nativenote.spans.g<V>> void a(t<V, C> paramt, V paramV)
  {
    if ((!this.qqR) && (!this.qqO)) {
      if (!this.qqD) {
        break label91;
      }
    }
    for (Spannable localSpannable = null;; localSpannable = caa())
    {
      paramt.a(this, paramV);
      label91:
      try
      {
        if ((this.qqz != null) && (!this.qqD))
        {
          paramt = caa();
          paramV = this.qqz;
          getSelectionStart();
          getSelectionEnd();
          getSelectionStart();
          paramV.a(this, localSpannable, paramt, getSelectionEnd());
        }
        this.qqS = true;
        return;
      }
      finally {}
    }
  }
  
  public final void ae(int paramInt, boolean paramBoolean)
  {
    Editable localEditable = getText();
    if (localEditable == null) {}
    for (;;)
    {
      return;
      Layout localLayout = getLayout();
      if (localLayout != null)
      {
        int k = localEditable.length();
        if ((paramInt >= 0) && (paramInt <= k))
        {
          int i;
          if (k == 0)
          {
            paramInt = 0;
            i = 0;
          }
          while ((i >= 0) && (i <= k) && (paramInt >= 0) && (paramInt <= k))
          {
            if (com.tencent.mm.plugin.wenote.model.nativenote.c.e.cap().isEditable())
            {
              requestFocus();
              setIgnoreSelectChangeByMultiSelect(true);
              setSelection(i, paramInt);
              setIgnoreSelectChangeByMultiSelect(false);
              if (this.qqz != null)
              {
                this.qqz.e(true, 50L);
                this.qqz.Bs(1);
              }
            }
            et(i, paramInt);
            com.tencent.mm.plugin.wenote.model.nativenote.c.e.cap().Q(true, true);
            return;
            if (paramInt < k)
            {
              if ((paramBoolean) || (localEditable.charAt(paramInt) != '\n'))
              {
                j = localLayout.getOffsetToRightOf(paramInt);
                i = paramInt;
                paramInt = j;
              }
            }
            else if ((paramInt == k) && (paramBoolean))
            {
              i = localLayout.getOffsetToLeftOf(paramInt);
              continue;
            }
            i = paramInt;
            int j = paramInt;
            paramInt = i;
            i = j;
          }
        }
      }
    }
  }
  
  public final void bZZ()
  {
    if (this.qqz != null)
    {
      this.qqz.e(true, 50L);
      this.qqz.Bs(1);
    }
  }
  
  public final Spannable caa()
  {
    Object localObject = super.getText();
    if (localObject != null) {}
    for (;;)
    {
      return new a((CharSequence)localObject);
      localObject = "";
    }
  }
  
  public final void cab()
  {
    try
    {
      this.qqD = true;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void cac()
  {
    try
    {
      this.qqD = false;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void cad()
  {
    try
    {
      this.qqC = true;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void cae()
  {
    try
    {
      this.qqC = false;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    return super.dispatchTouchEvent(paramMotionEvent);
  }
  
  public m[] getCurrentEditorCursorNumberSpan()
  {
    e locale = getParagraphsInSelection();
    return (m[])getText().getSpans(locale.Tw, locale.tK, m.class);
  }
  
  public String getCurrentEditorCursorParagraphStr()
  {
    e locale = getParagraphsInSelection();
    return getText().subSequence(locale.Tw, locale.tK).toString().trim();
  }
  
  public int getEditTextType()
  {
    return this.qqJ;
  }
  
  public ArrayList<n> getParagraphs()
  {
    return getRTLayout().qrn;
  }
  
  public e getParagraphsInSelection()
  {
    int k = 0;
    j localj = getRTLayout();
    e locale = new e(this);
    int j = localj.getLineForOffset(locale.Tw);
    int i;
    int m;
    if (locale.isEmpty())
    {
      i = locale.tK;
      m = localj.getLineForOffset(i);
      if ((localj.qrm != 0) && (j >= 0)) {
        break label103;
      }
      i = 0;
      label65:
      j = k;
      if (localj.qrm != 0)
      {
        if (m >= 0) {
          break label158;
        }
        j = k;
      }
    }
    for (;;)
    {
      return new e(i, j);
      i = locale.tK - 1;
      break;
      label103:
      if (j < localj.qrm)
      {
        i = ((n)localj.qrn.get(j)).Tw;
        break label65;
      }
      i = ((n)localj.qrn.get(localj.qrm - 1)).tK - 1;
      break label65;
      label158:
      if (m < localj.qrm) {
        j = ((n)localj.qrn.get(m)).tK;
      } else {
        j = ((n)localj.qrn.get(localj.qrm - 1)).tK - 1;
      }
    }
  }
  
  public int getPosInDataList()
  {
    return this.qqW;
  }
  
  public int getRecyclerItemPosition()
  {
    if (this.qqL.gl() == -1) {
      return 0;
    }
    return this.qqL.gl();
  }
  
  public String getSelectedText()
  {
    Editable localEditable = getText();
    e locale = getSelection();
    if ((locale.Tw >= 0) && (locale.tK >= 0) && (locale.tK <= localEditable.length())) {
      return localEditable.subSequence(locale.Tw, locale.tK).toString();
    }
    return null;
  }
  
  public e getSelection()
  {
    return new e(getSelectionStart(), getSelectionEnd());
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    Object localObject;
    d locald;
    int j;
    int m;
    int k;
    int i;
    if ((com.tencent.mm.plugin.wenote.model.nativenote.c.e.isEnabled()) && (this.qqJ == 0))
    {
      localObject = getText();
      if (localObject != null)
      {
        locald = com.tencent.mm.plugin.wenote.model.nativenote.c.e.cap().car();
        j = -1;
        m = 0;
        switch (com.tencent.mm.plugin.wenote.model.nativenote.c.e.cap().Bx(this.qqW))
        {
        default: 
          k = 0;
          i = 0;
          if ((j >= 0) && (i <= ((Editable)localObject).length()) && (j <= i)) {
            break;
          }
        }
      }
    }
    do
    {
      do
      {
        super.onDraw(paramCanvas);
        return;
      } while (locald.startOffset == locald.qsa);
      j = locald.startOffset;
      i = locald.qsa;
      k = 0;
      break;
      j = 0;
      i = ((Editable)localObject).length();
      m = 1;
      k = 1;
      break;
      j = locald.startOffset;
      i = ((Editable)localObject).length();
      m = 1;
      k = 0;
      break;
      j = 0;
      i = locald.qsa;
      k = 1;
      break;
      localObject = getLayout();
    } while (localObject == null);
    if (this.qrb == -1) {
      this.qrb = getPaddingLeft();
    }
    if (this.qrc == -1) {
      this.qrc = getPaddingTop();
    }
    if (this.qrd == -1) {
      this.qrd = getPaddingBottom();
    }
    if (this.qra == null) {
      this.qra = new Path();
    }
    this.qra.reset();
    label534:
    label822:
    for (;;)
    {
      int n;
      int i1;
      int i2;
      float f1;
      float f2;
      float f3;
      float f4;
      float f5;
      float f6;
      try
      {
        n = ((Layout)localObject).getLineForOffset(j);
        i1 = ((Layout)localObject).getLineForOffset(i);
        if (n > i1) {
          break;
        }
        i2 = ((Layout)localObject).getWidth();
        f1 = ((Layout)localObject).getPrimaryHorizontal(j) + this.qrb;
        f2 = ((Layout)localObject).getLineTop(n) + this.qrc;
        f3 = ((Layout)localObject).getLineBottom(n) + this.qrc;
        f4 = ((Layout)localObject).getPrimaryHorizontal(i) + this.qrb;
        f5 = ((Layout)localObject).getLineTop(i1) + this.qrc;
        f6 = ((Layout)localObject).getLineBottom(i1) + this.qrc;
        if ((k == 0) || (m == 0)) {
          break label534;
        }
        this.qra.addRect(this.qrb, 0.0F, this.qrb + i2, f6 + this.qrd, Path.Direction.CW);
        if (this.qra.isEmpty()) {
          break;
        }
        if (this.qqX == null)
        {
          this.qqX = new Paint(1);
          this.qqX.setColor(1347529272);
        }
        paramCanvas.drawPath(this.qra, this.qqX);
      }
      catch (Exception localException)
      {
        x.e("noteeditor.WXRTEditText", "tryDrawCover: ", new Object[] { localException });
      }
      break;
      if (n == i1)
      {
        if (k != 0) {
          this.qra.addRect(this.qrb, 0.0F, f4, f6, Path.Direction.CW);
        } else if (m != 0) {
          this.qra.addRect(f1, f2, this.qrb + i2, f6 + this.qrd, Path.Direction.CW);
        } else {
          this.qra.addRect(f1, f2, f4, f6, Path.Direction.CW);
        }
      }
      else
      {
        if (k != 0)
        {
          this.qra.addRect(this.qrb, 0.0F, this.qrb + i2, f3, Path.Direction.CW);
          this.qra.addRect(this.qrb, f5, f4, f6, Path.Direction.CW);
        }
        for (;;)
        {
          if (i1 - n <= 1) {
            break label822;
          }
          this.qra.addRect(this.qrb, f3, this.qrb + i2, f5, Path.Direction.CW);
          break;
          if (m != 0)
          {
            this.qra.addRect(f1, f2, this.qrb + i2, f3, Path.Direction.CW);
            this.qra.addRect(this.qrb, f5, this.qrb + i2, f6 + this.qrd, Path.Direction.CW);
          }
          else
          {
            this.qra.addRect(f1, f2, this.qrb + i2, f3, Path.Direction.CW);
            this.qra.addRect(this.qrb, f5, f4, f6, Path.Direction.CW);
          }
        }
      }
    }
  }
  
  protected void onFocusChanged(boolean paramBoolean, int paramInt, Rect paramRect)
  {
    this.qre = false;
    this.qqA = -1;
    this.qqB = -1;
    super.onFocusChanged(paramBoolean, paramInt, paramRect);
    if (this.qqz != null) {
      this.qqz.a(this, paramBoolean, getRecyclerItemPosition());
    }
    if ((paramBoolean) && (!this.qre)) {
      onSelectionChanged(getSelectionStart(), getSelectionEnd());
    }
  }
  
  protected void onSelectionChanged(int paramInt1, int paramInt2)
  {
    for (;;)
    {
      try
      {
        if (this.qqC) {
          return;
        }
        this.qre = true;
        if (paramInt1 < 0) {
          break;
        }
        if ((this.qqA != paramInt1) || (this.qqB != paramInt2))
        {
          this.qqA = paramInt1;
          this.qqB = paramInt2;
          super.onSelectionChanged(paramInt1, paramInt2);
          if (paramInt2 <= paramInt1) {
            break label216;
          }
          bool = true;
          this.qqN = bool;
          if ((!this.qqO) && (!this.qqP))
          {
            this.qqQ = true;
            u.a(this, new t[0]);
            this.qqQ = false;
            setParagraphsAreUp2Date(true);
          }
          if (this.qqz != null)
          {
            this.qqR = true;
            this.qqz.a(this, paramInt1, paramInt2);
            this.qqR = false;
          }
        }
        if ((!com.tencent.mm.plugin.wenote.model.nativenote.c.e.isEnabled()) || (this.qqZ) || (!hasFocus()) || (this.qqW < 0)) {
          break;
        }
        et(paramInt1, paramInt2);
        if (com.tencent.mm.plugin.wenote.model.nativenote.c.e.cap().Bx(this.qqW) != 1) {
          break;
        }
        com.tencent.mm.plugin.wenote.model.nativenote.c.e locale = com.tencent.mm.plugin.wenote.model.nativenote.c.e.cap();
        if (!com.tencent.mm.plugin.wenote.model.nativenote.c.e.mHasInit) {
          break;
        }
        locale.f(true, 0L);
        locale.cax();
        locale.cav();
        return;
      }
      finally {}
      label216:
      boolean bool = false;
    }
  }
  
  public void onSpanAdded(Spannable paramSpannable, Object paramObject, int paramInt1, int paramInt2)
  {
    this.qqM = true;
    if (((paramObject instanceof com.tencent.mm.plugin.wenote.model.nativenote.spans.g)) && ((paramObject instanceof ParagraphStyle))) {
      setParagraphsAreUp2Date(false);
    }
  }
  
  public void onSpanChanged(Spannable paramSpannable, Object paramObject, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.qqM = true;
    if (((paramObject instanceof com.tencent.mm.plugin.wenote.model.nativenote.spans.g)) && ((paramObject instanceof ParagraphStyle))) {
      setParagraphsAreUp2Date(false);
    }
  }
  
  public void onSpanRemoved(Spannable paramSpannable, Object paramObject, int paramInt1, int paramInt2)
  {
    this.qqM = true;
    if (((paramObject instanceof com.tencent.mm.plugin.wenote.model.nativenote.spans.g)) && ((paramObject instanceof ParagraphStyle))) {
      setParagraphsAreUp2Date(false);
    }
  }
  
  /* Error */
  public boolean onTextContextMenuItem(int paramInt)
  {
    // Byte code:
    //   0: iload_1
    //   1: ldc_w 619
    //   4: if_icmpne +14 -> 18
    //   7: aload_0
    //   8: getfield 242	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:qqz	Lcom/tencent/mm/plugin/wenote/model/nativenote/b/c;
    //   11: invokeinterface 622 1 0
    //   16: iconst_1
    //   17: ireturn
    //   18: iload_1
    //   19: ldc_w 623
    //   22: if_icmpeq +10 -> 32
    //   25: iload_1
    //   26: ldc_w 624
    //   29: if_icmpne +85 -> 114
    //   32: invokestatic 629	com/tencent/mm/plugin/wenote/model/nativenote/manager/f:acV	()V
    //   35: aload_0
    //   36: iload_1
    //   37: invokespecial 631	com/tencent/mm/ui/widget/edittext/PasterEditText:onTextContextMenuItem	(I)Z
    //   40: istore_3
    //   41: iload_1
    //   42: ldc_w 632
    //   45: if_icmpne +20 -> 65
    //   48: aload_0
    //   49: iconst_0
    //   50: putfield 116	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:qrg	I
    //   53: aload_0
    //   54: invokevirtual 170	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:getText	()Landroid/text/Editable;
    //   57: astore 4
    //   59: aload_0
    //   60: aload 4
    //   62: invokespecial 634	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:b	(Landroid/text/Spannable;)V
    //   65: iload_1
    //   66: ldc_w 632
    //   69: if_icmpne +43 -> 112
    //   72: aload_0
    //   73: getfield 79	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:qoP	Z
    //   76: ifeq +36 -> 112
    //   79: aload_0
    //   80: getfield 242	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:qqz	Lcom/tencent/mm/plugin/wenote/model/nativenote/b/c;
    //   83: ifnull +24 -> 107
    //   86: aload_0
    //   87: getfield 242	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:qqz	Lcom/tencent/mm/plugin/wenote/model/nativenote/b/c;
    //   90: iconst_0
    //   91: lconst_0
    //   92: invokeinterface 380 4 0
    //   97: aload_0
    //   98: getfield 242	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:qqz	Lcom/tencent/mm/plugin/wenote/model/nativenote/b/c;
    //   101: iconst_0
    //   102: invokeinterface 383 2 0
    //   107: aload_0
    //   108: iconst_0
    //   109: putfield 79	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:qoP	Z
    //   112: iload_3
    //   113: ireturn
    //   114: iload_1
    //   115: ldc_w 632
    //   118: if_icmpne -83 -> 35
    //   121: aload_0
    //   122: invokevirtual 155	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:getContext	()Landroid/content/Context;
    //   125: invokestatic 638	com/tencent/mm/plugin/wenote/model/nativenote/manager/f:eE	(Landroid/content/Context;)I
    //   128: istore_2
    //   129: iload_2
    //   130: iconst_2
    //   131: if_icmpne +9 -> 140
    //   134: invokestatic 629	com/tencent/mm/plugin/wenote/model/nativenote/manager/f:acV	()V
    //   137: goto -102 -> 35
    //   140: iload_2
    //   141: iconst_3
    //   142: if_icmpne -107 -> 35
    //   145: aload_0
    //   146: getfield 242	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:qqz	Lcom/tencent/mm/plugin/wenote/model/nativenote/b/c;
    //   149: aload_0
    //   150: invokeinterface 640 2 0
    //   155: iconst_1
    //   156: ireturn
    //   157: astore 4
    //   159: ldc_w 559
    //   162: ldc_w 642
    //   165: iconst_1
    //   166: anewarray 187	java/lang/Object
    //   169: dup
    //   170: iconst_0
    //   171: aload 4
    //   173: aastore
    //   174: invokestatic 566	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   177: iconst_0
    //   178: ireturn
    //   179: astore 5
    //   181: ldc_w 559
    //   184: ldc_w 644
    //   187: iconst_1
    //   188: anewarray 187	java/lang/Object
    //   191: dup
    //   192: iconst_0
    //   193: aload_0
    //   194: getfield 116	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:qrg	I
    //   197: invokestatic 650	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   200: aastore
    //   201: invokestatic 566	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   204: aload_0
    //   205: getfield 116	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:qrg	I
    //   208: iconst_3
    //   209: if_icmpge +45 -> 254
    //   212: aload_0
    //   213: aload_0
    //   214: getfield 116	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:qrg	I
    //   217: iconst_1
    //   218: iadd
    //   219: putfield 116	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:qrg	I
    //   222: aload_0
    //   223: new 652	android/text/SpannableStringBuilder
    //   226: dup
    //   227: iconst_2
    //   228: anewarray 443	java/lang/CharSequence
    //   231: dup
    //   232: iconst_0
    //   233: ldc_w 654
    //   236: aastore
    //   237: dup
    //   238: iconst_1
    //   239: aload 4
    //   241: aastore
    //   242: invokestatic 660	android/text/TextUtils:concat	([Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    //   245: invokespecial 661	android/text/SpannableStringBuilder:<init>	(Ljava/lang/CharSequence;)V
    //   248: invokespecial 634	com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText:b	(Landroid/text/Spannable;)V
    //   251: goto -186 -> 65
    //   254: aload 5
    //   256: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	257	0	this	WXRTEditText
    //   0	257	1	paramInt	int
    //   128	15	2	i	int
    //   40	73	3	bool	boolean
    //   57	4	4	localEditable	Editable
    //   157	83	4	localNullPointerException	NullPointerException
    //   179	76	5	localIndexOutOfBoundsException	IndexOutOfBoundsException
    // Exception table:
    //   from	to	target	type
    //   35	41	157	java/lang/NullPointerException
    //   59	65	179	java/lang/IndexOutOfBoundsException
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool2 = false;
    Object localObject1;
    int i;
    label366:
    boolean bool1;
    if (com.tencent.mm.plugin.wenote.model.nativenote.c.e.isEnabled())
    {
      localObject1 = getText();
      if (localObject1 == null) {
        cah();
      }
      int j;
      do
      {
        do
        {
          return true;
          j = ((Editable)localObject1).length();
          i = getOffsetForPosition(paramMotionEvent.getX(), paramMotionEvent.getY());
          if ((j < 0) || (i < 0) || (i > j))
          {
            cah();
            return true;
          }
          switch (paramMotionEvent.getAction())
          {
          case 2: 
          default: 
            return true;
          case 0: 
            j = (int)paramMotionEvent.getX();
            int k = (int)paramMotionEvent.getY();
            Object localObject2 = getLayout();
            k = ((Layout)localObject2).getOffsetForHorizontal(((Layout)localObject2).getLineForVertical(k), j);
            localObject2 = (k[])getText().getSpans(k, k + 1, k.class);
            if ((com.tencent.mm.plugin.wenote.model.nativenote.c.e.cap().isEditable()) && (j < b.bZC()) && (localObject2.length != 0))
            {
              x.i("noteeditor.WXRTEditText", "clicked todo");
              this.qqz.bZx();
              localObject2[0].a(this, (Spannable)localObject1, paramMotionEvent, localObject2[0]);
              return true;
            }
            cah();
            this.qqY.a(1, paramMotionEvent.getRawX(), paramMotionEvent.getRawY(), paramMotionEvent.getX(), paramMotionEvent.getY(), i);
            cag();
            this.eOf.J(500L, 0L);
            return true;
          case 3: 
            cah();
            cag();
            return true;
          }
          cag();
        } while (this.qqY == null);
        localObject1 = this.qqY;
        float f1 = paramMotionEvent.getRawX();
        float f2 = paramMotionEvent.getRawY();
        float f3 = paramMotionEvent.getX();
        float f4 = paramMotionEvent.getY();
        ((com.tencent.mm.plugin.wenote.model.nativenote.c.b)localObject1).qrS = f1;
        ((com.tencent.mm.plugin.wenote.model.nativenote.c.b)localObject1).qrT = f2;
        ((com.tencent.mm.plugin.wenote.model.nativenote.c.b)localObject1).qrU = f3;
        ((com.tencent.mm.plugin.wenote.model.nativenote.c.b)localObject1).qrV = f4;
        if (((com.tencent.mm.plugin.wenote.model.nativenote.c.b)localObject1).hER != 1) {
          break;
        }
        ((com.tencent.mm.plugin.wenote.model.nativenote.c.b)localObject1).qrW = i;
        j = this.qqY.getType();
        cah();
      } while (j != 2);
      if (com.tencent.mm.plugin.wenote.model.nativenote.c.e.cap().isEditable()) {
        if (hasFocus())
        {
          if ((getSelectionStart() != getSelectionEnd()) || (i != getSelectionStart())) {
            break label670;
          }
          bool1 = true;
          bool2 = true;
        }
      }
    }
    for (;;)
    {
      setIgnoreSelectChangeByMultiSelect(true);
      setSelection(i);
      setIgnoreSelectChangeByMultiSelect(false);
      if (this.qqz != null)
      {
        this.qqz.e(true, 50L);
        this.qqz.Bs(1);
      }
      et(i, i);
      com.tencent.mm.plugin.wenote.model.nativenote.c.e.cap().Q(bool2, bool1);
      return true;
      ((com.tencent.mm.plugin.wenote.model.nativenote.c.b)localObject1).qrW = 0;
      break label366;
      requestFocus();
      bool1 = false;
      bool2 = false;
      continue;
      paramMotionEvent = com.tencent.mm.plugin.wenote.model.nativenote.c.e.cap().car();
      bool1 = bool2;
      if (com.tencent.mm.plugin.wenote.model.nativenote.c.e.cap().caw())
      {
        bool1 = bool2;
        if (paramMotionEvent.cao() == 1)
        {
          bool1 = bool2;
          if (paramMotionEvent.dHJ == this.qqW)
          {
            bool1 = bool2;
            if (paramMotionEvent.startOffset == i) {
              bool1 = true;
            }
          }
        }
      }
      et(i, i);
      paramMotionEvent = com.tencent.mm.plugin.wenote.model.nativenote.c.e.cap();
      if (!com.tencent.mm.plugin.wenote.model.nativenote.c.e.mHasInit) {
        break;
      }
      paramMotionEvent.cax();
      paramMotionEvent.cav();
      paramMotionEvent.f(true, 50L);
      paramMotionEvent.ky(true);
      paramMotionEvent.kx(bool1);
      return true;
      if ((paramMotionEvent.getAction() == 1) && (this.qqz != null))
      {
        this.qqz.e(true, 300L);
        this.qqz.Bs(1);
      }
      return super.onTouchEvent(paramMotionEvent);
      label670:
      bool1 = false;
      bool2 = true;
    }
  }
  
  public void setEditTextType(int paramInt)
  {
    this.qqJ = paramInt;
  }
  
  public void setIgnoreSelectChangeByMultiSelect(boolean paramBoolean)
  {
    this.qqZ = paramBoolean;
  }
  
  public void setMaxHeight(int paramInt)
  {
    super.setMaxHeight(paramInt);
  }
  
  public void setPosInDataList(int paramInt)
  {
    this.qqW = paramInt;
  }
  
  public void setRichTextEditing(String paramString)
  {
    cab();
    if (!bi.oW(paramString)) {
      setSpannableText(com.tencent.mm.plugin.wenote.model.nativenote.a.a.Sk(paramString));
    }
    for (;;)
    {
      cac();
      return;
      setText("");
    }
  }
  
  public void setSpannableText(Spanned paramSpanned)
  {
    cab();
    cad();
    super.setText(paramSpanned, TextView.BufferType.EDITABLE);
    cae();
    caf();
    u.a(this, new t[0]);
    cac();
  }
  
  public void setText(String paramString)
  {
    cab();
    super.setText(paramString);
    cac();
  }
  
  public void setTextWithoutIgnore(String paramString)
  {
    super.setText(paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/wenote/model/nativenote/manager/WXRTEditText.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */