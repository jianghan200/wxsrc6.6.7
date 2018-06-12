package com.tencent.mm.plugin.shake.b;

import android.database.Cursor;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.x;

public final class g
  extends i<f>
{
  public static final String[] ciG = { "CREATE INDEX IF NOT EXISTS  shakemessage_status_index ON shakemessage ( status )", "CREATE INDEX IF NOT EXISTS shakemessage_type_index ON shakemessage ( type )" };
  public static final String[] diD = { i.a(f.dhO, "shakemessage") };
  public e diF;
  
  public g(e parame)
  {
    super(parame, f.dhO, "shakemessage", ciG);
    this.diF = parame;
  }
  
  public final boolean a(f paramf)
  {
    if (paramf == null) {
      x.e("MicroMsg.ShakeMessageStorage", "insert fail, shakeMsg is null");
    }
    while (!super.b(paramf)) {
      return false;
    }
    Xp(paramf.sKx);
    return true;
  }
  
  public final int axd()
  {
    Cursor localCursor = this.diF.b("select count(*) from " + getTableName() + " where status != 1", null, 2);
    if (localCursor.moveToFirst()) {}
    for (int i = localCursor.getInt(0);; i = 0)
    {
      localCursor.close();
      if (i > 0) {
        return i;
      }
      return 0;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/shake/b/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */