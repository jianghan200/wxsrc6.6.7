package com.tencent.mm.plugin.card.b;

import android.text.TextUtils;
import com.tencent.mm.plugin.card.model.CardInfo;
import java.util.HashMap;
import java.util.Map;

public final class e
{
  public Map<String, Object> htT = new HashMap();
  public CardInfo hts = null;
  
  public e()
  {
    this.htT.clear();
  }
  
  public final Object getValue(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {}
    while (!this.htT.containsKey(paramString)) {
      return null;
    }
    return this.htT.get(paramString);
  }
  
  public final void putValue(String paramString, Object paramObject)
  {
    if (TextUtils.isEmpty(paramString)) {
      return;
    }
    this.htT.put(paramString, paramObject);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/card/b/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */