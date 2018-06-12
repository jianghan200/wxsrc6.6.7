package com.tencent.mm.plugin.nfc.c.a;

import android.nfc.Tag;
import android.nfc.tech.IsoDep;
import com.tencent.mm.plugin.nfc.a.a;
import com.tencent.mm.plugin.nfc.a.c;
import com.tencent.mm.sdk.platformtools.x;

public final class b
  implements d
{
  private IsoDep lFl;
  
  public b(Tag paramTag)
  {
    if (paramTag == null)
    {
      x.e("MicroMsg.ApduEngineIsoDep", "[NFC]tag is null");
      throw new IllegalStateException("tag is null");
    }
    this.lFl = IsoDep.get(paramTag);
  }
  
  public final c a(a parama)
  {
    if (this.lFl == null)
    {
      x.e("MicroMsg.ApduEngineIsoDep", "[NFC]IsoDep is null");
      throw new IllegalStateException("IsoDep is null");
    }
    connect();
    Object localObject = null;
    a locala = parama;
    parama = (a)localObject;
    c localc;
    for (;;)
    {
      localc = new c(this.lFl.transceive(locala.getBytes()));
      localObject = parama;
      if (localc.lEV.length != 0)
      {
        if (localc.lEV.length - 2 <= 0) {
          localObject = localc;
        }
      }
      else {
        label78:
        return (c)localObject;
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
      locala = new a((byte[])com.tencent.mm.plugin.nfc.a.b.lFd.clone());
      break;
      parama.a(localc);
    }
  }
  
  public final boolean bjs()
  {
    close();
    connect();
    return true;
  }
  
  public final void close()
  {
    if (this.lFl.isConnected()) {
      this.lFl.close();
    }
  }
  
  public final boolean connect()
  {
    if (!this.lFl.isConnected()) {
      this.lFl.connect();
    }
    return true;
  }
  
  public final boolean isConnected()
  {
    return this.lFl.isConnected();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/nfc/c/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */