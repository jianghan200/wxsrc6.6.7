package com.tencent.mm.ae;

import android.database.Cursor;
import com.tencent.mm.g.c.am;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.ah;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ai;
import com.tencent.mm.storage.az;
import com.tencent.mm.storage.az.b;
import com.tencent.mm.storage.bd;

public final class e
  extends ah
{
  public final boolean gV(int paramInt)
  {
    return (paramInt != 0) && (paramInt < 604372991);
  }
  
  public final String getTag()
  {
    return "MicroMsg.ConversationDataTransfer";
  }
  
  public final void transfer(int paramInt)
  {
    x.d("MicroMsg.ConversationDataTransfer", "the previous version is %d", new Object[] { Integer.valueOf(paramInt) });
    Object localObject1;
    Object localObject2;
    Object localObject3;
    Object localObject4;
    if ((paramInt != 0) && (paramInt < 604372991))
    {
      com.tencent.mm.plugin.report.service.h.mEJ.e(336L, 14L, 1L);
      au.HU();
      localObject1 = c.FO();
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("select rconversation.username from rconversation, rcontact, bizinfo where rconversation.username = rcontact.username and rconversation.username = bizinfo.username and ( rcontact.verifyFlag & 8").append(" ) != 0 ");
      localObject2 = ((StringBuilder)localObject2).toString();
      x.d("MicroMsg.ConversationDataTransfer", "select sql %s", new Object[] { localObject2 });
      localObject2 = ((com.tencent.mm.bt.h)localObject1).b((String)localObject2, null, 2);
      if ((localObject2 == null) || (!((Cursor)localObject2).moveToFirst())) {
        break label508;
      }
      localObject3 = new StringBuilder();
      ((StringBuilder)localObject3).append("Update rconversation set parentRef = 'officialaccounts' where 1 !=1 ");
      do
      {
        localObject4 = ((Cursor)localObject2).getString(0);
        if (!s.hM((String)localObject4)) {
          ((StringBuilder)localObject3).append(" or username = '").append((String)localObject4).append("'");
        }
      } while (((Cursor)localObject2).moveToNext());
      ((Cursor)localObject2).close();
      localObject3 = ((StringBuilder)localObject3).toString();
      x.d("MicroMsg.ConversationDataTransfer", "changed[%B] exec sql[%s]", new Object[] { Boolean.valueOf(true), localObject3 });
      ((com.tencent.mm.bt.h)localObject1).fV("rconversation", (String)localObject3);
      au.HU();
      localObject1 = c.FW().Yq("officialaccounts");
      if (localObject1 != null) {
        break label528;
      }
      localObject1 = new ai("officialaccounts");
      ((ai)localObject1).clx();
      au.HU();
      c.FW().d((ai)localObject1);
    }
    label508:
    label528:
    for (;;)
    {
      au.HU();
      localObject3 = c.FW().clI();
      if (bi.oW((String)localObject3)) {
        x.w("MicroMsg.ConversationDataTransfer", "last convBiz is null");
      }
      do
      {
        return;
        au.HU();
        localObject3 = c.FT().GE((String)localObject3);
        if ((localObject3 == null) || (((cm)localObject3).field_msgId == 0L))
        {
          x.w("MicroMsg.ConversationDataTransfer", "last biz msg is error");
          return;
        }
        ((ai)localObject1).aj((bd)localObject3);
        ((ai)localObject1).setContent(((cm)localObject3).field_talker + ":" + ((cm)localObject3).field_content);
        ((ai)localObject1).ec(Integer.toString(((bd)localObject3).getType()));
        au.HU();
        localObject4 = c.FW().vu();
        if (localObject4 != null)
        {
          PString localPString1 = new PString();
          PString localPString2 = new PString();
          PInt localPInt = new PInt();
          ((bd)localObject3).ep("officialaccounts");
          ((bd)localObject3).setContent(((am)localObject1).field_content);
          ((az.b)localObject4).a((bd)localObject3, localPString1, localPString2, localPInt, false);
          ((ai)localObject1).ed(localPString1.value);
          ((ai)localObject1).ee(localPString2.value);
          ((ai)localObject1).eY(localPInt.value);
        }
        au.HU();
        c.FW().a((ai)localObject1, ((am)localObject1).field_username);
      } while ((localObject2 == null) || (((Cursor)localObject2).isClosed()));
      ((Cursor)localObject2).close();
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/ae/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */