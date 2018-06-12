package com.tencent.mm.plugin.ext.provider;

import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import com.jg.JgClassChecked;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.fc;
import com.tencent.mm.g.a.fk;
import com.tencent.mm.g.a.fk.b;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.model.r;
import com.tencent.mm.model.s;
import com.tencent.mm.modelvoice.m;
import com.tencent.mm.modelvoice.p;
import com.tencent.mm.modelvoice.q;
import com.tencent.mm.modelvoice.u;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.az;
import com.tencent.mm.storage.bu;
import com.tencent.mm.storage.bv;

@JgClassChecked(author=32, fComment="checked", lastDate="20141016", reviewer=20, vComment={com.jg.EType.PROVIDERCHECK})
public class ExtControlProviderMsg
  extends ExtContentProviderBase
{
  private static final UriMatcher iJT;
  private static final String[] iJW = { "msgId", "fromUserId", "fromUserNickName", "msgType", "contentType", "content", "status", "createTime" };
  private static final String[] iJX = { "userId", "unReadCount" };
  private static final String[] iJY = { "userId", "unReadCount" };
  private static final String[] iJZ = { "userId", "retCode", "msgId" };
  private static final String[] iKa = { "msgId", "retCode" };
  private static final String[] iKb = { "msgId", "retCode" };
  private String[] iJE = null;
  private int iJF = -1;
  private boolean iJU = false;
  private Context iJV;
  private MatrixCursor iKc = null;
  
  static
  {
    UriMatcher localUriMatcher = new UriMatcher(-1);
    iJT = localUriMatcher;
    localUriMatcher.addURI("com.tencent.mm.plugin.ext.message", "oneMsg", 7);
    iJT.addURI("com.tencent.mm.plugin.ext.message", "unReadCount", 8);
    iJT.addURI("com.tencent.mm.plugin.ext.message", "unReadMsgs", 9);
    iJT.addURI("com.tencent.mm.plugin.ext.message", "unReadUserList", 10);
    iJT.addURI("com.tencent.mm.plugin.ext.message", "recordMsg", 11);
    iJT.addURI("com.tencent.mm.plugin.ext.message", "playVoice", 12);
    iJT.addURI("com.tencent.mm.plugin.ext.message", "setReaded", 13);
    iJT.addURI("com.tencent.mm.plugin.ext.message", "sendTextMsg", 14);
  }
  
  public ExtControlProviderMsg() {}
  
  public ExtControlProviderMsg(String[] paramArrayOfString, int paramInt, Context paramContext)
  {
    this.iJU = true;
    this.iJE = paramArrayOfString;
    this.iJF = paramInt;
    this.iJV = paramContext;
  }
  
  private Cursor a(String[] paramArrayOfString, String paramString1, String paramString2)
  {
    x.i("MicroMsg.ExtControlProviderMsg", "getUnReadMsgs() ");
    x.d("MicroMsg.ExtControlProviderMsg", "getUnReadMsgs(), %s, %s", new Object[] { paramString1, paramString2 });
    if ((paramArrayOfString == null) || (paramArrayOfString.length <= 0))
    {
      x.e("MicroMsg.ExtControlProviderMsg", "wrong args");
      cw(3, 3701);
      return com.tencent.mm.pluginsdk.d.a.a.BA(3701);
    }
    if (bi.oW(paramString1))
    {
      x.e("MicroMsg.ExtControlProviderMsg", "callSource == null");
      cw(3, 3702);
      return com.tencent.mm.pluginsdk.d.a.a.BA(3702);
    }
    if (bi.oW(paramString2))
    {
      x.e("MicroMsg.ExtControlProviderMsg", "countStr == null");
      cw(3, 3703);
      return com.tencent.mm.pluginsdk.d.a.a.BA(3703);
    }
    if ((paramString1 != null) && (paramString1.equalsIgnoreCase("openapi"))) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      if (bool1) {}
      try
      {
        paramString1 = com.tencent.mm.plugin.ext.b.aIM().Zq(paramArrayOfString[0]);
        if ((paramString1 == null) || (bi.oW(paramString1.field_openId)) || (bi.oW(paramString1.field_username)))
        {
          x.e("MicroMsg.ExtControlProviderMsg", "openidInApp is null");
          cw(3, 3704);
          return com.tencent.mm.pluginsdk.d.a.a.BA(3704);
        }
        au.HU();
        long l;
        for (localab = c.FR().Yg(paramString1.field_username); (localab == null) || (localab.field_username == null) || (localab.field_username.length() <= 0); localab = c.FR().gl(l))
        {
          x.e("MicroMsg.ExtControlProviderMsg", "contact is null");
          cw(3, 3705);
          return com.tencent.mm.pluginsdk.d.a.a.BA(3705);
          l = com.tencent.mm.plugin.ext.a.a.AG(paramArrayOfString[0]);
          au.HU();
        }
        str = localab.BL();
        if (!localab.field_username.endsWith("@chatroom")) {
          continue;
        }
        str = r.gT(localab.field_username);
        bool2 = true;
      }
      catch (Exception paramArrayOfString)
      {
        for (;;)
        {
          ab localab;
          String str;
          paramString1 = null;
          continue;
          boolean bool2 = false;
        }
      }
      if (bool1) {}
      for (;;)
      {
        try
        {
          i = bi.getInt(paramString2, 0);
          if ((i <= 0) || (i >= 15))
          {
            au.HU();
            paramString1 = c.FT().bE(localab.field_username, 15);
            if (paramString1 != null) {
              break;
            }
            x.e("MicroMsg.ExtControlProviderMsg", "msgCursor == null");
            H(3, 4, 3706);
            return com.tencent.mm.pluginsdk.d.a.a.BA(3706);
          }
        }
        catch (Exception paramString1)
        {
          x.e("MicroMsg.ExtControlProviderMsg", "exception in parseInt(%s)", new Object[] { paramString2 });
          int i = 0;
          continue;
          au.HU();
          paramString1 = c.FT().bE(localab.field_username, i);
          continue;
        }
        au.HU();
        paramString1 = c.FT().bE(localab.field_username, 3);
      }
      paramString2 = new MatrixCursor(iJW);
      try
      {
        if ((paramString1.getCount() > 0) && (paramString1.moveToFirst()))
        {
          com.tencent.mm.storage.bd localbd = new com.tencent.mm.storage.bd();
          do
          {
            localbd.d(paramString1);
            a(paramString2, localbd, localab, bool2, str, bool1, paramArrayOfString[0]);
          } while (paramString1.moveToNext());
        }
        paramString1.close();
        H(2, 0, 1);
        return paramString2;
      }
      catch (Exception paramArrayOfString)
      {
        paramString1 = paramString2;
      }
      x.e("MicroMsg.ExtControlProviderMsg", paramArrayOfString.getMessage());
      x.printErrStackTrace("MicroMsg.ExtControlProviderMsg", paramArrayOfString, "", new Object[0]);
      if (paramString1 != null) {
        paramString1.close();
      }
      H(3, 4, 12);
      return com.tencent.mm.pluginsdk.d.a.a.BA(12);
    }
  }
  
  private void a(MatrixCursor paramMatrixCursor, com.tencent.mm.storage.bd parambd, ab paramab, boolean paramBoolean1, String paramString1, boolean paramBoolean2, String paramString2)
  {
    if (parambd == null) {}
    do
    {
      return;
      if (bi.oW(paramString2))
      {
        x.d("MicroMsg.ExtControlProviderMsg", "userOpenId is null");
        return;
      }
    } while ((parambd.getType() == 9999) || (parambd.getType() == 10000));
    String str2 = "";
    String str3 = "";
    String str1 = str3;
    Object localObject = str2;
    int i;
    if (paramBoolean1)
    {
      i = com.tencent.mm.model.bd.iA(parambd.field_content);
      str1 = str3;
      localObject = str2;
      if (i != -1)
      {
        str1 = str3;
        localObject = str2;
        if (parambd.field_content.length() > i)
        {
          String str4 = parambd.field_content.substring(0, i).trim();
          str1 = str3;
          localObject = str2;
          if (str4 != null)
          {
            str1 = str3;
            localObject = str2;
            if (str4.length() > 0)
            {
              str1 = str3;
              localObject = str2;
              if (parambd.field_content.length() >= i + 2)
              {
                localObject = r.gT(str4);
                str1 = parambd.field_content.substring(i + 2);
              }
            }
          }
        }
      }
    }
    int k = com.tencent.mm.plugin.ext.b.b.P(parambd);
    if (k == 1) {
      if (paramBoolean1) {
        localObject = (String)localObject + "!]" + str1;
      }
    }
    label244:
    label405:
    label505:
    label511:
    label517:
    for (;;)
    {
      if (paramBoolean2)
      {
        try
        {
          if (!bi.oW(paramString2)) {
            break label405;
          }
          x.w("MicroMsg.ExtControlProviderMsg", "userId is null");
          return;
        }
        catch (Exception paramMatrixCursor)
        {
          x.e("MicroMsg.ExtControlProviderMsg", paramMatrixCursor.getMessage());
          x.printErrStackTrace("MicroMsg.ExtControlProviderMsg", paramMatrixCursor, "", new Object[0]);
          return;
        }
        localObject = parambd.field_content;
        continue;
        if (k == 2)
        {
          localObject = m.TI().iH((int)parambd.field_msgId);
          if ((localObject == null) || (((p)localObject).fileName == null)) {
            break label511;
          }
          localObject = q.getFullPath(((p)localObject).fileName);
          x.d("MicroMsg.ExtControlProviderMsg", "voice file = %s", new Object[] { localObject });
        }
      }
      for (;;)
      {
        break;
        if (paramBoolean1) {
          break label517;
        }
        if (this.iJV != null)
        {
          localObject = this.iJV.getString(R.l.ext_receive_unknown_type_message);
          break;
        }
        localObject = "";
        break;
        paramString2 = com.tencent.mm.plugin.ext.a.a.dc((int)paramab.dhP);
        break label244;
        paramab = com.tencent.mm.plugin.ext.a.a.dc(parambd.field_msgId);
        if (parambd.field_isSend == 0)
        {
          i = 1;
          if (parambd.field_status != 4) {
            break label505;
          }
        }
        for (int j = 1;; j = 2)
        {
          paramMatrixCursor.addRow(new Object[] { paramab, paramString2, paramString1, Integer.valueOf(i), Integer.valueOf(k), localObject, Integer.valueOf(j), Long.valueOf(parambd.field_createTime) });
          return;
          i = 2;
          break;
        }
        localObject = "";
      }
    }
  }
  
  private Cursor aIY()
  {
    x.d("MicroMsg.ExtControlProviderMsg", "getUnReadUserList()");
    MatrixCursor localMatrixCursor = new MatrixCursor(iJY);
    label250:
    for (;;)
    {
      try
      {
        au.HU();
        Cursor localCursor = c.FT().bdi();
        if (localCursor != null)
        {
          if (localCursor.moveToFirst())
          {
            String str = localCursor.getString(localCursor.getColumnIndex("talker"));
            au.HU();
            ab localab = c.FR().Yg(str);
            if (!s.fq(str))
            {
              if ((s.hO(localab.field_username)) || (s.hM(localab.field_username)) || (ab.Dk(localab.field_verifyFlag)) || (s.hE(localab.field_username))) {
                break label250;
              }
              if (!s.hF(localab.field_username)) {
                continue;
              }
              break label250;
              if (i == 0) {
                localMatrixCursor.addRow(new Object[] { com.tencent.mm.plugin.ext.a.a.dc((int)localab.dhP), Integer.valueOf(localCursor.getInt(localCursor.getColumnIndex("unReadCount"))) });
              }
            }
            if (localCursor.moveToNext()) {
              continue;
            }
          }
          else
          {
            localCursor.close();
          }
        }
        else
        {
          pr(0);
          return localMatrixCursor;
        }
        int i = 1;
        continue;
        i = 0;
      }
      catch (Exception localException)
      {
        x.e("MicroMsg.ExtControlProviderMsg", localException.getMessage());
        x.printErrStackTrace("MicroMsg.ExtControlProviderMsg", localException, "", new Object[0]);
        localMatrixCursor.close();
        pr(4);
        return null;
      }
    }
  }
  
  private Cursor c(String[] paramArrayOfString, String paramString)
  {
    boolean bool2 = true;
    x.d("MicroMsg.ExtControlProviderMsg", "getOneMsg()");
    if ((paramArrayOfString == null) || (paramArrayOfString.length <= 0))
    {
      x.e("MicroMsg.ExtControlProviderMsg", "wrong args");
      pr(3);
      return null;
    }
    try
    {
      long l = com.tencent.mm.plugin.ext.a.a.AG(paramArrayOfString[0]);
      au.HU();
      localbd = c.FT().dW(l);
      au.HU();
      localab = c.FR().Yg(localbd.field_talker);
      if ((localab == null) || ((int)localab.dhP <= 0))
      {
        pr(3);
        return null;
      }
      str = localab.BL();
      if (!localab.field_username.endsWith("@chatroom")) {
        break label228;
      }
      str = r.gT(localab.field_username);
      bool1 = true;
    }
    catch (Exception paramArrayOfString)
    {
      for (;;)
      {
        com.tencent.mm.storage.bd localbd;
        ab localab;
        String str;
        paramString = null;
        continue;
        boolean bool1 = false;
      }
    }
    if ((paramString != null) && (paramString.equalsIgnoreCase("openapi"))) {}
    for (;;)
    {
      paramString = new MatrixCursor(iJW);
      try
      {
        a(paramString, localbd, localab, bool1, str, bool2, paramArrayOfString[0]);
        pr(0);
        return paramString;
      }
      catch (Exception paramArrayOfString) {}
      x.e("MicroMsg.ExtControlProviderMsg", paramArrayOfString.getMessage());
      x.printErrStackTrace("MicroMsg.ExtControlProviderMsg", paramArrayOfString, "", new Object[0]);
      if (paramString != null) {
        paramString.close();
      }
      pr(4);
      return null;
      bool2 = false;
    }
  }
  
  private Cursor o(String[] paramArrayOfString)
  {
    x.d("MicroMsg.ExtControlProviderMsg", "getUnReadCount()");
    if ((paramArrayOfString == null) || (paramArrayOfString.length <= 0))
    {
      x.e("MicroMsg.ExtControlProviderMsg", "wrong args");
      pr(3);
      return null;
    }
    MatrixCursor localMatrixCursor = new MatrixCursor(iJX);
    for (;;)
    {
      try
      {
        if ("*".equals(paramArrayOfString[0]))
        {
          au.HU();
          localMatrixCursor.addRow(new Object[] { "0", Integer.valueOf(c.FW().hX("")) });
          pr(0);
          return localMatrixCursor;
        }
      }
      catch (Exception paramArrayOfString)
      {
        x.e("MicroMsg.ExtControlProviderMsg", paramArrayOfString.getMessage());
        x.printErrStackTrace("MicroMsg.ExtControlProviderMsg", paramArrayOfString, "", new Object[0]);
        localMatrixCursor.close();
        pr(4);
        return null;
      }
      int i = 0;
      while (i < paramArrayOfString.length)
      {
        long l = com.tencent.mm.plugin.ext.a.a.AG(paramArrayOfString[i]);
        au.HU();
        ab localab = c.FR().gl(l);
        if ((localab != null) && ((int)localab.dhP > 0))
        {
          au.HU();
          localMatrixCursor.addRow(new Object[] { Long.valueOf(l), Integer.valueOf(c.FW().hX(" and ( rconversation.username='" + localab.field_username + "' );")) });
        }
        i += 1;
      }
    }
  }
  
  private Cursor p(String[] paramArrayOfString)
  {
    x.d("MicroMsg.ExtControlProviderMsg", "handleRecordMsg()");
    if ((paramArrayOfString == null) || (paramArrayOfString.length < 2))
    {
      x.w("MicroMsg.ExtControlProviderMsg", "wrong args");
      pr(3);
      return null;
    }
    int i;
    long l;
    try
    {
      i = Integer.valueOf(paramArrayOfString[0]).intValue();
      l = com.tencent.mm.plugin.ext.a.a.AG(paramArrayOfString[1]);
      if (l <= 0L)
      {
        pr(3);
        return null;
      }
    }
    catch (Exception paramArrayOfString)
    {
      x.e("MicroMsg.ExtControlProviderMsg", paramArrayOfString.getMessage());
      x.printErrStackTrace("MicroMsg.ExtControlProviderMsg", paramArrayOfString, "", new Object[0]);
      if (this.iKc != null) {
        this.iKc.close();
      }
      pr(4);
      return null;
    }
    com.tencent.mm.pluginsdk.d.a.b localb = new com.tencent.mm.pluginsdk.d.a.b();
    localb.b(4000L, new ExtControlProviderMsg.1(this, i, l, localb, paramArrayOfString));
    paramArrayOfString = this.iKc;
    return paramArrayOfString;
  }
  
  private Cursor q(String[] paramArrayOfString)
  {
    x.d("MicroMsg.ExtControlProviderMsg", "handlePlayVoice()");
    if ((paramArrayOfString == null) || (paramArrayOfString.length < 2))
    {
      x.e("MicroMsg.ExtControlProviderMsg", "wrong args");
      pr(3);
    }
    int i;
    do
    {
      return null;
      for (;;)
      {
        long l;
        MatrixCursor localMatrixCursor;
        try
        {
          i = Integer.valueOf(paramArrayOfString[0]).intValue();
          l = com.tencent.mm.plugin.ext.a.a.AG(paramArrayOfString[1]);
          if (l <= 0L)
          {
            pr(3);
            return null;
          }
        }
        catch (Exception paramArrayOfString)
        {
          localMatrixCursor = null;
          x.e("MicroMsg.ExtControlProviderMsg", paramArrayOfString.getMessage());
          x.printErrStackTrace("MicroMsg.ExtControlProviderMsg", paramArrayOfString, "", new Object[0]);
          if (localMatrixCursor != null) {
            localMatrixCursor.close();
          }
          pr(4);
          return null;
        }
        if (i == 3)
        {
          localMatrixCursor = new MatrixCursor(iKa);
          try
          {
            fk localfk = new fk();
            localfk.bNM.bJC = l;
            com.tencent.mm.sdk.b.a.sFg.m(localfk);
            if ((localfk.bNN.fileName == null) || (localfk.bNN.fileName.length() <= 0))
            {
              localMatrixCursor.addRow(new Object[] { paramArrayOfString[1], Integer.valueOf(2) });
              pr(4);
              return localMatrixCursor;
            }
            fc localfc = new fc();
            localfc.bNi.op = 1;
            localfc.bNi.fileName = localfk.bNN.fileName;
            if (com.tencent.mm.sdk.b.a.sFg.m(localfc))
            {
              localMatrixCursor.addRow(new Object[] { paramArrayOfString[1], Integer.valueOf(1) });
              pr(0);
            }
            for (;;)
            {
              com.tencent.mm.plugin.ext.b.aIJ();
              com.tencent.mm.plugin.ext.b.db(l);
              return localMatrixCursor;
              x.e("MicroMsg.ExtControlProviderMsg", "play failed");
              localMatrixCursor.addRow(new Object[] { paramArrayOfString[1], Integer.valueOf(2) });
              pr(4);
            }
          }
          catch (Exception paramArrayOfString) {}
        }
      }
    } while (i != 4);
    paramArrayOfString = new fc();
    paramArrayOfString.bNi.op = 2;
    if (com.tencent.mm.sdk.b.a.sFg.m(paramArrayOfString))
    {
      x.i("MicroMsg.ExtControlProviderMsg", "stop last playing");
      pr(0);
      return null;
    }
    x.i("MicroMsg.ExtControlProviderMsg", "stop last playing fail");
    pr(4);
    return null;
  }
  
  private Cursor r(String[] paramArrayOfString)
  {
    x.i("MicroMsg.ExtControlProviderMsg", "setMsgReaded()");
    if ((paramArrayOfString == null) || (paramArrayOfString.length <= 0))
    {
      x.e("MicroMsg.ExtControlProviderMsg", "wrong args");
      cw(3, 3801);
      return com.tencent.mm.pluginsdk.d.a.a.BA(3801);
    }
    int i = 0;
    for (;;)
    {
      try
      {
        if (i < paramArrayOfString.length) {
          if ((paramArrayOfString[i] == null) || (paramArrayOfString[i].length() <= 0))
          {
            x.w("MicroMsg.ExtControlProviderMsg", "setMsgReaded() wrongArgs i = " + i);
          }
          else
          {
            long l = com.tencent.mm.plugin.ext.a.a.AG(paramArrayOfString[i]);
            com.tencent.mm.plugin.ext.b.aIJ();
            com.tencent.mm.plugin.ext.b.db(l);
          }
        }
      }
      catch (Exception paramArrayOfString)
      {
        x.e("MicroMsg.ExtControlProviderMsg", paramArrayOfString.getMessage());
        x.printErrStackTrace("MicroMsg.ExtControlProviderMsg", paramArrayOfString, "", new Object[0]);
        cw(4, 12);
        return com.tencent.mm.pluginsdk.d.a.a.BA(12);
      }
      cw(0, 1);
      return com.tencent.mm.pluginsdk.d.a.a.BA(1);
      i += 1;
    }
  }
  
  private Cursor s(String[] paramArrayOfString)
  {
    x.d("MicroMsg.ExtControlProviderMsg", "sendTextMsg()");
    if ((paramArrayOfString == null) || (paramArrayOfString.length <= 0))
    {
      x.e("MicroMsg.ExtControlProviderMsg", "wrong args");
      pr(3);
      return null;
    }
    long l;
    try
    {
      l = com.tencent.mm.plugin.ext.a.a.AG(paramArrayOfString[0]);
      if (l <= 0L)
      {
        pr(3);
        return null;
      }
    }
    catch (Exception paramArrayOfString)
    {
      x.e("MicroMsg.ExtControlProviderMsg", paramArrayOfString.getMessage());
      x.printErrStackTrace("MicroMsg.ExtControlProviderMsg", paramArrayOfString, "", new Object[0]);
      if (this.iKc != null) {
        this.iKc.close();
      }
      pr(4);
      return null;
    }
    com.tencent.mm.plugin.ext.b.aIJ();
    ab localab = com.tencent.mm.plugin.ext.b.da(l);
    if ((localab == null) || ((int)localab.dhP <= 0))
    {
      x.e("MicroMsg.ExtControlProviderMsg", "toContact is null ");
      pr(3);
      return null;
    }
    this.iKc = new MatrixCursor(iKb);
    com.tencent.mm.pluginsdk.d.a.b localb = new com.tencent.mm.pluginsdk.d.a.b();
    localb.b(15000L, new ExtControlProviderMsg.2(this, localab, paramArrayOfString, localb));
    return this.iKc;
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
    x.i("MicroMsg.ExtControlProviderMsg", "ExtControlProviderMsg query() mIsLocalUsed :" + this.iJU);
    if (this.iJU)
    {
      a(paramUri, this.iJV, this.iJF, this.iJE);
      if (bi.oW(this.iJN))
      {
        x.e("MicroMsg.ExtControlProviderMsg", "AppID == null");
        cw(3, 7);
        return com.tencent.mm.pluginsdk.d.a.a.BA(7);
      }
      if (bi.oW(aIW()))
      {
        x.e("MicroMsg.ExtControlProviderMsg", "PkgName == null");
        cw(3, 6);
        return com.tencent.mm.pluginsdk.d.a.a.BA(6);
      }
      int i = aIX();
      if (i != 1)
      {
        x.e("MicroMsg.ExtControlProviderMsg", "invalid appid ! return code = " + i);
        cw(2, i);
        return com.tencent.mm.pluginsdk.d.a.a.BA(i);
      }
    }
    else
    {
      this.iJV = getContext();
      a(paramUri, this.iJV, iJT);
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
      if (!df(this.iJV))
      {
        x.w("MicroMsg.ExtControlProviderMsg", "invalid appid ! return null");
        pr(2);
        return null;
      }
    }
    paramArrayOfString1 = bi.oV(paramUri.getQueryParameter("source"));
    paramString1 = bi.oV(paramUri.getQueryParameter("count"));
    if (!this.iJU) {
      this.iJF = iJT.match(paramUri);
    }
    switch (this.iJF)
    {
    default: 
      cw(3, 15);
      return null;
    case 7: 
      return c(paramArrayOfString2, paramArrayOfString1);
    case 8: 
      return o(paramArrayOfString2);
    case 9: 
      return a(paramArrayOfString2, paramArrayOfString1, paramString1);
    case 10: 
      return aIY();
    case 11: 
      return p(paramArrayOfString2);
    case 12: 
      return q(paramArrayOfString2);
    case 13: 
      return r(paramArrayOfString2);
    }
    return s(paramArrayOfString2);
  }
  
  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/ext/provider/ExtControlProviderMsg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */