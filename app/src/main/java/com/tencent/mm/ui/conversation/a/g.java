package com.tencent.mm.ui.conversation.a;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.model.au;
import com.tencent.mm.model.b.d;
import com.tencent.mm.model.c;
import com.tencent.mm.pluginsdk.ui.b.b;
import com.tencent.mm.sdk.platformtools.bi;

public final class g
  extends b
{
  boolean tGg = false;
  String usd = null;
  String use = null;
  
  public g(Context paramContext, String paramString1, String paramString2, boolean paramBoolean)
  {
    super(paramContext);
    this.usd = paramString1;
    this.use = paramString2;
    this.tGg = paramBoolean;
    if (this.view != null)
    {
      paramContext = (TextView)this.view.findViewById(R.h.chatting_security_banner_text);
      paramString1 = au.HU().Gu().X(this.usd, "wording");
      paramString2 = au.HU().Gu().X(this.use, "wording");
      if (bi.oW(paramString1)) {
        break label197;
      }
      paramContext.setText(paramString1);
    }
    for (;;)
    {
      paramContext = au.HU().Gu().X(this.usd, "linkname");
      paramString1 = au.HU().Gu().X(this.usd, "linksrc");
      paramString2 = (TextView)this.view.findViewById(R.h.chatting_security_banner_expose_text);
      if (!bi.oW(paramContext)) {
        paramString2.setText(paramContext);
      }
      paramString2.setOnClickListener(new g.1(this, paramString1));
      ((ImageView)this.view.findViewById(R.h.chatting_security_banner_delete)).setOnClickListener(new g.2(this));
      return;
      label197:
      if (!bi.oW(paramString2)) {
        paramContext.setText(paramString2);
      }
    }
  }
  
  public final void destroy() {}
  
  public final int getLayoutId()
  {
    return R.i.chatting_security_banner;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ui/conversation/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */