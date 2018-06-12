package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.widget.EditText;
import com.tencent.mm.bp.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.w.a.e;

public class AutoHintSizeEditText
  extends EditText
{
  private int tBA = Integer.MIN_VALUE;
  private float tBB;
  private float tBx;
  private Paint tBy;
  private String tBz = "";
  
  public AutoHintSizeEditText(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }
  
  public AutoHintSizeEditText(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init();
  }
  
  private void a(Editable paramEditable, CharSequence paramCharSequence, int paramInt)
  {
    if ((paramEditable != null) && (!bi.oW(paramEditable.toString()))) {
      if (getTextSize() != this.tBx)
      {
        x.v("MicroMsg.AutoHintSizeEdittext", "content not null, reset text size %f", new Object[] { Float.valueOf(this.tBx) });
        setTextSize(0, this.tBx);
      }
    }
    for (;;)
    {
      return;
      if ((paramCharSequence == null) || (bi.oW(paramCharSequence.toString())))
      {
        if (getTextSize() != this.tBx)
        {
          x.v("MicroMsg.AutoHintSizeEdittext", "hint is null, reset text size %f", new Object[] { Float.valueOf(this.tBx) });
          setTextSize(0, this.tBx);
        }
      }
      else
      {
        paramEditable = paramCharSequence.toString();
        if ((this.tBz.equals(paramEditable)) && (this.tBA == paramInt))
        {
          if (getTextSize() != this.tBB)
          {
            x.v("MicroMsg.AutoHintSizeEdittext", "use last hint text size %f", new Object[] { Float.valueOf(this.tBB) });
            setTextSize(0, this.tBB);
          }
        }
        else
        {
          this.tBz = paramEditable;
          this.tBA = paramInt;
          if (getPaint().measureText(paramEditable) > paramInt)
          {
            int j = getResources().getDimensionPixelSize(a.e.SmallestTextSize);
            int k = a.fromDPToPix(getContext(), 1);
            int i = (int)this.tBx - k;
            while (i > j)
            {
              this.tBy.setTextSize(i);
              if (this.tBy.measureText(paramEditable) < paramInt)
              {
                x.v("MicroMsg.AutoHintSizeEdittext", "get new hint text size %d", new Object[] { Integer.valueOf(i) });
                this.tBB = i;
                setTextSize(0, i);
                return;
              }
              i -= k;
            }
          }
        }
      }
    }
  }
  
  private void init()
  {
    this.tBx = getTextSize();
    this.tBB = this.tBx;
    this.tBy = new Paint(getPaint());
    addTextChangedListener(new TextWatcher()
    {
      public final void afterTextChanged(Editable paramAnonymousEditable)
      {
        AutoHintSizeEditText.a(AutoHintSizeEditText.this, paramAnonymousEditable, AutoHintSizeEditText.this.getHint(), AutoHintSizeEditText.this.getWidth() - AutoHintSizeEditText.this.getPaddingLeft() - AutoHintSizeEditText.this.getPaddingRight());
      }
      
      public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3) {}
      
      public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3) {}
    });
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    x.d("MicroMsg.AutoHintSizeEdittext", "on layout, changed %B", new Object[] { Boolean.valueOf(paramBoolean) });
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (paramBoolean) {
      a(getText(), getHint(), paramInt3 - paramInt1 - getPaddingLeft() - getPaddingRight());
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ui/base/preference/AutoHintSizeEditText.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */