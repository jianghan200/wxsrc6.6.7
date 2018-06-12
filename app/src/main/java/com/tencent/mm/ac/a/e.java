package com.tencent.mm.ac.a;

import com.tencent.mm.ac.z;
import com.tencent.mm.api.a;
import com.tencent.mm.g.c.am;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.protocal.c.hu;
import com.tencent.mm.protocal.c.xr;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ai;
import com.tencent.mm.storage.az;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class e
{
  public static String cqb = null;
  public static final Object dNr = new Object();
  
  public static void D(String paramString, boolean paramBoolean)
  {
    if (bi.oW(paramString))
    {
      x.d("MicroMsg.BizChatInfoStorageLogic", "delEnterpriseChatConvAndHeadImg, empty brandUserName");
      return;
    }
    x.d("MicroMsg.BizChatInfoStorageLogic", "deleteMsgByTalkers");
    com.tencent.mm.kernel.g.Em().H(new e.1(paramString, paramBoolean));
  }
  
  public static String Ir()
  {
    synchronized (dNr)
    {
      String str = cqb;
      return str;
    }
  }
  
  public static c a(c paramc, long paramLong)
  {
    if (paramc == null) {}
    for (long l = -1L;; l = paramc.field_bizChatLocalId)
    {
      x.w("MicroMsg.BizChatInfoStorageLogic", "protectBizChatNotExist bizChatId:%s BizChatInfo:%s ", new Object[] { Long.valueOf(paramLong), Long.valueOf(l) });
      c localc = paramc;
      if (paramc == null)
      {
        paramc = new c();
        paramc.field_bizChatLocalId = paramLong;
        z.Na().b(paramc);
        localc = z.Na().ak(paramLong);
      }
      return localc;
    }
  }
  
  public static j a(j paramj, String paramString)
  {
    if (paramj == null) {}
    for (Object localObject = Integer.valueOf(-1);; localObject = paramj.field_userId)
    {
      x.w("MicroMsg.BizChatInfoStorageLogic", "protectBizChatNotExist userId:%s BizChatUserInfo:%s ", new Object[] { paramString, localObject });
      localObject = paramj;
      if (paramj == null)
      {
        paramj = new j();
        paramj.field_userId = paramString;
        z.Nc().b(paramj);
        paramString = z.Nc().cz(paramString);
        localObject = paramString;
        if (paramString == null)
        {
          x.e("MicroMsg.BizChatInfoStorageLogic", "protectContactNotExist contact get from db is null!");
          localObject = paramj;
        }
      }
      return (j)localObject;
    }
  }
  
  public static boolean a(c paramc, String paramString1, String paramString2, xr paramxr)
  {
    if ((paramString1 != null) && (!bi.oW(paramc.field_brandUserName))) {}
    for (;;)
    {
      int i;
      try
      {
        paramString1 = new JSONArray(paramString1);
        if ((paramString1.length() == 1) && (bi.oW(paramString2)))
        {
          paramString2 = paramString1.getJSONObject(0);
          paramxr = paramString2.getString("id");
          paramString1 = z.Nc().cz(paramxr);
          if (paramString1 != null) {
            break label515;
          }
          paramString1 = new j();
          i = 1;
          paramString1.field_userId = paramxr;
          paramString1.field_userName = paramString2.getString("nick_name");
          paramString1.field_headImageUrl = paramString2.getString("head_img_url");
          paramString1.field_profileUrl = paramString2.getString("profile_url");
          paramString1.field_UserVersion = paramString2.getInt("ver");
          if ((paramString1.field_brandUserName == null) || (paramString1.field_brandUserName.length() == 0))
          {
            paramString1.field_brandUserName = paramc.field_brandUserName;
            i = 1;
          }
          if ((paramString1.field_addMemberUrl == null) || (paramString1.field_addMemberUrl.length() == 0))
          {
            paramString1.field_addMemberUrl = paramc.field_addMemberUrl;
            i = 1;
          }
          if (!z.Nc().b(paramString1)) {
            z.Nc().a(paramString1);
          }
          if (i != 0) {
            z.Ng().al(paramString1.field_userId, paramString1.field_brandUserName);
          }
          paramString2 = new c();
          paramString2.field_bizChatServId = paramString1.field_userId;
          paramString2.field_brandUserName = paramString1.field_brandUserName;
          paramString2.field_chatName = paramString1.field_userName;
          paramString2.field_chatType = 1;
          paramString2 = e(paramString2);
          if (paramString2 == null) {
            break label521;
          }
          paramc.field_bizChatLocalId = paramString2.field_bizChatLocalId;
          paramc.field_chatName = paramString1.field_userName;
          return true;
        }
        localLinkedList = new LinkedList();
        if (bi.oW(paramString2)) {
          break label523;
        }
        localObject = new hu();
        ((hu)localObject).riL = paramString2;
        localLinkedList.add(localObject);
      }
      catch (JSONException paramc)
      {
        LinkedList localLinkedList;
        Object localObject;
        x.i("MicroMsg.BizChatInfoStorageLogic", "parse memberJson Exception:%s", new Object[] { paramc.getMessage() });
        x.printErrStackTrace("MicroMsg.BizChatInfoStorageLogic", paramc, "", new Object[0]);
      }
      if (i < paramString1.length())
      {
        paramString2 = new j();
        localObject = paramString1.getJSONObject(i);
        paramString2.field_userId = ((JSONObject)localObject).getString("id");
        paramString2.field_userName = ((JSONObject)localObject).getString("nick_name");
        paramString2.field_brandUserName = paramc.field_brandUserName;
        paramString2.field_headImageUrl = ((JSONObject)localObject).getString("head_img_url");
        paramString2.field_profileUrl = ((JSONObject)localObject).getString("profile_url");
        paramString2.field_UserVersion = ((JSONObject)localObject).getInt("ver");
        paramString2.field_addMemberUrl = paramc.field_addMemberUrl;
        if (!z.Nc().b(paramString2)) {
          z.Nc().a(paramString2);
        }
        localObject = new hu();
        ((hu)localObject).riL = paramString2.field_userId;
        localLinkedList.add(localObject);
        i += 1;
      }
      else
      {
        paramxr.riM = localLinkedList;
        paramc.field_bizChatLocalId = -1L;
        return true;
        return false;
        label515:
        i = 0;
        continue;
        label521:
        return false;
        label523:
        i = 0;
      }
    }
  }
  
  public static int bj(long paramLong)
  {
    List localList = bk(paramLong);
    if (localList != null) {
      return localList.size();
    }
    x.w("MicroMsg.BizChatInfoStorageLogic", "getMembersCountByBizChatId list == null");
    return 0;
  }
  
  public static List<String> bk(long paramLong)
  {
    return z.Na().ak(paramLong).Nn();
  }
  
  public static String bl(long paramLong)
  {
    return z.Na().ak(paramLong).field_bizChatServId;
  }
  
  public static boolean c(c paramc)
  {
    if (paramc == null) {
      return false;
    }
    List localList = paramc.Nn();
    paramc = ((com.tencent.mm.api.g)com.tencent.mm.kernel.g.l(com.tencent.mm.api.g.class)).cA(paramc.field_brandUserName);
    if (paramc == null)
    {
      x.w("MicroMsg.BaseBizChatInfo", "bizchat myUserId is null");
      return false;
    }
    Iterator localIterator = localList.iterator();
    while (localIterator.hasNext()) {
      if (paramc.equals((String)localIterator.next())) {
        return true;
      }
    }
    x.w("MicroMsg.BaseBizChatInfo", "bizchat not in chatroom myUserId is %s", new Object[] { paramc });
    x.w("MicroMsg.BaseBizChatInfo", "bizchat not in chatroom memberlist is %s", new Object[] { Arrays.toString(localList.toArray()) });
    return false;
  }
  
  public static String cy(String paramString)
  {
    return a.cy(paramString);
  }
  
  public static String d(c paramc)
  {
    if (paramc == null)
    {
      x.w("MicroMsg.BizChatInfoStorageLogic", "getMsgSource bizChatInfo=%s");
      return null;
    }
    x.d("MicroMsg.BizChatInfoStorageLogic", "format msgSource");
    if (paramc.field_bizChatServId == null)
    {
      x.d("MicroMsg.BizChatInfoStorageLogic", "getMsgSource field_bizChatId=%s", new Object[] { paramc.field_bizChatServId });
      return null;
    }
    j localj = lf(paramc.field_brandUserName);
    if ((localj == null) || (localj.field_userId == null))
    {
      x.d("MicroMsg.BizChatInfoStorageLogic", " bizChatMyUserInfo.field_userId is null getMsgSource field_bizChatId=%s", new Object[] { paramc.field_bizChatServId });
      return null;
    }
    synchronized (dNr)
    {
      cqb = String.format("<msgsource><enterprise_info><qy_msg_type>%d</qy_msg_type><bizchat_id>%s</bizchat_id><bizchat_ver>%d</bizchat_ver><user_id>%s</user_id></enterprise_info></msgsource>", new Object[] { Integer.valueOf(1), paramc.field_bizChatServId, Integer.valueOf(paramc.field_chatVersion), localj.field_userId });
      x.d("MicroMsg.BizChatInfoStorageLogic", "send msgSource:%s", new Object[] { cqb });
      return cqb;
    }
  }
  
  public static c e(c paramc)
  {
    if (paramc.field_bizChatServId == null)
    {
      paramc = null;
      return paramc;
    }
    c localc2 = z.Na().la(paramc.field_bizChatServId);
    c localc1;
    if (localc2 != null)
    {
      if ((paramc.field_chatVersion <= localc2.field_chatVersion) && (!bi.oW(localc2.field_brandUserName))) {
        break label145;
      }
      if (!bi.oW(paramc.field_chatName)) {
        localc2.field_chatName = paramc.field_chatName;
      }
      localc2.field_brandUserName = paramc.field_brandUserName;
      localc2.field_needToUpdate = true;
      localc2.field_chatType = paramc.field_chatType;
      z.Na().b(localc2);
      localc1 = localc2;
    }
    for (;;)
    {
      paramc = localc1;
      if (!localc1.No()) {
        break;
      }
      if (!localc1.isGroup()) {
        break label150;
      }
      z.Ng().aj(localc1.field_bizChatServId, localc1.field_brandUserName);
      return localc1;
      paramc.field_needToUpdate = true;
      localc1 = paramc;
      if (!z.Na().a(paramc)) {
        label145:
        localc1 = localc2;
      }
    }
    label150:
    z.Ng().ak(localc1.field_bizChatServId, localc1.field_brandUserName);
    return localc1;
  }
  
  public static boolean f(c paramc)
  {
    x.d("MicroMsg.BizChatInfoStorageLogic", "updateBizChatMember");
    if (paramc == null)
    {
      x.w("MicroMsg.BizChatInfoStorageLogic", "updateBizChatMember: bizChatInfo == null");
      return false;
    }
    Object localObject = paramc.Nn();
    if (localObject == null)
    {
      x.w("MicroMsg.BizChatInfoStorageLogic", "updateBizChatMember: list == null");
      return false;
    }
    LinkedList localLinkedList = new LinkedList();
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      String str = (String)((Iterator)localObject).next();
      j localj = z.Nc().cz(str);
      if ((localj != null) && (localj.No())) {
        localLinkedList.add(str);
      }
    }
    if (localLinkedList.size() > 0)
    {
      z.Ng().b(localLinkedList, paramc.field_brandUserName);
      return true;
    }
    x.w("MicroMsg.BizChatInfoStorageLogic", "updateBizChatMember: no need to update");
    return false;
  }
  
  public static void g(c paramc)
  {
    if (paramc == null) {
      x.w("MicroMsg.BizChatInfoStorageLogic", "bizChatInfo is null");
    }
    boolean bool1;
    boolean bool2;
    do
    {
      return;
      bool1 = z.Nb().bg(paramc.field_bizChatLocalId);
      bool2 = paramc.hu(16);
      x.d("MicroMsg.BizChatInfoStorageLogic", "convPlaceTop: %s ,bizChatPlaceTop: %s, chatName: %s ", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2), paramc.field_chatName });
      if ((bool2) && (!bool1))
      {
        z.Nb().bh(paramc.field_bizChatLocalId);
        return;
      }
    } while ((bool2) || (!bool1));
    z.Nb().bi(paramc.field_bizChatLocalId);
  }
  
  public static void h(c paramc)
  {
    if (paramc == null) {
      x.w("MicroMsg.BizChatInfoStorageLogic", "updateBrandUserConvName bizChatInfo is null");
    }
    ai localai;
    Object localObject1;
    Object localObject2;
    do
    {
      int i;
      do
      {
        do
        {
          do
          {
            return;
            localai = ((i)com.tencent.mm.kernel.g.l(i.class)).FW().Yq(paramc.field_brandUserName);
            if (localai == null)
            {
              x.w("MicroMsg.BizChatInfoStorageLogic", "updateBrandUserConvName cvs is null");
              return;
            }
            localObject1 = ((i)com.tencent.mm.kernel.g.l(i.class)).bcY().GE(paramc.field_brandUserName);
            localObject2 = ((com.tencent.mm.ac.o)com.tencent.mm.kernel.g.l(com.tencent.mm.ac.o.class)).FU().aq(paramc.field_brandUserName, paramc.field_bizChatLocalId);
          } while ((localObject1 == null) || (localObject2 == null) || (((cm)localObject1).field_msgId != ((cm)localObject2).field_msgId));
          localObject2 = localai.field_digest;
        } while (localObject2 == null);
        i = ((String)localObject2).indexOf(":");
      } while (i == -1);
      localObject1 = ((String)localObject2).substring(0, i);
      localObject2 = ((String)localObject2).substring(i + 1);
    } while ((localObject1 == null) || (((String)localObject1).equals(paramc.field_chatName)));
    localai.ed(paramc.field_chatName + ":" + (String)localObject2);
    ((i)com.tencent.mm.kernel.g.l(i.class)).FW().a(localai, localai.field_username);
  }
  
  public static boolean lb(String paramString)
  {
    if (paramString == null) {}
    while ((!paramString.endsWith("@qy_u")) && (!paramString.endsWith("@qy_g"))) {
      return false;
    }
    return true;
  }
  
  public static boolean lc(String paramString)
  {
    if (paramString == null)
    {
      x.i("MicroMsg.BizChatInfoStorageLogic", "isGroupChat chatId == null");
      return false;
    }
    return paramString.endsWith("@qy_g");
  }
  
  public static String ld(String paramString)
  {
    if (paramString == null)
    {
      x.w("MicroMsg.BizChatInfoStorageLogic", "getUserName bizChatId == null");
      return null;
    }
    paramString = z.Nc().cz(paramString);
    if (paramString != null) {
      return paramString.field_userName;
    }
    x.i("MicroMsg.BizChatInfoStorageLogic", "getUserName userInfo == null");
    return null;
  }
  
  public static String le(String paramString)
  {
    paramString = z.Nc().cz(paramString);
    if (paramString != null) {
      return paramString.field_headImageUrl;
    }
    return null;
  }
  
  public static j lf(String paramString)
  {
    j localj = null;
    if (bi.oW(paramString))
    {
      x.w("MicroMsg.BizChatInfoStorageLogic", "getBizChatMyUserInfo brandUserName==null");
      paramString = localj;
    }
    do
    {
      return paramString;
      paramString = z.Nd().lk(paramString);
      if (paramString == null)
      {
        x.w("MicroMsg.BizChatInfoStorageLogic", "getBizChatMyUserInfo bizChatMyUserInfo==null");
        return null;
      }
      localj = z.Nc().cz(paramString.field_userId);
      paramString = localj;
    } while (localj != null);
    x.w("MicroMsg.BizChatInfoStorageLogic", "getBizChatMyUserInfo bizChatUserInfo==null");
    return localj;
  }
  
  public static String lg(String paramString)
  {
    if (paramString == null)
    {
      x.w("MicroMsg.BizChatInfoStorageLogic", "getFormatMsgSource msgSource==null");
      return null;
    }
    int i = paramString.indexOf("<enterprise_info>") + 17;
    int j = paramString.indexOf("</enterprise_info>");
    if ((i == -1) || (j == -1) || (i >= j))
    {
      x.w("MicroMsg.BizChatInfoStorageLogic", "getFormatMsgSource error start:%s,end:%s", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
      return null;
    }
    String str = paramString.substring(i, j);
    return paramString.replace(str, str.replace("<", "&lt;").replace(">", "&gt;"));
  }
  
  public static void lh(String paramString)
  {
    synchronized (dNr)
    {
      cqb = paramString;
      return;
    }
  }
  
  public static long li(String paramString)
  {
    if (bi.oW(paramString))
    {
      x.w("MicroMsg.BizChatInfoStorageLogic", "chatId == null");
      return -1L;
    }
    paramString = z.Na().la(paramString);
    if (paramString != null) {
      return paramString.field_bizChatLocalId;
    }
    x.w("MicroMsg.BizChatInfoStorageLogic", "bizChatInfo == null");
    return -1L;
  }
  
  public static String lj(String paramString)
  {
    String str = paramString;
    if (bi.oW(paramString)) {
      str = "tempUser";
    }
    paramString = new StringBuilder(com.tencent.mm.plugin.p.c.Gc());
    paramString.append(com.tencent.mm.a.g.u(str.getBytes())).append("/");
    paramString.append("user/");
    return paramString.toString();
  }
  
  public static void n(final String paramString1, String paramString2, final String paramString3)
  {
    x.i("MicroMsg.BizChatInfoStorageLogic", "qy_chat_update %s, %s, %s", new Object[] { paramString1, paramString2, paramString3 });
    com.tencent.mm.kernel.g.Em().H(new Runnable()
    {
      public final void run()
      {
        c localc = z.Na().la(this.dNv);
        if (localc == null) {
          return;
        }
        if (localc.field_chatVersion < bi.getInt(paramString3, Integer.MAX_VALUE))
        {
          localc.field_needToUpdate = true;
          z.Na().b(localc);
        }
        if (localc.isGroup())
        {
          z.Ng().aj(localc.field_bizChatServId, paramString1);
          return;
        }
        z.Ng().ak(localc.field_bizChatServId, paramString1);
      }
    });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/ac/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */