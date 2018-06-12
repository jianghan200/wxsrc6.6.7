package com.tencent.mm.ui.conversation.a;

import android.content.Context;
import android.view.View;
import com.tencent.mm.R.h;
import com.tencent.mm.pluginsdk.ui.b.b;

public final class h
  extends b
{
  public h(Context paramContext)
  {
    super(paramContext);
    if (this.view != null) {
      this.view.findViewById(R.h.facebook_tips_content).setOnClickListener(new h.1(this));
    }
  }
  
  public final void destroy() {}
  
  public final int getLayoutId()
  {
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/ui/conversation/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */