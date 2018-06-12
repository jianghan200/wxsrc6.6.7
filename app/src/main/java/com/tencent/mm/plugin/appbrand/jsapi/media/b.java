package com.tencent.mm.plugin.appbrand.jsapi.media;

import android.support.b.a;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.LinkedList;
import java.util.List;

final class b
{
  static final String[] fUe;
  
  static
  {
    LinkedList localLinkedList = new LinkedList();
    Field[] arrayOfField = a.class.getDeclaredFields();
    int j = arrayOfField.length;
    int i = 0;
    for (;;)
    {
      Field localField;
      if (i < j) {
        localField = arrayOfField[i];
      }
      try
      {
        if ((Modifier.isFinal(localField.getModifiers())) && (Modifier.isStatic(localField.getModifiers())) && (localField.getName().startsWith("TAG_"))) {
          localLinkedList.add((String)localField.get(null));
        }
        i += 1;
        continue;
        fUe = (String[])localLinkedList.toArray(new String[localLinkedList.size()]);
        return;
      }
      catch (Exception localException)
      {
        for (;;) {}
      }
    }
  }
  
  static void a(a parama1, a parama2)
  {
    String[] arrayOfString = fUe;
    int j = arrayOfString.length;
    int i = 0;
    while (i < j)
    {
      String str1 = arrayOfString[i];
      String str2 = parama1.getAttribute(str1);
      if (str2 != null) {
        parama2.setAttribute(str1, str2);
      }
      i += 1;
    }
    parama2.saveAttributes();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/media/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */