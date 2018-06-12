package com.tencent.mm.plugin.nfc.c.a;

import android.nfc.Tag;
import android.nfc.tech.NfcA;
import com.tencent.mm.plugin.nfc.a.a;
import com.tencent.mm.plugin.nfc.a.b;
import com.tencent.mm.sdk.platformtools.x;

public final class c
  implements d
{
  private NfcA lFm;
  
  public c(Tag paramTag)
  {
    this.lFm = NfcA.get(paramTag);
  }
  
  public final com.tencent.mm.plugin.nfc.a.c a(a parama)
  {
    if (this.lFm == null)
    {
      x.e("MicroMsg.ApduEngineNfcA", "[NFC]NfcA is null");
      throw new IllegalStateException("NfcA is null");
    }
    connect();
    Object localObject = null;
    a locala = parama;
    parama = (a)localObject;
    com.tencent.mm.plugin.nfc.a.c localc;
    for (;;)
    {
      localc = new com.tencent.mm.plugin.nfc.a.c(this.lFm.transceive(locala.getBytes()));
      localObject = parama;
      if (localc.lEV.length != 0)
      {
        if (localc.lEV.length - 2 < 0) {
          localObject = localc;
        }
      }
      else {
        label78:
        return (com.tencent.mm.plugin.nfc.a.c)localObject;
      }
      if (localc.bjp() != 108) {
        break;
      }
      locala.tX(localc.bjq());
    }
    if (parama == null) {
      parama = localc;
    }
    for (;;)
    {
      localObject = parama;
      if (localc.bjp() != 97) {
        break label78;
      }
      if (localc.bjq() == 0) {
        break label154;
      }
      locala = new a((byte[])b.lFd.clone());
      break;
      parama.a(localc);
    }
    label154:
    parama.lEV[(parama.lEV.length - 1)] = -112;
    return parama;
  }
  
  public final boolean bjs()
  {
    close();
    connect();
    return true;
  }
  
  public final void close()
  {
    if (this.lFm.isConnected()) {
      this.lFm.close();
    }
  }
  
  public final boolean connect()
  {
    if (!this.lFm.isConnected()) {
      this.lFm.connect();
    }
    return true;
  }
  
  public final boolean isConnected()
  {
    return this.lFm.isConnected();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/nfc/c/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */