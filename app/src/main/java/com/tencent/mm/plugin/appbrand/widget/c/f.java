package com.tencent.mm.plugin.appbrand.widget.c;

import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnShowListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.tencent.mm.plugin.appbrand.s.k;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.y;

public final class f
  extends p
  implements h
{
  private View contentView;
  private DialogInterface.OnCancelListener ePB;
  private DialogInterface.OnShowListener gFL;
  private DialogInterface.OnDismissListener gFM;
  private boolean gFN;
  private i gFO;
  
  public f(Context paramContext)
  {
    super(paramContext, s.k.mmalertdialog, 0);
    try
    {
      onCreate(null);
      return;
    }
    catch (Exception paramContext) {}
  }
  
  public final void a(i parami)
  {
    if (this.gFL != null) {
      this.gFL.onShow(this);
    }
    this.gFO = parami;
  }
  
  public final boolean ape()
  {
    return this.gFN;
  }
  
  public final void dismiss()
  {
    if (this.gFO != null)
    {
      this.gFO.b(this);
      if (this.gFM != null) {
        this.gFM.onDismiss(this);
      }
    }
  }
  
  public final View getContentView()
  {
    return this.contentView;
  }
  
  public final void onCancel()
  {
    if (this.ePB != null) {
      this.ePB.onCancel(this);
    }
  }
  
  public final void setCanceledOnTouchOutside(boolean paramBoolean)
  {
    super.setCanceledOnTouchOutside(paramBoolean);
    this.gFN = paramBoolean;
  }
  
  public final void setContentView(int paramInt)
  {
    setContentView(y.gq(getContext()).inflate(paramInt, null));
  }
  
  public final void setContentView(View paramView)
  {
    this.contentView = paramView;
  }
  
  public final void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    if (paramLayoutParams != null) {
      paramView.setLayoutParams(paramLayoutParams);
    }
    setContentView(paramView);
  }
  
  public final void setOnCancelListener(DialogInterface.OnCancelListener paramOnCancelListener)
  {
    super.setOnCancelListener(paramOnCancelListener);
    this.ePB = paramOnCancelListener;
  }
  
  public final void setOnDismissListener(DialogInterface.OnDismissListener paramOnDismissListener)
  {
    super.setOnDismissListener(paramOnDismissListener);
    this.gFM = paramOnDismissListener;
  }
  
  public final void setOnShowListener(DialogInterface.OnShowListener paramOnShowListener)
  {
    super.setOnShowListener(paramOnShowListener);
    this.gFL = paramOnShowListener;
  }
  
  public final void show() {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/c/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */