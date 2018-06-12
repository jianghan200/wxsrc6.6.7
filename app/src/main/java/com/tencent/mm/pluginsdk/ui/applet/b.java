package com.tencent.mm.pluginsdk.ui.applet;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.tencent.mm.R.g;
import com.tencent.mm.R.l;
import com.tencent.mm.aa.f.c;
import com.tencent.mm.aa.q;
import com.tencent.mm.ab.e;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;
import java.util.LinkedList;

public final class b
  implements f.c, a.a, o
{
  private String dlQ;
  ProgressDialog eEX;
  private int fdx;
  String gtX;
  ab ipd;
  Context mContext;
  private n qIh;
  com.tencent.mm.ui.widget.a.c qIi;
  e qIj = null;
  private boolean qIk = true;
  
  public b(Context paramContext, String paramString1, int paramInt, n paramn, String paramString2)
  {
    this(paramContext, paramString1, paramInt, paramn, true, paramString2);
  }
  
  public b(Context paramContext, String paramString1, int paramInt, n paramn, boolean paramBoolean, String paramString2)
  {
    this.mContext = paramContext;
    this.gtX = paramString1;
    this.fdx = paramInt;
    this.qIh = paramn;
    this.qIk = paramBoolean;
    this.dlQ = paramString2;
  }
  
  public b(Context paramContext, String paramString, n paramn)
  {
    this(paramContext, paramString, 0, paramn, true, "");
  }
  
  private void TD(String paramString)
  {
    x.i("MicroMsg.AddContactDialog", "searchContact %s", new Object[] { paramString });
    if (this.qIj == null) {
      this.qIj = new b.4(this);
    }
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.kernel.g.Eh().dpP.a(106, this.qIj);
    paramString = new com.tencent.mm.plugin.messenger.a.f(paramString);
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.kernel.g.Eh().dpP.a(paramString, 0);
  }
  
  final void O(ab paramab)
  {
    if (paramab == null)
    {
      x.e("MicroMsg.AddContactDialog", "showContact fail, contact is null");
      gW(-1);
    }
    do
    {
      return;
      String str = this.mContext.getString(R.l.wv_follow_brand_account);
      Object localObject2 = com.tencent.mm.aa.c.a(paramab.field_username, false, -1);
      if (localObject2 == null) {
        q.Kp().a(this);
      }
      Object localObject1 = localObject2;
      if (localObject2 != null)
      {
        localObject1 = localObject2;
        if (paramab.ckW()) {
          localObject1 = com.tencent.mm.sdk.platformtools.c.a((Bitmap)localObject2, false, ((Bitmap)localObject2).getWidth() / 2);
        }
      }
      localObject2 = paramab.field_nickname;
      this.qIi = null;
      if ((this.mContext instanceof MMActivity))
      {
        if (!this.qIk)
        {
          P(paramab);
          return;
        }
        s locals = ((MMActivity)this.mContext).mController;
        int i = R.l.contact_info_biz_add;
        paramab.ckW();
        this.qIi = g.a(locals, str, (Bitmap)localObject1, (String)localObject2, "", i, new b.2(this, paramab));
      }
    } while (this.qIi != null);
    x.e("MicroMsg.AddContactDialog", "showContact fail, cannot show dialog");
    gW(-1);
  }
  
  final void P(ab paramab)
  {
    if (this.eEX != null) {
      this.eEX.dismiss();
    }
    Object localObject = this.mContext;
    this.mContext.getString(R.l.app_tip);
    this.eEX = com.tencent.mm.ui.base.h.a((Context)localObject, this.mContext.getString(R.l.wv_following), true, null);
    localObject = new a(this.mContext, this);
    LinkedList localLinkedList = new LinkedList();
    localLinkedList.add(Integer.valueOf(this.fdx));
    ((a)localObject).a(paramab.field_username, localLinkedList, this.dlQ);
  }
  
  public final void a(boolean paramBoolean1, boolean paramBoolean2, String paramString1, String paramString2)
  {
    if (this.eEX != null) {
      this.eEX.dismiss();
    }
    if (paramBoolean1)
    {
      this.ipd.Bb();
      com.tencent.mm.kernel.g.Ek();
      ((i)com.tencent.mm.kernel.g.l(i.class)).FR().a(this.ipd.field_username, this.ipd);
      com.tencent.mm.ui.base.h.bA(this.mContext, this.mContext.getResources().getString(R.l.wv_has_follow));
      gW(1);
      return;
    }
    gW(-1);
  }
  
  final void gW(int paramInt)
  {
    if (this.qIh != null) {
      this.qIh.ky(paramInt);
    }
  }
  
  public final void jX(String paramString)
  {
    int j = 1;
    int i;
    if (this.ipd != null) {
      if ((this.ipd.field_username != null) && (this.ipd.field_username.equals(paramString)))
      {
        i = 1;
        if ((this.ipd.wM() == null) || (!this.ipd.wM().equals(paramString))) {
          break label73;
        }
        label59:
        if ((i != 0) || (j != 0)) {
          break label96;
        }
      }
    }
    label73:
    label96:
    while ((this.qIi == null) || (!this.qIi.isShowing())) {
      do
      {
        return;
        i = 0;
        break;
        j = 0;
        break label59;
      } while ((this.gtX == null) || (!this.gtX.equals(paramString)));
    }
    ah.A(new b.3(this));
  }
  
  public final void show()
  {
    com.tencent.mm.kernel.g.Ek();
    this.ipd = ((i)com.tencent.mm.kernel.g.l(i.class)).FR().Yg(this.gtX);
    if ((this.ipd != null) && ((int)this.ipd.dhP <= 0))
    {
      x.i("MicroMsg.AddContactDialog", "dealAddContact get by username fail, try alias, %s", new Object[] { this.gtX });
      com.tencent.mm.kernel.g.Ek();
      this.ipd = ((i)com.tencent.mm.kernel.g.l(i.class)).FR().Yd(this.gtX);
    }
    if ((this.ipd != null) && ((int)this.ipd.dhP > 0))
    {
      x.i("MicroMsg.AddContactDialog", "The contact already exists, so go to dealAddContact.");
      if (this.ipd == null)
      {
        x.e("MicroMsg.AddContactDialog", "dealAddContact fail, contact is null");
        gW(-1);
      }
    }
    while (this.mContext == null)
    {
      do
      {
        return;
        localObject = this.ipd.field_username;
        if (this.ipd.ckW()) {
          break;
        }
        if (((com.tencent.mm.api.h)com.tencent.mm.kernel.g.l(com.tencent.mm.api.h.class)).cB((String)localObject))
        {
          Context localContext = this.mContext;
          this.mContext.getString(R.l.app_tip);
          this.eEX = com.tencent.mm.ui.base.h.a(localContext, this.mContext.getString(R.l.wv_following), true, null);
          TD((String)localObject);
          return;
        }
        localObject = BitmapFactory.decodeResource(this.mContext.getResources(), R.g.confirm_dialog_failweb);
      } while ((!(this.mContext instanceof MMActivity)) || (g.a(((MMActivity)this.mContext).mController, (Bitmap)localObject, this.mContext.getResources().getString(R.l.wv_is_not_biz_contact), new b.5(this)) != null));
      x.e("MicroMsg.AddContactDialog", "dealAddContact fail, connot show dialog");
      gW(-1);
      return;
      if (com.tencent.mm.l.a.gd(this.ipd.field_type))
      {
        com.tencent.mm.ui.base.h.bA(this.mContext, this.mContext.getResources().getString(R.l.wv_has_follow));
        gW(-2);
        return;
      }
      O(this.ipd);
      return;
    }
    Object localObject = this.mContext;
    this.mContext.getString(R.l.app_tip);
    this.eEX = com.tencent.mm.ui.base.h.a((Context)localObject, this.mContext.getString(R.l.wv_following), true, new b.1(this));
    TD(this.gtX);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/pluginsdk/ui/applet/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */