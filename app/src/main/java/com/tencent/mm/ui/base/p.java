package com.tencent.mm.ui.base;

import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.y;
import com.tencent.mm.w.a.g;
import com.tencent.mm.w.a.h;
import com.tencent.mm.w.a.l;

public class p
  extends q
{
  private View FU;
  public ProgressBar gFh;
  private Context mContext;
  private int style;
  private TextView tlx;
  
  public p(Context paramContext, int paramInt1, int paramInt2)
  {
    super(paramContext, paramInt1);
    this.mContext = paramContext;
    this.style = paramInt2;
    switch (this.style)
    {
    default: 
      paramInt1 = a.h.mm_progress_dialog;
    }
    for (;;)
    {
      this.FU = y.gq(this.mContext).inflate(paramInt1, null);
      this.tlx = ((TextView)this.FU.findViewById(a.g.mm_progress_dialog_msg));
      this.gFh = ((ProgressBar)this.FU.findViewById(a.g.mm_progress_dialog_icon));
      setCanceledOnTouchOutside(true);
      return;
      paramInt1 = a.h.mm_progress_dialog;
      continue;
      paramInt1 = a.h.mm_progress_dialog_with_bg;
      continue;
      paramInt1 = a.h.mm_progress_dialog;
    }
  }
  
  public static p a(Context paramContext, CharSequence paramCharSequence, boolean paramBoolean, int paramInt, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    int i;
    switch (paramInt)
    {
    default: 
      i = a.l.mmtipsdialog;
    }
    for (;;)
    {
      paramContext = new p(paramContext, i, paramInt);
      paramContext.setMessage(paramCharSequence);
      paramContext.setCancelable(paramBoolean);
      paramContext.setOnCancelListener(paramOnCancelListener);
      paramContext.setCanceledOnTouchOutside(false);
      return paramContext;
      i = a.l.mmalertdialog;
      continue;
      i = a.l.mmalertdialog;
      continue;
      i = a.l.mmalertdialog;
    }
  }
  
  public static p b(Context paramContext, CharSequence paramCharSequence, boolean paramBoolean, int paramInt, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    paramContext = a(paramContext, paramCharSequence, paramBoolean, paramInt, paramOnCancelListener);
    paramContext.show();
    return paramContext;
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
      x.e("MicroMsg.MMProgressDialog", "dismiss exception, e = " + localException.getMessage());
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(this.FU, new LinearLayout.LayoutParams(-1, -1));
    paramBundle = getWindow().getAttributes();
    paramBundle.width = -1;
    paramBundle.height = -2;
    if (this.style == 2)
    {
      getWindow().addFlags(2);
      paramBundle.dimAmount = 0.65F;
    }
    onWindowAttributesChanged(paramBundle);
  }
  
  public void setCancelable(boolean paramBoolean)
  {
    super.setCancelable(paramBoolean);
    setCanceledOnTouchOutside(paramBoolean);
  }
  
  public void setMessage(CharSequence paramCharSequence)
  {
    this.tlx.setText(paramCharSequence);
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
      x.printErrStackTrace("MicroMsg.MMProgressDialog", localException, "", new Object[0]);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ui/base/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */