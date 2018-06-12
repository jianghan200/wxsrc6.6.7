package com.tencent.mm.plugin.appbrand.config;

import java.util.LinkedList;
import org.json.JSONArray;

final class s
{
  static LinkedList<String> f(JSONArray paramJSONArray)
  {
    if (paramJSONArray == null) {
      return null;
    }
    LinkedList localLinkedList = new LinkedList();
    int i = 0;
    while (i < paramJSONArray.length())
    {
      localLinkedList.add(paramJSONArray.optString(i));
      i += 1;
    }
    return localLinkedList;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/config/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */