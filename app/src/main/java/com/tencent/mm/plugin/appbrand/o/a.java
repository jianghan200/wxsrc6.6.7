package com.tencent.mm.plugin.appbrand.o;

import android.database.Cursor;
import com.tencent.mm.g.c.am;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ai;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.az;
import com.tencent.mm.storage.az.a;
import com.tencent.mm.storage.az.b;
import com.tencent.mm.storage.bd;
import java.util.Map;

public final class a
  implements az.a
{
  private static void a(ai paramai1, ai paramai2)
  {
    Object localObject2 = null;
    Object localObject3 = ((i)g.l(i.class)).FW().b(s.dAT, null, "appbrandcustomerservicemsg");
    Object localObject1;
    if (localObject3 != null) {
      if ((((Cursor)localObject3).getCount() > 0) && (((Cursor)localObject3).moveToFirst()))
      {
        localObject1 = new ai();
        ((ai)localObject1).d((Cursor)localObject3);
        ((Cursor)localObject3).close();
      }
    }
    for (;;)
    {
      PInt localPInt;
      if (localObject1 != null)
      {
        x.e("MicroMsg.AppBrandConversionExtension", "The lastest app brand conversation username is %s", new Object[] { ((am)localObject1).field_username });
        localObject1 = ((i)g.l(i.class)).bcY().GE(((am)localObject1).field_username);
        if ((localObject1 == null) || (((cm)localObject1).field_msgId <= 0L)) {
          break label454;
        }
        paramai2.aj((bd)localObject1);
        paramai2.setContent(((cm)localObject1).field_talker + ":" + ((cm)localObject1).field_content);
        paramai2.ec(Integer.toString(((bd)localObject1).getType()));
        az.b localb = ((i)g.l(i.class)).FW().vu();
        if (localb != null)
        {
          PString localPString = new PString();
          localObject3 = new PString();
          localPInt = new PInt();
          ((bd)localObject1).ep(paramai1.field_parentRef);
          ((bd)localObject1).setContent(paramai2.field_content);
          localb.a((bd)localObject1, localPString, (PString)localObject3, localPInt, true);
          int i = ((bd)localObject1).getType();
          localObject1 = ((cm)localObject1).field_content;
          paramai1 = (ai)localObject2;
          if (!bi.oW((String)localObject1)) {}
          switch (i)
          {
          default: 
            paramai1 = (ai)localObject2;
            label307:
            localObject1 = bi.oV(localPString.value);
            if (!bi.oW(paramai1)) {
              break;
            }
          }
        }
      }
      for (paramai1 = "";; paramai1 = " " + bi.oV(paramai1))
      {
        paramai2.ed(((String)localObject1).concat(paramai1));
        paramai2.ee(((PString)localObject3).value);
        paramai2.eY(localPInt.value);
        return;
        x.e("MicroMsg.AppBrandConversionExtension", "The lastest app brand conversation is null");
        localObject1 = ((i)g.l(i.class)).bcY().GE(paramai1.field_username);
        break;
        localObject1 = bl.z((String)localObject1, "msg");
        paramai1 = (ai)localObject2;
        if (localObject1 == null) {
          break label307;
        }
        paramai1 = (String)((Map)localObject1).get(".msg.appmsg.title");
        x.d("MicroMsg.AppBrandConversionExtension", "[oneliang][parseConversationMsgContentTitle] title:%s", new Object[] { paramai1 });
        break label307;
      }
      label454:
      x.e("MicroMsg.AppBrandConversionExtension", "the last of msg is null'");
      paramai2.clx();
      return;
      localObject1 = null;
      break;
      localObject1 = null;
    }
  }
  
  public final void a(ai paramai, az paramaz)
  {
    if ((paramai != null) && (!bi.oW(paramai.field_username)))
    {
      paramaz = paramai.field_username;
      ab localab = ((i)g.l(i.class)).FR().Yg(paramaz);
      if ((localab != null) && ((int)localab.dhP != 0)) {
        break label67;
      }
      x.e("MicroMsg.AppBrandConversionExtension", "contact is null or contactId is 0 for %s", new Object[] { paramaz });
    }
    label67:
    do
    {
      return;
      if ((ab.gr(paramaz)) && (!s.hr(paramaz)))
      {
        x.i("MicroMsg.AppBrandConversionExtension", "this conversation is a app brand contact!");
        paramai.ef("appbrandcustomerservicemsg");
        paramaz = ((i)g.l(i.class)).FW().Yq("appbrandcustomerservicemsg");
        if (paramaz == null)
        {
          x.i("MicroMsg.AppBrandConversionExtension", "create parentConv");
          paramaz = new ai("appbrandcustomerservicemsg");
          paramaz.clx();
          a(paramai, paramaz);
          ((i)g.l(i.class)).FW().d(paramaz);
          return;
        }
        x.i("MicroMsg.AppBrandConversionExtension", "appBrandSuperConv is created");
        paramaz.ef(null);
        a(paramai, paramaz);
        ((i)g.l(i.class)).FW().a(paramaz, "appbrandcustomerservicemsg");
        return;
      }
    } while (!s.hN(paramaz));
    x.i("MicroMsg.AppBrandConversionExtension", "appBrandSuperConv is created");
    paramai.ef(null);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/o/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */