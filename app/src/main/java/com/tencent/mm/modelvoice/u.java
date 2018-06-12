package com.tencent.mm.modelvoice;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.model.o;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.Map;
import junit.framework.Assert;

public final class u
  extends j
{
  public static final String[] diD = { "CREATE TABLE IF NOT EXISTS voiceinfo ( FileName TEXT PRIMARY KEY, User TEXT, MsgId INT, NetOffset INT, FileNowSize INT, TotalLen INT, Status INT, CreateTime INT, LastModifyTime INT, ClientId TEXT, VoiceLength INT, MsgLocalId INT, Human TEXT, reserved1 INT, reserved2 TEXT, MsgSource TEXT, MsgFlag INT, MsgSeq INT, MasterBufId INT, checksum INT DEFAULT 0 )", "CREATE INDEX IF NOT EXISTS voiceinfomsgidindex ON voiceinfo ( MsgId ) ", "CREATE UNIQUE INDEX IF NOT EXISTS voiceinfouniqueindex ON voiceinfo ( FileName )" };
  public com.tencent.mm.bt.h dCZ;
  Map<String, a> epX = new HashMap();
  Map<String, l> epY = new HashMap();
  Map<String, h> epZ = new HashMap();
  
  public u(com.tencent.mm.bt.h paramh)
  {
    b(paramh);
    this.dCZ = paramh;
  }
  
  private static void b(com.tencent.mm.bt.h paramh)
  {
    Cursor localCursor = paramh.b("PRAGMA table_info(voiceinfo)", null, 0);
    if (localCursor == null)
    {
      x.i("MicroMsg.VoiceStorage", "addNewColIfNeed failed, cursor is null.");
      return;
    }
    int i1 = localCursor.getColumnIndex("name");
    int j = 0;
    int i = 0;
    int n = 0;
    int m = 0;
    int k = 0;
    label46:
    String str;
    while (localCursor.moveToNext()) {
      if (i1 >= 0)
      {
        str = localCursor.getString(i1);
        if ("MsgSource".equals(str)) {
          k = 1;
        }
        if ("MsgFlag".equals(str)) {
          m = 1;
        }
        if ("MsgSeq".equals(str)) {
          n = 1;
        }
        if (!"MasterBufId".equals(str)) {
          break label212;
        }
        i = 1;
      }
    }
    label212:
    for (;;)
    {
      if ("checksum".equals(str)) {
        j = 1;
      }
      break label46;
      localCursor.close();
      if (k == 0) {
        paramh.fV("voiceinfo", "Alter table voiceinfo add MsgSource TEXT");
      }
      if (m == 0) {
        paramh.fV("voiceinfo", "Alter table voiceinfo add MsgFlag INT");
      }
      if (n == 0) {
        paramh.fV("voiceinfo", "Alter table voiceinfo add MsgSeq INT");
      }
      if (i == 0) {
        paramh.fV("voiceinfo", "Alter table voiceinfo add MasterBufId INT");
      }
      if (j != 0) {
        break;
      }
      paramh.fV("voiceinfo", "Alter table voiceinfo add checksum INT DEFAULT 0");
      return;
    }
  }
  
  public static String ov(String paramString)
  {
    return o.l(paramString, bi.VF());
  }
  
  public final boolean a(String paramString, p paramp)
  {
    boolean bool;
    if (paramString.length() > 0)
    {
      bool = true;
      Assert.assertTrue(bool);
      if (paramp == null) {
        break label49;
      }
      bool = true;
      label19:
      Assert.assertTrue(bool);
      paramp = paramp.wH();
      if (paramp.size() > 0) {
        break label54;
      }
      x.e("MicroMsg.VoiceStorage", "update failed, no values set");
    }
    label49:
    label54:
    while (this.dCZ.update("voiceinfo", paramp, "FileName= ?", new String[] { paramString }) <= 0)
    {
      return false;
      bool = false;
      break;
      bool = false;
      break label19;
    }
    doNotify();
    return true;
  }
  
  public final boolean b(p paramp)
  {
    boolean bool;
    if (paramp != null)
    {
      bool = true;
      Assert.assertTrue(bool);
      paramp = paramp.wH();
      if (paramp.size() > 0) {
        break label36;
      }
      x.e("MicroMsg.VoiceStorage", "insert falied, no values set");
    }
    label36:
    while (this.dCZ.insert("voiceinfo", "FileName", paramp) == -1L)
    {
      return false;
      bool = false;
      break;
    }
    doNotify();
    return true;
  }
  
  public final p bE(long paramLong)
  {
    p localp = null;
    Object localObject = "SELECT FileName, User, MsgId, NetOffset, FileNowSize, TotalLen, Status, CreateTime, LastModifyTime, ClientId, VoiceLength, MsgLocalId, Human, reserved1, reserved2, MsgSource, MsgFlag, MsgSeq, MasterBufId, checksum" + " FROM voiceinfo WHERE MsgId=" + paramLong;
    localObject = this.dCZ.b((String)localObject, null, 2);
    if (((Cursor)localObject).moveToFirst())
    {
      localp = new p();
      localp.d((Cursor)localObject);
    }
    ((Cursor)localObject).close();
    return localp;
  }
  
  public final p iH(int paramInt)
  {
    p localp = null;
    Object localObject = "SELECT FileName, User, MsgId, NetOffset, FileNowSize, TotalLen, Status, CreateTime, LastModifyTime, ClientId, VoiceLength, MsgLocalId, Human, reserved1, reserved2, MsgSource, MsgFlag, MsgSeq, MasterBufId, checksum" + " FROM voiceinfo WHERE MsgLocalId=" + paramInt;
    localObject = this.dCZ.b((String)localObject, null, 2);
    if (((Cursor)localObject).moveToFirst())
    {
      localp = new p();
      localp.d((Cursor)localObject);
    }
    ((Cursor)localObject).close();
    return localp;
  }
  
  public final boolean jy(String paramString)
  {
    if (paramString.length() > 0) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      if (this.dCZ.delete("voiceinfo", "FileName= ?", new String[] { paramString }) <= 0) {
        x.w("MicroMsg.VoiceStorage", "delete failed, no such file:" + paramString);
      }
      return true;
    }
  }
  
  public final p ow(String paramString)
  {
    Object localObject1 = null;
    Object localObject2 = "SELECT FileName, User, MsgId, NetOffset, FileNowSize, TotalLen, Status, CreateTime, LastModifyTime, ClientId, VoiceLength, MsgLocalId, Human, reserved1, reserved2, MsgSource, MsgFlag, MsgSeq, MasterBufId, checksum" + " FROM voiceinfo WHERE FileName= ?";
    localObject2 = this.dCZ.b((String)localObject2, new String[] { paramString }, 2);
    paramString = (String)localObject1;
    if (((Cursor)localObject2).moveToFirst())
    {
      paramString = new p();
      paramString.d((Cursor)localObject2);
    }
    ((Cursor)localObject2).close();
    return paramString;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/modelvoice/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */