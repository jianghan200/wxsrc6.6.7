package com.tencent.mm.storage;

import android.database.Cursor;
import com.tencent.mm.plugin.messenger.foundation.a.a.k.a;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.x;

public final class br
  extends i<bq>
  implements com.tencent.mm.plugin.messenger.foundation.a.a.k
{
  public static final String[] diD = { i.a(bq.dhO, "Stranger") };
  private e diF;
  private final com.tencent.mm.sdk.e.k<k.a, bq> sNT = new com.tencent.mm.sdk.e.k() {};
  
  public br(e parame)
  {
    super(parame, bq.dhO, "Stranger", null);
    this.diF = parame;
  }
  
  private void b(bq parambq)
  {
    if (this.sNT.ci(parambq)) {
      this.sNT.doNotify();
    }
  }
  
  public final bq Hh(String paramString)
  {
    if ((paramString == null) || (paramString.length() <= 0)) {
      return null;
    }
    bq localbq = new bq();
    paramString = this.diF.a("Stranger", null, "encryptUsername = ?", new String[] { paramString }, null, null, null, 2);
    if (paramString.moveToFirst()) {
      localbq.d(paramString);
    }
    paramString.close();
    return localbq;
  }
  
  public final int Hi(String paramString)
  {
    int i = this.diF.delete("Stranger", "(encryptUsername=?)", new String[] { paramString });
    if (i > 0) {
      doNotify();
    }
    x.i("MicroMsg.StrangerStorage", "delByEncryptUsername:" + paramString + " result:" + i);
    return i;
  }
  
  public final void a(k.a parama)
  {
    this.sNT.a(parama, null);
  }
  
  public final void b(k.a parama)
  {
    this.sNT.remove(parama);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/storage/br.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */