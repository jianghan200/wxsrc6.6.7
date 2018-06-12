package com.tencent.mm.storage;

import android.database.Cursor;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.x;

public final class bi
  extends i<bh>
{
  public static final String[] diD = { i.a(bh.dhO, "NewTipsInfo") };
  public e diF;
  
  public bi(e parame)
  {
    super(parame, bh.dhO, "NewTipsInfo", null);
    this.diF = parame;
  }
  
  public final bh Do(int paramInt)
  {
    if (this.diF == null)
    {
      x.e("MicroMsg.NewTipsInfoStorage", "getByTipsId, but db is null, return");
      return null;
    }
    Cursor localCursor = this.diF.a("NewTipsInfo", null, "tipId=?", new String[] { String.valueOf(paramInt) }, null, null, null, 2);
    if (localCursor.moveToFirst())
    {
      bh localbh = new bh();
      try
      {
        localbh.d(localCursor);
        localCursor.close();
        return localbh;
      }
      catch (Exception localException)
      {
        x.e("MicroMsg.NewTipsInfoStorage", "getByTipsId convertFrom(cu) cause IlleagalStateException, return null");
        localCursor.close();
        return null;
      }
    }
    x.w("MicroMsg.NewTipsInfoStorage", "getByTipsId:%d, no data", new Object[] { Integer.valueOf(paramInt) });
    localCursor.close();
    return null;
  }
  
  public final boolean a(bh parambh, String... paramVarArgs)
  {
    if (parambh == null)
    {
      x.e("MicroMsg.NewTipsInfoStorage", "NewTipsInfo is null!");
      return false;
    }
    boolean bool = super.b(parambh, false, paramVarArgs);
    if (bool) {
      b(parambh.field_tipId, 3, Integer.valueOf(parambh.field_tipId));
    }
    x.d("MicroMsg.NewTipsInfoStorage", "update result[%B]", new Object[] { Boolean.valueOf(bool) });
    return bool;
  }
  
  public final boolean f(bh parambh)
  {
    boolean bool1 = false;
    if (parambh == null) {
      x.e("MicroMsg.NewTipsInfoStorage", "NewTipsInfo is null!");
    }
    boolean bool2;
    do
    {
      return bool1;
      if (parambh.field_tipId <= 0)
      {
        x.e("MicroMsg.NewTipsInfoStorage", "newTipsId is error, tipsId = %s", new Object[] { Integer.valueOf(parambh.field_tipId) });
        return false;
      }
      bool2 = a(parambh, false);
      bool1 = bool2;
    } while (!bool2);
    b(parambh.field_tipId, 2, Integer.valueOf(parambh.field_tipId));
    return bool2;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/storage/bi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */