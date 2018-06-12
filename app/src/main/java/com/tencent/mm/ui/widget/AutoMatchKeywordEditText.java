package com.tencent.mm.ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.DragEvent;
import android.widget.EditText;
import com.tencent.mm.sdk.platformtools.x;

public class AutoMatchKeywordEditText
  extends MMEditText
{
  private a uFU;
  private int uFV;
  private int uFW;
  
  public AutoMatchKeywordEditText(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }
  
  public AutoMatchKeywordEditText(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init();
  }
  
  private void init()
  {
    this.uFV = getSelectionStart();
    this.uFW = getSelectionEnd();
  }
  
  public void extendSelection(int paramInt)
  {
    x.d("MicroMsg.AutoMatchKeywordEditText", "extendSelection");
    super.extendSelection(paramInt);
    this.uFV = getSelectionStart();
    this.uFW = getSelectionEnd();
  }
  
  public a getOnSelectionChangeListener()
  {
    return this.uFU;
  }
  
  public boolean moveCursorToVisibleOffset()
  {
    x.d("MicroMsg.AutoMatchKeywordEditText", "moveCursorToVisibleOffset");
    return super.moveCursorToVisibleOffset();
  }
  
  public boolean onDragEvent(DragEvent paramDragEvent)
  {
    x.d("MicroMsg.AutoMatchKeywordEditText", "onDragEvent");
    return super.onDragEvent(paramDragEvent);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    int i = getSelectionStart();
    int j = getSelectionEnd();
    if ((this.uFV != i) || (this.uFW != j))
    {
      this.uFV = i;
      this.uFW = j;
      if (this.uFU != null) {
        this.uFU.b(this, getSelectionStart(), getSelectionEnd());
      }
    }
  }
  
  public boolean performAccessibilityAction(int paramInt, Bundle paramBundle)
  {
    x.d("MicroMsg.AutoMatchKeywordEditText", "performAccessibilityAction");
    return super.performAccessibilityAction(paramInt, paramBundle);
  }
  
  public void setOnSelectionChangeListener(a parama)
  {
    this.uFU = parama;
  }
  
  public void setSelection(int paramInt)
  {
    x.d("MicroMsg.AutoMatchKeywordEditText", "setSelection");
    int i = getSelectionStart();
    int j = getSelectionEnd();
    super.setSelection(paramInt);
    this.uFV = getSelectionStart();
    this.uFW = getSelectionEnd();
    if (((i != getSelectionStart()) || (j != getSelectionEnd())) && (this.uFU != null)) {
      this.uFU.b(this, getSelectionStart(), getSelectionEnd());
    }
  }
  
  public void setSelection(int paramInt1, int paramInt2)
  {
    x.d("MicroMsg.AutoMatchKeywordEditText", "setSelection.");
    int i = getSelectionStart();
    int j = getSelectionEnd();
    super.setSelection(paramInt1, paramInt2);
    this.uFV = getSelectionStart();
    this.uFW = getSelectionEnd();
    if (((i != getSelectionStart()) || (j != getSelectionEnd())) && (this.uFU != null)) {
      this.uFU.b(this, getSelectionStart(), getSelectionEnd());
    }
  }
  
  public static abstract interface a
  {
    public abstract void b(EditText paramEditText, int paramInt1, int paramInt2);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/ui/widget/AutoMatchKeywordEditText.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */