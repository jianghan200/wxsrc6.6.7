package com.tencent.mm.m;

import com.tencent.mm.g.c.am;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public class a
  extends am
{
  public static c.a dhO;
  public static final String dhR = null;
  
  static
  {
    c.a locala = new c.a();
    locala.sKy = new Field[25];
    locala.columns = new String[26];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "msgCount";
    locala.sKA.put("msgCount", "INTEGER default '0' ");
    localStringBuilder.append(" msgCount INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[1] = "username";
    locala.sKA.put("username", "TEXT default ''  PRIMARY KEY ");
    localStringBuilder.append(" username TEXT default ''  PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.sKz = "username";
    locala.columns[2] = "unReadCount";
    locala.sKA.put("unReadCount", "INTEGER default '0' ");
    localStringBuilder.append(" unReadCount INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[3] = "chatmode";
    locala.sKA.put("chatmode", "INTEGER default '0' ");
    localStringBuilder.append(" chatmode INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[4] = "status";
    locala.sKA.put("status", "INTEGER default '0' ");
    localStringBuilder.append(" status INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[5] = "isSend";
    locala.sKA.put("isSend", "INTEGER default '0' ");
    localStringBuilder.append(" isSend INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[6] = "conversationTime";
    locala.sKA.put("conversationTime", "LONG default '0' ");
    localStringBuilder.append(" conversationTime LONG default '0' ");
    localStringBuilder.append(", ");
    locala.columns[7] = "content";
    locala.sKA.put("content", "TEXT default '' ");
    localStringBuilder.append(" content TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[8] = "msgType";
    locala.sKA.put("msgType", "TEXT default '' ");
    localStringBuilder.append(" msgType TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[9] = "customNotify";
    locala.sKA.put("customNotify", "TEXT default '' ");
    localStringBuilder.append(" customNotify TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[10] = "showTips";
    locala.sKA.put("showTips", "INTEGER default '0' ");
    localStringBuilder.append(" showTips INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[11] = "flag";
    locala.sKA.put("flag", "LONG default '0' ");
    localStringBuilder.append(" flag LONG default '0' ");
    localStringBuilder.append(", ");
    locala.columns[12] = "digest";
    locala.sKA.put("digest", "TEXT default '' ");
    localStringBuilder.append(" digest TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[13] = "digestUser";
    locala.sKA.put("digestUser", "TEXT default '' ");
    localStringBuilder.append(" digestUser TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[14] = "hasTrunc";
    locala.sKA.put("hasTrunc", "INTEGER default '0' ");
    localStringBuilder.append(" hasTrunc INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[15] = "parentRef";
    locala.sKA.put("parentRef", "TEXT");
    localStringBuilder.append(" parentRef TEXT");
    localStringBuilder.append(", ");
    locala.columns[16] = "attrflag";
    locala.sKA.put("attrflag", "INTEGER default '0' ");
    localStringBuilder.append(" attrflag INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[17] = "editingMsg";
    locala.sKA.put("editingMsg", "TEXT default '' ");
    localStringBuilder.append(" editingMsg TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[18] = "atCount";
    locala.sKA.put("atCount", "INTEGER default '0' ");
    localStringBuilder.append(" atCount INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[19] = "sightTime";
    locala.sKA.put("sightTime", "LONG default '0' ");
    localStringBuilder.append(" sightTime LONG default '0' ");
    localStringBuilder.append(", ");
    locala.columns[20] = "unReadMuteCount";
    locala.sKA.put("unReadMuteCount", "INTEGER default '0' ");
    localStringBuilder.append(" unReadMuteCount INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[21] = "lastSeq";
    locala.sKA.put("lastSeq", "LONG");
    localStringBuilder.append(" lastSeq LONG");
    localStringBuilder.append(", ");
    locala.columns[22] = "UnDeliverCount";
    locala.sKA.put("UnDeliverCount", "INTEGER");
    localStringBuilder.append(" UnDeliverCount INTEGER");
    localStringBuilder.append(", ");
    locala.columns[23] = "UnReadInvite";
    locala.sKA.put("UnReadInvite", "INTEGER");
    localStringBuilder.append(" UnReadInvite INTEGER");
    localStringBuilder.append(", ");
    locala.columns[24] = "firstUnDeliverSeq";
    locala.sKA.put("firstUnDeliverSeq", "LONG");
    localStringBuilder.append(" firstUnDeliverSeq LONG");
    locala.columns[25] = "rowid";
    locala.sql = localStringBuilder.toString();
    dhO = locala;
  }
  
  public a() {}
  
  public a(String paramString)
  {
    setUsername(paramString);
  }
  
  protected final c.a AX()
  {
    return dhO;
  }
  
  public final void gf(int paramInt)
  {
    eZ(this.field_attrflag | paramInt);
  }
  
  public final void gg(int paramInt)
  {
    eZ(this.field_attrflag & (paramInt ^ 0xFFFFFFFF));
  }
  
  public final boolean gh(int paramInt)
  {
    return (this.field_attrflag & paramInt) != 0;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/m/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */