package com.tencent.mm.storage;

import android.database.Cursor;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class bk
  extends i<bj>
{
  public static final String[] diD = { i.a(bj.dhO, "OpenMsgListener") };
  public e diF;
  
  public bk(e parame)
  {
    super(parame, bj.dhO, "OpenMsgListener", null);
    this.diF = parame;
    parame.fV("OpenMsgListener", "CREATE INDEX IF NOT EXISTS openMsgListenerAppIdIndex ON OpenMsgListener ( appId )");
    parame.fV("OpenMsgListener", "CREATE INDEX IF NOT EXISTS openMsgListenerStatusIndex ON OpenMsgListener ( status )");
  }
  
  public final bj Zf(String paramString)
  {
    if ((paramString == null) || (paramString.length() <= 0)) {
      return null;
    }
    Cursor localCursor = this.diF.a("OpenMsgListener", null, "appId=?", new String[] { bi.oU(paramString) }, null, null, null, 2);
    if (!localCursor.moveToFirst())
    {
      x.w("MicroMsg.OpenMsgListenerStorage", "get null with appId:" + paramString);
      localCursor.close();
      return null;
    }
    paramString = new bj();
    paramString.d(localCursor);
    localCursor.close();
    return paramString;
  }
  
  public final Cursor cmR()
  {
    return rawQuery("select * from OpenMsgListener where (status = ?) ", new String[] { "1" });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/storage/bk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */