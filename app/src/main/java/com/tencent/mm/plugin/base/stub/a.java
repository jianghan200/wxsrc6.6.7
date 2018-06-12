package com.tencent.mm.plugin.base.stub;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mm.R.l;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.game.a.a.a;
import com.tencent.mm.ui.base.h;

public final class a
  extends d
{
  public a(Context paramContext, String paramString1, String paramString2, d.a parama)
  {
    super(paramContext, paramString1, paramString2, parama);
  }
  
  protected final void Vl()
  {
    h.a(this.context, R.l.game_openid_checker_fail_msg, R.l.app_tip, false, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        paramAnonymousDialogInterface = a.a.aSm();
        if (paramAnonymousDialogInterface != null) {
          paramAnonymousDialogInterface.P(a.this.openId, q.GI(), a.this.appId);
        }
        a.this.hdE.dG(false);
      }
    });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/base/stub/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */