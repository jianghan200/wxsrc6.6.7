package com.tencent.mm.ui.tools;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnKeyListener;
import android.view.ViewGroup.LayoutParams;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView.OnEditorActionListener;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.tools.a.c;
import com.tencent.mm.ui.widget.AutoMatchKeywordEditText;
import com.tencent.mm.ui.widget.AutoMatchKeywordEditText.a;
import com.tencent.mm.w.a.d;
import com.tencent.mm.w.a.e;
import com.tencent.mm.w.a.f;
import com.tencent.mm.w.a.g;
import com.tencent.mm.w.a.h;
import com.tencent.mm.w.a.k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class ActionBarSearchView
  extends LinearLayout
  implements e
{
  private boolean mQO = false;
  private TextWatcher qME = new TextWatcher()
  {
    public final void afterTextChanged(Editable paramAnonymousEditable) {}
    
    public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3) {}
    
    public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
    {
      ActionBarSearchView.a(ActionBarSearchView.this);
      s locals = ActionBarSearchView.b(ActionBarSearchView.this);
      EditText localEditText;
      Object localObject;
      if (locals.uCz)
      {
        localEditText = (EditText)locals.uCx.get();
        if (localEditText != null) {}
      }
      else if (ActionBarSearchView.c(ActionBarSearchView.this) != null)
      {
        localObject = ActionBarSearchView.c(ActionBarSearchView.this);
        if (paramAnonymousCharSequence != null) {
          break label243;
        }
      }
      label243:
      for (paramAnonymousCharSequence = "";; paramAnonymousCharSequence = paramAnonymousCharSequence.toString())
      {
        ((ActionBarSearchView.b)localObject).FW(paramAnonymousCharSequence);
        return;
        if (((paramAnonymousCharSequence != null) && (paramAnonymousCharSequence.toString() != null) && (paramAnonymousCharSequence.toString().length() != 0)) || ((locals.gEw == null) || (locals.gEw.length() == 0) || ((locals.gEw != null) && (paramAnonymousCharSequence != null) && (locals.gEw.equals(paramAnonymousCharSequence.toString())))))
        {
          x.d("MicroMsg.WordsChecker", "text not change, new : %s, old : %s", new Object[] { paramAnonymousCharSequence, locals.gEw });
          break;
        }
        if (paramAnonymousCharSequence != null) {}
        for (localObject = paramAnonymousCharSequence.toString();; localObject = "")
        {
          locals.gEw = ((String)localObject);
          locals.uCw = s.k(locals.gEw, locals.uCy);
          if (!s.a(localEditText, locals.uCy)) {
            break;
          }
          x.d("MicroMsg.WordsChecker", "decorate text succ.");
          break;
        }
      }
    }
  };
  private View uvc;
  private ActionBarEditText uvd;
  private ImageButton uve;
  private int uvf = c.uvq;
  private boolean uvg = false;
  private s uvh;
  private b uvi;
  private a uvj;
  private View.OnFocusChangeListener uvk = new View.OnFocusChangeListener()
  {
    public final void onFocusChange(View paramAnonymousView, boolean paramAnonymousBoolean)
    {
      x.v("MicroMsg.ActionBarSearchView", "on edittext focus changed, hasFocus %B", new Object[] { Boolean.valueOf(paramAnonymousBoolean) });
      if (ActionBarSearchView.d(ActionBarSearchView.this) != null) {
        ActionBarSearchView.d(ActionBarSearchView.this).onFocusChange(paramAnonymousView, paramAnonymousBoolean);
      }
    }
  };
  private View.OnFocusChangeListener uvl;
  private View.OnClickListener uvm = new View.OnClickListener()
  {
    public final void onClick(View paramAnonymousView)
    {
      if (ActionBarSearchView.c.uvq == ActionBarSearchView.e(ActionBarSearchView.this))
      {
        x.d("MicroMsg.ActionBarSearchView", "on status btn click, cur status is clear");
        ActionBarSearchView.this.mt(true);
        if (ActionBarSearchView.c(ActionBarSearchView.this) != null) {
          ActionBarSearchView.c(ActionBarSearchView.this).WY();
        }
      }
      do
      {
        return;
        x.d("MicroMsg.ActionBarSearchView", "on status btn click, cur status is voice search");
      } while (ActionBarSearchView.c(ActionBarSearchView.this) == null);
      ActionBarSearchView.c(ActionBarSearchView.this).bad();
    }
  };
  private View.OnClickListener uvn = new View.OnClickListener()
  {
    public final void onClick(View paramAnonymousView)
    {
      if (ActionBarSearchView.f(ActionBarSearchView.this) != null) {
        ActionBarSearchView.f(ActionBarSearchView.this).bae();
      }
    }
  };
  
  public ActionBarSearchView(Context paramContext)
  {
    super(paramContext);
    init();
  }
  
  public ActionBarSearchView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }
  
  private void czs()
  {
    if ((this.uvd.getEditableText() != null) && (!bi.oW(this.uvd.getEditableText().toString())))
    {
      ff(a.f.search_clear, getResources().getDimensionPixelSize(a.e.NormalIconSize));
      this.uvf = c.uvq;
      return;
    }
    if (this.uvg)
    {
      ff(a.f.voicesearch_enter_btn, getResources().getDimensionPixelSize(a.e.NormalIconSize));
      this.uvf = c.uvr;
      return;
    }
    ff(0, 0);
    this.uvf = c.uvq;
  }
  
  private void ff(int paramInt1, int paramInt2)
  {
    this.uve.setImageResource(paramInt1);
    this.uve.setBackgroundResource(0);
    if (paramInt1 == a.f.voicesearch_enter_btn) {
      this.uve.setContentDescription(getContext().getString(a.k.voice_Input));
    }
    for (;;)
    {
      ViewGroup.LayoutParams localLayoutParams = this.uve.getLayoutParams();
      localLayoutParams.width = paramInt2;
      this.uve.setLayoutParams(localLayoutParams);
      return;
      this.uve.setContentDescription(getContext().getString(a.k.clear_btn));
    }
  }
  
  private void init()
  {
    ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(a.h.actionbar_searchview, this, true);
    this.uvc = findViewById(a.g.ab_back_container);
    this.uvc.setOnClickListener(this.uvn);
    this.uvd = ((ActionBarEditText)findViewById(a.g.edittext));
    this.uvh = new s(this.uvd);
    this.uvd.setSearchView(this);
    this.uvd.post(new Runnable()
    {
      public final void run()
      {
        ActionBarSearchView.g(ActionBarSearchView.this).setText("");
        if (ActionBarSearchView.c(ActionBarSearchView.this) != null) {
          ActionBarSearchView.c(ActionBarSearchView.this).bac();
        }
      }
    });
    this.uve = ((ImageButton)findViewById(a.g.status_btn));
    this.uvd.addTextChangedListener(this.qME);
    this.uvd.setOnKeyListener(new View.OnKeyListener()
    {
      public final boolean onKey(View paramAnonymousView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
      {
        if (paramAnonymousInt == 67)
        {
          x.d("MicroMsg.ActionBarSearchView", "on back key click.");
          Object localObject = ActionBarSearchView.b(ActionBarSearchView.this);
          if (((s)localObject).uCz)
          {
            paramAnonymousView = (EditText)((s)localObject).uCx.get();
            if ((paramAnonymousView != null) && (((s)localObject).uCw != null)) {}
          }
          else
          {
            return false;
          }
          paramAnonymousKeyEvent = paramAnonymousView.getText();
          paramAnonymousInt = paramAnonymousView.getSelectionStart();
          if (paramAnonymousInt == paramAnonymousView.getSelectionEnd())
          {
            localObject = ((s)localObject).Gg(paramAnonymousInt);
            if ((localObject != null) && (((s.b)localObject).uCC))
            {
              paramAnonymousKeyEvent.delete(((s.b)localObject).start, ((s.b)localObject).start + ((s.b)localObject).length);
              paramAnonymousView.setTextKeepState(paramAnonymousKeyEvent);
              paramAnonymousView.setSelection(((s.b)localObject).start);
              return true;
            }
          }
          return false;
        }
        return false;
      }
    });
    this.uvd.setOnSelectionChangeListener(new AutoMatchKeywordEditText.a()
    {
      public final void b(EditText paramAnonymousEditText, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        x.d("MicroMsg.ActionBarSearchView", "start : %d, stop : %d", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
        Object localObject = ActionBarSearchView.b(ActionBarSearchView.this);
        EditText localEditText;
        if (((s)localObject).uCz)
        {
          localEditText = (EditText)((s)localObject).uCx.get();
          if ((localEditText != null) && (paramAnonymousEditText == localEditText)) {
            break label67;
          }
        }
        label67:
        do
        {
          int i;
          do
          {
            do
            {
              return;
              paramAnonymousEditText = localEditText.getText();
              paramAnonymousInt2 = localEditText.getSelectionStart();
              i = localEditText.getSelectionEnd();
            } while ((paramAnonymousInt2 < 0) || (i < paramAnonymousInt2));
            if (paramAnonymousInt2 != i) {
              break;
            }
            localObject = ((s)localObject).Gg(paramAnonymousInt2);
          } while ((localObject == null) || (!((s.b)localObject).uCC));
          localEditText.setTextKeepState(paramAnonymousEditText);
          paramAnonymousInt1 = ((s.b)localObject).start;
          localEditText.setSelection(((s.b)localObject).length + paramAnonymousInt1);
          return;
          s.b localb = ((s)localObject).Gg(paramAnonymousInt2);
          paramAnonymousInt1 = paramAnonymousInt2;
          if (localb != null)
          {
            paramAnonymousInt1 = paramAnonymousInt2;
            if (localb.uCC) {
              paramAnonymousInt1 = localb.start + localb.length;
            }
          }
          if (paramAnonymousInt1 >= i)
          {
            localEditText.setTextKeepState(paramAnonymousEditText);
            localEditText.setSelection(paramAnonymousInt1);
            return;
          }
          localObject = ((s)localObject).Gg(i);
        } while ((localObject == null) || (!((s.b)localObject).uCC));
        paramAnonymousInt2 = ((s.b)localObject).start;
        localEditText.setTextKeepState(paramAnonymousEditText);
        localEditText.setSelection(paramAnonymousInt1, paramAnonymousInt2);
      }
    });
    this.uvd.setOnFocusChangeListener(this.uvk);
    c.d(this.uvd).Gi(100).a(null);
    this.uve.setOnClickListener(this.uvm);
  }
  
  public final void czt()
  {
    this.uvd.clearFocus();
  }
  
  public final boolean czu()
  {
    if (this.uvd != null) {
      return this.uvd.hasFocus();
    }
    return false;
  }
  
  public final boolean czv()
  {
    if (this.uvd != null) {
      return this.uvd.requestFocus();
    }
    return false;
  }
  
  public String getSearchContent()
  {
    if (this.uvd.getEditableText() != null) {
      return this.uvd.getEditableText().toString();
    }
    return "";
  }
  
  public final void ms(boolean paramBoolean)
  {
    this.uvg = paramBoolean;
    czs();
  }
  
  public final void mt(boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      this.uvd.removeTextChangedListener(this.qME);
      this.uvd.setText("");
      this.uvd.addTextChangedListener(this.qME);
      return;
    }
    this.uvd.setText("");
  }
  
  public void setAutoMatchKeywords(boolean paramBoolean)
  {
    if (this.uvh != null) {
      this.uvh.uCz = paramBoolean;
    }
  }
  
  public void setBackClickCallback(a parama)
  {
    this.uvj = parama;
  }
  
  public void setCallBack(b paramb)
  {
    this.uvi = paramb;
  }
  
  public void setEditTextClickListener(View.OnClickListener paramOnClickListener)
  {
    if (this.uvd != null)
    {
      this.uvd.setFocusable(false);
      this.uvd.setOnClickListener(paramOnClickListener);
    }
  }
  
  public void setEditTextEnabled(boolean paramBoolean)
  {
    this.uvd.setEnabled(paramBoolean);
  }
  
  public void setFocusChangeListener(View.OnFocusChangeListener paramOnFocusChangeListener)
  {
    this.uvl = paramOnFocusChangeListener;
  }
  
  public void setHint(CharSequence paramCharSequence)
  {
    this.uvd.setHint(paramCharSequence);
  }
  
  public void setKeywords(ArrayList<String> paramArrayList)
  {
    if (this.uvh != null)
    {
      s locals = this.uvh;
      locals.uCy = paramArrayList;
      if (locals.uCz)
      {
        paramArrayList = (EditText)locals.uCx.get();
        if (paramArrayList != null) {
          s.a(paramArrayList, locals.uCy);
        }
      }
    }
  }
  
  public void setNotRealCallBack(SearchViewNotRealTimeHelper.a parama) {}
  
  public void setOnEditorActionListener(TextView.OnEditorActionListener paramOnEditorActionListener)
  {
    this.uvd.setOnEditorActionListener(paramOnEditorActionListener);
  }
  
  public void setSearchContent(String paramString)
  {
    String str = paramString;
    if (paramString == null) {
      str = "";
    }
    this.uvd.setText(str);
    this.uvd.setSelection(str.length());
  }
  
  public void setSearchTipIcon(int paramInt)
  {
    if (this.uvd != null) {
      this.uvd.setCompoundDrawables(ad.getResources().getDrawable(paramInt), null, null, null);
    }
  }
  
  public void setSelectedTag(String paramString)
  {
    if (this.uvd != null)
    {
      this.uvd.setCompoundDrawables(new d(this.uvd, paramString), null, null, null);
      this.uvd.setHint("");
    }
  }
  
  public void setStatusBtnEnabled(boolean paramBoolean)
  {
    this.uve.setEnabled(paramBoolean);
  }
  
  public static class ActionBarEditText
    extends AutoMatchKeywordEditText
  {
    private ActionBarSearchView uvp;
    
    public ActionBarEditText(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
    }
    
    public ActionBarEditText(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
    {
      super(paramAttributeSet, paramInt);
    }
    
    public boolean onKeyPreIme(int paramInt, KeyEvent paramKeyEvent)
    {
      x.v("MicroMsg.ActionBarSearchView", "on onKeyPreIme");
      if (paramInt == 4)
      {
        KeyEvent.DispatcherState localDispatcherState;
        if ((paramKeyEvent.getAction() == 0) && (paramKeyEvent.getRepeatCount() == 0))
        {
          x.v("MicroMsg.ActionBarSearchView", "on onKeyPreIme action down");
          localDispatcherState = getKeyDispatcherState();
          if (localDispatcherState != null) {
            localDispatcherState.startTracking(paramKeyEvent, this);
          }
          return true;
        }
        if (paramKeyEvent.getAction() == 1)
        {
          x.v("MicroMsg.ActionBarSearchView", "on onKeyPreIme action up");
          localDispatcherState = getKeyDispatcherState();
          if (localDispatcherState != null) {
            localDispatcherState.handleUpEvent(paramKeyEvent);
          }
          if ((paramKeyEvent.isTracking()) && (!paramKeyEvent.isCanceled()))
          {
            x.v("MicroMsg.ActionBarSearchView", "on onKeyPreIme action up is tracking");
            this.uvp.clearFocus();
            paramKeyEvent = (InputMethodManager)getContext().getSystemService("input_method");
            if (paramKeyEvent != null) {
              paramKeyEvent.hideSoftInputFromWindow(getWindowToken(), 0);
            }
            return true;
          }
        }
      }
      return super.onKeyPreIme(paramInt, paramKeyEvent);
    }
    
    public void setSearchView(ActionBarSearchView paramActionBarSearchView)
    {
      this.uvp = paramActionBarSearchView;
    }
  }
  
  public static abstract interface a
  {
    public abstract void bae();
  }
  
  public static abstract interface b
  {
    public abstract void FW(String paramString);
    
    public abstract void WY();
    
    public abstract void bac();
    
    public abstract void bad();
  }
  
  private static enum c {}
  
  final class d
    extends Drawable
  {
    private RectF cP;
    private String gEw;
    private Paint uvt;
    private int uvu = BackwardSupportUtil.b.b(ad.getContext(), 2.0F);
    private float uvv;
    private float uvw;
    
    d(EditText paramEditText, String paramString)
    {
      this.uvt = new Paint(paramEditText.getPaint());
      this.gEw = paramString;
      this.uvt.setColor(ad.getResources().getColor(a.d.green_text_color));
      this.uvv = this.uvt.measureText(this.gEw);
      this$1 = this.uvt.getFontMetrics();
      this.uvw = ((float)Math.ceil(ActionBarSearchView.this.bottom - ActionBarSearchView.this.top));
      float f = this.uvw;
      setBounds(0, 0, (int)(this.uvv + this.uvu * 2 + this.uvu * 2 + 2.0F), (int)f);
    }
    
    public final void draw(Canvas paramCanvas)
    {
      Paint.FontMetricsInt localFontMetricsInt = this.uvt.getFontMetricsInt();
      Rect localRect = getBounds();
      int i = localRect.right;
      i = localRect.left;
      float f = this.cP.right;
      f = this.cP.left;
      i = localRect.top;
      int j = (localRect.bottom - localRect.top - localFontMetricsInt.bottom + localFontMetricsInt.top) / 2;
      int k = localFontMetricsInt.top;
      paramCanvas.drawText(this.gEw, localRect.left + 2, i + j - k, this.uvt);
    }
    
    public final int getOpacity()
    {
      return -3;
    }
    
    public final void setAlpha(int paramInt) {}
    
    public final void setBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      super.setBounds(paramInt1, paramInt2, paramInt3, paramInt4);
      Paint.FontMetrics localFontMetrics = this.uvt.getFontMetrics();
      float f1 = this.uvu + paramInt1;
      float f2 = paramInt2;
      this.cP = new RectF(f1, localFontMetrics.ascent - localFontMetrics.top + f2, paramInt3 - this.uvu, paramInt4);
      invalidateSelf();
    }
    
    public final void setColorFilter(ColorFilter paramColorFilter) {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/ui/tools/ActionBarSearchView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */