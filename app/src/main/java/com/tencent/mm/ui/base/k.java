package com.tencent.mm.ui.base;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ListView;
import com.tencent.mm.bp.a;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.w.a.g;
import com.tencent.mm.w.a.h;
import com.tencent.mm.w.a.l;

public final class k
  extends AlertDialog
{
  private ListView CU;
  public BaseAdapter hAv;
  private View hyK;
  private Context mContext;
  public AdapterView.OnItemClickListener qRL;
  private CharSequence sn;
  
  public k(Context paramContext)
  {
    super(paramContext, a.l.mmalertdialog);
    this.mContext = paramContext;
    if (a.fi(this.mContext)) {}
    for (this.hyK = View.inflate(this.mContext, a.h.mm_list_dialog_large, null);; this.hyK = View.inflate(this.mContext, a.h.mm_list_dialog, null))
    {
      this.CU = ((ListView)this.hyK.findViewById(a.g.list));
      return;
    }
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
      x.e("MicroMsg.MMListDialog", "dismiss exception, e = " + localException.getMessage());
    }
  }
  
  protected final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(this.hyK);
  }
  
  public final void setTitle(CharSequence paramCharSequence)
  {
    if (paramCharSequence != null)
    {
      this.sn = paramCharSequence;
      return;
    }
    this.sn = null;
  }
  
  public final void show()
  {
    if (this.sn != null) {
      this.sn.length();
    }
    if (this.qRL != null) {
      this.CU.setOnItemClickListener(this.qRL);
    }
    if (this.hAv != null) {
      this.CU.setAdapter(this.hAv);
    }
    super.show();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ui/base/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */