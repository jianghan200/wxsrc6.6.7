package com.tencent.mm.pluginsdk.d.a;

import android.database.MatrixCursor;
import com.tencent.mm.sdk.platformtools.x;

public final class a
{
  public static final String[] qyy = { "retCode", "url" };
  
  public static MatrixCursor BA(int paramInt)
  {
    x.i("MicroMsg.ExtCommonUtils", "returnMatrix = " + paramInt);
    MatrixCursor localMatrixCursor = new MatrixCursor(com.tencent.mm.plugin.ext.b.a.iJr);
    localMatrixCursor.addRow(new Object[] { Integer.valueOf(paramInt) });
    return localMatrixCursor;
  }
  
  public static MatrixCursor SI(String paramString)
  {
    x.i("MicroMsg.ExtCommonUtils", "returnMatrix = 4207");
    MatrixCursor localMatrixCursor = new MatrixCursor(qyy);
    localMatrixCursor.addRow(new Object[] { Integer.valueOf(4207), paramString });
    return localMatrixCursor;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/pluginsdk/d/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */