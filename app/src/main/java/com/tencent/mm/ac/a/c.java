package com.tencent.mm.ac.a;

import com.tencent.mm.g.c.w;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class c
  extends w
{
  protected static c.a dhO;
  private Map<String, j> dNh = new HashMap();
  private List<String> dNi;
  
  static
  {
    c.a locala = new c.a();
    locala.sKy = new Field[14];
    locala.columns = new String[15];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "bizChatLocalId";
    locala.sKA.put("bizChatLocalId", "LONG PRIMARY KEY ");
    localStringBuilder.append(" bizChatLocalId LONG PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.sKz = "bizChatLocalId";
    locala.columns[1] = "bizChatServId";
    locala.sKA.put("bizChatServId", "TEXT");
    localStringBuilder.append(" bizChatServId TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "brandUserName";
    locala.sKA.put("brandUserName", "TEXT default '' ");
    localStringBuilder.append(" brandUserName TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[3] = "chatType";
    locala.sKA.put("chatType", "INTEGER");
    localStringBuilder.append(" chatType INTEGER");
    localStringBuilder.append(", ");
    locala.columns[4] = "headImageUrl";
    locala.sKA.put("headImageUrl", "TEXT");
    localStringBuilder.append(" headImageUrl TEXT");
    localStringBuilder.append(", ");
    locala.columns[5] = "chatName";
    locala.sKA.put("chatName", "TEXT default '' ");
    localStringBuilder.append(" chatName TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[6] = "chatNamePY";
    locala.sKA.put("chatNamePY", "TEXT default '' ");
    localStringBuilder.append(" chatNamePY TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[7] = "chatVersion";
    locala.sKA.put("chatVersion", "INTEGER default '-1' ");
    localStringBuilder.append(" chatVersion INTEGER default '-1' ");
    localStringBuilder.append(", ");
    locala.columns[8] = "needToUpdate";
    locala.sKA.put("needToUpdate", "INTEGER default 'true' ");
    localStringBuilder.append(" needToUpdate INTEGER default 'true' ");
    localStringBuilder.append(", ");
    locala.columns[9] = "bitFlag";
    locala.sKA.put("bitFlag", "INTEGER default '0' ");
    localStringBuilder.append(" bitFlag INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[10] = "maxMemberCnt";
    locala.sKA.put("maxMemberCnt", "INTEGER default '0' ");
    localStringBuilder.append(" maxMemberCnt INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[11] = "ownerUserId";
    locala.sKA.put("ownerUserId", "TEXT");
    localStringBuilder.append(" ownerUserId TEXT");
    localStringBuilder.append(", ");
    locala.columns[12] = "userList";
    locala.sKA.put("userList", "TEXT");
    localStringBuilder.append(" userList TEXT");
    localStringBuilder.append(", ");
    locala.columns[13] = "addMemberUrl";
    locala.sKA.put("addMemberUrl", "TEXT");
    localStringBuilder.append(" addMemberUrl TEXT");
    locala.columns[14] = "rowid";
    locala.sql = localStringBuilder.toString();
    dhO = locala;
  }
  
  protected final c.a AX()
  {
    return dhO;
  }
  
  public final List<String> Nn()
  {
    if (this.dNi != null) {
      return this.dNi;
    }
    String str = this.field_userList;
    if (bi.oW(str)) {
      return new LinkedList();
    }
    this.dNi = bi.F(str.split(";"));
    return this.dNi;
  }
  
  public final boolean No()
  {
    if (this.field_needToUpdate) {}
    while (((isGroup()) && (bi.oW(this.field_userList))) || ((bi.oW(this.field_chatNamePY)) && (!bi.oW(this.field_chatName)))) {
      return true;
    }
    return false;
  }
  
  public final String gT(String paramString)
  {
    paramString = kZ(paramString);
    if (paramString == null) {
      return "";
    }
    return bi.aG(paramString.field_userName, "");
  }
  
  public final boolean hu(int paramInt)
  {
    return (this.field_bitFlag & paramInt) != 0;
  }
  
  public final boolean isGroup()
  {
    if (this.field_bizChatServId == null) {
      return false;
    }
    return this.field_bizChatServId.endsWith("@qy_g");
  }
  
  public final j kZ(String paramString)
  {
    if ((!this.dNh.containsKey(paramString)) || (this.dNh.get(paramString) == null))
    {
      long l = System.currentTimeMillis();
      j localj = ((com.tencent.mm.api.g)com.tencent.mm.kernel.g.l(com.tencent.mm.api.g.class)).cz(paramString);
      if (localj != null) {
        this.dNh.put(localj.field_userId, localj);
      }
      x.d("MicroMsg.BaseBizChatInfo", "willen get userInfo use time:%s", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
    }
    if (this.dNh.containsKey(paramString)) {
      return (j)this.dNh.get(paramString);
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/ac/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */