package com.tencent.mm.wallet_core.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.plugin.wxpay.a.j;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.ui.base.q;

public final class g
  extends q
{
  private View FU;
  private ProgressBar gFh;
  private Context mContext;
  private TextView tlx;
  
  private g(Context paramContext, int paramInt)
  {
    super(paramContext, paramInt);
    this.mContext = paramContext;
    this.FU = null;
    if (this.FU == null)
    {
      paramInt = a.g.wallet_progress_bar;
      this.FU = View.inflate(this.mContext, paramInt, null);
      this.tlx = ((TextView)this.FU.findViewById(a.f.mm_progress_dialog_msg));
      this.gFh = ((ProgressBar)this.FU.findViewById(a.f.mm_progress_dialog_icon));
      setCanceledOnTouchOutside(true);
    }
  }
  
  public static Dialog a(Context paramContext, CharSequence paramCharSequence, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    paramContext = new g(paramContext, a.j.mmalertdialog);
    paramContext.setMessage(paramCharSequence);
    paramContext.setCancelable(true);
    paramContext.setOnCancelListener(paramOnCancelListener);
    paramContext.setCanceledOnTouchOutside(false);
    paramContext.show();
    return paramContext;
  }
  
  public static Dialog a(Context paramContext, boolean paramBoolean, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    View localView = View.inflate(paramContext, a.g.wallet_progress_dialog_view, null);
    paramContext = new i(paramContext, a.j.WalletProgressDialogStyle);
    paramContext.setCancelable(paramBoolean);
    paramContext.setContentView(localView);
    paramContext.setOnCancelListener(paramOnCancelListener);
    paramContext.show();
    return paramContext;
  }
  
  public static Dialog b(Context paramContext, boolean paramBoolean, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    paramContext.getString(a.i.app_empty_string);
    return h.a(paramContext, paramContext.getString(a.i.wallet_pay_loading), paramBoolean, paramOnCancelListener);
  }
  
  public static Dialog e(Context paramContext, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    View localView = View.inflate(paramContext, a.g.wallet_progress_dialog_view, null);
    paramContext = new i(paramContext, a.j.WalletProgressDialogStyle);
    paramContext.setCancelable(true);
    paramContext.setContentView(localView);
    paramContext.setCanceledOnTouchOutside(false);
    paramContext.setOnCancelListener(paramOnCancelListener);
    paramContext.show();
    return paramContext;
  }
  
  public static Dialog e(Context paramContext, String paramString, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    View localView = View.inflate(paramContext, a.g.wallet_progress_dialog_view, null);
    ((TextView)localView.findViewById(a.f.dialog_title)).setText(paramString);
    paramContext = new i(paramContext, a.j.WalletProgressDialogStyle);
    paramContext.setCancelable(false);
    paramContext.setContentView(localView);
    paramContext.setOnCancelListener(paramOnCancelListener);
    paramContext.show();
    return paramContext;
  }
  
  public final void dismiss()
  {
    try
    {
      super.dismiss();
      return;
    }
    catch (Exception localException)
    {
      x.e("MicroMsg.WalletProgressDialog", "dismiss exception, e = " + localException.getMessage());
    }
  }
  
  protected final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(this.FU, new LinearLayout.LayoutParams(-1, -1));
    paramBundle = getWindow().getAttributes();
    paramBundle.width = -2;
    paramBundle.height = -2;
    getWindow().addFlags(2);
    paramBundle.dimAmount = 0.65F;
    onWindowAttributesChanged(paramBundle);
  }
  
  public final void setCancelable(boolean paramBoolean)
  {
    super.setCancelable(paramBoolean);
    setCanceledOnTouchOutside(paramBoolean);
  }
  
  public final void setMessage(CharSequence paramCharSequence)
  {
    this.tlx.setText(paramCharSequence);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/wallet_core/ui/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */