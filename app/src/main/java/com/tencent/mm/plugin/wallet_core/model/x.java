package com.tencent.mm.plugin.wallet_core.model;

import com.tencent.mm.g.c.el;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.bi;
import java.lang.reflect.Field;
import java.util.Map;
import org.json.JSONObject;

public final class x
  extends el
{
  public static c.a dhO;
  
  static
  {
    c.a locala = new c.a();
    locala.sKy = new Field[6];
    locala.columns = new String[7];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "wallet_tpa_country";
    locala.sKA.put("wallet_tpa_country", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" wallet_tpa_country TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.sKz = "wallet_tpa_country";
    locala.columns[1] = "wallet_type";
    locala.sKA.put("wallet_type", "INTEGER");
    localStringBuilder.append(" wallet_type INTEGER");
    localStringBuilder.append(", ");
    locala.columns[2] = "wallet_name";
    locala.sKA.put("wallet_name", "TEXT");
    localStringBuilder.append(" wallet_name TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "wallet_selected";
    locala.sKA.put("wallet_selected", "INTEGER");
    localStringBuilder.append(" wallet_selected INTEGER");
    localStringBuilder.append(", ");
    locala.columns[4] = "wallet_balance";
    locala.sKA.put("wallet_balance", "INTEGER");
    localStringBuilder.append(" wallet_balance INTEGER");
    localStringBuilder.append(", ");
    locala.columns[5] = "wallet_tpa_country_mask";
    locala.sKA.put("wallet_tpa_country_mask", "INTEGER");
    localStringBuilder.append(" wallet_tpa_country_mask INTEGER");
    locala.columns[6] = "rowid";
    locala.sql = localStringBuilder.toString();
    dhO = locala;
  }
  
  public static x ak(JSONObject paramJSONObject)
  {
    if (paramJSONObject == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.WalletKindInfo", "json is null");
      return null;
    }
    x localx = new x();
    localx.field_wallet_tpa_country = paramJSONObject.optString("wallet_tpa_country");
    localx.field_wallet_name = paramJSONObject.optString("wallet_name");
    localx.field_wallet_selected = paramJSONObject.optInt("wallet_selected");
    localx.field_wallet_type = paramJSONObject.optInt("wallet_type");
    localx.field_wallet_balance = paramJSONObject.optInt("wallet_balance");
    localx.field_wallet_tpa_country_mask = paramJSONObject.optInt("wallet_tpa_country_mask");
    if (bi.oW(localx.field_wallet_tpa_country))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.WalletKindInfo", "wallet_id is illegal");
      return null;
    }
    return localx;
  }
  
  protected final c.a AX()
  {
    return dhO;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/model/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */