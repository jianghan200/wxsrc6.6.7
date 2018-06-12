package com.tencent.mm.ui.conversation.a;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.aa.c;
import com.tencent.mm.pluginsdk.ui.b.b;

public final class f
  extends b
{
  String usd = null;
  String use = null;
  
  public f(Context paramContext, String paramString1, String paramString2)
  {
    super(paramContext);
    this.usd = paramString1;
    this.use = paramString2;
    if (this.view != null)
    {
      paramContext = (ImageView)this.view.findViewById(R.h.chatting_banner_recom_icon);
      this.view.setOnClickListener(new f.1(this));
      paramContext.setImageBitmap(c.a(this.usd, true, -1));
    }
  }
  
  public final void destroy() {}
  
  public final int getLayoutId()
  {
    return R.i.chatting_recom_friends_banner;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/ui/conversation/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */