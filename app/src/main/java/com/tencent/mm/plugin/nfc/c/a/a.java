package com.tencent.mm.plugin.nfc.c.a;

import android.content.Context;
import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.nfc.tech.IsoDep;
import android.nfc.tech.NfcA;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public final class a
  extends com.tencent.mm.plugin.nfc.c.b
{
  private static a lFi = null;
  private Set<String> lFj;
  public d lFk = null;
  
  private boolean a(com.tencent.mm.plugin.nfc.c.a parama)
  {
    if (this.lFk == null)
    {
      x.e("MicroMsg.ApduEngine", "[NFC]ApduEngine not ready !");
      throw new IllegalStateException("ApduEngine not ready !");
    }
    if ((parama == null) || (parama.lFe == null))
    {
      x.e("MicroMsg.ApduEngine", "[NFC]apdu is null !");
      throw new IllegalArgumentException("apdu is null !");
    }
    x.i("MicroMsg.ApduEngine", "[NFC][" + parama.name + "] do cmd : " + parama.lFe.toString());
    Object localObject = parama.lFe;
    parama.lFf = this.lFk.a((com.tencent.mm.plugin.nfc.a.a)localObject);
    localObject = parama.lFf;
    int i = ((com.tencent.mm.plugin.nfc.a.c)localObject).bjp();
    if ((short)(((com.tencent.mm.plugin.nfc.a.c)localObject).bjq() | i << 8) == 36864) {}
    for (i = 1; i != 0; i = 0)
    {
      x.i("MicroMsg.ApduEngine", "[NFC][" + parama.name + "] result==> OK : " + parama.lFf.toString());
      return true;
    }
    x.e("MicroMsg.ApduEngine", "[NFC][" + parama.name + "] result==> fail : " + parama.lFf.toString());
    return false;
  }
  
  public static a bjr()
  {
    if (lFi == null) {
      lFi = new a();
    }
    return lFi;
  }
  
  public final com.tencent.mm.plugin.nfc.a.c a(com.tencent.mm.plugin.nfc.a.a parama)
  {
    parama = new com.tencent.mm.plugin.nfc.c.a(1, "def", parama);
    a(parama);
    return parama.lFf;
  }
  
  public final boolean a(Tag paramTag)
  {
    super.a(paramTag);
    this.lFj = new HashSet();
    String[] arrayOfString = paramTag.getTechList();
    int j = arrayOfString.length;
    int i = 0;
    while (i < j)
    {
      String str = arrayOfString[i];
      x.d("MicroMsg.ApduEngine", "[NFC]tech : " + str);
      this.lFj.add(str);
      i += 1;
    }
    try
    {
      if ((this.lFk != null) && (this.lFk.isConnected())) {
        this.lFk.close();
      }
      if (this.lFj.contains(IsoDep.class.getName()))
      {
        this.lFk = new b(paramTag);
        return true;
      }
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        x.printErrStackTrace("MicroMsg.ApduEngine", localIOException, "", new Object[0]);
        x.e("MicroMsg.ApduEngine", localIOException.toString());
      }
      if (this.lFj.contains(NfcA.class.getName()))
      {
        this.lFk = new c(paramTag);
        return true;
      }
      x.i("MicroMsg.ApduEngine", "[NFC]ApduEngine not support this tag");
    }
    return false;
  }
  
  public final boolean a(List<com.tencent.mm.plugin.nfc.c.a> paramList, boolean paramBoolean1, boolean paramBoolean2)
  {
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      boolean bool = a((com.tencent.mm.plugin.nfc.c.a)paramList.next());
      if ((!bool) && (paramBoolean1)) {
        return false;
      }
      if ((bool) && (paramBoolean2)) {
        return false;
      }
    }
    return true;
  }
  
  public final int dW(Context paramContext)
  {
    int j = 2;
    paramContext = NfcAdapter.getDefaultAdapter(paramContext);
    int i;
    if (paramContext == null)
    {
      x.i("MicroMsg.ApduEngine", "[NFC] No nfc chip !");
      i = 0;
    }
    for (;;)
    {
      return i;
      if (!paramContext.isEnabled()) {
        return 1;
      }
      if (this.lFk == null) {
        return 4;
      }
      i = j;
      try
      {
        if (this.lFk != null)
        {
          boolean bool = this.lFk.isConnected();
          i = j;
          if (bool) {
            return 3;
          }
        }
      }
      catch (IOException paramContext)
      {
        x.e("MicroMsg.ApduEngine", "[NFC] IOException : " + paramContext.toString());
      }
    }
    return 2;
  }
  
  public final int dX(Context paramContext)
  {
    int i = dW(paramContext);
    if ((i != 3) && (i != 2)) {
      return i;
    }
    try
    {
      if (this.lFk != null)
      {
        this.lFk.connect();
        boolean bool = this.lFk.isConnected();
        if (bool) {
          return 3;
        }
      }
      return 2;
    }
    catch (IOException paramContext)
    {
      x.e("MicroMsg.ApduEngine", "[NFC] IOException : " + paramContext.toString());
    }
    return 2;
  }
  
  public final String getInfo()
  {
    if (this.lFg == null)
    {
      x.w("MicroMsg.ApduEngine", "lo-nfc-getInfo: tag null");
      return null;
    }
    long l = bi.VF();
    JSONObject localJSONObject2 = new JSONObject();
    x.d("MicroMsg.ApduEngine", "lo-nfc-getInfo: mTechList = " + this.lFj.size());
    Iterator localIterator = this.lFj.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      x.d("MicroMsg.ApduEngine", "lo-nfc-getInfo: tech = " + str);
      Object localObject;
      JSONObject localJSONObject1;
      for (;;)
      {
        try
        {
          if (!str.equals(NfcA.class.getName())) {
            break label241;
          }
          localObject = NfcA.get(this.lFg);
          if (localObject == null)
          {
            x.w("MicroMsg.ApduEngineNfcA", "lo-nfc-getInfoJsonObject: get nfcA null");
            str = null;
            localJSONObject2.put(NfcA.class.getSimpleName(), str);
          }
        }
        catch (JSONException localJSONException)
        {
          x.w("MicroMsg.ApduEngine", "lo-nfc-getInfo: exp:+" + localJSONException.getLocalizedMessage());
          return localJSONObject2.toString();
        }
        localJSONObject1 = new JSONObject();
        localJSONObject1.put("atqa", com.tencent.mm.plugin.nfc.d.a.byteArrayToHexString(((NfcA)localObject).getAtqa()));
        localJSONObject1.put("sak", com.tencent.mm.plugin.nfc.d.a.byteArrayToHexString(com.tencent.mm.plugin.nfc.d.a.b(((NfcA)localObject).getSak())));
      }
      label241:
      if (localJSONObject1.equals(IsoDep.class.getName()))
      {
        localObject = IsoDep.get(this.lFg);
        if (localObject == null)
        {
          x.w("MicroMsg.ApduEngineIsoDep", "lo-nfc-getInfoJsonObject: get IsoDep null");
          localJSONObject1 = null;
        }
        for (;;)
        {
          localJSONObject2.put(IsoDep.class.getSimpleName(), localJSONObject1);
          break;
          localJSONObject1 = new JSONObject();
          localJSONObject1.put("hiLayerResponse", com.tencent.mm.plugin.nfc.d.a.byteArrayToHexString(((IsoDep)localObject).getHiLayerResponse()));
          localJSONObject1.put("historicalBytes", com.tencent.mm.plugin.nfc.d.a.byteArrayToHexString(((IsoDep)localObject).getHistoricalBytes()));
        }
      }
    }
    x.v("MicroMsg.ApduEngine", "lo-nfc-getInfo: cost=" + (bi.VF() - l));
    x.v("MicroMsg.ApduEngine", "lo-nfc-getInfo: res=" + localJSONObject2.toString());
    return localJSONObject2.toString();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/nfc/c/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */