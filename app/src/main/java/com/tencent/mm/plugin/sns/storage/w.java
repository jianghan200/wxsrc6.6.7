package com.tencent.mm.plugin.sns.storage;

import android.database.Cursor;
import com.tencent.mm.bt.h;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.modelsfs.SFSContext.FileEntry;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Iterator;
import java.util.List;

public final class w
{
  public boolean nJO = false;
  
  public static void NI(String paramString)
  {
    Object localObject = FileOp.H(paramString, false);
    if (localObject == null) {}
    for (;;)
    {
      return;
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        SFSContext.FileEntry localFileEntry = (SFSContext.FileEntry)((Iterator)localObject).next();
        if (localFileEntry.name.startsWith("SnsMicroMsg.dberr"))
        {
          x.i("MicroMsg.TrimSnsDb", "find error %s", new Object[] { paramString + localFileEntry.name });
          FileOp.deleteFile(paramString + localFileEntry.name);
        }
      }
    }
  }
  
  public static int a(h paramh1, h paramh2, String paramString)
  {
    Object localObject2 = null;
    Object localObject1 = null;
    paramString = paramh1.b(" select sql from sqlite_master where tbl_name=\"" + paramString + "\" and type = \"table\"", null, 0);
    paramh1 = (h)localObject2;
    if (paramString != null)
    {
      paramh1 = (h)localObject1;
      if (paramString.getCount() == 1)
      {
        paramString.moveToFirst();
        paramh1 = paramString.getString(0);
      }
      paramString.close();
    }
    if (paramh1 == null)
    {
      x.w("MicroMsg.TrimSnsDb", "diskDB has not this table !");
      return -1;
    }
    x.i("MicroMsg.TrimSnsDb", "create sql %s", new Object[] { paramh1 });
    boolean bool = paramh2.fV("", paramh1);
    x.i("MicroMsg.TrimSnsDb", "create result " + bool);
    return 1;
  }
  
  public static boolean a(h paramh1, h paramh2)
  {
    try
    {
      if (bi.oW(paramh1.getKey())) {
        paramh2.fV("", "ATTACH DATABASE '" + paramh1.getPath() + "' AS old ");
      }
      for (;;)
      {
        x.i("MicroMsg.TrimSnsDb", "ATTACH DATABASE " + paramh1.getKey());
        return true;
        paramh2.fV("", "ATTACH DATABASE '" + paramh1.getPath() + "' AS old KEY '" + paramh1.getKey() + "'");
      }
      return false;
    }
    catch (Exception paramh1)
    {
      x.e("MicroMsg.TrimSnsDb", "ERROR : attach disk db [%s] , will do again !", new Object[] { paramh1.getMessage() });
      x.printErrStackTrace("MicroMsg.TrimSnsDb", paramh1, "", new Object[0]);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */