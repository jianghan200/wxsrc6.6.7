package com.tencent.mm.plugin.music.model.f;

import android.database.Cursor;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;

public final class b
  extends i<com.tencent.mm.an.f>
{
  public e diF;
  public com.tencent.mm.a.f<String, com.tencent.mm.an.f> lzX;
  
  public b(e parame)
  {
    super(parame, com.tencent.mm.an.f.dhO, "PieceMusicInfo", null);
    this.diF = parame;
    this.lzX = new com.tencent.mm.a.f(20);
  }
  
  public final com.tencent.mm.an.f ID(String paramString)
  {
    if (this.lzX.get(paramString) != null) {
      return (com.tencent.mm.an.f)this.lzX.get(paramString);
    }
    Object localObject = String.format("Select * From PieceMusicInfo Where musicId=?", new Object[0]);
    localObject = this.diF.b((String)localObject, new String[] { paramString }, 2);
    if ((localObject != null) && (((Cursor)localObject).moveToFirst()))
    {
      com.tencent.mm.an.f localf = new com.tencent.mm.an.f();
      localf.d((Cursor)localObject);
      ((Cursor)localObject).close();
      this.lzX.put(paramString, localf);
      return localf;
    }
    if (localObject != null) {
      ((Cursor)localObject).close();
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/music/model/f/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */