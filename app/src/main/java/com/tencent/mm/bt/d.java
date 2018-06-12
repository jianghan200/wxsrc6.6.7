package com.tencent.mm.bt;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import android.util.SparseArray;
import com.tencent.mm.bt.a.a;
import com.tencent.mm.bt.a.f.a;
import java.util.HashMap;

public final class d
  implements Cursor, com.tencent.mm.bt.a.d
{
  private static Cursor tds;
  
  public static Cursor cnR()
  {
    if (tds == null) {
      tds = new d();
    }
    return tds;
  }
  
  public final boolean Dx(int paramInt)
  {
    return false;
  }
  
  public final a Dy(int paramInt)
  {
    return null;
  }
  
  public final void Dz(int paramInt) {}
  
  public final void a(f.a parama) {}
  
  public final boolean a(Object paramObject, a parama)
  {
    return false;
  }
  
  public final void close() {}
  
  public final boolean cm(Object paramObject)
  {
    return false;
  }
  
  public final a cn(Object paramObject)
  {
    return null;
  }
  
  public final SparseArray[] cnS()
  {
    return null;
  }
  
  public final HashMap cnT()
  {
    return null;
  }
  
  public final boolean cnU()
  {
    return false;
  }
  
  public final void copyStringToBuffer(int paramInt, CharArrayBuffer paramCharArrayBuffer) {}
  
  public final void deactivate() {}
  
  public final byte[] getBlob(int paramInt)
  {
    return null;
  }
  
  public final int getColumnCount()
  {
    return 0;
  }
  
  public final int getColumnIndex(String paramString)
  {
    return 0;
  }
  
  public final int getColumnIndexOrThrow(String paramString)
  {
    return 0;
  }
  
  public final String getColumnName(int paramInt)
  {
    return null;
  }
  
  public final String[] getColumnNames()
  {
    return null;
  }
  
  public final int getCount()
  {
    return 0;
  }
  
  public final double getDouble(int paramInt)
  {
    return 0.0D;
  }
  
  public final Bundle getExtras()
  {
    return null;
  }
  
  public final float getFloat(int paramInt)
  {
    return 0.0F;
  }
  
  public final int getInt(int paramInt)
  {
    return 0;
  }
  
  public final long getLong(int paramInt)
  {
    return 0L;
  }
  
  public final Uri getNotificationUri()
  {
    return null;
  }
  
  public final int getPosition()
  {
    return 0;
  }
  
  public final short getShort(int paramInt)
  {
    return 0;
  }
  
  public final String getString(int paramInt)
  {
    return null;
  }
  
  public final int getType(int paramInt)
  {
    return 0;
  }
  
  public final boolean getWantsAllOnMoveCalls()
  {
    return false;
  }
  
  public final boolean isAfterLast()
  {
    return true;
  }
  
  public final boolean isBeforeFirst()
  {
    return false;
  }
  
  public final boolean isClosed()
  {
    return false;
  }
  
  public final boolean isFirst()
  {
    return false;
  }
  
  public final boolean isLast()
  {
    return false;
  }
  
  public final boolean isNull(int paramInt)
  {
    return false;
  }
  
  public final void lo(boolean paramBoolean) {}
  
  public final boolean move(int paramInt)
  {
    return false;
  }
  
  public final boolean moveToFirst()
  {
    return false;
  }
  
  public final boolean moveToLast()
  {
    return false;
  }
  
  public final boolean moveToNext()
  {
    return false;
  }
  
  public final boolean moveToPosition(int paramInt)
  {
    return false;
  }
  
  public final boolean moveToPrevious()
  {
    return false;
  }
  
  public final void registerContentObserver(ContentObserver paramContentObserver) {}
  
  public final void registerDataSetObserver(DataSetObserver paramDataSetObserver) {}
  
  public final boolean requery()
  {
    return false;
  }
  
  public final Bundle respond(Bundle paramBundle)
  {
    return null;
  }
  
  public final void setExtras(Bundle paramBundle) {}
  
  public final void setNotificationUri(ContentResolver paramContentResolver, Uri paramUri) {}
  
  public final void unregisterContentObserver(ContentObserver paramContentObserver) {}
  
  public final void unregisterDataSetObserver(DataSetObserver paramDataSetObserver) {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/bt/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */