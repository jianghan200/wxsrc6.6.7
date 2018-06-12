package com.tencent.mm.plugin.backup.bakoldlogic.d;

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

public final class d
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
    Object localObject = b.atl().atm().FR().Yg(parambd.field_talker);
    if ((localObject == null) || ((int)((com.tencent.mm.l.a)localObject).dhP == 0))
    {
      if (bi.oW(parambd.field_talker)) {
        break label134;
      }
      b.atl().atn().f(2, parambd.field_talker);
      b.atl().atm().FR().T(new ab(parambd.field_talker));
    }
    for (;;)
    {
      long l = b.atl().atm().FT().T(parambd);
      if (l < 0L) {
        x.e("MicroMsg.BakOldTempStorageLogic", "insertMsgWithContact faile: type:%d, talker:%s", new Object[] { Integer.valueOf(parambd.getType()), parambd.field_talker });
      }
      return l;
      label134:
      if (parambd.field_talker.endsWith("@chatroom"))
      {
        localObject = b.atl().atm();
        if (((c)localObject).uin == 0) {
          throw new com.tencent.mm.model.b();
        }
        if (((c)localObject).gYK.il(parambd.field_talker) == null) {
          b.atl().atn().f(2, parambd.field_talker);
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
    Iterator localIterator = paramHashMap.keySet().iterator();
    Object localObject;
    bd localbd;
    int j;
    String str;
    while (localIterator.hasNext())
    {
      localObject = (String)localIterator.next();
      localbd = b.atl().atm().FT().dG((String)localObject, " and not ( type = 10000 and isSend != 2 ) ");
      if (localbd != null)
      {
        j = ((Integer)paramHashMap.get(localObject)).intValue();
        str = localbd.field_talker;
        x.i("MicroMsg.BakOldTempStorageLogic", "talker:%s, addUnreadCount:%d", new Object[] { str, Integer.valueOf(j) });
        localObject = b.atl().atm().FW().Yq(str);
        if ((localObject != null) && (((am)localObject).field_conversationTime > localbd.field_createTime) && (((am)localObject).field_conversationTime != Long.MAX_VALUE))
        {
          x.i("MicroMsg.BakOldTempStorageLogic", "updateConvFromLastMsg ignore(maybe the system time is bigger than normal)");
        }
        else
        {
          if (localObject != null) {
            break label342;
          }
          x.i("MicroMsg.BakOldTempStorageLogic", "updateConvFromLastMsg conversation is null.");
          x.d("MicroMsg.BakOldTempStorageLogic", "updateConvFromLastMsg cvs:%s", new Object[] { str });
          localObject = new ai(str);
        }
      }
    }
    label342:
    for (int i = 1;; i = 0)
    {
      ((ai)localObject).eX(localbd.field_isSend);
      ((ai)localObject).eV(j + ((am)localObject).field_unReadCount);
      ((ai)localObject).aj(localbd);
      ((ai)localObject).ec(Integer.toString(localbd.getType()));
      ((ai)localObject).at(((am)localObject).field_flag & 0x4000000000000000 | localbd.field_createTime & 0xFFFFFFFFFFFFFF);
      ((ai)localObject).eU(0);
      if (i != 0)
      {
        x.d("MicroMsg.BakOldTempStorageLogic", "updateConvFromLastMsg cvs:%s, cvs.flag:%d", new Object[] { str, Long.valueOf(((am)localObject).field_flag) });
        b.atl().atm().FW().d((ai)localObject);
        break;
      }
      b.atl().atm().FW().a((ai)localObject, str);
      break;
      b.atl().atm().FW().clB();
      return;
    }
  }
  
  public static r wF(String paramString)
  {
    if (bi.oW(paramString)) {
      return null;
    }
    return b.atl().atm().Ta().nI(paramString);
  }
  
  public static String wG(String paramString)
  {
    Object localObject = b.atl().atm();
    if (((c)localObject).uin == 0) {
      throw new com.tencent.mm.model.b();
    }
    String str = h.b(((c)localObject).dqp + "voice2/", "msg_", paramString, ".amr", 2);
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
      c localc = b.atl().atm();
      if (localc.uin == 0) {
        throw new com.tencent.mm.model.b();
      }
      paramString = new StringBuilder().append(localc.dqp).append("voice/").toString() + paramString;
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


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/backup/bakoldlogic/d/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */