package com.tencent.mm.ui;

import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.model.q;
import com.tencent.mm.storage.aa.a;
import java.util.ArrayList;
import java.util.List;

public final class al
{
  public static List<String> cqV()
  {
    int i = q.GJ();
    ArrayList localArrayList = new ArrayList();
    if ((i & 0x8000) == 0)
    {
      localArrayList.add("floatbottle");
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.LauncherUI", "add bottle into show unread count blacklist.");
    }
    au.HU();
    if (!c.DT().getBoolean(aa.a.sUk, true))
    {
      localArrayList.add("notifymessage");
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.UnreadCountHelper", "add service notify message into show unread count blacklist.");
    }
    au.HU();
    if (!c.DT().getBoolean(aa.a.sUl, true))
    {
      localArrayList.add("appbrandcustomerservicemsg");
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.UnreadCountHelper", "add wxa custom session notify message into show unread count blacklist.");
    }
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.LauncherUI", "getShowUnreadCountBlacklist unread count blacklist(size : %s).", new Object[] { Integer.valueOf(localArrayList.size()) });
    return localArrayList;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/ui/al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */