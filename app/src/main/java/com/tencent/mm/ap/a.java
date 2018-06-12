package com.tencent.mm.ap;

import android.view.View;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.bd;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import junit.framework.Assert;

public abstract class a
{
  public static String ebD = "";
  public static String ebE = "";
  public String TEXT;
  public String TYPE;
  public bd bXQ;
  public String ebF = "";
  public String ebG;
  public LinkedList<String> ebH = new LinkedList();
  public LinkedList<Integer> ebI = new LinkedList();
  public LinkedList<Integer> ebJ = new LinkedList();
  public Map<String, String> values;
  
  public a(Map<String, String> paramMap, bd parambd)
  {
    this.values = paramMap;
    this.bXQ = parambd;
  }
  
  public abstract boolean Qi();
  
  public static abstract class a
  {
    private static HashMap<String, a> ebK = new HashMap();
    
    public static void a(String paramString, a parama)
    {
      Assert.assertNotNull(paramString);
      Assert.assertNotNull(parama);
      synchronized (ebK)
      {
        ebK.put(paramString.toLowerCase(), parama);
        return;
      }
    }
    
    public static a b(Map<String, String> paramMap, bd parambd)
    {
      if (paramMap == null)
      {
        x.e("MicroMsg.BaseNewXmlMsg", "values is null !!!");
        return null;
      }
      String str = (String)paramMap.get(".sysmsg.$type");
      synchronized (ebK)
      {
        a locala = (a)ebK.get(str.toLowerCase());
        if (locala == null)
        {
          x.w("MicroMsg.BaseNewXmlMsg", "TYPE %s is unDefine", new Object[] { str });
          return null;
        }
        paramMap = locala.a(paramMap, parambd);
        return paramMap;
      }
    }
    
    public abstract a a(Map<String, String> paramMap, bd parambd);
  }
  
  public static abstract interface b
  {
    public abstract void a(View paramView, bd parambd, a parama, int paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/ap/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */