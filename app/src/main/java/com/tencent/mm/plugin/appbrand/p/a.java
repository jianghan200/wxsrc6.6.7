package com.tencent.mm.plugin.appbrand.p;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.h;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class a
  extends i<a>
{
  public static final String[] dzV = { i.a(a.fgt, "AppBrandCommonKVBinaryData") };
  
  public a(e parame)
  {
    super(parame, a.fgt, "AppBrandCommonKVBinaryData", null);
  }
  
  public final <T extends com.tencent.mm.bk.a> T g(String paramString, Class<T> paramClass)
  {
    Object localObject;
    if (!bi.oW(paramString))
    {
      localObject = new a();
      ((a)localObject).field_key = paramString;
      if (!super.b((c)localObject, new String[0])) {}
    }
    for (paramString = ((a)localObject).field_value; bi.bC(paramString); paramString = null) {
      return null;
    }
    try
    {
      localObject = (com.tencent.mm.bk.a)paramClass.newInstance();
      ((com.tencent.mm.bk.a)localObject).aG(paramString);
      return (T)localObject;
    }
    catch (Exception paramString)
    {
      x.e("MicroMsg.AppBrandCommonKVBinaryDataStorage", "getProto class[%s] e = %s", new Object[] { paramClass.getSimpleName(), paramString });
    }
    return null;
  }
  
  public final void m(String paramString, byte[] paramArrayOfByte)
  {
    if (bi.oW(paramString)) {
      return;
    }
    a locala = new a();
    locala.field_key = paramString;
    locala.field_value = paramArrayOfByte;
    super.a(locala);
  }
  
  static final class a
    extends c
  {
    static final c.a fgt = I(a.class);
    @h(cjs="$$invalid", cjt=1)
    public String field_key;
    public byte[] field_value;
    
    protected final c.a AX()
    {
      return fgt;
    }
    
    public final void d(Cursor paramCursor)
    {
      this.field_key = paramCursor.getString(0);
      this.field_value = paramCursor.getBlob(1);
    }
    
    public final ContentValues wH()
    {
      ContentValues localContentValues = new ContentValues(2);
      localContentValues.put("key", this.field_key);
      localContentValues.put("value", this.field_value);
      return localContentValues;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/p/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */