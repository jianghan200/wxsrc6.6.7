package com.tencent.mm.ui.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.text.Spannable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView.BufferType;
import android.widget.Toast;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.neattextview.textview.view.NeatTextView;
import com.tencent.neattextview.textview.view.NeatTextView.b;

public class MMNeatTextView
  extends NeatTextView
{
  private static boolean BA = true;
  public static boolean uGn = false;
  private static final String uGo = "^[\\u0001-\\u00b7\\u4E00-\\u9FA5\\ue001-\\ue537\\u2005-\\u2027\\u3001-\\u3011\\uff01-\\uffe5\\u2100-\\u2900[\\ud83c\\udc00-\\ud83c\\udfff]|[\\ud83d\\udc00-\\ud83d\\udfff]]+$".substring(1, 149);
  private GestureDetector gbw = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener()
  {
    public final boolean onDoubleTap(MotionEvent paramAnonymousMotionEvent)
    {
      if (MMNeatTextView.this.getOnDoubleClickListener() == null) {
        return false;
      }
      return MMNeatTextView.this.getOnDoubleClickListener().dK(MMNeatTextView.this);
    }
  });
  private View.OnLongClickListener uGp;
  private a uGq;
  private b uGr;
  
  public MMNeatTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public final void Q(CharSequence paramCharSequence)
  {
    for (;;)
    {
      try
      {
        super.Q(paramCharSequence);
        if ((this.vbj) && (this.uGr != null)) {
          paramCharSequence.toString();
        }
        if (this.uGq != null)
        {
          a locala = this.uGq;
          if ((paramCharSequence instanceof Spannable))
          {
            localObject = TextView.BufferType.SPANNABLE;
            locala.P(paramCharSequence);
          }
        }
        else
        {
          return;
        }
      }
      catch (Exception localException)
      {
        localObject = this.mText.toString().replaceAll(uGo, "*");
        x.e("MicroMsg.MMNeatTextView", "[_setText] replaceContent:%s exception:%s", new Object[] { localObject, localException });
        if (this.uGr != null)
        {
          this.uGr.a(localException, (String)localObject, "_setText");
          continue;
        }
        throw localException;
      }
      Object localObject = TextView.BufferType.NORMAL;
    }
  }
  
  public final boolean cAs()
  {
    return BA;
  }
  
  @SuppressLint({"GetContentDescriptionOverride"})
  public CharSequence getContentDescription()
  {
    x.d("MicroMsg.MMNeatTextView", "[isOpen] %s", new Object[] { Boolean.valueOf(false) });
    AccessibilityManager localAccessibilityManager = (AccessibilityManager)getContext().getSystemService("accessibility");
    boolean bool1 = localAccessibilityManager.isEnabled();
    boolean bool2 = localAccessibilityManager.isTouchExplorationEnabled();
    if ((bool1) && (bool2)) {}
    for (int i = 1; (i != 0) || (b.chp()); i = 0) {
      return this.mText;
    }
    return "";
  }
  
  public float getVerticalOffset()
  {
    if (uGn)
    {
      float f1 = super.getVerticalOffset();
      float f2 = getMeasuredHeight();
      x.i("MicroMsg.MMNeatTextView_changelcai", "text:%s [getVerticalOffset] offset:%s height:%s ,layout height:%s", new Object[] { this.mText, Float.valueOf(f1), Float.valueOf(f2), Float.valueOf(getLayout().cEh()[1]) });
      return f1;
    }
    return super.getVerticalOffset();
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    try
    {
      super.onDraw(paramCanvas);
      return;
    }
    catch (Exception paramCanvas)
    {
      String str = this.mText.toString().replaceAll(uGo, "*");
      x.e("MicroMsg.MMNeatTextView", "[onDraw] replaceContent:%s exception:%s", new Object[] { str, paramCanvas });
      if (this.uGr != null)
      {
        this.uGr.a(paramCanvas, str, "onDraw");
        return;
      }
      throw paramCanvas;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    try
    {
      super.onMeasure(paramInt1, paramInt2);
      return;
    }
    catch (Exception localException)
    {
      String str = this.mText.toString().replaceAll(uGo, "*");
      x.e("MicroMsg.MMNeatTextView", "[onMeasure] replaceContent:%s exception:%s", new Object[] { str, localException });
      if (this.uGr != null)
      {
        this.uGr.a(localException, str, "onMeasure");
        return;
      }
      throw localException;
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if ((!BA) || ((this.vbj) && (this.gbw != null))) {
      this.gbw.onTouchEvent(paramMotionEvent);
    }
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public void setIsOpen(boolean paramBoolean)
  {
    BA = paramBoolean;
  }
  
  public void setOnLongClickListener(View.OnLongClickListener paramOnLongClickListener)
  {
    this.uGp = paramOnLongClickListener;
    super.setOnLongClickListener(new View.OnLongClickListener()
    {
      public final boolean onLongClick(View paramAnonymousView)
      {
        if (MMNeatTextView.uGn) {
          Toast.makeText(MMNeatTextView.this.getContext(), MMNeatTextView.abs(MMNeatTextView.this.mText.toString()), 1).show();
        }
        if (MMNeatTextView.a(MMNeatTextView.this) != null) {
          return MMNeatTextView.a(MMNeatTextView.this).onLongClick(paramAnonymousView);
        }
        return false;
      }
    });
  }
  
  public void setTextCrashListener(b paramb)
  {
    this.uGr = paramb;
  }
  
  public void setTextListener(a parama)
  {
    this.uGq = parama;
  }
  
  public static abstract interface a
  {
    public abstract void P(CharSequence paramCharSequence);
  }
  
  public static abstract interface b
  {
    public abstract void a(Exception paramException, String paramString1, String paramString2);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/ui/widget/MMNeatTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */