package com.tencent.mm.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.w.a.d;
import com.tencent.mm.w.a.g;
import com.tencent.mm.w.a.h;
import com.tencent.mm.w.a.l;

final class q
  extends Dialog
  implements DialogInterface
{
  private boolean eWV;
  private View gEZ;
  private TextView iDE;
  private Context mContext;
  Button pxh;
  private LinearLayout tlA;
  private LinearLayout tlw;
  TextView tlx;
  private TextView tly;
  LinearLayout tlz;
  
  public q(Context paramContext)
  {
    super(paramContext, a.l.mmalertdialog);
    this.mContext = paramContext;
    this.tlw = ((LinearLayout)y.gq(this.mContext).inflate(a.h.mm_alert_comfirm_lite_dependency, null));
    this.pxh = ((Button)this.tlw.findViewById(a.g.mm_alert_ok_btn));
    this.iDE = ((TextView)this.tlw.findViewById(a.g.mm_alert_title));
    this.tlx = ((TextView)this.tlw.findViewById(a.g.mm_alert_msg));
    this.tly = ((TextView)this.tlw.findViewById(a.g.mm_alert_msg_subtitle));
    this.gEZ = this.tlw.findViewById(a.g.mm_alert_title_area);
    this.tlz = ((LinearLayout)this.tlw.findViewById(a.g.mm_alert_msg_area));
    this.tlA = ((LinearLayout)this.tlw.findViewById(a.g.mm_alert_custom_area));
    setCanceledOnTouchOutside(true);
  }
  
  private void DK(int paramInt)
  {
    if (this.tlx != null) {
      this.tlx.setTextColor(this.tlx.getContext().getResources().getColor(paramInt));
    }
  }
  
  public final void cpX()
  {
    super.setCancelable(true);
  }
  
  public final void dismiss()
  {
    if (Looper.myLooper() != Looper.getMainLooper())
    {
      ah.A(new Runnable()
      {
        public final void run()
        {
          q.this.dismiss();
        }
      });
      x.e("MicroMsg.LiteDependDialog", bi.cjd().toString());
      return;
    }
    try
    {
      super.dismiss();
      return;
    }
    catch (Exception localException)
    {
      x.e("MicroMsg.LiteDependDialog", "dismiss exception, e = " + localException.getMessage());
    }
  }
  
  protected final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(this.tlw);
  }
  
  public final void setCancelable(boolean paramBoolean)
  {
    super.setCancelable(paramBoolean);
    this.eWV = paramBoolean;
    setCanceledOnTouchOutside(this.eWV);
  }
  
  public final void setTitle(int paramInt)
  {
    this.gEZ.setVisibility(0);
    this.iDE.setVisibility(0);
    this.iDE.setMaxLines(2);
    this.iDE.setText(paramInt);
    DK(a.d.dialog_msg_color);
  }
  
  public final void setTitle(CharSequence paramCharSequence)
  {
    this.gEZ.setVisibility(0);
    this.iDE.setVisibility(0);
    this.iDE.setMaxLines(2);
    this.iDE.setText(paramCharSequence);
    DK(a.d.dialog_msg_color);
  }
  
  public final void show()
  {
    try
    {
      super.show();
      return;
    }
    catch (Exception localException)
    {
      x.printErrStackTrace("MicroMsg.LiteDependDialog", localException, "", new Object[0]);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/ui/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */