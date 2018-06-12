package com.tencent.mm.ui.conversation.a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.pluginsdk.h.a.a;
import com.tencent.mm.ui.r;
import java.util.ArrayList;

public final class b
  extends r<c>
{
  private ArrayList<c> eWc = new ArrayList();
  a urM = null;
  
  public b(Context paramContext)
  {
    super(paramContext, null);
    WS();
  }
  
  public final c FV(int paramInt)
  {
    return (c)this.eWc.get(paramInt);
  }
  
  protected final void WS()
  {
    WT();
  }
  
  public final void WT()
  {
    this.eWc.clear();
    if (this.urM == null) {
      return;
    }
    c localc = new c(this.urM);
    this.eWc.add(localc);
    notifyDataSetChanged();
  }
  
  public final int getCount()
  {
    return this.eWc.size();
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    c localc = (c)this.eWc.get(paramInt);
    if (paramView == null)
    {
      paramView = View.inflate(this.context, R.i.adlist_item, null);
      paramViewGroup = new d();
      paramViewGroup.urO = paramView;
      paramViewGroup.urP = ((Button)paramView.findViewById(R.h.ad_close));
      paramView.setTag(paramViewGroup);
    }
    for (;;)
    {
      if (localc.a(paramViewGroup) != 0) {
        paramView = null;
      }
      return paramView;
      paramViewGroup = (d)paramView.getTag();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/ui/conversation/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */