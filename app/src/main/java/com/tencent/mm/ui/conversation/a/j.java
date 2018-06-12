package com.tencent.mm.ui.conversation.a;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.tencent.mm.model.bc;
import com.tencent.mm.model.bc.b;
import com.tencent.mm.pluginsdk.ui.b.b;

public final class j
  extends b
{
  LinearLayout usm = null;
  
  public j(Context paramContext)
  {
    super(paramContext);
    this.usm = new LinearLayout(paramContext);
    this.usm.setVisibility(8);
    bc.Ig().dBY = new j.1(this, paramContext);
    bc.Ig().dBY.Ij();
  }
  
  public final boolean anR()
  {
    return (this.usm != null) && (this.usm.getVisibility() == 0);
  }
  
  public final void destroy()
  {
    bc.Ig().dBY = null;
  }
  
  public final int getLayoutId()
  {
    return -1;
  }
  
  public final View getView()
  {
    return this.usm;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/ui/conversation/a/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */