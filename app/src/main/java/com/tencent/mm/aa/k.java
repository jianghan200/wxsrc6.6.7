package com.tencent.mm.aa;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.a.f;
import com.tencent.mm.bt.h;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.List;
import junit.framework.Assert;

public final class k
  extends com.tencent.mm.sdk.e.j
{
  public static final String[] diD = { "CREATE TABLE IF NOT EXISTS img_flag ( username VARCHAR(40) PRIMARY KEY , imgflag int , lastupdatetime int , reserved1 text ,reserved2 text ,reserved3 int ,reserved4 int )", "CREATE INDEX IF NOT EXISTS img_flag_small_url_index ON img_flag ( reserved2 )" };
  h dCZ;
  final f<String, j> dHU = new f(800);
  
  public k(h paramh)
  {
    this.dCZ = paramh;
  }
  
  public final boolean L(List<j> paramList)
  {
    if (paramList.size() == 0) {
      return false;
    }
    long l = this.dCZ.dO(Thread.currentThread().getId());
    int i = 0;
    try
    {
      while (i < paramList.size())
      {
        a((j)paramList.get(i));
        i += 1;
      }
      bool = true;
    }
    catch (Exception paramList)
    {
      for (;;)
      {
        x.e("MicroMsg.ImgFlagStorage", paramList.getMessage());
        boolean bool = false;
      }
    }
    this.dCZ.gp(l);
    return bool;
  }
  
  public final boolean a(j paramj)
  {
    x.i("MicroMsg.ImgFlagStorage", "new smallImageUrl = %s, bigImageUrl = %s", new Object[] { paramj.Ky(), paramj.Kx() });
    Object localObject = kc(paramj.getUsername());
    boolean bool2;
    if (localObject == null)
    {
      this.dHU.m(paramj.getUsername(), paramj);
      if ((paramj != null) && (paramj.getUsername() != null))
      {
        bool1 = true;
        Assert.assertTrue(bool1);
        paramj.dHP = ((int)(System.currentTimeMillis() / 1000L));
        paramj.Kz();
        paramj.bWA = -1;
        localObject = paramj.Kw();
        if ((int)this.dCZ.insert("img_flag", "username", (ContentValues)localObject) < 0) {
          break label143;
        }
      }
      label143:
      for (bool1 = true;; bool1 = false)
      {
        bool2 = bool1;
        if (bool1)
        {
          b(paramj.getUsername(), 2, paramj.getUsername());
          bool2 = bool1;
        }
        return bool2;
        bool1 = false;
        break;
      }
    }
    x.i("MicroMsg.ImgFlagStorage", "old, smallImageUrl = %s, bigImageUrl = %s", new Object[] { ((j)localObject).Ky(), ((j)localObject).Kx() });
    this.dHU.remove(paramj.getUsername());
    if ((paramj != null) && (paramj.getUsername() != null))
    {
      bool1 = true;
      label200:
      Assert.assertTrue(bool1);
      paramj.dHP = ((int)(System.currentTimeMillis() / 1000L));
      paramj.bWA |= 0x4;
      localObject = paramj.Kw();
      if (this.dCZ.update("img_flag", (ContentValues)localObject, "username=?", new String[] { paramj.getUsername() }) <= 0) {
        break label300;
      }
    }
    label300:
    for (boolean bool1 = true;; bool1 = false)
    {
      bool2 = bool1;
      if (!bool1) {
        break;
      }
      b(paramj.getUsername(), 3, paramj.getUsername());
      return bool1;
      bool1 = false;
      break label200;
    }
  }
  
  public final j kc(String paramString)
  {
    Object localObject = (j)this.dHU.get(paramString);
    if ((localObject != null) && (((j)localObject).getUsername().equals(paramString))) {
      return (j)localObject;
    }
    localObject = "select img_flag.username,img_flag.imgflag,img_flag.lastupdatetime,img_flag.reserved1,img_flag.reserved2,img_flag.reserved3,img_flag.reserved4 from img_flag where img_flag.username=\"" + bi.oU(paramString) + "\"";
    Cursor localCursor = this.dCZ.b((String)localObject, null, 2);
    if (localCursor == null) {
      return null;
    }
    if (localCursor.moveToFirst())
    {
      localObject = new j();
      ((j)localObject).d(localCursor);
    }
    for (;;)
    {
      localCursor.close();
      this.dHU.m(paramString, localObject);
      return (j)localObject;
      localObject = null;
    }
  }
  
  public final void kd(String paramString)
  {
    if (bi.oW(paramString)) {
      return;
    }
    this.dHU.remove(paramString);
    this.dCZ.delete("img_flag", "username=?", new String[] { paramString });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/aa/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */