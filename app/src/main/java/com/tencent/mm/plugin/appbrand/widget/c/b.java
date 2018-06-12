package com.tencent.mm.plugin.appbrand.widget.c;

import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnShowListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.tencent.mm.ui.widget.a.c;
import com.tencent.mm.ui.y;

public class b
  extends c
  implements h
{
  private View contentView;
  private DialogInterface.OnCancelListener ePB;
  private DialogInterface.OnShowListener gFL;
  private DialogInterface.OnDismissListener gFM;
  private boolean gFN;
  private i gFO;
  
  public b(Context paramContext)
  {
    super(paramContext);
    setContentView(super.getContentView());
  }
  
  public b(Context paramContext, byte paramByte)
  {
    super(paramContext);
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
  
  public void dismiss()
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
    if (this.contentView != null) {
      return this.contentView;
    }
    return super.getContentView();
  }
  
  public final void onCancel()
  {
    if (this.ePB != null) {
      this.ePB.onCancel(this);
    }
  }
  
  public void setCanceledOnTouchOutside(boolean paramBoolean)
  {
    super.setCanceledOnTouchOutside(paramBoolean);
    this.gFN = paramBoolean;
  }
  
  public void setContentView(int paramInt)
  {
    setContentView(y.gq(getContext()).inflate(paramInt, null));
  }
  
  public void setContentView(View paramView)
  {
    Object localObject = paramView;
    if (!(paramView instanceof a)) {
      localObject = new a(paramView.getContext(), paramView);
    }
    this.contentView = ((View)localObject);
  }
  
  public void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    if (paramLayoutParams != null) {
      paramView.setLayoutParams(paramLayoutParams);
    }
    setContentView(paramView);
  }
  
  public void setOnCancelListener(DialogInterface.OnCancelListener paramOnCancelListener)
  {
    super.setOnCancelListener(paramOnCancelListener);
    this.ePB = paramOnCancelListener;
  }
  
  public void setOnDismissListener(DialogInterface.OnDismissListener paramOnDismissListener)
  {
    super.setOnDismissListener(paramOnDismissListener);
    this.gFM = paramOnDismissListener;
  }
  
  public void setOnShowListener(DialogInterface.OnShowListener paramOnShowListener)
  {
    super.setOnShowListener(paramOnShowListener);
    this.gFL = paramOnShowListener;
  }
  
  public void show() {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/c/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */