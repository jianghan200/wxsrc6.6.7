package com.tencent.mm.ac;

import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class j
{
  public static String dMg = "menu_click";
  public static String dMh = "menu_action_start";
  public static String dMi = "menu_action_success";
  public String aAL;
  public String ceR;
  public String content;
  public List<j> dMj = null;
  public int dMk;
  public int id;
  public String name;
  public String state;
  public int type;
  public String value;
  
  public static List<j> c(JSONArray paramJSONArray)
  {
    Object localObject;
    if (paramJSONArray != null) {
      try
      {
        ArrayList localArrayList = new ArrayList();
        int j = paramJSONArray.length();
        int i = 0;
        for (;;)
        {
          localObject = localArrayList;
          if (i >= j) {
            break;
          }
          localObject = paramJSONArray.getJSONObject(i);
          j localj = new j();
          localj.id = ((JSONObject)localObject).getInt("id");
          localj.type = ((JSONObject)localObject).getInt("type");
          localj.name = ((JSONObject)localObject).getString("name");
          localj.aAL = ((JSONObject)localObject).getString("key");
          localj.value = ((JSONObject)localObject).optString("value");
          localj.ceR = ((JSONObject)localObject).optString("native_url");
          x.d("MicroMsg.BizMenuItem", "menuItem.nativeurl : " + localj.ceR);
          localj.dMj = c(((JSONObject)localObject).optJSONArray("sub_button_list"));
          localj.dMk = ((JSONObject)localObject).optInt("acttype");
          localArrayList.add(localj);
          i += 1;
        }
        localObject = null;
      }
      catch (JSONException paramJSONArray)
      {
        x.e("MicroMsg.BizMenuItem", "exception:%s", new Object[] { bi.i(paramJSONArray) });
        return null;
      }
    }
    return (List<j>)localObject;
  }
  
  public static LinkedList<j> s(Map<String, String> paramMap)
  {
    if (paramMap == null) {
      return null;
    }
    int j = bi.getInt((String)paramMap.get(".msg.appmsg.buttonlist.$count"), 0);
    if (j > 0) {
      try
      {
        LinkedList localLinkedList = new LinkedList();
        x.v("MicroMsg.BizMenuItem", "menuItem.jsonArray.length : " + j);
        int i = 0;
        if (i < j)
        {
          j localj = new j();
          StringBuilder localStringBuilder = new StringBuilder(".msg.appmsg.buttonlist.button");
          if (i == 0) {}
          for (String str = "";; str = String.valueOf(i))
          {
            str = str;
            localj.id = bi.getInt((String)paramMap.get(str + ".id"), 0);
            localj.type = bi.getInt((String)paramMap.get(str + ".type"), 0);
            localj.name = ((String)paramMap.get(str + ".name"));
            localj.aAL = ((String)paramMap.get(str + ".key"));
            localj.value = ((String)paramMap.get(str + ".value"));
            localj.dMk = bi.getInt((String)paramMap.get(str + ".acttype"), 0);
            localLinkedList.add(localj);
            i += 1;
            break;
          }
        }
        return localLinkedList;
      }
      catch (Exception paramMap)
      {
        x.e("MicroMsg.BizMenuItem", "exception:%s", new Object[] { bi.i(paramMap) });
        return null;
      }
    }
    return null;
  }
  
  public final void e(ArrayList<String> paramArrayList)
  {
    if (paramArrayList.size() == 0)
    {
      x.e("MicroMsg.BizMenuItem", "value null!");
      return;
    }
    JSONArray localJSONArray;
    try
    {
      localJSONArray = new JSONArray();
      paramArrayList = paramArrayList.iterator();
      while (paramArrayList.hasNext())
      {
        String str = (String)paramArrayList.next();
        JSONObject localJSONObject = new JSONObject();
        localJSONObject.put("pic_md5", str);
        localJSONArray.put(localJSONObject);
      }
      paramArrayList = new JSONObject();
    }
    catch (JSONException paramArrayList)
    {
      x.e("MicroMsg.BizMenuItem", paramArrayList.toString());
      return;
    }
    paramArrayList.put("pics", localJSONArray);
    this.content = paramArrayList.toString();
    x.v("MicroMsg.BizMenuItem", this.content);
  }
  
  public final String getInfo()
  {
    if (this.content == null) {
      this.content = "";
    }
    if (this.state == null) {
      if (this.type != 4) {
        break label81;
      }
    }
    label81:
    for (this.state = dMh;; this.state = dMg) {
      return String.format("%s<info><id><![CDATA[%d]]></id><key><![CDATA[%s]]></key><status><![CDATA[%s]]></status><content><![CDATA[%s]]></content></info>", new Object[] { "#bizmenu#", Integer.valueOf(this.id), this.aAL, this.state, this.content });
    }
  }
  
  public final String toString()
  {
    int i = this.id;
    int j = this.dMk;
    int k = this.type;
    String str1;
    String str2;
    label37:
    String str3;
    if (this.name == null)
    {
      str1 = "";
      if (this.aAL != null) {
        break label122;
      }
      str2 = "";
      if (this.value != null) {
        break label131;
      }
      str3 = "";
      label48:
      if (this.content != null) {
        break label140;
      }
    }
    label122:
    label131:
    label140:
    for (String str4 = "";; str4 = this.content)
    {
      return String.format("id:%d, type:%d, acttype:%s, name:%s, key:%s, value:%s, content:%s", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), str1, str2, str3, str4 });
      str1 = this.name;
      break;
      str2 = this.aAL;
      break label37;
      str3 = this.value;
      break label48;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/ac/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */