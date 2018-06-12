package com.tencent.mm.ui.contact;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.ak.a.a;
import com.tencent.mm.ak.a.a.c;
import com.tencent.mm.ak.a.a.c.a;
import com.tencent.mm.ak.o;
import com.tencent.mm.kernel.e;
import com.tencent.mm.openim.a.b;
import com.tencent.mm.openim.a.b.a;
import com.tencent.mm.ui.base.MaskLayout;

public final class v
  extends LinearLayout
{
  private Context context;
  private String uld;
  
  public v(Context paramContext, String paramString)
  {
    super(paramContext);
    this.context = paramContext;
    this.uld = paramString;
    paramContext = View.inflate(getContext(), R.i.openim_item_in_addressui_header, this);
    paramString = findViewById(R.h.enterprise_biz_item_ll);
    paramContext.setOnClickListener(new v.1(this));
    paramString.setOnTouchListener(new v.2(this));
    paramString = (MaskLayout)paramString.findViewById(R.h.biz_contact_entrance_avatar_iv);
    paramContext = ((b)com.tencent.mm.kernel.g.l(b.class)).h(this.uld, "openim_acct_type_icon", b.a.euj);
    if (paramContext != null)
    {
      paramString = (ImageView)paramString.getContentView();
      Object localObject = new c.a();
      ((c.a)localObject).dXy = true;
      StringBuilder localStringBuilder = new StringBuilder();
      com.tencent.mm.kernel.g.Ek();
      ((c.a)localObject).dXA = (com.tencent.mm.kernel.g.Ei().dqp + "openim/" + com.tencent.mm.a.g.u(paramContext.getBytes()));
      localObject = ((c.a)localObject).Pt();
      o.Pj().a(paramContext, paramString, (c)localObject, null, null);
    }
    paramContext = ((b)com.tencent.mm.kernel.g.l(b.class)).h(this.uld, "openim_acct_type_title", b.a.eui);
    ((TextView)findViewById(R.h.enterprise_biz_title)).setText(paramContext);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ui/contact/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */