package com.tencent.mm.ui.widget.edittext;

import android.content.Context;
import android.text.ClipboardManager;
import android.util.AttributeSet;
import android.widget.EditText;

public class PasterEditText
  extends EditText
{
  private Context context;
  private ClipboardManager nVZ = null;
  private int nWa = 0;
  
  public PasterEditText(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.context = paramContext;
    init();
  }
  
  public PasterEditText(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init();
  }
  
  private void init()
  {
    this.nVZ = ((ClipboardManager)this.context.getSystemService("clipboard"));
  }
  
  public int getPasterLen()
  {
    return this.nWa;
  }
  
  public boolean onTextContextMenuItem(int paramInt)
  {
    if (paramInt == 16908322)
    {
      if ((this.nVZ != null) && (this.nVZ.getText() != null) && ((this.nVZ.getText() instanceof String)) && (this.nVZ.getText() != null) && (this.nVZ.getText().length() > 0)) {
        this.nWa += this.nVZ.getText().length();
      }
      return super.onTextContextMenuItem(paramInt);
    }
    return super.onTextContextMenuItem(paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/ui/widget/edittext/PasterEditText.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */