package com.tencent.mm.ae;

import com.tencent.mm.az.d;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.ah;
import com.tencent.mm.model.c;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.az;
import com.tencent.mm.storage.bd.a;
import com.tencent.mm.storage.bd.d;
import java.util.LinkedList;

public final class f
  extends ah
{
  public final boolean gV(int paramInt)
  {
    return (paramInt != 0) && (paramInt < 604307701);
  }
  
  public final String getTag()
  {
    return "MicroMsg.FMessageDataTransfer";
  }
  
  public final void transfer(int paramInt)
  {
    if ((paramInt != 0) && (paramInt < 604307701))
    {
      h.mEJ.e(336L, 11L, 1L);
      com.tencent.mm.model.au.HU();
      localObject1 = c.FT().bH("fmessage", 20);
      if (localObject1 == null) {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.FMessageDataTransfer", "transfer fail, msglist is empty");
      }
    }
    else
    {
      return;
    }
    d.SF();
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.FMessageDataTransfer", "transfer, msgList count = " + localObject1.length);
    int i = localObject1.length;
    paramInt = 0;
    if (paramInt < i)
    {
      Object localObject2 = localObject1[paramInt];
      if ((localObject2 == null) || (((cm)localObject2).field_msgId == 0L)) {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.FMessageDataTransfer", "transfer fail, msg is null, skip this msg");
      }
      Object localObject3;
      for (;;)
      {
        paramInt += 1;
        break;
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.FMessageDataTransfer", "transfer msg type = " + ((com.tencent.mm.storage.bd)localObject2).getType());
        localObject3 = ((cm)localObject2).field_content;
        if ((localObject3 == null) || (((String)localObject3).length() == 0)) {
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.FMessageDataTransfer", "transfer fail, content is null, skip this msg, id = " + ((cm)localObject2).field_msgId);
        } else {
          switch (((com.tencent.mm.storage.bd)localObject2).getType())
          {
          case 38: 
          case 39: 
          default: 
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FMessageDataTransfer", "no need to transfer, msgtype = " + ((com.tencent.mm.storage.bd)localObject2).getType());
            break;
          case 40: 
            com.tencent.mm.sdk.platformtools.x.d("MicroMsg.FMessageDataTransfer", "processFMessage, msg content = " + ((cm)localObject2).field_content);
            localObject3 = bd.a.YV(((cm)localObject2).field_content);
            localat = new at();
            localat.field_createTime = ((cm)localObject2).field_createTime;
            localat.field_isSend = 0;
            localat.field_msgContent = ((cm)localObject2).field_content;
            localat.field_svrId = ((cm)localObject2).field_msgSvrId;
            localat.field_talker = ((bd.a)localObject3).otZ;
            localat.field_type = 0;
            d.SE().b(localat);
            break;
          case 37: 
            com.tencent.mm.sdk.platformtools.x.d("MicroMsg.FMessageDataTransfer", "processVerifyMsg, msg content = " + ((cm)localObject2).field_content);
            localObject3 = bd.d.YY(((cm)localObject2).field_content);
            if ((ai.oW(((bd.d)localObject3).otZ)) || ((((bd.d)localObject3).scene != 18) && (!com.tencent.mm.model.bd.hd(((bd.d)localObject3).scene)))) {
              break label463;
            }
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FMessageDataTransfer", "processVerifyMsg, skip lbs & shake, scene = " + ((bd.d)localObject3).scene);
          }
        }
      }
      label463:
      at localat = new at();
      localat.field_createTime = ((cm)localObject2).field_createTime;
      localat.field_isSend = 0;
      localat.field_msgContent = ((cm)localObject2).field_content;
      localat.field_svrId = ((cm)localObject2).field_msgSvrId;
      localat.field_talker = ((bd.d)localObject3).otZ;
      switch (((bd.d)localObject3).bOh)
      {
      case 3: 
      case 4: 
      default: 
        localat.field_type = 1;
      }
      for (;;)
      {
        d.SE().b(localat);
        break;
        localat.field_type = 1;
        continue;
        localat.field_type = 2;
        continue;
        localat.field_type = 3;
      }
    }
    com.tencent.mm.model.au.HU();
    c.DT().set(143618, Integer.valueOf(0));
    d.SF().clO();
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.FMessageDataTransfer", "transfer, try to delete fmessage contact & conversation");
    com.tencent.mm.model.au.HU();
    c.FR().Ym("fmessage");
    Object localObject1 = new LinkedList();
    ((LinkedList)localObject1).add("fmessage");
    com.tencent.mm.model.au.HU();
    c.FW().as((LinkedList)localObject1);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ae/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */