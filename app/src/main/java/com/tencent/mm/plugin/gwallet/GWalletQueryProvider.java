package com.tencent.mm.plugin.gwallet;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import com.tencent.mm.plugin.gwallet.a.b;
import com.tencent.mm.plugin.gwallet.a.b.c;
import com.tencent.mm.plugin.gwallet.a.c;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public class GWalletQueryProvider
  extends ContentProvider
{
  public static final String[] qP = { "_id", "product_id", "full_price", "product_state", "price_currency", "price_amount" };
  private final String TAG = "MicroMsg.GWalletQueryProvider";
  private b kiB = null;
  private boolean kiC;
  private boolean kiD;
  private ArrayList<String> kiE;
  private ArrayList<String> kiF;
  private int kiG;
  private Context mContext = null;
  
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
    x.d("MicroMsg.GWalletQueryProvider", "successfully loaded");
    return true;
  }
  
  public Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    try
    {
      x.d("MicroMsg.GWalletQueryProvider", "Creating IAB helper.");
      if ((paramArrayOfString2 == null) || (paramArrayOfString2.length == 0))
      {
        x.d("MicroMsg.GWalletQueryProvider", "no product id selected or size is 0");
        throw new IllegalArgumentException("no product id selected or size is 0");
      }
    }
    finally {}
    this.mContext = getContext();
    this.kiB = new b(this.mContext);
    this.kiC = true;
    this.kiD = false;
    this.kiF = new ArrayList();
    int j = paramArrayOfString2.length;
    int i = 0;
    while (i < j)
    {
      paramUri = paramArrayOfString2[i];
      this.kiF.add(paramUri);
      i += 1;
    }
    x.d("MicroMsg.GWalletQueryProvider", "Starting setup.");
    this.kiB.a(new GWalletQueryProvider.1(this));
    long l = 0L;
    boolean bool;
    while ((l <= 30000L) && (this.kiC))
    {
      bool = this.kiD;
      if (bool) {
        break;
      }
      try
      {
        Thread.sleep(100L);
        l += 100L;
      }
      catch (InterruptedException paramUri)
      {
        x.e("MicroMsg.GWalletQueryProvider", paramUri.toString());
      }
    }
    if (!this.kiC)
    {
      x.d("MicroMsg.GWalletQueryProvider", "unable to setup");
      paramUri = new MatrixCursor(qP);
      paramArrayOfString1 = this.kiF.iterator();
      while (paramArrayOfString1.hasNext()) {
        paramUri.addRow(new Object[] { Integer.valueOf(0), (String)paramArrayOfString1.next(), "", Integer.valueOf(10234), "", "" });
      }
      return paramUri;
    }
    if (l > 30000L)
    {
      x.d("MicroMsg.GWalletQueryProvider", "time's out");
      paramUri = new MatrixCursor(qP);
      paramArrayOfString1 = this.kiF.iterator();
      while (paramArrayOfString1.hasNext()) {
        paramUri.addRow(new Object[] { Integer.valueOf(0), (String)paramArrayOfString1.next(), "", Integer.valueOf(10235), "", "" });
      }
      return paramUri;
    }
    x.d("MicroMsg.GWalletQueryProvider", "successfully queried!");
    paramArrayOfString1 = new MatrixCursor(qP);
    if (this.kiG == 0)
    {
      i = 0;
      if (this.kiE != null)
      {
        paramString1 = this.kiE.iterator();
        i = 0;
        for (;;)
        {
          if (!paramString1.hasNext()) {
            break label786;
          }
          paramUri = (String)paramString1.next();
          bool = bi.oW(paramUri);
          if (bool) {
            break label780;
          }
          try
          {
            localObject = new JSONObject(paramUri);
            paramUri = ((JSONObject)localObject).getString("productId");
            paramArrayOfString2 = ((JSONObject)localObject).getString("price");
            paramString2 = ((JSONObject)localObject).getString("price_currency_code");
            localObject = ((JSONObject)localObject).getString("price_amount_micros");
            j = i + 1;
          }
          catch (JSONException paramUri)
          {
            try
            {
              Object localObject;
              paramArrayOfString1.addRow(new Object[] { Integer.valueOf(i), paramUri, paramArrayOfString2, Integer.valueOf(10232), paramString2, localObject });
              this.kiF.remove(paramUri);
              i = j;
            }
            catch (JSONException paramUri)
            {
              for (;;)
              {
                i = j;
              }
            }
            paramUri = paramUri;
          }
        }
        x.d("MicroMsg.GWalletQueryProvider", paramUri.toString());
        break label783;
      }
    }
    label780:
    label783:
    label786:
    for (;;)
    {
      paramUri = this.kiF.iterator();
      while (paramUri.hasNext())
      {
        paramArrayOfString1.addRow(new Object[] { Integer.valueOf(i), (String)paramUri.next(), "", Integer.valueOf(10233), "", "" });
        i += 1;
        continue;
        paramUri = this.kiF.iterator();
        while (paramUri.hasNext()) {
          paramArrayOfString1.addRow(new Object[] { Integer.valueOf(0), (String)paramUri.next(), "", Integer.valueOf(10236), "", "" });
        }
      }
      return paramArrayOfString1;
      break;
    }
  }
  
  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/gwallet/GWalletQueryProvider.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */