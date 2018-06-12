package com.tencent.mm.plugin.game.model;

import com.tencent.mm.bk.a;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.sdk.platformtools.x;
import java.io.IOException;

public final class ab
  extends i<aa>
{
  public static final String[] diD = { i.a(aa.dhO, "GamePBCache") };
  
  public ab(e parame)
  {
    super(parame, aa.dhO, "GamePBCache", null);
  }
  
  public final byte[] Dw(String paramString)
  {
    if (bi.oW(paramString)) {}
    aa localaa;
    do
    {
      do
      {
        return null;
      } while (!w.chP().equals(f.aTF()));
      localaa = new aa();
      localaa.field_key = paramString;
    } while (!super.b(localaa, new String[0]));
    return localaa.field_value;
  }
  
  public final boolean a(String paramString, a parama)
  {
    if ((bi.oW(paramString)) || (parama == null)) {
      return false;
    }
    try
    {
      parama = parama.toByteArray();
      return p(paramString, parama);
    }
    catch (IOException paramString)
    {
      x.e("MicroMsg.GamePBCacheStorage", "Saving Failed: %s", new Object[] { paramString.getMessage() });
    }
    return false;
  }
  
  public final boolean p(String paramString, byte[] paramArrayOfByte)
  {
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (paramArrayOfByte != null)
    {
      if (paramArrayOfByte.length == 0) {
        bool2 = bool1;
      }
    }
    else {
      return bool2;
    }
    aa localaa = new aa();
    localaa.field_key = paramString;
    if (super.b(localaa, new String[0])) {
      localaa.field_value = paramArrayOfByte;
    }
    for (bool1 = super.c(localaa, new String[0]);; bool1 = super.b(localaa))
    {
      bool2 = bool1;
      if (bool1) {
        break;
      }
      x.e("MicroMsg.GamePBCacheStorage", "Saving cache failed (update or insert)");
      return bool1;
      localaa.field_value = paramArrayOfByte;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/game/model/ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */