package com.tencent.mm.ui.contact;

import android.content.Context;
import android.content.Intent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.ac.m;
import com.tencent.mm.bg.d;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.l.a;
import com.tencent.mm.model.am.a;
import com.tencent.mm.model.am.c;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MaskLayout;
import com.tencent.mm.ui.base.MaskLayout.a;

public final class j
  extends LinearLayout
{
  private Context context;
  private String dKF;
  
  public j(Context paramContext, String paramString)
  {
    super(paramContext);
    this.context = paramContext;
    this.dKF = paramString;
    paramContext = View.inflate(getContext(), R.i.enterprise_biz_item_in_addressui_header, this);
    paramString = findViewById(R.h.enterprise_biz_item_ll);
    paramContext.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        Intent localIntent = new Intent();
        localIntent.putExtra("enterprise_from_scene", 2);
        localIntent.putExtra("enterprise_biz_name", j.a(j.this));
        d.b(paramAnonymousView.getContext(), "brandservice", ".ui.EnterpriseBizContactListUI", localIntent);
      }
    });
    paramString.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        if ((j.b(j.this) instanceof MMActivity)) {
          ((MMActivity)j.b(j.this)).YC();
        }
        return false;
      }
    });
    au.HU();
    paramContext = c.FR().Ye(this.dKF);
    if ((paramContext == null) || ((int)paramContext.dhP <= 0))
    {
      x.e("MicroMsg.EnterpriseBizViewItem", "contact is null, %s", new Object[] { this.dKF });
      return;
    }
    paramString = (MaskLayout)paramString.findViewById(R.h.biz_contact_entrance_avatar_iv);
    a.b.a((ImageView)paramString.getContentView(), this.dKF);
    if (paramContext.field_verifyFlag != 0) {
      if (am.a.dBt != null)
      {
        String str = am.a.dBt.gY(paramContext.field_verifyFlag);
        if (str != null) {
          paramString.f(m.kU(str), MaskLayout.a.tzk);
        }
      }
    }
    for (;;)
    {
      ((TextView)findViewById(R.h.enterprise_biz_title)).setText(paramContext.BK());
      return;
      paramString.setMaskBitmap(null);
      continue;
      paramString.setMaskBitmap(null);
      continue;
      paramString.setMaskBitmap(null);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/ui/contact/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */