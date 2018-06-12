package com.tencent.mm.plugin.wallet_core.d;

import android.database.Cursor;
import com.tencent.mm.plugin.wallet_core.model.x;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import java.util.ArrayList;

public final class f
  extends i<x>
{
  public static final String[] diD = { i.a(x.dhO, "WalletKindInfo") };
  public e diF;
  
  public f(e parame)
  {
    super(parame, x.dhO, "WalletKindInfo", null);
    this.diF = parame;
  }
  
  public final ArrayList<x> bPT()
  {
    ArrayList localArrayList = null;
    Cursor localCursor = this.diF.b("select * from WalletKindInfo", null, 2);
    if (localCursor == null) {
      return null;
    }
    if (localCursor.moveToFirst())
    {
      localArrayList = new ArrayList();
      do
      {
        x localx = new x();
        localx.d(localCursor);
        localArrayList.add(localx);
      } while (localCursor.moveToNext());
    }
    localCursor.close();
    return localArrayList;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/d/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */