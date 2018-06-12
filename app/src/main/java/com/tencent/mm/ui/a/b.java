package com.tencent.mm.ui.a;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class b
{
  private final String TAG = "MicroMsg.Accessibility.Tool";
  private List<String> tqT = new ArrayList();
  
  public final b ZU(String paramString)
  {
    this.tqT.add(paramString);
    return this;
  }
  
  public final void dl(View paramView)
  {
    if ((paramView != null) && (this.tqT.size() > 0))
    {
      Iterator localIterator = this.tqT.iterator();
      String str2;
      for (String str1 = ""; localIterator.hasNext(); str1 = str1 + str2 + ",") {
        str2 = (String)localIterator.next();
      }
      paramView.setContentDescription(str1);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/ui/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */