package com.tencent.mm.plugin.ext.provider;

import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import com.jg.JgClassChecked;
import com.tencent.mm.aa.f;
import com.tencent.mm.aa.f.c;
import com.tencent.mm.aa.q;
import com.tencent.mm.bt.e;
import com.tencent.mm.g.a.jz;
import com.tencent.mm.model.au;
import com.tencent.mm.modelgeo.a.a;
import com.tencent.mm.pluginsdk.c.b;
import com.tencent.mm.protocal.c.aqp;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.al.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

@JgClassChecked(author=32, fComment="checked", lastDate="20141016", reviewer=20, vComment={com.jg.EType.PROVIDERCHECK})
public final class ExtControlProviderNearBy
  extends ExtContentProviderBase
  implements f.c
{
  private static final UriMatcher iKq;
  private static boolean iKs = false;
  private static al iKt = new al(new al.a()
  {
    public final boolean vD()
    {
      ExtControlProviderNearBy.Ju();
      return false;
    }
  }, false);
  private static final String[] qP = { "nickname", "avatar", "distance", "signature", "sex" };
  private boolean bgN;
  private a.a cXs = new ExtControlProviderNearBy.4(this);
  private com.tencent.mm.modelgeo.c dMm;
  private b hLU = new ExtControlProviderNearBy.3(this);
  private int iKj;
  private List<aqp> iKk;
  private e iKl;
  private Set<String> iKm;
  private CountDownLatch iKn;
  private CountDownLatch iKo;
  private aqp iKp;
  private boolean iKr = false;
  
  static
  {
    UriMatcher localUriMatcher = new UriMatcher(-1);
    iKq = localUriMatcher;
    localUriMatcher.addURI("com.tencent.mm.plugin.ext.NearBy", "male", 1);
    iKq.addURI("com.tencent.mm.plugin.ext.NearBy", "female", 2);
    iKq.addURI("com.tencent.mm.plugin.ext.NearBy", "all", 0);
  }
  
  private aqp AI(String paramString)
  {
    if ((paramString == null) || (paramString.length() <= 0))
    {
      x.e("MicroMsg.ExtControlProviderNearBy", "username is null or nill");
      return null;
    }
    Iterator localIterator = this.iKk.iterator();
    while (localIterator.hasNext())
    {
      aqp localaqp = (aqp)localIterator.next();
      if (localaqp.hbL.equals(paramString)) {
        return localaqp;
      }
    }
    return null;
  }
  
  private void a(aqp paramaqp)
  {
    if ((paramaqp == null) || (paramaqp.hbL == null)) {
      x.e("MicroMsg.ExtControlProviderNearBy", "lbsContactInfo is null or lbsContactInfo's userName is null");
    }
    Bitmap localBitmap;
    do
    {
      return;
      this.iKm.add(paramaqp.hbL);
      localBitmap = com.tencent.mm.aa.c.a(paramaqp.hbL, false, -1);
      x.i("MicroMsg.ExtControlProviderNearBy", "countDownLatchGet now count: " + this.iKo.getCount());
    } while (localBitmap == null);
    x.i("MicroMsg.ExtControlProviderNearBy", "countDownLatchGet countDown now");
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    byte[] arrayOfByte = new byte[0];
    if (localBitmap.compress(Bitmap.CompressFormat.PNG, 100, localByteArrayOutputStream)) {
      arrayOfByte = localByteArrayOutputStream.toByteArray();
    }
    this.iKm.remove(paramaqp.hbL);
    this.iKl.addRow(new Object[] { paramaqp.hcS, arrayOfByte, paramaqp.rTd, paramaqp.eJK, Integer.valueOf(paramaqp.eJH) });
    x.i("MicroMsg.ExtControlProviderNearBy", "bitmap recycle %s", new Object[] { localBitmap });
    localBitmap.recycle();
  }
  
  private void aJa()
  {
    if (this.iKm.size() > 0)
    {
      Iterator localIterator = this.iKm.iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        x.i("MicroMsg.ExtControlProviderNearBy", "add lbsfriend has no avatar: " + str);
        this.iKp = AI(str);
        if ((this.iKp != null) && (this.iKp.hbL != null)) {
          this.iKl.addRow(new Object[] { this.iKp.hcS, null, this.iKp.rTd, this.iKp.eJK, Integer.valueOf(this.iKp.eJH) });
        }
      }
    }
    x.i("MicroMsg.ExtControlProviderNearBy", "all user has got avatar");
  }
  
  private static void cz(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      iKs = true;
      iKt.J(15000L, 15000L);
      return;
    }
    iKt.J(0L, 0L);
  }
  
  public final int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }
  
  public final String getType(Uri paramUri)
  {
    this.iKj = -1;
    switch (iKq.match(paramUri))
    {
    default: 
      this.iKj = -1;
    }
    for (;;)
    {
      return null;
      this.iKj = 1;
      continue;
      this.iKj = 3;
      continue;
      this.iKj = 4;
    }
  }
  
  public final Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    return null;
  }
  
  public final void jX(String paramString)
  {
    x.i("MicroMsg.ExtControlProviderNearBy", "notifyChanged: " + paramString);
    if (this.bgN)
    {
      x.i("MicroMsg.ExtControlProviderNearBy", "has finished");
      return;
    }
    a(AI(paramString));
    this.iKo.countDown();
  }
  
  public final boolean onCreate()
  {
    return true;
  }
  
  public final Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    x.i("MicroMsg.ExtControlProviderNearBy", "query() " + paramUri);
    a(paramUri, getContext(), 15);
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
    if (iKs)
    {
      x.w("MicroMsg.ExtControlProviderNearBy", "isDoingRequest, return null");
      pr(5);
      return null;
    }
    cz(true);
    if (!atA())
    {
      cz(false);
      pr(1);
      return this.hdQ;
    }
    if (!df(getContext()))
    {
      x.w("MicroMsg.ExtControlProviderNearBy", "invalid appid ! return null");
      cz(false);
      pr(2);
      return null;
    }
    x.i("MicroMsg.ExtControlProviderNearBy", "find type = " + this.iKj);
    getType(paramUri);
    if (this.iKj < 0)
    {
      x.e("MicroMsg.ExtControlProviderNearBy", "unkown uri, return null");
      cz(false);
      pr(3);
      return null;
    }
    for (;;)
    {
      try
      {
        this.iKk = new ArrayList();
        this.iKl = new e(qP, (byte)0);
        this.iKn = new CountDownLatch(1);
        this.iKo = null;
        this.iKm = new HashSet();
        this.iKk = new ArrayList();
        this.bgN = false;
        x.v("MicroMsg.ExtControlProviderNearBy", "start()");
        if (au.HX()) {
          continue;
        }
        x.i("MicroMsg.ExtControlProviderNearBy", "!MMCore.hasSetUin()");
        x.i("MicroMsg.ExtControlProviderNearBy", "wait for get lbs info");
        if (!this.iKn.await(15000L, TimeUnit.MILLISECONDS)) {
          x.w("MicroMsg.ExtControlProviderNearBy", "countDownLatchWait time out");
        }
        if (this.iKo == null) {
          continue;
        }
        x.i("MicroMsg.ExtControlProviderNearBy", "get lbs info success, wait for get lbs friend");
        if (!this.iKo.await(15000L, TimeUnit.MILLISECONDS)) {
          x.w("MicroMsg.ExtControlProviderNearBy", "countDownLatchGet time out");
        }
      }
      catch (Exception paramUri)
      {
        x.w("MicroMsg.ExtControlProviderNearBy", paramUri.getMessage());
        x.printErrStackTrace("MicroMsg.ExtControlProviderNearBy", paramUri, "", new Object[0]);
        pr(4);
        continue;
        x.i("MicroMsg.ExtControlProviderNearBy", "not init countDownGet. return null");
        continue;
        pr(4);
        continue;
      }
      cz(false);
      q.Kp().b(this);
      this.bgN = true;
      aJa();
      if ((this.iKl == null) || (this.iKl.getCount() <= 0)) {
        continue;
      }
      pr(0);
      x.i("MicroMsg.ExtControlProviderNearBy", "return now");
      return this.iKl;
      b.a(jz.class.getName(), this.hLU);
      ah.A(new ExtControlProviderNearBy.2(this));
    }
  }
  
  public final int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/ext/provider/ExtControlProviderNearBy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */