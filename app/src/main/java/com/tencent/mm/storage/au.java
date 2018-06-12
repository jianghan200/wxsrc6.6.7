package com.tencent.mm.storage;

import android.database.Cursor;
import com.tencent.mm.plugin.messenger.foundation.a.a.d;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.List;

public final class au
  extends i<at>
  implements d
{
  public static final String[] diD = { i.a(at.dhO, "fmessage_msginfo") };
  private static final String[] tbj = { "CREATE INDEX IF NOT EXISTS  fmessageTalkerIndex ON fmessage_msginfo ( talker )" };
  public e diF;
  
  public au(e parame)
  {
    super(parame, at.dhO, "fmessage_msginfo", tbj);
    this.diF = parame;
  }
  
  public final boolean Gy(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0))
    {
      x.e("MicroMsg.FMessageMsgInfoStorage", "deleteByTalker fail, talker is null");
      return false;
    }
    paramString = "delete from fmessage_msginfo where talker = '" + bi.oU(paramString) + "'";
    return this.diF.fV("fmessage_msginfo", paramString);
  }
  
  public final at[] YM(String paramString)
  {
    x.d("MicroMsg.FMessageMsgInfoStorage", "getLastFMessageMsgInfo");
    paramString = "select *, rowid from fmessage_msginfo  where talker = '" + bi.oU(paramString) + "' order by createTime DESC limit 3";
    paramString = this.diF.b(paramString, null, 2);
    ArrayList localArrayList = new ArrayList();
    while (paramString.moveToNext())
    {
      at localat = new at();
      localat.d(paramString);
      localArrayList.add(localat);
    }
    paramString.close();
    return (at[])localArrayList.toArray(new at[localArrayList.size()]);
  }
  
  public final at YN(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0))
    {
      x.e("MicroMsg.FMessageMsgInfoStorage", "getLastFMsg fail, talker is null");
      return null;
    }
    paramString = "select * from fmessage_msginfo where talker = '" + bi.oU(paramString) + "' order by createTime DESC limit 1";
    paramString = this.diF.b(paramString, null, 2);
    at localat = new at();
    if (paramString.moveToFirst()) {
      localat.d(paramString);
    }
    paramString.close();
    return localat;
  }
  
  public final at YO(String paramString)
  {
    paramString = dc(paramString, 1);
    if ((paramString != null) && (paramString.length > 0)) {
      return paramString[0];
    }
    return null;
  }
  
  public final boolean b(at paramat)
  {
    if (paramat == null) {
      x.e("MicroMsg.FMessageMsgInfoStorage", "insert fail, fmsgInfo is null");
    }
    while (!super.b(paramat)) {
      return false;
    }
    Xp(paramat.sKx);
    return true;
  }
  
  public final List<at> bdb()
  {
    x.d("MicroMsg.FMessageMsgInfoStorage", "getFMsgByType, type = 0");
    ArrayList localArrayList = new ArrayList();
    Cursor localCursor = this.diF.b("select *, rowid from fmessage_msginfo where type = 0", null, 2);
    while (localCursor.moveToNext())
    {
      at localat = new at();
      localat.d(localCursor);
      localArrayList.add(localat);
    }
    localCursor.close();
    x.d("MicroMsg.FMessageMsgInfoStorage", "getFMsgByType, size = " + localArrayList.size());
    return localArrayList;
  }
  
  public final at[] dc(String paramString, int paramInt)
  {
    if ((paramString == null) || (paramString.length() == 0))
    {
      x.e("MicroMsg.FMessageMsgInfoStorage", "getLastRecvFMsg fail, talker is null");
      return null;
    }
    paramString = "select * from fmessage_msginfo where isSend != 1 and talker = '" + bi.oU(paramString) + "' order by createTime DESC limit " + paramInt;
    paramString = this.diF.b(paramString, null, 2);
    ArrayList localArrayList = new ArrayList();
    while (paramString.moveToNext())
    {
      at localat = new at();
      localat.d(paramString);
      localArrayList.add(localat);
    }
    paramString.close();
    return (at[])localArrayList.toArray(new at[localArrayList.size()]);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/storage/au.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */