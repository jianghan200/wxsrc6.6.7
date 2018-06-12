package com.tencent.mm.plugin.card.d;

import android.text.TextUtils;
import com.tencent.mm.plugin.card.sharecard.model.j;
import com.tencent.mm.plugin.card.sharecard.model.q;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class r
{
  public static j ye(String paramString)
  {
    x.i("MicroMsg.ShareCardConsumedInfoParser", "parseShareCardConsumedInfoParser()");
    if (TextUtils.isEmpty(paramString))
    {
      x.e("MicroMsg.ShareCardConsumedInfoParser", "parseShareCardConsumedInfoParser json is empty");
      return null;
    }
    Object localObject;
    try
    {
      localObject = new JSONObject(paramString);
      paramString = new j();
      paramString.hyq = ((JSONObject)localObject).optString("consumed_box_id");
      paramString.hyr = ((JSONObject)localObject).optString("subscribe_wording");
      paramString.hys = ((JSONObject)localObject).optString("subscribe_app_username");
      localObject = ((JSONObject)localObject).optJSONArray("list");
      if ((localObject == null) || (((JSONArray)localObject).length() == 0))
      {
        x.e("MicroMsg.ShareCardConsumedInfoParser", "parseShareCardConsumedInfoParser cardItemListJson is null");
        return null;
      }
    }
    catch (JSONException paramString)
    {
      x.e("MicroMsg.ShareCardConsumedInfoParser", "parseShareCardConsumedInfoParser exception:" + paramString.getMessage());
      x.printErrStackTrace("MicroMsg.ShareCardConsumedInfoParser", paramString, "", new Object[0]);
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    while (i < ((JSONArray)localObject).length())
    {
      JSONObject localJSONObject = ((JSONArray)localObject).optJSONObject(i);
      q localq = new q();
      localq.cad = localJSONObject.optString("card_ext");
      localq.hvZ = f.B(localJSONObject.optJSONObject("card_tp_info"));
      localArrayList.add(localq);
      i += 1;
    }
    paramString.hyp = localArrayList;
    x.i("MicroMsg.ShareCardConsumedInfoParser", "parseShareCardConsumedInfoParser() tempList size is" + localArrayList.size());
    if (TextUtils.isEmpty(paramString.hyq)) {
      x.i("MicroMsg.ShareCardConsumedInfoParser", "parseShareCardConsumedInfoParser()  consumed_box_id is empty");
    }
    if (TextUtils.isEmpty(paramString.hyr)) {
      x.i("MicroMsg.ShareCardConsumedInfoParser", "parseShareCardConsumedInfoParser()  subscribe_wording is empty");
    }
    return paramString;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/card/d/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */