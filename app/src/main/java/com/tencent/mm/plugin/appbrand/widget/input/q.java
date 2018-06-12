package com.tencent.mm.plugin.appbrand.widget.input;

import android.content.Context;
import android.text.InputFilter;
import android.text.InputFilter.AllCaps;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.tencent.mm.plugin.appbrand.widget.input.b.a;

public final class q
  extends p
  implements a
{
  private InputConnection gHM;
  
  public q(Context paramContext)
  {
    super(paramContext);
    super.setKeyListener(new q.1(this));
  }
  
  public final InputConnection apA()
  {
    InputConnection localInputConnection = super.onCreateInputConnection(new EditorInfo());
    this.gHM = localInputConnection;
    return localInputConnection;
  }
  
  public final void apx()
  {
    ((t)getInputPanel()).setInputEditText(this);
  }
  
  public final View getInputPanel()
  {
    return t.bZ(this);
  }
  
  public final InputConnection onCreateInputConnection(EditorInfo paramEditorInfo)
  {
    return null;
  }
  
  public final void setFilters(InputFilter[] paramArrayOfInputFilter)
  {
    int i = 0;
    InputFilter[] arrayOfInputFilter = paramArrayOfInputFilter;
    if (paramArrayOfInputFilter == null) {
      arrayOfInputFilter = new InputFilter[0];
    }
    paramArrayOfInputFilter = new InputFilter[arrayOfInputFilter.length + 1];
    while (i < arrayOfInputFilter.length)
    {
      paramArrayOfInputFilter[i] = arrayOfInputFilter[i];
      i += 1;
    }
    paramArrayOfInputFilter[i] = new InputFilter.AllCaps();
    super.setFilters(paramArrayOfInputFilter);
  }
  
  public final void setPasswordMode(boolean paramBoolean)
  {
    apP();
    int i = getInputType() | 0x2;
    if (paramBoolean) {
      i |= 0x10;
    }
    for (;;)
    {
      setInputType(i);
      super.setPasswordMode(paramBoolean);
      apQ();
      return;
      i &= 0xFFFFFFEF;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/input/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */