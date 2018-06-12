package com.tencent.mm.plugin.wallet_core.model;

import android.content.Context;
import android.util.SparseArray;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Iterator;
import java.util.List;

public final class q
{
  public List<ElementQuery> pjy = null;
  public SparseArray<String> pqQ = null;
  
  public final ElementQuery OW(String paramString)
  {
    if ((this.pjy != null) && (this.pjy.size() != 0))
    {
      Iterator localIterator = this.pjy.iterator();
      while (localIterator.hasNext())
      {
        ElementQuery localElementQuery = (ElementQuery)localIterator.next();
        if ((localElementQuery.lMV != null) && (localElementQuery.lMV.equals(paramString))) {
          return localElementQuery;
        }
      }
      x.w("MicroMsg.WalletBankElementManager", "hy: not found given banktype: %s", new Object[] { paramString });
      return null;
    }
    x.w("MicroMsg.WalletBankElementManager", "hy: no element from given banktype");
    return null;
  }
  
  public final ElementQuery OX(String paramString)
  {
    if (bi.oW(paramString))
    {
      x.w("MicroMsg.WalletBankElementManager", "hy: bindSerail given is null");
      return null;
    }
    if ((this.pjy != null) && (this.pjy.size() != 0))
    {
      Iterator localIterator = this.pjy.iterator();
      while (localIterator.hasNext())
      {
        ElementQuery localElementQuery = (ElementQuery)localIterator.next();
        if (paramString.equals(localElementQuery.lMW)) {
          return localElementQuery;
        }
      }
      x.w("MicroMsg.WalletBankElementManager", "hy: not found given element query");
      return null;
    }
    x.w("MicroMsg.WalletBankElementManager", "hy: element list is null. get element failed");
    return null;
  }
  
  public final String Q(Context paramContext, int paramInt)
  {
    if (this.pqQ != null)
    {
      String str = (String)this.pqQ.get(paramInt);
      if (!bi.oW(str)) {
        return str;
      }
    }
    return paramContext.getString(a.i.wallet_card_cre_type_default);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/model/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */