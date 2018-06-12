package com.tencent.mm.plugin.extqlauncher.provider;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import com.tencent.mm.bg.d;
import com.tencent.mm.g.c.am;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.ext.provider.ExtContentProviderBase;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.az;

public class ExtControlProviderQLauncher
  extends ExtContentProviderBase
{
  private static final UriMatcher iJT;
  private static final String[] iJr = { "retCode" };
  private static final String[] iLN = { "id", "count" };
  private Context context;
  private String[] iJE;
  private int iLO = -1;
  
  static
  {
    UriMatcher localUriMatcher = new UriMatcher(-1);
    iJT = localUriMatcher;
    localUriMatcher.addURI("com.tencent.mm.plugin.extqlauncher", "openQRCodeScan", 18);
    iJT.addURI("com.tencent.mm.plugin.extqlauncher", "batchAddShortcut", 19);
    iJT.addURI("com.tencent.mm.plugin.extqlauncher", "getUnreadCount", 20);
  }
  
  public ExtControlProviderQLauncher() {}
  
  public ExtControlProviderQLauncher(String[] paramArrayOfString, int paramInt, Context paramContext)
  {
    this.iJE = paramArrayOfString;
    this.iLO = paramInt;
    this.context = paramContext;
  }
  
  private Cursor t(String[] paramArrayOfString)
  {
    x.d("MicroMsg.ExtControlProviderQLauncher", "getUnreadCount");
    if (this.context == null)
    {
      pr(4);
      return null;
    }
    if ((paramArrayOfString == null) || (paramArrayOfString.length <= 0))
    {
      x.e("MicroMsg.ExtControlProviderQLauncher", "wrong args");
      pr(3);
      return null;
    }
    MatrixCursor localMatrixCursor = new MatrixCursor(iLN);
    int i = 0;
    for (;;)
    {
      try
      {
        if ((i >= paramArrayOfString.length) || (i >= 10)) {
          break label242;
        }
        if (bi.oW(paramArrayOfString[i])) {
          break label249;
        }
        Object localObject;
        if (paramArrayOfString[i].equals("0"))
        {
          localObject = paramArrayOfString[i];
          com.tencent.mm.plugin.extqlauncher.b.aJl();
          localMatrixCursor.addRow(new Object[] { localObject, Integer.valueOf(com.tencent.mm.plugin.extqlauncher.b.aJm()) });
        }
        else
        {
          localObject = com.tencent.mm.plugin.base.model.b.wL(paramArrayOfString[i]);
          if (!bi.oW((String)localObject))
          {
            au.HU();
            localObject = c.FW().Yq((String)localObject);
            if (localObject != null) {
              localMatrixCursor.addRow(new Object[] { paramArrayOfString[i], Integer.valueOf(((am)localObject).field_unReadCount) });
            }
          }
        }
      }
      catch (Exception paramArrayOfString)
      {
        x.e("MicroMsg.ExtControlProviderQLauncher", "exception in updateShortcut, %s", new Object[] { paramArrayOfString.getMessage() });
        pr(4);
        localMatrixCursor.close();
        return null;
      }
      localMatrixCursor.addRow(new Object[] { paramArrayOfString[i], Integer.valueOf(0) });
      break label249;
      label242:
      pr(0);
      return localMatrixCursor;
      label249:
      i += 1;
    }
  }
  
  public int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }
  
  public String getType(Uri paramUri)
  {
    return null;
  }
  
  public Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    return null;
  }
  
  public boolean onCreate()
  {
    return true;
  }
  
  public Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    x.d("MicroMsg.ExtControlProviderQLauncher", "query()");
    a(paramUri, this.context, this.iLO, this.iJE);
    if (paramUri == null)
    {
      pr(3);
      return null;
    }
    if ((bi.oW(this.iJN)) || (bi.oW(aIW())))
    {
      pr(3);
      return null;
    }
    if (!atA())
    {
      pr(1);
      return this.hdQ;
    }
    if (!df(this.context))
    {
      x.w("MicroMsg.ExtControlProviderQLauncher", "invalid appid ! return null");
      pr(2);
      return null;
    }
    switch (this.iLO)
    {
    default: 
      pr(3);
      return null;
    case 18: 
      x.d("MicroMsg.ExtControlProviderQLauncher", "toScanQRCode");
      if (this.context == null)
      {
        pr(4);
        return null;
      }
      paramUri = new Intent();
      paramUri.putExtra("BaseScanUI_select_scan_mode", 1);
      paramUri.putExtra("BaseScanUI_only_scan_qrcode_with_zbar", true);
      d.b(this.context, "scanner", ".ui.BaseScanUI", paramUri);
      paramUri = new MatrixCursor(iJr);
      paramUri.addRow(new Object[] { Integer.valueOf(1) });
      pr(0);
      return paramUri;
    case 19: 
      x.d("MicroMsg.ExtControlProviderQLauncher", "toCreateShortcut");
      if (this.context == null)
      {
        pr(4);
        return null;
      }
      paramUri = new Intent();
      d.b(this.context, "extqlauncher", ".ui.QLauncherCreateShortcutUI", paramUri);
      paramUri = new MatrixCursor(iJr);
      paramUri.addRow(new Object[] { Integer.valueOf(1) });
      pr(0);
      return paramUri;
    }
    return t(paramArrayOfString2);
  }
  
  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/extqlauncher/provider/ExtControlProviderQLauncher.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */