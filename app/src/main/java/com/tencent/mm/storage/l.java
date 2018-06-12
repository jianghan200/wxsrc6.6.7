package com.tencent.mm.storage;

import android.database.Cursor;
import com.tencent.mm.bt.h;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;

public final class l
  extends i<k>
{
  public static final String[] diD = { i.a(k.dhO, "BackupRecoverMsgListDataId") };
  private e diF;
  
  public l(h paramh)
  {
    super(paramh, k.dhO, "BackupRecoverMsgListDataId", null);
    this.diF = paramh;
  }
  
  public final String XI(String paramString)
  {
    Object localObject = "SELECT * FROM BackupRecoverMsgListDataId WHERE msgListDataId = \"" + paramString + "\" ";
    x.d("MicroMsg.BackupRecoverMsgListDataIdStorage", "getSessionNameByMsgListDataId:" + (String)localObject);
    localObject = this.diF.rawQuery((String)localObject, null);
    if (localObject == null)
    {
      x.e("MicroMsg.BackupRecoverMsgListDataIdStorage", "getSessionNameByMsgListDataId failed, msgListDataId:%s", new Object[] { paramString });
      return null;
    }
    if (((Cursor)localObject).moveToFirst())
    {
      paramString = new k();
      paramString.d((Cursor)localObject);
      ((Cursor)localObject).close();
      return paramString.field_sessionName;
    }
    ((Cursor)localObject).close();
    return null;
  }
  
  public final boolean ckt()
  {
    boolean bool = this.diF.fV("BackupRecoverMsgListDataId", "delete from BackupRecoverMsgListDataId");
    x.i("MicroMsg.BackupRecoverMsgListDataIdStorage", "deleteAllData, result:%b", new Object[] { Boolean.valueOf(bool) });
    return bool;
  }
  
  public final HashMap<String, String> cku()
  {
    HashMap localHashMap = new HashMap();
    Cursor localCursor = axc();
    if (localCursor == null)
    {
      x.e("MicroMsg.BackupRecoverMsgListDataIdStorage", "getAllData failed.");
      return localHashMap;
    }
    while (localCursor.moveToNext())
    {
      k localk = new k();
      localk.d(localCursor);
      localHashMap.put(localk.field_msgListDataId, localk.field_sessionName);
    }
    localCursor.close();
    return localHashMap;
  }
  
  public final boolean ckv()
  {
    x.d("MicroMsg.BackupRecoverMsgListDataIdStorage", "isMsgListDataIdExist:" + "SELECT * FROM BackupRecoverMsgListDataId");
    Cursor localCursor = this.diF.rawQuery("SELECT * FROM BackupRecoverMsgListDataId", null);
    if (localCursor == null)
    {
      x.e("MicroMsg.BackupRecoverMsgListDataIdStorage", "isMsgListDataIdExist failed.");
      return false;
    }
    if (localCursor.getCount() <= 0)
    {
      x.e("MicroMsg.BackupRecoverMsgListDataIdStorage", "No data in BackupRecoverMsgListDataIdStorage.");
      localCursor.close();
      return false;
    }
    localCursor.close();
    return true;
  }
  
  public final int ckw()
  {
    int i = 0;
    x.d("MicroMsg.BackupRecoverMsgListDataIdStorage", "getSessionCount:" + "SELECT COUNT(DISTINCT sessionName) FROM BackupRecoverMsgListDataId ");
    Cursor localCursor = this.diF.rawQuery("SELECT COUNT(DISTINCT sessionName) FROM BackupRecoverMsgListDataId ", null);
    if (localCursor.moveToLast()) {
      i = localCursor.getInt(0);
    }
    localCursor.close();
    return i;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/storage/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */