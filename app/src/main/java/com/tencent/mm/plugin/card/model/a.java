package com.tencent.mm.plugin.card.model;

import android.text.TextUtils;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class a
{
  public String dxh;
  public int end_time;
  public String hoj;
  public String huU;
  public int huV;
  public String huW;
  public String huX;
  public String huY;
  public String huZ;
  public String hva;
  public String hvb;
  public int hvc;
  public String hvd;
  public String hve;
  public String hvf;
  public boolean hvg;
  public String title;
  public String userName;
  
  private static LinkedList<a> a(JSONArray paramJSONArray, boolean paramBoolean)
  {
    if ((paramJSONArray == null) || (paramJSONArray.length() == 0)) {
      return null;
    }
    LinkedList localLinkedList = new LinkedList();
    int i = 0;
    while (i < paramJSONArray.length())
    {
      JSONObject localJSONObject = paramJSONArray.getJSONObject(i);
      a locala = new a();
      locala.huU = localJSONObject.optString("card_tp_id");
      locala.huV = localJSONObject.optInt("card_type");
      locala.dxh = localJSONObject.optString("color");
      locala.huW = localJSONObject.optString("logo_url");
      locala.title = localJSONObject.optString("title");
      locala.huX = localJSONObject.optString("sub_title");
      locala.huY = localJSONObject.optString("aux_title");
      locala.huZ = localJSONObject.optString("encrypt_code");
      locala.userName = localJSONObject.optString("from_user_name");
      locala.hva = localJSONObject.optString("app_id");
      locala.end_time = localJSONObject.optInt("end_time");
      locala.hvb = localJSONObject.optString("card_user_id");
      locala.hvc = localJSONObject.optInt("choose_optional");
      locala.hve = localJSONObject.optString("invoice_item");
      locala.hvf = localJSONObject.optString("invoice_status");
      locala.hvd = localJSONObject.optString("invoice_title");
      locala.hvg = paramBoolean;
      localLinkedList.add(locala);
      i += 1;
    }
    return localLinkedList;
  }
  
  public static LinkedList<a> xk(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return null;
    }
    try
    {
      paramString = a(new JSONObject(paramString).optJSONArray("available_cards"), false);
      return paramString;
    }
    catch (JSONException paramString)
    {
      x.printErrStackTrace("MicroMsg.AvailableCardItem", paramString, "", new Object[0]);
    }
    return null;
  }
  
  public static LinkedList<a> xl(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return null;
    }
    try
    {
      paramString = a(new JSONObject(paramString).optJSONArray("available_share_cards"), true);
      return paramString;
    }
    catch (JSONException paramString)
    {
      x.printErrStackTrace("MicroMsg.AvailableCardItem", paramString, "", new Object[0]);
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/card/model/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */