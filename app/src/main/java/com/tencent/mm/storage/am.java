package com.tencent.mm.storage;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.a.f;
import com.tencent.mm.bt.h;
import com.tencent.mm.plugin.messenger.foundation.a.a.b;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.List;

public final class am
  extends j
  implements b
{
  public static final String[] diD = { "CREATE TABLE IF NOT EXISTS DeletedConversationInfo ( userName TEXT  PRIMARY KEY , lastSeq LONG  , reserved1 INT  , reserved2 LONG  , reserved3 TEXT  ) ", "CREATE INDEX IF NOT EXISTS createTimeIndex  ON DeletedConversationInfo ( reserved2 )" };
  private h dCZ;
  private final f<String, Long> dzj = new f(50);
  
  public am(h paramh)
  {
    this.dCZ = paramh;
  }
  
  public final boolean F(String paramString, long paramLong)
  {
    if (bi.oW(paramString)) {}
    ContentValues localContentValues;
    do
    {
      return false;
      localContentValues = new ContentValues();
      localContentValues.put("userName", paramString);
      localContentValues.put("lastSeq", Long.valueOf(paramLong));
      localContentValues.put("reserved2", Long.valueOf(Gw(paramString)));
    } while ((int)this.dCZ.replace("DeletedConversationInfo", "userName", localContentValues) == -1);
    Xp(paramString);
    return true;
  }
  
  public final boolean G(String paramString, long paramLong)
  {
    if (bi.oW(paramString)) {}
    ContentValues localContentValues;
    do
    {
      return false;
      this.dzj.m(paramString, Long.valueOf(paramLong));
      localContentValues = new ContentValues();
      localContentValues.put("userName", paramString);
      localContentValues.put("lastSeq", Long.valueOf(Gv(paramString)));
      localContentValues.put("reserved2", Long.valueOf(paramLong));
    } while ((int)this.dCZ.replace("DeletedConversationInfo", "userName", localContentValues) == -1);
    Xp(paramString);
    return true;
  }
  
  public final long Gv(String paramString)
  {
    if (bi.oW(paramString)) {
      return 0L;
    }
    Object localObject = "select lastSeq from DeletedConversationInfo where userName = \"" + bi.oU(paramString) + "\"";
    localObject = this.dCZ.b((String)localObject, null, 2);
    if (localObject == null)
    {
      x.i("MicroMsg.DeletedConversationInfoStorage", "getLastSeq failed " + paramString);
      return 0L;
    }
    if (((Cursor)localObject).moveToFirst())
    {
      long l = ((Cursor)localObject).getLong(0);
      ((Cursor)localObject).close();
      return l;
    }
    ((Cursor)localObject).close();
    return 0L;
  }
  
  public final long Gw(String paramString)
  {
    if (bi.oW(paramString)) {
      return 0L;
    }
    Object localObject = (Long)this.dzj.get(paramString);
    if (localObject != null) {
      return ((Long)localObject).longValue();
    }
    localObject = "select reserved2 from DeletedConversationInfo where userName = \"" + bi.oU(paramString) + "\"";
    localObject = this.dCZ.b((String)localObject, null, 2);
    if (localObject == null)
    {
      x.i("MicroMsg.DeletedConversationInfoStorage", "getCreateTime failed " + paramString);
      this.dzj.m(paramString, Long.valueOf(0L));
      return 0L;
    }
    if (((Cursor)localObject).moveToFirst())
    {
      long l = ((Cursor)localObject).getLong(0);
      this.dzj.m(paramString, Long.valueOf(l));
      ((Cursor)localObject).close();
      return l;
    }
    ((Cursor)localObject).close();
    return 0L;
  }
  
  public final List<String> bda()
  {
    ArrayList localArrayList = new ArrayList();
    Cursor localCursor = this.dCZ.b("select userName,reserved2 from DeletedConversationInfo where reserved2 > 0", null, 2);
    if (localCursor == null) {
      return localArrayList;
    }
    if (localCursor.moveToFirst()) {
      do
      {
        String str = localCursor.getString(0);
        long l = localCursor.getLong(1);
        this.dzj.m(str, Long.valueOf(l));
        localArrayList.add(str);
      } while (localCursor.moveToNext());
    }
    localCursor.close();
    return localArrayList;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/storage/am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */