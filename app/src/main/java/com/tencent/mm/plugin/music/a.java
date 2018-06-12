package com.tencent.mm.plugin.music;

import android.content.ContentValues;
import android.text.TextUtils;
import com.tencent.mm.plugin.music.cache.d;
import com.tencent.mm.plugin.music.model.h;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;

public final class a
  implements com.tencent.mm.an.a.a
{
  public final void P(String paramString, int paramInt)
  {
    com.tencent.mm.plugin.music.model.f.b localb = h.bih();
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("fileCacheComplete", Integer.valueOf(paramInt));
    x.i("MicroMsg.PieceMusicInfoStorage", "updateMusicFileCacheComplete raw=%d musicId=%s fileCacheComplete=%d", new Object[] { Integer.valueOf(localb.diF.update("PieceMusicInfo", localContentValues, "musicId=?", new String[] { paramString })), paramString, Integer.valueOf(paramInt) });
    paramString = (com.tencent.mm.an.f)localb.lzX.get(paramString);
    if (paramString != null) {
      paramString.field_fileCacheComplete = paramInt;
    }
  }
  
  public final void aq(String paramString1, String paramString2)
  {
    Object localObject = h.bih().ID(paramString1);
    if (localObject == null) {
      x.e("MicroMsg.PieceDataSourceImp", "setMusicMIMETypeByMusicId pMusic is null!'");
    }
    do
    {
      return;
      if ((!TextUtils.isEmpty(((com.tencent.mm.an.f)localObject).field_pieceFileMIMEType)) && (((com.tencent.mm.an.f)localObject).field_pieceFileMIMEType.equals(paramString2))) {
        break;
      }
      x.e("MicroMsg.PieceDataSourceImp", "updatePieceFileMIMEType()'");
      localObject = h.bih();
      ContentValues localContentValues = new ContentValues();
      localContentValues.put("pieceFileMIMEType", paramString2);
      x.i("MicroMsg.PieceMusicInfoStorage", "updatePieceFileMIMEType raw=%d musicId=%s", new Object[] { Integer.valueOf(((com.tencent.mm.plugin.music.model.f.b)localObject).diF.update("PieceMusicInfo", localContentValues, "musicId=?", new String[] { paramString1 })), paramString1 });
      paramString1 = (com.tencent.mm.an.f)((com.tencent.mm.plugin.music.model.f.b)localObject).lzX.get(paramString1);
    } while (paramString1 == null);
    paramString1.field_pieceFileMIMEType = paramString2;
    return;
    x.i("MicroMsg.PieceDataSourceImp", "don't need update the piece fle mime type");
  }
  
  public final void k(String paramString, byte[] paramArrayOfByte)
  {
    com.tencent.mm.plugin.music.model.f.b localb = h.bih();
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("indexBitData", paramArrayOfByte);
    int i = localb.diF.update("PieceMusicInfo", localContentValues, "musicId=?", new String[] { paramString });
    if (i <= 0) {
      x.i("MicroMsg.PieceMusicInfoStorage", "updateMusicFileIndexBitCache raw=%d musicId=%s", new Object[] { Integer.valueOf(i), paramString });
    }
    paramString = (com.tencent.mm.an.f)localb.lzX.get(paramString);
    if (paramString != null) {
      paramString.field_indexBitData = paramArrayOfByte;
    }
  }
  
  public final com.tencent.mm.an.f mr(String paramString)
  {
    paramString = h.bih().ID(paramString);
    if (paramString == null) {
      x.e("MicroMsg.PieceDataSourceImp", "initData pMusic is null!'");
    }
    return paramString;
  }
  
  public final String ms(String paramString)
  {
    com.tencent.mm.plugin.music.model.f.b localb = h.bih();
    com.tencent.mm.an.f localf;
    String str;
    if (TextUtils.isEmpty(paramString))
    {
      x.i("MicroMsg.PieceMusicInfoStorage", "updatePieceMusicByUrl url is empty!");
      localf = null;
      if (localf != null)
      {
        paramString = new ArrayList(1);
        paramString.add(localf.field_musicId);
        new d(paramString).bhJ();
        return localf.field_musicId;
      }
    }
    else
    {
      str = com.tencent.mm.plugin.music.d.a.IE(paramString);
      localf = localb.ID(str);
      if (localf != null) {
        break label187;
      }
      localf = new com.tencent.mm.an.f();
    }
    label187:
    for (int i = 0;; i = 1)
    {
      localf.field_musicId = str;
      localf.field_musicUrl = paramString;
      localf.field_fileName = com.tencent.mm.plugin.music.d.a.IF(paramString);
      x.i("MicroMsg.PieceMusicInfoStorage", "updatePieceMusicByUrl musicId:%s, field_fileName:%s", new Object[] { str, localf.field_fileName });
      if (i != 0)
      {
        x.i("MicroMsg.PieceMusicInfoStorage", "update PieceMusicInfo");
        localb.c(localf, new String[0]);
      }
      for (;;)
      {
        localb.lzX.put(str, localf);
        break;
        x.i("MicroMsg.PieceMusicInfoStorage", "insert PieceMusicInfo");
        localb.b(localf);
      }
      return null;
    }
  }
  
  public final void mt(String paramString)
  {
    com.tencent.mm.plugin.music.model.f.b localb = h.bih();
    x.i("MicroMsg.PieceMusicInfoStorage", "deletePieceMusicInfo raw=%d musicId=%s", new Object[] { Integer.valueOf(localb.diF.delete("PieceMusicInfo", "musicId=?", new String[] { paramString })), paramString });
    localb.lzX.remove(paramString);
  }
  
  public final String mu(String paramString)
  {
    paramString = h.bih().ID(paramString);
    if (paramString == null)
    {
      x.e("MicroMsg.PieceDataSourceImp", "getMusicMIMETypeByMusicId pMusic is null!'");
      return null;
    }
    x.i("MicroMsg.PieceDataSourceImp", "music field_pieceFileMIMEType:%s", new Object[] { paramString.field_pieceFileMIMEType });
    if (TextUtils.isEmpty(paramString.field_pieceFileMIMEType))
    {
      x.e("MicroMsg.PieceDataSourceImp", "field_pieceFileMIMEType is null!'");
      return null;
    }
    return paramString.field_pieceFileMIMEType;
  }
  
  public final String mv(String paramString)
  {
    return com.tencent.mm.plugin.music.model.a.b.mv(paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/music/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */