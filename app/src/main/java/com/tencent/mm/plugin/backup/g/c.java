package com.tencent.mm.plugin.backup.g;

import com.tencent.mm.g.c.am;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.af;
import com.tencent.mm.modelvideo.r;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.h;
import com.tencent.mm.sdk.platformtools.j;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ai;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.az;
import com.tencent.mm.storage.bd;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public final class c
{
  public static boolean fq(String paramString)
  {
    if ((paramString == null) || (paramString.length() <= 0)) {
      return false;
    }
    return paramString.endsWith("@chatroom");
  }
  
  public static long i(bd parambd)
  {
    Object localObject = d.asG().asH().FR().Yg(parambd.field_talker);
    if ((localObject == null) || ((int)((com.tencent.mm.l.a)localObject).dhP == 0))
    {
      if (bi.oW(parambd.field_talker)) {
        break label134;
      }
      d.asG().asI().f(2, parambd.field_talker);
      d.asG().asH().FR().T(new ab(parambd.field_talker));
    }
    for (;;)
    {
      long l = d.asG().asH().FT().T(parambd);
      if (l < 0L) {
        x.e("MicroMsg.BackupStorageLogic", "insertMsgWithContact faile: type:%d, talker:%s", new Object[] { Integer.valueOf(parambd.getType()), parambd.field_talker });
      }
      return l;
      label134:
      if (parambd.field_talker.endsWith("@chatroom"))
      {
        localObject = d.asG().asH();
        if (((b)localObject).uin == 0) {
          throw new com.tencent.mm.model.b();
        }
        if (((b)localObject).gYK.il(parambd.field_talker) == null) {
          d.asG().asI().f(2, parambd.field_talker);
        }
      }
    }
  }
  
  public static int iA(String paramString)
  {
    if (paramString == null) {}
    int i;
    do
    {
      do
      {
        return -1;
      } while (paramString.length() <= 0);
      i = paramString.indexOf(':');
    } while ((i != -1) && (paramString.substring(0, i).contains("<")));
    return i;
  }
  
  public static void l(HashMap<String, Integer> paramHashMap)
  {
    x.i("MicroMsg.BackupStorageLogic", "buildConversation, unReadSum size[%d]", new Object[] { Integer.valueOf(paramHashMap.size()) });
    Iterator localIterator = paramHashMap.keySet().iterator();
    Object localObject;
    bd localbd;
    int i;
    String str;
    while (localIterator.hasNext())
    {
      localObject = (String)localIterator.next();
      localbd = d.asG().asH().FT().dG((String)localObject, " and not ( type = 10000 and isSend != 2 ) ");
      if (localbd != null)
      {
        i = ((Integer)paramHashMap.get(localObject)).intValue();
        str = localbd.field_talker;
        x.i("MicroMsg.BackupStorageLogic", "updateConvFromLastMsg, talker:%s, addUnreadCount:%d", new Object[] { str, Integer.valueOf(i) });
        localObject = d.asG().asH().FW().Yq(str);
        if ((localObject != null) && (((am)localObject).field_conversationTime > localbd.field_createTime) && (((am)localObject).field_conversationTime != Long.MAX_VALUE))
        {
          x.e("MicroMsg.BackupStorageLogic", "updateConvFromLastMsg ignore(maybe the system time is bigger than normal)");
        }
        else
        {
          if (localObject != null) {
            break label347;
          }
          localObject = new ai(str);
        }
      }
    }
    label347:
    for (boolean bool = true;; bool = false)
    {
      ((ai)localObject).eX(localbd.field_isSend);
      ((ai)localObject).eV(i + ((am)localObject).field_unReadCount);
      ((ai)localObject).aj(localbd);
      ((ai)localObject).ec(Integer.toString(localbd.getType()));
      ((ai)localObject).at(((am)localObject).field_flag & 0x4000000000000000 | localbd.field_createTime & 0xFFFFFFFFFFFFFF);
      ((ai)localObject).eU(0);
      x.i("MicroMsg.BackupStorageLogic", "updateConvFromLastMsg, isNewConv[%b], talker[%s], flag[%d]", new Object[] { Boolean.valueOf(bool), str, Long.valueOf(((am)localObject).field_flag) });
      if (bool)
      {
        d.asG().asH().FW().d((ai)localObject);
        break;
      }
      d.asG().asH().FW().a((ai)localObject, str);
      break;
      d.asG().asH().FW().clB();
      return;
    }
  }
  
  public static r wF(String paramString)
  {
    if (bi.oW(paramString)) {
      return null;
    }
    return d.asG().asH().Ta().nI(paramString);
  }
  
  public static String wG(String paramString)
  {
    Object localObject = d.asG().asH();
    if (((b)localObject).uin == 0) {
      throw new com.tencent.mm.model.b();
    }
    String str = h.b(((b)localObject).dqp + "voice2/", "msg_", paramString, ".amr", 2);
    if (bi.oW(str)) {
      localObject = null;
    }
    do
    {
      do
      {
        return (String)localObject;
        localObject = str;
      } while (new File(str).exists());
      localObject = new StringBuilder();
      b localb = d.asG().asH();
      if (localb.uin == 0) {
        throw new com.tencent.mm.model.b();
      }
      paramString = new StringBuilder().append(localb.dqp).append("voice/").toString() + paramString;
      if (new File(paramString + ".amr").exists())
      {
        j.q(paramString + ".amr", str, true);
        return str;
      }
      localObject = str;
    } while (!new File(paramString).exists());
    j.q(paramString, str, true);
    return str;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/backup/g/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */