package com.tencent.mm.plugin.wallet_core.d;

import android.database.Cursor;
import com.tencent.mm.plugin.wallet_core.model.ac;
import com.tencent.mm.protocal.c.azs;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.x;

public final class i
  extends com.tencent.mm.sdk.e.i<ac>
{
  public static final String[] diD = { com.tencent.mm.sdk.e.i.a(ac.dhO, "WalletRegionGreyAreaList") };
  private e diF;
  
  public i(e parame)
  {
    super(parame, ac.dhO, "WalletRegionGreyAreaList", null);
    this.diF = parame;
  }
  
  public final void a(int paramInt, azs paramazs)
  {
    ac localac = new ac();
    localac.field_wallet_region = paramInt;
    try
    {
      localac.field_wallet_grey_item_buf = paramazs.toByteArray();
      super.a(localac);
      return;
    }
    catch (Exception paramazs)
    {
      for (;;)
      {
        x.e("MicroMsg.WalletRegionGreyItemStg", "setWalletRegionGreyItem error " + paramazs.getMessage());
      }
    }
  }
  
  public final ac zo(int paramInt)
  {
    Object localObject = "select * from WalletRegionGreyAreaList where wallet_region = " + paramInt;
    Cursor localCursor = this.diF.b((String)localObject, null, 2);
    x.i("MicroMsg.WalletRegionGreyItemStg", "getWalletRegionGreyItem " + (String)localObject);
    if (localCursor == null) {
      return new ac();
    }
    localObject = new ac();
    if (localCursor.moveToNext())
    {
      localObject = new ac();
      ((ac)localObject).d(localCursor);
    }
    x.i("MicroMsg.WalletRegionGreyItemStg", "get grey item ");
    localCursor.close();
    return (ac)localObject;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/d/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */