package com.tencent.mm.storage.emotion;

import org.json.JSONException;
import org.json.JSONObject;

public final class u
{
  public String aAL;
  public long dDj;
  public int position;
  public int tdg;
  
  public final JSONObject bpY()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("key", this.aAL);
      localJSONObject.put("position", this.position);
      localJSONObject.put("use_count", this.tdg);
      localJSONObject.put("last_time", this.dDj);
      return localJSONObject;
    }
    catch (JSONException localJSONException) {}
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/storage/emotion/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */