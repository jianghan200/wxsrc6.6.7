package com.tencent.mm.plugin.ipcall.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.j;

public class IPCallAddressCountView
  extends FrameLayout
{
  private View ern;
  private TextView kui;
  
  private IPCallAddressCountView(Context paramContext)
  {
    super(paramContext);
    init();
  }
  
  public IPCallAddressCountView(Context paramContext, int paramInt)
  {
    this(paramContext);
    setAddressCount(paramInt);
  }
  
  public IPCallAddressCountView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }
  
  private void init()
  {
    inflate(getContext(), R.i.ip_call_address_count_view, this);
    this.ern = findViewById(R.h.contact_count_view_fl);
    this.kui = ((TextView)findViewById(R.h.contact_count_tv));
  }
  
  public void setAddressCount(int paramInt)
  {
    this.kui.setText(getContext().getResources().getQuantityString(R.j.address_contact_count, paramInt, new Object[] { Integer.valueOf(paramInt) }));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/ipcall/ui/IPCallAddressCountView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */