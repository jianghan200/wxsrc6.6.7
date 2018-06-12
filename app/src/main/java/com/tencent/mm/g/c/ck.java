package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.protocal.c.cfz;
import com.tencent.mm.protocal.c.cga;
import com.tencent.mm.protocal.c.chz;
import com.tencent.mm.protocal.c.ob;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.platformtools.x;
import java.io.IOException;

public abstract class ck
  extends c
{
  private static final int cFO;
  private static final int cFP = "launchAction".hashCode();
  private static final int cFY;
  private static final int cFZ;
  private static final int cGa = "jsApiInfo".hashCode();
  private static final int cGb = "versionInfo".hashCode();
  private static final int cGc = "widgetSetting".hashCode();
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int ckP;
  private boolean cFJ = true;
  private boolean cFK = true;
  private boolean cFT = true;
  private boolean cFU = true;
  private boolean cFV = true;
  private boolean cFW = true;
  private boolean cFX = true;
  private boolean cky = true;
  public String field_appId;
  public int field_appIdHash;
  public ob field_jsApiInfo;
  public cfz field_launchAction;
  public int field_pkgType;
  public cga field_versionInfo;
  public chz field_widgetSetting;
  public int field_widgetType;
  
  static
  {
    cFO = "appIdHash".hashCode();
    ckP = "appId".hashCode();
    cFY = "pkgType".hashCode();
    cFZ = "widgetType".hashCode();
  }
  
  public final void d(Cursor paramCursor)
  {
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null) {
      return;
    }
    int j = arrayOfString.length;
    int i = 0;
    label20:
    int k;
    if (i < j)
    {
      k = arrayOfString[i].hashCode();
      if (cFO != k) {
        break label60;
      }
      this.field_appIdHash = paramCursor.getInt(i);
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label60:
      if (ckP == k) {
        this.field_appId = paramCursor.getString(i);
      } else if (cFY == k) {
        this.field_pkgType = paramCursor.getInt(i);
      } else if (cFZ == k) {
        this.field_widgetType = paramCursor.getInt(i);
      } else if (cFP == k) {
        try
        {
          byte[] arrayOfByte1 = paramCursor.getBlob(i);
          if ((arrayOfByte1 == null) || (arrayOfByte1.length <= 0)) {
            continue;
          }
          this.field_launchAction = ((cfz)new cfz().aG(arrayOfByte1));
        }
        catch (IOException localIOException1)
        {
          x.e("MicroMsg.SDK.BaseLaunchWxaWidgetRespData", localIOException1.getMessage());
        }
      } else if (cGa == k) {
        try
        {
          byte[] arrayOfByte2 = paramCursor.getBlob(i);
          if ((arrayOfByte2 == null) || (arrayOfByte2.length <= 0)) {
            continue;
          }
          this.field_jsApiInfo = ((ob)new ob().aG(arrayOfByte2));
        }
        catch (IOException localIOException2)
        {
          x.e("MicroMsg.SDK.BaseLaunchWxaWidgetRespData", localIOException2.getMessage());
        }
      } else if (cGb == k) {
        try
        {
          byte[] arrayOfByte3 = paramCursor.getBlob(i);
          if ((arrayOfByte3 == null) || (arrayOfByte3.length <= 0)) {
            continue;
          }
          this.field_versionInfo = ((cga)new cga().aG(arrayOfByte3));
        }
        catch (IOException localIOException3)
        {
          x.e("MicroMsg.SDK.BaseLaunchWxaWidgetRespData", localIOException3.getMessage());
        }
      } else if (cGc == k) {
        try
        {
          byte[] arrayOfByte4 = paramCursor.getBlob(i);
          if ((arrayOfByte4 == null) || (arrayOfByte4.length <= 0)) {
            continue;
          }
          this.field_widgetSetting = ((chz)new chz().aG(arrayOfByte4));
        }
        catch (IOException localIOException4)
        {
          x.e("MicroMsg.SDK.BaseLaunchWxaWidgetRespData", localIOException4.getMessage());
        }
      } else if (ciP == k) {
        this.sKx = paramCursor.getLong(i);
      }
    }
  }
  
  public final ContentValues wH()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cFJ) {
      localContentValues.put("appIdHash", Integer.valueOf(this.field_appIdHash));
    }
    if (this.cky) {
      localContentValues.put("appId", this.field_appId);
    }
    if (this.cFT) {
      localContentValues.put("pkgType", Integer.valueOf(this.field_pkgType));
    }
    if (this.cFU) {
      localContentValues.put("widgetType", Integer.valueOf(this.field_widgetType));
    }
    if ((this.cFK) && (this.field_launchAction != null)) {}
    try
    {
      localContentValues.put("launchAction", this.field_launchAction.toByteArray());
      if ((!this.cFV) || (this.field_jsApiInfo == null)) {}
    }
    catch (IOException localIOException3)
    {
      try
      {
        localContentValues.put("jsApiInfo", this.field_jsApiInfo.toByteArray());
        if ((!this.cFW) || (this.field_versionInfo == null)) {}
      }
      catch (IOException localIOException3)
      {
        try
        {
          localContentValues.put("versionInfo", this.field_versionInfo.toByteArray());
          if ((!this.cFX) || (this.field_widgetSetting == null)) {}
        }
        catch (IOException localIOException3)
        {
          try
          {
            for (;;)
            {
              localContentValues.put("widgetSetting", this.field_widgetSetting.toByteArray());
              if (this.sKx > 0L) {
                localContentValues.put("rowid", Long.valueOf(this.sKx));
              }
              return localContentValues;
              localIOException1 = localIOException1;
              x.e("MicroMsg.SDK.BaseLaunchWxaWidgetRespData", localIOException1.getMessage());
              continue;
              localIOException2 = localIOException2;
              x.e("MicroMsg.SDK.BaseLaunchWxaWidgetRespData", localIOException2.getMessage());
            }
            localIOException3 = localIOException3;
            x.e("MicroMsg.SDK.BaseLaunchWxaWidgetRespData", localIOException3.getMessage());
          }
          catch (IOException localIOException4)
          {
            for (;;)
            {
              x.e("MicroMsg.SDK.BaseLaunchWxaWidgetRespData", localIOException4.getMessage());
            }
          }
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/g/c/ck.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */