package com.tencent.mm.plugin.webview.fts.a.a;

import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONException;
import org.json.JSONObject;

public final class b
  extends a
{
  private String cca;
  private int x;
  private int y;
  
  public b(int paramInt1, int paramInt2, String paramString)
  {
    this.x = paramInt1;
    this.y = paramInt2;
    this.cca = paramString;
  }
  
  public final String bTM()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("x", this.x);
      localJSONObject.put("y", this.y);
      localJSONObject.put("eventId", this.cca);
      return localJSONObject.toString();
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        x.printErrStackTrace("onTap", localJSONException, "", new Object[0]);
      }
    }
  }
  
  public final String getName()
  {
    return "onTap";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/webview/fts/a/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */