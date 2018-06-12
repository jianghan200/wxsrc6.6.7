package com.tencent.mm.plugin.wallet_core.d;

import android.database.Cursor;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class c
  extends i<Bankcard>
{
  public static final String[] diD = { i.a(Bankcard.dhO, "WalletBankcard") };
  private List<Object> avD = new LinkedList();
  public e diF;
  
  public c(e parame)
  {
    super(parame, Bankcard.dhO, "WalletBankcard", null);
    this.diF = parame;
  }
  
  public final ArrayList<Bankcard> bPD()
  {
    ArrayList localArrayList = null;
    Cursor localCursor = this.diF.b("select * from WalletBankcard where cardType <= 7", null, 2);
    if (localCursor == null) {
      return null;
    }
    if (localCursor.moveToFirst())
    {
      localArrayList = new ArrayList();
      do
      {
        Bankcard localBankcard = new Bankcard();
        localBankcard.d(localCursor);
        localArrayList.add(localBankcard);
      } while (localCursor.moveToNext());
    }
    localCursor.close();
    return localArrayList;
  }
  
  public final ArrayList<Bankcard> bPS()
  {
    ArrayList localArrayList = null;
    Object localObject = "select * from WalletBankcard where cardType & " + Bankcard.plK + " != 0 ";
    localObject = this.diF.b((String)localObject, null, 2);
    if (localObject == null) {
      return null;
    }
    if (((Cursor)localObject).moveToFirst())
    {
      localArrayList = new ArrayList();
      do
      {
        Bankcard localBankcard = new Bankcard();
        localBankcard.d((Cursor)localObject);
        localArrayList.add(localBankcard);
      } while (((Cursor)localObject).moveToNext());
    }
    ((Cursor)localObject).close();
    return localArrayList;
  }
  
  public final boolean cG(List<Bankcard> paramList)
  {
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      super.b((Bankcard)paramList.next());
    }
    paramList = this.avD.iterator();
    while (paramList.hasNext()) {
      paramList.next();
    }
    return true;
  }
  
  public final boolean e(Bankcard paramBankcard)
  {
    if (super.b(paramBankcard))
    {
      paramBankcard = this.avD.iterator();
      while (paramBankcard.hasNext()) {
        paramBankcard.next();
      }
      return true;
    }
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/d/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */