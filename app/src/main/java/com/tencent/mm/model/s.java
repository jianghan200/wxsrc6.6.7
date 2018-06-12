package com.tencent.mm.model;

import android.database.Cursor;
import com.tencent.mm.g.c.am;
import com.tencent.mm.kernel.e;
import com.tencent.mm.l.a;
import com.tencent.mm.plugin.chatroom.b.b;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.a;
import com.tencent.mm.protocal.c.aue;
import com.tencent.mm.protocal.c.aut;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.bhz;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.az;
import com.tencent.mm.storage.bl;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;

public final class s
{
  private static ag dAM = null;
  public static final String dAN = c("rconversation.username", new String[] { "@chatroom", "@openim", "@micromsg.qq.com" });
  public static final String dAO = c("rconversation.username", new String[] { "@chatroom", "@micromsg.qq.com" });
  public static final String dAP = c("rconversation.username", new String[] { "@t.qq.com" });
  public static final String dAQ = c("rconversation.username", new String[] { "@qqim" });
  public static final String dAR = c("rconversation.username", new String[] { "@chatroom_exclusive" });
  public static final String dAS = c("rconversation.username", new String[] { "@micromsg.qq.com" });
  public static final String dAT = c("rconversation.username", new String[] { "@app" });
  public static final String dAU = c("rconversation.username", new String[] { "@chatroom" });
  public static final String[] dAV = { "qqmail", "fmessage", "tmessage", "qmessage", "qqsync", "floatbottle", "lbsapp", "shakeapp", "medianote", "qqfriend", "newsapp", "blogapp", "facebookapp", "topstoryapp", "masssendapp", "feedsapp", "voipapp", "cardpackage", "voicevoipapp", "voiceinputapp", "officialaccounts", "linkedinplugin", "notifymessage", "appbrandcustomerservicemsg" };
  
  public static int[] G(List<String> paramList)
  {
    long l = System.currentTimeMillis();
    int[] arrayOfInt1 = ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().dq(paramList);
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ContactStorageLogic", "kevin service(IMessengerStorage.class).getContactStg().getShowHeadDistinct(" + (System.currentTimeMillis() - l));
    if (arrayOfInt1.length <= 0) {
      return null;
    }
    l = System.currentTimeMillis();
    paramList = ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().dr(paramList);
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ContactStorageLogic", "kevin service(IMessengerStorage.class).getContactStg().getSectionNumByShowHead" + (System.currentTimeMillis() - l));
    if (paramList == null) {
      return null;
    }
    if (arrayOfInt1.length == paramList.length) {}
    int[] arrayOfInt2;
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      arrayOfInt2 = new int[paramList.length];
      int j = 0;
      int k = 0;
      int i = 0;
      while (j < arrayOfInt1.length)
      {
        arrayOfInt2[i] = k;
        k += paramList[j];
        j += 1;
        i += 1;
      }
    }
    return arrayOfInt2;
  }
  
  public static String[] H(List<String> paramList)
  {
    long l = System.currentTimeMillis();
    paramList = ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().dq(paramList);
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ContactStorageLogic", "kevin service(IMessengerStorage.class).getContactStg().getShowSectionByShowHead" + (System.currentTimeMillis() - l));
    if (paramList.length <= 0) {
      return null;
    }
    String[] arrayOfString = new String[paramList.length];
    int j = 0;
    int i = 0;
    if (j < paramList.length)
    {
      char c = (char)paramList[j];
      int k;
      if (c == '{')
      {
        k = i + 1;
        arrayOfString[i] = "#";
        i = k;
      }
      for (;;)
      {
        j += 1;
        break;
        if (c == ' ')
        {
          k = i + 1;
          arrayOfString[i] = "$";
          i = k;
        }
        else
        {
          k = i + 1;
          arrayOfString[i] = String.valueOf(c);
          i = k;
        }
      }
    }
    return arrayOfString;
  }
  
  public static List<String> Hp()
  {
    return ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().clj();
  }
  
  public static List<ab> Hq()
  {
    ArrayList localArrayList = new ArrayList();
    Cursor localCursor = ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().clk();
    if (localCursor.moveToFirst()) {
      do
      {
        ab localab = new ab();
        localab.d(localCursor);
        localArrayList.add(localab);
      } while (localCursor.moveToNext());
    }
    localCursor.close();
    return localArrayList;
  }
  
  public static boolean Hr()
  {
    return false;
  }
  
  public static boolean Hs()
  {
    if (!q.Hm()) {
      return false;
    }
    bl localbl = ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FZ().Hg("@t.qq.com");
    return (localbl != null) && (!bi.oW(localbl.name));
  }
  
  public static boolean Ht()
  {
    if (!q.Hm()) {
      return false;
    }
    bl localbl = ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FZ().Hg("@t.qq.com");
    return (localbl != null) && (bi.oV(localbl.name).length() != 0);
  }
  
  public static List<ab> Hu()
  {
    LinkedList localLinkedList = new LinkedList();
    Cursor localCursor = ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().cln();
    if (localCursor.getCount() == 0)
    {
      localCursor.close();
      return localLinkedList;
    }
    localCursor.moveToFirst();
    do
    {
      ab localab = new ab();
      localab.d(localCursor);
      localLinkedList.add(localab);
    } while (localCursor.moveToNext());
    localCursor.close();
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ContactStorageLogic", "getFavourList size:  " + localLinkedList.size());
    return localLinkedList;
  }
  
  public static List<String> Hv()
  {
    LinkedList localLinkedList = new LinkedList();
    Cursor localCursor = ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().cll();
    if (localCursor.getCount() == 0)
    {
      localCursor.close();
      return localLinkedList;
    }
    localCursor.moveToFirst();
    do
    {
      ab localab = new ab();
      localab.d(localCursor);
      localLinkedList.add(localab.field_username);
    } while (localCursor.moveToNext());
    localCursor.close();
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ContactStorageLogic", "getSnsBlackContactList size:  " + localLinkedList.size());
    return localLinkedList;
  }
  
  public static int Hw()
  {
    return ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().b(dAV, new String[] { q.GF(), "weixin", "helper_entry", "filehelper" });
  }
  
  public static String a(ab paramab, String paramString)
  {
    if (paramab == null) {}
    do
    {
      return paramString;
      if ((paramString.toLowerCase().endsWith("@chatroom")) && (bi.oW(paramab.field_nickname)))
      {
        String str = ((b)com.tencent.mm.kernel.g.l(b.class)).Ga().gT(paramString);
        if (!bi.oW(str)) {
          return str;
        }
      }
    } while ((paramab.BL() == null) || (paramab.BL().length() <= 0));
    return paramab.BL();
  }
  
  public static void a(ag paramag)
  {
    dAM = paramag;
  }
  
  public static boolean a(com.tencent.mm.storage.ai paramai)
  {
    String str = paramai.field_username;
    if (hO(str)) {}
    while ((hM(str)) || (hE(str)) || (hF(str)) || (paramai.field_conversationTime == -1L)) {
      return false;
    }
    return hf(str);
  }
  
  public static int[] a(String paramString1, String paramString2, List<String> paramList, String[] paramArrayOfString)
  {
    int[] arrayOfInt = ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().b(paramString1, paramString2, paramArrayOfString, paramList);
    if (arrayOfInt.length <= 0) {
      return null;
    }
    paramString1 = ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().c(paramString1, paramString2, paramArrayOfString, paramList);
    if (paramString1 == null) {
      return null;
    }
    if (arrayOfInt.length == paramString1.length) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      paramString2 = new int[paramString1.length];
      int j = 0;
      int k = 0;
      int i = 0;
      while (j < arrayOfInt.length)
      {
        paramString2[i] = k;
        k += paramString1[j];
        j += 1;
        i += 1;
      }
    }
    return paramString2;
  }
  
  public static String[] a(String paramString1, String paramString2, String paramString3, List<String> paramList)
  {
    long l = System.currentTimeMillis();
    paramString1 = ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().b(paramString1, paramString2, paramString3, paramList);
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ContactStorageLogic", "kevin service(IMessengerStorage.class).getContactStg().getShowSectionByShowHead" + (System.currentTimeMillis() - l));
    if (paramString1.length <= 0) {
      return null;
    }
    paramString2 = new String[paramString1.length];
    int j = 0;
    int i = 0;
    if (j < paramString1.length)
    {
      char c = (char)paramString1[j];
      int k;
      if (c == '{')
      {
        k = i + 1;
        paramString2[i] = "#";
        i = k;
      }
      for (;;)
      {
        j += 1;
        break;
        if (c == ' ')
        {
          k = i + 1;
          paramString2[i] = "$";
          i = k;
        }
        else
        {
          k = i + 1;
          paramString2[i] = String.valueOf(c);
          i = k;
        }
      }
    }
    return paramString2;
  }
  
  public static String[] a(String paramString1, String paramString2, String[] paramArrayOfString, List<String> paramList)
  {
    long l = System.currentTimeMillis();
    paramString1 = ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().b(paramString1, paramString2, paramArrayOfString, paramList);
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ContactStorageLogic", "kevin service(IMessengerStorage.class).getContactStg().getShowSectionByShowHead" + (System.currentTimeMillis() - l));
    if (paramString1.length <= 0) {
      return null;
    }
    paramString2 = new String[paramString1.length];
    int j = 0;
    int i = 0;
    if (j < paramString1.length)
    {
      char c = (char)paramString1[j];
      int k;
      if (c == '{')
      {
        k = i + 1;
        paramString2[i] = "#";
        i = k;
      }
      for (;;)
      {
        j += 1;
        break;
        if (c == ' ')
        {
          k = i + 1;
          paramString2[i] = "$";
          i = k;
        }
        else
        {
          k = i + 1;
          paramString2[i] = String.valueOf(c);
          i = k;
        }
      }
    }
    return paramString2;
  }
  
  public static void b(ab paramab, String paramString)
  {
    ab localab = ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().Yg(paramab.field_username);
    if ((localab != null) && (paramString != null)) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      localab.dv(paramString);
      if ((ab.XR(paramab.field_username)) && (dAM != null)) {
        dAM.Q(paramab.field_username, paramString);
      }
      t(localab);
      return;
    }
  }
  
  public static boolean b(com.tencent.mm.storage.ai paramai)
  {
    paramai = paramai.field_username;
    if (hE(paramai)) {}
    while (hN(paramai)) {
      return false;
    }
    return true;
  }
  
  public static int[] b(String paramString1, String paramString2, List<String> paramList, String paramString3)
  {
    long l = System.currentTimeMillis();
    int[] arrayOfInt = ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().b(paramString1, paramString2, paramString3, paramList);
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ContactStorageLogic", "kevin service(IMessengerStorage.class).getContactStg().getShowHeadDistinct(" + (System.currentTimeMillis() - l));
    if (arrayOfInt.length <= 0) {
      return null;
    }
    l = System.currentTimeMillis();
    paramString1 = ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().c(paramString1, paramString2, paramString3, paramList);
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ContactStorageLogic", "kevin service(IMessengerStorage.class).getContactStg().getSectionNumByShowHead" + (System.currentTimeMillis() - l));
    if (paramString1 == null) {
      return null;
    }
    if (arrayOfInt.length == paramString1.length) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      paramString2 = new int[paramString1.length];
      int j = 0;
      int k = 0;
      int i = 0;
      while (j < arrayOfInt.length)
      {
        paramString2[i] = k;
        k += paramString1[j];
        j += 1;
        i += 1;
      }
    }
    return paramString2;
  }
  
  private static String c(String paramString, String[] paramArrayOfString)
  {
    Object localObject2 = " and ( 1 != 1 ";
    int j = paramArrayOfString.length;
    int i = 0;
    if (i < j)
    {
      String str = paramArrayOfString[i];
      Object localObject1;
      if ("@all.android".equals(str)) {
        localObject1 = (String)localObject2 + " or 1 = 1";
      }
      for (;;)
      {
        i += 1;
        localObject2 = localObject1;
        break;
        if ("@micromsg.qq.com".equals(str))
        {
          localObject1 = (String)localObject2 + " or " + paramString + " not like '%@%'";
        }
        else if ("@chatroom".equals(str))
        {
          localObject1 = (String)localObject2 + " or " + paramString + " like '%@chatroom'";
        }
        else if ("@talkroom".equals(str))
        {
          localObject1 = (String)localObject2 + " or " + paramString + " like '%@talkroom'";
        }
        else if ("@t.qq.com".equals(str))
        {
          localObject1 = (String)localObject2 + " or " + paramString + " like '%@t.qq.com'";
        }
        else if ("@qqim".equals(str))
        {
          localObject1 = (String)localObject2 + " or " + paramString + " like '%@qqim'";
        }
        else if ("@chatroom_exclusive".equals(str))
        {
          localObject1 = (String)localObject2 + " or " + paramString + "not like %@chatroom";
        }
        else if ("@app".equals(str))
        {
          localObject1 = (String)localObject2 + " or " + paramString + " like '%@app'";
        }
        else
        {
          localObject1 = localObject2;
          if ("@openim".equals(str)) {
            localObject1 = (String)localObject2 + " or " + paramString + " like '%@openim'";
          }
        }
      }
    }
    return (String)localObject2 + " ) ";
  }
  
  public static boolean d(ab paramab)
  {
    if (paramab == null) {}
    while ((!bi.oV(paramab.field_username).endsWith("@chatroom")) || (!a.gd(paramab.field_type))) {
      return false;
    }
    return true;
  }
  
  public static void e(ab paramab)
  {
    boolean bool;
    ab localab2;
    if (paramab != null)
    {
      bool = true;
      Assert.assertTrue(bool);
      localab2 = ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().Yg(paramab.field_username);
      localab1 = paramab;
      if (localab2 != null) {
        if (!bi.oW(localab2.field_username)) {
          break label65;
        }
      }
    }
    label65:
    for (ab localab1 = paramab;; localab1 = localab2)
    {
      localab1.Bh();
      t(localab1);
      return;
      bool = false;
      break;
    }
  }
  
  public static void f(ab paramab)
  {
    boolean bool;
    ab localab2;
    if (paramab != null)
    {
      bool = true;
      Assert.assertTrue(bool);
      localab2 = ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().Yg(paramab.field_username);
      localab1 = paramab;
      if (localab2 != null) {
        if (!bi.oW(localab2.field_username)) {
          break label65;
        }
      }
    }
    label65:
    for (ab localab1 = paramab;; localab1 = localab2)
    {
      localab1.Bf();
      t(localab1);
      return;
      bool = false;
      break;
    }
  }
  
  public static boolean fq(String paramString)
  {
    if ((paramString == null) || (paramString.length() <= 0)) {
      return false;
    }
    return paramString.endsWith("@chatroom");
  }
  
  public static void g(ab paramab)
  {
    boolean bool;
    ab localab2;
    if (paramab != null)
    {
      bool = true;
      Assert.assertTrue(bool);
      localab2 = ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().Yg(paramab.field_username);
      localab1 = paramab;
      if (localab2 != null) {
        if (!bi.oW(localab2.field_username)) {
          break label65;
        }
      }
    }
    label65:
    for (ab localab1 = paramab;; localab1 = localab2)
    {
      localab1.Bg();
      t(localab1);
      return;
      bool = false;
      break;
    }
  }
  
  public static boolean gU(int paramInt)
  {
    return ab.Dk(paramInt);
  }
  
  public static boolean gW(String paramString)
  {
    if ((paramString == null) || (paramString.length() <= 0)) {}
    while ((paramString.contains("@")) && (!paramString.endsWith("@micromsg.qq.com"))) {
      return false;
    }
    return true;
  }
  
  public static boolean gX(String paramString)
  {
    if ((paramString == null) || (paramString.length() <= 0)) {
      return false;
    }
    return paramString.endsWith("@qy_u");
  }
  
  public static boolean gY(String paramString)
  {
    if ((paramString == null) || (paramString.length() <= 0)) {
      return false;
    }
    return paramString.endsWith("@bottle");
  }
  
  public static boolean gZ(String paramString)
  {
    if ((paramString == null) || (paramString.length() <= 0)) {
      return false;
    }
    return paramString.endsWith("@qqim");
  }
  
  public static void h(ab paramab)
  {
    if (paramab != null) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      ab localab2 = ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().Yg(paramab.field_username);
      ab localab1;
      if (localab2 != null)
      {
        localab1 = localab2;
        if (!bi.oW(localab2.field_username)) {}
      }
      else
      {
        localab1 = paramab;
      }
      localab1.Bd();
      if ((ab.XR(paramab.field_username)) && (dAM != null)) {
        dAM.iq(paramab.field_username);
      }
      t(localab1);
      return;
    }
  }
  
  public static boolean hA(String paramString)
  {
    if (paramString != null) {
      return paramString.equalsIgnoreCase("linkedinplugin");
    }
    return false;
  }
  
  public static boolean hB(String paramString)
  {
    return hC(paramString);
  }
  
  public static boolean hC(String paramString)
  {
    if (paramString != null) {
      return paramString.equalsIgnoreCase("gh_22b87fa7cb3c");
    }
    return false;
  }
  
  public static boolean hD(String paramString)
  {
    if (paramString != null) {
      return paramString.equalsIgnoreCase("blogapp");
    }
    return false;
  }
  
  public static boolean hE(String paramString)
  {
    if (paramString != null) {
      return paramString.equalsIgnoreCase("officialaccounts");
    }
    return false;
  }
  
  public static boolean hF(String paramString)
  {
    if (paramString != null) {
      return paramString.equalsIgnoreCase("helper_entry");
    }
    return false;
  }
  
  public static boolean hG(String paramString)
  {
    if (paramString != null) {
      return paramString.equalsIgnoreCase("qqfriend");
    }
    return false;
  }
  
  public static boolean hH(String paramString)
  {
    return "filehelper".equalsIgnoreCase(paramString);
  }
  
  public static boolean hI(String paramString)
  {
    if (paramString != null) {
      return paramString.equalsIgnoreCase("pc_share");
    }
    return false;
  }
  
  public static boolean hJ(String paramString)
  {
    if (paramString != null) {
      return paramString.equalsIgnoreCase("notifymessage");
    }
    return false;
  }
  
  public static boolean hK(String paramString)
  {
    if (paramString != null) {
      return paramString.equalsIgnoreCase("notification_messages");
    }
    return false;
  }
  
  public static boolean hL(String paramString)
  {
    if (hM(paramString)) {}
    while ((hO(paramString)) || (hE(paramString)) || (hF(paramString))) {
      return true;
    }
    return false;
  }
  
  public static boolean hM(String paramString)
  {
    com.tencent.mm.kernel.g.Ek();
    String str = (String)com.tencent.mm.kernel.g.Ei().DT().get(21, null);
    return ((str != null) && (str.equalsIgnoreCase(paramString))) || (paramString.equalsIgnoreCase("weixin"));
  }
  
  public static boolean hN(String paramString)
  {
    if (paramString != null) {
      return paramString.equalsIgnoreCase("appbrandcustomerservicemsg");
    }
    return false;
  }
  
  public static boolean hO(String paramString)
  {
    boolean bool2 = false;
    String[] arrayOfString = dAV;
    int j = arrayOfString.length;
    int i = 0;
    for (;;)
    {
      boolean bool1 = bool2;
      if (i < j)
      {
        if (arrayOfString[i].equalsIgnoreCase(paramString)) {
          bool1 = true;
        }
      }
      else {
        return bool1;
      }
      i += 1;
    }
  }
  
  public static boolean hP(String paramString)
  {
    if (hO(paramString)) {}
    while ((ab.XQ(paramString)) || (ab.XO(paramString)) || (ab.gY(paramString))) {
      return true;
    }
    return false;
  }
  
  public static int hQ(String paramString)
  {
    boolean bool;
    if (bi.oV(paramString).length() > 0)
    {
      bool = true;
      Assert.assertTrue(bool);
      paramString = paramString.trim().toLowerCase();
      if (!paramString.endsWith("@chatroom")) {
        break label40;
      }
    }
    label40:
    do
    {
      return 1;
      bool = false;
      break;
      if (ab.XO(paramString)) {
        return 11;
      }
      if (ab.XQ(paramString)) {
        return 36;
      }
    } while (!ab.gY(paramString));
    return 1;
  }
  
  public static int hR(String paramString)
  {
    if (bi.oV(paramString).length() > 0) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      paramString = paramString.trim().toLowerCase();
      if (!paramString.endsWith("@chatroom")) {
        break;
      }
      return 3;
    }
    if (ab.XO(paramString)) {
      return 13;
    }
    if (ab.XQ(paramString)) {
      return 39;
    }
    if (ab.gY(paramString)) {
      return 3;
    }
    if (paramString.contains("@")) {
      return 3;
    }
    return 3;
  }
  
  public static boolean hS(String paramString)
  {
    return ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().Yg(paramString).csI == 1;
  }
  
  public static boolean hT(String paramString)
  {
    paramString = ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().Yg(paramString);
    return (paramString != null) && (paramString.BD());
  }
  
  public static boolean hU(String paramString)
  {
    if ((paramString == null) || (paramString.length() <= 0)) {}
    while ((!paramString.startsWith("t.qq.com/")) && (!paramString.startsWith("http://t.qq.com/"))) {
      return false;
    }
    return true;
  }
  
  public static String hV(String paramString)
  {
    if (hU(paramString)) {
      return paramString.replace("http://t.qq.com/", "").replace("t.qq.com/", "");
    }
    return "";
  }
  
  public static boolean hW(String paramString)
  {
    return (paramString.equals("weixinsrc")) || (paramString.equalsIgnoreCase("gh_6e99ff560306"));
  }
  
  public static boolean ha(String paramString)
  {
    if ((paramString == null) || (paramString.length() <= 0)) {
      return false;
    }
    return paramString.endsWith("@lbsroom");
  }
  
  public static boolean hb(String paramString)
  {
    return "gh_43f2581f6fd6".equals(paramString);
  }
  
  public static boolean hc(String paramString)
  {
    if ((paramString == null) || (paramString.length() <= 0)) {
      return false;
    }
    if (!paramString.endsWith("@chatroom")) {
      return false;
    }
    paramString = ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().Yg(paramString);
    return (paramString != null) && (a.gd(paramString.field_type));
  }
  
  public static boolean hd(String paramString)
  {
    if ((paramString == null) || (paramString.length() <= 0)) {
      return false;
    }
    return paramString.endsWith("@stranger");
  }
  
  public static boolean he(String paramString)
  {
    if ((paramString == null) || (paramString.length() <= 0)) {
      return true;
    }
    return a.gd(((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().Yg(paramString).field_type);
  }
  
  public static boolean hf(String paramString)
  {
    if (bi.oW(paramString)) {
      return false;
    }
    paramString = ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().Yg(paramString);
    if (paramString == null) {
      return false;
    }
    return ab.Dk(paramString.field_verifyFlag);
  }
  
  public static void hg(String paramString)
  {
    com.tencent.mm.storage.ai localai2 = ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FW().Yq(paramString);
    int i = 0;
    com.tencent.mm.storage.ai localai1 = localai2;
    if (localai2 == null)
    {
      localai1 = new com.tencent.mm.storage.ai();
      localai1.clx();
      i = 1;
      localai1.setUsername(paramString);
    }
    localai1.as(System.currentTimeMillis());
    if (i != 0)
    {
      ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FW().d(localai1);
      return;
    }
    ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FW().a(localai1, paramString);
  }
  
  public static void hh(String paramString)
  {
    if (bi.oW(paramString)) {}
    ab localab;
    do
    {
      return;
      localab = ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().Yg(paramString);
    } while (localab == null);
    localab.AZ();
    ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().a(paramString, localab);
  }
  
  public static boolean hi(String paramString)
  {
    if (paramString != null) {
      return paramString.equalsIgnoreCase("qqmail");
    }
    return false;
  }
  
  public static boolean hj(String paramString)
  {
    if (paramString != null) {
      return paramString.equalsIgnoreCase("fmessage");
    }
    return false;
  }
  
  public static boolean hk(String paramString)
  {
    if (paramString != null) {
      return paramString.equalsIgnoreCase("tmessage");
    }
    return false;
  }
  
  public static boolean hl(String paramString)
  {
    if (paramString != null) {
      return paramString.equalsIgnoreCase("floatbottle");
    }
    return false;
  }
  
  public static boolean hm(String paramString)
  {
    if (paramString != null) {
      return paramString.equalsIgnoreCase("qmessage");
    }
    return false;
  }
  
  public static boolean hn(String paramString)
  {
    if (paramString != null) {
      return paramString.equalsIgnoreCase("facebookapp");
    }
    return false;
  }
  
  public static boolean ho(String paramString)
  {
    if (paramString != null) {
      return paramString.equalsIgnoreCase("masssendapp");
    }
    return false;
  }
  
  public static boolean hp(String paramString)
  {
    if (paramString != null) {
      return paramString.equalsIgnoreCase("feedsapp");
    }
    return false;
  }
  
  public static boolean hq(String paramString)
  {
    return "qqsync".equalsIgnoreCase(paramString);
  }
  
  public static boolean hr(String paramString)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (paramString != null) {
      if (!paramString.equalsIgnoreCase("weixin"))
      {
        bool1 = bool2;
        if (!paramString.equalsIgnoreCase("gh_9639b5a92773")) {}
      }
      else
      {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public static boolean hs(String paramString)
  {
    if (paramString != null) {
      return paramString.equalsIgnoreCase("lbsapp");
    }
    return false;
  }
  
  public static boolean ht(String paramString)
  {
    if (paramString != null) {
      return paramString.equalsIgnoreCase("shakeapp");
    }
    return false;
  }
  
  public static boolean hu(String paramString)
  {
    if (paramString != null) {
      return paramString.equalsIgnoreCase("medianote");
    }
    return false;
  }
  
  public static boolean hv(String paramString)
  {
    if (paramString != null) {
      return paramString.equalsIgnoreCase("newsapp");
    }
    return false;
  }
  
  public static boolean hw(String paramString)
  {
    if (paramString != null) {
      return paramString.equalsIgnoreCase("topstoryapp");
    }
    return false;
  }
  
  public static boolean hx(String paramString)
  {
    if (paramString != null) {
      return paramString.equalsIgnoreCase("voipapp");
    }
    return false;
  }
  
  public static boolean hy(String paramString)
  {
    if (paramString != null) {
      return paramString.equalsIgnoreCase("voicevoipapp");
    }
    return false;
  }
  
  public static boolean hz(String paramString)
  {
    if (paramString != null) {
      return paramString.equalsIgnoreCase("voiceinputapp");
    }
    return false;
  }
  
  public static void i(ab paramab)
  {
    if (paramab != null) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      ab localab2 = ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().Yg(paramab.field_username);
      ab localab1;
      if (localab2 != null)
      {
        localab1 = localab2;
        if (!bi.oW(localab2.field_username)) {}
      }
      else
      {
        localab1 = paramab;
      }
      localab1.Be();
      if ((ab.XR(paramab.field_username)) && (dAM != null)) {
        dAM.ir(paramab.field_username);
      }
      t(localab1);
      paramab = ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FW().Yq(paramab.field_username);
      if ((paramab != null) && ("@blacklist".equals(paramab.field_parentRef))) {
        ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FW().d(new String[] { paramab.field_username }, "");
      }
      return;
    }
  }
  
  public static void j(ab paramab)
  {
    if (paramab != null) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      ab localab2 = ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().Yg(paramab.field_username);
      ab localab1;
      if (localab2 != null)
      {
        localab1 = localab2;
        if (!bi.oW(localab2.field_username)) {}
      }
      else
      {
        localab1 = paramab;
      }
      localab1.Bq();
      localab1.eD(paramab.AY());
      s(localab1);
      return;
    }
  }
  
  public static void k(ab paramab)
  {
    if (paramab != null) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      ab localab2 = ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().Yg(paramab.field_username);
      ab localab1;
      if (localab2 != null)
      {
        localab1 = localab2;
        if (!bi.oW(localab2.field_username)) {}
      }
      else
      {
        localab1 = paramab;
      }
      localab1.Br();
      localab1.eD(paramab.AY());
      s(localab1);
      return;
    }
  }
  
  public static void l(ab paramab)
  {
    if (paramab != null) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      ab localab2 = ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().Yg(paramab.field_username);
      ab localab1;
      if (localab2 != null)
      {
        localab1 = localab2;
        if (!bi.oW(localab2.field_username)) {}
      }
      else
      {
        localab1 = paramab;
      }
      localab1.Bm();
      localab1.eD(paramab.AY());
      if ((ab.XR(paramab.field_username)) && (dAM != null)) {
        dAM.is(paramab.field_username);
      }
      t(localab1);
      return;
    }
  }
  
  public static void m(ab paramab)
  {
    if (paramab != null) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      ab localab2 = ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().Yg(paramab.field_username);
      ab localab1;
      if (localab2 != null)
      {
        localab1 = localab2;
        if (!bi.oW(localab2.field_username)) {}
      }
      else
      {
        localab1 = paramab;
      }
      localab1.Bn();
      localab1.eD(paramab.AY());
      if ((ab.XR(paramab.field_username)) && (dAM != null)) {
        dAM.it(paramab.field_username);
      }
      t(localab1);
      return;
    }
  }
  
  public static void n(ab paramab)
  {
    if (paramab != null) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      ab localab2 = ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().Yg(paramab.field_username);
      ab localab1;
      if (localab2 != null)
      {
        localab1 = localab2;
        if (!bi.oW(localab2.field_username)) {}
      }
      else
      {
        localab1 = paramab;
      }
      localab1.Bo();
      if ((ab.XR(paramab.field_username)) && (dAM != null)) {
        dAM.iu(paramab.field_username);
      }
      t(localab1);
      return;
    }
  }
  
  public static void o(ab paramab)
  {
    if (paramab != null) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      ab localab2 = ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().Yg(paramab.field_username);
      ab localab1;
      if (localab2 != null)
      {
        localab1 = localab2;
        if (!bi.oW(localab2.field_username)) {}
      }
      else
      {
        localab1 = paramab;
      }
      localab1.Bp();
      if ((ab.XR(paramab.field_username)) && (dAM != null)) {
        dAM.iv(paramab.field_username);
      }
      t(localab1);
      return;
    }
  }
  
  public static void p(ab paramab)
  {
    boolean bool2 = true;
    if (paramab != null)
    {
      bool1 = true;
      Assert.assertTrue("MicroMsg.ContactStorageLogic: user is null", bool1);
      if ((int)paramab.dhP == 0) {
        break label85;
      }
      bool1 = true;
      label25:
      Assert.assertTrue("MicroMsg.ContactStorageLogic: contactId == 0", bool1);
      if (paramab.field_username.length() <= 0) {
        break label90;
      }
    }
    label85:
    label90:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      Assert.assertTrue("MicroMsg.ContactStorageLogic: username length <= 0", bool1);
      paramab.Bb();
      ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().a(paramab.field_username, paramab);
      return;
      bool1 = false;
      break;
      bool1 = false;
      break label25;
    }
  }
  
  public static void q(ab paramab)
  {
    boolean bool2 = true;
    if (paramab != null)
    {
      bool1 = true;
      Assert.assertTrue(bool1);
      if ((int)paramab.dhP == 0) {
        break label80;
      }
      bool1 = true;
      label22:
      Assert.assertTrue(bool1);
      if (paramab.field_username.length() <= 0) {
        break label85;
      }
    }
    label80:
    label85:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      Assert.assertTrue(bool1);
      paramab.Bb();
      ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().a(paramab.field_username, paramab);
      t(paramab);
      return;
      bool1 = false;
      break;
      bool1 = false;
      break label22;
    }
  }
  
  public static void r(ab paramab)
  {
    boolean bool2 = true;
    if (paramab != null)
    {
      bool1 = true;
      Assert.assertTrue(bool1);
      if ((int)paramab.dhP == 0) {
        break label56;
      }
      bool1 = true;
      label22:
      Assert.assertTrue(bool1);
      if (paramab.field_username.length() <= 0) {
        break label61;
      }
    }
    label56:
    label61:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      Assert.assertTrue(bool1);
      paramab.BI();
      t(paramab);
      return;
      bool1 = false;
      break;
      bool1 = false;
      break label22;
    }
  }
  
  private static void s(ab paramab)
  {
    boolean bool;
    aut localaut;
    if (paramab != null)
    {
      bool = true;
      Assert.assertTrue(bool);
      if ((int)paramab.dhP == 0)
      {
        ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().U(paramab);
        ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().Yg(paramab.field_username);
      }
      ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().a(paramab.field_username, paramab);
      localaut = new aut();
      localaut.rXy = paramab.field_username;
      if (!paramab.BF()) {
        break label147;
      }
    }
    label147:
    for (localaut.rXK = 1;; localaut.rXK = 2)
    {
      ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FQ().b(new h.a(52, localaut));
      return;
      bool = false;
      break;
    }
  }
  
  public static void s(String paramString, boolean paramBoolean)
  {
    paramString = ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().Yg(paramString);
    if ((paramString == null) || (bi.oW(paramString.field_username))) {
      return;
    }
    if (paramBoolean) {
      paramString.Bq();
    }
    for (;;)
    {
      s(paramString);
      return;
      paramString.Br();
    }
  }
  
  public static void t(ab paramab)
  {
    if (paramab != null) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      if ((int)paramab.dhP == 0)
      {
        ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().U(paramab);
        ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().Yg(paramab.field_username);
      }
      ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().a(paramab.field_username, paramab);
      if (!ab.XR(paramab.field_username)) {
        u(paramab);
      }
      return;
    }
  }
  
  public static void t(String paramString, boolean paramBoolean)
  {
    boolean bool;
    ab localab;
    if (!bi.oW(paramString))
    {
      bool = true;
      Assert.assertTrue(bool);
      localab = ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().Yg(paramString);
      if ((localab != null) && (!bi.oW(localab.field_username))) {
        break label53;
      }
    }
    label53:
    do
    {
      return;
      bool = false;
      break;
      localab.setType(localab.field_type | 0x800);
      if ((ab.XR(paramString)) && (dAM != null)) {
        dAM.io(paramString);
      }
      t(localab);
    } while (!paramBoolean);
    ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FW().Yv(paramString);
  }
  
  public static void u(ab paramab)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ContactStorageLogic", "oplog modContact user:%s remark:%s type:%d ", new Object[] { paramab.field_username, paramab.field_conRemark, Integer.valueOf(paramab.field_type) });
    aue localaue = new aue();
    localaue.rvi = new bhz().VO(bi.oV(paramab.field_username));
    localaue.rQz = new bhz().VO(bi.oV(paramab.field_nickname));
    localaue.ruT = new bhz().VO(bi.oV(paramab.wP()));
    localaue.ruU = new bhz().VO(bi.oV(paramab.wQ()));
    localaue.eJH = paramab.sex;
    localaue.ruj = 561023;
    localaue.ruk = paramab.field_type;
    localaue.rWH = new bhz().VO(bi.oV(paramab.field_conRemark));
    localaue.rWI = new bhz().VO(bi.oV(paramab.field_conRemarkPYShort));
    localaue.rWJ = new bhz().VO(bi.oV(paramab.field_conRemarkPYFull));
    localaue.rup = paramab.csF;
    localaue.rXd = new bhz().VO(bi.oV(paramab.field_domainList));
    localaue.rut = paramab.csI;
    localaue.eJL = paramab.csJ;
    localaue.eJK = bi.oV(paramab.signature);
    localaue.eJJ = bi.oV(paramab.getCityCode());
    localaue.eJI = bi.oV(paramab.cla());
    localaue.rTg = bi.oV(paramab.csO);
    localaue.rTi = paramab.field_weiboFlag;
    localaue.rWZ = 0;
    localaue.rcn = new bhy();
    localaue.eJQ = bi.oV(paramab.getCountryCode());
    ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FQ().b(new h.a(2, localaue));
  }
  
  public static void u(String paramString, boolean paramBoolean)
  {
    boolean bool;
    ab localab;
    if (!bi.oW(paramString))
    {
      bool = true;
      Assert.assertTrue(bool);
      localab = ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().Yg(paramString);
      if ((localab != null) && (!bi.oW(localab.field_username))) {
        break label53;
      }
    }
    label53:
    do
    {
      return;
      bool = false;
      break;
      localab.setType(localab.field_type & 0xF7FF);
      if ((ab.XR(paramString)) && (dAM != null)) {
        dAM.ip(paramString);
      }
      t(localab);
    } while (!paramBoolean);
    ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FW().Yw(paramString);
  }
  
  public static boolean v(ab paramab)
  {
    return (paramab.field_weiboFlag & 0x1) != 0;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/model/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */