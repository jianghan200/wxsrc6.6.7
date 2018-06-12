package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.view.ViewGroup;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.s;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class k
  extends a
{
  int nDh = 0;
  
  public k(Context paramContext, s params, ViewGroup paramViewGroup)
  {
    super(paramContext, params, paramViewGroup);
  }
  
  public final boolean aa(JSONObject paramJSONObject)
  {
    if (!super.aa(paramJSONObject)) {
      return false;
    }
    try
    {
      paramJSONObject.put("clickCount", this.nDh);
      return true;
    }
    catch (JSONException paramJSONObject)
    {
      x.printErrStackTrace("MicroMsg.Sns.AdLandingPageBtnBaseComp", paramJSONObject, "", new Object[0]);
    }
    return false;
  }
  
  protected final void bzZ()
  {
    this.nDh += 1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */