package com.tencent.mm.storage;

import com.tencent.mm.g.c.ah;
import com.tencent.mm.i.a.a.a;
import com.tencent.mm.i.a.a.b;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.sdk.platformtools.x;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class u
  extends ah
{
  protected static c.a dhO;
  public Map<String, b> dNh = new HashMap();
  private a sOh = new a();
  public a sOi = this.sOh;
  private List<String> sOj = new LinkedList();
  
  static
  {
    c.a locala = new c.a();
    locala.sKy = new Field[18];
    locala.columns = new String[19];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "chatroomname";
    locala.sKA.put("chatroomname", "TEXT default ''  PRIMARY KEY ");
    localStringBuilder.append(" chatroomname TEXT default ''  PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.sKz = "chatroomname";
    locala.columns[1] = "addtime";
    locala.sKA.put("addtime", "LONG");
    localStringBuilder.append(" addtime LONG");
    localStringBuilder.append(", ");
    locala.columns[2] = "memberlist";
    locala.sKA.put("memberlist", "TEXT");
    localStringBuilder.append(" memberlist TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "displayname";
    locala.sKA.put("displayname", "TEXT");
    localStringBuilder.append(" displayname TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "chatroomnick";
    locala.sKA.put("chatroomnick", "TEXT");
    localStringBuilder.append(" chatroomnick TEXT");
    localStringBuilder.append(", ");
    locala.columns[5] = "roomflag";
    locala.sKA.put("roomflag", "INTEGER");
    localStringBuilder.append(" roomflag INTEGER");
    localStringBuilder.append(", ");
    locala.columns[6] = "roomowner";
    locala.sKA.put("roomowner", "TEXT");
    localStringBuilder.append(" roomowner TEXT");
    localStringBuilder.append(", ");
    locala.columns[7] = "roomdata";
    locala.sKA.put("roomdata", "BLOB");
    localStringBuilder.append(" roomdata BLOB");
    localStringBuilder.append(", ");
    locala.columns[8] = "isShowname";
    locala.sKA.put("isShowname", "INTEGER");
    localStringBuilder.append(" isShowname INTEGER");
    localStringBuilder.append(", ");
    locala.columns[9] = "selfDisplayName";
    locala.sKA.put("selfDisplayName", "TEXT");
    localStringBuilder.append(" selfDisplayName TEXT");
    localStringBuilder.append(", ");
    locala.columns[10] = "style";
    locala.sKA.put("style", "INTEGER");
    localStringBuilder.append(" style INTEGER");
    localStringBuilder.append(", ");
    locala.columns[11] = "chatroomdataflag";
    locala.sKA.put("chatroomdataflag", "INTEGER");
    localStringBuilder.append(" chatroomdataflag INTEGER");
    localStringBuilder.append(", ");
    locala.columns[12] = "modifytime";
    locala.sKA.put("modifytime", "LONG");
    localStringBuilder.append(" modifytime LONG");
    localStringBuilder.append(", ");
    locala.columns[13] = "chatroomnotice";
    locala.sKA.put("chatroomnotice", "TEXT");
    localStringBuilder.append(" chatroomnotice TEXT");
    localStringBuilder.append(", ");
    locala.columns[14] = "chatroomVersion";
    locala.sKA.put("chatroomVersion", "INTEGER");
    localStringBuilder.append(" chatroomVersion INTEGER");
    localStringBuilder.append(", ");
    locala.columns[15] = "chatroomnoticeEditor";
    locala.sKA.put("chatroomnoticeEditor", "TEXT");
    localStringBuilder.append(" chatroomnoticeEditor TEXT");
    localStringBuilder.append(", ");
    locala.columns[16] = "chatroomnoticePublishTime";
    locala.sKA.put("chatroomnoticePublishTime", "LONG");
    localStringBuilder.append(" chatroomnoticePublishTime LONG");
    localStringBuilder.append(", ");
    locala.columns[17] = "chatroomLocalVersion";
    locala.sKA.put("chatroomLocalVersion", "LONG");
    localStringBuilder.append(" chatroomLocalVersion LONG");
    locala.columns[18] = "rowid";
    locala.sql = localStringBuilder.toString();
    dhO = locala;
  }
  
  private static int MO(String paramString)
  {
    int i = 0;
    try
    {
      int j = bi.getInt(paramString, 0);
      i = j;
    }
    catch (Exception localException)
    {
      while (paramString == null) {}
      x.e("MicroMsg.ChatRoomMember", "parserInt error " + paramString);
    }
    return i;
    return 0;
  }
  
  private static a XL(String paramString)
  {
    a locala = new a();
    if (bi.oW(paramString)) {
      return locala;
    }
    int i = paramString.indexOf('<');
    String str1 = paramString;
    if (i > 0) {
      str1 = paramString.substring(i);
    }
    Map localMap = bl.z(str1, "RoomData");
    if (localMap == null)
    {
      x.e("MicroMsg.ChatRoomMember", "parse RoomData failed");
      return null;
    }
    i = 0;
    for (;;)
    {
      try
      {
        b localb = new b();
        if (i == 0)
        {
          str2 = ".RoomData.Member.$UserName";
          str1 = ".RoomData.Member.DisplayName";
          paramString = ".RoomData.Member.Flag";
          str2 = bi.aG((String)localMap.get(str2), "");
          if (!bi.oW(str2))
          {
            localb.userName = str2;
            localb.daA = bi.aG((String)localMap.get(str1), "");
            localb.daB = MO((String)localMap.get(paramString));
            locala.dav.add(localb);
            i += 1;
          }
        }
        else
        {
          if (i == 0) {
            break label344;
          }
          str2 = ".RoomData.Member" + i + ".$UserName";
          str1 = ".RoomData.Member" + i + ".DisplayName";
          paramString = ".RoomData.Member" + i + ".Flag";
          continue;
        }
        locala.type = MO((String)localMap.get(".RoomData.Type"));
        locala.status = MO((String)localMap.get(".RoomData.Status"));
        locala.daw = MO((String)localMap.get(".RoomData.MaxCount"));
        locala.dax = bi.aG((String)localMap.get(".RoomData.ExtInfo.Upgrader"), "");
        return locala;
      }
      catch (Exception paramString)
      {
        return locala;
      }
      label344:
      paramString = null;
      str1 = null;
      String str2 = null;
    }
  }
  
  public static List<String> XM(String paramString)
  {
    LinkedList localLinkedList = new LinkedList();
    if (bi.oW(paramString)) {
      return localLinkedList;
    }
    paramString = paramString.split(";");
    int i = 0;
    while (i < paramString.length)
    {
      localLinkedList.add(paramString[i]);
      i += 1;
    }
    return localLinkedList;
  }
  
  private void a(a parama)
  {
    if (this.field_roomdata == null) {
      parama = new a();
    }
    parama = parama.dav.iterator();
    while (parama.hasNext())
    {
      b localb = (b)parama.next();
      this.dNh.put(localb.userName, localb);
    }
  }
  
  public static boolean ckM()
  {
    return false;
  }
  
  protected final c.a AX()
  {
    return dhO;
  }
  
  public final List<String> Nn()
  {
    if ((this.sOj == null) || (this.sOj.size() == 0)) {
      this.sOj = XM(this.field_memberlist);
    }
    return this.sOj;
  }
  
  public final b XK(String paramString)
  {
    if (this.dNh.size() <= 0) {
      ckJ();
    }
    if (this.dNh.containsKey(paramString)) {
      return (b)this.dNh.get(paramString);
    }
    return null;
  }
  
  public final u a(String paramString, a parama, boolean paramBoolean)
  {
    this.field_modifytime = System.currentTimeMillis();
    Object localObject;
    if (!paramBoolean)
    {
      localObject = null;
      Iterator localIterator = parama.dav.iterator();
      if (localIterator.hasNext())
      {
        b localb = (b)localIterator.next();
        if ((localb.userName == null) || (!localb.userName.equals(paramString))) {
          break label214;
        }
        localObject = localb;
      }
    }
    label214:
    for (;;)
    {
      break;
      if (localObject != null)
      {
        this.field_selfDisplayName = ((b)localObject).daA;
        this.field_isShowname = (((b)localObject).daB & 0x1);
      }
      for (int i = ((b)localObject).daB;; i = 0)
      {
        x.d("MicroMsg.ChatRoomMember", "displayName[%s] roomFlag[%d] flag[%d]", new Object[] { this.field_selfDisplayName, Integer.valueOf(this.field_chatroomdataflag), Integer.valueOf(i) });
        parama.bWA = (i & 0x2 | parama.bWA & 0xFFFFFFFD);
        this.field_chatroomdataflag = parama.bWA;
        try
        {
          this.field_roomdata = parama.toByteArray();
          this.sOi = parama;
          a(parama);
          return this;
        }
        catch (Exception paramString)
        {
          for (;;)
          {
            x.e("MicroMsg.ChatRoomMember", "exception:%s", new Object[] { bi.i(paramString) });
          }
        }
      }
    }
  }
  
  public final boolean b(a parama)
  {
    return this.sOh.boi() == parama.boi();
  }
  
  public final void ckJ()
  {
    if (bi.bC(this.field_roomdata)) {
      return;
    }
    try
    {
      this.sOi = ((a)new a().aG(this.field_roomdata));
      a(this.sOi);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        this.sOi = new a();
      }
    }
  }
  
  public final int ckK()
  {
    if (b(this.sOi)) {
      ckJ();
    }
    return this.sOi.bUd;
  }
  
  public final boolean ckL()
  {
    if (b(this.sOi)) {
      ckJ();
    }
    return this.sOi.bUd < this.sOi.daz;
  }
  
  public final int ckN()
  {
    if (b(this.sOi)) {
      ckJ();
    }
    return this.sOi.type;
  }
  
  public final int ckO()
  {
    if (b(this.sOi)) {
      ckJ();
    }
    return this.sOi.daw;
  }
  
  public final boolean ckP()
  {
    return this.field_isShowname > 0;
  }
  
  public final a ckQ()
  {
    if (b(this.sOi)) {
      ckJ();
    }
    return this.sOi;
  }
  
  public final u da(List<String> paramList)
  {
    Object localObject2;
    if ((paramList == null) || (paramList.size() == 0))
    {
      localObject2 = "";
      this.field_memberlist = ((String)localObject2);
      return this;
    }
    Object localObject1 = "";
    int i = 0;
    for (;;)
    {
      localObject2 = localObject1;
      if (i >= paramList.size()) {
        break;
      }
      localObject2 = (String)localObject1 + (String)paramList.get(i);
      localObject1 = localObject2;
      if (i < paramList.size() - 1) {
        localObject1 = (String)localObject2 + ";";
      }
      i += 1;
    }
  }
  
  public final u fY(String paramString1, String paramString2)
  {
    return a(paramString1, XL(paramString2), false);
  }
  
  public final String gT(String paramString)
  {
    paramString = XK(paramString);
    if (paramString == null) {
      return "";
    }
    return bi.aG(paramString.daA, "");
  }
  
  public final void ge(int paramInt)
  {
    this.field_chatroomdataflag = (this.sOi.bWA & 0xFFFFFFFD | paramInt & 0x2);
  }
  
  public final u ll(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (int i = 1;; i = 0)
    {
      this.field_isShowname = i;
      return this;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/storage/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */