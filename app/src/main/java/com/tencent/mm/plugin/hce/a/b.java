package com.tencent.mm.plugin.hce.a;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.nfc.NfcAdapter;
import android.os.Build.VERSION;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;

public final class b
{
  @TargetApi(21)
  public static boolean aVV()
  {
    boolean bool = false;
    if (Build.VERSION.SDK_INT >= 21) {}
    for (int i = 1;; i = 0)
    {
      if (i != 0) {
        bool = ad.getContext().getPackageManager().hasSystemFeature("android.hardware.nfc.hce");
      }
      return bool;
    }
  }
  
  public static boolean aVW()
  {
    Context localContext = ad.getContext();
    if (!localContext.getPackageManager().hasSystemFeature("android.hardware.nfc")) {}
    while (NfcAdapter.getDefaultAdapter(localContext) == null) {
      return false;
    }
    return true;
  }
  
  public static boolean aVX()
  {
    NfcAdapter localNfcAdapter = NfcAdapter.getDefaultAdapter(ad.getContext());
    if (localNfcAdapter == null) {
      x.i("MicroMsg.HceUtils", "alvinluo no nfc chip !");
    }
    while (!localNfcAdapter.isEnabled()) {
      return false;
    }
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/hce/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */