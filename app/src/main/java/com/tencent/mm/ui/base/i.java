package com.tencent.mm.ui.base;

import android.app.Dialog;
import android.content.Context;
import com.tencent.mm.sdk.platformtools.x;

public class i
  extends Dialog
{
  public i(Context paramContext)
  {
    super(paramContext);
  }
  
  public i(Context paramContext, int paramInt)
  {
    super(paramContext, paramInt);
  }
  
  public void dismiss()
  {
    try
    {
      super.dismiss();
      return;
    }
    catch (Exception localException)
    {
      x.printErrStackTrace("MicroMsg.MMDialog", localException, "", new Object[0]);
    }
  }
  
  public void show()
  {
    try
    {
      super.show();
      return;
    }
    catch (Exception localException)
    {
      x.printErrStackTrace("MicroMsg.MMDialog", localException, "", new Object[0]);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ui/base/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */