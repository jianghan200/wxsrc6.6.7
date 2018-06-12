package com.tencent.mm.sdk.platformtools;

import android.content.Context;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import java.util.LinkedList;
import java.util.List;

public final class ar
{
  static boolean cdG;
  private TelephonyManager sIc;
  private PhoneStateListener sId;
  List<a> sIe = new LinkedList();
  
  public static boolean vZ()
  {
    x.i("MicroMsg.PhoneStatusWatcher", "alvinluo isCalling: %b", new Object[] { Boolean.valueOf(cdG) });
    return cdG;
  }
  
  public final void a(a parama)
  {
    this.sIe.add(parama);
  }
  
  public final void ciy()
  {
    this.sIe.clear();
  }
  
  public final void end()
  {
    x.i("MicroMsg.PhoneStatusWatcher", "alvinluo PhoneStatusWatcher end");
    if (this.sIc != null)
    {
      this.sIc.listen(this.sId, 0);
      this.sId = null;
    }
  }
  
  public final void fN(Context paramContext)
  {
    x.i("MicroMsg.PhoneStatusWatcher", "alvinluo PhoneStatusWatcher begin");
    if (this.sIc == null) {
      this.sIc = ((TelephonyManager)paramContext.getSystemService("phone"));
    }
    if (this.sId == null) {
      this.sId = new PhoneStateListener()
      {
        public final void onCallStateChanged(int paramAnonymousInt, String paramAnonymousString)
        {
          x.i("MicroMsg.PhoneStatusWatcher", "alvinluo onCallStateChanged state: %d, incomingNumber: %s", new Object[] { Integer.valueOf(paramAnonymousInt), paramAnonymousString });
          if (ar.this.sIe.size() > 0)
          {
            ar.a[] arrayOfa = new ar.a[ar.this.sIe.size()];
            arrayOfa = (ar.a[])ar.this.sIe.toArray(arrayOfa);
            int j = arrayOfa.length;
            int i = 0;
            while (i < j)
            {
              arrayOfa[i].fn(paramAnonymousInt);
              i += 1;
            }
          }
          super.onCallStateChanged(paramAnonymousInt, paramAnonymousString);
          switch (paramAnonymousInt)
          {
          default: 
            return;
          case 0: 
            ar.cdG = false;
            return;
          }
          ar.cdG = true;
        }
      };
    }
    this.sIc.listen(this.sId, 32);
  }
  
  public static abstract interface a
  {
    public abstract void fn(int paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/sdk/platformtools/ar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */