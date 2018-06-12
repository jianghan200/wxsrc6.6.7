package com.tencent.mm.plugin.wear.model.f;

import android.graphics.Bitmap;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.wear.model.e.r;
import com.tencent.mm.plugin.wear.model.g;
import com.tencent.mm.plugin.wear.model.h;
import com.tencent.mm.protocal.c.cen;
import com.tencent.mm.sdk.platformtools.ac;
import com.tencent.mm.sdk.platformtools.bk;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.bd;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class j
  extends b
{
  private int bGz;
  private boolean bUB;
  private String talker;
  
  public j(String paramString, int paramInt, boolean paramBoolean)
  {
    this.talker = paramString;
    this.bGz = paramInt;
    this.bUB = paramBoolean;
  }
  
  private static String R(ArrayList<bd> paramArrayList)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    paramArrayList = paramArrayList.iterator();
    while (paramArrayList.hasNext())
    {
      bd localbd = (bd)paramArrayList.next();
      localStringBuffer.append(localbd.field_msgId);
      localStringBuffer.append(localbd.field_talker);
      localStringBuffer.append(localbd.field_content);
      localStringBuffer.append(localbd.getType());
      localStringBuffer.append(localbd.field_createTime);
    }
    return ac.ce(localStringBuffer.toString());
  }
  
  private static String i(String paramString, ArrayList<bd> paramArrayList)
  {
    x.d("MicroMsg.WearNotificationCreateTask", "Talker: %s, MsgSize: %d", new Object[] { paramString, Integer.valueOf(paramArrayList.size()) });
    StringBuffer localStringBuffer = new StringBuffer();
    int i = paramArrayList.size() - 1;
    while (i >= 0)
    {
      localStringBuffer.append(c(paramString, (bd)paramArrayList.get(i)));
      localStringBuffer.append("​​");
      i -= 1;
    }
    return localStringBuffer.toString().trim();
  }
  
  public final String getName()
  {
    return "WearNotificationCreateTask";
  }
  
  protected final void send()
  {
    x.d("MicroMsg.WearNotificationCreateTask", "start to execute notification create task");
    com.tencent.mm.plugin.wear.model.f localf = com.tencent.mm.plugin.wear.model.a.bSl().pIO.PK(this.talker);
    Object localObject1 = new ArrayList();
    int j = this.bGz - localf.pJw;
    int i = j;
    if (j < 0) {
      i = 0;
    }
    x.d("MicroMsg.WearNotificationCreateTask", "limit=%d", new Object[] { Integer.valueOf(i) });
    au.HU();
    Object localObject2 = c.FT().by(this.talker, i).iterator();
    label142:
    while (((Iterator)localObject2).hasNext())
    {
      bd localbd = (bd)((Iterator)localObject2).next();
      if (localbd.isSystem()) {}
      for (i = 0;; i = 1)
      {
        if (i == 0) {
          break label142;
        }
        ((ArrayList)localObject1).add(localbd);
        break;
      }
    }
    x.i("MicroMsg.WearNotificationCreateTask", "receiveUnreadMsgList.size=%d", new Object[] { Integer.valueOf(((ArrayList)localObject1).size()) });
    if (((ArrayList)localObject1).size() == 0) {
      return;
    }
    localObject2 = R((ArrayList)localObject1);
    if (localf.bKg.equals(localObject2))
    {
      x.i("MicroMsg.WearNotificationCreateTask", "same md5, not to update");
      return;
    }
    localf.bKg = ((String)localObject2);
    localObject2 = new cen();
    ((cen)localObject2).jTt = localf.id;
    ((cen)localObject2).szk = localf.talker;
    ((cen)localObject2).bHD = h.PP(localf.talker);
    ((cen)localObject2).jSA = i(localf.talker, (ArrayList)localObject1);
    ((cen)localObject2).szw = this.bGz;
    ((cen)localObject2).szy = this.bUB;
    boolean bool;
    if (!bk.cjj()) {
      bool = true;
    }
    for (;;)
    {
      ((cen)localObject2).szx = bool;
      localObject1 = h.PO(localf.talker);
      if (localObject1 != null) {
        ((cen)localObject2).szc = new com.tencent.mm.bk.b(h.N((Bitmap)localObject1));
      }
      x.d("MicroMsg.WearNotificationCreateTask", "generate notification content and ready to send");
      try
      {
        com.tencent.mm.plugin.wear.model.a.bSl();
        r.b(20003, ((cen)localObject2).toByteArray(), true);
        x.d("MicroMsg.WearNotificationCreateTask", "start to update notification status");
        com.tencent.mm.plugin.wear.model.a.bSl().pIO.a(localf);
        com.tencent.mm.plugin.wear.model.a.bSl().pIO.PN(this.talker);
        com.tencent.mm.plugin.wear.model.c.a.ee(6, 0);
        com.tencent.mm.plugin.wear.model.c.a.zC(1);
        return;
        bool = false;
      }
      catch (IOException localIOException)
      {
        for (;;) {}
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/wear/model/f/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */