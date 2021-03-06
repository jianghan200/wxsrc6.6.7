package com.tencent.mm.plugin.account.friend.a;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.bt.h;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class b
  extends m
{
  public static final String[] diD = { "CREATE TABLE IF NOT EXISTS addr_upload2 ( id int  PRIMARY KEY , md5 text  , peopleid text  , uploadtime long  , realname text  , realnamepyinitial text  , realnamequanpin text  , username text  , nickname text  , nicknamepyinitial text  , nicknamequanpin text  , type int  , moblie text  , email text  , status int  , reserved1 text  , reserved2 text  , reserved3 int  , reserved4 int , lvbuf BLOG , showhead int  ) ", "CREATE INDEX IF NOT EXISTS upload_time_index ON addr_upload2 ( uploadtime ) ", "CREATE INDEX IF NOT EXISTS addr_upload_user_index ON addr_upload2 ( username ) " };
  public final h dCZ;
  
  public b(h paramh)
  {
    this.dCZ = paramh;
    Cursor localCursor = paramh.b("PRAGMA table_info( " + "addr_upload2" + " )", null, 2);
    int k = localCursor.getColumnIndex("name");
    int j = 0;
    int i = 0;
    while (localCursor.moveToNext()) {
      if (k >= 0)
      {
        String str = localCursor.getString(k);
        if ("lvbuf".equalsIgnoreCase(str)) {
          i = 1;
        } else if ("showhead".equalsIgnoreCase(str)) {
          j = 1;
        }
      }
    }
    localCursor.close();
    if (i == 0) {
      paramh.fV("addr_upload2", "Alter table " + "addr_upload2" + " add lvbuf BLOB ");
    }
    if (j == 0) {
      paramh.fV("addr_upload2", "Alter table " + "addr_upload2" + " add showhead int ");
    }
  }
  
  public final boolean L(List<a> paramList)
  {
    if ((paramList == null) || (paramList.size() <= 0)) {
      return false;
    }
    bg localbg = new bg("MicroMsg.AddrUploadStorage", "transaction");
    localbg.addSplit("transation begin");
    long l = this.dCZ.dO(Thread.currentThread().getId());
    int i = 0;
    for (;;)
    {
      try
      {
        if (i >= paramList.size()) {
          continue;
        }
        locala = (a)paramList.get(i);
        if (locala == null) {
          continue;
        }
        localObject = locala.Xh();
        localObject = "select addr_upload2.id,addr_upload2.md5,addr_upload2.peopleid,addr_upload2.uploadtime,addr_upload2.realname,addr_upload2.realnamepyinitial,addr_upload2.realnamequanpin,addr_upload2.username,addr_upload2.nickname,addr_upload2.nicknamepyinitial,addr_upload2.nicknamequanpin,addr_upload2.type,addr_upload2.moblie,addr_upload2.email,addr_upload2.status,addr_upload2.reserved1,addr_upload2.reserved2,addr_upload2.reserved3,addr_upload2.reserved4,addr_upload2.lvbuf,addr_upload2.showhead from addr_upload2  where addr_upload2.id = \"" + a.pn((String)localObject) + "\"";
        localObject = this.dCZ.b((String)localObject, null, 2);
        if (localObject != null) {
          continue;
        }
        bool = false;
        if (bool) {
          continue;
        }
        locala.bWA = -1;
        localObject = locala.wH();
        if ((int)this.dCZ.insert("addr_upload2", "id", (ContentValues)localObject) != -1) {
          continue;
        }
        x.i("MicroMsg.AddrUploadStorage", "batchSet insert failed, num:%s email:%s", new Object[] { locala.Xp(), locala.Xq() });
        bool = true;
      }
      catch (Exception paramList)
      {
        a locala;
        x.e("MicroMsg.AddrUploadStorage", paramList.getMessage());
        boolean bool = false;
        continue;
        b(2, this, locala.Xh());
        continue;
        int k = a.pn(locala.Xh());
        Object localObject = locala.wH();
        int j = 0;
        if (((ContentValues)localObject).size() <= 0) {
          continue;
        }
        j = this.dCZ.update("addr_upload2", (ContentValues)localObject, "id=?", new String[] { String.valueOf(k) });
        if (j != 0) {
          continue;
        }
        x.i("MicroMsg.AddrUploadStorage", "batchSet update result=0, num:%s email:%s", new Object[] { locala.Xp(), locala.Xq() });
        continue;
        if (j >= 0) {
          continue;
        }
        x.i("MicroMsg.AddrUploadStorage", "batchSet update failed, num:%s email:%s", new Object[] { locala.Xp(), locala.Xq() });
        bool = true;
        continue;
        b(3, this, locala.Xh());
        continue;
        bool = true;
        continue;
        i += 1;
      }
      this.dCZ.gp(l);
      localbg.addSplit("transation end");
      localbg.dumpToLog();
      return bool;
      bool = ((Cursor)localObject).moveToFirst();
      ((Cursor)localObject).close();
    }
  }
  
  public final List<String[]> Xt()
  {
    Cursor localCursor = this.dCZ.b("select addr_upload2.moblie , addr_upload2.md5 from addr_upload2 where addr_upload2.type = 0", null, 2);
    ArrayList localArrayList = new ArrayList();
    while (localCursor.moveToNext()) {
      localArrayList.add(new String[] { localCursor.getString(0), localCursor.getString(1) });
    }
    localCursor.close();
    return localArrayList;
  }
  
  protected final boolean Xu()
  {
    boolean bool = true;
    if ((this.dCZ == null) || (this.dCZ.cjr())) {
      if (this.dCZ != null) {
        break label48;
      }
    }
    label48:
    for (Object localObject = "null";; localObject = Boolean.valueOf(this.dCZ.cjr()))
    {
      x.w("MicroMsg.AddrUploadStorage", "shouldProcessEvent db is close :%s", new Object[] { localObject });
      bool = false;
      return bool;
    }
  }
  
  public final boolean Z(List<String> paramList)
  {
    if (paramList.size() <= 0) {
      return false;
    }
    bg localbg = new bg("MicroMsg.AddrUploadStorage", "delete transaction");
    localbg.addSplit("begin");
    long l = this.dCZ.dO(Thread.currentThread().getId());
    boolean bool;
    try
    {
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        String str = (String)paramList.next();
        if ((str != null) && (str.length() > 0))
        {
          int i = this.dCZ.delete("addr_upload2", "id =?", new String[] { a.pn(str) });
          x.d("MicroMsg.AddrUploadStorage", "delete addr_upload2 md5 :" + str + ", res:" + i);
          if (i > 0)
          {
            b(5, this, str);
            continue;
            this.dCZ.gp(l);
          }
        }
      }
    }
    catch (Exception paramList)
    {
      x.printErrStackTrace("MicroMsg.AddrUploadStorage", paramList, "", new Object[0]);
      bool = false;
    }
    for (;;)
    {
      localbg.addSplit("end");
      localbg.dumpToLog();
      return bool;
      bool = true;
    }
  }
  
  public final int a(String paramString, a parama)
  {
    int i = 0;
    ContentValues localContentValues = parama.wH();
    if (localContentValues.size() > 0) {
      i = this.dCZ.update("addr_upload2", localContentValues, "id=?", new String[] { a.pn(paramString) });
    }
    if (i > 0)
    {
      if (!parama.Xh().equals(paramString))
      {
        b(5, this, paramString);
        b(2, this, parama.Xh());
      }
    }
    else {
      return i;
    }
    b(3, this, paramString);
    return i;
  }
  
  public final boolean aa(List<String> paramList)
  {
    bg localbg = new bg("MicroMsg.AddrUploadStorage", "set uploaded transaction");
    localbg.addSplit("transation begin");
    long l = this.dCZ.dO(Thread.currentThread().getId());
    boolean bool;
    try
    {
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        String str = (String)paramList.next();
        if ((str != null) && (str.length() > 0))
        {
          Object localObject = new a();
          ((a)localObject).bWA = 8;
          ((a)localObject).eJx = bi.VE();
          localObject = ((a)localObject).wH();
          int i = 0;
          if (((ContentValues)localObject).size() > 0) {
            i = this.dCZ.update("addr_upload2", (ContentValues)localObject, "id=?", new String[] { a.pn(str) });
          }
          x.i("MicroMsg.AddrUploadStorage", "local contact uploaded : " + str + ", update result: " + i);
          continue;
          this.dCZ.gp(l);
        }
      }
    }
    catch (Exception paramList)
    {
      x.e("MicroMsg.AddrUploadStorage", paramList.getMessage());
      bool = false;
    }
    for (;;)
    {
      localbg.addSplit("transation end");
      localbg.dumpToLog();
      if (bool) {
        b(3, this, null);
      }
      return bool;
      bool = true;
    }
  }
  
  public final a pp(String paramString)
  {
    if (bi.oW(paramString)) {
      return null;
    }
    a locala = new a();
    Object localObject = "select addr_upload2.id,addr_upload2.md5,addr_upload2.peopleid,addr_upload2.uploadtime,addr_upload2.realname,addr_upload2.realnamepyinitial,addr_upload2.realnamequanpin,addr_upload2.username,addr_upload2.nickname,addr_upload2.nicknamepyinitial,addr_upload2.nicknamequanpin,addr_upload2.type,addr_upload2.moblie,addr_upload2.email,addr_upload2.status,addr_upload2.reserved1,addr_upload2.reserved2,addr_upload2.reserved3,addr_upload2.reserved4,addr_upload2.lvbuf,addr_upload2.showhead from addr_upload2 where addr_upload2.username=\"" + bi.oU(paramString) + "\"";
    localObject = this.dCZ.b((String)localObject, null, 2);
    x.d("MicroMsg.AddrUploadStorage", "get addrUpload :" + paramString);
    if (((Cursor)localObject).moveToFirst()) {
      locala.d((Cursor)localObject);
    }
    ((Cursor)localObject).close();
    return locala;
  }
  
  public final a pq(String paramString)
  {
    a locala = null;
    if ((paramString == null) || (paramString.length() <= 0)) {
      return null;
    }
    Object localObject = "select addr_upload2.id,addr_upload2.md5,addr_upload2.peopleid,addr_upload2.uploadtime,addr_upload2.realname,addr_upload2.realnamepyinitial,addr_upload2.realnamequanpin,addr_upload2.username,addr_upload2.nickname,addr_upload2.nicknamepyinitial,addr_upload2.nicknamequanpin,addr_upload2.type,addr_upload2.moblie,addr_upload2.email,addr_upload2.status,addr_upload2.reserved1,addr_upload2.reserved2,addr_upload2.reserved3,addr_upload2.reserved4,addr_upload2.lvbuf,addr_upload2.showhead from addr_upload2 where addr_upload2.id=\"" + a.pn(paramString) + "\"";
    localObject = this.dCZ.b((String)localObject, null, 2);
    if (((Cursor)localObject).moveToFirst())
    {
      locala = new a();
      locala.d((Cursor)localObject);
    }
    paramString = new StringBuilder("get addrUpload :").append(paramString).append(", resCnt:");
    if (locala != null) {}
    for (int i = 1;; i = 0)
    {
      x.d("MicroMsg.AddrUploadStorage", i);
      ((Cursor)localObject).close();
      return locala;
    }
  }
  
  public final List<a> pr(String paramString)
  {
    x.d("MicroMsg.AddrUploadStorage", "sql : " + paramString);
    ArrayList localArrayList = new ArrayList();
    x.d("MicroMsg.AddrUploadStorage", "sql : " + paramString);
    paramString = this.dCZ.b(paramString, null, 2);
    while (paramString.moveToNext())
    {
      a locala = new a();
      locala.d(paramString);
      localArrayList.add(locala);
    }
    paramString.close();
    return localArrayList;
  }
  
  /* Error */
  public final String pt(String paramString)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 316	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   4: ifne +86 -> 90
    //   7: aload_0
    //   8: getfield 27	com/tencent/mm/plugin/account/friend/a/b:dCZ	Lcom/tencent/mm/bt/h;
    //   11: ldc 36
    //   13: aconst_null
    //   14: ldc_w 340
    //   17: iconst_1
    //   18: anewarray 12	java/lang/String
    //   21: dup
    //   22: iconst_0
    //   23: aload_1
    //   24: aastore
    //   25: aconst_null
    //   26: aconst_null
    //   27: aconst_null
    //   28: iconst_2
    //   29: invokevirtual 343	com/tencent/mm/bt/h:a	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Landroid/database/Cursor;
    //   32: astore_2
    //   33: aload_2
    //   34: astore_1
    //   35: aload_2
    //   36: invokeinterface 188 1 0
    //   41: ifeq +39 -> 80
    //   44: aload_2
    //   45: astore_1
    //   46: new 133	com/tencent/mm/plugin/account/friend/a/a
    //   49: dup
    //   50: invokespecial 296	com/tencent/mm/plugin/account/friend/a/a:<init>	()V
    //   53: astore_3
    //   54: aload_2
    //   55: astore_1
    //   56: aload_3
    //   57: aload_2
    //   58: invokevirtual 327	com/tencent/mm/plugin/account/friend/a/a:d	(Landroid/database/Cursor;)V
    //   61: aload_2
    //   62: astore_1
    //   63: aload_3
    //   64: invokevirtual 346	com/tencent/mm/plugin/account/friend/a/a:getUsername	()Ljava/lang/String;
    //   67: astore_3
    //   68: aload_2
    //   69: ifnull +9 -> 78
    //   72: aload_2
    //   73: invokeinterface 79 1 0
    //   78: aload_3
    //   79: areturn
    //   80: aload_2
    //   81: ifnull +9 -> 90
    //   84: aload_2
    //   85: invokeinterface 79 1 0
    //   90: aconst_null
    //   91: areturn
    //   92: astore_3
    //   93: aconst_null
    //   94: astore_2
    //   95: aload_2
    //   96: astore_1
    //   97: ldc 103
    //   99: ldc_w 348
    //   102: iconst_1
    //   103: anewarray 164	java/lang/Object
    //   106: dup
    //   107: iconst_0
    //   108: aload_3
    //   109: invokevirtual 192	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   112: aastore
    //   113: invokestatic 350	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   116: aload_2
    //   117: ifnull -27 -> 90
    //   120: aload_2
    //   121: invokeinterface 79 1 0
    //   126: goto -36 -> 90
    //   129: astore_2
    //   130: aconst_null
    //   131: astore_1
    //   132: aload_1
    //   133: ifnull +9 -> 142
    //   136: aload_1
    //   137: invokeinterface 79 1 0
    //   142: aload_2
    //   143: athrow
    //   144: astore_2
    //   145: goto -13 -> 132
    //   148: astore_3
    //   149: goto -54 -> 95
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	152	0	this	b
    //   0	152	1	paramString	String
    //   32	89	2	localCursor	Cursor
    //   129	14	2	localObject1	Object
    //   144	1	2	localObject2	Object
    //   53	26	3	localObject3	Object
    //   92	17	3	localException1	Exception
    //   148	1	3	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   7	33	92	java/lang/Exception
    //   7	33	129	finally
    //   35	44	144	finally
    //   46	54	144	finally
    //   56	61	144	finally
    //   63	68	144	finally
    //   97	116	144	finally
    //   35	44	148	java/lang/Exception
    //   46	54	148	java/lang/Exception
    //   56	61	148	java/lang/Exception
    //   63	68	148	java/lang/Exception
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/account/friend/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */