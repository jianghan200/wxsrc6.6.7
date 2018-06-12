package com.tencent.mm.plugin.account.friend.a;

import com.tencent.mm.g.c.bu;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class n
  extends bu
{
  protected static c.a dhO;
  
  static
  {
    c.a locala = new c.a();
    locala.sKy = new Field[16];
    locala.columns = new String[17];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "googleid";
    locala.sKA.put("googleid", "TEXT");
    localStringBuilder.append(" googleid TEXT");
    localStringBuilder.append(", ");
    locala.columns[1] = "googlename";
    locala.sKA.put("googlename", "TEXT");
    localStringBuilder.append(" googlename TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "googlephotourl";
    locala.sKA.put("googlephotourl", "TEXT");
    localStringBuilder.append(" googlephotourl TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "googlegmail";
    locala.sKA.put("googlegmail", "TEXT");
    localStringBuilder.append(" googlegmail TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "username";
    locala.sKA.put("username", "TEXT");
    localStringBuilder.append(" username TEXT");
    localStringBuilder.append(", ");
    locala.columns[5] = "nickname";
    locala.sKA.put("nickname", "TEXT");
    localStringBuilder.append(" nickname TEXT");
    localStringBuilder.append(", ");
    locala.columns[6] = "nicknameqp";
    locala.sKA.put("nicknameqp", "TEXT");
    localStringBuilder.append(" nicknameqp TEXT");
    localStringBuilder.append(", ");
    locala.columns[7] = "usernamepy";
    locala.sKA.put("usernamepy", "TEXT");
    localStringBuilder.append(" usernamepy TEXT");
    localStringBuilder.append(", ");
    locala.columns[8] = "small_url";
    locala.sKA.put("small_url", "TEXT");
    localStringBuilder.append(" small_url TEXT");
    localStringBuilder.append(", ");
    locala.columns[9] = "big_url";
    locala.sKA.put("big_url", "TEXT");
    localStringBuilder.append(" big_url TEXT");
    localStringBuilder.append(", ");
    locala.columns[10] = "ret";
    locala.sKA.put("ret", "INTEGER");
    localStringBuilder.append(" ret INTEGER");
    localStringBuilder.append(", ");
    locala.columns[11] = "status";
    locala.sKA.put("status", "INTEGER");
    localStringBuilder.append(" status INTEGER");
    localStringBuilder.append(", ");
    locala.columns[12] = "googleitemid";
    locala.sKA.put("googleitemid", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" googleitemid TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.sKz = "googleitemid";
    locala.columns[13] = "googlecgistatus";
    locala.sKA.put("googlecgistatus", "INTEGER default '2' ");
    localStringBuilder.append(" googlecgistatus INTEGER default '2' ");
    localStringBuilder.append(", ");
    locala.columns[14] = "contecttype";
    locala.sKA.put("contecttype", "TEXT");
    localStringBuilder.append(" contecttype TEXT");
    localStringBuilder.append(", ");
    locala.columns[15] = "googlenamepy";
    locala.sKA.put("googlenamepy", "TEXT");
    localStringBuilder.append(" googlenamepy TEXT");
    locala.columns[16] = "rowid";
    locala.sql = localStringBuilder.toString();
    dhO = locala;
  }
  
  protected final c.a AX()
  {
    return dhO;
  }
  
  public final String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("googleIDgoogleid\n");
    localStringBuffer.append("googleNamegooglename\n");
    localStringBuffer.append("googlePhotoUrlgooglephotourl\n");
    localStringBuffer.append("googleGmailgooglegmail\n");
    localStringBuffer.append("userNameusername\n");
    localStringBuffer.append("nickNamenickname\n");
    localStringBuffer.append("nickNameQuanPinnicknameqp\n");
    localStringBuffer.append("nickNamePYInitialusernamepy\n");
    localStringBuffer.append("smallHeaderUrlsmall_url\n");
    localStringBuffer.append("bigHeaderUrlbig_url\n");
    localStringBuffer.append("retret\n");
    localStringBuffer.append("statusstatus\n");
    localStringBuffer.append("googleItemIDgoogleitemid\n");
    localStringBuffer.append("cgiStatusgooglecgistatus\n");
    localStringBuffer.append("contactTypecontecttype\n");
    localStringBuffer.append("googleNamePYInitialgooglenamepy\n");
    return localStringBuffer.toString();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/account/friend/a/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */