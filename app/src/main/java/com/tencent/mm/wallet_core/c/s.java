package com.tencent.mm.wallet_core.c;

import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import java.util.Iterator;
import java.util.Vector;
import org.json.JSONArray;
import org.json.JSONObject;

public final class s
{
  private static s uXE;
  public String TAG = "MicroMsg.WalletDigCertManager";
  public String uXA = "";
  public String uXB = "";
  public String uXC = "";
  public Vector<r> uXD = new Vector();
  private int uXy = 0;
  public String uXz = "";
  
  public static void abU(String paramString)
  {
    g.Ek();
    g.Ei().DT().a(aa.a.sUn, paramString);
  }
  
  public static String cDh()
  {
    g.Ek();
    return (String)g.Ei().DT().get(aa.a.sUn, "");
  }
  
  public static s cDi()
  {
    if (uXE == null) {
      uXE = new s();
    }
    return uXE;
  }
  
  public final void abV(String paramString)
  {
    if (bi.oW(paramString)) {}
    do
    {
      return;
      if (paramString.equals(cDh()))
      {
        this.uXy = 0;
        abU("");
        com.tencent.mm.sdk.platformtools.x.i(this.TAG, "clean token %s  stack %s ", new Object[] { paramString, bi.cjd().toString() });
        a.cCW();
        a.clearCert(paramString);
      }
      paramString = this.uXD.iterator();
    } while (!paramString.hasNext());
    paramString = (r)paramString.next();
    this.uXD.remove(paramString);
  }
  
  public final void aq(JSONObject paramJSONObject)
  {
    Object localObject = paramJSONObject.optJSONObject("cert_info");
    if (localObject == null) {}
    for (;;)
    {
      return;
      this.uXD = new Vector();
      int i = ((JSONObject)localObject).optInt("show_crt_info");
      this.uXy = ((JSONObject)localObject).optInt("is_crt_install");
      this.uXC = ((JSONObject)localObject).optString("crt_item_logo_url");
      this.uXz = ((JSONObject)localObject).optString("crt_entry_desc");
      this.uXA = ((JSONObject)localObject).optString("crt_entry_title");
      this.uXB = ((JSONObject)localObject).optString("crt_status_name");
      g.Ek();
      g.Ei().DT().a(aa.a.sUo, Integer.valueOf(i));
      paramJSONObject = cDh();
      localObject = ((JSONObject)localObject).optJSONArray("crt_list");
      if (localObject != null)
      {
        i = 0;
        while (i < ((JSONArray)localObject).length())
        {
          try
          {
            r localr = new r(((JSONArray)localObject).getJSONObject(i));
            if (localr.uXx == 0) {
              break label257;
            }
            if (bi.oW(paramJSONObject)) {
              com.tencent.mm.sdk.platformtools.x.i(this.TAG, "drop crt list no exist local drop: %s", new Object[] { localr.spW });
            } else if (localr.spW.equals(paramJSONObject)) {
              this.uXD.add(localr);
            }
          }
          catch (Exception localException)
          {
            com.tencent.mm.sdk.platformtools.x.i(this.TAG, "WalletDigCertManager error %s", new Object[] { localException.getMessage() });
          }
          com.tencent.mm.sdk.platformtools.x.i(this.TAG, "drop crt list %s drop: %s", new Object[] { paramJSONObject, localException.spW });
          break label267;
          label257:
          this.uXD.add(localException);
          label267:
          i += 1;
        }
      }
    }
  }
  
  public final boolean cDj()
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (!bi.oW(cDh()))
    {
      bool1 = bool2;
      if (this.uXy > 0) {
        bool1 = true;
      }
    }
    return bool1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/wallet_core/c/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */