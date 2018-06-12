package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.text.ClipboardManager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.tencent.mm.ui.widget.MMEditText;

public class SnsEditText
  extends MMEditText
{
  private Context context;
  private boolean kCS = false;
  private ClipboardManager nVZ = null;
  private int nWa = 0;
  private int nWb = 0;
  private int nWc = 0;
  private int nWd = 10;
  private float y;
  
  public SnsEditText(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.context = paramContext;
    this.nVZ = ((ClipboardManager)this.context.getSystemService("clipboard"));
    addTextChangedListener(new SnsEditText.1(this));
  }
  
  public int getPasterLen()
  {
    return this.nWa;
  }
  
  public boolean onTextContextMenuItem(int paramInt)
  {
    return super.onTextContextMenuItem(paramInt);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (paramMotionEvent.getAction() == 2) {
      if (Math.abs(this.y - paramMotionEvent.getY()) > this.nWd) {
        this.kCS = true;
      }
    }
    for (;;)
    {
      this.y = paramMotionEvent.getY();
      return super.onTouchEvent(paramMotionEvent);
      if (paramMotionEvent.getAction() == 1)
      {
        if (this.kCS)
        {
          this.kCS = false;
          return true;
        }
      }
      else {
        this.kCS = false;
      }
    }
  }
  
  public void setPasterLen(int paramInt)
  {
    this.nWa = paramInt;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/SnsEditText.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */