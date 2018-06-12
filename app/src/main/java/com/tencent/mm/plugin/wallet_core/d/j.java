package com.tencent.mm.plugin.wallet_core.d;

import android.database.Cursor;
import com.tencent.mm.plugin.wallet_core.model.af;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class j
  extends i<af>
{
  public static final String[] diD = { i.a(af.dhO, "WalletUserInfo") };
  private List<Object> avD = new LinkedList();
  public e diF;
  
  public j(e parame)
  {
    super(parame, af.dhO, "WalletUserInfo", null);
    x.i("MicroMsg.WalletUserInfoStorage", "already call constructor.");
    this.diF = parame;
  }
  
  public final boolean a(af paramaf)
  {
    if (super.b(paramaf))
    {
      paramaf = this.avD.iterator();
      while (paramaf.hasNext()) {
        paramaf.next();
      }
      return true;
    }
    return false;
  }
  
  public final af bPU()
  {
    af localaf = new af();
    Cursor localCursor = this.diF.b("select * from WalletUserInfo", null, 2);
    localaf.field_is_reg = -1;
    if (localCursor == null) {
      return localaf;
    }
    if (localCursor.moveToNext()) {
      localaf.d(localCursor);
    }
    localCursor.close();
    return localaf;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/d/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */