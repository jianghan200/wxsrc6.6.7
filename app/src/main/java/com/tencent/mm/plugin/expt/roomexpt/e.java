package com.tencent.mm.plugin.expt.roomexpt;

import com.tencent.mm.g.c.dl;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class e
  extends dl
{
  protected static c.a dhO;
  
  static
  {
    c.a locala = new c.a();
    locala.sKy = new Field[10];
    locala.columns = new String[11];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "chatroom";
    locala.sKA.put("chatroom", "TEXT");
    localStringBuilder.append(" chatroom TEXT");
    localStringBuilder.append(", ");
    locala.columns[1] = "daySec";
    locala.sKA.put("daySec", "TEXT");
    localStringBuilder.append(" daySec TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "nickname";
    locala.sKA.put("nickname", "TEXT");
    localStringBuilder.append(" nickname TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "isMute";
    locala.sKA.put("isMute", "INTEGER");
    localStringBuilder.append(" isMute INTEGER");
    localStringBuilder.append(", ");
    locala.columns[4] = "unReadCount";
    locala.sKA.put("unReadCount", "INTEGER");
    localStringBuilder.append(" unReadCount INTEGER");
    localStringBuilder.append(", ");
    locala.columns[5] = "sendCount";
    locala.sKA.put("sendCount", "INTEGER");
    localStringBuilder.append(" sendCount INTEGER");
    localStringBuilder.append(", ");
    locala.columns[6] = "enterCount";
    locala.sKA.put("enterCount", "INTEGER");
    localStringBuilder.append(" enterCount INTEGER");
    localStringBuilder.append(", ");
    locala.columns[7] = "disRedDotCount";
    locala.sKA.put("disRedDotCount", "INTEGER");
    localStringBuilder.append(" disRedDotCount INTEGER");
    localStringBuilder.append(", ");
    locala.columns[8] = "stayTime";
    locala.sKA.put("stayTime", "LONG");
    localStringBuilder.append(" stayTime LONG");
    localStringBuilder.append(", ");
    locala.columns[9] = "score";
    locala.sKA.put("score", "FLOAT");
    localStringBuilder.append(" score FLOAT");
    locala.columns[10] = "rowid";
    locala.sql = localStringBuilder.toString();
    dhO = locala;
  }
  
  protected final c.a AX()
  {
    return dhO;
  }
  
  public final String toString()
  {
    return String.format("name[%s %s] daySec[%s] isMute[%d] unRead[%d] send[%d] enter[%d] disRedRod[%d] stayTime[%d] score[%f] systemRowid[%d]", new Object[] { this.field_chatroom, this.field_nickname, this.field_daySec, Integer.valueOf(this.field_isMute), Integer.valueOf(this.field_unReadCount), Integer.valueOf(this.field_sendCount), Integer.valueOf(this.field_enterCount), Integer.valueOf(this.field_disRedDotCount), Long.valueOf(this.field_stayTime), Float.valueOf(this.field_score), Long.valueOf(this.sKx) });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/expt/roomexpt/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */