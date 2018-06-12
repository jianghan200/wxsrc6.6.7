package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.protocal.c.aqj;
import com.tencent.mm.protocal.c.ay;
import com.tencent.mm.protocal.c.cgo;
import com.tencent.mm.protocal.c.ob;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.platformtools.x;
import java.io.IOException;

public abstract class cj
  extends c
{
  private static final int cFO;
  private static final int cFP = "launchAction".hashCode();
  private static final int cFQ = "jsapiInfo".hashCode();
  private static final int cFR = "hostInfo".hashCode();
  private static final int cFS = "actionsheetInfo".hashCode();
  public static final String[] ciG = new String[0];
  private static final int ciP = "rowid".hashCode();
  private static final int ckP;
  private boolean cFJ = true;
  private boolean cFK = true;
  private boolean cFL = true;
  private boolean cFM = true;
  private boolean cFN = true;
  private boolean cky = true;
  public ay field_actionsheetInfo;
  public String field_appId;
  public int field_appIdHash;
  public cgo field_hostInfo;
  public ob field_jsapiInfo;
  public aqj field_launchAction;
  
  static
  {
    cFO = "appIdHash".hashCode();
    ckP = "appId".hashCode();
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
        break label65;
      }
      this.field_appIdHash = paramCursor.getInt(i);
      this.cFJ = true;
    }
    for (;;)
    {
      i += 1;
      break label20;
      break;
      label65:
      if (ckP == k) {
        this.field_appId = paramCursor.getString(i);
      } else if (cFP == k) {
        try
        {
          byte[] arrayOfByte1 = paramCursor.getBlob(i);
          if ((arrayOfByte1 == null) || (arrayOfByte1.length <= 0)) {
            continue;
          }
          this.field_launchAction = ((aqj)new aqj().aG(arrayOfByte1));
        }
        catch (IOException localIOException1)
        {
          x.e("MicroMsg.SDK.BaseLaunchWxaAppRespTable", localIOException1.getMessage());
        }
      } else if (cFQ == k) {
        try
        {
          byte[] arrayOfByte2 = paramCursor.getBlob(i);
          if ((arrayOfByte2 == null) || (arrayOfByte2.length <= 0)) {
            continue;
          }
          this.field_jsapiInfo = ((ob)new ob().aG(arrayOfByte2));
        }
        catch (IOException localIOException2)
        {
          x.e("MicroMsg.SDK.BaseLaunchWxaAppRespTable", localIOException2.getMessage());
        }
      } else if (cFR == k) {
        try
        {
          byte[] arrayOfByte3 = paramCursor.getBlob(i);
          if ((arrayOfByte3 == null) || (arrayOfByte3.length <= 0)) {
            continue;
          }
          this.field_hostInfo = ((cgo)new cgo().aG(arrayOfByte3));
        }
        catch (IOException localIOException3)
        {
          x.e("MicroMsg.SDK.BaseLaunchWxaAppRespTable", localIOException3.getMessage());
        }
      } else if (cFS == k) {
        try
        {
          byte[] arrayOfByte4 = paramCursor.getBlob(i);
          if ((arrayOfByte4 == null) || (arrayOfByte4.length <= 0)) {
            continue;
          }
          this.field_actionsheetInfo = ((ay)new ay().aG(arrayOfByte4));
        }
        catch (IOException localIOException4)
        {
          x.e("MicroMsg.SDK.BaseLaunchWxaAppRespTable", localIOException4.getMessage());
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
    if ((this.cFK) && (this.field_launchAction != null)) {}
    try
    {
      localContentValues.put("launchAction", this.field_launchAction.toByteArray());
      if ((!this.cFL) || (this.field_jsapiInfo == null)) {}
    }
    catch (IOException localIOException3)
    {
      try
      {
        localContentValues.put("jsapiInfo", this.field_jsapiInfo.toByteArray());
        if ((!this.cFM) || (this.field_hostInfo == null)) {}
      }
      catch (IOException localIOException3)
      {
        try
        {
          localContentValues.put("hostInfo", this.field_hostInfo.toByteArray());
          if ((!this.cFN) || (this.field_actionsheetInfo == null)) {}
        }
        catch (IOException localIOException3)
        {
          try
          {
            for (;;)
            {
              localContentValues.put("actionsheetInfo", this.field_actionsheetInfo.toByteArray());
              if (this.sKx > 0L) {
                localContentValues.put("rowid", Long.valueOf(this.sKx));
              }
              return localContentValues;
              localIOException1 = localIOException1;
              x.e("MicroMsg.SDK.BaseLaunchWxaAppRespTable", localIOException1.getMessage());
              continue;
              localIOException2 = localIOException2;
              x.e("MicroMsg.SDK.BaseLaunchWxaAppRespTable", localIOException2.getMessage());
            }
            localIOException3 = localIOException3;
            x.e("MicroMsg.SDK.BaseLaunchWxaAppRespTable", localIOException3.getMessage());
          }
          catch (IOException localIOException4)
          {
            for (;;)
            {
              x.e("MicroMsg.SDK.BaseLaunchWxaAppRespTable", localIOException4.getMessage());
            }
          }
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/g/c/cj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */