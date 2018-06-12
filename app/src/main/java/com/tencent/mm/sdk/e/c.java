package com.tencent.mm.sdk.e;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import junit.framework.Assert;

public abstract class c
{
  public long sKx = -1L;
  
  public static a I(Class<?> paramClass)
  {
    a locala = new a();
    LinkedList localLinkedList = new LinkedList();
    Field[] arrayOfField = paramClass.getDeclaredFields();
    int j = arrayOfField.length;
    int i = 0;
    if (i < j)
    {
      Field localField = arrayOfField[i];
      int k = localField.getModifiers();
      String str = localField.getName();
      if ((str != null) && (Modifier.isPublic(k)) && (!Modifier.isFinal(k)))
      {
        if (!str.startsWith("field_")) {
          break label165;
        }
        paramClass = str.substring(6);
        label91:
        if (!localField.isAnnotationPresent(h.class)) {
          break label171;
        }
        if (((h)localField.getAnnotation(h.class)).cjt() == 1) {
          locala.sKz = paramClass;
        }
      }
      for (;;)
      {
        if (!bi.oW(paramClass))
        {
          if (paramClass.equals("rowid")) {
            Assert.assertTrue("field_rowid reserved by MAutoDBItem, change now!", false);
          }
          localLinkedList.add(localField);
        }
        label165:
        label171:
        do
        {
          i += 1;
          break;
          paramClass = str;
          break label91;
        } while (!str.startsWith("field_"));
      }
    }
    locala.sKy = ((Field[])localLinkedList.toArray(new Field[0]));
    locala.columns = a(locala.sKy);
    locala.sKA = b(locala.sKy);
    locala.sql = c(locala.sKy);
    return locala;
  }
  
  public static String a(Field paramField)
  {
    if (paramField == null) {}
    do
    {
      return null;
      paramField = paramField.getName();
    } while ((paramField == null) || (paramField.length() <= 0));
    if (paramField.startsWith("field_")) {
      return paramField.substring(6);
    }
    return paramField;
  }
  
  public static boolean a(ContentValues paramContentValues, Cursor paramCursor)
  {
    if (paramContentValues == null) {
      return paramCursor == null;
    }
    if ((paramCursor == null) || (paramCursor.getCount() != 1)) {
      return false;
    }
    paramCursor.moveToFirst();
    int k = paramCursor.getColumnCount();
    int j = paramContentValues.size();
    int i = j;
    if (paramContentValues.containsKey("rowid")) {
      i = j - 1;
    }
    j = k;
    if (paramCursor.getColumnIndex("rowid") != -1) {
      j = k - 1;
    }
    if (i != j) {
      return false;
    }
    label219:
    label319:
    label331:
    label352:
    label357:
    label364:
    label367:
    for (;;)
    {
      Object localObject;
      byte[] arrayOfByte;
      try
      {
        Iterator localIterator = paramContentValues.valueSet().iterator();
        if (localIterator.hasNext())
        {
          localObject = (String)((Map.Entry)localIterator.next()).getKey();
          if (((String)localObject).equals("rowid")) {
            continue;
          }
          i = paramCursor.getColumnIndex((String)localObject);
          if (i == -1) {
            return false;
          }
          if ((paramContentValues.get((String)localObject) instanceof byte[]))
          {
            localObject = (byte[])paramContentValues.get((String)localObject);
            arrayOfByte = paramCursor.getBlob(i);
            if (localObject != null) {
              break label319;
            }
            if (arrayOfByte == null) {
              break label364;
            }
            break label319;
            if (localObject.length == arrayOfByte.length) {
              break label352;
            }
            i = 0;
            break label331;
            if (i >= localObject.length) {
              break label364;
            }
            if (localObject[i] == arrayOfByte[i]) {
              break label357;
            }
            i = 0;
            break label331;
          }
          if ((paramCursor.getString(i) == null) && (paramContentValues.get((String)localObject) != null)) {
            return false;
          }
          if (paramContentValues.get((String)localObject) == null) {
            return false;
          }
          boolean bool = paramContentValues.get((String)localObject).toString().equals(paramCursor.getString(i));
          if (bool) {
            continue;
          }
          return false;
        }
      }
      catch (Exception paramContentValues)
      {
        x.printErrStackTrace("MicroMsg.SDK.IAutoDBItem", paramContentValues, "", new Object[0]);
        return false;
      }
      return true;
      if ((localObject == null) && (arrayOfByte != null)) {
        i = 0;
      }
      for (;;)
      {
        if (i != 0) {
          break label367;
        }
        return false;
        if ((localObject == null) || (arrayOfByte != null)) {
          break;
        }
        i = 0;
        continue;
        i = 0;
        break label219;
        i += 1;
        break label219;
        i = 1;
      }
    }
  }
  
  private static String[] a(Field[] paramArrayOfField)
  {
    String[] arrayOfString = new String[paramArrayOfField.length + 1];
    int i = 0;
    if (i < paramArrayOfField.length)
    {
      arrayOfString[i] = a(paramArrayOfField[i]);
      String str = "getFullColumns failed:" + paramArrayOfField[i].getName();
      if (!bi.oW(arrayOfString[i])) {}
      for (boolean bool = true;; bool = false)
      {
        Assert.assertTrue(str, bool);
        i += 1;
        break;
      }
    }
    arrayOfString[paramArrayOfField.length] = "rowid";
    return arrayOfString;
  }
  
  private static Map<String, String> b(Field[] paramArrayOfField)
  {
    HashMap localHashMap = new HashMap();
    int i = 0;
    if (i < paramArrayOfField.length)
    {
      Object localObject = paramArrayOfField[i];
      String str = b.H(((Field)localObject).getType());
      if (str == null) {
        x.e("MicroMsg.SDK.IAutoDBItem", "failed identify on column: " + ((Field)localObject).getName() + ", skipped");
      }
      for (;;)
      {
        i += 1;
        break;
        localObject = a((Field)localObject);
        if (!bi.oW((String)localObject)) {
          localHashMap.put(localObject, str);
        }
      }
    }
    return localHashMap;
  }
  
  private static String c(Field[] paramArrayOfField)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    int i = 0;
    Field localField;
    Object localObject;
    String str2;
    String str1;
    if (i < paramArrayOfField.length)
    {
      localField = paramArrayOfField[i];
      localObject = b.H(localField.getType());
      if (localObject == null) {
        x.e("MicroMsg.SDK.IAutoDBItem", "failed identify on column: " + localField.getName() + ", skipped");
      }
      do
      {
        i += 1;
        break;
        str2 = a(localField);
      } while (bi.oW(str2));
      str1 = "";
      if (!localField.isAnnotationPresent(h.class)) {
        break label249;
      }
      str1 = " default '" + ((h)localField.getAnnotation(h.class)).cjs() + "' ";
    }
    label194:
    label236:
    label249:
    for (int j = ((h)localField.getAnnotation(h.class)).cjt();; j = 0)
    {
      localObject = new StringBuilder().append(str2).append(" ").append((String)localObject).append(str1);
      if (j == 1)
      {
        str1 = " PRIMARY KEY ";
        localStringBuilder.append(str1);
        if (i != paramArrayOfField.length - 1) {
          break label236;
        }
      }
      for (str1 = "";; str1 = ", ")
      {
        localStringBuilder.append(str1);
        break;
        str1 = "";
        break label194;
      }
      return localStringBuilder.toString();
    }
  }
  
  public abstract a AX();
  
  public abstract void d(Cursor paramCursor);
  
  public abstract ContentValues wH();
  
  public static final class a
  {
    public String[] columns;
    public Map<String, String> sKA = new HashMap();
    public Field[] sKy;
    public String sKz;
    public String sql;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/sdk/e/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */