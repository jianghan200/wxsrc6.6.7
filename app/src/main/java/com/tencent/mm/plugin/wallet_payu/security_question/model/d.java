package com.tencent.mm.plugin.wallet_payu.security_question.model;

import com.tencent.mm.wallet_core.e.a.a;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

public final class d
  extends a
{
  public ArrayList<PayUSecurityQuestion> pGk;
  
  public d()
  {
    F(new HashMap());
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    if (paramJSONObject != null)
    {
      this.pGk = new ArrayList();
      paramString = paramJSONObject.optJSONArray("security_question_list");
      if (paramString != null)
      {
        paramInt = 0;
        while (paramInt < paramString.length())
        {
          paramJSONObject = paramString.optJSONObject(paramInt);
          if (paramJSONObject != null)
          {
            paramJSONObject = new PayUSecurityQuestion(paramJSONObject.optString("id"), paramJSONObject.optString("description"));
            this.pGk.add(paramJSONObject);
          }
          paramInt += 1;
        }
      }
    }
  }
  
  public final int bOo()
  {
    return 11;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/wallet_payu/security_question/model/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */