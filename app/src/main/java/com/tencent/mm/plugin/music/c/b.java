package com.tencent.mm.plugin.music.c;

import com.tencent.mm.z.d;
import com.tencent.qqmusic.mediaplayer.upstream.IDataSource;
import com.tencent.qqmusic.mediaplayer.upstream.IDataSource.Factory;

public final class b
  implements IDataSource.Factory
{
  public d dGy;
  
  public b(d paramd)
  {
    this.dGy = paramd;
  }
  
  public final IDataSource createDataSource()
  {
    return new a(this.dGy);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/music/c/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */